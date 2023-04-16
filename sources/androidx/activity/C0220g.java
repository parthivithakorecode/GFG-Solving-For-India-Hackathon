package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.activity.g */
public abstract class C0220g {

    /* renamed from: a */
    private boolean f418a;

    /* renamed from: b */
    private CopyOnWriteArrayList<C0214a> f419b = new CopyOnWriteArrayList<>();

    public C0220g(boolean z) {
        this.f418a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo541a(C0214a aVar) {
        this.f419b.add(aVar);
    }

    /* renamed from: b */
    public abstract void mo542b();

    /* renamed from: c */
    public final boolean mo543c() {
        return this.f418a;
    }

    /* renamed from: d */
    public final void mo544d() {
        Iterator<C0214a> it = this.f419b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo545e(C0214a aVar) {
        this.f419b.remove(aVar);
    }

    /* renamed from: f */
    public final void mo546f(boolean z) {
        this.f418a = z;
    }
}
