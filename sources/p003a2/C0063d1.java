package p003a2;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import java.util.HashMap;
import javax.annotation.concurrent.GuardedBy;
import p027d2.C2487a;
import p077k2.C3301d;

/* renamed from: a2.d1 */
final class C0063d1 extends C0073h {
    /* access modifiers changed from: private */
    @GuardedBy("connectionStatus")

    /* renamed from: d */
    public final HashMap<C0116z0, C0051b1> f136d = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Context f137e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Handler f138f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C2487a f139g;

    /* renamed from: h */
    private final long f140h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final long f141i;

    C0063d1(Context context) {
        this.f137e = context.getApplicationContext();
        this.f138f = new C3301d(context.getMainLooper(), new C0059c1(this, (C0048a1) null));
        this.f139g = C2487a.m20969b();
        this.f140h = 5000;
        this.f141i = 300000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo217d(C0116z0 z0Var, ServiceConnection serviceConnection, String str) {
        boolean e;
        C0092o.m314j(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f136d) {
            C0051b1 b1Var = this.f136d.get(z0Var);
            if (b1Var == null) {
                b1Var = new C0051b1(this, z0Var);
                b1Var.mo143c(serviceConnection, serviceConnection, str);
                b1Var.mo141a(str);
                this.f136d.put(z0Var, b1Var);
            } else {
                this.f138f.removeMessages(0, z0Var);
                if (!b1Var.mo147g(serviceConnection)) {
                    b1Var.mo143c(serviceConnection, serviceConnection, str);
                    int f = b1Var.mo146f();
                    if (f == 1) {
                        serviceConnection.onServiceConnected(b1Var.mo150j(), b1Var.mo149i());
                    } else if (f == 2) {
                        b1Var.mo141a(str);
                    }
                } else {
                    String valueOf = String.valueOf(z0Var);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            e = b1Var.mo145e();
        }
        return e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo218e(C0116z0 z0Var, ServiceConnection serviceConnection, String str) {
        C0092o.m314j(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f136d) {
            C0051b1 b1Var = this.f136d.get(z0Var);
            if (b1Var == null) {
                String valueOf = String.valueOf(z0Var);
                StringBuilder sb = new StringBuilder(valueOf.length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (b1Var.mo147g(serviceConnection)) {
                b1Var.mo144d(serviceConnection, str);
                if (b1Var.mo148h()) {
                    this.f138f.sendMessageDelayed(this.f138f.obtainMessage(0, z0Var), this.f140h);
                }
            } else {
                String valueOf2 = String.valueOf(z0Var);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }
}
