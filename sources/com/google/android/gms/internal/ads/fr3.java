package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

final class fr3 {
    fr3() {
    }

    /* renamed from: a */
    public static final int m9274a(int i, Object obj, Object obj2) {
        er3 er3 = (er3) obj;
        dr3 dr3 = (dr3) obj2;
        if (er3.isEmpty()) {
            return 0;
        }
        Iterator it = er3.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    /* renamed from: b */
    public static final boolean m9275b(Object obj) {
        return !((er3) obj).mo7045e();
    }

    /* renamed from: c */
    public static final Object m9276c(Object obj, Object obj2) {
        er3 er3 = (er3) obj;
        er3 er32 = (er3) obj2;
        if (!er32.isEmpty()) {
            if (!er3.mo7045e()) {
                er3 = er3.mo7041b();
            }
            er3.mo7044d(er32);
        }
        return er3;
    }
}
