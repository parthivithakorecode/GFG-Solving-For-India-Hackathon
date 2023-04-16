package p066io.flutter.embedding.android;

import android.view.KeyEvent;
import p066io.flutter.embedding.android.C2945t;

/* renamed from: io.flutter.embedding.android.q */
public final /* synthetic */ class C2934q implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C2935r f19771f;

    /* renamed from: g */
    public final /* synthetic */ C2945t.C2948c f19772g;

    /* renamed from: h */
    public final /* synthetic */ KeyEvent f19773h;

    public /* synthetic */ C2934q(C2935r rVar, C2945t.C2948c cVar, KeyEvent keyEvent) {
        this.f19771f = rVar;
        this.f19772g = cVar;
        this.f19773h = keyEvent;
    }

    public final void run() {
        this.f19771f.m22991l(this.f19772g, this.f19773h);
    }
}
