package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import p002a1.C0024h;
import p013b2.C1298a;
import p013b2.C1301c;

/* renamed from: com.google.android.gms.internal.ads.pv */
public final class C2087pv extends C1298a {
    public static final Parcelable.Creator<C2087pv> CREATOR = new C2124qv();

    /* renamed from: f */
    public final String f12804f;

    /* renamed from: g */
    public final int f12805g;

    /* renamed from: h */
    public final int f12806h;

    /* renamed from: i */
    public final boolean f12807i;

    /* renamed from: j */
    public final int f12808j;

    /* renamed from: k */
    public final int f12809k;

    /* renamed from: l */
    public final C2087pv[] f12810l;

    /* renamed from: m */
    public final boolean f12811m;

    /* renamed from: n */
    public final boolean f12812n;

    /* renamed from: o */
    public boolean f12813o;

    /* renamed from: p */
    public boolean f12814p;

    /* renamed from: q */
    public boolean f12815q;

    /* renamed from: r */
    public boolean f12816r;

    /* renamed from: s */
    public boolean f12817s;

    /* renamed from: t */
    public boolean f12818t;

    public C2087pv() {
        this("interstitial_mb", 0, 0, true, 0, 0, (C2087pv[]) null, false, false, false, false, false, false, false, false);
    }

    public C2087pv(Context context, C0024h hVar) {
        this(context, new C0024h[]{hVar});
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2087pv(android.content.Context r13, p002a1.C0024h[] r14) {
        /*
            r12 = this;
            r12.<init>()
            r0 = 0
            r1 = r14[r0]
            r12.f12807i = r0
            boolean r2 = r1.mo62l()
            r12.f12812n = r2
            boolean r3 = p002a1.C0044y.m150f(r1)
            r12.f12816r = r3
            boolean r3 = p002a1.C0044y.m151g(r1)
            r12.f12817s = r3
            boolean r3 = p002a1.C0044y.m152h(r1)
            r12.f12818t = r3
            if (r2 == 0) goto L_0x0031
            a1.h r2 = p002a1.C0024h.f25i
            int r3 = r2.mo60j()
            r12.f12808j = r3
            int r2 = r2.mo56c()
        L_0x002e:
            r12.f12805g = r2
            goto L_0x0052
        L_0x0031:
            boolean r2 = r12.f12817s
            if (r2 == 0) goto L_0x0040
            int r2 = r1.mo60j()
            r12.f12808j = r2
            int r2 = p002a1.C0044y.m145a(r1)
            goto L_0x002e
        L_0x0040:
            int r2 = r1.mo60j()
            r12.f12808j = r2
            if (r3 == 0) goto L_0x004d
            int r2 = p002a1.C0044y.m146b(r1)
            goto L_0x002e
        L_0x004d:
            int r2 = r1.mo56c()
            goto L_0x002e
        L_0x0052:
            int r3 = r12.f12808j
            android.content.res.Resources r4 = r13.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            r5 = -1
            if (r3 != r5) goto L_0x0123
            com.google.android.gms.internal.ads.C2125qw.m15897b()
            android.content.res.Resources r6 = r13.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r6 = r6.orientation
            r7 = 2
            if (r6 == r7) goto L_0x0071
            goto L_0x010b
        L_0x0071:
            android.content.res.Resources r6 = r13.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            int r7 = r6.heightPixels
            float r7 = (float) r7
            float r6 = r6.density
            float r7 = r7 / r6
            int r6 = (int) r7
            r7 = 600(0x258, float:8.41E-43)
            if (r6 >= r7) goto L_0x010b
            com.google.android.gms.internal.ads.C2125qw.m15897b()
            android.content.res.Resources r6 = r13.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            java.lang.String r7 = "window"
            java.lang.Object r7 = r13.getSystemService(r7)
            android.view.WindowManager r7 = (android.view.WindowManager) r7
            if (r7 == 0) goto L_0x010b
            android.view.Display r7 = r7.getDefaultDisplay()
            boolean r8 = p034e2.C2555l.m21209c()
            if (r8 == 0) goto L_0x00ab
            r7.getRealMetrics(r6)
            int r8 = r6.heightPixels
            int r9 = r6.widthPixels
            goto L_0x00df
        L_0x00ab:
            java.lang.Class<android.view.Display> r8 = android.view.Display.class
            java.lang.String r9 = "getRawHeight"
            java.lang.Class[] r10 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x010b }
            java.lang.reflect.Method r8 = r8.getMethod(r9, r10)     // Catch:{ Exception -> 0x010b }
            java.lang.Object[] r9 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x010b }
            java.lang.Object r8 = r8.invoke(r7, r9)     // Catch:{ Exception -> 0x010b }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ Exception -> 0x010b }
            java.lang.Class<android.view.Display> r9 = android.view.Display.class
            java.lang.String r10 = "getRawWidth"
            java.lang.Class[] r11 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x010b }
            java.lang.reflect.Method r9 = r9.getMethod(r10, r11)     // Catch:{ Exception -> 0x010b }
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x010b }
            java.lang.Object r9 = r9.invoke(r7, r10)     // Catch:{ Exception -> 0x010b }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ Exception -> 0x010b }
            if (r8 != 0) goto L_0x00d3
            r8 = r0
            goto L_0x00d7
        L_0x00d3:
            int r8 = r8.intValue()     // Catch:{ Exception -> 0x010b }
        L_0x00d7:
            if (r9 != 0) goto L_0x00db
            r9 = r0
            goto L_0x00df
        L_0x00db:
            int r9 = r9.intValue()     // Catch:{ Exception -> 0x010b }
        L_0x00df:
            r7.getMetrics(r6)
            int r7 = r6.heightPixels
            int r6 = r6.widthPixels
            if (r7 != r8) goto L_0x010b
            if (r6 != r9) goto L_0x010b
            int r6 = r4.widthPixels
            com.google.android.gms.internal.ads.C2125qw.m15897b()
            android.content.res.Resources r7 = r13.getResources()
            java.lang.String r8 = "navigation_bar_width"
            java.lang.String r9 = "dimen"
            java.lang.String r10 = "android"
            int r7 = r7.getIdentifier(r8, r9, r10)
            if (r7 <= 0) goto L_0x0108
            android.content.res.Resources r8 = r13.getResources()
            int r7 = r8.getDimensionPixelSize(r7)
            goto L_0x0109
        L_0x0108:
            r7 = r0
        L_0x0109:
            int r6 = r6 - r7
            goto L_0x010d
        L_0x010b:
            int r6 = r4.widthPixels
        L_0x010d:
            r12.f12809k = r6
            float r6 = (float) r6
            float r7 = r4.density
            float r6 = r6 / r7
            double r6 = (double) r6
            int r8 = (int) r6
            double r9 = (double) r8
            double r6 = r6 - r9
            r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 < 0) goto L_0x0130
            int r8 = r8 + 1
            goto L_0x0130
        L_0x0123:
            int r8 = r12.f12808j
            com.google.android.gms.internal.ads.C2125qw.m15897b()
            int r6 = r12.f12808j
            int r6 = com.google.android.gms.internal.ads.bo0.m6987k(r4, r6)
            r12.f12809k = r6
        L_0x0130:
            r6 = -2
            if (r2 != r6) goto L_0x0138
            int r7 = m15290h(r4)
            goto L_0x013a
        L_0x0138:
            int r7 = r12.f12805g
        L_0x013a:
            com.google.android.gms.internal.ads.C2125qw.m15897b()
            int r4 = com.google.android.gms.internal.ads.bo0.m6987k(r4, r7)
            r12.f12806h = r4
            java.lang.String r4 = "_as"
            java.lang.String r9 = "x"
            r10 = 26
            if (r3 == r5) goto L_0x017d
            if (r2 != r6) goto L_0x014e
            goto L_0x017d
        L_0x014e:
            boolean r2 = r12.f12817s
            if (r2 != 0) goto L_0x0163
            boolean r2 = r12.f12818t
            if (r2 == 0) goto L_0x0157
            goto L_0x0163
        L_0x0157:
            boolean r2 = r12.f12812n
            if (r2 == 0) goto L_0x015e
            java.lang.String r1 = "320x50_mb"
            goto L_0x0192
        L_0x015e:
            java.lang.String r1 = r1.toString()
            goto L_0x0192
        L_0x0163:
            int r1 = r12.f12808j
            int r2 = r12.f12805g
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r10)
            r3.append(r1)
            r3.append(r9)
            r3.append(r2)
            r3.append(r4)
            java.lang.String r1 = r3.toString()
            goto L_0x0192
        L_0x017d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r10)
            r1.append(r8)
            r1.append(r9)
            r1.append(r7)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
        L_0x0192:
            r12.f12804f = r1
            int r1 = r14.length
            r2 = 1
            if (r1 <= r2) goto L_0x01ae
            com.google.android.gms.internal.ads.pv[] r1 = new com.google.android.gms.internal.ads.C2087pv[r1]
            r12.f12810l = r1
            r1 = r0
        L_0x019d:
            int r2 = r14.length
            if (r1 >= r2) goto L_0x01b1
            com.google.android.gms.internal.ads.pv[] r2 = r12.f12810l
            com.google.android.gms.internal.ads.pv r3 = new com.google.android.gms.internal.ads.pv
            r4 = r14[r1]
            r3.<init>((android.content.Context) r13, (p002a1.C0024h) r4)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L_0x019d
        L_0x01ae:
            r13 = 0
            r12.f12810l = r13
        L_0x01b1:
            r12.f12811m = r0
            r12.f12813o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2087pv.<init>(android.content.Context, a1.h[]):void");
    }

    C2087pv(String str, int i, int i2, boolean z, int i3, int i4, C2087pv[] pvVarArr, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.f12804f = str;
        this.f12805g = i;
        this.f12806h = i2;
        this.f12807i = z;
        this.f12808j = i3;
        this.f12809k = i4;
        this.f12810l = pvVarArr;
        this.f12811m = z2;
        this.f12812n = z3;
        this.f12813o = z4;
        this.f12814p = z5;
        this.f12815q = z6;
        this.f12816r = z7;
        this.f12817s = z8;
        this.f12818t = z9;
    }

    /* renamed from: c */
    public static int m15285c(DisplayMetrics displayMetrics) {
        return (int) (((float) m15290h(displayMetrics)) * displayMetrics.density);
    }

    /* renamed from: d */
    public static C2087pv m15286d() {
        return new C2087pv("interstitial_mb", 0, 0, false, 0, 0, (C2087pv[]) null, false, false, false, false, true, false, false, false);
    }

    /* renamed from: e */
    public static C2087pv m15287e() {
        return new C2087pv("320x50_mb", 0, 0, false, 0, 0, (C2087pv[]) null, true, false, false, false, false, false, false, false);
    }

    /* renamed from: f */
    public static C2087pv m15288f() {
        return new C2087pv("reward_mb", 0, 0, true, 0, 0, (C2087pv[]) null, false, false, false, false, false, false, false, false);
    }

    /* renamed from: g */
    public static C2087pv m15289g() {
        return new C2087pv("invalid", 0, 0, false, 0, 0, (C2087pv[]) null, false, false, false, true, false, false, false, false);
    }

    /* renamed from: h */
    private static int m15290h(DisplayMetrics displayMetrics) {
        int i = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5225m(parcel, 2, this.f12804f, false);
        C1301c.m5220h(parcel, 3, this.f12805g);
        C1301c.m5220h(parcel, 4, this.f12806h);
        C1301c.m5215c(parcel, 5, this.f12807i);
        C1301c.m5220h(parcel, 6, this.f12808j);
        C1301c.m5220h(parcel, 7, this.f12809k);
        C1301c.m5228p(parcel, 8, this.f12810l, i, false);
        C1301c.m5215c(parcel, 9, this.f12811m);
        C1301c.m5215c(parcel, 10, this.f12812n);
        C1301c.m5215c(parcel, 11, this.f12813o);
        C1301c.m5215c(parcel, 12, this.f12814p);
        C1301c.m5215c(parcel, 13, this.f12815q);
        C1301c.m5215c(parcel, 14, this.f12816r);
        C1301c.m5215c(parcel, 15, this.f12817s);
        C1301c.m5215c(parcel, 16, this.f12818t);
        C1301c.m5214b(parcel, a);
    }
}
