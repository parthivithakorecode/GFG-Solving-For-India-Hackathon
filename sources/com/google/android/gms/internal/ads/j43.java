package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

final class j43 extends BroadcastReceiver implements Runnable {

    /* renamed from: f */
    private final k53 f8980f;

    /* renamed from: g */
    private final Handler f8981g;

    /* renamed from: h */
    final /* synthetic */ l63 f8982h;

    public j43(l63 l63, Handler handler, k53 k53) {
        this.f8982h = l63;
        this.f8981g = handler;
        this.f8980f = k53;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f8981g.post(this);
        }
    }

    public final void run() {
    }
}
