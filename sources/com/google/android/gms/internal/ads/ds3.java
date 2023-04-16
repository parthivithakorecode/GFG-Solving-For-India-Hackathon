package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

final class ds3 extends uo3 {

    /* renamed from: o */
    static final int[] f5905o = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: j */
    private final int f5906j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final uo3 f5907k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final uo3 f5908l;

    /* renamed from: m */
    private final int f5909m;

    /* renamed from: n */
    private final int f5910n;

    private ds3(uo3 uo3, uo3 uo32) {
        this.f5907k = uo3;
        this.f5908l = uo32;
        int p = uo3.mo6627p();
        this.f5909m = p;
        this.f5906j = p + uo32.mo6627p();
        this.f5910n = Math.max(uo3.mo6629r(), uo32.mo6629r()) + 1;
    }

    /* renamed from: P */
    static uo3 m8066P(uo3 uo3, uo3 uo32) {
        if (uo32.mo6627p() == 0) {
            return uo3;
        }
        if (uo3.mo6627p() == 0) {
            return uo32;
        }
        int p = uo3.mo6627p() + uo32.mo6627p();
        if (p < 128) {
            return m8067Q(uo3, uo32);
        }
        if (uo3 instanceof ds3) {
            ds3 ds3 = (ds3) uo3;
            if (ds3.f5908l.mo6627p() + uo32.mo6627p() < 128) {
                return new ds3(ds3.f5907k, m8067Q(ds3.f5908l, uo32));
            } else if (ds3.f5907k.mo6629r() > ds3.f5908l.mo6629r() && ds3.f5910n > uo32.mo6629r()) {
                return new ds3(ds3.f5907k, new ds3(ds3.f5908l, uo32));
            }
        }
        return p >= m8068R(Math.max(uo3.mo6629r(), uo32.mo6629r()) + 1) ? new ds3(uo3, uo32) : zr3.m20816a(new zr3((yr3) null), uo3, uo32);
    }

    /* renamed from: Q */
    private static uo3 m8067Q(uo3 uo3, uo3 uo32) {
        int p = uo3.mo6627p();
        int p2 = uo32.mo6627p();
        byte[] bArr = new byte[(p + p2)];
        uo3.mo11270j(bArr, 0, 0, p);
        uo32.mo11270j(bArr, 0, p, p2);
        return new qo3(bArr);
    }

    /* renamed from: R */
    static int m8068R(int i) {
        int[] iArr = f5905o;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    /* renamed from: B */
    public final boolean mo6621B() {
        int u = this.f5907k.mo6632u(0, 0, this.f5909m);
        uo3 uo3 = this.f5908l;
        return uo3.mo6632u(u, 0, uo3.mo6627p()) == 0;
    }

    /* renamed from: F */
    public final no3 mo6622F() {
        return new xr3(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uo3)) {
            return false;
        }
        uo3 uo3 = (uo3) obj;
        if (this.f5906j != uo3.mo6627p()) {
            return false;
        }
        if (this.f5906j == 0) {
            return true;
        }
        int E = mo11267E();
        int E2 = uo3.mo11267E();
        if (E != 0 && E2 != 0 && E != E2) {
            return false;
        }
        bs3 bs3 = new bs3(this, (as3) null);
        po3 a = bs3.next();
        bs3 bs32 = new bs3(uo3, (as3) null);
        po3 a2 = bs32.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int p = a.mo6627p() - i;
            int p2 = a2.mo6627p() - i2;
            int min = Math.min(p, p2);
            if (!(i == 0 ? a.mo10143O(a2, i2, min) : a2.mo10143O(a, i, min))) {
                return false;
            }
            i3 += min;
            int i4 = this.f5906j;
            if (i3 < i4) {
                if (min == p) {
                    a = bs3.next();
                    i = 0;
                } else {
                    i += min;
                }
                if (min == p2) {
                    a2 = bs32.next();
                    i2 = 0;
                } else {
                    i2 += min;
                }
            } else if (i3 == i4) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public final /* synthetic */ Iterator iterator() {
        return new xr3(this);
    }

    /* renamed from: m */
    public final byte mo6625m(int i) {
        uo3.m17973i(i, this.f5906j);
        return mo6626n(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final byte mo6626n(int i) {
        int i2 = this.f5909m;
        return i < i2 ? this.f5907k.mo6626n(i) : this.f5908l.mo6626n(i - i2);
    }

    /* renamed from: p */
    public final int mo6627p() {
        return this.f5906j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo6628q(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.f5909m;
        if (i + i3 <= i4) {
            this.f5907k.mo6628q(bArr, i, i2, i3);
        } else if (i >= i4) {
            this.f5908l.mo6628q(bArr, i - i4, i2, i3);
        } else {
            int i5 = i4 - i;
            this.f5907k.mo6628q(bArr, i, i2, i5);
            this.f5908l.mo6628q(bArr, 0, i2 + i5, i3 - i5);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final int mo6629r() {
        return this.f5910n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final boolean mo6630s() {
        return this.f5906j >= m8068R(this.f5910n);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final int mo6631t(int i, int i2, int i3) {
        int i4 = this.f5909m;
        if (i2 + i3 <= i4) {
            return this.f5907k.mo6631t(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.f5908l.mo6631t(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.f5908l.mo6631t(this.f5907k.mo6631t(i, i2, i5), 0, i3 - i5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final int mo6632u(int i, int i2, int i3) {
        int i4 = this.f5909m;
        if (i2 + i3 <= i4) {
            return this.f5907k.mo6632u(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.f5908l.mo6632u(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.f5908l.mo6632u(this.f5907k.mo6632u(i, i2, i5), 0, i3 - i5);
    }

    /* renamed from: v */
    public final uo3 mo6633v(int i, int i2) {
        int C = uo3.m17965C(i, i2, this.f5906j);
        if (C == 0) {
            return uo3.f15667g;
        }
        if (C == this.f5906j) {
            return this;
        }
        int i3 = this.f5909m;
        if (i2 <= i3) {
            return this.f5907k.mo6633v(i, i2);
        }
        if (i >= i3) {
            return this.f5908l.mo6633v(i - i3, i2 - i3);
        }
        uo3 uo3 = this.f5907k;
        return new ds3(uo3.mo6633v(i, uo3.mo6627p()), this.f5908l.mo6633v(0, i2 - this.f5909m));
    }

    /* renamed from: w */
    public final cp3 mo6634w() {
        ArrayList<ByteBuffer> arrayList = new ArrayList<>();
        bs3 bs3 = new bs3(this, (as3) null);
        while (bs3.hasNext()) {
            arrayList.add(bs3.next().mo10337y());
        }
        int i = cp3.f5487e;
        boolean z = false;
        int i2 = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            i2 += byteBuffer.remaining();
            z = byteBuffer.hasArray() ? z | true : byteBuffer.isDirect() ? z | true : z | true;
        }
        return z ? new yo3(arrayList, i2, true, (xo3) null) : new ap3(new nq3(arrayList), 4096, (zo3) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final String mo6635x(Charset charset) {
        return new String(mo11272l(), charset);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo6636z(ho3 ho3) {
        this.f5907k.mo6636z(ho3);
        this.f5908l.mo6636z(ho3);
    }
}
