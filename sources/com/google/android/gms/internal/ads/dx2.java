package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p034e2.C2547d;

final class dx2 {

    /* renamed from: a */
    private final C2547d f5964a;

    /* renamed from: b */
    private final Map<String, List<String>> f5965b = new HashMap();

    /* renamed from: c */
    private final Map<String, Long> f5966c = new HashMap();

    public dx2(C2547d dVar) {
        this.f5964a = dVar;
    }

    /* renamed from: d */
    private final void m8152d(String str, String str2) {
        if (!this.f5965b.containsKey(str)) {
            this.f5965b.put(str, new ArrayList());
        }
        this.f5965b.get(str).add(str2);
    }

    /* renamed from: a */
    public final List<cx2> mo6708a() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : this.f5965b.entrySet()) {
            int i = 0;
            if (((List) next.getValue()).size() > 1) {
                for (String cx2 : (List) next.getValue()) {
                    String str = (String) next.getKey();
                    i++;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                    sb.append(str);
                    sb.append(".");
                    sb.append(i);
                    arrayList.add(new cx2(sb.toString(), cx2));
                }
            } else {
                arrayList.add(new cx2((String) next.getKey(), (String) ((List) next.getValue()).get(0)));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo6709b(String str) {
        if (this.f5966c.containsKey(str)) {
            long b = this.f5964a.mo12463b();
            long longValue = this.f5966c.remove(str).longValue();
            StringBuilder sb = new StringBuilder(20);
            sb.append(b - longValue);
            m8152d(str, sb.toString());
            return;
        }
        this.f5966c.put(str, Long.valueOf(this.f5964a.mo12463b()));
    }

    /* renamed from: c */
    public final void mo6710c(String str, String str2) {
        if (this.f5966c.containsKey(str)) {
            long b = this.f5964a.mo12463b();
            long longValue = this.f5966c.remove(str).longValue();
            StringBuilder sb = new StringBuilder(str2.length() + 20);
            sb.append(str2);
            sb.append(b - longValue);
            m8152d(str, sb.toString());
            return;
        }
        this.f5966c.put(str, Long.valueOf(this.f5964a.mo12463b()));
    }
}
