package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@Deprecated
@ParametersAreNonnullByDefault
public final class z10 {

    /* renamed from: a */
    private final Map<String, y10> f17971a = new HashMap();

    /* renamed from: b */
    private final b20 f17972b;

    public z10(b20 b20) {
        this.f17972b = b20;
    }

    /* renamed from: a */
    public final b20 mo12128a() {
        return this.f17972b;
    }

    /* renamed from: b */
    public final void mo12129b(String str, y10 y10) {
        this.f17971a.put(str, y10);
    }

    /* renamed from: c */
    public final void mo12130c(String str, String str2, long j) {
        b20 b20 = this.f17972b;
        y10 y10 = this.f17971a.get(str2);
        String[] strArr = {str};
        if (y10 != null) {
            b20.mo5632e(y10, j, strArr);
        }
        this.f17971a.put(str, new y10(j, (String) null, (y10) null));
    }
}
