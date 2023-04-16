package p016b5;

import kotlin.jvm.internal.C3353e;
import kotlin.jvm.internal.C3357i;
import p100n4.C3769a;
import p100n4.C3778g;

/* renamed from: b5.j0 */
public final class C1362j0 extends C3769a {

    /* renamed from: g */
    public static final C1363a f3561g = new C1363a((C3353e) null);

    /* renamed from: f */
    private final String f3562f;

    /* renamed from: b5.j0$a */
    public static final class C1363a implements C3778g.C3783c<C1362j0> {
        private C1363a() {
        }

        public /* synthetic */ C1363a(C3353e eVar) {
            this();
        }
    }

    /* renamed from: O */
    public final String mo4723O() {
        return this.f3562f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1362j0) && C3357i.m24504a(this.f3562f, ((C1362j0) obj).f3562f);
    }

    public int hashCode() {
        return this.f3562f.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.f3562f + ')';
    }
}
