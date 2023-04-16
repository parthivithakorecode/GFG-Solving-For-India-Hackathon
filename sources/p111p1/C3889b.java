package p111p1;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: p1.b */
final class C3889b extends LinkedHashMap<String, Pair<Long, String>> {

    /* renamed from: f */
    final /* synthetic */ C3908l f21978f;

    C3889b(C3908l lVar) {
        this.f21978f = lVar;
    }

    /* access modifiers changed from: protected */
    public final boolean removeEldestEntry(Map.Entry<String, Pair<Long, String>> entry) {
        return size() > this.f21978f.f22043a;
    }
}
