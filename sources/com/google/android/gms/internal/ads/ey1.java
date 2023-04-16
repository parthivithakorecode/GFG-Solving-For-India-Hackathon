package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import org.json.JSONObject;
import p041f2.C2606c;
import p054h1.C2694t;
import p069j1.C3163g2;

public final class ey1 {

    /* renamed from: a */
    private final Context f6423a;

    /* renamed from: b */
    private final ApplicationInfo f6424b;

    /* renamed from: c */
    private final int f6425c;

    /* renamed from: d */
    private final int f6426d;

    /* renamed from: e */
    private String f6427e = "";

    public ey1(Context context) {
        this.f6423a = context;
        this.f6424b = context.getApplicationInfo();
        this.f6425c = ((Integer) C2199sw.m17001c().mo8579b(m10.f10344N6)).intValue();
        this.f6426d = ((Integer) C2199sw.m17001c().mo8579b(m10.f10352O6)).intValue();
    }

    /* renamed from: a */
    public final JSONObject mo7182a() {
        Drawable drawable;
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", C2606c.m21299a(this.f6423a).mo12494d(this.f6424b.packageName));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", this.f6424b.packageName);
        C2694t.m21608q();
        jSONObject.put("adMobAppId", C3163g2.m23924d0(this.f6423a));
        if (this.f6427e.isEmpty()) {
            try {
                drawable = (Drawable) C2606c.m21299a(this.f6423a).mo12495e(this.f6424b.packageName).f2121b;
            } catch (PackageManager.NameNotFoundException unused2) {
                drawable = null;
            }
            if (drawable == null) {
                str = "";
            } else {
                drawable.setBounds(0, 0, this.f6425c, this.f6426d);
                Bitmap createBitmap = Bitmap.createBitmap(this.f6425c, this.f6426d, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(createBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                str = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.f6427e = str;
        }
        if (!this.f6427e.isEmpty()) {
            jSONObject.put("icon", this.f6427e);
            jSONObject.put("iconWidthPx", this.f6425c);
            jSONObject.put("iconHeightPx", this.f6426d);
        }
        return jSONObject;
    }
}
