package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

public class eg0 {

    /* renamed from: a */
    private final eu0 f6207a;

    /* renamed from: b */
    private final String f6208b;

    public eg0(eu0 eu0, String str) {
        this.f6207a = eu0;
        this.f6208b = str;
    }

    /* renamed from: b */
    public final void mo6947b(int i, int i2, int i3, int i4) {
        try {
            this.f6207a.mo6423s("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            io0.m11129e("Error occurred while dispatching default position.", e);
        }
    }

    /* renamed from: c */
    public final void mo6948c(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", this.f6208b);
            eu0 eu0 = this.f6207a;
            if (eu0 != null) {
                eu0.mo6423s("onError", put);
            }
        } catch (JSONException e) {
            io0.m11129e("Error occurred while dispatching error event.", e);
        }
    }

    /* renamed from: d */
    public final void mo6949d(String str) {
        try {
            this.f6207a.mo6423s("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            io0.m11129e("Error occurred while dispatching ready Event.", e);
        }
    }

    /* renamed from: e */
    public final void mo6950e(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.f6207a.mo6423s("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", (double) f).put("rotation", i5));
        } catch (JSONException e) {
            io0.m11129e("Error occurred while obtaining screen information.", e);
        }
    }

    /* renamed from: f */
    public final void mo6951f(int i, int i2, int i3, int i4) {
        try {
            this.f6207a.mo6423s("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            io0.m11129e("Error occurred while dispatching size change.", e);
        }
    }

    /* renamed from: g */
    public final void mo6952g(String str) {
        try {
            this.f6207a.mo6423s("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            io0.m11129e("Error occurred while dispatching state change.", e);
        }
    }
}
