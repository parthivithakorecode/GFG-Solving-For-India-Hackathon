package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public final class o54 extends d54<Void> {

    /* renamed from: j */
    private final v54 f11898j;

    /* renamed from: k */
    private final boolean f11899k;

    /* renamed from: l */
    private final hh0 f11900l;

    /* renamed from: m */
    private final pf0 f11901m;

    /* renamed from: n */
    private m54 f11902n;

    /* renamed from: o */
    private l54 f11903o;

    /* renamed from: p */
    private boolean f11904p;

    /* renamed from: q */
    private boolean f11905q;

    /* renamed from: r */
    private boolean f11906r;

    public o54(v54 v54, boolean z) {
        boolean z2;
        this.f11898j = v54;
        if (z) {
            v54.mo11397q();
            z2 = true;
        } else {
            z2 = false;
        }
        this.f11899k = z2;
        this.f11900l = new hh0();
        this.f11901m = new pf0();
        v54.mo11384A();
        this.f11902n = m54.m13063q(v54.mo8361B());
    }

    /* renamed from: D */
    private final Object m14307D(Object obj) {
        return (this.f11902n.f10741e == null || !obj.equals(m54.f10739f)) ? obj : this.f11902n.f10741e;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    /* renamed from: E */
    private final void m14308E(long j) {
        l54 l54 = this.f11903o;
        int a = this.f11902n.mo6954a(l54.f9903f.f7614a);
        if (a != -1) {
            m54 m54 = this.f11902n;
            pf0 pf0 = this.f11901m;
            m54.mo6957d(a, pf0, false);
            long j2 = pf0.f12647d;
            if (j2 != -9223372036854775807L && j >= j2) {
                j = Math.max(0, j2 - 1);
            }
            l54.mo8886r(j);
        }
    }

    /* renamed from: B */
    public final C2451zo mo8361B() {
        return this.f11898j.mo8361B();
    }

    /* renamed from: C */
    public final l54 mo8362h(s54 s54, g94 g94, long j) {
        l54 l54 = new l54(s54, g94, j, (byte[]) null);
        l54.mo8888u(this.f11898j);
        if (this.f11905q) {
            l54.mo8885q(s54.mo10736c(m14307D(s54.f7614a)));
        } else {
            this.f11903o = l54;
            if (!this.f11904p) {
                this.f11904p = true;
                mo6392z(null, this.f11898j);
            }
        }
        return l54;
    }

    /* renamed from: F */
    public final ei0 mo9687F() {
        return this.f11902n;
    }

    /* renamed from: j */
    public final void mo8363j(r54 r54) {
        ((l54) r54).mo8887t();
        if (r54 == this.f11903o) {
            this.f11903o = null;
        }
    }

    /* renamed from: s */
    public final void mo6387s(vt1 vt1) {
        super.mo6387s(vt1);
        if (!this.f11899k) {
            this.f11904p = true;
            mo6392z(null, this.f11898j);
        }
    }

    /* renamed from: u */
    public final void mo6388u() {
        this.f11905q = false;
        this.f11904p = false;
        super.mo6388u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final /* bridge */ /* synthetic */ s54 mo6389w(Object obj, s54 s54) {
        Void voidR = (Void) obj;
        Object obj2 = s54.f7614a;
        if (this.f11902n.f10741e != null && this.f11902n.f10741e.equals(obj2)) {
            obj2 = m54.f10739f;
        }
        return s54.mo10736c(obj2);
    }

    /* renamed from: x */
    public final void mo6390x() {
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0090  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo6391y(java.lang.Object r12, com.google.android.gms.internal.ads.v54 r13, com.google.android.gms.internal.ads.ei0 r14) {
        /*
            r11 = this;
            java.lang.Void r12 = (java.lang.Void) r12
            boolean r12 = r11.f11905q
            r13 = 0
            if (r12 == 0) goto L_0x001c
            com.google.android.gms.internal.ads.m54 r12 = r11.f11902n
            com.google.android.gms.internal.ads.m54 r12 = r12.mo9136p(r14)
            r11.f11902n = r12
            com.google.android.gms.internal.ads.l54 r12 = r11.f11903o
            if (r12 == 0) goto L_0x009f
            long r0 = r12.mo8883m()
            r11.m14308E(r0)
            goto L_0x009f
        L_0x001c:
            boolean r12 = r14.mo6970o()
            if (r12 == 0) goto L_0x0038
            boolean r12 = r11.f11906r
            if (r12 == 0) goto L_0x002d
            com.google.android.gms.internal.ads.m54 r12 = r11.f11902n
            com.google.android.gms.internal.ads.m54 r12 = r12.mo9136p(r14)
            goto L_0x0035
        L_0x002d:
            java.lang.Object r12 = com.google.android.gms.internal.ads.hh0.f8221o
            java.lang.Object r0 = com.google.android.gms.internal.ads.m54.f10739f
            com.google.android.gms.internal.ads.m54 r12 = com.google.android.gms.internal.ads.m54.m13064r(r14, r12, r0)
        L_0x0035:
            r11.f11902n = r12
            goto L_0x009f
        L_0x0038:
            com.google.android.gms.internal.ads.hh0 r12 = r11.f11900l
            r0 = 0
            r1 = 0
            r14.mo6958e(r0, r12, r1)
            com.google.android.gms.internal.ads.hh0 r12 = r11.f11900l
            java.lang.Object r12 = r12.f8225a
            com.google.android.gms.internal.ads.l54 r3 = r11.f11903o
            if (r3 == 0) goto L_0x0066
            long r3 = r3.mo8884p()
            com.google.android.gms.internal.ads.m54 r5 = r11.f11902n
            com.google.android.gms.internal.ads.l54 r6 = r11.f11903o
            com.google.android.gms.internal.ads.s54 r6 = r6.f9903f
            java.lang.Object r6 = r6.f7614a
            com.google.android.gms.internal.ads.pf0 r7 = r11.f11901m
            r5.mo6969n(r6, r7)
            com.google.android.gms.internal.ads.m54 r5 = r11.f11902n
            com.google.android.gms.internal.ads.hh0 r6 = r11.f11900l
            r5.mo6958e(r0, r6, r1)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0066
            r9 = r3
            goto L_0x0067
        L_0x0066:
            r9 = r1
        L_0x0067:
            com.google.android.gms.internal.ads.hh0 r6 = r11.f11900l
            com.google.android.gms.internal.ads.pf0 r7 = r11.f11901m
            r8 = 0
            r5 = r14
            android.util.Pair r0 = r5.mo6967l(r6, r7, r8, r9)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            boolean r0 = r11.f11906r
            if (r0 == 0) goto L_0x0086
            com.google.android.gms.internal.ads.m54 r12 = r11.f11902n
            com.google.android.gms.internal.ads.m54 r12 = r12.mo9136p(r14)
            goto L_0x008a
        L_0x0086:
            com.google.android.gms.internal.ads.m54 r12 = com.google.android.gms.internal.ads.m54.m13064r(r14, r12, r1)
        L_0x008a:
            r11.f11902n = r12
            com.google.android.gms.internal.ads.l54 r12 = r11.f11903o
            if (r12 == 0) goto L_0x009f
            r11.m14308E(r2)
            com.google.android.gms.internal.ads.s54 r12 = r12.f9903f
            java.lang.Object r13 = r12.f7614a
            java.lang.Object r13 = r11.m14307D(r13)
            com.google.android.gms.internal.ads.s54 r13 = r12.mo10736c(r13)
        L_0x009f:
            r12 = 1
            r11.f11906r = r12
            r11.f11905q = r12
            com.google.android.gms.internal.ads.m54 r12 = r11.f11902n
            r11.mo11398t(r12)
            if (r13 == 0) goto L_0x00b3
            com.google.android.gms.internal.ads.l54 r12 = r11.f11903o
            java.util.Objects.requireNonNull(r12)
            r12.mo8885q(r13)
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o54.mo6391y(java.lang.Object, com.google.android.gms.internal.ads.v54, com.google.android.gms.internal.ads.ei0):void");
    }
}
