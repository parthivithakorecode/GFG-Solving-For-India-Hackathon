package p091m2;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import p003a2.C0092o;
import p048g2.C2637b;
import p112p2.C3923a;

/* renamed from: m2.h */
final class C3687h extends C3715x {

    /* renamed from: j */
    final /* synthetic */ String f21463j;

    /* renamed from: k */
    final /* synthetic */ String f21464k;

    /* renamed from: l */
    final /* synthetic */ Context f21465l;

    /* renamed from: m */
    final /* synthetic */ Bundle f21466m;

    /* renamed from: n */
    final /* synthetic */ C3686g0 f21467n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3687h(C3686g0 g0Var, String str, String str2, Context context, Bundle bundle) {
        super(g0Var, true);
        this.f21467n = g0Var;
        this.f21463j = str;
        this.f21464k = str2;
        this.f21465l = context;
        this.f21466m = bundle;
    }

    /* renamed from: a */
    public final void mo14839a() {
        String str;
        String str2;
        String str3;
        try {
            if (C3686g0.m25295r(this.f21463j, this.f21464k)) {
                String str4 = this.f21464k;
                str2 = this.f21463j;
                str = str4;
                str3 = this.f21467n.f21454a;
            } else {
                str3 = null;
                str2 = null;
                str = null;
            }
            C0092o.m313i(this.f21465l);
            C3686g0 g0Var = this.f21467n;
            C3704p0 unused = g0Var.f21462i = g0Var.mo14865u(this.f21465l, true);
            if (this.f21467n.f21462i == null) {
                Log.w(this.f21467n.f21454a, "Failed to connect to measurement client.");
                return;
            }
            int a = DynamiteModule.m5725a(this.f21465l, "com.google.android.gms.measurement.dynamite");
            int c = DynamiteModule.m5726c(this.f21465l, "com.google.android.gms.measurement.dynamite");
            ((C3704p0) C0092o.m313i(this.f21467n.f21462i)).mo14880M2(C2637b.m21358Z2(this.f21465l), new C3710s0(39065, (long) Math.max(a, c), c < a, str3, str2, str, this.f21466m, C3923a.m26080a(this.f21465l)), this.f21522f);
        } catch (Exception e) {
            this.f21467n.m25293p(e, true, false);
        }
    }
}
