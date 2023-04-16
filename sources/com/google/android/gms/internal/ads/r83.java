package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

public final class r83 {
    /* renamed from: a */
    static Object m16099a(@CheckForNull Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    /* renamed from: b */
    static Object[] m16100b(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m16099a(objArr[i2], i2);
        }
        return objArr;
    }
}
