package p129s0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p089m0.C3646j;
import p153w0.C4260a;

/* renamed from: s0.b */
public class C4006b extends C4007c<Boolean> {

    /* renamed from: i */
    private static final String f22172i = C3646j.m25231f("BatteryNotLowTracker");

    public C4006b(Context context, C4260a aVar) {
        super(context, aVar);
    }

    /* renamed from: g */
    public IntentFilter mo15480g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    /* renamed from: h */
    public void mo15481h(Context context, Intent intent) {
        Boolean bool;
        if (intent.getAction() != null) {
            C3646j.m25229c().mo14806a(f22172i, String.format("Received %s", new Object[]{intent.getAction()}), new Throwable[0]);
            String action = intent.getAction();
            action.hashCode();
            if (action.equals("android.intent.action.BATTERY_OKAY")) {
                bool = Boolean.TRUE;
            } else if (action.equals("android.intent.action.BATTERY_LOW")) {
                bool = Boolean.FALSE;
            } else {
                return;
            }
            mo15489d(bool);
        }
    }

    /* renamed from: i */
    public Boolean mo15479b() {
        Intent registerReceiver = this.f22178b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            C3646j.m25229c().mo14807b(f22172i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        float intExtra2 = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
        if (intExtra == 1 || intExtra2 > 0.15f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
