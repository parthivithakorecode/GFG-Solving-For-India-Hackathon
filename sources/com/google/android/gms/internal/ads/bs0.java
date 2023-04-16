package com.google.android.gms.internal.ads;

import android.net.Uri;

final class bs0 implements C2225tl {

    /* renamed from: a */
    private final C2225tl f5023a;

    /* renamed from: b */
    private final long f5024b;

    /* renamed from: c */
    private final C2225tl f5025c;

    /* renamed from: d */
    private long f5026d;

    /* renamed from: e */
    private Uri f5027e;

    bs0(C2225tl tlVar, int i, C2225tl tlVar2) {
        this.f5023a = tlVar;
        this.f5024b = (long) i;
        this.f5025c = tlVar2;
    }

    /* renamed from: c */
    public final Uri mo5934c() {
        return this.f5027e;
    }

    /* renamed from: d */
    public final int mo5935d(byte[] bArr, int i, int i2) {
        int i3;
        long j = this.f5026d;
        long j2 = this.f5024b;
        if (j < j2) {
            int d = this.f5023a.mo5935d(bArr, i, (int) Math.min((long) i2, j2 - j));
            long j3 = this.f5026d + ((long) d);
            this.f5026d = j3;
            i3 = d;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j < this.f5024b) {
            return i3;
        }
        int d2 = this.f5025c.mo5935d(bArr, i + i3, i2 - i3);
        this.f5026d += (long) d2;
        return i3 + d2;
    }

    /* renamed from: e */
    public final long mo5936e(C2299vl vlVar) {
        C2299vl vlVar2;
        C2299vl vlVar3 = vlVar;
        this.f5027e = vlVar3.f16339a;
        long j = vlVar3.f16341c;
        long j2 = this.f5024b;
        C2299vl vlVar4 = null;
        if (j >= j2) {
            vlVar2 = null;
        } else {
            long j3 = vlVar3.f16342d;
            long j4 = j2 - j;
            if (j3 != -1) {
                j4 = Math.min(j3, j4);
            }
            vlVar2 = new C2299vl(vlVar3.f16339a, (byte[]) null, j, j, j4, (String) null, 0);
        }
        long j5 = vlVar3.f16342d;
        if (j5 == -1 || vlVar3.f16341c + j5 > this.f5024b) {
            long max = Math.max(this.f5024b, vlVar3.f16341c);
            long j6 = vlVar3.f16342d;
            vlVar4 = new C2299vl(vlVar3.f16339a, (byte[]) null, max, max, j6 != -1 ? Math.min(j6, (vlVar3.f16341c + j6) - this.f5024b) : -1, (String) null, 0);
        }
        long j7 = 0;
        long e = vlVar2 != null ? this.f5023a.mo5936e(vlVar2) : 0;
        if (vlVar4 != null) {
            j7 = this.f5025c.mo5936e(vlVar4);
        }
        this.f5026d = vlVar3.f16341c;
        if (j7 == -1) {
            return -1;
        }
        return e + j7;
    }

    /* renamed from: g */
    public final void mo5937g() {
        this.f5023a.mo5937g();
        this.f5025c.mo5937g();
    }
}
