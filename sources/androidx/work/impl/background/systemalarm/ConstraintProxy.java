package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.List;
import p089m0.C3635b;
import p089m0.C3646j;
import p089m0.C3648k;
import p141u0.C4108p;

abstract class ConstraintProxy extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f3383a = C3646j.m25231f("ConstraintProxy");

    public static class BatteryChargingProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class NetworkStateProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    ConstraintProxy() {
    }

    /* renamed from: a */
    static void m5043a(Context context, List<C4108p> list) {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        for (C4108p pVar : list) {
            C3635b bVar = pVar.f22323j;
            z |= bVar.mo14772f();
            z2 |= bVar.mo14773g();
            z3 |= bVar.mo14776i();
            z4 |= bVar.mo14767b() != C3648k.f21393f;
            if (z && z2 && z3 && z4) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.m5044a(context, z, z2, z3, z4));
    }

    public void onReceive(Context context, Intent intent) {
        C3646j.m25229c().mo14806a(f3383a, String.format("onReceive : %s", new Object[]{intent}), new Throwable[0]);
        context.startService(C1256b.m5051b(context));
    }
}
