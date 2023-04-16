package p061i1;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.C2199sw;
import com.google.android.gms.internal.ads.eu0;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.s33;
import com.google.android.gms.internal.ads.yg0;
import java.util.Collections;
import p048g2.C2635a;
import p048g2.C2637b;
import p054h1.C2694t;
import p069j1.C3163g2;

/* renamed from: i1.o */
public class C2816o extends yg0 implements C2802b {

    /* renamed from: z */
    static final int f19489z = Color.argb(0, 0, 0, 0);

    /* renamed from: f */
    protected final Activity f19490f;

    /* renamed from: g */
    AdOverlayInfoParcel f19491g;

    /* renamed from: h */
    eu0 f19492h;

    /* renamed from: i */
    C2812k f19493i;

    /* renamed from: j */
    C2821t f19494j;

    /* renamed from: k */
    boolean f19495k = false;

    /* renamed from: l */
    FrameLayout f19496l;

    /* renamed from: m */
    WebChromeClient.CustomViewCallback f19497m;

    /* renamed from: n */
    boolean f19498n = false;

    /* renamed from: o */
    boolean f19499o = false;

    /* renamed from: p */
    C2811j f19500p;

    /* renamed from: q */
    boolean f19501q = false;

    /* renamed from: r */
    private final Object f19502r = new Object();

    /* renamed from: s */
    private Runnable f19503s;

    /* renamed from: t */
    private boolean f19504t;

    /* renamed from: u */
    private boolean f19505u;

    /* renamed from: v */
    private boolean f19506v = false;

    /* renamed from: w */
    private boolean f19507w = false;

    /* renamed from: x */
    private boolean f19508x = true;

    /* renamed from: y */
    int f19509y = 1;

    public C2816o(Activity activity) {
        this.f19490f = activity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.f3728t;
     */
    /* renamed from: C5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m22252C5(android.content.res.Configuration r6) {
        /*
            r5 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r5.f19491g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0010
            h1.j r0 = r0.f3728t
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.f19136g
            if (r0 == 0) goto L_0x0010
            r0 = r1
            goto L_0x0011
        L_0x0010:
            r0 = r2
        L_0x0011:
            j1.f r3 = p054h1.C2694t.m21609r()
            android.app.Activity r4 = r5.f19490f
            boolean r6 = r3.mo14010o(r4, r6)
            boolean r3 = r5.f19499o
            r4 = 19
            if (r3 == 0) goto L_0x0023
            if (r0 == 0) goto L_0x0037
        L_0x0023:
            if (r6 != 0) goto L_0x0037
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r4) goto L_0x0038
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r5.f19491g
            if (r6 == 0) goto L_0x0038
            h1.j r6 = r6.f3728t
            if (r6 == 0) goto L_0x0038
            boolean r6 = r6.f19141l
            if (r6 == 0) goto L_0x0038
            r2 = r1
            goto L_0x0038
        L_0x0037:
            r1 = r2
        L_0x0038:
            android.app.Activity r6 = r5.f19490f
            android.view.Window r6 = r6.getWindow()
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.m10.f10378S0
            com.google.android.gms.internal.ads.k10 r3 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r0 = r3.mo8579b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0068
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L_0x0068
            android.view.View r6 = r6.getDecorView()
            if (r1 == 0) goto L_0x0062
            if (r2 == 0) goto L_0x005f
            r0 = 5894(0x1706, float:8.259E-42)
            goto L_0x0064
        L_0x005f:
            r0 = 5380(0x1504, float:7.539E-42)
            goto L_0x0064
        L_0x0062:
            r0 = 256(0x100, float:3.59E-43)
        L_0x0064:
            r6.setSystemUiVisibility(r0)
            return
        L_0x0068:
            r0 = 1024(0x400, float:1.435E-42)
            r3 = 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0084
            r6.addFlags(r0)
            r6.clearFlags(r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L_0x0083
            if (r2 == 0) goto L_0x0083
            android.view.View r6 = r6.getDecorView()
            r0 = 4098(0x1002, float:5.743E-42)
            r6.setSystemUiVisibility(r0)
        L_0x0083:
            return
        L_0x0084:
            r6.addFlags(r3)
            r6.clearFlags(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p061i1.C2816o.m22252C5(android.content.res.Configuration):void");
    }

    /* renamed from: D5 */
    private static final void m22253D5(C2635a aVar, View view) {
        if (aVar != null && view != null) {
            C2694t.m21600i().mo10790U(aVar, view);
        }
    }

    /* renamed from: A5 */
    public final void mo13067A5(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.f19490f);
        this.f19496l = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.f19496l.addView(view, -1, -1);
        this.f19490f.setContentView(this.f19496l);
        this.f19505u = true;
        this.f19497m = customViewCallback;
        this.f19495k = true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        if (r9.f19490f.getResources().getConfiguration().orientation == 1) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005a, code lost:
        if (r9.f19490f.getResources().getConfiguration().orientation == 2) goto L_0x0046;
     */
    /* renamed from: B5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13068B5(boolean r28) {
        /*
            r27 = this;
            r9 = r27
            boolean r0 = r9.f19505u
            r1 = 1
            if (r0 != 0) goto L_0x000c
            android.app.Activity r0 = r9.f19490f
            r0.requestWindowFeature(r1)
        L_0x000c:
            android.app.Activity r0 = r9.f19490f
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x01e9
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r9.f19491g
            com.google.android.gms.internal.ads.eu0 r2 = r2.f3717i
            r3 = 0
            if (r2 == 0) goto L_0x0020
            com.google.android.gms.internal.ads.tv0 r2 = r2.mo7077D0()
            goto L_0x0021
        L_0x0020:
            r2 = r3
        L_0x0021:
            r4 = 0
            if (r2 == 0) goto L_0x002c
            boolean r2 = r2.mo9067v()
            if (r2 == 0) goto L_0x002c
            r2 = r1
            goto L_0x002d
        L_0x002c:
            r2 = r4
        L_0x002d:
            r9.f19501q = r4
            if (r2 == 0) goto L_0x005d
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r5 = r9.f19491g
            int r5 = r5.f3723o
            r6 = 6
            if (r5 != r6) goto L_0x004a
            android.app.Activity r5 = r9.f19490f
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            int r5 = r5.orientation
            if (r5 != r1) goto L_0x0047
        L_0x0046:
            r4 = r1
        L_0x0047:
            r9.f19501q = r4
            goto L_0x005d
        L_0x004a:
            r6 = 7
            if (r5 != r6) goto L_0x005d
            android.app.Activity r5 = r9.f19490f
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            int r5 = r5.orientation
            r6 = 2
            if (r5 != r6) goto L_0x0047
            goto L_0x0046
        L_0x005d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r6 = 46
            r5.<init>(r6)
            java.lang.String r6 = "Delay onShow to next orientation change: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.google.android.gms.internal.ads.io0.m11126b(r4)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = r9.f19491g
            int r4 = r4.f3723o
            r9.mo13071G5(r4)
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            r0.setFlags(r4, r4)
            java.lang.String r0 = "Hardware acceleration on the AdActivity window enabled."
            com.google.android.gms.internal.ads.io0.m11126b(r0)
            boolean r0 = r9.f19499o
            if (r0 != 0) goto L_0x008d
            i1.j r0 = r9.f19500p
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x0091
        L_0x008d:
            i1.j r0 = r9.f19500p
            int r4 = f19489z
        L_0x0091:
            r0.setBackgroundColor(r4)
            android.app.Activity r0 = r9.f19490f
            i1.j r4 = r9.f19500p
            r0.setContentView(r4)
            r9.f19505u = r1
            if (r28 == 0) goto L_0x0165
            p054h1.C2694t.m21591A()     // Catch:{ Exception -> 0x0157 }
            android.app.Activity r10 = r9.f19490f     // Catch:{ Exception -> 0x0157 }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r9.f19491g     // Catch:{ Exception -> 0x0157 }
            com.google.android.gms.internal.ads.eu0 r0 = r0.f3717i     // Catch:{ Exception -> 0x0157 }
            if (r0 == 0) goto L_0x00b0
            com.google.android.gms.internal.ads.vv0 r0 = r0.mo7151x()     // Catch:{ Exception -> 0x0157 }
            r11 = r0
            goto L_0x00b1
        L_0x00b0:
            r11 = r3
        L_0x00b1:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r9.f19491g     // Catch:{ Exception -> 0x0157 }
            com.google.android.gms.internal.ads.eu0 r0 = r0.f3717i     // Catch:{ Exception -> 0x0157 }
            if (r0 == 0) goto L_0x00bd
            java.lang.String r0 = r0.mo7097O0()     // Catch:{ Exception -> 0x0157 }
            r12 = r0
            goto L_0x00be
        L_0x00bd:
            r12 = r3
        L_0x00be:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r9.f19491g     // Catch:{ Exception -> 0x0157 }
            com.google.android.gms.internal.ads.po0 r4 = r0.f3726r     // Catch:{ Exception -> 0x0157 }
            com.google.android.gms.internal.ads.eu0 r0 = r0.f3717i     // Catch:{ Exception -> 0x0157 }
            if (r0 == 0) goto L_0x00cd
            h1.a r0 = r0.mo7135o()     // Catch:{ Exception -> 0x0157 }
            r20 = r0
            goto L_0x00cf
        L_0x00cd:
            r20 = r3
        L_0x00cf:
            r13 = 1
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            com.google.android.gms.internal.ads.ar r21 = com.google.android.gms.internal.ads.C1527ar.m6231a()     // Catch:{ Exception -> 0x0157 }
            r22 = 0
            r23 = 0
            r14 = r2
            r17 = r4
            com.google.android.gms.internal.ads.eu0 r0 = com.google.android.gms.internal.ads.ru0.m16446a(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x0157 }
            r9.f19492h = r0     // Catch:{ Exception -> 0x0157 }
            com.google.android.gms.internal.ads.tv0 r10 = r0.mo7077D0()
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r9.f19491g
            com.google.android.gms.internal.ads.s60 r12 = r0.f3729u
            com.google.android.gms.internal.ads.u60 r14 = r0.f3718j
            i1.y r15 = r0.f3722n
            com.google.android.gms.internal.ads.eu0 r0 = r0.f3717i
            if (r0 == 0) goto L_0x0100
            com.google.android.gms.internal.ads.tv0 r0 = r0.mo7077D0()
            h1.b r3 = r0.mo9049g()
        L_0x0100:
            r18 = r3
            r11 = 0
            r13 = 0
            r16 = 1
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r10.mo9053k0(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            com.google.android.gms.internal.ads.eu0 r0 = r9.f19492h
            com.google.android.gms.internal.ads.tv0 r0 = r0.mo7077D0()
            i1.g r3 = new i1.g
            r3.<init>(r9)
            r0.mo9048f1(r3)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r9.f19491g
            java.lang.String r3 = r0.f3725q
            if (r3 == 0) goto L_0x0135
            com.google.android.gms.internal.ads.eu0 r0 = r9.f19492h
            r0.loadUrl(r3)
            goto L_0x0145
        L_0x0135:
            java.lang.String r12 = r0.f3721m
            if (r12 == 0) goto L_0x014f
            com.google.android.gms.internal.ads.eu0 r10 = r9.f19492h
            java.lang.String r11 = r0.f3719k
            r15 = 0
            java.lang.String r13 = "text/html"
            java.lang.String r14 = "UTF-8"
            r10.loadDataWithBaseURL(r11, r12, r13, r14, r15)
        L_0x0145:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r9.f19491g
            com.google.android.gms.internal.ads.eu0 r0 = r0.f3717i
            if (r0 == 0) goto L_0x0170
            r0.mo7114e1(r9)
            goto L_0x0170
        L_0x014f:
            i1.i r0 = new i1.i
            java.lang.String r1 = "No URL or HTML to display in ad overlay."
            r0.<init>(r1)
            throw r0
        L_0x0157:
            r0 = move-exception
            java.lang.String r1 = "Error obtaining webview."
            com.google.android.gms.internal.ads.io0.m11129e(r1, r0)
            i1.i r0 = new i1.i
            java.lang.String r1 = "Could not obtain webview for the overlay."
            r0.<init>(r1)
            throw r0
        L_0x0165:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r9.f19491g
            com.google.android.gms.internal.ads.eu0 r0 = r0.f3717i
            r9.f19492h = r0
            android.app.Activity r3 = r9.f19490f
            r0.mo7079E0(r3)
        L_0x0170:
            com.google.android.gms.internal.ads.eu0 r0 = r9.f19492h
            r0.mo7099R0(r9)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r9.f19491g
            com.google.android.gms.internal.ads.eu0 r0 = r0.f3717i
            if (r0 == 0) goto L_0x0184
            g2.a r0 = r0.mo7125h0()
            i1.j r3 = r9.f19500p
            m22253D5(r0, r3)
        L_0x0184:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r9.f19491g
            int r0 = r0.f3724p
            r3 = 5
            if (r0 == r3) goto L_0x01b7
            com.google.android.gms.internal.ads.eu0 r0 = r9.f19492h
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x01a2
            boolean r4 = r0 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x01a2
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            com.google.android.gms.internal.ads.eu0 r4 = r9.f19492h
            android.view.View r4 = r4.mo7105Y()
            r0.removeView(r4)
        L_0x01a2:
            boolean r0 = r9.f19499o
            if (r0 == 0) goto L_0x01ab
            com.google.android.gms.internal.ads.eu0 r0 = r9.f19492h
            r0.mo7089K()
        L_0x01ab:
            i1.j r0 = r9.f19500p
            com.google.android.gms.internal.ads.eu0 r4 = r9.f19492h
            android.view.View r4 = r4.mo7105Y()
            r5 = -1
            r0.addView(r4, r5, r5)
        L_0x01b7:
            if (r28 != 0) goto L_0x01c0
            boolean r0 = r9.f19501q
            if (r0 != 0) goto L_0x01c0
            r27.mo13077b()
        L_0x01c0:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r9.f19491g
            int r4 = r0.f3724p
            if (r4 == r3) goto L_0x01d5
            r9.mo13069E5(r2)
            com.google.android.gms.internal.ads.eu0 r0 = r9.f19492h
            boolean r0 = r0.mo7076C0()
            if (r0 == 0) goto L_0x01d4
            r9.mo13070F5(r2, r1)
        L_0x01d4:
            return
        L_0x01d5:
            android.app.Activity r1 = r9.f19490f
            j1.x0 r3 = r0.f3734z
            com.google.android.gms.internal.ads.o42 r4 = r0.f3731w
            com.google.android.gms.internal.ads.wv1 r5 = r0.f3732x
            com.google.android.gms.internal.ads.xw2 r6 = r0.f3733y
            java.lang.String r7 = r0.f3730v
            java.lang.String r8 = r0.f3710A
            r2 = r27
            com.google.android.gms.internal.ads.w42.m18873C5(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x01e9:
            i1.i r0 = new i1.i
            java.lang.String r1 = "Invalid activity, no window available."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p061i1.C2816o.mo13068B5(boolean):void");
    }

    /* renamed from: C0 */
    public final void mo7968C0() {
        this.f19509y = 2;
        this.f19490f.finish();
    }

    /* renamed from: E5 */
    public final void mo13069E5(boolean z) {
        int intValue = ((Integer) C2199sw.m17001c().mo8579b(m10.f10623u3)).intValue();
        int i = 0;
        boolean z2 = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10346O0)).booleanValue() || z;
        C2820s sVar = new C2820s();
        sVar.f19514d = 50;
        sVar.f19511a = true != z2 ? 0 : intValue;
        if (true != z2) {
            i = intValue;
        }
        sVar.f19512b = i;
        sVar.f19513c = intValue;
        this.f19494j = new C2821t(this.f19490f, sVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z2 ? 9 : 11);
        mo13070F5(z, this.f19491g.f3720l);
        this.f19500p.addView(this.f19494j, layoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        r0 = (r0 = r6.f19491g).f3728t;
     */
    /* renamed from: F5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13070F5(boolean r7, boolean r8) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.m10.f10330M0
            com.google.android.gms.internal.ads.k10 r1 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r0 = r1.mo8579b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r6.f19491g
            if (r0 == 0) goto L_0x0022
            h1.j r0 = r0.f3728t
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.f19142m
            if (r0 == 0) goto L_0x0022
            r0 = r1
            goto L_0x0023
        L_0x0022:
            r0 = r2
        L_0x0023:
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.m10.f10338N0
            com.google.android.gms.internal.ads.k10 r4 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r3 = r4.mo8579b(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0043
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r6.f19491g
            if (r3 == 0) goto L_0x0043
            h1.j r3 = r3.f3728t
            if (r3 == 0) goto L_0x0043
            boolean r3 = r3.f19143n
            if (r3 == 0) goto L_0x0043
            r3 = r1
            goto L_0x0044
        L_0x0043:
            r3 = r2
        L_0x0044:
            if (r7 == 0) goto L_0x005a
            if (r8 == 0) goto L_0x005a
            if (r0 == 0) goto L_0x005a
            if (r3 != 0) goto L_0x005a
            com.google.android.gms.internal.ads.eg0 r7 = new com.google.android.gms.internal.ads.eg0
            com.google.android.gms.internal.ads.eu0 r4 = r6.f19492h
            java.lang.String r5 = "useCustomClose"
            r7.<init>(r4, r5)
            java.lang.String r4 = "Custom close has been disabled for interstitial ads in this ad slot."
            r7.mo6948c(r4)
        L_0x005a:
            i1.t r7 = r6.f19494j
            if (r7 == 0) goto L_0x0069
            if (r3 != 0) goto L_0x0066
            if (r8 == 0) goto L_0x0065
            if (r0 != 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r1 = r2
        L_0x0066:
            r7.mo13085b(r1)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p061i1.C2816o.mo13070F5(boolean, boolean):void");
    }

    /* renamed from: G5 */
    public final void mo13071G5(int i) {
        if (this.f19490f.getApplicationInfo().targetSdkVersion >= ((Integer) C2199sw.m17001c().mo8579b(m10.f10616t4)).intValue()) {
            if (this.f19490f.getApplicationInfo().targetSdkVersion <= ((Integer) C2199sw.m17001c().mo8579b(m10.f10624u4)).intValue()) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= ((Integer) C2199sw.m17001c().mo8579b(m10.f10632v4)).intValue()) {
                    if (i2 <= ((Integer) C2199sw.m17001c().mo8579b(m10.f10640w4)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.f19490f.setRequestedOrientation(i);
        } catch (Throwable th) {
            C2694t.m21607p().mo11033r(th, "AdOverlay.setRequestedOrientation");
        }
    }

    /* renamed from: H5 */
    public final void mo13072H5(boolean z) {
        C2811j jVar;
        int i;
        if (z) {
            jVar = this.f19500p;
            i = 0;
        } else {
            jVar = this.f19500p;
            i = -16777216;
        }
        jVar.setBackgroundColor(i);
    }

    /* renamed from: K */
    public final void mo11829K(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f19498n);
    }

    /* renamed from: L */
    public final boolean mo11830L() {
        this.f19509y = 1;
        if (this.f19492h == null) {
            return true;
        }
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10240A6)).booleanValue() || !this.f19492h.canGoBack()) {
            boolean c0 = this.f19492h.mo7109c0();
            if (!c0) {
                this.f19492h.mo6424t("onbackblocked", Collections.emptyMap());
            }
            return c0;
        }
        this.f19492h.goBack();
        return false;
    }

    /* renamed from: M */
    public final void mo13073M() {
        this.f19500p.removeView(this.f19494j);
        mo13069E5(true);
    }

    /* renamed from: R2 */
    public final void mo13074R2() {
        synchronized (this.f19502r) {
            this.f19504t = true;
            Runnable runnable = this.f19503s;
            if (runnable != null) {
                s33 s33 = C3163g2.f20465i;
                s33.removeCallbacks(runnable);
                s33.post(this.f19503s);
            }
        }
    }

    /* renamed from: V */
    public final void mo11831V(C2635a aVar) {
        m22252C5((Configuration) C2637b.m21357C0(aVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public final void mo13075Z() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        C2818q qVar;
        if (this.f19490f.isFinishing() && !this.f19506v) {
            this.f19506v = true;
            eu0 eu0 = this.f19492h;
            if (eu0 != null) {
                eu0.mo7141s0(this.f19509y - 1);
                synchronized (this.f19502r) {
                    if (!this.f19504t && this.f19492h.mo7126i0()) {
                        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10589q3)).booleanValue() && !this.f19507w && (adOverlayInfoParcel = this.f19491g) != null && (qVar = adOverlayInfoParcel.f3716h) != null) {
                            qVar.mo5645Z2();
                        }
                        C2809h hVar = new C2809h(this);
                        this.f19503s = hVar;
                        C3163g2.f20465i.postDelayed(hVar, ((Long) C2199sw.m17001c().mo8579b(m10.f10322L0)).longValue());
                        return;
                    }
                }
            }
            mo13078c();
        }
    }

    /* renamed from: a */
    public final void mo13076a() {
        this.f19509y = 3;
        this.f19490f.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f19491g;
        if (adOverlayInfoParcel != null && adOverlayInfoParcel.f3724p == 5) {
            this.f19490f.overridePendingTransition(0, 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo13077b() {
        this.f19492h.mo7074A0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo13078c() {
        eu0 eu0;
        C2818q qVar;
        if (!this.f19507w) {
            this.f19507w = true;
            eu0 eu02 = this.f19492h;
            if (eu02 != null) {
                this.f19500p.removeView(eu02.mo7105Y());
                C2812k kVar = this.f19493i;
                if (kVar != null) {
                    this.f19492h.mo7079E0(kVar.f19485d);
                    this.f19492h.mo7102V(false);
                    ViewGroup viewGroup = this.f19493i.f19484c;
                    View Y = this.f19492h.mo7105Y();
                    C2812k kVar2 = this.f19493i;
                    viewGroup.addView(Y, kVar2.f19482a, kVar2.f19483b);
                    this.f19493i = null;
                } else if (this.f19490f.getApplicationContext() != null) {
                    this.f19492h.mo7079E0(this.f19490f.getApplicationContext());
                }
                this.f19492h = null;
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f19491g;
            if (!(adOverlayInfoParcel == null || (qVar = adOverlayInfoParcel.f3716h) == null)) {
                qVar.mo5643D(this.f19509y);
            }
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f19491g;
            if (adOverlayInfoParcel2 != null && (eu0 = adOverlayInfoParcel2.f3717i) != null) {
                m22253D5(eu0.mo7125h0(), this.f19491g.f3717i.mo7105Y());
            }
        }
    }

    /* renamed from: d */
    public final void mo13079d() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f19491g;
        if (adOverlayInfoParcel != null && this.f19495k) {
            mo13071G5(adOverlayInfoParcel.f3723o);
        }
        if (this.f19496l != null) {
            this.f19490f.setContentView(this.f19500p);
            this.f19505u = true;
            this.f19496l.removeAllViews();
            this.f19496l = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f19497m;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f19497m = null;
        }
        this.f19495k = false;
    }

    /* renamed from: f */
    public final void mo11832f() {
        this.f19509y = 1;
    }

    /* renamed from: g */
    public final void mo13080g() {
        this.f19500p.f19481g = true;
    }

    /* renamed from: k */
    public final void mo11833k() {
        eu0 eu0 = this.f19492h;
        if (eu0 != null) {
            try {
                this.f19500p.removeView(eu0.mo7105Y());
            } catch (NullPointerException unused) {
            }
        }
        mo13075Z();
    }

    /* renamed from: l */
    public final void mo11834l() {
        C2818q qVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f19491g;
        if (!(adOverlayInfoParcel == null || (qVar = adOverlayInfoParcel.f3716h) == null)) {
            qVar.mo5644M3();
        }
        m22252C5(this.f19490f.getResources().getConfiguration());
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10607s3)).booleanValue()) {
            eu0 eu0 = this.f19492h;
            if (eu0 == null || eu0.mo7140r0()) {
                io0.m11131g("The webview does not exist. Ignoring action.");
            } else {
                this.f19492h.onResume();
            }
        }
    }

    /* renamed from: m */
    public final void mo11835m() {
        C2818q qVar;
        mo13079d();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f19491g;
        if (!(adOverlayInfoParcel == null || (qVar = adOverlayInfoParcel.f3716h) == null)) {
            qVar.mo5655u5();
        }
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10607s3)).booleanValue() && this.f19492h != null && (!this.f19490f.isFinishing() || this.f19493i == null)) {
            this.f19492h.onPause();
        }
        mo13075Z();
    }

    /* renamed from: n */
    public final void mo11836n() {
    }

    /* renamed from: o */
    public final void mo13081o() {
        if (this.f19501q) {
            this.f19501q = false;
            mo13077b();
        }
    }

    /* renamed from: p */
    public final void mo11837p() {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10607s3)).booleanValue() && this.f19492h != null && (!this.f19490f.isFinishing() || this.f19493i == null)) {
            this.f19492h.onPause();
        }
        mo13075Z();
    }

    /* renamed from: q */
    public final void mo11838q() {
        C2818q qVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f19491g;
        if (adOverlayInfoParcel != null && (qVar = adOverlayInfoParcel.f3716h) != null) {
            qVar.mo5647b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071 A[Catch:{ i -> 0x00f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c4 A[Catch:{ i -> 0x00f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e9 A[Catch:{ i -> 0x00f5 }] */
    /* renamed from: r2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11839r2(android.os.Bundle r9) {
        /*
            r8 = this;
            android.app.Activity r0 = r8.f19490f
            r1 = 1
            r0.requestWindowFeature(r1)
            r0 = 0
            if (r9 == 0) goto L_0x0013
            java.lang.String r2 = "com.google.android.gms.ads.internal.overlay.hasResumed"
            boolean r2 = r9.getBoolean(r2, r0)
            if (r2 == 0) goto L_0x0013
            r2 = r1
            goto L_0x0014
        L_0x0013:
            r2 = r0
        L_0x0014:
            r8.f19498n = r2
            r2 = 4
            android.app.Activity r3 = r8.f19490f     // Catch:{ i -> 0x00f5 }
            android.content.Intent r3 = r3.getIntent()     // Catch:{ i -> 0x00f5 }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.m5691c(r3)     // Catch:{ i -> 0x00f5 }
            r8.f19491g = r3     // Catch:{ i -> 0x00f5 }
            if (r3 == 0) goto L_0x00ed
            com.google.android.gms.internal.ads.po0 r3 = r3.f3726r     // Catch:{ i -> 0x00f5 }
            int r3 = r3.f12731h     // Catch:{ i -> 0x00f5 }
            r4 = 7500000(0x7270e0, float:1.0509738E-38)
            if (r3 <= r4) goto L_0x0030
            r8.f19509y = r2     // Catch:{ i -> 0x00f5 }
        L_0x0030:
            android.app.Activity r3 = r8.f19490f     // Catch:{ i -> 0x00f5 }
            android.content.Intent r3 = r3.getIntent()     // Catch:{ i -> 0x00f5 }
            if (r3 == 0) goto L_0x0046
            android.app.Activity r3 = r8.f19490f     // Catch:{ i -> 0x00f5 }
            android.content.Intent r3 = r3.getIntent()     // Catch:{ i -> 0x00f5 }
            java.lang.String r4 = "shouldCallOnOverlayOpened"
            boolean r3 = r3.getBooleanExtra(r4, r1)     // Catch:{ i -> 0x00f5 }
            r8.f19508x = r3     // Catch:{ i -> 0x00f5 }
        L_0x0046:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r8.f19491g     // Catch:{ i -> 0x00f5 }
            h1.j r4 = r3.f3728t     // Catch:{ i -> 0x00f5 }
            r5 = 5
            if (r4 == 0) goto L_0x0054
            boolean r6 = r4.f19135f     // Catch:{ i -> 0x00f5 }
            r8.f19499o = r6     // Catch:{ i -> 0x00f5 }
            if (r6 == 0) goto L_0x006f
            goto L_0x005a
        L_0x0054:
            int r6 = r3.f3724p     // Catch:{ i -> 0x00f5 }
            if (r6 != r5) goto L_0x006d
            r8.f19499o = r1     // Catch:{ i -> 0x00f5 }
        L_0x005a:
            int r3 = r3.f3724p     // Catch:{ i -> 0x00f5 }
            if (r3 == r5) goto L_0x006f
            int r3 = r4.f19140k     // Catch:{ i -> 0x00f5 }
            r4 = -1
            if (r3 == r4) goto L_0x006f
            i1.n r3 = new i1.n     // Catch:{ i -> 0x00f5 }
            r4 = 0
            r3.<init>(r8, r4)     // Catch:{ i -> 0x00f5 }
            r3.mo8781b()     // Catch:{ i -> 0x00f5 }
            goto L_0x006f
        L_0x006d:
            r8.f19499o = r0     // Catch:{ i -> 0x00f5 }
        L_0x006f:
            if (r9 != 0) goto L_0x009d
            boolean r9 = r8.f19508x     // Catch:{ i -> 0x00f5 }
            if (r9 == 0) goto L_0x0087
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.f19491g     // Catch:{ i -> 0x00f5 }
            com.google.android.gms.internal.ads.jb1 r9 = r9.f3712C     // Catch:{ i -> 0x00f5 }
            if (r9 == 0) goto L_0x007e
            r9.mo8443g()     // Catch:{ i -> 0x00f5 }
        L_0x007e:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.f19491g     // Catch:{ i -> 0x00f5 }
            i1.q r9 = r9.f3716h     // Catch:{ i -> 0x00f5 }
            if (r9 == 0) goto L_0x0087
            r9.mo5646a()     // Catch:{ i -> 0x00f5 }
        L_0x0087:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.f19491g     // Catch:{ i -> 0x00f5 }
            int r3 = r9.f3724p     // Catch:{ i -> 0x00f5 }
            if (r3 == r1) goto L_0x009d
            com.google.android.gms.internal.ads.yu r9 = r9.f3715g     // Catch:{ i -> 0x00f5 }
            if (r9 == 0) goto L_0x0094
            r9.mo25L()     // Catch:{ i -> 0x00f5 }
        L_0x0094:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.f19491g     // Catch:{ i -> 0x00f5 }
            com.google.android.gms.internal.ads.pi1 r9 = r9.f3713D     // Catch:{ i -> 0x00f5 }
            if (r9 == 0) goto L_0x009d
            r9.mo8182r()     // Catch:{ i -> 0x00f5 }
        L_0x009d:
            i1.j r9 = new i1.j     // Catch:{ i -> 0x00f5 }
            android.app.Activity r3 = r8.f19490f     // Catch:{ i -> 0x00f5 }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = r8.f19491g     // Catch:{ i -> 0x00f5 }
            java.lang.String r6 = r4.f3727s     // Catch:{ i -> 0x00f5 }
            com.google.android.gms.internal.ads.po0 r7 = r4.f3726r     // Catch:{ i -> 0x00f5 }
            java.lang.String r7 = r7.f12729f     // Catch:{ i -> 0x00f5 }
            java.lang.String r4 = r4.f3711B     // Catch:{ i -> 0x00f5 }
            r9.<init>(r3, r6, r7, r4)     // Catch:{ i -> 0x00f5 }
            r8.f19500p = r9     // Catch:{ i -> 0x00f5 }
            r3 = 1000(0x3e8, float:1.401E-42)
            r9.setId(r3)     // Catch:{ i -> 0x00f5 }
            j1.f r9 = p054h1.C2694t.m21609r()     // Catch:{ i -> 0x00f5 }
            android.app.Activity r3 = r8.f19490f     // Catch:{ i -> 0x00f5 }
            r9.mo13992q(r3)     // Catch:{ i -> 0x00f5 }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.f19491g     // Catch:{ i -> 0x00f5 }
            int r3 = r9.f3724p     // Catch:{ i -> 0x00f5 }
            if (r3 == r1) goto L_0x00e9
            r4 = 2
            if (r3 == r4) goto L_0x00dc
            r9 = 3
            if (r3 == r9) goto L_0x00d8
            if (r3 != r5) goto L_0x00d0
            r8.mo13068B5(r0)     // Catch:{ i -> 0x00f5 }
            return
        L_0x00d0:
            i1.i r9 = new i1.i     // Catch:{ i -> 0x00f5 }
            java.lang.String r0 = "Could not determine ad overlay type."
            r9.<init>(r0)     // Catch:{ i -> 0x00f5 }
            throw r9     // Catch:{ i -> 0x00f5 }
        L_0x00d8:
            r8.mo13068B5(r1)     // Catch:{ i -> 0x00f5 }
            return
        L_0x00dc:
            i1.k r1 = new i1.k     // Catch:{ i -> 0x00f5 }
            com.google.android.gms.internal.ads.eu0 r9 = r9.f3717i     // Catch:{ i -> 0x00f5 }
            r1.<init>(r9)     // Catch:{ i -> 0x00f5 }
            r8.f19493i = r1     // Catch:{ i -> 0x00f5 }
            r8.mo13068B5(r0)     // Catch:{ i -> 0x00f5 }
            return
        L_0x00e9:
            r8.mo13068B5(r0)     // Catch:{ i -> 0x00f5 }
            return
        L_0x00ed:
            i1.i r9 = new i1.i     // Catch:{ i -> 0x00f5 }
            java.lang.String r0 = "Could not get info for ad overlay."
            r9.<init>(r0)     // Catch:{ i -> 0x00f5 }
            throw r9     // Catch:{ i -> 0x00f5 }
        L_0x00f5:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()
            com.google.android.gms.internal.ads.io0.m11131g(r9)
            r8.f19509y = r2
            android.app.Activity r9 = r8.f19490f
            r9.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p061i1.C2816o.mo11839r2(android.os.Bundle):void");
    }

    /* renamed from: t */
    public final void mo11840t() {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10607s3)).booleanValue()) {
            eu0 eu0 = this.f19492h;
            if (eu0 == null || eu0.mo7140r0()) {
                io0.m11131g("The webview does not exist. Ignoring action.");
            } else {
                this.f19492h.onResume();
            }
        }
    }

    /* renamed from: u4 */
    public final void mo11841u4(int i, int i2, Intent intent) {
    }

    /* renamed from: x */
    public final void mo11842x() {
        this.f19505u = true;
    }
}
