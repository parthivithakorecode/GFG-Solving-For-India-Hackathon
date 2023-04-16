package p005a4;

import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: a4.f */
public final class C0140f implements C0143i<Object> {

    /* renamed from: a */
    public static final C0140f f267a = new C0140f();

    private C0140f() {
    }

    /* renamed from: a */
    public ByteBuffer mo323a(Object obj) {
        C0160t tVar;
        String obj2;
        if (obj == null) {
            return null;
        }
        Object a = C0142h.m411a(obj);
        if (a instanceof String) {
            tVar = C0160t.f287b;
            obj2 = JSONObject.quote((String) a);
        } else {
            tVar = C0160t.f287b;
            obj2 = a.toString();
        }
        return tVar.mo323a(obj2);
    }

    /* renamed from: b */
    public Object mo324b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            JSONTokener jSONTokener = new JSONTokener(C0160t.f287b.mo324b(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (!jSONTokener.more()) {
                return nextValue;
            }
            throw new IllegalArgumentException("Invalid JSON");
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }
}
