package p030d5;

import kotlin.jvm.internal.C3353e;
import kotlin.jvm.internal.C3357i;

/* renamed from: d5.i */
public final class C2517i<T> {

    /* renamed from: a */
    public static final C2519b f18634a = new C2519b((C3353e) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C2520c f18635b = new C2520c();

    /* renamed from: d5.i$a */
    public static final class C2518a extends C2520c {

        /* renamed from: a */
        public final Throwable f18636a;

        public C2518a(Throwable th) {
            this.f18636a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C2518a) && C3357i.m24504a(this.f18636a, ((C2518a) obj).f18636a);
        }

        public int hashCode() {
            Throwable th = this.f18636a;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public String toString() {
            return "Closed(" + this.f18636a + ')';
        }
    }

    /* renamed from: d5.i$b */
    public static final class C2519b {
        private C2519b() {
        }

        public /* synthetic */ C2519b(C3353e eVar) {
            this();
        }

        /* renamed from: a */
        public final <E> Object mo12438a(Throwable th) {
            return C2517i.m21113b(new C2518a(th));
        }

        /* renamed from: b */
        public final <E> Object mo12439b() {
            return C2517i.m21113b(C2517i.f18635b);
        }

        /* renamed from: c */
        public final <E> Object mo12440c(E e) {
            return C2517i.m21113b(e);
        }
    }

    /* renamed from: d5.i$c */
    public static class C2520c {
        public String toString() {
            return "Failed";
        }
    }

    /* renamed from: b */
    public static <T> Object m21113b(Object obj) {
        return obj;
    }
}
