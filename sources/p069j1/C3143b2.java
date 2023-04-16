package p069j1;

import android.net.ConnectivityManager;
import android.net.Network;

/* renamed from: j1.b2 */
final class C3143b2 extends ConnectivityManager.NetworkCallback {
    C3143b2(C3163g2 g2Var) {
    }

    public final void onAvailable(Network network) {
        synchronized (C3163g2.class) {
            C3163g2.f20466j = true;
        }
    }

    public final void onLost(Network network) {
        synchronized (C3163g2.class) {
            C3163g2.f20466j = false;
        }
    }
}
