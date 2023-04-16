package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.C0565k;
import com.google.android.gms.ads.AdService;
import java.util.HashMap;
import java.util.Map;
import p034e2.C2555l;
import p040f1.C2603b;
import p048g2.C2635a;
import p048g2.C2637b;
import p054h1.C2694t;
import p061i1.C2816o;
import p069j1.C3163g2;
import p069j1.C3219x0;

public final class w42 extends mg0 {

    /* renamed from: f */
    private final Context f16701f;

    /* renamed from: g */
    private final wv1 f16702g;

    /* renamed from: h */
    private final oo0 f16703h;

    /* renamed from: i */
    private final o42 f16704i;

    /* renamed from: j */
    private final xw2 f16705j;

    public w42(Context context, o42 o42, oo0 oo0, wv1 wv1, xw2 xw2) {
        this.f16701f = context;
        this.f16702g = wv1;
        this.f16703h = oo0;
        this.f16704i = o42;
        this.f16705j = xw2;
    }

    /* renamed from: A5 */
    public static void m18871A5(Context context, wv1 wv1, xw2 xw2, o42 o42, String str, String str2) {
        m18872B5(context, wv1, xw2, o42, str, str2, new HashMap());
    }

    /* renamed from: B5 */
    public static void m18872B5(Context context, wv1 wv1, xw2 xw2, o42 o42, String str, String str2, Map<String, String> map) {
        String str3;
        String str4 = "offline";
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10592q6)).booleanValue()) {
            ww2 b = ww2.m19233b(str2);
            b.mo11742a("gqi", str);
            C2694t.m21608q();
            if (true == C3163g2.m23934j(context)) {
                str4 = "online";
            }
            b.mo11742a("device_connectivity", str4);
            b.mo11742a("event_timestamp", String.valueOf(C2694t.m21592a().mo12462a()));
            for (Map.Entry next : map.entrySet()) {
                b.mo11742a((String) next.getKey(), (String) next.getValue());
            }
            str3 = xw2.mo5982b(b);
        } else {
            vv1 a = wv1.mo11740a();
            a.mo11533b("gqi", str);
            a.mo11533b("action", str2);
            C2694t.m21608q();
            if (true == C3163g2.m23934j(context)) {
                str4 = "online";
            }
            a.mo11533b("device_connectivity", str4);
            a.mo11533b("event_timestamp", String.valueOf(C2694t.m21592a().mo12462a()));
            for (Map.Entry next2 : map.entrySet()) {
                a.mo11533b((String) next2.getKey(), (String) next2.getValue());
            }
            str3 = a.mo11536e();
        }
        o42.mo9649n(new q42(C2694t.m21592a().mo12462a(), str, str3, 2));
    }

    /* renamed from: C5 */
    public static void m18873C5(Activity activity, C2816o oVar, C3219x0 x0Var, o42 o42, wv1 wv1, xw2 xw2, String str, String str2) {
        C2694t.m21608q();
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, C2694t.m21609r().mo14006k());
        Resources d = C2694t.m21607p().mo11022d();
        o42 o422 = o42;
        String str3 = str;
        wv1 wv12 = wv1;
        Activity activity2 = activity;
        xw2 xw22 = xw2;
        C2816o oVar2 = oVar;
        builder.setTitle(d == null ? "Open ad when you're back online." : d.getString(C2603b.offline_opt_in_title)).setMessage(d == null ? "We'll send you a notification with a link to the advertiser site." : d.getString(C2603b.offline_opt_in_message)).setPositiveButton(d == null ? "OK" : d.getString(C2603b.offline_opt_in_confirm), new t42(wv1, activity, xw2, o42, str, x0Var, str2, d, oVar)).setNegativeButton(d == null ? "No thanks" : d.getString(C2603b.offline_opt_in_decline), new u42(o422, str3, wv12, activity2, xw22, oVar2)).setOnCancelListener(new s42(o422, str3, wv12, activity2, xw22, oVar2));
        builder.create().show();
    }

    /* renamed from: D5 */
    private final void m18874D5(String str, String str2, Map<String, String> map) {
        m18872B5(this.f16701f, this.f16702g, this.f16705j, this.f16704i, str, str2, map);
    }

    /* renamed from: G0 */
    public final void mo8942G0(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            C2694t.m21608q();
            boolean j = C3163g2.m23934j(this.f16701f);
            HashMap hashMap = new HashMap();
            char c = 2;
            if (stringExtra.equals("offline_notification_clicked")) {
                hashMap.put("offline_notification_action", "offline_notification_clicked");
                if (true == j) {
                    c = 1;
                }
                hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Context context = this.f16701f;
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    context.startActivity(launchIntentForPackage);
                    hashMap.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    hashMap.put("olaa", "olaf");
                }
            } else {
                hashMap.put("offline_notification_action", "offline_notification_dismissed");
            }
            m18874D5(stringExtra2, "offline_notification_action", hashMap);
            try {
                SQLiteDatabase writableDatabase = this.f16704i.getWritableDatabase();
                if (c == 1) {
                    this.f16704i.mo9654w(writableDatabase, this.f16703h, stringExtra2);
                } else {
                    o42.m14279B(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e) {
                io0.m11128d("Failed to get writable offline buffering database: ".concat(e.toString()));
            }
        }
    }

    /* renamed from: d */
    public final void mo8943d() {
        this.f16704i.mo9653u(new h42(this.f16703h));
    }

    /* renamed from: e5 */
    public final void mo8944e5(C2635a aVar, String str, String str2) {
        Context context = (Context) C2637b.m21357C0(aVar);
        C2694t.m21608q();
        if (C2555l.m21216j()) {
            NotificationChannel notificationChannel = new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", 2);
            notificationChannel.setShowBadge(false);
            ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        }
        Intent intent = new Intent();
        intent.setClass(context, AdService.class);
        intent.setAction("offline_notification_clicked");
        intent.putExtra("offline_notification_action", "offline_notification_clicked");
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str);
        int i = u33.f15384a;
        PendingIntent a = u33.m17703a(context, 0, intent, i | 1073741824, 0);
        Intent intent2 = new Intent();
        intent2.setClass(context, AdService.class);
        intent2.setAction("offline_notification_dismissed");
        intent2.putExtra("offline_notification_action", "offline_notification_dismissed");
        intent2.putExtra("gws_query_id", str2);
        PendingIntent a2 = u33.m17703a(context, 0, intent2, i | 1073741824, 0);
        Resources d = C2694t.m21607p().mo11022d();
        ((NotificationManager) context.getSystemService("notification")).notify(str2, 54321, new C0565k.C0573e(context, "offline_notification_channel").mo2464s(d == null ? "View the ad you saved when you were offline" : d.getString(C2603b.offline_notification_title)).mo2463r(d == null ? "Tap to open ad" : d.getString(C2603b.offline_notification_text)).mo2457l(true).mo2465t(a2).mo2462q(a).mo2438J(context.getApplicationInfo().icon).mo2449b());
        m18874D5(str2, "offline_notification_impression", new HashMap());
    }
}
