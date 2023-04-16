package p066io.flutter.plugin.platform;

import android.view.View;
import p066io.flutter.plugin.platform.C3021q;
import p174z3.C4572k;

/* renamed from: io.flutter.plugin.platform.n */
public final /* synthetic */ class C3018n implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C3021q.C3022a f19995a;

    /* renamed from: b */
    public final /* synthetic */ C4572k.C4576d f19996b;

    public /* synthetic */ C3018n(C3021q.C3022a aVar, C4572k.C4576d dVar) {
        this.f19995a = aVar;
        this.f19996b = dVar;
    }

    public final void onFocusChange(View view, boolean z) {
        this.f19995a.m23352s(this.f19996b, view, z);
    }
}
