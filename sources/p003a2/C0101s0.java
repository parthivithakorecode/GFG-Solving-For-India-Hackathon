package p003a2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: a2.s0 */
public final class C0101s0 implements ServiceConnection {

    /* renamed from: f */
    private final int f217f;

    /* renamed from: g */
    final /* synthetic */ C0052c f218g;

    public C0101s0(C0052c cVar, int i) {
        this.f218g = cVar;
        this.f217f = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C0052c cVar = this.f218g;
        if (iBinder == null) {
            C0052c.m169U(cVar, 16);
            return;
        }
        synchronized (cVar.f108s) {
            C0052c cVar2 = this.f218g;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            C0085l unused = cVar2.f109t = (queryLocalInterface == null || !(queryLocalInterface instanceof C0085l)) ? new C0086l0(iBinder) : (C0085l) queryLocalInterface;
        }
        this.f218g.mo172T(0, (Bundle) null, this.f217f);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f218g.f108s) {
            C0085l unused = this.f218g.f109t = null;
        }
        Handler handler = this.f218g.f106q;
        handler.sendMessage(handler.obtainMessage(6, this.f217f, 1));
    }
}
