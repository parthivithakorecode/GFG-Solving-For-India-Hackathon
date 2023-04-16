package p003a2;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* renamed from: a2.p */
public final class C0094p {

    /* renamed from: b */
    private static C0094p f201b;

    /* renamed from: c */
    private static final C0096q f202c = new C0096q(0, false, false, 0, 0);

    /* renamed from: a */
    private C0096q f203a;

    private C0094p() {
    }

    @RecentlyNonNull
    /* renamed from: b */
    public static synchronized C0094p m317b() {
        C0094p pVar;
        synchronized (C0094p.class) {
            if (f201b == null) {
                f201b = new C0094p();
            }
            pVar = f201b;
        }
        return pVar;
    }

    @RecentlyNullable
    /* renamed from: a */
    public C0096q mo264a() {
        return this.f203a;
    }

    /* renamed from: c */
    public final synchronized void mo265c(C0096q qVar) {
        if (qVar == null) {
            this.f203a = f202c;
            return;
        }
        C0096q qVar2 = this.f203a;
        if (qVar2 == null || qVar2.mo271g() < qVar.mo271g()) {
            this.f203a = qVar;
        }
    }
}
