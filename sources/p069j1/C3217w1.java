package p069j1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C2199sw;
import com.google.android.gms.internal.ads.C2414yo;
import com.google.android.gms.internal.ads.cc3;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.on0;
import com.google.android.gms.internal.ads.u20;
import com.google.android.gms.internal.ads.wo0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p034e2.C2555l;
import p054h1.C2694t;

/* renamed from: j1.w1 */
public final class C3217w1 implements C3208t1 {
    @GuardedBy("lock")

    /* renamed from: A */
    private long f20554A = 0;

    /* renamed from: a */
    private final Object f20555a = new Object();

    /* renamed from: b */
    private boolean f20556b;

    /* renamed from: c */
    private final List<Runnable> f20557c = new ArrayList();

    /* renamed from: d */
    private cc3<?> f20558d;
    @GuardedBy("lock")

    /* renamed from: e */
    private C2414yo f20559e = null;
    @GuardedBy("lock")

    /* renamed from: f */
    private SharedPreferences f20560f;
    @GuardedBy("lock")

    /* renamed from: g */
    private SharedPreferences.Editor f20561g;
    @GuardedBy("lock")

    /* renamed from: h */
    private boolean f20562h = true;
    @GuardedBy("lock")

    /* renamed from: i */
    private String f20563i;
    @GuardedBy("lock")

    /* renamed from: j */
    private String f20564j;
    @GuardedBy("lock")

    /* renamed from: k */
    private boolean f20565k = true;
    @GuardedBy("lock")

    /* renamed from: l */
    private on0 f20566l = new on0("", 0);
    @GuardedBy("lock")

    /* renamed from: m */
    private long f20567m = 0;
    @GuardedBy("lock")

    /* renamed from: n */
    private long f20568n = 0;
    @GuardedBy("lock")

    /* renamed from: o */
    private int f20569o = -1;
    @GuardedBy("lock")

    /* renamed from: p */
    private int f20570p = 0;
    @GuardedBy("lock")

    /* renamed from: q */
    private Set<String> f20571q = Collections.emptySet();
    @GuardedBy("lock")

    /* renamed from: r */
    private JSONObject f20572r = new JSONObject();
    @GuardedBy("lock")

    /* renamed from: s */
    private boolean f20573s = true;
    @GuardedBy("lock")

    /* renamed from: t */
    private boolean f20574t = true;
    @GuardedBy("lock")

    /* renamed from: u */
    private String f20575u = null;
    @GuardedBy("lock")

    /* renamed from: v */
    private String f20576v = "";
    @GuardedBy("lock")

    /* renamed from: w */
    private boolean f20577w = false;
    @GuardedBy("lock")

    /* renamed from: x */
    private String f20578x = "";
    @GuardedBy("lock")

    /* renamed from: y */
    private int f20579y = -1;
    @GuardedBy("lock")

    /* renamed from: z */
    private int f20580z = -1;

    /* renamed from: M */
    private final void m24062M() {
        cc3<?> cc3 = this.f20558d;
        if (cc3 != null && !cc3.isDone()) {
            try {
                this.f20558d.get(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                io0.m11132h("Interrupted while waiting for preferences loaded.", e);
            } catch (CancellationException | ExecutionException | TimeoutException e2) {
                io0.m11129e("Fail to initialize AdSharedPreferenceManager.", e2);
            }
        }
    }

    /* renamed from: N */
    private final void m24063N() {
        wo0.f16886a.execute(new C3211u1(this));
    }

    /* renamed from: A */
    public final void mo14069A(long j) {
        m24062M();
        synchronized (this.f20555a) {
            if (this.f20554A != j) {
                this.f20554A = j;
                SharedPreferences.Editor editor = this.f20561g;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j);
                    this.f20561g.apply();
                }
                m24063N();
            }
        }
    }

    /* renamed from: B */
    public final void mo14070B(String str) {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10240A6)).booleanValue()) {
            m24062M();
            synchronized (this.f20555a) {
                if (!this.f20576v.equals(str)) {
                    this.f20576v = str;
                    SharedPreferences.Editor editor = this.f20561g;
                    if (editor != null) {
                        editor.putString("inspector_info", str);
                        this.f20561g.apply();
                    }
                    m24063N();
                }
            }
        }
    }

    /* renamed from: C */
    public final void mo14071C(boolean z) {
        m24062M();
        synchronized (this.f20555a) {
            if (z != this.f20565k) {
                this.f20565k = z;
                SharedPreferences.Editor editor = this.f20561g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z);
                    this.f20561g.apply();
                }
                m24063N();
            }
        }
    }

    /* renamed from: D */
    public final void mo14072D(Runnable runnable) {
        this.f20557c.add(runnable);
    }

    /* renamed from: E */
    public final void mo14073E(String str, String str2, boolean z) {
        m24062M();
        synchronized (this.f20555a) {
            JSONArray optJSONArray = this.f20572r.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            int i = 0;
            while (true) {
                if (i < optJSONArray.length()) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        if (str2.equals(optJSONObject.optString("template_id"))) {
                            if (z) {
                                if (optJSONObject.optBoolean("uses_media_view", false)) {
                                    return;
                                }
                            }
                            length = i;
                        } else {
                            i++;
                        }
                    } else {
                        return;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", C2694t.m21592a().mo12462a());
                optJSONArray.put(length, jSONObject);
                this.f20572r.put(str, optJSONArray);
            } catch (JSONException e) {
                io0.m11132h("Could not update native advanced settings", e);
            }
            SharedPreferences.Editor editor = this.f20561g;
            if (editor != null) {
                editor.putString("native_advanced_settings", this.f20572r.toString());
                this.f20561g.apply();
            }
            m24063N();
        }
    }

    /* renamed from: F */
    public final void mo14074F(int i) {
        m24062M();
        synchronized (this.f20555a) {
            if (this.f20570p != i) {
                this.f20570p = i;
                SharedPreferences.Editor editor = this.f20561g;
                if (editor != null) {
                    editor.putInt("version_code", i);
                    this.f20561g.apply();
                }
                m24063N();
            }
        }
    }

    /* renamed from: G */
    public final void mo14075G(boolean z) {
        m24062M();
        synchronized (this.f20555a) {
            if (this.f20574t != z) {
                this.f20574t = z;
                SharedPreferences.Editor editor = this.f20561g;
                if (editor != null) {
                    editor.putBoolean("content_vertical_opted_out", z);
                    this.f20561g.apply();
                }
                m24063N();
            }
        }
    }

    /* renamed from: H */
    public final boolean mo14076H() {
        boolean z;
        m24062M();
        synchronized (this.f20555a) {
            z = this.f20577w;
        }
        return z;
    }

    /* renamed from: I */
    public final void mo14077I(String str) {
        m24062M();
        synchronized (this.f20555a) {
            if (!str.equals(this.f20563i)) {
                this.f20563i = str;
                SharedPreferences.Editor editor = this.f20561g;
                if (editor != null) {
                    editor.putString("content_url_hashes", str);
                    this.f20561g.apply();
                }
                m24063N();
            }
        }
    }

    /* renamed from: J */
    public final boolean mo14078J() {
        boolean z;
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10568o0)).booleanValue()) {
            return false;
        }
        m24062M();
        synchronized (this.f20555a) {
            z = this.f20565k;
        }
        return z;
    }

    /* renamed from: K */
    public final void mo14079K(int i) {
        m24062M();
        synchronized (this.f20555a) {
            if (this.f20569o != i) {
                this.f20569o = i;
                SharedPreferences.Editor editor = this.f20561g;
                if (editor != null) {
                    editor.putInt("request_in_session_count", i);
                    this.f20561g.apply();
                }
                m24063N();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final /* synthetic */ void mo14114L(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (this.f20555a) {
            this.f20560f = sharedPreferences;
            this.f20561g = edit;
            if (C2555l.m21214h()) {
                NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            }
            this.f20562h = this.f20560f.getBoolean("use_https", this.f20562h);
            this.f20573s = this.f20560f.getBoolean("content_url_opted_out", this.f20573s);
            this.f20563i = this.f20560f.getString("content_url_hashes", this.f20563i);
            this.f20565k = this.f20560f.getBoolean("gad_idless", this.f20565k);
            this.f20574t = this.f20560f.getBoolean("content_vertical_opted_out", this.f20574t);
            this.f20564j = this.f20560f.getString("content_vertical_hashes", this.f20564j);
            this.f20570p = this.f20560f.getInt("version_code", this.f20570p);
            this.f20566l = new on0(this.f20560f.getString("app_settings_json", this.f20566l.mo9801c()), this.f20560f.getLong("app_settings_last_update_ms", this.f20566l.mo9799a()));
            this.f20567m = this.f20560f.getLong("app_last_background_time_ms", this.f20567m);
            this.f20569o = this.f20560f.getInt("request_in_session_count", this.f20569o);
            this.f20568n = this.f20560f.getLong("first_ad_req_time_ms", this.f20568n);
            this.f20571q = this.f20560f.getStringSet("never_pool_slots", this.f20571q);
            this.f20575u = this.f20560f.getString("display_cutout", this.f20575u);
            this.f20579y = this.f20560f.getInt("app_measurement_npa", this.f20579y);
            this.f20580z = this.f20560f.getInt("sd_app_measure_npa", this.f20580z);
            this.f20554A = this.f20560f.getLong("sd_app_measure_npa_ts", this.f20554A);
            this.f20576v = this.f20560f.getString("inspector_info", this.f20576v);
            this.f20577w = this.f20560f.getBoolean("linked_device", this.f20577w);
            this.f20578x = this.f20560f.getString("linked_ad_unit", this.f20578x);
            try {
                this.f20572r = new JSONObject(this.f20560f.getString("native_advanced_settings", "{}"));
            } catch (JSONException e) {
                io0.m11132h("Could not convert native advanced settings to json object", e);
            }
            m24063N();
        }
    }

    /* renamed from: a */
    public final int mo14080a() {
        int i;
        m24062M();
        synchronized (this.f20555a) {
            i = this.f20569o;
        }
        return i;
    }

    /* renamed from: b */
    public final long mo14081b() {
        long j;
        m24062M();
        synchronized (this.f20555a) {
            j = this.f20554A;
        }
        return j;
    }

    /* renamed from: c */
    public final long mo14082c() {
        long j;
        m24062M();
        synchronized (this.f20555a) {
            j = this.f20567m;
        }
        return j;
    }

    /* renamed from: d */
    public final C2414yo mo14083d() {
        if (!this.f20556b) {
            return null;
        }
        if ((mo14102w() && mo14101v()) || !u20.f15352b.mo9928e().booleanValue()) {
            return null;
        }
        synchronized (this.f20555a) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.f20559e == null) {
                this.f20559e = new C2414yo();
            }
            this.f20559e.mo12058e();
            io0.m11130f("start fetching content...");
            C2414yo yoVar = this.f20559e;
            return yoVar;
        }
    }

    /* renamed from: e */
    public final on0 mo14084e() {
        on0 on0;
        m24062M();
        synchronized (this.f20555a) {
            on0 = this.f20566l;
        }
        return on0;
    }

    /* renamed from: f */
    public final on0 mo14085f() {
        on0 on0;
        synchronized (this.f20555a) {
            on0 = this.f20566l;
        }
        return on0;
    }

    /* renamed from: g */
    public final long mo14086g() {
        long j;
        m24062M();
        synchronized (this.f20555a) {
            j = this.f20568n;
        }
        return j;
    }

    /* renamed from: h */
    public final String mo14087h() {
        String str;
        m24062M();
        synchronized (this.f20555a) {
            str = this.f20563i;
        }
        return str;
    }

    /* renamed from: i */
    public final String mo14088i() {
        String str;
        m24062M();
        synchronized (this.f20555a) {
            str = this.f20564j;
        }
        return str;
    }

    /* renamed from: j */
    public final String mo14089j() {
        String str;
        m24062M();
        synchronized (this.f20555a) {
            str = this.f20578x;
        }
        return str;
    }

    /* renamed from: k */
    public final String mo14090k() {
        String str;
        m24062M();
        synchronized (this.f20555a) {
            str = this.f20575u;
        }
        return str;
    }

    /* renamed from: l */
    public final void mo14091l(String str) {
        m24062M();
        synchronized (this.f20555a) {
            if (!str.equals(this.f20564j)) {
                this.f20564j = str;
                SharedPreferences.Editor editor = this.f20561g;
                if (editor != null) {
                    editor.putString("content_vertical_hashes", str);
                    this.f20561g.apply();
                }
                m24063N();
            }
        }
    }

    /* renamed from: m */
    public final JSONObject mo14092m() {
        JSONObject jSONObject;
        m24062M();
        synchronized (this.f20555a) {
            jSONObject = this.f20572r;
        }
        return jSONObject;
    }

    /* renamed from: n */
    public final void mo14093n(long j) {
        m24062M();
        synchronized (this.f20555a) {
            if (this.f20568n != j) {
                this.f20568n = j;
                SharedPreferences.Editor editor = this.f20561g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j);
                    this.f20561g.apply();
                }
                m24063N();
            }
        }
    }

    /* renamed from: o */
    public final String mo14094o() {
        String str;
        m24062M();
        synchronized (this.f20555a) {
            str = this.f20576v;
        }
        return str;
    }

    /* renamed from: p */
    public final void mo14095p(String str) {
        m24062M();
        synchronized (this.f20555a) {
            if (!TextUtils.equals(this.f20575u, str)) {
                this.f20575u = str;
                SharedPreferences.Editor editor = this.f20561g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.f20561g.apply();
                }
                m24063N();
            }
        }
    }

    /* renamed from: q */
    public final void mo14096q(String str) {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10360P6)).booleanValue()) {
            m24062M();
            synchronized (this.f20555a) {
                if (!this.f20578x.equals(str)) {
                    this.f20578x = str;
                    SharedPreferences.Editor editor = this.f20561g;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.f20561g.apply();
                    }
                    m24063N();
                }
            }
        }
    }

    /* renamed from: r */
    public final void mo14097r() {
        m24062M();
        synchronized (this.f20555a) {
            this.f20572r = new JSONObject();
            SharedPreferences.Editor editor = this.f20561g;
            if (editor != null) {
                editor.remove("native_advanced_settings");
                this.f20561g.apply();
            }
            m24063N();
        }
    }

    /* renamed from: s */
    public final void mo14098s(int i) {
        m24062M();
        synchronized (this.f20555a) {
            if (this.f20580z != i) {
                this.f20580z = i;
                SharedPreferences.Editor editor = this.f20561g;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i);
                    this.f20561g.apply();
                }
                m24063N();
            }
        }
    }

    /* renamed from: t */
    public final void mo14099t(boolean z) {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10360P6)).booleanValue()) {
            m24062M();
            synchronized (this.f20555a) {
                if (this.f20577w != z) {
                    this.f20577w = z;
                    SharedPreferences.Editor editor = this.f20561g;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z);
                        this.f20561g.apply();
                    }
                    m24063N();
                }
            }
        }
    }

    /* renamed from: u */
    public final void mo14100u(long j) {
        m24062M();
        synchronized (this.f20555a) {
            if (this.f20567m != j) {
                this.f20567m = j;
                SharedPreferences.Editor editor = this.f20561g;
                if (editor != null) {
                    editor.putLong("app_last_background_time_ms", j);
                    this.f20561g.apply();
                }
                m24063N();
            }
        }
    }

    /* renamed from: v */
    public final boolean mo14101v() {
        boolean z;
        m24062M();
        synchronized (this.f20555a) {
            z = this.f20574t;
        }
        return z;
    }

    /* renamed from: w */
    public final boolean mo14102w() {
        boolean z;
        m24062M();
        synchronized (this.f20555a) {
            z = this.f20573s;
        }
        return z;
    }

    /* renamed from: x */
    public final void mo14103x(Context context) {
        synchronized (this.f20555a) {
            if (this.f20560f == null) {
                this.f20558d = wo0.f16886a.mo6446I(new C3214v1(this, context, "admob"));
                this.f20556b = true;
            }
        }
    }

    /* renamed from: y */
    public final void mo14104y(boolean z) {
        m24062M();
        synchronized (this.f20555a) {
            if (this.f20573s != z) {
                this.f20573s = z;
                SharedPreferences.Editor editor = this.f20561g;
                if (editor != null) {
                    editor.putBoolean("content_url_opted_out", z);
                    this.f20561g.apply();
                }
                m24063N();
            }
        }
    }

    /* renamed from: z */
    public final void mo14105z(String str) {
        m24062M();
        synchronized (this.f20555a) {
            long a = C2694t.m21592a().mo12462a();
            if (str != null) {
                if (!str.equals(this.f20566l.mo9801c())) {
                    this.f20566l = new on0(str, a);
                    SharedPreferences.Editor editor = this.f20561g;
                    if (editor != null) {
                        editor.putString("app_settings_json", str);
                        this.f20561g.putLong("app_settings_last_update_ms", a);
                        this.f20561g.apply();
                    }
                    m24063N();
                    for (Runnable run : this.f20557c) {
                        run.run();
                    }
                    return;
                }
            }
            this.f20566l.mo9805g(a);
        }
    }

    public final int zza() {
        int i;
        m24062M();
        synchronized (this.f20555a) {
            i = this.f20570p;
        }
        return i;
    }
}
