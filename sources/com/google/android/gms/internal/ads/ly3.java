package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class ly3 extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ ny3 f10210a;

    /* synthetic */ ly3(ny3 ny3, ky3 ky3) {
        this.f10210a = ny3;
    }

    public final void onReceive(Context context, Intent intent) {
        this.f10210a.f11770b.post(new jy3(this.f10210a));
    }
}
