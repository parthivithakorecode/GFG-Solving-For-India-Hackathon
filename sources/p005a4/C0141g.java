package p005a4;

import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: a4.g */
public final class C0141g implements C0151l {

    /* renamed from: a */
    public static final C0141g f268a = new C0141g();

    private C0141g() {
    }

    /* renamed from: a */
    public ByteBuffer mo325a(Object obj) {
        return C0140f.f267a.mo323a(new JSONArray().put(C0142h.m411a(obj)));
    }

    /* renamed from: b */
    public ByteBuffer mo326b(String str, String str2, Object obj, String str3) {
        return C0140f.f267a.mo323a(new JSONArray().put(str).put(C0142h.m411a(str2)).put(C0142h.m411a(obj)).put(C0142h.m411a(str3)));
    }

    /* renamed from: c */
    public ByteBuffer mo327c(String str, String str2, Object obj) {
        return C0140f.f267a.mo323a(new JSONArray().put(str).put(C0142h.m411a(str2)).put(C0142h.m411a(obj)));
    }

    /* renamed from: d */
    public C0144j mo328d(ByteBuffer byteBuffer) {
        try {
            Object b = C0140f.f267a.mo324b(byteBuffer);
            if (b instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) b;
                Object obj = jSONObject.get("method");
                Object g = mo331g(jSONObject.opt("args"));
                if (obj instanceof String) {
                    return new C0144j((String) obj, g);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + b);
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }

    /* renamed from: e */
    public Object mo329e(ByteBuffer byteBuffer) {
        try {
            Object b = C0140f.f267a.mo324b(byteBuffer);
            if (b instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) b;
                if (jSONArray.length() == 1) {
                    return mo331g(jSONArray.opt(0));
                }
                if (jSONArray.length() == 3) {
                    Object obj = jSONArray.get(0);
                    Object g = mo331g(jSONArray.opt(1));
                    Object g2 = mo331g(jSONArray.opt(2));
                    if ((obj instanceof String) && (g == null || (g instanceof String))) {
                        throw new C0139e((String) obj, (String) g, g2);
                    }
                }
            }
            throw new IllegalArgumentException("Invalid envelope: " + b);
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }

    /* renamed from: f */
    public ByteBuffer mo330f(C0144j jVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", jVar.f269a);
            jSONObject.put("args", C0142h.m411a(jVar.f270b));
            return C0140f.f267a.mo323a(jSONObject);
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Object mo331g(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj;
    }
}
