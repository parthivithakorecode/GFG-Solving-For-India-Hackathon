package p002a1;

import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.C1605cv;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: a1.a */
public class C0013a {

    /* renamed from: a */
    private final int f7a;

    /* renamed from: b */
    private final String f8b;

    /* renamed from: c */
    private final String f9c;

    /* renamed from: d */
    private final C0013a f10d;

    public C0013a(int i, @RecentlyNonNull String str, @RecentlyNonNull String str2) {
        this(i, str, str2, (C0013a) null);
    }

    public C0013a(int i, @RecentlyNonNull String str, @RecentlyNonNull String str2, C0013a aVar) {
        this.f7a = i;
        this.f8b = str;
        this.f9c = str2;
        this.f10d = aVar;
    }

    /* renamed from: a */
    public int mo19a() {
        return this.f7a;
    }

    /* renamed from: b */
    public String mo20b() {
        return this.f9c;
    }

    /* renamed from: c */
    public String mo21c() {
        return this.f8b;
    }

    /* renamed from: d */
    public final C1605cv mo22d() {
        C0013a aVar = this.f10d;
        return new C1605cv(this.f7a, this.f8b, this.f9c, aVar == null ? null : new C1605cv(aVar.f7a, aVar.f8b, aVar.f9c, (C1605cv) null, (IBinder) null), (IBinder) null);
    }

    @RecentlyNonNull
    /* renamed from: e */
    public JSONObject mo23e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f7a);
        jSONObject.put("Message", this.f8b);
        jSONObject.put("Domain", this.f9c);
        C0013a aVar = this.f10d;
        jSONObject.put("Cause", aVar == null ? "null" : aVar.mo23e());
        return jSONObject;
    }

    @RecentlyNonNull
    public String toString() {
        try {
            return mo23e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
