package p066io.flutter.embedding.engine;

import java.util.HashMap;
import java.util.Map;

/* renamed from: io.flutter.embedding.engine.b */
public class C2964b {

    /* renamed from: b */
    private static C2964b f19835b;

    /* renamed from: a */
    private final Map<String, C2961a> f19836a = new HashMap();

    C2964b() {
    }

    /* renamed from: b */
    public static C2964b m23056b() {
        if (f19835b == null) {
            f19835b = new C2964b();
        }
        return f19835b;
    }

    /* renamed from: a */
    public C2961a mo13493a(String str) {
        return this.f19836a.get(str);
    }

    /* renamed from: c */
    public void mo13494c(String str, C2961a aVar) {
        if (aVar != null) {
            this.f19836a.put(str, aVar);
        } else {
            this.f19836a.remove(str);
        }
    }

    /* renamed from: d */
    public void mo13495d(String str) {
        mo13494c(str, (C2961a) null);
    }
}
