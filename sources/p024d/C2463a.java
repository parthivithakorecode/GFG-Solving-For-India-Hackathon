package p024d;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: d.a */
public final class C2463a {

    /* renamed from: a */
    private final Set<C2464b> f18507a = new CopyOnWriteArraySet();

    /* renamed from: b */
    private volatile Context f18508b;

    /* renamed from: a */
    public void mo12288a(C2464b bVar) {
        if (this.f18508b != null) {
            bVar.mo533a(this.f18508b);
        }
        this.f18507a.add(bVar);
    }

    /* renamed from: b */
    public void mo12289b() {
        this.f18508b = null;
    }

    /* renamed from: c */
    public void mo12290c(Context context) {
        this.f18508b = context;
        for (C2464b a : this.f18507a) {
            a.mo533a(context);
        }
    }
}
