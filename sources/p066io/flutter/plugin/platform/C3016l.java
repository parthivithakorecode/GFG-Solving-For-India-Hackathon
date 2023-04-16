package p066io.flutter.plugin.platform;

import android.view.View;

/* renamed from: io.flutter.plugin.platform.l */
public final /* synthetic */ class C3016l implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C3021q f19992a;

    /* renamed from: b */
    public final /* synthetic */ int f19993b;

    public /* synthetic */ C3016l(C3021q qVar, int i) {
        this.f19992a = qVar;
        this.f19993b = i;
    }

    public final void onFocusChange(View view, boolean z) {
        this.f19992a.m23282S(this.f19993b, view, z);
    }
}
