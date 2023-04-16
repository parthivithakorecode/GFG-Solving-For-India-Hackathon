package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import p089m0.C3646j;
import p096n0.C3756i;

public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f3389a = C3646j.m25231f("RescheduleReceiver");

    public void onReceive(Context context, Intent intent) {
        C3646j.m25229c().mo14806a(f3389a, String.format("Received intent %s", new Object[]{intent}), new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                C3756i.m25542k(context).mo14990t(goAsync());
            } catch (IllegalStateException e) {
                C3646j.m25229c().mo14807b(f3389a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
        } else {
            context.startService(C1256b.m5054e(context));
        }
    }
}
