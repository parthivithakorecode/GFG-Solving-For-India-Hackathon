package p054h1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.C1902kv;
import com.google.android.gms.internal.ads.fj2;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.po0;
import com.google.android.gms.internal.ads.r20;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import p041f2.C2606c;

/* renamed from: h1.r */
final class C2692r {

    /* renamed from: a */
    private final Context f19148a;

    /* renamed from: b */
    private final String f19149b;

    /* renamed from: c */
    private final Map<String, String> f19150c = new TreeMap();

    /* renamed from: d */
    private String f19151d;

    /* renamed from: e */
    private String f19152e;

    /* renamed from: f */
    private final String f19153f;

    public C2692r(Context context, String str) {
        String str2;
        this.f19148a = context.getApplicationContext();
        this.f19149b = str;
        String packageName = context.getPackageName();
        try {
            String str3 = C2606c.m21299a(context).mo12496f(context.getPackageName(), 0).versionName;
            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 1 + String.valueOf(str3).length());
            sb.append(packageName);
            sb.append("-");
            sb.append(str3);
            str2 = sb.toString();
        } catch (PackageManager.NameNotFoundException e) {
            io0.m11129e("Unable to get package version name for reporting", e);
            str2 = String.valueOf(packageName).concat("-missing");
        }
        this.f19153f = str2;
    }

    /* renamed from: a */
    public final String mo12688a() {
        return this.f19153f;
    }

    /* renamed from: b */
    public final String mo12689b() {
        return this.f19152e;
    }

    /* renamed from: c */
    public final String mo12690c() {
        return this.f19149b;
    }

    /* renamed from: d */
    public final String mo12691d() {
        return this.f19151d;
    }

    /* renamed from: e */
    public final Map<String, String> mo12692e() {
        return this.f19150c;
    }

    /* renamed from: f */
    public final void mo12693f(C1902kv kvVar, po0 po0) {
        this.f19151d = kvVar.f9676o.f12392f;
        Bundle bundle = kvVar.f9679r;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 != null) {
            String e = r20.f13478c.mo9928e();
            for (String str : bundle2.keySet()) {
                if (e.equals(str)) {
                    this.f19152e = bundle2.getString(str);
                } else if (str.startsWith("csa_")) {
                    this.f19150c.put(str.substring(4), bundle2.getString(str));
                }
            }
            this.f19150c.put("SDKVersion", po0.f12729f);
            if (r20.f13476a.mo9928e().booleanValue()) {
                try {
                    Bundle b = fj2.m9189b(this.f19148a, new JSONArray(r20.f13477b.mo9928e()));
                    for (String str2 : b.keySet()) {
                        this.f19150c.put(str2, b.get(str2).toString());
                    }
                } catch (JSONException e2) {
                    io0.m11129e("Flag gads:afs:csa_tcf_data_to_collect not a valid JSON array", e2);
                }
            }
        }
    }
}
