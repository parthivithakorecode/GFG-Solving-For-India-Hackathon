package androidx.window.java.layout;

import androidx.core.util.C0738a;
import kotlin.coroutines.jvm.internal.C3340f;
import kotlin.coroutines.jvm.internal.C3346k;
import p016b5.C1368k0;
import p037e5.C2576b;
import p079k4.C3325l;
import p079k4.C3330q;
import p100n4.C3773d;
import p145u4.C4154p;

@C3340f(mo14340c = "androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1", mo14341f = "WindowInfoTrackerCallbackAdapter.kt", mo14342l = {96}, mo14343m = "invokeSuspend")
final class WindowInfoTrackerCallbackAdapter$addListener$1$1 extends C3346k implements C4154p<C1368k0, C3773d<? super C3330q>, Object> {
    final /* synthetic */ C0738a<T> $consumer;
    final /* synthetic */ C2576b<T> $flow;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WindowInfoTrackerCallbackAdapter$addListener$1$1(C2576b<? extends T> bVar, C0738a<T> aVar, C3773d<? super WindowInfoTrackerCallbackAdapter$addListener$1$1> dVar) {
        super(2, dVar);
        this.$flow = bVar;
        this.$consumer = aVar;
    }

    public final C3773d<C3330q> create(Object obj, C3773d<?> dVar) {
        return new WindowInfoTrackerCallbackAdapter$addListener$1$1(this.$flow, this.$consumer, dVar);
    }

    public final Object invoke(C1368k0 k0Var, C3773d<? super C3330q> dVar) {
        return ((WindowInfoTrackerCallbackAdapter$addListener$1$1) create(k0Var, dVar)).invokeSuspend(C3330q.f20829a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C3858d.m25871c();
        int i = this.label;
        if (i == 0) {
            C3325l.m24451b(obj);
            C2576b<T> bVar = this.$flow;
            C1222x3e71c403 windowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1 = new C1222x3e71c403(this.$consumer);
            this.label = 1;
            if (bVar.mo12471a(windowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1, this) == c) {
                return c;
            }
        } else if (i == 1) {
            C3325l.m24451b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C3330q.f20829a;
    }
}
