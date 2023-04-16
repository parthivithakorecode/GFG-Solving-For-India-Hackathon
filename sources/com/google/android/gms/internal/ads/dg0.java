package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p054h1.C2694t;
import p069j1.C3163g2;

public final class dg0 extends eg0 implements t70<eu0> {

    /* renamed from: c */
    private final eu0 f5796c;

    /* renamed from: d */
    private final Context f5797d;

    /* renamed from: e */
    private final WindowManager f5798e;

    /* renamed from: f */
    private final v00 f5799f;

    /* renamed from: g */
    DisplayMetrics f5800g;

    /* renamed from: h */
    private float f5801h;

    /* renamed from: i */
    int f5802i = -1;

    /* renamed from: j */
    int f5803j = -1;

    /* renamed from: k */
    private int f5804k;

    /* renamed from: l */
    int f5805l = -1;

    /* renamed from: m */
    int f5806m = -1;

    /* renamed from: n */
    int f5807n = -1;

    /* renamed from: o */
    int f5808o = -1;

    public dg0(eu0 eu0, Context context, v00 v00) {
        super(eu0, "");
        this.f5796c = eu0;
        this.f5797d = context;
        this.f5799f = v00;
        this.f5798e = (WindowManager) context.getSystemService("window");
    }

    /* renamed from: a */
    public final /* synthetic */ void mo5150a(Object obj, Map map) {
        int i;
        JSONObject jSONObject;
        eu0 eu0 = (eu0) obj;
        this.f5800g = new DisplayMetrics();
        Display defaultDisplay = this.f5798e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f5800g);
        this.f5801h = this.f5800g.density;
        this.f5804k = defaultDisplay.getRotation();
        C2125qw.m15897b();
        DisplayMetrics displayMetrics = this.f5800g;
        this.f5802i = bo0.m6993q(displayMetrics, displayMetrics.widthPixels);
        C2125qw.m15897b();
        DisplayMetrics displayMetrics2 = this.f5800g;
        this.f5803j = bo0.m6993q(displayMetrics2, displayMetrics2.heightPixels);
        Activity j = this.f5796c.mo7127j();
        if (j == null || j.getWindow() == null) {
            this.f5805l = this.f5802i;
            i = this.f5803j;
        } else {
            C2694t.m21608q();
            int[] u = C3163g2.m23945u(j);
            C2125qw.m15897b();
            this.f5805l = bo0.m6993q(this.f5800g, u[0]);
            C2125qw.m15897b();
            i = bo0.m6993q(this.f5800g, u[1]);
        }
        this.f5806m = i;
        if (this.f5796c.mo7151x().mo11531i()) {
            this.f5807n = this.f5802i;
            this.f5808o = this.f5803j;
        } else {
            this.f5796c.measure(0, 0);
        }
        mo6950e(this.f5802i, this.f5803j, this.f5805l, this.f5806m, this.f5801h, this.f5804k);
        cg0 cg0 = new cg0();
        v00 v00 = this.f5799f;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        cg0.mo6195e(v00.mo11357a(intent));
        v00 v002 = this.f5799f;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        cg0.mo6193c(v002.mo11357a(intent2));
        cg0.mo6191a(this.f5799f.mo11358b());
        cg0.mo6194d(this.f5799f.mo11359c());
        cg0.mo6192b(true);
        boolean h = cg0.f5413a;
        boolean j2 = cg0.f5414b;
        boolean f = cg0.f5415c;
        boolean i2 = cg0.f5416d;
        boolean g = cg0.f5417e;
        eu0 eu02 = this.f5796c;
        try {
            jSONObject = new JSONObject().put("sms", h).put("tel", j2).put("calendar", f).put("storePicture", i2).put("inlineVideo", g);
        } catch (JSONException e) {
            io0.m11129e("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObject = null;
        }
        eu02.mo6423s("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        this.f5796c.getLocationOnScreen(iArr);
        mo6473h(C2125qw.m15897b().mo5896b(this.f5797d, iArr[0]), C2125qw.m15897b().mo5896b(this.f5797d, iArr[1]));
        if (io0.m11134j(2)) {
            io0.m11130f("Dispatching Ready Event.");
        }
        mo6949d(this.f5796c.mo7129l().f12729f);
    }

    /* renamed from: h */
    public final void mo6473h(int i, int i2) {
        int i3;
        int i4 = 0;
        if (this.f5797d instanceof Activity) {
            C2694t.m21608q();
            i3 = C3163g2.m23947w((Activity) this.f5797d)[0];
        } else {
            i3 = 0;
        }
        if (this.f5796c.mo7151x() == null || !this.f5796c.mo7151x().mo11531i()) {
            int width = this.f5796c.getWidth();
            int height = this.f5796c.getHeight();
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10329M)).booleanValue()) {
                if (width == 0) {
                    width = this.f5796c.mo7151x() != null ? this.f5796c.mo7151x().f16421c : 0;
                }
                if (height == 0) {
                    if (this.f5796c.mo7151x() != null) {
                        i4 = this.f5796c.mo7151x().f16420b;
                    }
                    this.f5807n = C2125qw.m15897b().mo5896b(this.f5797d, width);
                    this.f5808o = C2125qw.m15897b().mo5896b(this.f5797d, i4);
                }
            }
            i4 = height;
            this.f5807n = C2125qw.m15897b().mo5896b(this.f5797d, width);
            this.f5808o = C2125qw.m15897b().mo5896b(this.f5797d, i4);
        }
        mo6947b(i, i2 - i3, this.f5807n, this.f5808o);
        this.f5796c.mo7077D0().mo9069w0(i, i2);
    }
}
