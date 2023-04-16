package p071j3;

import java.util.HashMap;
import java.util.Map;
import p056h3.C2710d0;

/* renamed from: j3.h */
public class C3241h {
    /* renamed from: a */
    public static Map<String, Object> m24172a(C3238e eVar) {
        C2710d0 d = eVar.mo14147d();
        if (d == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sql", d.mo12715c());
        hashMap.put("arguments", d.mo12714b());
        return hashMap;
    }
}
