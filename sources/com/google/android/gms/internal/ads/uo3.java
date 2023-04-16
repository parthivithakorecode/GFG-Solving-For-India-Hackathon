package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public abstract class uo3 implements Iterable<Byte>, Serializable {

    /* renamed from: g */
    public static final uo3 f15667g = new qo3(kq3.f9608d);

    /* renamed from: h */
    private static final Comparator<uo3> f15668h = new ko3();

    /* renamed from: i */
    private static final to3 f15669i = new to3((so3) null);

    /* renamed from: f */
    private int f15670f = 0;

    static {
        int i = do3.f5856a;
    }

    uo3() {
    }

    /* renamed from: C */
    static int m17965C(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    /* renamed from: G */
    public static ro3 m17966G() {
        return new ro3(128);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Collection, java.lang.Iterable<com.google.android.gms.internal.ads.uo3>, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.uo3 m17967H(java.lang.Iterable<com.google.android.gms.internal.ads.uo3> r3) {
        /*
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 != 0) goto L_0x0015
            java.util.Iterator r0 = r3.iterator()
            r1 = 0
        L_0x0009:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0019
            r0.next()
            int r1 = r1 + 1
            goto L_0x0009
        L_0x0015:
            int r1 = r3.size()
        L_0x0019:
            if (r1 != 0) goto L_0x001e
            com.google.android.gms.internal.ads.uo3 r3 = f15667g
            return r3
        L_0x001e:
            java.util.Iterator r3 = r3.iterator()
            com.google.android.gms.internal.ads.uo3 r3 = m17974o(r3, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uo3.m17967H(java.lang.Iterable):com.google.android.gms.internal.ads.uo3");
    }

    /* renamed from: I */
    public static uo3 m17968I(byte[] bArr) {
        return m17969J(bArr, 0, bArr.length);
    }

    /* renamed from: J */
    public static uo3 m17969J(byte[] bArr, int i, int i2) {
        m17965C(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new qo3(bArr2);
    }

    /* renamed from: K */
    public static uo3 m17970K(String str) {
        return new qo3(str.getBytes(kq3.f9606b));
    }

    /* renamed from: L */
    public static uo3 m17971L(InputStream inputStream) {
        ArrayList arrayList = new ArrayList();
        int i = 256;
        while (true) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            uo3 J = i2 == 0 ? null : m17969J(bArr, 0, i2);
            if (J == null) {
                return m17967H(arrayList);
            }
            arrayList.add(J);
            i = Math.min(i + i, 8192);
        }
    }

    /* renamed from: M */
    static uo3 m17972M(byte[] bArr) {
        return new qo3(bArr);
    }

    /* renamed from: i */
    static void m17973i(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* renamed from: o */
    private static uo3 m17974o(Iterator<uo3> it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", new Object[]{Integer.valueOf(i)}));
        } else if (i == 1) {
            return it.next();
        } else {
            int i2 = i >>> 1;
            uo3 o = m17974o(it, i2);
            uo3 o2 = m17974o(it, i - i2);
            if (Integer.MAX_VALUE - o.mo6627p() >= o2.mo6627p()) {
                return ds3.m8066P(o, o2);
            }
            int p = o.mo6627p();
            int p2 = o2.mo6627p();
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(p);
            sb.append("+");
            sb.append(p2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: B */
    public abstract boolean mo6621B();

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final int mo11267E() {
        return this.f15670f;
    }

    /* renamed from: F */
    public no3 iterator() {
        return new io3(this);
    }

    public abstract boolean equals(Object obj);

    /* renamed from: h */
    public final String mo11268h(Charset charset) {
        return mo6627p() == 0 ? "" : mo6635x(charset);
    }

    public final int hashCode() {
        int i = this.f15670f;
        if (i == 0) {
            int p = mo6627p();
            i = mo6631t(p, 0, p);
            if (i == 0) {
                i = 1;
            }
            this.f15670f = i;
        }
        return i;
    }

    @Deprecated
    /* renamed from: j */
    public final void mo11270j(byte[] bArr, int i, int i2, int i3) {
        m17965C(0, i3, mo6627p());
        m17965C(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            mo6628q(bArr, 0, i2, i3);
        }
    }

    /* renamed from: k */
    public final boolean mo11271k() {
        return mo6627p() == 0;
    }

    /* renamed from: l */
    public final byte[] mo11272l() {
        int p = mo6627p();
        if (p == 0) {
            return kq3.f9608d;
        }
        byte[] bArr = new byte[p];
        mo6628q(bArr, 0, 0, p);
        return bArr;
    }

    /* renamed from: m */
    public abstract byte mo6625m(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public abstract byte mo6626n(int i);

    /* renamed from: p */
    public abstract int mo6627p();

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract void mo6628q(byte[] bArr, int i, int i2, int i3);

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract int mo6629r();

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract boolean mo6630s();

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract int mo6631t(int i, int i2, int i3);

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo6627p());
        objArr[2] = mo6627p() <= 50 ? us3.m18038a(this) : us3.m18038a(mo6633v(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract int mo6632u(int i, int i2, int i3);

    /* renamed from: v */
    public abstract uo3 mo6633v(int i, int i2);

    /* renamed from: w */
    public abstract cp3 mo6634w();

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public abstract String mo6635x(Charset charset);

    /* renamed from: y */
    public abstract ByteBuffer mo10337y();

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public abstract void mo6636z(ho3 ho3);
}
