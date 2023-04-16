package kotlinx.coroutines.scheduling;

import p016b5.C1352h1;
import p100n4.C3778g;

/* renamed from: kotlinx.coroutines.scheduling.f */
public class C3432f extends C1352h1 {

    /* renamed from: h */
    private final int f20960h;

    /* renamed from: i */
    private final int f20961i;

    /* renamed from: j */
    private final long f20962j;

    /* renamed from: k */
    private final String f20963k;

    /* renamed from: l */
    private C3423a f20964l = m24755R();

    public C3432f(int i, int i2, long j, String str) {
        this.f20960h = i;
        this.f20961i = i2;
        this.f20962j = j;
        this.f20963k = str;
    }

    /* renamed from: R */
    private final C3423a m24755R() {
        return new C3423a(this.f20960h, this.f20961i, this.f20962j, this.f20963k);
    }

    /* renamed from: O */
    public void mo4673O(C3778g gVar, Runnable runnable) {
        C3423a.m24721v(this.f20964l, runnable, (C3435i) null, false, 6, (Object) null);
    }

    /* renamed from: S */
    public final void mo14495S(Runnable runnable, C3435i iVar, boolean z) {
        this.f20964l.mo14482u(runnable, iVar, z);
    }
}
