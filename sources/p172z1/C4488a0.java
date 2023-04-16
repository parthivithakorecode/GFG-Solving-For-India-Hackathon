package p172z1;

import p003a2.C0089n;
import p160x1.C4282d;

/* renamed from: z1.a0 */
final class C4488a0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4489b<?> f22941a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C4282d f22942b;

    /* synthetic */ C4488a0(C4489b bVar, C4282d dVar, C4529u uVar) {
        this.f22941a = bVar;
        this.f22942b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4488a0)) {
            C4488a0 a0Var = (C4488a0) obj;
            return C0089n.m301a(this.f22941a, a0Var.f22941a) && C0089n.m301a(this.f22942b, a0Var.f22942b);
        }
    }

    public final int hashCode() {
        return C0089n.m302b(this.f22941a, this.f22942b);
    }

    public final String toString() {
        return C0089n.m303c(this).mo260a("key", this.f22941a).mo260a("feature", this.f22942b).toString();
    }
}
