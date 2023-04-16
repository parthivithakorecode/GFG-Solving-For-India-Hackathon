package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import androidx.work.C1235a;
import androidx.work.C1239b;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.internal.ads.io0;
import p048g2.C2635a;
import p048g2.C2637b;
import p069j1.C3216w0;
import p089m0.C3635b;
import p089m0.C3648k;
import p089m0.C3649l;
import p089m0.C3663t;

public class WorkManagerUtil extends C3216w0 {
    /* renamed from: z5 */
    private static void m5692z5(Context context) {
        try {
            C3663t.m25253e(context.getApplicationContext(), new C1235a.C1237b().mo4500a());
        } catch (IllegalStateException unused) {
        }
    }

    public final void zze(@RecentlyNonNull C2635a aVar) {
        Context context = (Context) C2637b.m21357C0(aVar);
        m5692z5(context);
        try {
            C3663t d = C3663t.m25252d(context);
            d.mo14823a("offline_ping_sender_work");
            d.mo14825c((C3649l) ((C3649l.C3650a) ((C3649l.C3650a) new C3649l.C3650a(OfflinePingSender.class).mo14831e(new C3635b.C3636a().mo14786b(C3648k.CONNECTED).mo14785a())).mo14829a("offline_ping_sender_work")).mo14830b());
        } catch (IllegalStateException e) {
            io0.m11132h("Failed to instantiate WorkManager.", e);
        }
    }

    public final boolean zzf(@RecentlyNonNull C2635a aVar, @RecentlyNonNull String str, @RecentlyNonNull String str2) {
        Context context = (Context) C2637b.m21357C0(aVar);
        m5692z5(context);
        C3635b a = new C3635b.C3636a().mo14786b(C3648k.CONNECTED).mo14785a();
        try {
            C3663t.m25252d(context).mo14825c((C3649l) ((C3649l.C3650a) ((C3649l.C3650a) ((C3649l.C3650a) new C3649l.C3650a(OfflineNotificationPoster.class).mo14831e(a)).mo14832f(new C1239b.C1240a().mo4512e("uri", str).mo4512e("gws_query_id", str2).mo4508a())).mo14829a("offline_notification_work")).mo14830b());
            return true;
        } catch (IllegalStateException e) {
            io0.m11132h("Failed to instantiate WorkManager.", e);
            return false;
        }
    }
}
