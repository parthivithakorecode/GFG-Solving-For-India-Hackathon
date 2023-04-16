package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import p034e2.C2555l;
import p054h1.C2694t;

public final class zi0 {

    /* renamed from: A */
    private int f18228A;

    /* renamed from: B */
    private final String f18229B;

    /* renamed from: C */
    private boolean f18230C;

    /* renamed from: a */
    private int f18231a;

    /* renamed from: b */
    private boolean f18232b;

    /* renamed from: c */
    private boolean f18233c;

    /* renamed from: d */
    private int f18234d;

    /* renamed from: e */
    private int f18235e;

    /* renamed from: f */
    private int f18236f;

    /* renamed from: g */
    private String f18237g;

    /* renamed from: h */
    private int f18238h;

    /* renamed from: i */
    private int f18239i;

    /* renamed from: j */
    private int f18240j;

    /* renamed from: k */
    private boolean f18241k;

    /* renamed from: l */
    private int f18242l;

    /* renamed from: m */
    private double f18243m;

    /* renamed from: n */
    private boolean f18244n;

    /* renamed from: o */
    private String f18245o;

    /* renamed from: p */
    private String f18246p;

    /* renamed from: q */
    private final boolean f18247q;

    /* renamed from: r */
    private final boolean f18248r;

    /* renamed from: s */
    private final String f18249s;

    /* renamed from: t */
    private final boolean f18250t;

    /* renamed from: u */
    private final boolean f18251u;

    /* renamed from: v */
    private final boolean f18252v;

    /* renamed from: w */
    private final String f18253w;

    /* renamed from: x */
    private final String f18254x;

    /* renamed from: y */
    private float f18255y;

    /* renamed from: z */
    private int f18256z;

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a1 A[Catch:{ Exception -> 0x00c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zi0(android.content.Context r7) {
        /*
            r6 = this;
            r6.<init>()
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            r6.m20688c(r7)
            r6.m20690e(r7)
            r6.m20689d(r7)
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r2 = "geo:0,0?q=donuts"
            android.content.pm.ResolveInfo r2 = m20687b(r0, r2)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0020
            r2 = r3
            goto L_0x0021
        L_0x0020:
            r2 = r4
        L_0x0021:
            r6.f18247q = r2
            java.lang.String r2 = "http://www.google.com"
            android.content.pm.ResolveInfo r2 = m20687b(r0, r2)
            if (r2 == 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r3 = r4
        L_0x002d:
            r6.f18248r = r3
            java.lang.String r2 = r1.getCountry()
            r6.f18249s = r2
            p054h1.C2694t.m21608q()
            com.google.android.gms.internal.ads.C2125qw.m15897b()
            boolean r2 = com.google.android.gms.internal.ads.bo0.m6989m()
            r6.f18250t = r2
            boolean r2 = p034e2.C2551h.m21193c(r7)
            r6.f18251u = r2
            boolean r2 = p034e2.C2551h.m21194d(r7)
            r6.f18252v = r2
            java.lang.String r1 = r1.getLanguage()
            r6.f18253w = r1
            java.lang.String r1 = "market://details?id=com.google.android.gms.ads"
            android.content.pm.ResolveInfo r0 = m20687b(r0, r1)
            java.lang.String r1 = "."
            r2 = 0
            if (r0 != 0) goto L_0x0060
        L_0x005e:
            r0 = r2
            goto L_0x0091
        L_0x0060:
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            if (r0 != 0) goto L_0x0065
            goto L_0x005e
        L_0x0065:
            f2.b r3 = p041f2.C2606c.m21299a(r7)     // Catch:{ NameNotFoundException -> 0x005e }
            java.lang.String r5 = r0.packageName     // Catch:{ NameNotFoundException -> 0x005e }
            android.content.pm.PackageInfo r3 = r3.mo12496f(r5, r4)     // Catch:{ NameNotFoundException -> 0x005e }
            if (r3 == 0) goto L_0x005e
            int r3 = r3.versionCode     // Catch:{ NameNotFoundException -> 0x005e }
            java.lang.String r0 = r0.packageName     // Catch:{ NameNotFoundException -> 0x005e }
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ NameNotFoundException -> 0x005e }
            int r4 = r4.length()     // Catch:{ NameNotFoundException -> 0x005e }
            int r4 = r4 + 12
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x005e }
            r5.<init>(r4)     // Catch:{ NameNotFoundException -> 0x005e }
            r5.append(r3)     // Catch:{ NameNotFoundException -> 0x005e }
            r5.append(r1)     // Catch:{ NameNotFoundException -> 0x005e }
            r5.append(r0)     // Catch:{ NameNotFoundException -> 0x005e }
            java.lang.String r0 = r5.toString()     // Catch:{ NameNotFoundException -> 0x005e }
        L_0x0091:
            r6.f18254x = r0
            f2.b r0 = p041f2.C2606c.m21299a(r7)     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r3 = "com.android.vending"
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r0 = r0.mo12496f(r3, r4)     // Catch:{ Exception -> 0x00c1 }
            if (r0 == 0) goto L_0x00c1
            int r3 = r0.versionCode     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r0 = r0.packageName     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x00c1 }
            int r4 = r4.length()     // Catch:{ Exception -> 0x00c1 }
            int r4 = r4 + 12
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c1 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x00c1 }
            r5.append(r3)     // Catch:{ Exception -> 0x00c1 }
            r5.append(r1)     // Catch:{ Exception -> 0x00c1 }
            r5.append(r0)     // Catch:{ Exception -> 0x00c1 }
            java.lang.String r2 = r5.toString()     // Catch:{ Exception -> 0x00c1 }
        L_0x00c1:
            r6.f18229B = r2
            android.content.res.Resources r7 = r7.getResources()
            if (r7 != 0) goto L_0x00ca
            return
        L_0x00ca:
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            if (r7 != 0) goto L_0x00d1
            return
        L_0x00d1:
            float r0 = r7.density
            r6.f18255y = r0
            int r0 = r7.widthPixels
            r6.f18256z = r0
            int r7 = r7.heightPixels
            r6.f18228A = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zi0.<init>(android.content.Context):void");
    }

    public zi0(Context context, aj0 aj0) {
        m20688c(context);
        m20690e(context);
        m20689d(context);
        this.f18245o = Build.FINGERPRINT;
        this.f18246p = Build.DEVICE;
        boolean z = false;
        if (C2555l.m21207a() && l20.m12506g(context)) {
            z = true;
        }
        this.f18230C = z;
        this.f18247q = aj0.f4209a;
        this.f18248r = aj0.f4210b;
        this.f18249s = aj0.f4212d;
        this.f18250t = aj0.f4213e;
        this.f18251u = aj0.f4214f;
        this.f18252v = aj0.f4215g;
        this.f18253w = aj0.f4216h;
        this.f18254x = aj0.f4217i;
        this.f18229B = aj0.f4218j;
        this.f18255y = aj0.f4221m;
        this.f18256z = aj0.f4222n;
        this.f18228A = aj0.f4223o;
    }

    /* renamed from: b */
    private static ResolveInfo m20687b(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            C2694t.m21607p().mo11034s(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    /* renamed from: c */
    private final void m20688c(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.f18231a = audioManager.getMode();
                this.f18232b = audioManager.isMusicActive();
                this.f18233c = audioManager.isSpeakerphoneOn();
                this.f18234d = audioManager.getStreamVolume(3);
                this.f18235e = audioManager.getRingerMode();
                this.f18236f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                C2694t.m21607p().mo11034s(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f18231a = -2;
        this.f18232b = false;
        this.f18233c = false;
        this.f18234d = 0;
        this.f18235e = 2;
        this.f18236f = 0;
    }

    /* renamed from: d */
    private final void m20689d(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            this.f18243m = (double) (((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
            this.f18244n = z;
            return;
        }
        this.f18243m = -1.0d;
        this.f18244n = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0050  */
    @android.annotation.TargetApi(16)
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m20690e(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r6.getSystemService(r1)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            java.lang.String r2 = r0.getNetworkOperator()
            r5.f18237g = r2
            boolean r2 = p034e2.C2555l.m21217k()
            r3 = 0
            if (r2 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r2 = com.google.android.gms.internal.ads.m10.f10547l6
            com.google.android.gms.internal.ads.k10 r4 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r2 = r4.mo8579b(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0031
            r2 = r3
            goto L_0x0035
        L_0x0031:
            int r2 = r0.getNetworkType()
        L_0x0035:
            r5.f18239i = r2
            int r0 = r0.getPhoneType()
            r5.f18240j = r0
            r0 = -2
            r5.f18238h = r0
            r5.f18241k = r3
            r0 = -1
            r5.f18242l = r0
            p054h1.C2694t.m21608q()
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r6 = p069j1.C3163g2.m23927f(r6, r2)
            if (r6 == 0) goto L_0x006f
            android.net.NetworkInfo r6 = r1.getActiveNetworkInfo()
            if (r6 == 0) goto L_0x0067
            int r0 = r6.getType()
            r5.f18238h = r0
            android.net.NetworkInfo$DetailedState r6 = r6.getDetailedState()
            int r6 = r6.ordinal()
            r5.f18242l = r6
            goto L_0x0069
        L_0x0067:
            r5.f18238h = r0
        L_0x0069:
            boolean r6 = r1.isActiveNetworkMetered()
            r5.f18241k = r6
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zi0.m20690e(android.content.Context):void");
    }

    /* renamed from: a */
    public final aj0 mo12227a() {
        return new aj0(this.f18231a, this.f18247q, this.f18248r, this.f18237g, this.f18249s, this.f18250t, this.f18251u, this.f18252v, this.f18232b, this.f18233c, this.f18253w, this.f18254x, this.f18229B, this.f18234d, this.f18238h, this.f18239i, this.f18240j, this.f18235e, this.f18236f, this.f18255y, this.f18256z, this.f18228A, this.f18243m, this.f18244n, this.f18241k, this.f18242l, this.f18245o, this.f18230C, this.f18246p);
    }
}
