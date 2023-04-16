package p149v2;

import java.io.IOException;
import p028d3.C2488a;
import p028d3.C2490b;
import p028d3.C2491c;
import p167y2.C4405f;
import p167y2.C4407g;

/* renamed from: v2.w */
public abstract class C4233w<T> {

    /* renamed from: v2.w$a */
    class C4234a extends C4233w<T> {
        C4234a() {
        }

        /* renamed from: c */
        public T mo4624c(C2488a aVar) {
            if (aVar.mo12354V() != C2490b.NULL) {
                return C4233w.this.mo4624c(aVar);
            }
            aVar.mo12352R();
            return null;
        }

        /* renamed from: e */
        public void mo4625e(C2491c cVar, T t) {
            if (t == null) {
                cVar.mo12369H();
            } else {
                C4233w.this.mo4625e(cVar, t);
            }
        }
    }

    /* renamed from: a */
    public final T mo15779a(C4215k kVar) {
        try {
            return mo4624c(new C4405f(kVar));
        } catch (IOException e) {
            throw new C4216l((Throwable) e);
        }
    }

    /* renamed from: b */
    public final C4233w<T> mo15780b() {
        return new C4234a();
    }

    /* renamed from: c */
    public abstract T mo4624c(C2488a aVar);

    /* renamed from: d */
    public final C4215k mo15781d(T t) {
        try {
            C4407g gVar = new C4407g();
            mo4625e(gVar, t);
            return gVar.mo16027b0();
        } catch (IOException e) {
            throw new C4216l((Throwable) e);
        }
    }

    /* renamed from: e */
    public abstract void mo4625e(C2491c cVar, T t);
}
