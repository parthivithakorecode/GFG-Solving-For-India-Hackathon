package p061i1;

import android.app.Activity;
import android.graphics.Bitmap;
import p054h1.C2684j;
import p054h1.C2694t;
import p069j1.C3141b0;
import p069j1.C3156f;
import p069j1.C3163g2;

/* renamed from: i1.n */
final class C2815n extends C3141b0 {

    /* renamed from: c */
    final /* synthetic */ C2816o f19488c;

    /* synthetic */ C2815n(C2816o oVar, C2814m mVar) {
        this.f19488c = oVar;
    }

    /* renamed from: a */
    public final void mo8780a() {
        Bitmap a = C2694t.m21613v().mo13993a(Integer.valueOf(this.f19488c.f19491g.f3728t.f19140k));
        if (a != null) {
            C3156f r = C2694t.m21609r();
            C2816o oVar = this.f19488c;
            Activity activity = oVar.f19490f;
            C2684j jVar = oVar.f19491g.f3728t;
            C3163g2.f20465i.post(new C2813l(this, r.mo13998c(activity, a, jVar.f19138i, jVar.f19139j)));
        }
    }
}
