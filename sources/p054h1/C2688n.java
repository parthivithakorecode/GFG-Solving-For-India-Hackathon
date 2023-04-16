package p054h1;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: h1.n */
final class C2688n implements View.OnTouchListener {

    /* renamed from: f */
    final /* synthetic */ C2693s f19145f;

    C2688n(C2693s sVar) {
        this.f19145f = sVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f19145f.f19161m == null) {
            return false;
        }
        this.f19145f.f19161m.mo7561d(motionEvent);
        return false;
    }
}
