package p003a2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Map;

/* renamed from: a2.b1 */
final class C0051b1 implements ServiceConnection, C0066e1 {

    /* renamed from: f */
    private final Map<ServiceConnection, ServiceConnection> f78f = new HashMap();

    /* renamed from: g */
    private int f79g = 2;

    /* renamed from: h */
    private boolean f80h;

    /* renamed from: i */
    private IBinder f81i;

    /* renamed from: j */
    private final C0116z0 f82j;

    /* renamed from: k */
    private ComponentName f83k;

    /* renamed from: l */
    final /* synthetic */ C0063d1 f84l;

    public C0051b1(C0063d1 d1Var, C0116z0 z0Var) {
        this.f84l = d1Var;
        this.f82j = z0Var;
    }

    /* renamed from: a */
    public final void mo141a(String str) {
        this.f79g = 3;
        boolean d = this.f84l.f139g.mo12343d(this.f84l.f137e, str, this.f82j.mo299d(this.f84l.f137e), this, this.f82j.mo298c());
        this.f80h = d;
        if (d) {
            this.f84l.f138f.sendMessageDelayed(this.f84l.f138f.obtainMessage(1, this.f82j), this.f84l.f141i);
            return;
        }
        this.f79g = 2;
        try {
            this.f84l.f139g.mo12342c(this.f84l.f137e, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: b */
    public final void mo142b(String str) {
        this.f84l.f138f.removeMessages(1, this.f82j);
        this.f84l.f139g.mo12342c(this.f84l.f137e, this);
        this.f80h = false;
        this.f79g = 2;
    }

    /* renamed from: c */
    public final void mo143c(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f78f.put(serviceConnection, serviceConnection2);
    }

    /* renamed from: d */
    public final void mo144d(ServiceConnection serviceConnection, String str) {
        this.f78f.remove(serviceConnection);
    }

    /* renamed from: e */
    public final boolean mo145e() {
        return this.f80h;
    }

    /* renamed from: f */
    public final int mo146f() {
        return this.f79g;
    }

    /* renamed from: g */
    public final boolean mo147g(ServiceConnection serviceConnection) {
        return this.f78f.containsKey(serviceConnection);
    }

    /* renamed from: h */
    public final boolean mo148h() {
        return this.f78f.isEmpty();
    }

    /* renamed from: i */
    public final IBinder mo149i() {
        return this.f81i;
    }

    /* renamed from: j */
    public final ComponentName mo150j() {
        return this.f83k;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f84l.f136d) {
            this.f84l.f138f.removeMessages(1, this.f82j);
            this.f81i = iBinder;
            this.f83k = componentName;
            for (ServiceConnection onServiceConnected : this.f78f.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f79g = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f84l.f136d) {
            this.f84l.f138f.removeMessages(1, this.f82j);
            this.f81i = null;
            this.f83k = componentName;
            for (ServiceConnection onServiceDisconnected : this.f78f.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f79g = 2;
        }
    }
}
