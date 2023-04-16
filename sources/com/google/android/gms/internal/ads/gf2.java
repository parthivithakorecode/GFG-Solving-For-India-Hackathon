package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public final class gf2 implements ij2<hf2> {

    /* renamed from: a */
    private final dc3 f7413a;

    /* renamed from: b */
    private final Context f7414b;

    public gf2(dc3 dc3, Context context) {
        this.f7413a = dc3;
        this.f7414b = context;
    }

    /* renamed from: a */
    public final cc3<hf2> mo5813a() {
        return this.f7413a.mo6445C(new ff2(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ hf2 mo7616b() {
        double d;
        Intent registerReceiver = this.f7414b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            d = ((double) registerReceiver.getIntExtra("level", -1)) / ((double) registerReceiver.getIntExtra("scale", -1));
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
        } else {
            d = -1.0d;
        }
        return new hf2(d, z);
    }
}
