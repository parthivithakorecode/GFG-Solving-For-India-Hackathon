package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.el */
public class C1670el {

    /* renamed from: a */
    protected final C2447zk f6268a;

    /* renamed from: b */
    protected final int[] f6269b;

    /* renamed from: c */
    private final C2367xe[] f6270c = new C2367xe[1];

    /* renamed from: d */
    private int f6271d;

    public C1670el(C2447zk zkVar, int... iArr) {
        Objects.requireNonNull(zkVar);
        this.f6268a = zkVar;
        for (int i = 0; i <= 0; i++) {
            this.f6270c[i] = zkVar.mo12235b(iArr[i]);
        }
        Arrays.sort(this.f6270c, new C1632dl((C1595cl) null));
        this.f6269b = new int[1];
        for (int i2 = 0; i2 <= 0; i2++) {
            this.f6269b[i2] = zkVar.mo12234a(this.f6270c[i2]);
        }
    }

    /* renamed from: a */
    public final int mo6990a(int i) {
        return this.f6269b[0];
    }

    /* renamed from: b */
    public final int mo6991b() {
        int length = this.f6269b.length;
        return 1;
    }

    /* renamed from: c */
    public final C2367xe mo6992c(int i) {
        return this.f6270c[i];
    }

    /* renamed from: d */
    public final C2447zk mo6993d() {
        return this.f6268a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C1670el elVar = (C1670el) obj;
            return this.f6268a == elVar.f6268a && Arrays.equals(this.f6269b, elVar.f6269b);
        }
    }

    public final int hashCode() {
        int i = this.f6271d;
        if (i != 0) {
            return i;
        }
        int identityHashCode = (System.identityHashCode(this.f6268a) * 31) + Arrays.hashCode(this.f6269b);
        this.f6271d = identityHashCode;
        return identityHashCode;
    }
}
