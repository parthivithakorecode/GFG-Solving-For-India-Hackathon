package p111p1;

import android.util.JsonReader;
import com.google.android.gms.internal.ads.cc3;
import com.google.android.gms.internal.ads.rb3;
import com.google.android.gms.internal.ads.vi0;
import com.google.android.gms.internal.ads.xa3;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONException;
import p054h1.C2694t;

/* renamed from: p1.g */
public final /* synthetic */ class C3899g implements xa3 {

    /* renamed from: a */
    public final /* synthetic */ vi0 f22021a;

    public /* synthetic */ C3899g(vi0 vi0) {
        this.f22021a = vi0;
    }

    /* renamed from: c */
    public final cc3 mo5074c(Object obj) {
        vi0 vi0 = this.f22021a;
        C3905j jVar = new C3905j(new JsonReader(new InputStreamReader((InputStream) obj)));
        try {
            jVar.f22038b = C2694t.m21608q().mo14023M(vi0.f16310f).toString();
        } catch (JSONException unused) {
            jVar.f22038b = "{}";
        }
        return rb3.m16131i(jVar);
    }
}
