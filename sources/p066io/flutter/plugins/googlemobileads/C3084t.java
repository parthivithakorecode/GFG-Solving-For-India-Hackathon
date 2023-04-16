package p066io.flutter.plugins.googlemobileads;

import java.util.HashMap;
import java.util.Map;
import p047g1.C2631a;
import p047g1.C2633b;

/* renamed from: io.flutter.plugins.googlemobileads.t */
class C3084t {

    /* renamed from: a */
    final Map<String, C3076o> f20188a;

    C3084t(C2633b bVar) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : bVar.mo9616a().entrySet()) {
            hashMap.put((String) next.getKey(), new C3076o((C2631a) next.getValue()));
        }
        this.f20188a = hashMap;
    }

    C3084t(Map<String, C3076o> map) {
        this.f20188a = map;
    }
}
