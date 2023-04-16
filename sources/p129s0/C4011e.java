package p129s0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.core.net.C0672a;
import p089m0.C3646j;
import p117q0.C3937b;
import p153w0.C4260a;

/* renamed from: s0.e */
public class C4011e extends C4009d<C3937b> {

    /* renamed from: j */
    static final String f22184j = C3646j.m25231f("NetworkStateTracker");

    /* renamed from: g */
    private final ConnectivityManager f22185g = ((ConnectivityManager) this.f22178b.getSystemService("connectivity"));

    /* renamed from: h */
    private C4013b f22186h;

    /* renamed from: i */
    private C4012a f22187i;

    /* renamed from: s0.e$a */
    private class C4012a extends BroadcastReceiver {
        C4012a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                C3646j.m25229c().mo14806a(C4011e.f22184j, "Network broadcast received", new Throwable[0]);
                C4011e eVar = C4011e.this;
                eVar.mo15489d(eVar.mo15491g());
            }
        }
    }

    /* renamed from: s0.e$b */
    private class C4013b extends ConnectivityManager.NetworkCallback {
        C4013b() {
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            C3646j.m25229c().mo14806a(C4011e.f22184j, String.format("Network capabilities changed: %s", new Object[]{networkCapabilities}), new Throwable[0]);
            C4011e eVar = C4011e.this;
            eVar.mo15489d(eVar.mo15491g());
        }

        public void onLost(Network network) {
            C3646j.m25229c().mo14806a(C4011e.f22184j, "Network connection lost", new Throwable[0]);
            C4011e eVar = C4011e.this;
            eVar.mo15489d(eVar.mo15491g());
        }
    }

    public C4011e(Context context, C4260a aVar) {
        super(context, aVar);
        if (m26278j()) {
            this.f22186h = new C4013b();
        } else {
            this.f22187i = new C4012a();
        }
    }

    /* renamed from: j */
    private static boolean m26278j() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* renamed from: e */
    public void mo15484e() {
        if (m26278j()) {
            try {
                C3646j.m25229c().mo14806a(f22184j, "Registering network callback", new Throwable[0]);
                this.f22185g.registerDefaultNetworkCallback(this.f22186h);
            } catch (IllegalArgumentException | SecurityException e) {
                C3646j.m25229c().mo14807b(f22184j, "Received exception while registering network callback", e);
            }
        } else {
            C3646j.m25229c().mo14806a(f22184j, "Registering broadcast receiver", new Throwable[0]);
            this.f22178b.registerReceiver(this.f22187i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    /* renamed from: f */
    public void mo15485f() {
        if (m26278j()) {
            try {
                C3646j.m25229c().mo14806a(f22184j, "Unregistering network callback", new Throwable[0]);
                this.f22185g.unregisterNetworkCallback(this.f22186h);
            } catch (IllegalArgumentException | SecurityException e) {
                C3646j.m25229c().mo14807b(f22184j, "Received exception while unregistering network callback", e);
            }
        } else {
            C3646j.m25229c().mo14806a(f22184j, "Unregistering broadcast receiver", new Throwable[0]);
            this.f22178b.unregisterReceiver(this.f22187i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C3937b mo15491g() {
        NetworkInfo activeNetworkInfo = this.f22185g.getActiveNetworkInfo();
        boolean z = true;
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean i = mo15493i();
        boolean a = C0672a.m2805a(this.f22185g);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            z = false;
        }
        return new C3937b(z2, i, a, z);
    }

    /* renamed from: h */
    public C3937b mo15479b() {
        return mo15491g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo15493i() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = this.f22185g.getNetworkCapabilities(this.f22185g.getActiveNetwork());
            return networkCapabilities != null && networkCapabilities.hasCapability(16);
        } catch (SecurityException e) {
            C3646j.m25229c().mo14807b(f22184j, "Unable to validate active network", e);
            return false;
        }
    }
}
