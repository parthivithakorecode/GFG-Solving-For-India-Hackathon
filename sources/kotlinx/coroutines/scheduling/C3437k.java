package kotlinx.coroutines.scheduling;

import p016b5.C1387p0;

/* renamed from: kotlinx.coroutines.scheduling.k */
public final class C3437k extends C3434h {

    /* renamed from: h */
    public final Runnable f20968h;

    public C3437k(Runnable runnable, long j, C3435i iVar) {
        super(j, iVar);
        this.f20968h = runnable;
    }

    public void run() {
        try {
            this.f20968h.run();
        } finally {
            this.f20966g.mo14496a();
        }
    }

    public String toString() {
        return "Task[" + C1387p0.m5431a(this.f20968h) + '@' + C1387p0.m5432b(this.f20968h) + ", " + this.f20965f + ", " + this.f20966g + ']';
    }
}
