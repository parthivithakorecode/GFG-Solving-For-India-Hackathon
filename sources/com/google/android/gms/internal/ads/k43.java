package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import javax.annotation.CheckForNull;

public final class k43 {

    /* renamed from: a */
    private final String f9395a;

    /* renamed from: b */
    private final h43 f9396b;

    /* renamed from: c */
    private h43 f9397c;

    /* synthetic */ k43(String str, i43 i43) {
        h43 h43 = new h43((g43) null);
        this.f9396b = h43;
        this.f9397c = h43;
        Objects.requireNonNull(str);
        this.f9395a = str;
    }

    /* renamed from: a */
    public final k43 mo8613a(@CheckForNull Object obj) {
        h43 h43 = new h43((g43) null);
        this.f9397c.f8045b = h43;
        this.f9397c = h43;
        h43.f8044a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f9395a);
        sb.append('{');
        h43 h43 = this.f9396b.f8045b;
        String str = "";
        while (h43 != null) {
            Object obj = h43.f8044a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append(deepToString, 1, deepToString.length() - 1);
            }
            h43 = h43.f8045b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
