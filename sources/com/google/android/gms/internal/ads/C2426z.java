package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.google.android.gms.internal.ads.z */
final class C2426z {

    /* renamed from: a */
    private final byte[] f17953a = new byte[10];

    /* renamed from: b */
    private boolean f17954b;

    /* renamed from: c */
    private int f17955c;

    /* renamed from: d */
    private long f17956d;

    /* renamed from: e */
    private int f17957e;

    /* renamed from: f */
    private int f17958f;

    /* renamed from: g */
    private int f17959g;

    @RequiresNonNull({"#1.output"})
    /* renamed from: a */
    public final void mo12117a(C2389y yVar) {
        if (this.f17955c > 0) {
            yVar.f17499X.mo7872a(this.f17956d, this.f17957e, this.f17958f, this.f17959g, yVar.f17510j);
            this.f17955c = 0;
        }
    }

    /* renamed from: b */
    public final void mo12118b() {
        this.f17954b = false;
        this.f17955c = 0;
    }

    @RequiresNonNull({"#1.output"})
    /* renamed from: c */
    public final void mo12119c(C2389y yVar, long j, int i, int i2, int i3) {
        if (this.f17954b) {
            int i4 = this.f17955c;
            int i5 = i4 + 1;
            this.f17955c = i5;
            if (i4 == 0) {
                this.f17956d = j;
                this.f17957e = i;
                this.f17958f = 0;
            }
            this.f17958f += i2;
            this.f17959g = i3;
            if (i5 >= 16) {
                mo12117a(yVar);
            }
        }
    }

    /* renamed from: d */
    public final void mo12120d(pc4 pc4) {
        if (!this.f17954b) {
            ((jc4) pc4).mo6917n(this.f17953a, 0, 10, false);
            pc4.mo6914i();
            byte[] bArr = this.f17953a;
            int i = tb4.f14817g;
            if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
                this.f17954b = true;
            }
        }
    }
}
