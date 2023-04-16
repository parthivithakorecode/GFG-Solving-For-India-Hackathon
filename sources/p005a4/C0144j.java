package p005a4;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: a4.j */
public final class C0144j {

    /* renamed from: a */
    public final String f269a;

    /* renamed from: b */
    public final Object f270b;

    public C0144j(String str, Object obj) {
        this.f269a = str;
        this.f270b = obj;
    }

    /* renamed from: a */
    public <T> T mo332a(String str) {
        Object obj = this.f270b;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }

    /* renamed from: b */
    public <T> T mo333b() {
        return this.f270b;
    }

    /* renamed from: c */
    public boolean mo334c(String str) {
        Object obj = this.f270b;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Map) {
            return ((Map) obj).containsKey(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).has(str);
        }
        throw new ClassCastException();
    }
}
