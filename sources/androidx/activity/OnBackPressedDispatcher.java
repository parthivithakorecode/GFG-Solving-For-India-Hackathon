package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.C1099i;
import androidx.lifecycle.C1107k;
import androidx.lifecycle.C1110m;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {

    /* renamed from: a */
    private final Runnable f404a;

    /* renamed from: b */
    final ArrayDeque<C0220g> f405b = new ArrayDeque<>();

    private class LifecycleOnBackPressedCancellable implements C1107k, C0214a {

        /* renamed from: a */
        private final C1099i f406a;

        /* renamed from: b */
        private final C0220g f407b;

        /* renamed from: c */
        private C0214a f408c;

        LifecycleOnBackPressedCancellable(C1099i iVar, C0220g gVar) {
            this.f406a = iVar;
            this.f407b = gVar;
            iVar.mo3830a(this);
        }

        public void cancel() {
            this.f406a.mo3832c(this);
            this.f407b.mo545e(this);
            C0214a aVar = this.f408c;
            if (aVar != null) {
                aVar.cancel();
                this.f408c = null;
            }
        }

        /* renamed from: e */
        public void mo527e(C1110m mVar, C1099i.C1101b bVar) {
            if (bVar == C1099i.C1101b.ON_START) {
                this.f408c = OnBackPressedDispatcher.this.mo530b(this.f407b);
            } else if (bVar == C1099i.C1101b.ON_STOP) {
                C0214a aVar = this.f408c;
                if (aVar != null) {
                    aVar.cancel();
                }
            } else if (bVar == C1099i.C1101b.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    private class C0213a implements C0214a {

        /* renamed from: a */
        private final C0220g f410a;

        C0213a(C0220g gVar) {
            this.f410a = gVar;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.f405b.remove(this.f410a);
            this.f410a.mo545e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f404a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: a */
    public void mo529a(C1110m mVar, C0220g gVar) {
        C1099i a = mVar.mo491a();
        if (a.mo3831b() != C1099i.C1102c.DESTROYED) {
            gVar.mo541a(new LifecycleOnBackPressedCancellable(a, gVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0214a mo530b(C0220g gVar) {
        this.f405b.add(gVar);
        C0213a aVar = new C0213a(gVar);
        gVar.mo541a(aVar);
        return aVar;
    }

    /* renamed from: c */
    public void mo531c() {
        Iterator<C0220g> descendingIterator = this.f405b.descendingIterator();
        while (descendingIterator.hasNext()) {
            C0220g next = descendingIterator.next();
            if (next.mo543c()) {
                next.mo542b();
                return;
            }
        }
        Runnable runnable = this.f404a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
