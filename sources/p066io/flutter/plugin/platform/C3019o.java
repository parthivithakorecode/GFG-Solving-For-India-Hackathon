package p066io.flutter.plugin.platform;

import android.view.View;
import p066io.flutter.plugin.platform.C3021q;
import p174z3.C4572k;

/* renamed from: io.flutter.plugin.platform.o */
public final /* synthetic */ class C3019o implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C3021q.C3022a f19997a;

    /* renamed from: b */
    public final /* synthetic */ C4572k.C4576d f19998b;

    public /* synthetic */ C3019o(C3021q.C3022a aVar, C4572k.C4576d dVar) {
        this.f19997a = aVar;
        this.f19998b = dVar;
    }

    public final void onFocusChange(View view, boolean z) {
        this.f19997a.m23353t(this.f19998b, view, z);
    }
}
