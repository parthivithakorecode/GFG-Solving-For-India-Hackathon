package p002a1;

import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.internal.ads.C1605cv;
import com.google.android.gms.internal.ads.C2235tv;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: a1.k */
public final class C0027k {

    /* renamed from: a */
    private final C2235tv f47a;

    /* renamed from: b */
    private final C0013a f48b;

    private C0027k(C2235tv tvVar) {
        this.f47a = tvVar;
        C1605cv cvVar = tvVar.f15054h;
        this.f48b = cvVar == null ? null : cvVar.mo6305c();
    }

    /* renamed from: e */
    public static C0027k m82e(C2235tv tvVar) {
        if (tvVar != null) {
            return new C0027k(tvVar);
        }
        return null;
    }

    @RecentlyNullable
    /* renamed from: a */
    public C0013a mo77a() {
        return this.f48b;
    }

    @RecentlyNonNull
    /* renamed from: b */
    public String mo78b() {
        return this.f47a.f15052f;
    }

    @RecentlyNonNull
    /* renamed from: c */
    public Bundle mo79c() {
        return this.f47a.f15055i;
    }

    /* renamed from: d */
    public long mo80d() {
        return this.f47a.f15053g;
    }

    @RecentlyNonNull
    /* renamed from: f */
    public final JSONObject mo81f() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Adapter", this.f47a.f15052f);
        jSONObject.put("Latency", this.f47a.f15053g);
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.f47a.f15055i.keySet()) {
            jSONObject2.put(str, this.f47a.f15055i.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        C0013a aVar = this.f48b;
        jSONObject.put("Ad Error", aVar == null ? "null" : aVar.mo23e());
        return jSONObject;
    }

    @RecentlyNonNull
    public String toString() {
        try {
            return mo81f().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
