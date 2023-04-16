package p091m2;

import android.app.Activity;
import android.os.Bundle;
import p003a2.C0092o;
import p048g2.C2637b;

/* renamed from: m2.y */
final class C3716y extends C3715x {

    /* renamed from: j */
    final /* synthetic */ Bundle f21526j;

    /* renamed from: k */
    final /* synthetic */ Activity f21527k;

    /* renamed from: l */
    final /* synthetic */ C3684f0 f21528l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3716y(C3684f0 f0Var, Bundle bundle, Activity activity) {
        super(f0Var.f21450f, true);
        this.f21528l = f0Var;
        this.f21526j = bundle;
        this.f21527k = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14839a() {
        Bundle bundle;
        if (this.f21526j != null) {
            bundle = new Bundle();
            if (this.f21526j.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f21526j.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        ((C3704p0) C0092o.m313i(this.f21528l.f21450f.f21462i)).mo14882P0(C2637b.m21358Z2(this.f21527k), bundle, this.f21523g);
    }
}
