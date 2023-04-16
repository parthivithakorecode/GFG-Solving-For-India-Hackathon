package com.google.android.gms.internal.ads;

final class vr3 implements hr3 {

    /* renamed from: a */
    private final kr3 f16398a;

    /* renamed from: b */
    private final String f16399b;

    /* renamed from: c */
    private final Object[] f16400c;

    /* renamed from: d */
    private final int f16401d;

    vr3(kr3 kr3, String str, Object[] objArr) {
        this.f16398a = kr3;
        this.f16399b = str;
        this.f16400c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f16401d = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f16401d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo7997a() {
        return (this.f16401d & 2) == 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo11516b() {
        return this.f16399b;
    }

    /* renamed from: c */
    public final int mo7998c() {
        return (this.f16401d & 1) == 1 ? 1 : 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Object[] mo11517d() {
        return this.f16400c;
    }

    public final kr3 zza() {
        return this.f16398a;
    }
}
