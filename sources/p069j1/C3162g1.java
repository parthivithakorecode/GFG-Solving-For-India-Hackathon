package p069j1;

import javax.annotation.concurrent.GuardedBy;
import p054h1.C2694t;

/* renamed from: j1.g1 */
public final class C3162g1 {

    /* renamed from: a */
    private long f20462a;
    @GuardedBy("lock")

    /* renamed from: b */
    private long f20463b = Long.MIN_VALUE;

    /* renamed from: c */
    private final Object f20464c = new Object();

    public C3162g1(long j) {
        this.f20462a = j;
    }

    /* renamed from: a */
    public final void mo14019a(long j) {
        synchronized (this.f20464c) {
            this.f20462a = j;
        }
    }

    /* renamed from: b */
    public final boolean mo14020b() {
        synchronized (this.f20464c) {
            long b = C2694t.m21592a().mo12463b();
            if (this.f20463b + this.f20462a > b) {
                return false;
            }
            this.f20463b = b;
            return true;
        }
    }
}
