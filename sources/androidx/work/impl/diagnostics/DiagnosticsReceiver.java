package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import p089m0.C3646j;
import p089m0.C3649l;
import p089m0.C3663t;

public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f3434a = C3646j.m25231f("DiagnosticsRcvr");

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            C3646j.m25229c().mo14806a(f3434a, "Requesting diagnostics", new Throwable[0]);
            try {
                C3663t.m25252d(context).mo14825c(C3649l.m25242d(DiagnosticsWorker.class));
            } catch (IllegalStateException e) {
                C3646j.m25229c().mo14807b(f3434a, "WorkManager is not initialized", e);
            }
        }
    }
}
