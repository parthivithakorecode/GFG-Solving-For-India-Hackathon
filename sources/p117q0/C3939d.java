package p117q0;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import p089m0.C3646j;
import p123r0.C3961a;
import p123r0.C3962b;
import p123r0.C3963c;
import p123r0.C3965d;
import p123r0.C3966e;
import p123r0.C3967f;
import p123r0.C3968g;
import p123r0.C3969h;
import p141u0.C4108p;
import p153w0.C4260a;

/* renamed from: q0.d */
public class C3939d implements C3963c.C3964a {

    /* renamed from: d */
    private static final String f22074d = C3646j.m25231f("WorkConstraintsTracker");

    /* renamed from: a */
    private final C3938c f22075a;

    /* renamed from: b */
    private final C3963c<?>[] f22076b;

    /* renamed from: c */
    private final Object f22077c = new Object();

    public C3939d(Context context, C4260a aVar, C3938c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f22075a = cVar;
        this.f22076b = new C3963c[]{new C3961a(applicationContext, aVar), new C3962b(applicationContext, aVar), new C3969h(applicationContext, aVar), new C3965d(applicationContext, aVar), new C3968g(applicationContext, aVar), new C3967f(applicationContext, aVar), new C3966e(applicationContext, aVar)};
    }

    /* renamed from: a */
    public void mo15400a(List<String> list) {
        synchronized (this.f22077c) {
            ArrayList arrayList = new ArrayList();
            for (String next : list) {
                if (mo15402c(next)) {
                    C3646j.m25229c().mo14806a(f22074d, String.format("Constraints met for %s", new Object[]{next}), new Throwable[0]);
                    arrayList.add(next);
                }
            }
            C3938c cVar = this.f22075a;
            if (cVar != null) {
                cVar.mo4532e(arrayList);
            }
        }
    }

    /* renamed from: b */
    public void mo15401b(List<String> list) {
        synchronized (this.f22077c) {
            C3938c cVar = this.f22075a;
            if (cVar != null) {
                cVar.mo4531d(list);
            }
        }
    }

    /* renamed from: c */
    public boolean mo15402c(String str) {
        synchronized (this.f22077c) {
            for (C3963c<?> cVar : this.f22076b) {
                if (cVar.mo15427d(str)) {
                    C3646j.m25229c().mo14806a(f22074d, String.format("Work %s constrained by %s", new Object[]{str, cVar.getClass().getSimpleName()}), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: d */
    public void mo15403d(Iterable<C4108p> iterable) {
        synchronized (this.f22077c) {
            for (C3963c<?> g : this.f22076b) {
                g.mo15430g((C3963c.C3964a) null);
            }
            for (C3963c<?> e : this.f22076b) {
                e.mo15428e(iterable);
            }
            for (C3963c<?> g2 : this.f22076b) {
                g2.mo15430g(this);
            }
        }
    }

    /* renamed from: e */
    public void mo15404e() {
        synchronized (this.f22077c) {
            for (C3963c<?> f : this.f22076b) {
                f.mo15429f();
            }
        }
    }
}
