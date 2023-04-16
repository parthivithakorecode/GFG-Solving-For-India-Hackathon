package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p038f.C2591j;

/* renamed from: com.google.android.gms.internal.ads.f5 */
public final class C1691f5 {
    /* renamed from: a */
    public static X509Certificate[][] m8973a(String str) {
        ByteBuffer byteBuffer;
        int limit;
        int position;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair<ByteBuffer, Long> c = C1728g5.m9535c(randomAccessFile);
            if (c != null) {
                ByteBuffer byteBuffer2 = (ByteBuffer) c.first;
                long longValue = ((Long) c.second).longValue();
                long j = -20 + longValue;
                if (j >= 0) {
                    randomAccessFile.seek(j);
                    if (randomAccessFile.readInt() == 1347094023) {
                        throw new C1579c5("ZIP64 APK not supported");
                    }
                }
                long a = C1728g5.m9533a(byteBuffer2);
                if (a >= longValue) {
                    StringBuilder sb = new StringBuilder(C2591j.f18737I0);
                    sb.append("ZIP Central Directory offset out of range: ");
                    sb.append(a);
                    sb.append(". ZIP End of Central Directory offset: ");
                    sb.append(longValue);
                    throw new C1579c5(sb.toString());
                } else if (C1728g5.m9534b(byteBuffer2) + a != longValue) {
                    throw new C1579c5("ZIP Central Directory is not immediately followed by End of Central Directory");
                } else if (a >= 32) {
                    ByteBuffer allocate = ByteBuffer.allocate(24);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    allocate.order(byteOrder);
                    randomAccessFile.seek(a - ((long) allocate.capacity()));
                    randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                    if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                        int i = 0;
                        long j2 = allocate.getLong(0);
                        if (j2 < ((long) allocate.capacity()) || j2 > 2147483639) {
                            StringBuilder sb2 = new StringBuilder(57);
                            sb2.append("APK Signing Block size out of range: ");
                            sb2.append(j2);
                            throw new C1579c5(sb2.toString());
                        }
                        int i2 = (int) (8 + j2);
                        long j3 = a - ((long) i2);
                        if (j3 >= 0) {
                            ByteBuffer allocate2 = ByteBuffer.allocate(i2);
                            allocate2.order(byteOrder);
                            randomAccessFile.seek(j3);
                            randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                            long j4 = allocate2.getLong(0);
                            if (j4 == j2) {
                                Pair create = Pair.create(allocate2, Long.valueOf(j3));
                                byteBuffer = (ByteBuffer) create.first;
                                long longValue2 = ((Long) create.second).longValue();
                                if (byteBuffer.order() == byteOrder) {
                                    int capacity = byteBuffer.capacity() - 24;
                                    if (capacity >= 8) {
                                        int capacity2 = byteBuffer.capacity();
                                        if (capacity <= byteBuffer.capacity()) {
                                            limit = byteBuffer.limit();
                                            position = byteBuffer.position();
                                            byteBuffer.position(0);
                                            byteBuffer.limit(capacity);
                                            byteBuffer.position(8);
                                            ByteBuffer slice = byteBuffer.slice();
                                            slice.order(byteBuffer.order());
                                            byteBuffer.position(0);
                                            byteBuffer.limit(limit);
                                            byteBuffer.position(position);
                                            while (slice.hasRemaining()) {
                                                i++;
                                                if (slice.remaining() >= 8) {
                                                    long j5 = slice.getLong();
                                                    if (j5 < 4 || j5 > 2147483647L) {
                                                        StringBuilder sb3 = new StringBuilder(76);
                                                        sb3.append("APK Signing Block entry #");
                                                        sb3.append(i);
                                                        sb3.append(" size out of range: ");
                                                        sb3.append(j5);
                                                        throw new C1579c5(sb3.toString());
                                                    }
                                                    int i3 = (int) j5;
                                                    int position2 = slice.position() + i3;
                                                    if (i3 > slice.remaining()) {
                                                        int remaining = slice.remaining();
                                                        StringBuilder sb4 = new StringBuilder(91);
                                                        sb4.append("APK Signing Block entry #");
                                                        sb4.append(i);
                                                        sb4.append(" size out of range: ");
                                                        sb4.append(i3);
                                                        sb4.append(", available: ");
                                                        sb4.append(remaining);
                                                        throw new C1579c5(sb4.toString());
                                                    } else if (slice.getInt() == 1896449818) {
                                                        X509Certificate[][] l = m8984l(randomAccessFile.getChannel(), new C1542b5(m8977e(slice, i3 - 4), longValue2, a, longValue, byteBuffer2, (C2357x4) null));
                                                        randomAccessFile.close();
                                                        try {
                                                            randomAccessFile.close();
                                                        } catch (IOException unused) {
                                                        }
                                                        return l;
                                                    } else {
                                                        slice.position(position2);
                                                    }
                                                } else {
                                                    StringBuilder sb5 = new StringBuilder(70);
                                                    sb5.append("Insufficient data to read size of APK Signing Block entry #");
                                                    sb5.append(i);
                                                    throw new C1579c5(sb5.toString());
                                                }
                                            }
                                            throw new C1579c5("No APK Signature Scheme v2 block in APK Signing Block");
                                        }
                                        StringBuilder sb6 = new StringBuilder(41);
                                        sb6.append("end > capacity: ");
                                        sb6.append(capacity);
                                        sb6.append(" > ");
                                        sb6.append(capacity2);
                                        throw new IllegalArgumentException(sb6.toString());
                                    }
                                    StringBuilder sb7 = new StringBuilder(38);
                                    sb7.append("end < start: ");
                                    sb7.append(capacity);
                                    sb7.append(" < ");
                                    sb7.append(8);
                                    throw new IllegalArgumentException(sb7.toString());
                                }
                                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                            }
                            StringBuilder sb8 = new StringBuilder(103);
                            sb8.append("APK Signing Block sizes in header and footer do not match: ");
                            sb8.append(j4);
                            sb8.append(" vs ");
                            sb8.append(j2);
                            throw new C1579c5(sb8.toString());
                        }
                        StringBuilder sb9 = new StringBuilder(59);
                        sb9.append("APK Signing Block offset out of range: ");
                        sb9.append(j3);
                        throw new C1579c5(sb9.toString());
                    }
                    throw new C1579c5("No APK Signing Block before ZIP Central Directory");
                } else {
                    StringBuilder sb10 = new StringBuilder(87);
                    sb10.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                    sb10.append(a);
                    throw new C1579c5(sb10.toString());
                }
            } else {
                long length = randomAccessFile.length();
                StringBuilder sb11 = new StringBuilder(102);
                sb11.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                sb11.append(length);
                sb11.append(" bytes");
                throw new C1579c5(sb11.toString());
            }
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    /* renamed from: b */
    private static int m8974b(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c */
    private static int m8975c(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                String valueOf = String.valueOf(Long.toHexString((long) i));
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(valueOf) : new String("Unknown signature algorithm: 0x"));
        }
    }

    /* renamed from: d */
    private static String m8976d(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: e */
    private static ByteBuffer m8977e(ByteBuffer byteBuffer, int i) {
        if (i >= 0) {
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            int i2 = i + position;
            if (i2 < position || i2 > limit) {
                throw new BufferUnderflowException();
            }
            byteBuffer.limit(i2);
            try {
                ByteBuffer slice = byteBuffer.slice();
                slice.order(byteBuffer.order());
                byteBuffer.position(i2);
                return slice;
            } finally {
                byteBuffer.limit(limit);
            }
        } else {
            StringBuilder sb = new StringBuilder(17);
            sb.append("size: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: f */
    private static ByteBuffer m8978f(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= 4) {
            int i = byteBuffer.getInt();
            if (i < 0) {
                throw new IllegalArgumentException("Negative length");
            } else if (i <= byteBuffer.remaining()) {
                return m8977e(byteBuffer, i);
            } else {
                int remaining = byteBuffer.remaining();
                StringBuilder sb = new StringBuilder(101);
                sb.append("Length-prefixed field longer than remaining buffer. Field length: ");
                sb.append(i);
                sb.append(", remaining: ");
                sb.append(remaining);
                throw new IOException(sb.toString());
            }
        } else {
            int remaining2 = byteBuffer.remaining();
            StringBuilder sb2 = new StringBuilder(93);
            sb2.append("Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
            sb2.append(remaining2);
            throw new IOException(sb2.toString());
        }
    }

    /* renamed from: g */
    private static void m8979g(int i, byte[] bArr, int i2) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    /* renamed from: h */
    private static void m8980h(Map<Integer, byte[]> map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) {
        if (!map.isEmpty()) {
            C1505a5 a5Var = new C1505a5(fileChannel, 0, j);
            C1505a5 a5Var2 = new C1505a5(fileChannel, j2, j3 - j2);
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.order(ByteOrder.LITTLE_ENDIAN);
            long j4 = j;
            C1728g5.m9536d(duplicate, j);
            C2394y4 y4Var = new C2394y4(duplicate);
            int size = map.size();
            int[] iArr = new int[size];
            int i = 0;
            int i2 = 0;
            for (Integer intValue : map.keySet()) {
                iArr[i2] = intValue.intValue();
                i2++;
            }
            try {
                byte[][] k = m8983k(iArr, new C2431z4[]{a5Var, a5Var2, y4Var});
                while (i < size) {
                    int i3 = iArr[i];
                    Map<Integer, byte[]> map2 = map;
                    if (MessageDigest.isEqual(map.get(Integer.valueOf(i3)), k[i])) {
                        i++;
                    } else {
                        throw new SecurityException(m8976d(i3).concat(" digest of contents did not verify"));
                    }
                }
            } catch (DigestException e) {
                throw new SecurityException("Failed to compute digest(s) of contents", e);
            }
        } else {
            throw new SecurityException("No digests provided");
        }
    }

    /* renamed from: i */
    private static byte[] m8981i(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        } else if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        } else {
            int remaining = byteBuffer.remaining();
            StringBuilder sb = new StringBuilder(90);
            sb.append("Underflow while reading length-prefixed value. Length: ");
            sb.append(i);
            sb.append(", available: ");
            sb.append(remaining);
            throw new IOException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011f, code lost:
        r1 = android.util.Pair.create(r5, r1);
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.security.cert.X509Certificate[] m8982j(java.nio.ByteBuffer r22, java.util.Map<java.lang.Integer, byte[]> r23, java.security.cert.CertificateFactory r24) {
        /*
            java.nio.ByteBuffer r0 = m8978f(r22)
            java.nio.ByteBuffer r1 = m8978f(r22)
            byte[] r2 = m8981i(r22)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = -1
            r6 = 0
            r7 = r4
            r9 = r6
            r8 = 0
        L_0x0016:
            boolean r10 = r1.hasRemaining()
            r11 = 8
            r12 = 769(0x301, float:1.078E-42)
            r13 = 514(0x202, float:7.2E-43)
            r14 = 513(0x201, float:7.19E-43)
            r15 = 1
            if (r10 == 0) goto L_0x0080
            int r8 = r8 + 1
            java.nio.ByteBuffer r10 = m8978f(r1)     // Catch:{ IOException -> 0x0066, BufferUnderflowException -> 0x0064 }
            int r5 = r10.remaining()     // Catch:{ IOException -> 0x0066, BufferUnderflowException -> 0x0064 }
            if (r5 < r11) goto L_0x005c
            int r5 = r10.getInt()     // Catch:{ IOException -> 0x0066, BufferUnderflowException -> 0x0064 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)     // Catch:{ IOException -> 0x0066, BufferUnderflowException -> 0x0064 }
            r3.add(r11)     // Catch:{ IOException -> 0x0066, BufferUnderflowException -> 0x0064 }
            if (r5 == r14) goto L_0x0046
            if (r5 == r13) goto L_0x0046
            if (r5 == r12) goto L_0x0046
            switch(r5) {
                case 257: goto L_0x0046;
                case 258: goto L_0x0046;
                case 259: goto L_0x0046;
                case 260: goto L_0x0046;
                default: goto L_0x0045;
            }     // Catch:{ IOException -> 0x0066, BufferUnderflowException -> 0x0064 }
        L_0x0045:
            goto L_0x0016
        L_0x0046:
            if (r7 == r4) goto L_0x0055
            int r11 = m8975c(r5)     // Catch:{ IOException -> 0x0066, BufferUnderflowException -> 0x0064 }
            int r12 = m8975c(r7)     // Catch:{ IOException -> 0x0066, BufferUnderflowException -> 0x0064 }
            if (r11 == r15) goto L_0x0016
            if (r12 == r15) goto L_0x0055
            goto L_0x0016
        L_0x0055:
            byte[] r7 = m8981i(r10)     // Catch:{ IOException -> 0x0066, BufferUnderflowException -> 0x0064 }
            r9 = r7
            r7 = r5
            goto L_0x0016
        L_0x005c:
            java.lang.SecurityException r0 = new java.lang.SecurityException     // Catch:{ IOException -> 0x0066, BufferUnderflowException -> 0x0064 }
            java.lang.String r1 = "Signature record too short"
            r0.<init>(r1)     // Catch:{ IOException -> 0x0066, BufferUnderflowException -> 0x0064 }
            throw r0     // Catch:{ IOException -> 0x0066, BufferUnderflowException -> 0x0064 }
        L_0x0064:
            r0 = move-exception
            goto L_0x0067
        L_0x0066:
            r0 = move-exception
        L_0x0067:
            java.lang.SecurityException r1 = new java.lang.SecurityException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 45
            r2.<init>(r3)
            java.lang.String r3 = "Failed to parse signature record #"
            r2.append(r3)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x0080:
            if (r7 != r4) goto L_0x0092
            java.lang.SecurityException r0 = new java.lang.SecurityException
            if (r8 != 0) goto L_0x008c
            java.lang.String r1 = "No signatures found"
            r0.<init>(r1)
            throw r0
        L_0x008c:
            java.lang.String r1 = "No supported signatures found"
            r0.<init>(r1)
            throw r0
        L_0x0092:
            java.lang.String r1 = "Unknown signature algorithm: 0x"
            if (r7 == r14) goto L_0x00c3
            if (r7 == r13) goto L_0x00c3
            if (r7 == r12) goto L_0x00c0
            switch(r7) {
                case 257: goto L_0x00bd;
                case 258: goto L_0x00bd;
                case 259: goto L_0x00bd;
                case 260: goto L_0x00bd;
                default: goto L_0x009d;
            }
        L_0x009d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            long r2 = (long) r7
            java.lang.String r2 = java.lang.Long.toHexString(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x00b3
            java.lang.String r1 = r1.concat(r2)
            goto L_0x00b9
        L_0x00b3:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r1 = r2
        L_0x00b9:
            r0.<init>(r1)
            throw r0
        L_0x00bd:
            java.lang.String r4 = "RSA"
            goto L_0x00c5
        L_0x00c0:
            java.lang.String r4 = "DSA"
            goto L_0x00c5
        L_0x00c3:
            java.lang.String r4 = "EC"
        L_0x00c5:
            if (r7 == r14) goto L_0x012a
            if (r7 == r13) goto L_0x0127
            if (r7 == r12) goto L_0x0124
            switch(r7) {
                case 257: goto L_0x010c;
                case 258: goto L_0x00f8;
                case 259: goto L_0x00f1;
                case 260: goto L_0x00ee;
                default: goto L_0x00ce;
            }
        L_0x00ce:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            long r2 = (long) r7
            java.lang.String r2 = java.lang.Long.toHexString(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x00e4
            java.lang.String r1 = r1.concat(r2)
            goto L_0x00ea
        L_0x00e4:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r1 = r2
        L_0x00ea:
            r0.<init>(r1)
            throw r0
        L_0x00ee:
            java.lang.String r1 = "SHA512withRSA"
            goto L_0x00f3
        L_0x00f1:
            java.lang.String r1 = "SHA256withRSA"
        L_0x00f3:
            android.util.Pair r1 = android.util.Pair.create(r1, r6)
            goto L_0x012d
        L_0x00f8:
            java.security.spec.PSSParameterSpec r1 = new java.security.spec.PSSParameterSpec
            java.security.spec.MGF1ParameterSpec r19 = java.security.spec.MGF1ParameterSpec.SHA512
            r20 = 64
            r21 = 1
            java.lang.String r17 = "SHA-512"
            java.lang.String r18 = "MGF1"
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21)
            java.lang.String r5 = "SHA512withRSA/PSS"
            goto L_0x011f
        L_0x010c:
            java.security.spec.PSSParameterSpec r1 = new java.security.spec.PSSParameterSpec
            java.security.spec.MGF1ParameterSpec r19 = java.security.spec.MGF1ParameterSpec.SHA256
            r20 = 32
            r21 = 1
            java.lang.String r17 = "SHA-256"
            java.lang.String r18 = "MGF1"
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21)
            java.lang.String r5 = "SHA256withRSA/PSS"
        L_0x011f:
            android.util.Pair r1 = android.util.Pair.create(r5, r1)
            goto L_0x012d
        L_0x0124:
            java.lang.String r1 = "SHA256withDSA"
            goto L_0x00f3
        L_0x0127:
            java.lang.String r1 = "SHA512withECDSA"
            goto L_0x00f3
        L_0x012a:
            java.lang.String r1 = "SHA256withECDSA"
            goto L_0x00f3
        L_0x012d:
            java.lang.Object r5 = r1.first
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r1 = r1.second
            java.security.spec.AlgorithmParameterSpec r1 = (java.security.spec.AlgorithmParameterSpec) r1
            java.security.KeyFactory r4 = java.security.KeyFactory.getInstance(r4)     // Catch:{ NoSuchAlgorithmException -> 0x0277, InvalidKeySpecException -> 0x0275, InvalidKeyException -> 0x0273, InvalidAlgorithmParameterException -> 0x0271, SignatureException -> 0x026f }
            java.security.spec.X509EncodedKeySpec r8 = new java.security.spec.X509EncodedKeySpec     // Catch:{ NoSuchAlgorithmException -> 0x0277, InvalidKeySpecException -> 0x0275, InvalidKeyException -> 0x0273, InvalidAlgorithmParameterException -> 0x0271, SignatureException -> 0x026f }
            r8.<init>(r2)     // Catch:{ NoSuchAlgorithmException -> 0x0277, InvalidKeySpecException -> 0x0275, InvalidKeyException -> 0x0273, InvalidAlgorithmParameterException -> 0x0271, SignatureException -> 0x026f }
            java.security.PublicKey r4 = r4.generatePublic(r8)     // Catch:{ NoSuchAlgorithmException -> 0x0277, InvalidKeySpecException -> 0x0275, InvalidKeyException -> 0x0273, InvalidAlgorithmParameterException -> 0x0271, SignatureException -> 0x026f }
            java.security.Signature r8 = java.security.Signature.getInstance(r5)     // Catch:{ NoSuchAlgorithmException -> 0x0277, InvalidKeySpecException -> 0x0275, InvalidKeyException -> 0x0273, InvalidAlgorithmParameterException -> 0x0271, SignatureException -> 0x026f }
            r8.initVerify(r4)     // Catch:{ NoSuchAlgorithmException -> 0x0277, InvalidKeySpecException -> 0x0275, InvalidKeyException -> 0x0273, InvalidAlgorithmParameterException -> 0x0271, SignatureException -> 0x026f }
            if (r1 == 0) goto L_0x014e
            r8.setParameter(r1)     // Catch:{ NoSuchAlgorithmException -> 0x0277, InvalidKeySpecException -> 0x0275, InvalidKeyException -> 0x0273, InvalidAlgorithmParameterException -> 0x0271, SignatureException -> 0x026f }
        L_0x014e:
            r8.update(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0277, InvalidKeySpecException -> 0x0275, InvalidKeyException -> 0x0273, InvalidAlgorithmParameterException -> 0x0271, SignatureException -> 0x026f }
            boolean r1 = r8.verify(r9)     // Catch:{ NoSuchAlgorithmException -> 0x0277, InvalidKeySpecException -> 0x0275, InvalidKeyException -> 0x0273, InvalidAlgorithmParameterException -> 0x0271, SignatureException -> 0x026f }
            if (r1 == 0) goto L_0x025f
            r0.clear()
            java.nio.ByteBuffer r1 = m8978f(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = 0
        L_0x0164:
            boolean r8 = r1.hasRemaining()
            if (r8 == 0) goto L_0x01ab
            int r5 = r5 + r15
            java.nio.ByteBuffer r8 = m8978f(r1)     // Catch:{ IOException -> 0x0191, BufferUnderflowException -> 0x018f }
            int r9 = r8.remaining()     // Catch:{ IOException -> 0x0191, BufferUnderflowException -> 0x018f }
            if (r9 < r11) goto L_0x0187
            int r9 = r8.getInt()     // Catch:{ IOException -> 0x0191, BufferUnderflowException -> 0x018f }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)     // Catch:{ IOException -> 0x0191, BufferUnderflowException -> 0x018f }
            r4.add(r10)     // Catch:{ IOException -> 0x0191, BufferUnderflowException -> 0x018f }
            if (r9 != r7) goto L_0x0164
            byte[] r6 = m8981i(r8)     // Catch:{ IOException -> 0x0191, BufferUnderflowException -> 0x018f }
            goto L_0x0164
        L_0x0187:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0191, BufferUnderflowException -> 0x018f }
            java.lang.String r1 = "Record too short"
            r0.<init>(r1)     // Catch:{ IOException -> 0x0191, BufferUnderflowException -> 0x018f }
            throw r0     // Catch:{ IOException -> 0x0191, BufferUnderflowException -> 0x018f }
        L_0x018f:
            r0 = move-exception
            goto L_0x0192
        L_0x0191:
            r0 = move-exception
        L_0x0192:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 42
            r2.<init>(r3)
            java.lang.String r3 = "Failed to parse digest record #"
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x01ab:
            boolean r1 = r3.equals(r4)
            if (r1 == 0) goto L_0x0257
            int r1 = m8975c(r7)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r4 = r23
            java.lang.Object r3 = r4.put(r3, r6)
            byte[] r3 = (byte[]) r3
            if (r3 == 0) goto L_0x01da
            boolean r3 = java.security.MessageDigest.isEqual(r3, r6)
            if (r3 == 0) goto L_0x01ca
            goto L_0x01da
        L_0x01ca:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = m8976d(r1)
            java.lang.String r2 = " contents digest does not match the digest specified by a preceding signer"
            java.lang.String r1 = r1.concat(r2)
            r0.<init>(r1)
            throw r0
        L_0x01da:
            java.nio.ByteBuffer r0 = m8978f(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3 = 0
        L_0x01e4:
            boolean r4 = r0.hasRemaining()
            if (r4 == 0) goto L_0x021f
            int r3 = r3 + r15
            byte[] r4 = m8981i(r0)
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream     // Catch:{ CertificateException -> 0x0205 }
            r5.<init>(r4)     // Catch:{ CertificateException -> 0x0205 }
            r6 = r24
            java.security.cert.Certificate r5 = r6.generateCertificate(r5)     // Catch:{ CertificateException -> 0x0205 }
            java.security.cert.X509Certificate r5 = (java.security.cert.X509Certificate) r5     // Catch:{ CertificateException -> 0x0205 }
            com.google.android.gms.internal.ads.d5 r7 = new com.google.android.gms.internal.ads.d5
            r7.<init>(r5, r4)
            r1.add(r7)
            goto L_0x01e4
        L_0x0205:
            r0 = move-exception
            java.lang.SecurityException r1 = new java.lang.SecurityException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r4 = 41
            r2.<init>(r4)
            java.lang.String r4 = "Failed to decode certificate #"
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x021f:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x024f
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            java.security.PublicKey r0 = r0.getPublicKey()
            byte[] r0 = r0.getEncoded()
            boolean r0 = java.util.Arrays.equals(r2, r0)
            if (r0 == 0) goto L_0x0247
            int r0 = r1.size()
            java.security.cert.X509Certificate[] r0 = new java.security.cert.X509Certificate[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.security.cert.X509Certificate[] r0 = (java.security.cert.X509Certificate[]) r0
            return r0
        L_0x0247:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "Public key mismatch between certificate and signature record"
            r0.<init>(r1)
            throw r0
        L_0x024f:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "No certificates listed"
            r0.<init>(r1)
            throw r0
        L_0x0257:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = "Signature algorithms don't match between digests and signatures records"
            r0.<init>(r1)
            throw r0
        L_0x025f:
            java.lang.SecurityException r0 = new java.lang.SecurityException
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r2 = " signature did not verify"
            java.lang.String r1 = r1.concat(r2)
            r0.<init>(r1)
            throw r0
        L_0x026f:
            r0 = move-exception
            goto L_0x0278
        L_0x0271:
            r0 = move-exception
            goto L_0x0278
        L_0x0273:
            r0 = move-exception
            goto L_0x0278
        L_0x0275:
            r0 = move-exception
            goto L_0x0278
        L_0x0277:
            r0 = move-exception
        L_0x0278:
            java.lang.SecurityException r1 = new java.lang.SecurityException
            java.lang.String r2 = java.lang.String.valueOf(r5)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 27
            r3.<init>(r2)
            java.lang.String r2 = "Failed to verify "
            r3.append(r2)
            r3.append(r5)
            java.lang.String r2 = " signature"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1691f5.m8982j(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    /* renamed from: k */
    private static byte[][] m8983k(int[] iArr, C2431z4[] z4VarArr) {
        long j;
        int i;
        int length;
        int[] iArr2 = iArr;
        long j2 = 0;
        int i2 = 0;
        long j3 = 0;
        int i3 = 0;
        while (true) {
            j = 1048576;
            if (i3 >= 3) {
                break;
            }
            j3 += (z4VarArr[i3].zza() + 1048575) / 1048576;
            i3++;
        }
        if (j3 < 2097151) {
            int i4 = (int) j3;
            byte[][] bArr = new byte[iArr2.length][];
            int i5 = 0;
            while (true) {
                length = iArr2.length;
                if (i5 >= length) {
                    break;
                }
                byte[] bArr2 = new byte[((m8974b(iArr2[i5]) * i4) + 5)];
                bArr2[0] = 90;
                m8979g(i4, bArr2, 1);
                bArr[i5] = bArr2;
                i5++;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            MessageDigest[] messageDigestArr = new MessageDigest[length];
            int i6 = 0;
            while (i6 < iArr2.length) {
                String d = m8976d(iArr2[i6]);
                try {
                    messageDigestArr[i6] = MessageDigest.getInstance(d);
                    i6++;
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(d.concat(" digest not supported"), e);
                }
            }
            int i7 = 0;
            int i8 = 0;
            for (i = 3; i7 < i; i = 3) {
                C2431z4 z4Var = z4VarArr[i7];
                long j4 = j2;
                long zza = z4Var.zza();
                while (zza > j2) {
                    int min = (int) Math.min(zza, j);
                    m8979g(min, bArr3, 1);
                    for (int i9 = 0; i9 < length; i9++) {
                        messageDigestArr[i9].update(bArr3);
                    }
                    long j5 = j4;
                    try {
                        z4Var.mo5086a(messageDigestArr, j5, min);
                        byte[] bArr4 = bArr3;
                        int i10 = 0;
                        while (i10 < iArr2.length) {
                            int i11 = iArr2[i10];
                            C2431z4 z4Var2 = z4Var;
                            byte[] bArr5 = bArr[i10];
                            int b = m8974b(i11);
                            int i12 = length;
                            MessageDigest messageDigest = messageDigestArr[i10];
                            MessageDigest[] messageDigestArr2 = messageDigestArr;
                            int digest = messageDigest.digest(bArr5, (i8 * b) + 5, b);
                            if (digest == b) {
                                i10++;
                                z4Var = z4Var2;
                                length = i12;
                                messageDigestArr = messageDigestArr2;
                            } else {
                                String algorithm = messageDigest.getAlgorithm();
                                StringBuilder sb = new StringBuilder(String.valueOf(algorithm).length() + 46);
                                sb.append("Unexpected output size of ");
                                sb.append(algorithm);
                                sb.append(" digest: ");
                                sb.append(digest);
                                throw new RuntimeException(sb.toString());
                            }
                        }
                        MessageDigest[] messageDigestArr3 = messageDigestArr;
                        C2431z4 z4Var3 = z4Var;
                        int i13 = length;
                        long j6 = (long) min;
                        long j7 = j5 + j6;
                        zza -= j6;
                        i8++;
                        bArr3 = bArr4;
                        j2 = 0;
                        j4 = j7;
                        messageDigestArr = messageDigestArr3;
                        j = 1048576;
                    } catch (IOException e2) {
                        StringBuilder sb2 = new StringBuilder(59);
                        sb2.append("Failed to digest chunk #");
                        sb2.append(i8);
                        sb2.append(" of section #");
                        sb2.append(i2);
                        throw new DigestException(sb2.toString(), e2);
                    }
                }
                byte[] bArr6 = bArr3;
                MessageDigest[] messageDigestArr4 = messageDigestArr;
                int i14 = length;
                i2++;
                i7++;
                j2 = 0;
                j = 1048576;
            }
            byte[][] bArr7 = new byte[iArr2.length][];
            int i15 = 0;
            while (i15 < iArr2.length) {
                int i16 = iArr2[i15];
                byte[] bArr8 = bArr[i15];
                String d2 = m8976d(i16);
                try {
                    bArr7[i15] = MessageDigest.getInstance(d2).digest(bArr8);
                    i15++;
                } catch (NoSuchAlgorithmException e3) {
                    throw new RuntimeException(d2.concat(" digest not supported"), e3);
                }
            }
            return bArr7;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Too many chunks: ");
        sb3.append(j3);
        throw new DigestException(sb3.toString());
    }

    /* renamed from: l */
    private static X509Certificate[][] m8984l(FileChannel fileChannel, C1542b5 b5Var) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer f = m8978f(b5Var.f4758a);
                int i = 0;
                while (f.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(m8982j(m8978f(f), hashMap, instance));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Failed to parse/verify signer #");
                        sb.append(i);
                        sb.append(" block");
                        throw new SecurityException(sb.toString(), e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                } else if (!hashMap.isEmpty()) {
                    m8980h(hashMap, fileChannel, b5Var.f4759b, b5Var.f4760c, b5Var.f4761d, b5Var.f4762e);
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } else {
                    throw new SecurityException("No content digests found");
                }
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }
}
