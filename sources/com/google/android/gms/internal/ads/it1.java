package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.widget.PopupWindow;

@TargetApi(19)
public final class it1 {

    /* renamed from: a */
    private Context f8797a;

    /* renamed from: b */
    private PopupWindow f8798b;

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8275a(android.content.Context r7, android.view.View r8) {
        /*
            r6 = this;
            boolean r0 = p034e2.C2555l.m21211e()
            if (r0 == 0) goto L_0x0061
            boolean r0 = p034e2.C2555l.m21213g()
            if (r0 == 0) goto L_0x000d
            goto L_0x0061
        L_0x000d:
            boolean r0 = r7 instanceof android.app.Activity
            r1 = 0
            if (r0 == 0) goto L_0x001a
            r0 = r7
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            goto L_0x001b
        L_0x001a:
            r0 = r1
        L_0x001b:
            if (r0 == 0) goto L_0x0059
            android.view.View r2 = r0.getDecorView()
            if (r2 != 0) goto L_0x0024
            goto L_0x0059
        L_0x0024:
            r2 = r7
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r2 = r2.isDestroyed()
            if (r2 == 0) goto L_0x002e
            goto L_0x0059
        L_0x002e:
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r7)
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r4 = -1
            r3.<init>(r4, r4)
            r2.setLayoutParams(r3)
            r2.addView(r8, r4, r4)
            android.widget.PopupWindow r8 = new android.widget.PopupWindow
            r3 = 1
            r5 = 0
            r8.<init>(r2, r3, r3, r5)
            r8.setOutsideTouchable(r3)
            r8.setClippingEnabled(r5)
            java.lang.String r2 = "Displaying the 1x1 popup off the screen."
            com.google.android.gms.internal.ads.io0.m11126b(r2)
            android.view.View r0 = r0.getDecorView()     // Catch:{ Exception -> 0x0059 }
            r8.showAtLocation(r0, r5, r4, r4)     // Catch:{ Exception -> 0x0059 }
            goto L_0x005a
        L_0x0059:
            r8 = r1
        L_0x005a:
            r6.f8798b = r8
            if (r8 != 0) goto L_0x005f
            r7 = r1
        L_0x005f:
            r6.f8797a = r7
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.it1.mo8275a(android.content.Context, android.view.View):void");
    }

    /* renamed from: b */
    public final void mo8276b() {
        Context context = this.f8797a;
        if (context != null && this.f8798b != null) {
            if ((!(context instanceof Activity) || !((Activity) context).isDestroyed()) && this.f8798b.isShowing()) {
                this.f8798b.dismiss();
            }
            this.f8797a = null;
            this.f8798b = null;
        }
    }
}
