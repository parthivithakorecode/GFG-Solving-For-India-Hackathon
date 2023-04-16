package p066io.flutter.embedding.android;

import android.view.KeyEvent;
import p066io.flutter.embedding.android.C2945t;

/* renamed from: io.flutter.embedding.android.p */
public final /* synthetic */ class C2933p implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C2935r f19767f;

    /* renamed from: g */
    public final /* synthetic */ C2945t.C2948c f19768g;

    /* renamed from: h */
    public final /* synthetic */ long f19769h;

    /* renamed from: i */
    public final /* synthetic */ KeyEvent f19770i;

    public /* synthetic */ C2933p(C2935r rVar, C2945t.C2948c cVar, long j, KeyEvent keyEvent) {
        this.f19767f = rVar;
        this.f19768g = cVar;
        this.f19769h = j;
        this.f19770i = keyEvent;
    }

    public final void run() {
        this.f19767f.m22990k(this.f19768g, this.f19769h, this.f19770i);
    }
}
