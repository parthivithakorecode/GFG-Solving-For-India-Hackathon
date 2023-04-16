package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.C1099i;
import androidx.lifecycle.C1107k;
import androidx.lifecycle.C1110m;

class FragmentManager$6 implements C1107k {

    /* renamed from: a */
    final /* synthetic */ String f2546a;

    /* renamed from: b */
    final /* synthetic */ C1036s f2547b;

    /* renamed from: c */
    final /* synthetic */ C1099i f2548c;

    /* renamed from: d */
    final /* synthetic */ C1011n f2549d;

    /* renamed from: e */
    public void mo527e(C1110m mVar, C1099i.C1101b bVar) {
        Bundle bundle;
        if (bVar == C1099i.C1101b.ON_START && (bundle = (Bundle) this.f2549d.f2735j.get(this.f2546a)) != null) {
            this.f2547b.mo3671a(this.f2546a, bundle);
            this.f2549d.mo3616q(this.f2546a);
        }
        if (bVar == C1099i.C1101b.ON_DESTROY) {
            this.f2548c.mo3832c(this);
            this.f2549d.f2736k.remove(this.f2546a);
        }
    }
}
