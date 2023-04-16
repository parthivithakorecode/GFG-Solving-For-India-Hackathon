package p069j1;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.webkit.WebSettings;
import p034e2.C2546c;
import p034e2.C2557n;
import p160x1.C4288j;

@TargetApi(17)
/* renamed from: j1.i2 */
public class C3171i2 extends C3156f {
    public C3171i2() {
        super((C3152e) null);
    }

    /* renamed from: a */
    public final int mo13996a(ContentResolver contentResolver) {
        return Settings.Global.getInt(contentResolver, "airplane_mode_on", 0);
    }

    /* renamed from: b */
    public final int mo13997b(ContentResolver contentResolver) {
        return Settings.Global.getInt(contentResolver, "wifi_on", 0);
    }

    /* renamed from: c */
    public final Drawable mo13998c(Context context, Bitmap bitmap, boolean z, float f) {
        if (!z || f <= 0.0f || f > 25.0f) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
        try {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
            Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
            RenderScript create = RenderScript.create(context);
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(f);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            return new BitmapDrawable(context.getResources(), createBitmap);
        } catch (RuntimeException unused) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
    }

    /* renamed from: d */
    public final String mo13999d(Context context) {
        C3182l1 a = C3182l1.m23986a();
        if (TextUtils.isEmpty(a.f20500a)) {
            a.f20500a = (String) (C2546c.m21176a() ? C3170i1.m23966a(context, new C3174j1(a, context)) : C3170i1.m23966a(context, new C3178k1(a, C4288j.m26857c(context), context)));
        }
        return a.f20500a;
    }

    /* renamed from: e */
    public final void mo14000e(Context context) {
        C3182l1 a = C3182l1.m23986a();
        C3202r1.m24015k("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(a.f20500a)) {
            Context c = C4288j.m26857c(context);
            if (!C2546c.m21176a()) {
                if (c == null) {
                    c = null;
                }
                a.f20500a = defaultUserAgent;
            }
            SharedPreferences.Editor putString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
            if (c == null) {
                putString.apply();
            } else {
                C2557n.m21219a(context, putString, "admob_user_agent");
            }
            a.f20500a = defaultUserAgent;
        }
        C3202r1.m24015k("User agent is updated.");
    }

    /* renamed from: f */
    public final boolean mo14001f(Context context, WebSettings webSettings) {
        super.mo14001f(context, webSettings);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
        return true;
    }
}
