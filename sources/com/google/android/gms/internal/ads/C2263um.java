package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.internal.ads.um */
public final class C2263um implements C2004nm {

    /* renamed from: a */
    private boolean f15629a;

    /* renamed from: b */
    private long f15630b;

    /* renamed from: c */
    private long f15631c;

    /* renamed from: d */
    private C1552bf f15632d = C1552bf.f4896d;

    /* renamed from: a */
    public final void mo11242a(long j) {
        this.f15630b = j;
        if (this.f15629a) {
            this.f15631c = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: b */
    public final void mo11243b() {
        if (!this.f15629a) {
            this.f15631c = SystemClock.elapsedRealtime();
            this.f15629a = true;
        }
    }

    /* renamed from: c */
    public final void mo11244c() {
        if (this.f15629a) {
            mo11242a(mo8665w());
            this.f15629a = false;
        }
    }

    /* renamed from: d */
    public final void mo11245d(C2004nm nmVar) {
        mo11242a(nmVar.mo8665w());
        this.f15632d = nmVar.mo8664v();
    }

    /* renamed from: v */
    public final C1552bf mo8664v() {
        throw null;
    }

    /* renamed from: w */
    public final long mo8665w() {
        long j = this.f15630b;
        if (!this.f15629a) {
            return j;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f15631c;
        C1552bf bfVar = this.f15632d;
        return j + (bfVar.f4897a == 1.0f ? C1774he.m10487a(elapsedRealtime) : bfVar.mo5814a(elapsedRealtime));
    }

    /* renamed from: y */
    public final C1552bf mo8666y(C1552bf bfVar) {
        if (this.f15629a) {
            mo11242a(mo8665w());
        }
        this.f15632d = bfVar;
        return bfVar;
    }
}
