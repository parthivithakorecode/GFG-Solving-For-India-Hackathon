package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

public final class er2 implements cd2<hs1> {

    /* renamed from: a */
    private final Context f6339a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f6340b;

    /* renamed from: c */
    private final bw0 f6341c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final tq2 f6342d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ep2<ms1, hs1> f6343e;

    /* renamed from: f */
    private final fs2 f6344f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final qx2 f6345g;
    @GuardedBy("this")

    /* renamed from: h */
    private final is2 f6346h;
    @GuardedBy("this")

    /* renamed from: i */
    private cc3<hs1> f6347i;

    public er2(Context context, Executor executor, bw0 bw0, ep2<ms1, hs1> ep2, tq2 tq2, is2 is2, fs2 fs2) {
        this.f6339a = context;
        this.f6340b = executor;
        this.f6341c = bw0;
        this.f6343e = ep2;
        this.f6342d = tq2;
        this.f6346h = is2;
        this.f6344f = fs2;
        this.f6345g = bw0.mo5597b();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final ls1 m8687j(cp2 cp2) {
        ls1 p = this.f6341c.mo5608p();
        fa1 fa1 = new fa1();
        fa1.mo7274c(this.f6339a);
        fa1.mo7277f(((cr2) cp2).f5502a);
        fa1.mo7276e(this.f6344f);
        p.mo9014a(fa1.mo7278g());
        p.mo9016c(new mg1().mo9252q());
        return p;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        if (r5 == null) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0024, code lost:
        if (r5 == null) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0029, code lost:
        r6 = r4.f6345g;
        r5.mo9883g(false);
        r6.mo10426a(r5.mo9885i());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0035, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo6124a(com.google.android.gms.internal.ads.C1902kv r5, java.lang.String r6, com.google.android.gms.internal.ads.ad2 r7, com.google.android.gms.internal.ads.bd2<? super com.google.android.gms.internal.ads.hs1> r8) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.tj0 r7 = new com.google.android.gms.internal.ads.tj0
            r7.<init>(r5, r6)
            android.content.Context r5 = r4.f6339a
            com.google.android.gms.internal.ads.kv r6 = r7.f14877f
            r0 = 7
            r1 = 5
            com.google.android.gms.internal.ads.ox2 r5 = com.google.android.gms.internal.ads.ox2.m14693p(r5, r0, r1, r6)
            java.lang.String r6 = r7.f14878g
            r0 = 1
            r1 = 0
            if (r6 != 0) goto L_0x0036
            java.lang.String r6 = "Ad unit ID should not be null for rewarded video ad."
            com.google.android.gms.internal.ads.io0.m11128d(r6)
            java.util.concurrent.Executor r6 = r4.f6340b
            com.google.android.gms.internal.ads.xq2 r7 = new com.google.android.gms.internal.ads.xq2
            r7.<init>(r4)
            r6.execute(r7)
            if (r5 != 0) goto L_0x0029
        L_0x0026:
            r0 = r1
            goto L_0x00aa
        L_0x0029:
            com.google.android.gms.internal.ads.qx2 r6 = r4.f6345g
            r5.mo9883g(r1)
            com.google.android.gms.internal.ads.px2 r5 = r5.mo9885i()
            r6.mo10426a(r5)
            return r1
        L_0x0036:
            com.google.android.gms.internal.ads.cc3<com.google.android.gms.internal.ads.hs1> r6 = r4.f6347i
            if (r6 == 0) goto L_0x0043
            boolean r6 = r6.isDone()
            if (r6 != 0) goto L_0x0043
            if (r5 != 0) goto L_0x0029
            goto L_0x0026
        L_0x0043:
            android.content.Context r6 = r4.f6339a
            com.google.android.gms.internal.ads.kv r1 = r7.f14877f
            boolean r1 = r1.f9672k
            com.google.android.gms.internal.ads.zs2.m20830a(r6, r1)
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r6 = com.google.android.gms.internal.ads.m10.f10240A6
            com.google.android.gms.internal.ads.k10 r1 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r6 = r1.mo8579b(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x006d
            com.google.android.gms.internal.ads.kv r6 = r7.f14877f
            boolean r6 = r6.f9672k
            if (r6 == 0) goto L_0x006d
            com.google.android.gms.internal.ads.bw0 r6 = r4.f6341c
            com.google.android.gms.internal.ads.uy1 r6 = r6.mo5611s()
            r6.mo11341l(r0)
        L_0x006d:
            com.google.android.gms.internal.ads.is2 r6 = r4.f6346h
            java.lang.String r1 = r7.f14878g
            r6.mo8253H(r1)
            com.google.android.gms.internal.ads.pv r1 = com.google.android.gms.internal.ads.C2087pv.m15288f()
            r6.mo8252G(r1)
            com.google.android.gms.internal.ads.kv r7 = r7.f14877f
            r6.mo8264d(r7)
            com.google.android.gms.internal.ads.ks2 r6 = r6.mo8266f()
            com.google.android.gms.internal.ads.cr2 r7 = new com.google.android.gms.internal.ads.cr2
            r1 = 0
            r7.<init>(r1)
            r7.f5502a = r6
            r7.f5503b = r1
            com.google.android.gms.internal.ads.ep2<com.google.android.gms.internal.ads.ms1, com.google.android.gms.internal.ads.hs1> r6 = r4.f6343e
            com.google.android.gms.internal.ads.fp2 r2 = new com.google.android.gms.internal.ads.fp2
            r2.<init>(r7, r1)
            com.google.android.gms.internal.ads.wq2 r3 = new com.google.android.gms.internal.ads.wq2
            r3.<init>(r4)
            com.google.android.gms.internal.ads.cc3 r6 = r6.mo7009a(r2, r3, r1)
            r4.f6347i = r6
            com.google.android.gms.internal.ads.ar2 r1 = new com.google.android.gms.internal.ads.ar2
            r1.<init>(r4, r8, r5, r7)
            java.util.concurrent.Executor r5 = r4.f6340b
            com.google.android.gms.internal.ads.rb3.m16140r(r6, r1, r5)
        L_0x00aa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.er2.mo6124a(com.google.android.gms.internal.ads.kv, java.lang.String, com.google.android.gms.internal.ads.ad2, com.google.android.gms.internal.ads.bd2):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo7039h() {
        this.f6342d.mo7808d(dt2.m8099d(6, (String) null, (C1605cv) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo7040i(int i) {
        this.f6346h.mo8249D().mo11907a(i);
    }

    public final boolean zza() {
        throw null;
    }
}
