package p073j5;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: j5.k */
final class C3281k extends C3277g {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Comparator<Map.Entry<String, Long>> f20748b = new C3282a();

    /* renamed from: j5.k$a */
    class C3282a implements Comparator<Map.Entry<String, Long>> {
        C3282a() {
        }

        /* renamed from: a */
        public int compare(Map.Entry<String, Long> entry, Map.Entry<String, Long> entry2) {
            return entry2.getKey().length() - entry.getKey().length();
        }
    }

    /* renamed from: j5.k$b */
    static final class C3283b {

        /* renamed from: a */
        private final Map<C3284l, Map<Long, String>> f20749a;

        /* renamed from: b */
        private final Map<C3284l, List<Map.Entry<String, Long>>> f20750b;

        C3283b(Map<C3284l, Map<Long, String>> map) {
            this.f20749a = map;
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (C3284l next : map.keySet()) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry : map.get(next).entrySet()) {
                    hashMap2.put(entry.getValue(), C3281k.m24335e(entry.getValue(), entry.getKey()));
                }
                ArrayList arrayList2 = new ArrayList(hashMap2.values());
                Collections.sort(arrayList2, C3281k.f20748b);
                hashMap.put(next, arrayList2);
                arrayList.addAll(arrayList2);
                hashMap.put((Object) null, arrayList);
            }
            Collections.sort(arrayList, C3281k.f20748b);
            this.f20750b = hashMap;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo14268a(long j, C3284l lVar) {
            Map map = this.f20749a.get(lVar);
            if (map != null) {
                return (String) map.get(Long.valueOf(j));
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Iterator<Map.Entry<String, Long>> mo14269b(C3284l lVar) {
            List list = this.f20750b.get(lVar);
            if (list != null) {
                return list.iterator();
            }
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static <A, B> Map.Entry<A, B> m24335e(A a, B b) {
        return new AbstractMap.SimpleImmutableEntry(a, b);
    }
}
