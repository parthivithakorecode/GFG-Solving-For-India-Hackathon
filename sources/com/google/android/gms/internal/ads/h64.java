package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Objects;

final class h64 implements r54, q54 {

    /* renamed from: f */
    private final r54[] f8059f;

    /* renamed from: g */
    private final IdentityHashMap<i74, Integer> f8060g;

    /* renamed from: h */
    private final ArrayList<r54> f8061h = new ArrayList<>();

    /* renamed from: i */
    private q54 f8062i;

    /* renamed from: j */
    private hm0 f8063j;

    /* renamed from: k */
    private r54[] f8064k;

    /* renamed from: l */
    private k74 f8065l;

    /* renamed from: m */
    private final f54 f8066m;

    public h64(f54 f54, long[] jArr, r54[] r54Arr, byte... bArr) {
        this.f8066m = f54;
        this.f8059f = r54Arr;
        this.f8065l = new e54(new k74[0]);
        this.f8060g = new IdentityHashMap<>();
        this.f8064k = new r54[0];
        for (int i = 0; i < r54Arr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.f8059f[i] = new f64(r54Arr[i], j);
            }
        }
    }

    /* renamed from: a */
    public final long mo6836a() {
        return this.f8065l.mo6836a();
    }

    /* renamed from: b */
    public final long mo7243b(long j) {
        long b = this.f8064k[0].mo7243b(j);
        int i = 1;
        while (true) {
            r54[] r54Arr = this.f8064k;
            if (i >= r54Arr.length) {
                return b;
            }
            if (r54Arr[i].mo7243b(b) == b) {
                i++;
            } else {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
    }

    /* renamed from: c */
    public final long mo6837c() {
        return this.f8065l.mo6837c();
    }

    /* renamed from: d */
    public final hm0 mo7244d() {
        hm0 hm0 = this.f8063j;
        Objects.requireNonNull(hm0);
        return hm0;
    }

    /* renamed from: e */
    public final boolean mo6838e(long j) {
        if (this.f8061h.isEmpty()) {
            return this.f8065l.mo6838e(j);
        }
        int size = this.f8061h.size();
        for (int i = 0; i < size; i++) {
            this.f8061h.get(i).mo6838e(j);
        }
        return false;
    }

    /* renamed from: f */
    public final void mo6839f(long j) {
        this.f8065l.mo6839f(j);
    }

    /* renamed from: g */
    public final long mo7245g() {
        long j = -9223372036854775807L;
        for (r54 r54 : this.f8064k) {
            long g = r54.mo7245g();
            if (g != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    r54[] r54Arr = this.f8064k;
                    int length = r54Arr.length;
                    int i = 0;
                    while (i < length) {
                        r54 r542 = r54Arr[i];
                        if (r542 == r54) {
                            break;
                        } else if (r542.mo7243b(g) == g) {
                            i++;
                        } else {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = g;
                } else if (g != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (!(j == -9223372036854775807L || r54.mo7243b(j) == j)) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    /* renamed from: h */
    public final void mo5559h(r54 r54) {
        this.f8061h.remove(r54);
        if (this.f8061h.isEmpty()) {
            int i = 0;
            for (r54 d : this.f8059f) {
                i += d.mo7244d().f8338a;
            }
            gk0[] gk0Arr = new gk0[i];
            int i2 = 0;
            for (r54 d2 : this.f8059f) {
                hm0 d3 = d2.mo7244d();
                int i3 = d3.f8338a;
                int i4 = 0;
                while (i4 < i3) {
                    gk0Arr[i2] = d3.mo7964b(i4);
                    i4++;
                    i2++;
                }
            }
            this.f8063j = new hm0(gk0Arr);
            q54 q54 = this.f8062i;
            Objects.requireNonNull(q54);
            q54.mo5559h(this);
        }
    }

    /* renamed from: i */
    public final void mo7246i() {
        for (r54 i : this.f8059f) {
            i.mo7246i();
        }
    }

    /* renamed from: j */
    public final long mo7247j(w74[] w74Arr, boolean[] zArr, i74[] i74Arr, boolean[] zArr2, long j) {
        int length;
        w74[] w74Arr2 = w74Arr;
        i74[] i74Arr2 = i74Arr;
        int length2 = w74Arr2.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        while (true) {
            length = w74Arr2.length;
            if (i >= length) {
                break;
            }
            i74 i74 = i74Arr2[i];
            Integer num = i74 == null ? null : this.f8060g.get(i74);
            iArr[i] = num == null ? -1 : num.intValue();
            iArr2[i] = -1;
            w74 w74 = w74Arr2[i];
            if (w74 != null) {
                gk0 d = w74.mo11596d();
                int i2 = 0;
                while (true) {
                    r54[] r54Arr = this.f8059f;
                    if (i2 >= r54Arr.length) {
                        break;
                    } else if (r54Arr[i2].mo7244d().mo7963a(d) != -1) {
                        iArr2[i] = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            i++;
        }
        this.f8060g.clear();
        i74[] i74Arr3 = new i74[length];
        i74[] i74Arr4 = new i74[length];
        w74[] w74Arr3 = new w74[length];
        ArrayList arrayList = new ArrayList(this.f8059f.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.f8059f.length) {
            for (int i4 = 0; i4 < w74Arr2.length; i4++) {
                i74Arr4[i4] = iArr[i4] == i3 ? i74Arr2[i4] : null;
                w74Arr3[i4] = iArr2[i4] == i3 ? w74Arr2[i4] : null;
            }
            int i5 = i3;
            ArrayList arrayList2 = arrayList;
            i74[] i74Arr5 = i74Arr4;
            w74[] w74Arr4 = w74Arr3;
            long j3 = this.f8059f[i3].mo7247j(w74Arr3, zArr, i74Arr4, zArr2, j2);
            if (i5 == 0) {
                j2 = j3;
            } else if (j3 != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < w74Arr2.length; i6++) {
                boolean z2 = true;
                if (iArr2[i6] == i5) {
                    i74 i742 = i74Arr5[i6];
                    Objects.requireNonNull(i742);
                    i74Arr3[i6] = i742;
                    this.f8060g.put(i742, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    if (i74Arr5[i6] != null) {
                        z2 = false;
                    }
                    wu1.m19207f(z2);
                }
            }
            if (z) {
                arrayList2.add(this.f8059f[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            i74Arr4 = i74Arr5;
            w74Arr3 = w74Arr4;
        }
        System.arraycopy(i74Arr3, 0, i74Arr2, 0, length);
        r54[] r54Arr2 = (r54[]) arrayList.toArray(new r54[0]);
        this.f8064k = r54Arr2;
        this.f8065l = new e54(r54Arr2);
        return j2;
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void mo5562k(k74 k74) {
        r54 r54 = (r54) k74;
        q54 q54 = this.f8062i;
        Objects.requireNonNull(q54);
        q54.mo5562k(this);
    }

    /* renamed from: l */
    public final long mo7248l(long j, ay3 ay3) {
        r54[] r54Arr = this.f8064k;
        return (r54Arr.length > 0 ? r54Arr[0] : this.f8059f[0]).mo7248l(j, ay3);
    }

    /* renamed from: m */
    public final r54 mo7855m(int i) {
        r54 r54 = this.f8059f[i];
        return r54 instanceof f64 ? ((f64) r54).f6724f : r54;
    }

    /* renamed from: n */
    public final boolean mo6840n() {
        return this.f8065l.mo6840n();
    }

    /* renamed from: o */
    public final void mo7249o(q54 q54, long j) {
        this.f8062i = q54;
        Collections.addAll(this.f8061h, this.f8059f);
        for (r54 o : this.f8059f) {
            o.mo7249o(this, j);
        }
    }

    /* renamed from: s */
    public final void mo7250s(long j, boolean z) {
        for (r54 s : this.f8064k) {
            s.mo7250s(j, false);
        }
    }
}
