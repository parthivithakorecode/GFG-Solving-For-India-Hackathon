package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.re */
final class C2144re {

    /* renamed from: a */
    public final C1817ik f13597a;

    /* renamed from: b */
    public final Object f13598b;

    /* renamed from: c */
    public final int f13599c;

    /* renamed from: d */
    public final C2261uk[] f13600d = new C2261uk[2];

    /* renamed from: e */
    public final boolean[] f13601e = new boolean[2];

    /* renamed from: f */
    public final long f13602f;

    /* renamed from: g */
    public int f13603g;

    /* renamed from: h */
    public long f13604h;

    /* renamed from: i */
    public boolean f13605i;

    /* renamed from: j */
    public boolean f13606j;

    /* renamed from: k */
    public boolean f13607k;

    /* renamed from: l */
    public C2144re f13608l;

    /* renamed from: m */
    public C2077pl f13609m;

    /* renamed from: n */
    private final C1589cf[] f13610n;

    /* renamed from: o */
    private final C1626df[] f13611o;

    /* renamed from: p */
    private final C2040ol f13612p;

    /* renamed from: q */
    private final C1891kk f13613q;

    /* renamed from: r */
    private C2077pl f13614r;

    /* renamed from: s */
    private final qr0 f13615s;

    public C2144re(C1589cf[] cfVarArr, C1626df[] dfVarArr, long j, C2040ol olVar, qr0 qr0, C1891kk kkVar, Object obj, int i, int i2, boolean z, long j2, byte[] bArr) {
        this.f13610n = cfVarArr;
        this.f13611o = dfVarArr;
        this.f13602f = j;
        this.f13612p = olVar;
        this.f13615s = qr0;
        this.f13613q = kkVar;
        Objects.requireNonNull(obj);
        this.f13598b = obj;
        this.f13599c = i;
        this.f13603g = i2;
        this.f13605i = z;
        this.f13604h = j2;
        this.f13597a = kkVar.mo7648d(i2, qr0.mo10372l());
    }

    /* renamed from: a */
    public final long mo10509a(long j, boolean z) {
        return mo10510b(j, false, new boolean[2]);
    }

    /* renamed from: b */
    public final long mo10510b(long j, boolean z, boolean[] zArr) {
        C1966ml mlVar = this.f13609m.f12693b;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= 2) {
                break;
            }
            boolean[] zArr2 = this.f13601e;
            if (z || !this.f13609m.mo10084a(this.f13614r, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        long t = this.f13597a.mo6985t(mlVar.mo9275b(), this.f13601e, this.f13600d, zArr, j);
        this.f13614r = this.f13609m;
        this.f13607k = false;
        int i2 = 0;
        while (true) {
            C2261uk[] ukVarArr = this.f13600d;
            if (i2 < 2) {
                if (ukVarArr[i2] != null) {
                    C1856jm.m11730e(mlVar.mo9274a(i2) != null);
                    this.f13607k = true;
                } else {
                    C1856jm.m11730e(mlVar.mo9274a(i2) == null);
                }
                i2++;
            } else {
                this.f13615s.mo10364d(this.f13610n, this.f13609m.f12692a, mlVar);
                return t;
            }
        }
    }

    /* renamed from: c */
    public final void mo10511c() {
        try {
            this.f13613q.mo7646b(this.f13597a);
        } catch (RuntimeException e) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e);
        }
    }

    /* renamed from: d */
    public final boolean mo10512d() {
        return this.f13606j && (!this.f13607k || this.f13597a.mo6976e() == Long.MIN_VALUE);
    }

    /* renamed from: e */
    public final boolean mo10513e() {
        C2077pl a = this.f13612p.mo8686a(this.f13611o, this.f13597a.mo6980m());
        C2077pl plVar = this.f13614r;
        if (plVar != null) {
            int i = 0;
            while (i < 2) {
                if (a.mo10084a(plVar, i)) {
                    i++;
                }
            }
            return false;
        }
        this.f13609m = a;
        return true;
    }
}
