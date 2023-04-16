package p054h1;

import com.google.android.gms.internal.ads.cc3;
import com.google.android.gms.internal.ads.rb3;
import com.google.android.gms.internal.ads.xa3;
import org.json.JSONObject;

/* renamed from: h1.d */
public final /* synthetic */ class C2678d implements xa3 {

    /* renamed from: a */
    public static final /* synthetic */ C2678d f19114a = new C2678d();

    private /* synthetic */ C2678d() {
    }

    /* renamed from: c */
    public final cc3 mo5074c(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.optBoolean("isSuccessful", false)) {
            C2694t.m21607p().mo11025h().mo14105z(jSONObject.getString("appSettingsJson"));
        }
        return rb3.m16131i(null);
    }
}
