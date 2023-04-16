package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import p089m0.C3646j;
import p096n0.C3756i;
import p147v0.C4173d;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    static final String f3384a = C3646j.m25231f("ConstrntProxyUpdtRecvr");

    /* renamed from: androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver$a */
    class C1254a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Intent f3385f;

        /* renamed from: g */
        final /* synthetic */ Context f3386g;

        /* renamed from: h */
        final /* synthetic */ BroadcastReceiver.PendingResult f3387h;

        C1254a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f3385f = intent;
            this.f3386g = context;
            this.f3387h = pendingResult;
        }

        public void run() {
            try {
                boolean booleanExtra = this.f3385f.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f3385f.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f3385f.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f3385f.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                C3646j.m25229c().mo14806a(ConstraintProxyUpdateReceiver.f3384a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", new Object[]{Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)}), new Throwable[0]);
                C4173d.m26626a(this.f3386g, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                C4173d.m26626a(this.f3386g, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                C4173d.m26626a(this.f3386g, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                C4173d.m26626a(this.f3386g, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f3387h.finish();
            }
        }
    }

    /* renamed from: a */
    public static Intent m5044a(Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
        return intent;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            C3646j.m25229c().mo14806a(f3384a, String.format("Ignoring unknown action %s", new Object[]{action}), new Throwable[0]);
        } else {
            C3756i.m25542k(context).mo14987p().mo15823b(new C1254a(intent, context, goAsync()));
        }
    }
}
