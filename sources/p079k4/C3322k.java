package p079k4;

import java.io.Serializable;
import kotlin.jvm.internal.C3353e;
import kotlin.jvm.internal.C3357i;

/* renamed from: k4.k */
public final class C3322k<T> implements Serializable {

    /* renamed from: f */
    public static final C3323a f20823f = new C3323a((C3353e) null);

    /* renamed from: k4.k$a */
    public static final class C3323a {
        private C3323a() {
        }

        public /* synthetic */ C3323a(C3353e eVar) {
            this();
        }
    }

    /* renamed from: k4.k$b */
    public static final class C3324b implements Serializable {

        /* renamed from: f */
        public final Throwable f20824f;

        public C3324b(Throwable th) {
            C3357i.m24508e(th, "exception");
            this.f20824f = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C3324b) && C3357i.m24504a(this.f20824f, ((C3324b) obj).f20824f);
        }

        public int hashCode() {
            return this.f20824f.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f20824f + ')';
        }
    }

    /* renamed from: a */
    public static <T> Object m24446a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static final Throwable m24447b(Object obj) {
        if (obj instanceof C3324b) {
            return ((C3324b) obj).f20824f;
        }
        return null;
    }

    /* renamed from: c */
    public static final boolean m24448c(Object obj) {
        return obj instanceof C3324b;
    }

    /* renamed from: d */
    public static final boolean m24449d(Object obj) {
        return !(obj instanceof C3324b);
    }
}
