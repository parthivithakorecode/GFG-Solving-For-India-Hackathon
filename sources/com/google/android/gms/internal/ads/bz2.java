package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class bz2 extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ cz2 f5209a;

    bz2(cz2 cz2) {
        this.f5209a = cz2;
    }

    public final void onReceive(Context context, Intent intent) {
        KeyguardManager keyguardManager;
        if (intent != null) {
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                cz2.m7668b(this.f5209a, true);
            } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                cz2.m7668b(this.f5209a, false);
            } else if ("android.intent.action.SCREEN_ON".equals(intent.getAction()) && (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) != null && !keyguardManager.inKeyguardRestrictedInputMode()) {
                cz2.m7668b(this.f5209a, false);
            }
        }
    }
}
