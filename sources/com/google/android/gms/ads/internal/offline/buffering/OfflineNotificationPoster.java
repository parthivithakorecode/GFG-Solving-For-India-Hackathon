package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.ads.C2125qw;
import com.google.android.gms.internal.ads.ad0;
import com.google.android.gms.internal.ads.ng0;
import p048g2.C2637b;

public class OfflineNotificationPoster extends Worker {

    /* renamed from: l */
    private final ng0 f3708l;

    public OfflineNotificationPoster(@RecentlyNonNull Context context, @RecentlyNonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f3708l = C2125qw.m15896a().mo9874g(context, new ad0());
    }

    @RecentlyNonNull
    public final ListenableWorker.C1229a doWork() {
        try {
            this.f3708l.mo8944e5(C2637b.m21358Z2(getApplicationContext()), getInputData().mo4505i("uri"), getInputData().mo4505i("gws_query_id"));
            return ListenableWorker.C1229a.m4943c();
        } catch (RemoteException unused) {
            return ListenableWorker.C1229a.m4941a();
        }
    }
}
