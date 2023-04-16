package p172z1;

import android.util.Log;
import p003a2.C0076i;
import p160x1.C4280b;

/* renamed from: z1.b0 */
final class C4490b0 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C4280b f22947f;

    /* renamed from: g */
    final /* synthetic */ C4493c0 f22948g;

    C4490b0(C4493c0 c0Var, C4280b bVar) {
        this.f22948g = c0Var;
        this.f22947f = bVar;
    }

    public final void run() {
        C4538z zVar = (C4538z) this.f22948g.f22959f.f22976q.get(this.f22948g.f22955b);
        if (zVar != null) {
            if (this.f22947f.mo15846g()) {
                boolean unused = this.f22948g.f22958e = true;
                if (this.f22948g.f22954a.mo185p()) {
                    this.f22948g.m27308h();
                    return;
                }
                try {
                    this.f22948g.f22954a.mo15996n((C0076i) null, this.f22948g.f22954a.mo231c());
                } catch (SecurityException e) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                    this.f22948g.f22954a.mo15989d("Failed to get service from broker.");
                    zVar.mo16206p(new C4280b(10), (Exception) null);
                }
            } else {
                zVar.mo16206p(this.f22947f, (Exception) null);
            }
        }
    }
}
