package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.ml */
public final class C1966ml {

    /* renamed from: a */
    private int f10926a;

    /* renamed from: b */
    private final C1670el[] f10927b;

    public C1966ml(C1670el[] elVarArr, byte... bArr) {
        this.f10927b = elVarArr;
    }

    /* renamed from: a */
    public final C1670el mo9274a(int i) {
        return this.f10927b[i];
    }

    /* renamed from: b */
    public final C1670el[] mo9275b() {
        return (C1670el[]) this.f10927b.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1966ml.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f10927b, ((C1966ml) obj).f10927b);
    }

    public final int hashCode() {
        int i = this.f10926a;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f10927b) + 527;
        this.f10926a = hashCode;
        return hashCode;
    }
}
