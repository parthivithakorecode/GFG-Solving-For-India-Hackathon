package p129s0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p089m0.C3646j;
import p153w0.C4260a;

/* renamed from: s0.f */
public class C4014f extends C4007c<Boolean> {

    /* renamed from: i */
    private static final String f22190i = C3646j.m25231f("StorageNotLowTracker");

    public C4014f(Context context, C4260a aVar) {
        super(context, aVar);
    }

    /* renamed from: g */
    public IntentFilter mo15480g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    /* renamed from: h */
    public void mo15481h(Context context, Intent intent) {
        Boolean bool;
        if (intent.getAction() != null) {
            C3646j.m25229c().mo14806a(f22190i, String.format("Received %s", new Object[]{intent.getAction()}), new Throwable[0]);
            String action = intent.getAction();
            action.hashCode();
            if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                bool = Boolean.FALSE;
            } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                bool = Boolean.TRUE;
            } else {
                return;
            }
            mo15489d(bool);
        }
    }

    /* renamed from: i */
    public Boolean mo15479b() {
        Intent registerReceiver = this.f22178b.registerReceiver((BroadcastReceiver) null, mo15480g());
        if (registerReceiver == null || registerReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = registerReceiver.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return null;
        }
        return Boolean.TRUE;
    }
}
