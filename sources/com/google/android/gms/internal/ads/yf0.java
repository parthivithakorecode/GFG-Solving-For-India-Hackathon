package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import java.util.Set;
import p034e2.C2548e;

public final class yf0 extends eg0 {

    /* renamed from: u */
    static final Set<String> f17703u = C2548e.m21183d("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");

    /* renamed from: c */
    private String f17704c = "top-right";

    /* renamed from: d */
    private boolean f17705d = true;

    /* renamed from: e */
    private int f17706e = 0;

    /* renamed from: f */
    private int f17707f = 0;

    /* renamed from: g */
    private int f17708g = -1;

    /* renamed from: h */
    private int f17709h = 0;

    /* renamed from: i */
    private int f17710i = 0;

    /* renamed from: j */
    private int f17711j = -1;

    /* renamed from: k */
    private final Object f17712k = new Object();

    /* renamed from: l */
    private final eu0 f17713l;

    /* renamed from: m */
    private final Activity f17714m;

    /* renamed from: n */
    private vv0 f17715n;

    /* renamed from: o */
    private ImageView f17716o;

    /* renamed from: p */
    private LinearLayout f17717p;

    /* renamed from: q */
    private final fg0 f17718q;

    /* renamed from: r */
    private PopupWindow f17719r;

    /* renamed from: s */
    private RelativeLayout f17720s;

    /* renamed from: t */
    private ViewGroup f17721t;

    public yf0(eu0 eu0, fg0 fg0) {
        super(eu0, "resize");
        this.f17713l = eu0;
        this.f17714m = eu0.mo7127j();
        this.f17718q = fg0;
    }

    /* renamed from: h */
    public final void mo12004h(boolean z) {
        synchronized (this.f17712k) {
            PopupWindow popupWindow = this.f17719r;
            if (popupWindow != null) {
                popupWindow.dismiss();
                this.f17720s.removeView((View) this.f17713l);
                ViewGroup viewGroup = this.f17721t;
                if (viewGroup != null) {
                    viewGroup.removeView(this.f17716o);
                    this.f17721t.addView((View) this.f17713l);
                    this.f17713l.mo7115g0(this.f17715n);
                }
                if (z) {
                    mo6952g("default");
                    fg0 fg0 = this.f17718q;
                    if (fg0 != null) {
                        fg0.mo6300a();
                    }
                }
                this.f17719r = null;
                this.f17720s = null;
                this.f17721t = null;
                this.f17717p = null;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01f3 A[Catch:{ RuntimeException -> 0x0413 }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01f4 A[Catch:{ RuntimeException -> 0x0413 }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0251 A[Catch:{ RuntimeException -> 0x0413 }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0258 A[Catch:{ RuntimeException -> 0x0413 }] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x03e3 A[Catch:{ RuntimeException -> 0x0413 }] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12005i(java.util.Map<java.lang.String, java.lang.String> r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            java.lang.Object r2 = r1.f17712k
            monitor-enter(r2)
            android.app.Activity r3 = r1.f17714m     // Catch:{ all -> 0x0471 }
            if (r3 != 0) goto L_0x0012
            java.lang.String r0 = "Not an activity context. Cannot resize."
            r1.mo6948c(r0)     // Catch:{ all -> 0x0471 }
            monitor-exit(r2)     // Catch:{ all -> 0x0471 }
            return
        L_0x0012:
            com.google.android.gms.internal.ads.eu0 r3 = r1.f17713l     // Catch:{ all -> 0x0471 }
            com.google.android.gms.internal.ads.vv0 r3 = r3.mo7151x()     // Catch:{ all -> 0x0471 }
            if (r3 != 0) goto L_0x0021
            java.lang.String r0 = "Webview is not yet available, size is not set."
            r1.mo6948c(r0)     // Catch:{ all -> 0x0471 }
            monitor-exit(r2)     // Catch:{ all -> 0x0471 }
            return
        L_0x0021:
            com.google.android.gms.internal.ads.eu0 r3 = r1.f17713l     // Catch:{ all -> 0x0471 }
            com.google.android.gms.internal.ads.vv0 r3 = r3.mo7151x()     // Catch:{ all -> 0x0471 }
            boolean r3 = r3.mo11531i()     // Catch:{ all -> 0x0471 }
            if (r3 == 0) goto L_0x0034
            java.lang.String r0 = "Is interstitial. Cannot resize an interstitial."
            r1.mo6948c(r0)     // Catch:{ all -> 0x0471 }
            monitor-exit(r2)     // Catch:{ all -> 0x0471 }
            return
        L_0x0034:
            com.google.android.gms.internal.ads.eu0 r3 = r1.f17713l     // Catch:{ all -> 0x0471 }
            boolean r3 = r3.mo7090K0()     // Catch:{ all -> 0x0471 }
            if (r3 != 0) goto L_0x046a
            java.lang.String r3 = "width"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x0471 }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x0471 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0471 }
            if (r3 != 0) goto L_0x005b
            p054h1.C2694t.m21608q()     // Catch:{ all -> 0x0471 }
            java.lang.String r3 = "width"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x0471 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0471 }
            int r3 = p069j1.C3163g2.m23942r(r3)     // Catch:{ all -> 0x0471 }
            r1.f17711j = r3     // Catch:{ all -> 0x0471 }
        L_0x005b:
            java.lang.String r3 = "height"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x0471 }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x0471 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0471 }
            if (r3 != 0) goto L_0x007a
            p054h1.C2694t.m21608q()     // Catch:{ all -> 0x0471 }
            java.lang.String r3 = "height"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x0471 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0471 }
            int r3 = p069j1.C3163g2.m23942r(r3)     // Catch:{ all -> 0x0471 }
            r1.f17708g = r3     // Catch:{ all -> 0x0471 }
        L_0x007a:
            java.lang.String r3 = "offsetX"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x0471 }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x0471 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0471 }
            if (r3 != 0) goto L_0x0099
            p054h1.C2694t.m21608q()     // Catch:{ all -> 0x0471 }
            java.lang.String r3 = "offsetX"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x0471 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0471 }
            int r3 = p069j1.C3163g2.m23942r(r3)     // Catch:{ all -> 0x0471 }
            r1.f17709h = r3     // Catch:{ all -> 0x0471 }
        L_0x0099:
            java.lang.String r3 = "offsetY"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x0471 }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x0471 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0471 }
            if (r3 != 0) goto L_0x00b8
            p054h1.C2694t.m21608q()     // Catch:{ all -> 0x0471 }
            java.lang.String r3 = "offsetY"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x0471 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0471 }
            int r3 = p069j1.C3163g2.m23942r(r3)     // Catch:{ all -> 0x0471 }
            r1.f17710i = r3     // Catch:{ all -> 0x0471 }
        L_0x00b8:
            java.lang.String r3 = "allowOffscreen"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x0471 }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x0471 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0471 }
            if (r3 != 0) goto L_0x00d4
            java.lang.String r3 = "allowOffscreen"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x0471 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0471 }
            boolean r3 = java.lang.Boolean.parseBoolean(r3)     // Catch:{ all -> 0x0471 }
            r1.f17705d = r3     // Catch:{ all -> 0x0471 }
        L_0x00d4:
            java.lang.String r3 = "customClosePosition"
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0471 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0471 }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0471 }
            if (r3 != 0) goto L_0x00e4
            r1.f17704c = r0     // Catch:{ all -> 0x0471 }
        L_0x00e4:
            int r0 = r1.f17711j     // Catch:{ all -> 0x0471 }
            if (r0 < 0) goto L_0x0463
            int r0 = r1.f17708g     // Catch:{ all -> 0x0471 }
            if (r0 < 0) goto L_0x0463
            android.app.Activity r0 = r1.f17714m     // Catch:{ all -> 0x0471 }
            android.view.Window r0 = r0.getWindow()     // Catch:{ all -> 0x0471 }
            if (r0 == 0) goto L_0x045c
            android.view.View r3 = r0.getDecorView()     // Catch:{ all -> 0x0471 }
            if (r3 != 0) goto L_0x00fc
            goto L_0x045c
        L_0x00fc:
            p054h1.C2694t.m21608q()     // Catch:{ all -> 0x0471 }
            android.app.Activity r3 = r1.f17714m     // Catch:{ all -> 0x0471 }
            int[] r3 = p069j1.C3163g2.m23950z(r3)     // Catch:{ all -> 0x0471 }
            p054h1.C2694t.m21608q()     // Catch:{ all -> 0x0471 }
            android.app.Activity r4 = r1.f17714m     // Catch:{ all -> 0x0471 }
            int[] r4 = p069j1.C3163g2.m23947w(r4)     // Catch:{ all -> 0x0471 }
            r5 = 0
            r6 = r3[r5]     // Catch:{ all -> 0x0471 }
            r7 = 1
            r3 = r3[r7]     // Catch:{ all -> 0x0471 }
            int r8 = r1.f17711j     // Catch:{ all -> 0x0471 }
            r9 = 5
            r10 = 4
            r11 = 3
            r13 = 2
            r14 = 50
            if (r8 < r14) goto L_0x0249
            if (r8 <= r6) goto L_0x0122
            goto L_0x0249
        L_0x0122:
            int r15 = r1.f17708g     // Catch:{ all -> 0x0471 }
            if (r15 < r14) goto L_0x0246
            if (r15 <= r3) goto L_0x012a
            goto L_0x0246
        L_0x012a:
            if (r15 != r3) goto L_0x0132
            if (r8 != r6) goto L_0x0132
            java.lang.String r3 = "Cannot resize to a full-screen ad."
            goto L_0x024b
        L_0x0132:
            boolean r3 = r1.f17705d     // Catch:{ all -> 0x0471 }
            if (r3 == 0) goto L_0x0205
            java.lang.String r3 = r1.f17704c     // Catch:{ all -> 0x0471 }
            int r16 = r3.hashCode()     // Catch:{ all -> 0x0471 }
            switch(r16) {
                case -1364013995: goto L_0x0172;
                case -1012429441: goto L_0x0168;
                case -655373719: goto L_0x015e;
                case 1163912186: goto L_0x0154;
                case 1288627767: goto L_0x014a;
                case 1755462605: goto L_0x0140;
                default: goto L_0x013f;
            }
        L_0x013f:
            goto L_0x017c
        L_0x0140:
            java.lang.String r12 = "top-center"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L_0x017c
            r3 = r7
            goto L_0x017d
        L_0x014a:
            java.lang.String r12 = "bottom-center"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L_0x017c
            r3 = r10
            goto L_0x017d
        L_0x0154:
            java.lang.String r12 = "bottom-right"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L_0x017c
            r3 = r9
            goto L_0x017d
        L_0x015e:
            java.lang.String r12 = "bottom-left"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L_0x017c
            r3 = r11
            goto L_0x017d
        L_0x0168:
            java.lang.String r12 = "top-left"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L_0x017c
            r3 = r5
            goto L_0x017d
        L_0x0172:
            java.lang.String r12 = "center"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L_0x017c
            r3 = r13
            goto L_0x017d
        L_0x017c:
            r3 = -1
        L_0x017d:
            if (r3 == 0) goto L_0x01dc
            if (r3 == r7) goto L_0x01ce
            if (r3 == r13) goto L_0x01ba
            if (r3 == r11) goto L_0x01ad
            if (r3 == r10) goto L_0x019f
            if (r3 == r9) goto L_0x0194
            int r3 = r1.f17706e     // Catch:{ all -> 0x0471 }
            int r12 = r1.f17709h     // Catch:{ all -> 0x0471 }
            int r3 = r3 + r12
            int r3 = r3 + r8
            int r3 = r3 + -50
            int r8 = r1.f17707f     // Catch:{ all -> 0x0471 }
            goto L_0x01d9
        L_0x0194:
            int r3 = r1.f17706e     // Catch:{ all -> 0x0471 }
            int r12 = r1.f17709h     // Catch:{ all -> 0x0471 }
            int r3 = r3 + r12
            int r3 = r3 + r8
            int r3 = r3 + -50
            int r8 = r1.f17707f     // Catch:{ all -> 0x0471 }
            goto L_0x01aa
        L_0x019f:
            int r3 = r1.f17706e     // Catch:{ all -> 0x0471 }
            int r12 = r1.f17709h     // Catch:{ all -> 0x0471 }
            int r3 = r3 + r12
            int r8 = r8 >> r7
            int r3 = r3 + r8
            int r3 = r3 + -25
            int r8 = r1.f17707f     // Catch:{ all -> 0x0471 }
        L_0x01aa:
            int r12 = r1.f17710i     // Catch:{ all -> 0x0471 }
            goto L_0x01b5
        L_0x01ad:
            int r3 = r1.f17706e     // Catch:{ all -> 0x0471 }
            int r8 = r1.f17709h     // Catch:{ all -> 0x0471 }
            int r3 = r3 + r8
            int r8 = r1.f17707f     // Catch:{ all -> 0x0471 }
            goto L_0x01aa
        L_0x01b5:
            int r8 = r8 + r12
            int r8 = r8 + r15
            int r8 = r8 + -50
            goto L_0x01e5
        L_0x01ba:
            int r3 = r1.f17706e     // Catch:{ all -> 0x0471 }
            int r12 = r1.f17709h     // Catch:{ all -> 0x0471 }
            int r3 = r3 + r12
            int r8 = r8 >> r7
            int r3 = r3 + r8
            int r3 = r3 + -25
            int r8 = r1.f17707f     // Catch:{ all -> 0x0471 }
            int r12 = r1.f17710i     // Catch:{ all -> 0x0471 }
            int r8 = r8 + r12
            int r12 = r15 >> 1
            int r8 = r8 + r12
            int r8 = r8 + -25
            goto L_0x01e5
        L_0x01ce:
            int r3 = r1.f17706e     // Catch:{ all -> 0x0471 }
            int r12 = r1.f17709h     // Catch:{ all -> 0x0471 }
            int r3 = r3 + r12
            int r8 = r8 >> r7
            int r3 = r3 + r8
            int r3 = r3 + -25
            int r8 = r1.f17707f     // Catch:{ all -> 0x0471 }
        L_0x01d9:
            int r12 = r1.f17710i     // Catch:{ all -> 0x0471 }
            goto L_0x01e4
        L_0x01dc:
            int r3 = r1.f17706e     // Catch:{ all -> 0x0471 }
            int r8 = r1.f17709h     // Catch:{ all -> 0x0471 }
            int r3 = r3 + r8
            int r8 = r1.f17707f     // Catch:{ all -> 0x0471 }
            goto L_0x01d9
        L_0x01e4:
            int r8 = r8 + r12
        L_0x01e5:
            if (r3 < 0) goto L_0x024e
            int r3 = r3 + r14
            if (r3 > r6) goto L_0x024e
            r3 = r4[r5]     // Catch:{ all -> 0x0471 }
            if (r8 < r3) goto L_0x024e
            int r8 = r8 + r14
            r3 = r4[r7]     // Catch:{ all -> 0x0471 }
            if (r8 <= r3) goto L_0x01f4
            goto L_0x024e
        L_0x01f4:
            int[] r15 = new int[r13]     // Catch:{ all -> 0x0471 }
            int r3 = r1.f17706e     // Catch:{ all -> 0x0471 }
            int r4 = r1.f17709h     // Catch:{ all -> 0x0471 }
            int r3 = r3 + r4
            r15[r5] = r3     // Catch:{ all -> 0x0471 }
            int r3 = r1.f17707f     // Catch:{ all -> 0x0471 }
            int r4 = r1.f17710i     // Catch:{ all -> 0x0471 }
            int r3 = r3 + r4
            r15[r7] = r3     // Catch:{ all -> 0x0471 }
            goto L_0x024f
        L_0x0205:
            p054h1.C2694t.m21608q()     // Catch:{ all -> 0x0471 }
            android.app.Activity r3 = r1.f17714m     // Catch:{ all -> 0x0471 }
            int[] r3 = p069j1.C3163g2.m23950z(r3)     // Catch:{ all -> 0x0471 }
            p054h1.C2694t.m21608q()     // Catch:{ all -> 0x0471 }
            android.app.Activity r4 = r1.f17714m     // Catch:{ all -> 0x0471 }
            int[] r4 = p069j1.C3163g2.m23947w(r4)     // Catch:{ all -> 0x0471 }
            r3 = r3[r5]     // Catch:{ all -> 0x0471 }
            int r6 = r1.f17706e     // Catch:{ all -> 0x0471 }
            int r8 = r1.f17709h     // Catch:{ all -> 0x0471 }
            int r6 = r6 + r8
            int r8 = r1.f17707f     // Catch:{ all -> 0x0471 }
            int r12 = r1.f17710i     // Catch:{ all -> 0x0471 }
            int r8 = r8 + r12
            if (r6 >= 0) goto L_0x0227
            r6 = r5
            goto L_0x022f
        L_0x0227:
            int r12 = r1.f17711j     // Catch:{ all -> 0x0471 }
            int r15 = r6 + r12
            if (r15 <= r3) goto L_0x022f
            int r6 = r3 - r12
        L_0x022f:
            r3 = r4[r5]     // Catch:{ all -> 0x0471 }
            if (r8 >= r3) goto L_0x0235
            r8 = r3
            goto L_0x023f
        L_0x0235:
            int r3 = r1.f17708g     // Catch:{ all -> 0x0471 }
            int r12 = r8 + r3
            r4 = r4[r7]     // Catch:{ all -> 0x0471 }
            if (r12 <= r4) goto L_0x023f
            int r8 = r4 - r3
        L_0x023f:
            int[] r15 = new int[r13]     // Catch:{ all -> 0x0471 }
            r15[r5] = r6     // Catch:{ all -> 0x0471 }
            r15[r7] = r8     // Catch:{ all -> 0x0471 }
            goto L_0x024f
        L_0x0246:
            java.lang.String r3 = "Height is too small or too large."
            goto L_0x024b
        L_0x0249:
            java.lang.String r3 = "Width is too small or too large."
        L_0x024b:
            com.google.android.gms.internal.ads.io0.m11131g(r3)     // Catch:{ all -> 0x0471 }
        L_0x024e:
            r15 = 0
        L_0x024f:
            if (r15 != 0) goto L_0x0258
            java.lang.String r0 = "Resize location out of screen or close button is not visible."
            r1.mo6948c(r0)     // Catch:{ all -> 0x0471 }
            monitor-exit(r2)     // Catch:{ all -> 0x0471 }
            return
        L_0x0258:
            com.google.android.gms.internal.ads.C2125qw.m15897b()     // Catch:{ all -> 0x0471 }
            android.app.Activity r3 = r1.f17714m     // Catch:{ all -> 0x0471 }
            int r4 = r1.f17711j     // Catch:{ all -> 0x0471 }
            int r3 = com.google.android.gms.internal.ads.bo0.m6995s(r3, r4)     // Catch:{ all -> 0x0471 }
            com.google.android.gms.internal.ads.C2125qw.m15897b()     // Catch:{ all -> 0x0471 }
            android.app.Activity r4 = r1.f17714m     // Catch:{ all -> 0x0471 }
            int r6 = r1.f17708g     // Catch:{ all -> 0x0471 }
            int r4 = com.google.android.gms.internal.ads.bo0.m6995s(r4, r6)     // Catch:{ all -> 0x0471 }
            com.google.android.gms.internal.ads.eu0 r6 = r1.f17713l     // Catch:{ all -> 0x0471 }
            android.view.View r6 = (android.view.View) r6     // Catch:{ all -> 0x0471 }
            android.view.ViewParent r6 = r6.getParent()     // Catch:{ all -> 0x0471 }
            if (r6 == 0) goto L_0x0455
            boolean r8 = r6 instanceof android.view.ViewGroup     // Catch:{ all -> 0x0471 }
            if (r8 == 0) goto L_0x0455
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6     // Catch:{ all -> 0x0471 }
            com.google.android.gms.internal.ads.eu0 r8 = r1.f17713l     // Catch:{ all -> 0x0471 }
            android.view.View r8 = (android.view.View) r8     // Catch:{ all -> 0x0471 }
            r6.removeView(r8)     // Catch:{ all -> 0x0471 }
            android.widget.PopupWindow r8 = r1.f17719r     // Catch:{ all -> 0x0471 }
            if (r8 != 0) goto L_0x02c2
            r1.f17721t = r6     // Catch:{ all -> 0x0471 }
            p054h1.C2694t.m21608q()     // Catch:{ all -> 0x0471 }
            com.google.android.gms.internal.ads.eu0 r6 = r1.f17713l     // Catch:{ all -> 0x0471 }
            r8 = r6
            android.view.View r8 = (android.view.View) r8     // Catch:{ all -> 0x0471 }
            r8.setDrawingCacheEnabled(r7)     // Catch:{ all -> 0x0471 }
            r8 = r6
            android.view.View r8 = (android.view.View) r8     // Catch:{ all -> 0x0471 }
            android.graphics.Bitmap r8 = r8.getDrawingCache()     // Catch:{ all -> 0x0471 }
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r8)     // Catch:{ all -> 0x0471 }
            android.view.View r6 = (android.view.View) r6     // Catch:{ all -> 0x0471 }
            r6.setDrawingCacheEnabled(r5)     // Catch:{ all -> 0x0471 }
            android.widget.ImageView r6 = new android.widget.ImageView     // Catch:{ all -> 0x0471 }
            android.app.Activity r12 = r1.f17714m     // Catch:{ all -> 0x0471 }
            r6.<init>(r12)     // Catch:{ all -> 0x0471 }
            r1.f17716o = r6     // Catch:{ all -> 0x0471 }
            r6.setImageBitmap(r8)     // Catch:{ all -> 0x0471 }
            com.google.android.gms.internal.ads.eu0 r6 = r1.f17713l     // Catch:{ all -> 0x0471 }
            com.google.android.gms.internal.ads.vv0 r6 = r6.mo7151x()     // Catch:{ all -> 0x0471 }
            r1.f17715n = r6     // Catch:{ all -> 0x0471 }
            android.view.ViewGroup r6 = r1.f17721t     // Catch:{ all -> 0x0471 }
            android.widget.ImageView r8 = r1.f17716o     // Catch:{ all -> 0x0471 }
            r6.addView(r8)     // Catch:{ all -> 0x0471 }
            goto L_0x02c5
        L_0x02c2:
            r8.dismiss()     // Catch:{ all -> 0x0471 }
        L_0x02c5:
            android.widget.RelativeLayout r6 = new android.widget.RelativeLayout     // Catch:{ all -> 0x0471 }
            android.app.Activity r8 = r1.f17714m     // Catch:{ all -> 0x0471 }
            r6.<init>(r8)     // Catch:{ all -> 0x0471 }
            r1.f17720s = r6     // Catch:{ all -> 0x0471 }
            r6.setBackgroundColor(r5)     // Catch:{ all -> 0x0471 }
            android.widget.RelativeLayout r6 = r1.f17720s     // Catch:{ all -> 0x0471 }
            android.view.ViewGroup$LayoutParams r8 = new android.view.ViewGroup$LayoutParams     // Catch:{ all -> 0x0471 }
            r8.<init>(r3, r4)     // Catch:{ all -> 0x0471 }
            r6.setLayoutParams(r8)     // Catch:{ all -> 0x0471 }
            p054h1.C2694t.m21608q()     // Catch:{ all -> 0x0471 }
            android.widget.RelativeLayout r6 = r1.f17720s     // Catch:{ all -> 0x0471 }
            android.widget.PopupWindow r8 = new android.widget.PopupWindow     // Catch:{ all -> 0x0471 }
            r8.<init>(r6, r3, r4, r5)     // Catch:{ all -> 0x0471 }
            r1.f17719r = r8     // Catch:{ all -> 0x0471 }
            r8.setOutsideTouchable(r5)     // Catch:{ all -> 0x0471 }
            android.widget.PopupWindow r6 = r1.f17719r     // Catch:{ all -> 0x0471 }
            r6.setTouchable(r7)     // Catch:{ all -> 0x0471 }
            android.widget.PopupWindow r6 = r1.f17719r     // Catch:{ all -> 0x0471 }
            boolean r8 = r1.f17705d     // Catch:{ all -> 0x0471 }
            r8 = r8 ^ r7
            r6.setClippingEnabled(r8)     // Catch:{ all -> 0x0471 }
            android.widget.RelativeLayout r6 = r1.f17720s     // Catch:{ all -> 0x0471 }
            com.google.android.gms.internal.ads.eu0 r8 = r1.f17713l     // Catch:{ all -> 0x0471 }
            android.view.View r8 = (android.view.View) r8     // Catch:{ all -> 0x0471 }
            r12 = -1
            r6.addView(r8, r12, r12)     // Catch:{ all -> 0x0471 }
            android.widget.LinearLayout r6 = new android.widget.LinearLayout     // Catch:{ all -> 0x0471 }
            android.app.Activity r8 = r1.f17714m     // Catch:{ all -> 0x0471 }
            r6.<init>(r8)     // Catch:{ all -> 0x0471 }
            r1.f17717p = r6     // Catch:{ all -> 0x0471 }
            android.widget.RelativeLayout$LayoutParams r6 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ all -> 0x0471 }
            com.google.android.gms.internal.ads.C2125qw.m15897b()     // Catch:{ all -> 0x0471 }
            android.app.Activity r8 = r1.f17714m     // Catch:{ all -> 0x0471 }
            int r8 = com.google.android.gms.internal.ads.bo0.m6995s(r8, r14)     // Catch:{ all -> 0x0471 }
            com.google.android.gms.internal.ads.C2125qw.m15897b()     // Catch:{ all -> 0x0471 }
            android.app.Activity r12 = r1.f17714m     // Catch:{ all -> 0x0471 }
            int r12 = com.google.android.gms.internal.ads.bo0.m6995s(r12, r14)     // Catch:{ all -> 0x0471 }
            r6.<init>(r8, r12)     // Catch:{ all -> 0x0471 }
            java.lang.String r8 = r1.f17704c     // Catch:{ all -> 0x0471 }
            int r12 = r8.hashCode()     // Catch:{ all -> 0x0471 }
            switch(r12) {
                case -1364013995: goto L_0x035d;
                case -1012429441: goto L_0x0353;
                case -655373719: goto L_0x0349;
                case 1163912186: goto L_0x033f;
                case 1288627767: goto L_0x0335;
                case 1755462605: goto L_0x032b;
                default: goto L_0x032a;
            }
        L_0x032a:
            goto L_0x0367
        L_0x032b:
            java.lang.String r12 = "top-center"
            boolean r8 = r8.equals(r12)
            if (r8 == 0) goto L_0x0367
            r12 = r7
            goto L_0x0368
        L_0x0335:
            java.lang.String r12 = "bottom-center"
            boolean r8 = r8.equals(r12)
            if (r8 == 0) goto L_0x0367
            r12 = r10
            goto L_0x0368
        L_0x033f:
            java.lang.String r12 = "bottom-right"
            boolean r8 = r8.equals(r12)
            if (r8 == 0) goto L_0x0367
            r12 = r9
            goto L_0x0368
        L_0x0349:
            java.lang.String r12 = "bottom-left"
            boolean r8 = r8.equals(r12)
            if (r8 == 0) goto L_0x0367
            r12 = r11
            goto L_0x0368
        L_0x0353:
            java.lang.String r12 = "top-left"
            boolean r8 = r8.equals(r12)
            if (r8 == 0) goto L_0x0367
            r12 = r5
            goto L_0x0368
        L_0x035d:
            java.lang.String r12 = "center"
            boolean r8 = r8.equals(r12)
            if (r8 == 0) goto L_0x0367
            r12 = r13
            goto L_0x0368
        L_0x0367:
            r12 = -1
        L_0x0368:
            r8 = 9
            r14 = 10
            if (r12 == 0) goto L_0x039e
            r5 = 14
            if (r12 == r7) goto L_0x039a
            if (r12 == r13) goto L_0x0394
            r13 = 12
            if (r12 == r11) goto L_0x038d
            if (r12 == r10) goto L_0x0389
            r5 = 11
            if (r12 == r9) goto L_0x0385
            r6.addRule(r14)     // Catch:{ all -> 0x0471 }
        L_0x0381:
            r6.addRule(r5)     // Catch:{ all -> 0x0471 }
            goto L_0x03a2
        L_0x0385:
            r6.addRule(r13)     // Catch:{ all -> 0x0471 }
            goto L_0x0381
        L_0x0389:
            r6.addRule(r13)     // Catch:{ all -> 0x0471 }
            goto L_0x0381
        L_0x038d:
            r6.addRule(r13)     // Catch:{ all -> 0x0471 }
        L_0x0390:
            r6.addRule(r8)     // Catch:{ all -> 0x0471 }
            goto L_0x03a2
        L_0x0394:
            r5 = 13
            r6.addRule(r5)     // Catch:{ all -> 0x0471 }
            goto L_0x03a2
        L_0x039a:
            r6.addRule(r14)     // Catch:{ all -> 0x0471 }
            goto L_0x0381
        L_0x039e:
            r6.addRule(r14)     // Catch:{ all -> 0x0471 }
            goto L_0x0390
        L_0x03a2:
            android.widget.LinearLayout r5 = r1.f17717p     // Catch:{ all -> 0x0471 }
            com.google.android.gms.internal.ads.xf0 r8 = new com.google.android.gms.internal.ads.xf0     // Catch:{ all -> 0x0471 }
            r8.<init>(r1)     // Catch:{ all -> 0x0471 }
            r5.setOnClickListener(r8)     // Catch:{ all -> 0x0471 }
            android.widget.LinearLayout r5 = r1.f17717p     // Catch:{ all -> 0x0471 }
            java.lang.String r8 = "Close button"
            r5.setContentDescription(r8)     // Catch:{ all -> 0x0471 }
            android.widget.RelativeLayout r5 = r1.f17720s     // Catch:{ all -> 0x0471 }
            android.widget.LinearLayout r8 = r1.f17717p     // Catch:{ all -> 0x0471 }
            r5.addView(r8, r6)     // Catch:{ all -> 0x0471 }
            android.widget.PopupWindow r5 = r1.f17719r     // Catch:{ RuntimeException -> 0x0413 }
            android.view.View r0 = r0.getDecorView()     // Catch:{ RuntimeException -> 0x0413 }
            com.google.android.gms.internal.ads.C2125qw.m15897b()     // Catch:{ RuntimeException -> 0x0413 }
            android.app.Activity r6 = r1.f17714m     // Catch:{ RuntimeException -> 0x0413 }
            r8 = 0
            r9 = r15[r8]     // Catch:{ RuntimeException -> 0x0413 }
            int r6 = com.google.android.gms.internal.ads.bo0.m6995s(r6, r9)     // Catch:{ RuntimeException -> 0x0413 }
            com.google.android.gms.internal.ads.C2125qw.m15897b()     // Catch:{ RuntimeException -> 0x0413 }
            android.app.Activity r8 = r1.f17714m     // Catch:{ RuntimeException -> 0x0413 }
            r9 = r15[r7]     // Catch:{ RuntimeException -> 0x0413 }
            int r8 = com.google.android.gms.internal.ads.bo0.m6995s(r8, r9)     // Catch:{ RuntimeException -> 0x0413 }
            r9 = 0
            r5.showAtLocation(r0, r9, r6, r8)     // Catch:{ RuntimeException -> 0x0413 }
            r0 = r15[r9]     // Catch:{ all -> 0x0471 }
            r5 = r15[r7]     // Catch:{ all -> 0x0471 }
            com.google.android.gms.internal.ads.fg0 r6 = r1.f17718q     // Catch:{ all -> 0x0471 }
            if (r6 == 0) goto L_0x03ea
            int r8 = r1.f17711j     // Catch:{ all -> 0x0471 }
            int r9 = r1.f17708g     // Catch:{ all -> 0x0471 }
            r6.mo6301b(r0, r5, r8, r9)     // Catch:{ all -> 0x0471 }
        L_0x03ea:
            com.google.android.gms.internal.ads.eu0 r0 = r1.f17713l     // Catch:{ all -> 0x0471 }
            com.google.android.gms.internal.ads.vv0 r3 = com.google.android.gms.internal.ads.vv0.m18687b(r3, r4)     // Catch:{ all -> 0x0471 }
            r0.mo7115g0(r3)     // Catch:{ all -> 0x0471 }
            r0 = 0
            r3 = r15[r0]     // Catch:{ all -> 0x0471 }
            r0 = r15[r7]     // Catch:{ all -> 0x0471 }
            p054h1.C2694t.m21608q()     // Catch:{ all -> 0x0471 }
            android.app.Activity r4 = r1.f17714m     // Catch:{ all -> 0x0471 }
            int[] r4 = p069j1.C3163g2.m23947w(r4)     // Catch:{ all -> 0x0471 }
            r5 = 0
            r4 = r4[r5]     // Catch:{ all -> 0x0471 }
            int r0 = r0 - r4
            int r4 = r1.f17711j     // Catch:{ all -> 0x0471 }
            int r5 = r1.f17708g     // Catch:{ all -> 0x0471 }
            r1.mo6951f(r3, r0, r4, r5)     // Catch:{ all -> 0x0471 }
            java.lang.String r0 = "resized"
            r1.mo6952g(r0)     // Catch:{ all -> 0x0471 }
            monitor-exit(r2)     // Catch:{ all -> 0x0471 }
            return
        L_0x0413:
            r0 = move-exception
            java.lang.String r3 = "Cannot show popup window: "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0471 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0471 }
            int r4 = r0.length()     // Catch:{ all -> 0x0471 }
            if (r4 == 0) goto L_0x0429
            java.lang.String r0 = r3.concat(r0)     // Catch:{ all -> 0x0471 }
            goto L_0x042e
        L_0x0429:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0471 }
            r0.<init>(r3)     // Catch:{ all -> 0x0471 }
        L_0x042e:
            r1.mo6948c(r0)     // Catch:{ all -> 0x0471 }
            android.widget.RelativeLayout r0 = r1.f17720s     // Catch:{ all -> 0x0471 }
            com.google.android.gms.internal.ads.eu0 r3 = r1.f17713l     // Catch:{ all -> 0x0471 }
            android.view.View r3 = (android.view.View) r3     // Catch:{ all -> 0x0471 }
            r0.removeView(r3)     // Catch:{ all -> 0x0471 }
            android.view.ViewGroup r0 = r1.f17721t     // Catch:{ all -> 0x0471 }
            if (r0 == 0) goto L_0x0453
            android.widget.ImageView r3 = r1.f17716o     // Catch:{ all -> 0x0471 }
            r0.removeView(r3)     // Catch:{ all -> 0x0471 }
            android.view.ViewGroup r0 = r1.f17721t     // Catch:{ all -> 0x0471 }
            com.google.android.gms.internal.ads.eu0 r3 = r1.f17713l     // Catch:{ all -> 0x0471 }
            android.view.View r3 = (android.view.View) r3     // Catch:{ all -> 0x0471 }
            r0.addView(r3)     // Catch:{ all -> 0x0471 }
            com.google.android.gms.internal.ads.eu0 r0 = r1.f17713l     // Catch:{ all -> 0x0471 }
            com.google.android.gms.internal.ads.vv0 r3 = r1.f17715n     // Catch:{ all -> 0x0471 }
            r0.mo7115g0(r3)     // Catch:{ all -> 0x0471 }
        L_0x0453:
            monitor-exit(r2)     // Catch:{ all -> 0x0471 }
            return
        L_0x0455:
            java.lang.String r0 = "Webview is detached, probably in the middle of a resize or expand."
            r1.mo6948c(r0)     // Catch:{ all -> 0x0471 }
            monitor-exit(r2)     // Catch:{ all -> 0x0471 }
            return
        L_0x045c:
            java.lang.String r0 = "Activity context is not ready, cannot get window or decor view."
            r1.mo6948c(r0)     // Catch:{ all -> 0x0471 }
            monitor-exit(r2)     // Catch:{ all -> 0x0471 }
            return
        L_0x0463:
            java.lang.String r0 = "Invalid width and height options. Cannot resize."
            r1.mo6948c(r0)     // Catch:{ all -> 0x0471 }
            monitor-exit(r2)     // Catch:{ all -> 0x0471 }
            return
        L_0x046a:
            java.lang.String r0 = "Cannot resize an expanded banner."
            r1.mo6948c(r0)     // Catch:{ all -> 0x0471 }
            monitor-exit(r2)     // Catch:{ all -> 0x0471 }
            return
        L_0x0471:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0471 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yf0.mo12005i(java.util.Map):void");
    }

    /* renamed from: j */
    public final void mo12006j(int i, int i2, boolean z) {
        synchronized (this.f17712k) {
            this.f17706e = i;
            this.f17707f = i2;
        }
    }

    /* renamed from: k */
    public final void mo12007k(int i, int i2) {
        this.f17706e = i;
        this.f17707f = i2;
    }

    /* renamed from: l */
    public final boolean mo12008l() {
        boolean z;
        synchronized (this.f17712k) {
            z = this.f17719r != null;
        }
        return z;
    }
}
