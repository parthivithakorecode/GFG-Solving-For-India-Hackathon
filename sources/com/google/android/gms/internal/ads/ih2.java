package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.ArrayList;
import p069j1.C3208t1;

public final class ih2 implements ij2<jh2> {

    /* renamed from: a */
    private final dc3 f8654a;

    /* renamed from: b */
    private final ks2 f8655b;

    /* renamed from: c */
    private final PackageInfo f8656c;

    /* renamed from: d */
    private final C3208t1 f8657d;

    public ih2(dc3 dc3, ks2 ks2, PackageInfo packageInfo, C3208t1 t1Var) {
        this.f8654a = dc3;
        this.f8655b = ks2;
        this.f8656c = packageInfo;
        this.f8657d = t1Var;
    }

    /* renamed from: b */
    public static /* synthetic */ jh2 m11033b(ih2 ih2) {
        ArrayList<String> arrayList = ih2.f8655b.f9642g;
        return arrayList == null ? fh2.f6824a : arrayList.isEmpty() ? gh2.f7489a : new eh2(ih2, arrayList);
    }

    /* renamed from: a */
    public final cc3<jh2> mo5813a() {
        return this.f8654a.mo6445C(new hh2(this));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e2, code lost:
        if (r9 == 3) goto L_0x0107;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo8145c(java.util.ArrayList r9, android.os.Bundle r10) {
        /*
            r8 = this;
            java.lang.String r0 = "native_version"
            r1 = 3
            r10.putInt(r0, r1)
            java.lang.String r0 = "native_templates"
            r10.putStringArrayList(r0, r9)
            com.google.android.gms.internal.ads.ks2 r9 = r8.f8655b
            java.util.ArrayList<java.lang.String> r9 = r9.f9643h
            java.lang.String r0 = "native_custom_templates"
            r10.putStringArrayList(r0, r9)
            com.google.android.gms.internal.ads.ks2 r9 = r8.f8655b
            com.google.android.gms.internal.ads.b40 r9 = r9.f9644i
            int r9 = r9.f4681f
            java.lang.String r0 = "landscape"
            java.lang.String r2 = "portrait"
            java.lang.String r3 = "any"
            java.lang.String r4 = "unknown"
            r5 = 2
            r6 = 1
            if (r9 <= r1) goto L_0x004f
            java.lang.String r9 = "enable_native_media_orientation"
            r10.putBoolean(r9, r6)
            com.google.android.gms.internal.ads.ks2 r9 = r8.f8655b
            com.google.android.gms.internal.ads.b40 r9 = r9.f9644i
            int r9 = r9.f4688m
            if (r9 == r6) goto L_0x0043
            if (r9 == r5) goto L_0x0041
            if (r9 == r1) goto L_0x003f
            r7 = 4
            if (r9 == r7) goto L_0x003c
            r9 = r4
            goto L_0x0044
        L_0x003c:
            java.lang.String r9 = "square"
            goto L_0x0044
        L_0x003f:
            r9 = r2
            goto L_0x0044
        L_0x0041:
            r9 = r0
            goto L_0x0044
        L_0x0043:
            r9 = r3
        L_0x0044:
            boolean r7 = r4.equals(r9)
            if (r7 != 0) goto L_0x004f
            java.lang.String r7 = "native_media_orientation"
            r10.putString(r7, r9)
        L_0x004f:
            com.google.android.gms.internal.ads.ks2 r9 = r8.f8655b
            com.google.android.gms.internal.ads.b40 r9 = r9.f9644i
            int r9 = r9.f4683h
            if (r9 == 0) goto L_0x005f
            if (r9 == r6) goto L_0x005d
            if (r9 == r5) goto L_0x0060
            r0 = r4
            goto L_0x0060
        L_0x005d:
            r0 = r2
            goto L_0x0060
        L_0x005f:
            r0 = r3
        L_0x0060:
            boolean r9 = r4.equals(r0)
            if (r9 != 0) goto L_0x006b
            java.lang.String r9 = "native_image_orientation"
            r10.putString(r9, r0)
        L_0x006b:
            com.google.android.gms.internal.ads.ks2 r9 = r8.f8655b
            com.google.android.gms.internal.ads.b40 r9 = r9.f9644i
            boolean r9 = r9.f4684i
            java.lang.String r0 = "native_multiple_images"
            r10.putBoolean(r0, r9)
            com.google.android.gms.internal.ads.ks2 r9 = r8.f8655b
            com.google.android.gms.internal.ads.b40 r9 = r9.f9644i
            boolean r9 = r9.f4687l
            java.lang.String r0 = "use_custom_mute"
            r10.putBoolean(r0, r9)
            android.content.pm.PackageInfo r9 = r8.f8656c
            if (r9 != 0) goto L_0x0087
            r9 = 0
            goto L_0x0089
        L_0x0087:
            int r9 = r9.versionCode
        L_0x0089:
            j1.t1 r0 = r8.f8657d
            int r0 = r0.zza()
            if (r9 <= r0) goto L_0x009b
            j1.t1 r0 = r8.f8657d
            r0.mo14097r()
            j1.t1 r0 = r8.f8657d
            r0.mo14074F(r9)
        L_0x009b:
            j1.t1 r9 = r8.f8657d
            org.json.JSONObject r9 = r9.mo14092m()
            r0 = 0
            if (r9 == 0) goto L_0x00b2
            com.google.android.gms.internal.ads.ks2 r2 = r8.f8655b
            java.lang.String r2 = r2.f9641f
            org.json.JSONArray r9 = r9.optJSONArray(r2)
            if (r9 == 0) goto L_0x00b2
            java.lang.String r0 = r9.toString()
        L_0x00b2:
            boolean r9 = android.text.TextUtils.isEmpty(r0)
            if (r9 != 0) goto L_0x00bd
            java.lang.String r9 = "native_advanced_settings"
            r10.putString(r9, r0)
        L_0x00bd:
            com.google.android.gms.internal.ads.ks2 r9 = r8.f8655b
            int r9 = r9.f9646k
            if (r9 <= r6) goto L_0x00c8
            java.lang.String r0 = "max_num_ads"
            r10.putInt(r0, r9)
        L_0x00c8:
            com.google.android.gms.internal.ads.ks2 r9 = r8.f8655b
            com.google.android.gms.internal.ads.r90 r9 = r9.f9637b
            if (r9 == 0) goto L_0x0119
            java.lang.String r0 = r9.f13554h
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x010d
            int r0 = r9.f13552f
            java.lang.String r2 = "p"
            java.lang.String r3 = "l"
            if (r0 < r5) goto L_0x00e5
            int r9 = r9.f13555i
            if (r9 == r5) goto L_0x0106
            if (r9 == r1) goto L_0x0107
            goto L_0x0106
        L_0x00e5:
            int r9 = r9.f13553g
            if (r9 == r6) goto L_0x0106
            if (r9 == r5) goto L_0x0107
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 52
            r0.<init>(r1)
            java.lang.String r1 = "Instream ad video aspect ratio "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = " is wrong."
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            com.google.android.gms.internal.ads.io0.m11128d(r9)
        L_0x0106:
            r2 = r3
        L_0x0107:
            java.lang.String r9 = "ia_var"
            r10.putString(r9, r2)
            goto L_0x0114
        L_0x010d:
            java.lang.String r9 = r9.f13554h
            java.lang.String r0 = "ad_tag"
            r10.putString(r0, r9)
        L_0x0114:
            java.lang.String r9 = "instr"
            r10.putBoolean(r9, r6)
        L_0x0119:
            com.google.android.gms.internal.ads.ks2 r9 = r8.f8655b
            com.google.android.gms.internal.ads.b60 r9 = r9.mo8784a()
            if (r9 == 0) goto L_0x0126
            java.lang.String r9 = "has_delayed_banner_listener"
            r10.putBoolean(r9, r6)
        L_0x0126:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ih2.mo8145c(java.util.ArrayList, android.os.Bundle):void");
    }
}
