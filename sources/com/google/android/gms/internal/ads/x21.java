package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p054h1.C2694t;
import p069j1.C3160g;

public final class x21 implements vb0<a31> {

    /* renamed from: a */
    private final Context f17000a;

    /* renamed from: b */
    private final C2264un f17001b;

    /* renamed from: c */
    private final PowerManager f17002c;

    public x21(Context context, C2264un unVar) {
        this.f17000a = context;
        this.f17001b = unVar;
        this.f17002c = (PowerManager) context.getSystemService("power");
    }

    /* renamed from: b */
    public final JSONObject mo8587a(a31 a31) {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        C2376xn xnVar = a31.f3927f;
        if (xnVar == null) {
            jSONObject = new JSONObject();
        } else if (this.f17001b.mo11252d() != null) {
            boolean z = xnVar.f17247a;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("afmaVersion", this.f17001b.mo11250b()).put("activeViewJSON", this.f17001b.mo11252d()).put("timestamp", a31.f3925d).put("adFormat", this.f17001b.mo11249a()).put("hashCode", this.f17001b.mo11251c()).put("isMraid", false).put("isStopped", false).put("isPaused", a31.f3923b).put("isNative", this.f17001b.mo11253e()).put("isScreenOn", Build.VERSION.SDK_INT >= 20 ? this.f17002c.isInteractive() : this.f17002c.isScreenOn()).put("appMuted", C2694t.m21610s().mo14016e()).put("appVolume", (double) C2694t.m21610s().mo14013a()).put("deviceVolume", (double) C3160g.m23896b(this.f17000a.getApplicationContext()));
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10491f4)).booleanValue()) {
                AudioManager audioManager = (AudioManager) this.f17000a.getApplicationContext().getSystemService("audio");
                Integer valueOf = audioManager == null ? null : Integer.valueOf(audioManager.getMode());
                if (valueOf != null) {
                    jSONObject3.put("audioMode", valueOf);
                }
            }
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.f17000a.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", xnVar.f17248b).put("isAttachedToWindow", z).put("viewBox", new JSONObject().put("top", xnVar.f17249c.top).put("bottom", xnVar.f17249c.bottom).put("left", xnVar.f17249c.left).put("right", xnVar.f17249c.right)).put("adBox", new JSONObject().put("top", xnVar.f17250d.top).put("bottom", xnVar.f17250d.bottom).put("left", xnVar.f17250d.left).put("right", xnVar.f17250d.right)).put("globalVisibleBox", new JSONObject().put("top", xnVar.f17251e.top).put("bottom", xnVar.f17251e.bottom).put("left", xnVar.f17251e.left).put("right", xnVar.f17251e.right)).put("globalVisibleBoxVisible", xnVar.f17252f).put("localVisibleBox", new JSONObject().put("top", xnVar.f17253g.top).put("bottom", xnVar.f17253g.bottom).put("left", xnVar.f17253g.left).put("right", xnVar.f17253g.right)).put("localVisibleBoxVisible", xnVar.f17254h).put("hitBox", new JSONObject().put("top", xnVar.f17255i.top).put("bottom", xnVar.f17255i.bottom).put("left", xnVar.f17255i.left).put("right", xnVar.f17255i.right)).put("screenDensity", (double) this.f17000a.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", a31.f3922a);
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10443a1)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = xnVar.f17257k;
                if (list != null) {
                    for (Rect next : list) {
                        jSONArray2.put(new JSONObject().put("top", next.top).put("bottom", next.bottom).put("left", next.left).put("right", next.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(a31.f3926e)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        } else {
            throw new JSONException("Active view Info cannot be null.");
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
