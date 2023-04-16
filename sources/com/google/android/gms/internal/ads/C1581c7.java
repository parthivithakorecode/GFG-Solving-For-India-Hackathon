package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.internal.ads.c7 */
public final class C1581c7 extends C2062p6 {
    public C1581c7(C1544b7 b7Var, SSLSocketFactory sSLSocketFactory) {
    }

    /* renamed from: a */
    static List<C2172s5> m7250a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            if (next.getKey() != null) {
                for (String s5Var : (List) next.getValue()) {
                    arrayList.add(new C2172s5((String) next.getKey(), s5Var));
                }
            }
        }
        return arrayList;
    }
}
