package p003a2;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* renamed from: a2.r0 */
public final class C0099r0 extends C0084k0 {

    /* renamed from: f */
    private C0052c f215f;

    /* renamed from: g */
    private final int f216g;

    public C0099r0(C0052c cVar, int i) {
        this.f215f = cVar;
        this.f216g = i;
    }

    /* renamed from: q5 */
    public final void mo254q5(int i, IBinder iBinder, C0108v0 v0Var) {
        C0052c cVar = this.f215f;
        C0092o.m314j(cVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        C0092o.m313i(v0Var);
        C0052c.m181g0(cVar, v0Var);
        mo255v5(i, iBinder, v0Var.f225f);
    }

    /* renamed from: v5 */
    public final void mo255v5(int i, IBinder iBinder, Bundle bundle) {
        C0092o.m314j(this.f215f, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f215f.mo165M(i, iBinder, bundle, this.f216g);
        this.f215f = null;
    }

    /* renamed from: z3 */
    public final void mo256z3(int i, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }
}
