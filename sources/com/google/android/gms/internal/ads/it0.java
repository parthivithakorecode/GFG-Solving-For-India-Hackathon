package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;

final class it0 implements he1 {

    /* renamed from: a */
    private final he1 f8792a;

    /* renamed from: b */
    private final long f8793b;

    /* renamed from: c */
    private final he1 f8794c;

    /* renamed from: d */
    private long f8795d;

    /* renamed from: e */
    private Uri f8796e;

    it0(he1 he1, int i, he1 he12) {
        this.f8792a = he1;
        this.f8793b = (long) i;
        this.f8794c = he12;
    }

    /* renamed from: a */
    public final int mo5752a(byte[] bArr, int i, int i2) {
        int i3;
        long j = this.f8795d;
        long j2 = this.f8793b;
        if (j < j2) {
            int a = this.f8792a.mo5752a(bArr, i, (int) Math.min((long) i2, j2 - j));
            long j3 = this.f8795d + ((long) a);
            this.f8795d = j3;
            i3 = a;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j < this.f8793b) {
            return i3;
        }
        int a2 = this.f8794c.mo5752a(bArr, i + i3, i2 - i3);
        this.f8795d += (long) a2;
        return i3 + a2;
    }

    /* renamed from: h */
    public final Uri mo5753h() {
        return this.f8796e;
    }

    /* renamed from: i */
    public final void mo5754i() {
        this.f8792a.mo5754i();
        this.f8794c.mo5754i();
    }

    /* renamed from: j */
    public final void mo6892j(vt1 vt1) {
    }

    /* renamed from: k */
    public final long mo5755k(li1 li1) {
        li1 li12;
        li1 li13 = li1;
        this.f8796e = li13.f10058a;
        long j = li13.f10063f;
        long j2 = this.f8793b;
        li1 li14 = null;
        if (j >= j2) {
            li12 = null;
        } else {
            long j3 = li13.f10064g;
            long j4 = j2 - j;
            if (j3 != -1) {
                j4 = Math.min(j3, j4);
            }
            li12 = new li1(li13.f10058a, (byte[]) null, j, j, j4, (String) null, 0);
        }
        long j5 = li13.f10064g;
        if (j5 == -1 || li13.f10063f + j5 > this.f8793b) {
            long max = Math.max(this.f8793b, li13.f10063f);
            long j6 = li13.f10064g;
            li14 = new li1(li13.f10058a, (byte[]) null, max, max, j6 != -1 ? Math.min(j6, (li13.f10063f + j6) - this.f8793b) : -1, (String) null, 0);
        }
        long j7 = 0;
        long k = li12 != null ? this.f8792a.mo5755k(li12) : 0;
        if (li14 != null) {
            j7 = this.f8794c.mo5755k(li14);
        }
        this.f8795d = li13.f10063f;
        if (k == -1 || j7 == -1) {
            return -1;
        }
        return k + j7;
    }

    public final Map<String, List<String>> zza() {
        return i73.m10947d();
    }
}
