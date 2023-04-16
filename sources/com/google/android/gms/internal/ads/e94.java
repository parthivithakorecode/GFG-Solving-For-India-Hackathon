package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileInputStream;
import java.io.IOException;

public final class e94 extends eb1 {

    /* renamed from: e */
    private final ContentResolver f6130e;

    /* renamed from: f */
    private Uri f6131f;

    /* renamed from: g */
    private AssetFileDescriptor f6132g;

    /* renamed from: h */
    private FileInputStream f6133h;

    /* renamed from: i */
    private long f6134i;

    /* renamed from: j */
    private boolean f6135j;

    public e94(Context context) {
        super(false);
        this.f6130e = context.getContentResolver();
    }

    /* renamed from: a */
    public final int mo5752a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f6134i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new d94(e, 2000);
            }
        }
        FileInputStream fileInputStream = this.f6133h;
        int i3 = n13.f11236a;
        int read = fileInputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.f6134i;
        if (j2 != -1) {
            this.f6134i = j2 - ((long) read);
        }
        mo6893o(read);
        return read;
    }

    /* renamed from: h */
    public final Uri mo5753h() {
        return this.f6131f;
    }

    /* renamed from: i */
    public final void mo5754i() {
        this.f6131f = null;
        try {
            FileInputStream fileInputStream = this.f6133h;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f6133h = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f6132g;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f6132g = null;
                if (this.f6135j) {
                    this.f6135j = false;
                    mo6894p();
                }
            } catch (IOException e) {
                throw new d94(e, 2000);
            } catch (Throwable th) {
                this.f6132g = null;
                if (this.f6135j) {
                    this.f6135j = false;
                    mo6894p();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new d94(e2, 2000);
        } catch (Throwable th2) {
            this.f6133h = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f6132g;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f6132g = null;
                if (this.f6135j) {
                    this.f6135j = false;
                    mo6894p();
                }
                throw th2;
            } catch (IOException e3) {
                throw new d94(e3, 2000);
            } catch (Throwable th3) {
                this.f6132g = null;
                if (this.f6135j) {
                    this.f6135j = false;
                    mo6894p();
                }
                throw th3;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f6, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f7, code lost:
        r3 = 2000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0101, code lost:
        r3 = 2005;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0107, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0108, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0107 A[ExcHandler: d94 (r0v1 'e' com.google.android.gms.internal.ads.d94 A[CUSTOM_DECLARE]), Splitter:B:1:0x0003] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo5755k(com.google.android.gms.internal.ads.li1 r16) {
        /*
            r15 = this;
            r1 = r15
            r0 = r16
            android.net.Uri r4 = r0.f10058a     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            r1.f6131f = r4     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            r15.mo6895q(r16)     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            java.lang.String r5 = "content"
            android.net.Uri r6 = r0.f10058a     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            java.lang.String r6 = r6.getScheme()     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            boolean r5 = r5.equals(r6)     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            if (r5 == 0) goto L_0x002f
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            r5.<init>()     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            int r6 = com.google.android.gms.internal.ads.n13.f11236a     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            r7 = 31
            if (r6 < r7) goto L_0x0026
            com.google.android.gms.internal.ads.c94.m7274a(r5)     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
        L_0x0026:
            android.content.ContentResolver r6 = r1.f6130e     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            java.lang.String r7 = "*/*"
            android.content.res.AssetFileDescriptor r5 = r6.openTypedAssetFileDescriptor(r4, r7, r5)     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            goto L_0x0037
        L_0x002f:
            android.content.ContentResolver r5 = r1.f6130e     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            java.lang.String r6 = "r"
            android.content.res.AssetFileDescriptor r5 = r5.openAssetFileDescriptor(r4, r6)     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
        L_0x0037:
            r1.f6132g = r5     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            if (r5 == 0) goto L_0x00cc
            long r6 = r5.getLength()     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            java.io.FileDescriptor r8 = r5.getFileDescriptor()     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            r4.<init>(r8)     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            r1.f6133h = r4     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            r8 = -1
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r11 = 2008(0x7d8, float:2.814E-42)
            r12 = 0
            if (r10 == 0) goto L_0x0060
            long r13 = r0.f10063f     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            int r13 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r13 > 0) goto L_0x005a
            goto L_0x0060
        L_0x005a:
            com.google.android.gms.internal.ads.d94 r0 = new com.google.android.gms.internal.ads.d94     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            r0.<init>(r12, r11)     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            throw r0     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
        L_0x0060:
            long r13 = r5.getStartOffset()     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            long r2 = r0.f10063f     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            long r2 = r2 + r13
            long r2 = r4.skip(r2)     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            long r2 = r2 - r13
            long r13 = r0.f10063f     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            int r13 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x00c6
            r13 = 0
            if (r10 != 0) goto L_0x0098
            java.nio.channels.FileChannel r2 = r4.getChannel()     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            long r3 = r2.size()     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            int r6 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r6 != 0) goto L_0x0086
            r1.f6134i = r8     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            r3 = r8
            goto L_0x00a0
        L_0x0086:
            long r6 = r2.position()     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            long r3 = r3 - r6
            r1.f6134i = r3     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            int r2 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x0092
            goto L_0x00a0
        L_0x0092:
            com.google.android.gms.internal.ads.d94 r0 = new com.google.android.gms.internal.ads.d94     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            r0.<init>(r12, r11)     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            throw r0     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
        L_0x0098:
            long r3 = r6 - r2
            r1.f6134i = r3     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            int r2 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x00c0
        L_0x00a0:
            long r5 = r0.f10064g
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x00b0
            int r2 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x00ae
            long r5 = java.lang.Math.min(r3, r5)
        L_0x00ae:
            r1.f6134i = r5
        L_0x00b0:
            r2 = 1
            r1.f6135j = r2
            r15.mo6896r(r16)
            long r2 = r0.f10064g
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x00bd
            return r2
        L_0x00bd:
            long r2 = r1.f6134i
            return r2
        L_0x00c0:
            com.google.android.gms.internal.ads.d94 r0 = new com.google.android.gms.internal.ads.d94     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            r0.<init>(r12, r11)     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            throw r0     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
        L_0x00c6:
            com.google.android.gms.internal.ads.d94 r0 = new com.google.android.gms.internal.ads.d94     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            r0.<init>(r12, r11)     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            throw r0     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
        L_0x00cc:
            com.google.android.gms.internal.ads.d94 r0 = new com.google.android.gms.internal.ads.d94     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            java.lang.String r3 = java.lang.String.valueOf(r4)     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            int r4 = r3.length()     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            int r4 = r4 + 36
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            r6.<init>(r4)     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            java.lang.String r4 = "Could not open file descriptor for: "
            r6.append(r4)     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            r6.append(r3)     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            java.lang.String r3 = r6.toString()     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            r2.<init>(r3)     // Catch:{ d94 -> 0x0107, IOException -> 0x00f6 }
            r3 = 2000(0x7d0, float:2.803E-42)
            r0.<init>(r2, r3)     // Catch:{ d94 -> 0x0107, IOException -> 0x00f4 }
            throw r0     // Catch:{ d94 -> 0x0107, IOException -> 0x00f4 }
        L_0x00f4:
            r0 = move-exception
            goto L_0x00f9
        L_0x00f6:
            r0 = move-exception
            r3 = 2000(0x7d0, float:2.803E-42)
        L_0x00f9:
            com.google.android.gms.internal.ads.d94 r2 = new com.google.android.gms.internal.ads.d94
            boolean r4 = r0 instanceof java.io.FileNotFoundException
            r5 = 1
            if (r5 == r4) goto L_0x0101
            goto L_0x0103
        L_0x0101:
            r3 = 2005(0x7d5, float:2.81E-42)
        L_0x0103:
            r2.<init>(r0, r3)
            throw r2
        L_0x0107:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.e94.mo5755k(com.google.android.gms.internal.ads.li1):long");
    }
}
