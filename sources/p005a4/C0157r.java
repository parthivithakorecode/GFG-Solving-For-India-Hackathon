package p005a4;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

/* renamed from: a4.r */
public class C0157r implements C0143i<Object> {

    /* renamed from: a */
    public static final C0157r f281a = new C0157r();

    /* renamed from: b */
    private static final boolean f282b = (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN);

    /* renamed from: c */
    private static final Charset f283c = Charset.forName("UTF8");

    /* renamed from: a4.r$a */
    static final class C0158a extends ByteArrayOutputStream {
        C0158a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public byte[] mo354d() {
            return this.buf;
        }
    }

    /* renamed from: c */
    protected static final void m443c(ByteBuffer byteBuffer, int i) {
        int position = byteBuffer.position() % i;
        if (position != 0) {
            byteBuffer.position((byteBuffer.position() + i) - position);
        }
    }

    /* renamed from: d */
    protected static final byte[] m444d(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[m445e(byteBuffer)];
        byteBuffer.get(bArr);
        return bArr;
    }

    /* renamed from: e */
    protected static final int m445e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            byte b = byteBuffer.get() & 255;
            return b < 254 ? b : b == 254 ? byteBuffer.getChar() : byteBuffer.getInt();
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    /* renamed from: h */
    protected static final void m446h(ByteArrayOutputStream byteArrayOutputStream, int i) {
        int size = byteArrayOutputStream.size() % i;
        if (size != 0) {
            for (int i2 = 0; i2 < i - size; i2++) {
                byteArrayOutputStream.write(0);
            }
        }
    }

    /* renamed from: i */
    protected static final void m447i(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        m453o(byteArrayOutputStream, bArr.length);
        byteArrayOutputStream.write(bArr, 0, bArr.length);
    }

    /* renamed from: j */
    protected static final void m448j(ByteArrayOutputStream byteArrayOutputStream, int i) {
        if (f282b) {
            byteArrayOutputStream.write(i);
            i >>>= 8;
        } else {
            byteArrayOutputStream.write(i >>> 8);
        }
        byteArrayOutputStream.write(i);
    }

    /* renamed from: k */
    protected static final void m449k(ByteArrayOutputStream byteArrayOutputStream, double d) {
        m452n(byteArrayOutputStream, Double.doubleToLongBits(d));
    }

    /* renamed from: l */
    protected static final void m450l(ByteArrayOutputStream byteArrayOutputStream, float f) {
        m451m(byteArrayOutputStream, Float.floatToIntBits(f));
    }

    /* renamed from: m */
    protected static final void m451m(ByteArrayOutputStream byteArrayOutputStream, int i) {
        if (f282b) {
            byteArrayOutputStream.write(i);
            byteArrayOutputStream.write(i >>> 8);
            byteArrayOutputStream.write(i >>> 16);
            i >>>= 24;
        } else {
            byteArrayOutputStream.write(i >>> 24);
            byteArrayOutputStream.write(i >>> 16);
            byteArrayOutputStream.write(i >>> 8);
        }
        byteArrayOutputStream.write(i);
    }

    /* renamed from: n */
    protected static final void m452n(ByteArrayOutputStream byteArrayOutputStream, long j) {
        if (f282b) {
            byteArrayOutputStream.write((byte) ((int) j));
            byteArrayOutputStream.write((byte) ((int) (j >>> 8)));
            byteArrayOutputStream.write((byte) ((int) (j >>> 16)));
            byteArrayOutputStream.write((byte) ((int) (j >>> 24)));
            byteArrayOutputStream.write((byte) ((int) (j >>> 32)));
            byteArrayOutputStream.write((byte) ((int) (j >>> 40)));
            byteArrayOutputStream.write((byte) ((int) (j >>> 48)));
            j >>>= 56;
        } else {
            byteArrayOutputStream.write((byte) ((int) (j >>> 56)));
            byteArrayOutputStream.write((byte) ((int) (j >>> 48)));
            byteArrayOutputStream.write((byte) ((int) (j >>> 40)));
            byteArrayOutputStream.write((byte) ((int) (j >>> 32)));
            byteArrayOutputStream.write((byte) ((int) (j >>> 24)));
            byteArrayOutputStream.write((byte) ((int) (j >>> 16)));
            byteArrayOutputStream.write((byte) ((int) (j >>> 8)));
        }
        byteArrayOutputStream.write((byte) ((int) j));
    }

    /* renamed from: o */
    protected static final void m453o(ByteArrayOutputStream byteArrayOutputStream, int i) {
        if (i < 254) {
            byteArrayOutputStream.write(i);
        } else if (i <= 65535) {
            byteArrayOutputStream.write(254);
            m448j(byteArrayOutputStream, i);
        } else {
            byteArrayOutputStream.write(255);
            m451m(byteArrayOutputStream, i);
        }
    }

    /* renamed from: a */
    public ByteBuffer mo323a(Object obj) {
        if (obj == null) {
            return null;
        }
        C0158a aVar = new C0158a();
        mo353p(aVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.mo354d(), 0, aVar.size());
        return allocateDirect;
    }

    /* renamed from: b */
    public Object mo324b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Object f = mo351f(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            return f;
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Object mo351f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return mo352g(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: long[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: long[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: long[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: int[]} */
    /* JADX WARNING: type inference failed for: r1v8, types: [java.util.Map, java.util.HashMap] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0072, code lost:
        r6.position(r6.position() + (r5 * 8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008c, code lost:
        r6.position(r6.position() + (r5 * 4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo352g(byte r5, java.nio.ByteBuffer r6) {
        /*
            r4 = this;
            r0 = 0
            r1 = 4
            r2 = 8
            switch(r5) {
                case 0: goto L_0x00de;
                case 1: goto L_0x00db;
                case 2: goto L_0x00d8;
                case 3: goto L_0x00cf;
                case 4: goto L_0x00c6;
                case 5: goto L_0x00b3;
                case 6: goto L_0x00a7;
                case 7: goto L_0x009b;
                case 8: goto L_0x0096;
                case 9: goto L_0x007c;
                case 10: goto L_0x0062;
                case 11: goto L_0x0051;
                case 12: goto L_0x0039;
                case 13: goto L_0x0020;
                case 14: goto L_0x000f;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Message corrupted"
            r5.<init>(r6)
            throw r5
        L_0x000f:
            int r5 = m445e(r6)
            float[] r0 = new float[r5]
            m443c(r6, r1)
            java.nio.FloatBuffer r2 = r6.asFloatBuffer()
            r2.get(r0)
            goto L_0x008c
        L_0x0020:
            int r5 = m445e(r6)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
        L_0x0029:
            if (r0 >= r5) goto L_0x004e
            java.lang.Object r2 = r4.mo351f(r6)
            java.lang.Object r3 = r4.mo351f(r6)
            r1.put(r2, r3)
            int r0 = r0 + 1
            goto L_0x0029
        L_0x0039:
            int r5 = m445e(r6)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r5)
        L_0x0042:
            if (r0 >= r5) goto L_0x004e
            java.lang.Object r2 = r4.mo351f(r6)
            r1.add(r2)
            int r0 = r0 + 1
            goto L_0x0042
        L_0x004e:
            r0 = r1
            goto L_0x00df
        L_0x0051:
            int r5 = m445e(r6)
            double[] r0 = new double[r5]
            m443c(r6, r2)
            java.nio.DoubleBuffer r1 = r6.asDoubleBuffer()
            r1.get(r0)
            goto L_0x0072
        L_0x0062:
            int r5 = m445e(r6)
            long[] r0 = new long[r5]
            m443c(r6, r2)
            java.nio.LongBuffer r1 = r6.asLongBuffer()
            r1.get(r0)
        L_0x0072:
            int r1 = r6.position()
            int r5 = r5 * r2
            int r1 = r1 + r5
            r6.position(r1)
            goto L_0x00df
        L_0x007c:
            int r5 = m445e(r6)
            int[] r0 = new int[r5]
            m443c(r6, r1)
            java.nio.IntBuffer r2 = r6.asIntBuffer()
            r2.get(r0)
        L_0x008c:
            int r2 = r6.position()
            int r5 = r5 * r1
            int r2 = r2 + r5
            r6.position(r2)
            goto L_0x00df
        L_0x0096:
            byte[] r0 = m444d(r6)
            goto L_0x00df
        L_0x009b:
            byte[] r5 = m444d(r6)
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r6 = f283c
            r0.<init>(r5, r6)
            goto L_0x00df
        L_0x00a7:
            m443c(r6, r2)
            double r5 = r6.getDouble()
            java.lang.Double r0 = java.lang.Double.valueOf(r5)
            goto L_0x00df
        L_0x00b3:
            byte[] r5 = m444d(r6)
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r1 = f283c
            r6.<init>(r5, r1)
            r5 = 16
            r0.<init>(r6, r5)
            goto L_0x00df
        L_0x00c6:
            long r5 = r6.getLong()
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            goto L_0x00df
        L_0x00cf:
            int r5 = r6.getInt()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            goto L_0x00df
        L_0x00d8:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x00df
        L_0x00db:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x00df
        L_0x00de:
            r0 = 0
        L_0x00df:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005a4.C0157r.mo352g(byte, java.nio.ByteBuffer):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo353p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        int i = 0;
        if (obj == null || obj.equals((Object) null)) {
            byteArrayOutputStream.write(0);
        } else if (obj instanceof Boolean) {
            byteArrayOutputStream.write(((Boolean) obj).booleanValue() ? 1 : 2);
        } else if (obj instanceof Number) {
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                byteArrayOutputStream.write(3);
                m451m(byteArrayOutputStream, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                byteArrayOutputStream.write(4);
                m452n(byteArrayOutputStream, ((Long) obj).longValue());
            } else if ((obj instanceof Float) || (obj instanceof Double)) {
                byteArrayOutputStream.write(6);
                m446h(byteArrayOutputStream, 8);
                m449k(byteArrayOutputStream, ((Number) obj).doubleValue());
            } else if (obj instanceof BigInteger) {
                byteArrayOutputStream.write(5);
                m447i(byteArrayOutputStream, ((BigInteger) obj).toString(16).getBytes(f283c));
            } else {
                throw new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
            }
        } else if (obj instanceof CharSequence) {
            byteArrayOutputStream.write(7);
            m447i(byteArrayOutputStream, obj.toString().getBytes(f283c));
        } else if (obj instanceof byte[]) {
            byteArrayOutputStream.write(8);
            m447i(byteArrayOutputStream, (byte[]) obj);
        } else if (obj instanceof int[]) {
            byteArrayOutputStream.write(9);
            int[] iArr = (int[]) obj;
            m453o(byteArrayOutputStream, iArr.length);
            m446h(byteArrayOutputStream, 4);
            int length = iArr.length;
            while (i < length) {
                m451m(byteArrayOutputStream, iArr[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            byteArrayOutputStream.write(10);
            long[] jArr = (long[]) obj;
            m453o(byteArrayOutputStream, jArr.length);
            m446h(byteArrayOutputStream, 8);
            int length2 = jArr.length;
            while (i < length2) {
                m452n(byteArrayOutputStream, jArr[i]);
                i++;
            }
        } else if (obj instanceof double[]) {
            byteArrayOutputStream.write(11);
            double[] dArr = (double[]) obj;
            m453o(byteArrayOutputStream, dArr.length);
            m446h(byteArrayOutputStream, 8);
            int length3 = dArr.length;
            while (i < length3) {
                m449k(byteArrayOutputStream, dArr[i]);
                i++;
            }
        } else if (obj instanceof List) {
            byteArrayOutputStream.write(12);
            List<Object> list = (List) obj;
            m453o(byteArrayOutputStream, list.size());
            for (Object p : list) {
                mo353p(byteArrayOutputStream, p);
            }
        } else if (obj instanceof Map) {
            byteArrayOutputStream.write(13);
            Map map = (Map) obj;
            m453o(byteArrayOutputStream, map.size());
            for (Map.Entry entry : map.entrySet()) {
                mo353p(byteArrayOutputStream, entry.getKey());
                mo353p(byteArrayOutputStream, entry.getValue());
            }
        } else if (obj instanceof float[]) {
            byteArrayOutputStream.write(14);
            float[] fArr = (float[]) obj;
            m453o(byteArrayOutputStream, fArr.length);
            m446h(byteArrayOutputStream, 4);
            int length4 = fArr.length;
            while (i < length4) {
                m450l(byteArrayOutputStream, fArr[i]);
                i++;
            }
        } else {
            throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass() + "'");
        }
    }
}
