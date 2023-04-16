package androidx.window.java.layout;

import androidx.core.util.C0738a;
import p037e5.C2577c;
import p079k4.C3330q;
import p100n4.C3773d;

/* renamed from: androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1 */
public final class C1222x3e71c403 implements C2577c<T> {
    final /* synthetic */ C0738a $consumer$inlined;

    public C1222x3e71c403(C0738a aVar) {
        this.$consumer$inlined = aVar;
    }

    public Object emit(T t, C3773d<? super C3330q> dVar) {
        this.$consumer$inlined.accept(t);
        return C3330q.f20829a;
    }
}
