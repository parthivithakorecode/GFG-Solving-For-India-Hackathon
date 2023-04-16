package p058h5;

import java.io.Serializable;
import p080k5.C3334d;

/* renamed from: h5.a */
public abstract class C2740a {

    /* renamed from: h5.a$a */
    static final class C2741a extends C2740a implements Serializable {

        /* renamed from: f */
        private final C2778q f19311f;

        C2741a(C2778q qVar) {
            this.f19311f = qVar;
        }

        /* renamed from: a */
        public C2778q mo12770a() {
            return this.f19311f;
        }

        /* renamed from: b */
        public C2746e mo12771b() {
            return C2746e.m21795u(mo12772d());
        }

        /* renamed from: d */
        public long mo12772d() {
            return System.currentTimeMillis();
        }

        public boolean equals(Object obj) {
            if (obj instanceof C2741a) {
                return this.f19311f.equals(((C2741a) obj).f19311f);
            }
            return false;
        }

        public int hashCode() {
            return this.f19311f.hashCode() + 1;
        }

        public String toString() {
            return "SystemClock[" + this.f19311f + "]";
        }
    }

    protected C2740a() {
    }

    /* renamed from: c */
    public static C2740a m21767c(C2778q qVar) {
        C3334d.m24473i(qVar, "zone");
        return new C2741a(qVar);
    }

    /* renamed from: a */
    public abstract C2778q mo12770a();

    /* renamed from: b */
    public abstract C2746e mo12771b();
}
