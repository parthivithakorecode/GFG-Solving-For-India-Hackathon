package p094m5;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import p058h5.C2746e;
import p058h5.C2752g;
import p058h5.C2780r;
import p080k5.C3334d;

/* renamed from: m5.f */
public abstract class C3732f {

    /* renamed from: m5.f$a */
    static final class C3733a extends C3732f implements Serializable {

        /* renamed from: f */
        private final C2780r f21567f;

        C3733a(C2780r rVar) {
            this.f21567f = rVar;
        }

        /* renamed from: a */
        public C2780r mo14909a(C2746e eVar) {
            return this.f21567f;
        }

        /* renamed from: b */
        public C3728d mo14910b(C2752g gVar) {
            return null;
        }

        /* renamed from: c */
        public List<C2780r> mo14911c(C2752g gVar) {
            return Collections.singletonList(this.f21567f);
        }

        /* renamed from: d */
        public boolean mo14912d() {
            return true;
        }

        /* renamed from: e */
        public boolean mo14913e(C2752g gVar, C2780r rVar) {
            return this.f21567f.equals(rVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C3733a) {
                return this.f21567f.equals(((C3733a) obj).f21567f);
            }
            if (!(obj instanceof C3725b)) {
                return false;
            }
            C3725b bVar = (C3725b) obj;
            return bVar.mo14912d() && this.f21567f.equals(bVar.mo14909a(C2746e.f19327h));
        }

        public int hashCode() {
            return ((((this.f21567f.hashCode() + 31) ^ 1) ^ 1) ^ (this.f21567f.hashCode() + 31)) ^ 1;
        }

        public String toString() {
            return "FixedRules:" + this.f21567f;
        }
    }

    C3732f() {
    }

    /* renamed from: f */
    public static C3732f m25461f(C2780r rVar) {
        C3334d.m24473i(rVar, "offset");
        return new C3733a(rVar);
    }

    /* renamed from: a */
    public abstract C2780r mo14909a(C2746e eVar);

    /* renamed from: b */
    public abstract C3728d mo14910b(C2752g gVar);

    /* renamed from: c */
    public abstract List<C2780r> mo14911c(C2752g gVar);

    /* renamed from: d */
    public abstract boolean mo14912d();

    /* renamed from: e */
    public abstract boolean mo14913e(C2752g gVar, C2780r rVar);
}
