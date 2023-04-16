package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.json.JSONObject;
import p054h1.C2694t;

public final class k61 extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: f */
    private final Context f9406f;

    /* renamed from: g */
    private View f9407g;

    private k61(Context context) {
        super(context);
        this.f9406f = context;
    }

    /* renamed from: a */
    public static k61 m12027a(Context context, View view, rr2 rr2) {
        Resources resources;
        DisplayMetrics displayMetrics;
        k61 k61 = new k61(context);
        if (!(rr2.f13916v.isEmpty() || (resources = k61.f9406f.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null)) {
            sr2 sr2 = rr2.f13916v.get(0);
            float f = displayMetrics.density;
            k61.setLayoutParams(new FrameLayout.LayoutParams((int) (((float) sr2.f14564a) * f), (int) (((float) sr2.f14565b) * f)));
        }
        k61.f9407g = view;
        k61.addView(view);
        C2694t.m21616y();
        jp0.m11763b(k61, k61);
        C2694t.m21616y();
        jp0.m11762a(k61, k61);
        JSONObject jSONObject = rr2.f13895f0;
        RelativeLayout relativeLayout = new RelativeLayout(k61.f9406f);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            k61.m12029c(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            k61.m12029c(optJSONObject2, relativeLayout, 12);
        }
        k61.addView(relativeLayout);
        return k61;
    }

    /* renamed from: b */
    private final int m12028b(double d) {
        C2125qw.m15897b();
        return bo0.m6995s(this.f9406f, (int) d);
    }

    /* renamed from: c */
    private final void m12029c(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        TextView textView = new TextView(this.f9406f);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int b = m12028b(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, b, 0, b);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, m12028b(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.f9407g.setY((float) (-iArr[1]));
    }

    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.f9407g.setY((float) (-iArr[1]));
    }
}
