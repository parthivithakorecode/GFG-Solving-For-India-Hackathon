package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashMap;
import javax.annotation.ParametersAreNonnullByDefault;
import p003a2.C0092o;
import p054h1.C2694t;
import p069j1.C3163g2;
import p069j1.C3202r1;

@ParametersAreNonnullByDefault
public final class gq0 extends FrameLayout implements yp0 {

    /* renamed from: f */
    private final tq0 f7554f;

    /* renamed from: g */
    private final FrameLayout f7555g;

    /* renamed from: h */
    private final View f7556h;

    /* renamed from: i */
    private final b20 f7557i;

    /* renamed from: j */
    private final vq0 f7558j;

    /* renamed from: k */
    private final long f7559k;

    /* renamed from: l */
    private final zp0 f7560l;

    /* renamed from: m */
    private boolean f7561m;

    /* renamed from: n */
    private boolean f7562n;

    /* renamed from: o */
    private boolean f7563o;

    /* renamed from: p */
    private boolean f7564p;

    /* renamed from: q */
    private long f7565q;

    /* renamed from: r */
    private long f7566r;

    /* renamed from: s */
    private String f7567s;

    /* renamed from: t */
    private String[] f7568t;

    /* renamed from: u */
    private Bitmap f7569u;

    /* renamed from: v */
    private final ImageView f7570v;

    /* renamed from: w */
    private boolean f7571w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gq0(Context context, tq0 tq0, int i, boolean z, b20 b20, sq0 sq0) {
        super(context);
        zp0 zp0;
        Context context2 = context;
        b20 b202 = b20;
        this.f7554f = tq0;
        this.f7557i = b202;
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f7555g = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        C0092o.m313i(tq0.mo7135o());
        aq0 aq0 = tq0.mo7135o().f19104a;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null || applicationInfo.targetSdkVersion >= 11) {
            uq0 uq0 = new uq0(context, tq0.mo7129l(), tq0.mo11073y(), b20, tq0.mo11070m());
            if (i == 2) {
                zp0 = new kr0(context, uq0, tq0, z, aq0.m6202a(tq0), sq0);
            } else {
                Context context3 = context;
                zp0 = new xp0(context3, tq0, z, aq0.m6202a(tq0), sq0, new uq0(context3, tq0.mo7129l(), tq0.mo11073y(), b20, tq0.mo11070m()));
            }
        } else {
            zp0 = null;
        }
        this.f7560l = zp0;
        View view = new View(context2);
        this.f7556h = view;
        view.setBackgroundColor(0);
        if (zp0 != null) {
            frameLayout.addView(zp0, new FrameLayout.LayoutParams(-1, -1, 17));
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10233A)).booleanValue()) {
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.bringChildToFront(view);
            }
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10643x)).booleanValue()) {
                mo7701u();
            }
        }
        this.f7570v = new ImageView(context2);
        this.f7559k = ((Long) C2199sw.m17001c().mo8579b(m10.f10249C)).longValue();
        boolean booleanValue = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10659z)).booleanValue();
        this.f7564p = booleanValue;
        if (b202 != null) {
            b202.mo5631d("spinner_used", true != booleanValue ? "0" : "1");
        }
        this.f7558j = new vq0(this);
        if (zp0 != null) {
            zp0.mo8772u(this);
        }
        if (zp0 == null) {
            mo7681a("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    /* renamed from: q */
    private final void m9864q() {
        if (this.f7554f.mo7127j() != null && this.f7562n && !this.f7563o) {
            this.f7554f.mo7127j().getWindow().clearFlags(128);
            this.f7562n = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final void m9865r(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.f7554f.mo6424t("onVideoEvent", hashMap);
    }

    /* renamed from: s */
    private final boolean m9866s() {
        return this.f7570v.getParent() != null;
    }

    /* renamed from: A */
    public final void mo7673A() {
        zp0 zp0 = this.f7560l;
        if (zp0 != null) {
            zp0.mo8769q();
        }
    }

    /* renamed from: B */
    public final void mo7674B() {
        zp0 zp0 = this.f7560l;
        if (zp0 != null) {
            zp0.mo8770r();
        }
    }

    /* renamed from: C */
    public final void mo7675C(int i) {
        zp0 zp0 = this.f7560l;
        if (zp0 != null) {
            zp0.mo8771t(i);
        }
    }

    @TargetApi(14)
    /* renamed from: D */
    public final void mo7676D(MotionEvent motionEvent) {
        zp0 zp0 = this.f7560l;
        if (zp0 != null) {
            zp0.dispatchTouchEvent(motionEvent);
        }
    }

    /* renamed from: E */
    public final void mo7677E(int i) {
        this.f7560l.mo8776z(i);
    }

    /* renamed from: F */
    public final void mo7678F(int i) {
        this.f7560l.mo8734A(i);
    }

    /* renamed from: G */
    public final void mo7679G(int i) {
        this.f7560l.mo8735B(i);
    }

    /* renamed from: H */
    public final void mo7680H(int i) {
        this.f7560l.mo8736C(i);
    }

    /* renamed from: a */
    public final void mo7681a(String str, String str2) {
        m9865r("error", "what", str, "extra", str2);
    }

    /* renamed from: b */
    public final void mo7682b() {
        if (this.f7554f.mo7127j() != null && !this.f7562n) {
            boolean z = (this.f7554f.mo7127j().getWindow().getAttributes().flags & 128) != 0;
            this.f7563o = z;
            if (!z) {
                this.f7554f.mo7127j().getWindow().addFlags(128);
                this.f7562n = true;
            }
        }
        this.f7561m = true;
    }

    /* renamed from: c */
    public final void mo7683c(int i, int i2) {
        if (this.f7564p) {
            e10 e10 = m10.f10241B;
            int max = Math.max(i / ((Integer) C2199sw.m17001c().mo8579b(e10)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) C2199sw.m17001c().mo8579b(e10)).intValue(), 1);
            Bitmap bitmap = this.f7569u;
            if (bitmap == null || bitmap.getWidth() != max || this.f7569u.getHeight() != max2) {
                this.f7569u = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                this.f7571w = false;
            }
        }
    }

    /* renamed from: d */
    public final void mo7684d() {
        zp0 zp0 = this.f7560l;
        if (zp0 != null && this.f7566r == 0) {
            m9865r("canplaythrough", "duration", String.valueOf(((float) zp0.mo8755i()) / 1000.0f), "videoWidth", String.valueOf(this.f7560l.mo8757k()), "videoHeight", String.valueOf(this.f7560l.mo8756j()));
        }
    }

    /* renamed from: e */
    public final void mo7685e() {
        this.f7556h.setVisibility(4);
    }

    /* renamed from: f */
    public final void mo7686f() {
        this.f7558j.mo11514b();
        C3163g2.f20465i.post(new dq0(this));
    }

    public final void finalize() {
        try {
            this.f7558j.mo11513a();
            zp0 zp0 = this.f7560l;
            if (zp0 != null) {
                wo0.f16890e.execute(new bq0(zp0));
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: g */
    public final void mo7688g() {
        m9865r("pause", new String[0]);
        m9864q();
        this.f7561m = false;
    }

    /* renamed from: h */
    public final void mo7689h() {
        if (this.f7571w && this.f7569u != null && !m9866s()) {
            this.f7570v.setImageBitmap(this.f7569u);
            this.f7570v.invalidate();
            this.f7555g.addView(this.f7570v, new FrameLayout.LayoutParams(-1, -1));
            this.f7555g.bringChildToFront(this.f7570v);
        }
        this.f7558j.mo11513a();
        this.f7566r = this.f7565q;
        C3163g2.f20465i.post(new eq0(this));
    }

    /* renamed from: i */
    public final void mo7690i(int i) {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10233A)).booleanValue()) {
            this.f7555g.setBackgroundColor(i);
            this.f7556h.setBackgroundColor(i);
        }
    }

    /* renamed from: j */
    public final void mo7691j() {
        if (this.f7561m && m9866s()) {
            this.f7555g.removeView(this.f7570v);
        }
        if (this.f7569u != null) {
            long b = C2694t.m21592a().mo12463b();
            if (this.f7560l.getBitmap(this.f7569u) != null) {
                this.f7571w = true;
            }
            long b2 = C2694t.m21592a().mo12463b() - b;
            if (C3202r1.m24017m()) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Spinner frame grab took ");
                sb.append(b2);
                sb.append("ms");
                C3202r1.m24015k(sb.toString());
            }
            if (b2 > this.f7559k) {
                io0.m11131g("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.f7564p = false;
                this.f7569u = null;
                b20 b20 = this.f7557i;
                if (b20 != null) {
                    b20.mo5631d("spinner_jank", Long.toString(b2));
                }
            }
        }
    }

    /* renamed from: k */
    public final void mo7692k(int i) {
        this.f7560l.mo8751a(i);
    }

    /* renamed from: l */
    public final void mo7693l(String str, String[] strArr) {
        this.f7567s = str;
        this.f7568t = strArr;
    }

    /* renamed from: m */
    public final void mo7694m(int i, int i2, int i3, int i4) {
        if (C3202r1.m24017m()) {
            StringBuilder sb = new StringBuilder(75);
            sb.append("Set video bounds to x:");
            sb.append(i);
            sb.append(";y:");
            sb.append(i2);
            sb.append(";w:");
            sb.append(i3);
            sb.append(";h:");
            sb.append(i4);
            C3202r1.m24015k(sb.toString());
        }
        if (i3 != 0 && i4 != 0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
            layoutParams.setMargins(i, i2, 0, 0);
            this.f7555g.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    /* renamed from: n */
    public final void mo7695n(float f) {
        zp0 zp0 = this.f7560l;
        if (zp0 != null) {
            zp0.f18318g.mo11901e(f);
            zp0.mo8759m();
        }
    }

    /* renamed from: o */
    public final void mo7696o(float f, float f2) {
        zp0 zp0 = this.f7560l;
        if (zp0 != null) {
            zp0.mo8775y(f, f2);
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        vq0 vq0 = this.f7558j;
        if (z) {
            vq0.mo11514b();
        } else {
            vq0.mo11513a();
            this.f7566r = this.f7565q;
        }
        C3163g2.f20465i.post(new cq0(this, z));
    }

    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.f7558j.mo11514b();
            z = true;
        } else {
            this.f7558j.mo11513a();
            this.f7566r = this.f7565q;
            z = false;
        }
        C3163g2.f20465i.post(new fq0(this, z));
    }

    /* renamed from: p */
    public final void mo7699p() {
        zp0 zp0 = this.f7560l;
        if (zp0 != null) {
            zp0.f18318g.mo11900d(false);
            zp0.mo8759m();
        }
    }

    /* renamed from: q0 */
    public final void mo7700q0(String str, String str2) {
        m9865r("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @TargetApi(14)
    /* renamed from: u */
    public final void mo7701u() {
        zp0 zp0 = this.f7560l;
        if (zp0 != null) {
            TextView textView = new TextView(zp0.getContext());
            String valueOf = String.valueOf(this.f7560l.mo8768p());
            textView.setText(valueOf.length() != 0 ? "AdMob - ".concat(valueOf) : new String("AdMob - "));
            textView.setTextColor(-65536);
            textView.setBackgroundColor(-256);
            this.f7555g.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
            this.f7555g.bringChildToFront(textView);
        }
    }

    /* renamed from: v */
    public final void mo7702v() {
        this.f7558j.mo11513a();
        zp0 zp0 = this.f7560l;
        if (zp0 != null) {
            zp0.mo8774w();
        }
        m9864q();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final /* synthetic */ void mo7703w(boolean z) {
        m9865r("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }

    /* renamed from: x */
    public final void mo7704x() {
        if (this.f7560l != null) {
            if (!TextUtils.isEmpty(this.f7567s)) {
                this.f7560l.mo8752f(this.f7567s, this.f7568t);
            } else {
                m9865r("no_src", new String[0]);
            }
        }
    }

    /* renamed from: y */
    public final void mo7705y() {
        zp0 zp0 = this.f7560l;
        if (zp0 != null) {
            zp0.f18318g.mo11900d(true);
            zp0.mo8759m();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo7706z() {
        zp0 zp0 = this.f7560l;
        if (zp0 != null) {
            long g = (long) zp0.mo8753g();
            if (this.f7565q != g && g > 0) {
                float f = ((float) g) / 1000.0f;
                if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10596r1)).booleanValue()) {
                    m9865r("timeupdate", "time", String.valueOf(f), "totalBytes", String.valueOf(this.f7560l.mo8761o()), "qoeCachedBytes", String.valueOf(this.f7560l.mo8758l()), "qoeLoadedBytes", String.valueOf(this.f7560l.mo8760n()), "droppedFrames", String.valueOf(this.f7560l.mo8754h()), "reportTime", String.valueOf(C2694t.m21592a().mo12462a()));
                } else {
                    m9865r("timeupdate", "time", String.valueOf(f));
                }
                this.f7565q = g;
            }
        }
    }

    public final void zza() {
        m9865r("ended", new String[0]);
        m9864q();
    }
}
