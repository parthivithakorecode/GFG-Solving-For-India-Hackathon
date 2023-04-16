package p061i1;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.gms.internal.ads.C2125qw;
import com.google.android.gms.internal.ads.C2199sw;
import com.google.android.gms.internal.ads.bo0;
import com.google.android.gms.internal.ads.m10;

/* renamed from: i1.t */
public final class C2821t extends FrameLayout implements View.OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final ImageButton f19515f;

    /* renamed from: g */
    private final C2802b f19516g;

    public C2821t(Context context, C2820s sVar, C2802b bVar) {
        super(context);
        this.f19516g = bVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.f19515f = imageButton;
        m22293c();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        C2125qw.m15897b();
        int s = bo0.m6995s(context, sVar.f19511a);
        C2125qw.m15897b();
        int s2 = bo0.m6995s(context, 0);
        C2125qw.m15897b();
        int s3 = bo0.m6995s(context, sVar.f19512b);
        C2125qw.m15897b();
        imageButton.setPadding(s, s2, s3, bo0.m6995s(context, sVar.f19513c));
        imageButton.setContentDescription("Interstitial close button");
        C2125qw.m15897b();
        int s4 = bo0.m6995s(context, sVar.f19514d + sVar.f19511a + sVar.f19512b);
        C2125qw.m15897b();
        addView(imageButton, new FrameLayout.LayoutParams(s4, bo0.m6995s(context, sVar.f19514d + sVar.f19513c), 17));
        long longValue = ((Long) C2199sw.m17001c().mo8579b(m10.f10362Q0)).longValue();
        if (longValue > 0) {
            C2819r rVar = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10370R0)).booleanValue() ? new C2819r(this) : null;
            imageButton.setAlpha(0.0f);
            imageButton.animate().alpha(1.0f).setDuration(longValue).setListener(rVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0056  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m22293c() {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.e10<java.lang.String> r0 = com.google.android.gms.internal.ads.m10.f10354P0
            com.google.android.gms.internal.ads.k10 r1 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r0 = r1.mo8579b(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = p034e2.C2555l.m21213g()
            r2 = 17301527(0x1080017, float:2.497932E-38)
            if (r1 == 0) goto L_0x0067
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0067
            java.lang.String r1 = "default"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0024
            goto L_0x0067
        L_0x0024:
            com.google.android.gms.internal.ads.tn0 r1 = p054h1.C2694t.m21607p()
            android.content.res.Resources r1 = r1.mo11022d()
            if (r1 == 0) goto L_0x0061
            r3 = 0
            java.lang.String r4 = "white"
            boolean r4 = r4.equals(r0)     // Catch:{ NotFoundException -> 0x0049 }
            if (r4 == 0) goto L_0x003e
            int r0 = p040f1.C2602a.admob_close_button_white_circle_black_cross     // Catch:{ NotFoundException -> 0x0049 }
        L_0x0039:
            android.graphics.drawable.Drawable r3 = r1.getDrawable(r0)     // Catch:{ NotFoundException -> 0x0049 }
            goto L_0x004e
        L_0x003e:
            java.lang.String r4 = "black"
            boolean r0 = r4.equals(r0)     // Catch:{ NotFoundException -> 0x0049 }
            if (r0 == 0) goto L_0x004e
            int r0 = p040f1.C2602a.admob_close_button_black_circle_white_cross     // Catch:{ NotFoundException -> 0x0049 }
            goto L_0x0039
        L_0x0049:
            java.lang.String r0 = "Close button resource not found, falling back to default."
            com.google.android.gms.internal.ads.io0.m11126b(r0)
        L_0x004e:
            android.widget.ImageButton r0 = r5.f19515f
            if (r3 != 0) goto L_0x0056
            r0.setImageResource(r2)
            return
        L_0x0056:
            r0.setImageDrawable(r3)
            android.widget.ImageButton r0 = r5.f19515f
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER
            r0.setScaleType(r1)
            return
        L_0x0061:
            android.widget.ImageButton r0 = r5.f19515f
            r0.setImageResource(r2)
            return
        L_0x0067:
            android.widget.ImageButton r0 = r5.f19515f
            r0.setImageResource(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p061i1.C2821t.m22293c():void");
    }

    /* renamed from: b */
    public final void mo13085b(boolean z) {
        if (z) {
            this.f19515f.setVisibility(8);
            if (((Long) C2199sw.m17001c().mo8579b(m10.f10362Q0)).longValue() > 0) {
                this.f19515f.animate().cancel();
                this.f19515f.clearAnimation();
                return;
            }
            return;
        }
        this.f19515f.setVisibility(0);
    }

    public final void onClick(View view) {
        C2802b bVar = this.f19516g;
        if (bVar != null) {
            bVar.mo7968C0();
        }
    }
}
