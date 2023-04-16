package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ah */
public final class C1517ah implements C1851jh {

    /* renamed from: a */
    public final int[] f4107a;

    /* renamed from: b */
    public final long[] f4108b;

    /* renamed from: c */
    public final long[] f4109c;

    /* renamed from: d */
    public final long[] f4110d;

    /* renamed from: e */
    private final long f4111e;

    public C1517ah(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f4107a = iArr;
        this.f4108b = jArr;
        this.f4109c = jArr2;
        this.f4110d = jArr3;
        int length = iArr.length;
        if (length > 0) {
            int i = length - 1;
            this.f4111e = jArr2[i] + jArr3[i];
            return;
        }
        this.f4111e = 0;
    }

    /* renamed from: a */
    public final long mo5288a(long j) {
        return this.f4108b[C2449zm.m20724c(this.f4110d, j, true, true)];
    }

    /* renamed from: c */
    public final boolean mo5289c() {
        return true;
    }

    public final long zza() {
        return this.f4111e;
    }
}
