package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.IdentityHashMap;

/* renamed from: com.google.android.gms.internal.ads.lk */
final class C1928lk implements C1817ik, C1780hk {

    /* renamed from: f */
    public final C1817ik[] f10071f;

    /* renamed from: g */
    private final IdentityHashMap<C2261uk, Integer> f10072g = new IdentityHashMap<>();

    /* renamed from: h */
    private C1780hk f10073h;

    /* renamed from: i */
    private int f10074i;

    /* renamed from: j */
    private C1521al f10075j;

    /* renamed from: k */
    private C1817ik[] f10076k;

    /* renamed from: l */
    private C2373xk f10077l;

    public C1928lk(C1817ik... ikVarArr) {
        this.f10071f = ikVarArr;
    }

    /* renamed from: a */
    public final void mo7950a(C1817ik ikVar) {
        int i = this.f10074i - 1;
        this.f10074i = i;
        if (i <= 0) {
            int i2 = 0;
            for (C1817ik m : this.f10071f) {
                i2 += m.mo6980m().f4236a;
            }
            C2447zk[] zkVarArr = new C2447zk[i2];
            int i3 = 0;
            for (C1817ik m2 : this.f10071f) {
                C1521al m3 = m2.mo6980m();
                int i4 = m3.f4236a;
                int i5 = 0;
                while (i5 < i4) {
                    zkVarArr[i3] = m3.mo5309b(i5);
                    i5++;
                    i3++;
                }
            }
            this.f10075j = new C1521al(zkVarArr);
            this.f10073h.mo7950a(this);
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo8967b(C2373xk xkVar) {
        C1817ik ikVar = (C1817ik) xkVar;
        if (this.f10075j != null) {
            this.f10073h.mo8967b(this);
        }
    }

    /* renamed from: e */
    public final long mo6976e() {
        long j = Long.MAX_VALUE;
        for (C1817ik e : this.f10076k) {
            long e2 = e.mo6976e();
            if (e2 != Long.MIN_VALUE) {
                j = Math.min(j, e2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: f */
    public final long mo6977f() {
        long f = this.f10071f[0].mo6977f();
        int i = 1;
        while (true) {
            C1817ik[] ikVarArr = this.f10071f;
            if (i >= ikVarArr.length) {
                if (f != -9223372036854775807L) {
                    C1817ik[] ikVarArr2 = this.f10076k;
                    int length = ikVarArr2.length;
                    int i2 = 0;
                    while (i2 < length) {
                        C1817ik ikVar = ikVarArr2[i2];
                        if (ikVar == this.f10071f[0] || ikVar.mo6984s(f) == f) {
                            i2++;
                        } else {
                            throw new IllegalStateException("Children seeked to different positions");
                        }
                    }
                }
                return f;
            } else if (ikVarArr[i].mo6977f() == -9223372036854775807L) {
                i++;
            } else {
                throw new IllegalStateException("Child reported discontinuity");
            }
        }
    }

    /* renamed from: m */
    public final C1521al mo6980m() {
        return this.f10075j;
    }

    /* renamed from: p */
    public final void mo6981p() {
        for (C1817ik p : this.f10071f) {
            p.mo6981p();
        }
    }

    /* renamed from: q */
    public final boolean mo6982q(long j) {
        return this.f10077l.mo6982q(j);
    }

    /* renamed from: r */
    public final void mo6983r(long j) {
        for (C1817ik r : this.f10076k) {
            r.mo6983r(j);
        }
    }

    /* renamed from: s */
    public final long mo6984s(long j) {
        long s = this.f10076k[0].mo6984s(j);
        int i = 1;
        while (true) {
            C1817ik[] ikVarArr = this.f10076k;
            if (i >= ikVarArr.length) {
                return s;
            }
            if (ikVarArr[i].mo6984s(s) == s) {
                i++;
            } else {
                throw new IllegalStateException("Children seeked to different positions");
            }
        }
    }

    /* renamed from: t */
    public final long mo6985t(C1670el[] elVarArr, boolean[] zArr, C2261uk[] ukVarArr, boolean[] zArr2, long j) {
        int length;
        C1670el[] elVarArr2 = elVarArr;
        C2261uk[] ukVarArr2 = ukVarArr;
        int length2 = elVarArr2.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        while (true) {
            length = elVarArr2.length;
            if (i >= length) {
                break;
            }
            C2261uk ukVar = ukVarArr2[i];
            iArr[i] = ukVar == null ? -1 : this.f10072g.get(ukVar).intValue();
            iArr2[i] = -1;
            C1670el elVar = elVarArr2[i];
            if (elVar != null) {
                C2447zk d = elVar.mo6993d();
                int i2 = 0;
                while (true) {
                    C1817ik[] ikVarArr = this.f10071f;
                    if (i2 >= ikVarArr.length) {
                        break;
                    } else if (ikVarArr[i2].mo6980m().mo5308a(d) != -1) {
                        iArr2[i] = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            i++;
        }
        this.f10072g.clear();
        C2261uk[] ukVarArr3 = new C2261uk[length];
        C2261uk[] ukVarArr4 = new C2261uk[length];
        C1670el[] elVarArr3 = new C1670el[length];
        ArrayList arrayList = new ArrayList(this.f10071f.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.f10071f.length) {
            for (int i4 = 0; i4 < elVarArr2.length; i4++) {
                C1670el elVar2 = null;
                ukVarArr4[i4] = iArr[i4] == i3 ? ukVarArr2[i4] : null;
                if (iArr2[i4] == i3) {
                    elVar2 = elVarArr2[i4];
                }
                elVarArr3[i4] = elVar2;
            }
            int i5 = i3;
            C1670el[] elVarArr4 = elVarArr3;
            ArrayList arrayList2 = arrayList;
            long t = this.f10071f[i3].mo6985t(elVarArr3, zArr, ukVarArr4, zArr2, j2);
            if (i5 == 0) {
                j2 = t;
            } else if (t != j2) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z = false;
            for (int i6 = 0; i6 < elVarArr2.length; i6++) {
                boolean z2 = true;
                if (iArr2[i6] == i5) {
                    C1856jm.m11730e(ukVarArr4[i6] != null);
                    C2261uk ukVar2 = ukVarArr4[i6];
                    ukVarArr3[i6] = ukVar2;
                    this.f10072g.put(ukVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    if (ukVarArr4[i6] != null) {
                        z2 = false;
                    }
                    C1856jm.m11730e(z2);
                }
            }
            if (z) {
                arrayList2.add(this.f10071f[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            elVarArr3 = elVarArr4;
            ukVarArr2 = ukVarArr;
        }
        C2261uk[] ukVarArr5 = ukVarArr2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(ukVarArr3, 0, ukVarArr5, 0, length);
        C1817ik[] ikVarArr2 = new C1817ik[arrayList3.size()];
        this.f10076k = ikVarArr2;
        arrayList3.toArray(ikVarArr2);
        this.f10077l = new C2335wj(this.f10076k);
        return j2;
    }

    /* renamed from: u */
    public final void mo6986u(C1780hk hkVar, long j) {
        this.f10073h = hkVar;
        this.f10074i = r0;
        for (C1817ik u : this.f10071f) {
            u.mo6986u(this, j);
        }
    }

    public final long zza() {
        return this.f10077l.zza();
    }
}
