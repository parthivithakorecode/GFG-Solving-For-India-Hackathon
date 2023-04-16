package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.al */
public final class C1521al {

    /* renamed from: d */
    public static final C1521al f4235d = new C1521al(new C2447zk[0]);

    /* renamed from: a */
    public final int f4236a;

    /* renamed from: b */
    private final C2447zk[] f4237b;

    /* renamed from: c */
    private int f4238c;

    public C1521al(C2447zk... zkVarArr) {
        this.f4237b = zkVarArr;
        this.f4236a = zkVarArr.length;
    }

    /* renamed from: a */
    public final int mo5308a(C2447zk zkVar) {
        for (int i = 0; i < this.f4236a; i++) {
            if (this.f4237b[i] == zkVar) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final C2447zk mo5309b(int i) {
        return this.f4237b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1521al.class == obj.getClass()) {
            C1521al alVar = (C1521al) obj;
            return this.f4236a == alVar.f4236a && Arrays.equals(this.f4237b, alVar.f4237b);
        }
    }

    public final int hashCode() {
        int i = this.f4238c;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f4237b);
        this.f4238c = hashCode;
        return hashCode;
    }
}
