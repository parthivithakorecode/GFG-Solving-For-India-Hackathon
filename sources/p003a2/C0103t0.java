package p003a2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import p160x1.C4280b;

/* renamed from: a2.t0 */
public final class C0103t0 extends C0081j0 {

    /* renamed from: g */
    public final IBinder f219g;

    /* renamed from: h */
    final /* synthetic */ C0052c f220h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0103t0(C0052c cVar, int i, IBinder iBinder, Bundle bundle) {
        super(cVar, i, bundle);
        this.f220h = cVar;
        this.f219g = iBinder;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo250f() {
        try {
            IBinder iBinder = this.f219g;
            C0092o.m313i(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f220h.mo156D().equals(interfaceDescriptor)) {
                String D = this.f220h.mo156D();
                StringBuilder sb = new StringBuilder(String.valueOf(D).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(D);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                Log.e("GmsClient", sb.toString());
                return false;
            }
            IInterface s = this.f220h.mo188s(this.f219g);
            if (s == null || (!C0052c.m178d0(this.f220h, 2, 4, s) && !C0052c.m178d0(this.f220h, 3, 4, s))) {
                return false;
            }
            C4280b unused = this.f220h.f91E = null;
            Bundle w = this.f220h.mo192w();
            if (this.f220h.f115z == null) {
                return true;
            }
            this.f220h.f115z.mo139C0(w);
            return true;
        } catch (RemoteException unused2) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo251g(C4280b bVar) {
        if (this.f220h.f87A != null) {
            this.f220h.f87A.mo196n0(bVar);
        }
        this.f220h.mo163K(bVar);
    }
}
