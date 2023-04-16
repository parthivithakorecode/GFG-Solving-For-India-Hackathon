package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: com.google.android.gms.internal.ads.zb */
public final class C2438zb extends BroadcastReceiver {

    /* renamed from: a */
    private boolean f18141a = true;

    C2438zb(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.registerReceiver(this, intentFilter);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo12197a() {
        return this.f18141a;
    }

    public final void onReceive(Context context, Intent intent) {
        boolean z;
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            z = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            z = false;
        } else {
            return;
        }
        this.f18141a = z;
    }
}
