package p002a1;

import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.internal.ads.C2199sw;
import com.google.android.gms.internal.ads.C2235tv;
import com.google.android.gms.internal.ads.C2461zy;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.m10;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: a1.v */
public final class C0039v {

    /* renamed from: a */
    private final C2461zy f64a;

    /* renamed from: b */
    private final List<C0027k> f65b = new ArrayList();

    private C0039v(C2461zy zyVar) {
        this.f64a = zyVar;
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10484e6)).booleanValue() && zyVar != null) {
            try {
                List<C2235tv> e = zyVar.mo9705e();
                if (e != null) {
                    for (C2235tv e2 : e) {
                        C0027k e3 = C0027k.m82e(e2);
                        if (e3 != null) {
                            this.f65b.add(e3);
                        }
                    }
                }
            } catch (RemoteException e4) {
                io0.m11129e("Could not forward getAdapterResponseInfo to ResponseInfo.", e4);
            }
        }
    }

    /* renamed from: d */
    public static C0039v m121d(C2461zy zyVar) {
        if (zyVar != null) {
            return new C0039v(zyVar);
        }
        return null;
    }

    /* renamed from: e */
    public static C0039v m122e(C2461zy zyVar) {
        return new C0039v(zyVar);
    }

    /* renamed from: a */
    public List<C0027k> mo117a() {
        return this.f65b;
    }

    @RecentlyNullable
    /* renamed from: b */
    public String mo118b() {
        try {
            C2461zy zyVar = this.f64a;
            if (zyVar != null) {
                return zyVar.mo9702b();
            }
            return null;
        } catch (RemoteException e) {
            io0.m11129e("Could not forward getMediationAdapterClassName to ResponseInfo.", e);
            return null;
        }
    }

    @RecentlyNullable
    /* renamed from: c */
    public String mo119c() {
        try {
            C2461zy zyVar = this.f64a;
            if (zyVar != null) {
                return zyVar.mo9704d();
            }
            return null;
        } catch (RemoteException e) {
            io0.m11129e("Could not forward getResponseId to ResponseInfo.", e);
            return null;
        }
    }

    @RecentlyNonNull
    /* renamed from: f */
    public final JSONObject mo120f() {
        JSONObject jSONObject = new JSONObject();
        String c = mo119c();
        if (c == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", c);
        }
        String b = mo118b();
        if (b == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", b);
        }
        JSONArray jSONArray = new JSONArray();
        for (C0027k f : this.f65b) {
            jSONArray.put(f.mo81f());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        return jSONObject;
    }

    @RecentlyNonNull
    public String toString() {
        try {
            return mo120f().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
