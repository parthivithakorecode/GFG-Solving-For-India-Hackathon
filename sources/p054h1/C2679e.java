package p054h1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C2199sw;
import com.google.android.gms.internal.ads.cc0;
import com.google.android.gms.internal.ads.cc3;
import com.google.android.gms.internal.ads.dc3;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.on0;
import com.google.android.gms.internal.ads.po0;
import com.google.android.gms.internal.ads.rb0;
import com.google.android.gms.internal.ads.rb3;
import com.google.android.gms.internal.ads.wb0;
import com.google.android.gms.internal.ads.wo0;
import com.google.android.gms.internal.ads.zb0;
import com.google.android.gms.internal.ads.zo0;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;
import p041f2.C2606c;
import p069j1.C3202r1;

@ParametersAreNonnullByDefault
/* renamed from: h1.e */
public final class C2679e {

    /* renamed from: a */
    private Context f19115a;

    /* renamed from: b */
    private long f19116b = 0;

    /* renamed from: a */
    public final void mo12669a(Context context, po0 po0, String str, Runnable runnable) {
        mo12670b(context, po0, true, (on0) null, str, (String) null, runnable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12670b(Context context, po0 po0, boolean z, on0 on0, String str, String str2, Runnable runnable) {
        PackageInfo f;
        if (C2694t.m21592a().mo12463b() - this.f19116b < 5000) {
            io0.m11131g("Not retrying to fetch app settings");
            return;
        }
        this.f19116b = C2694t.m21592a().mo12463b();
        if (on0 != null) {
            long a = on0.mo9799a();
            if (C2694t.m21592a().mo12462a() - a <= ((Long) C2199sw.m17001c().mo8579b(m10.f10268E2)).longValue() && on0.mo9807i()) {
                return;
            }
        }
        if (context == null) {
            io0.m11131g("Context not provided to fetch application settings");
        } else if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            this.f19115a = applicationContext;
            cc0 a2 = C2694t.m21598g().mo10758a(this.f19115a, po0);
            wb0<JSONObject> wb0 = zb0.f18143b;
            rb0<I, O> a3 = a2.mo6122a("google.afma.config.fetchAppSettings", wb0, wb0);
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("app_id", str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z);
                jSONObject.put("pn", context.getPackageName());
                jSONObject.put("experiment_ids", TextUtils.join(",", m10.m13005a()));
                try {
                    ApplicationInfo applicationInfo = this.f19115a.getApplicationInfo();
                    if (!(applicationInfo == null || (f = C2606c.m21299a(context).mo12496f(applicationInfo.packageName, 0)) == null)) {
                        jSONObject.put("version", f.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    C3202r1.m24015k("Error fetching PackageInfo.");
                }
                cc3<O> a4 = a3.mo7584a(jSONObject);
                C2678d dVar = C2678d.f19114a;
                dc3 dc3 = wo0.f16891f;
                cc3<O> n = rb3.m16136n(a4, dVar, dc3);
                if (runnable != null) {
                    a4.mo5905b(runnable, dc3);
                }
                zo0.m20769a(n, "ConfigLoader.maybeFetchNewAppSettings");
            } catch (Exception e) {
                io0.m11129e("Error requesting application settings", e);
            }
        } else {
            io0.m11131g("App settings could not be fetched. Required parameters missing");
        }
    }

    /* renamed from: c */
    public final void mo12671c(Context context, po0 po0, String str, on0 on0) {
        mo12670b(context, po0, false, on0, on0 != null ? on0.mo9800b() : null, str, (Runnable) null);
    }
}
