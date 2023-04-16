package p061i1;

import android.graphics.drawable.Drawable;

/* renamed from: i1.l */
public final /* synthetic */ class C2813l implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C2815n f19486f;

    /* renamed from: g */
    public final /* synthetic */ Drawable f19487g;

    public /* synthetic */ C2813l(C2815n nVar, Drawable drawable) {
        this.f19486f = nVar;
        this.f19487g = drawable;
    }

    public final void run() {
        C2815n nVar = this.f19486f;
        nVar.f19488c.f19490f.getWindow().setBackgroundDrawable(this.f19487g);
    }
}
