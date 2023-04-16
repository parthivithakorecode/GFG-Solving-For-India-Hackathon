package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.zk */
public final class C2447zk {

    /* renamed from: a */
    public final int f18267a = 1;

    /* renamed from: b */
    private final C2367xe[] f18268b;

    /* renamed from: c */
    private int f18269c;

    public C2447zk(C2367xe... xeVarArr) {
        this.f18268b = xeVarArr;
    }

    /* renamed from: a */
    public final int mo12234a(C2367xe xeVar) {
        for (int i = 0; i <= 0; i++) {
            if (xeVar == this.f18268b[i]) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final C2367xe mo12235b(int i) {
        return this.f18268b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C2447zk.class == obj.getClass() && Arrays.equals(this.f18268b, ((C2447zk) obj).f18268b);
    }

    public final int hashCode() {
        int i = this.f18269c;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f18268b) + 527;
        this.f18269c = hashCode;
        return hashCode;
    }
}
