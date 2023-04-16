package p066io.flutter.plugin.platform;

import java.util.HashMap;
import java.util.Map;

/* renamed from: io.flutter.plugin.platform.i */
class C3010i implements C3009h {

    /* renamed from: a */
    private final Map<String, C3008g> f19973a = new HashMap();

    C3010i() {
    }

    /* renamed from: a */
    public boolean mo13667a(String str, C3008g gVar) {
        if (this.f19973a.containsKey(str)) {
            return false;
        }
        this.f19973a.put(str, gVar);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C3008g mo13668b(String str) {
        return this.f19973a.get(str);
    }
}
