package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.C2125qw;
import com.google.android.gms.internal.ads.ad0;
import com.google.android.gms.internal.ads.io0;

public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    /* access modifiers changed from: protected */
    public final void onHandleIntent(@RecentlyNonNull Intent intent) {
        try {
            C2125qw.m15896a().mo9874g(this, new ad0()).mo8942G0(intent);
        } catch (RemoteException e) {
            io0.m11128d("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }
}
