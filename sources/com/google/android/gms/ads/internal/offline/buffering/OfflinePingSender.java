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

public class OfflinePingSender extends Worker {

    /* renamed from: l */
    private final ng0 f3709l;

    public OfflinePingSender(@RecentlyNonNull Context context, @RecentlyNonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f3709l = C2125qw.m15896a().mo9874g(context, new ad0());
    }

    @RecentlyNonNull
    public final ListenableWorker.C1229a doWork() {
        try {
            this.f3709l.mo8943d();
            return ListenableWorker.C1229a.m4943c();
        } catch (RemoteException unused) {
            return ListenableWorker.C1229a.m4941a();
        }
    }
}
