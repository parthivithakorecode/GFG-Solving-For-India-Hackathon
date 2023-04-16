package p061i1;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import p069j1.C3218x;

/* renamed from: i1.j */
final class C2811j extends RelativeLayout {

    /* renamed from: f */
    final C3218x f19480f;

    /* renamed from: g */
    boolean f19481g;

    public C2811j(Context context, String str, String str2, String str3) {
        super(context);
        C3218x xVar = new C3218x(context, str);
        this.f19480f = xVar;
        xVar.mo14129o(str2);
        xVar.mo14128n(str3);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f19481g) {
            return false;
        }
        this.f19480f.mo14127m(motionEvent);
        return false;
    }
}
