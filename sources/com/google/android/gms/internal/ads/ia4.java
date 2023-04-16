package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class ia4 implements he1 {

    /* renamed from: a */
    private final he1 f8586a;

    /* renamed from: b */
    private long f8587b;

    /* renamed from: c */
    private Uri f8588c = Uri.EMPTY;

    /* renamed from: d */
    private Map<String, List<String>> f8589d = Collections.emptyMap();

    public ia4(he1 he1) {
        Objects.requireNonNull(he1);
        this.f8586a = he1;
    }

    /* renamed from: a */
    public final int mo5752a(byte[] bArr, int i, int i2) {
        int a = this.f8586a.mo5752a(bArr, i, i2);
        if (a != -1) {
            this.f8587b += (long) a;
        }
        return a;
    }

    /* renamed from: c */
    public final long mo8121c() {
        return this.f8587b;
    }

    /* renamed from: h */
    public final Uri mo5753h() {
        return this.f8586a.mo5753h();
    }

    /* renamed from: i */
    public final void mo5754i() {
        this.f8586a.mo5754i();
    }

    /* renamed from: j */
    public final void mo6892j(vt1 vt1) {
        Objects.requireNonNull(vt1);
        this.f8586a.mo6892j(vt1);
    }

    /* renamed from: k */
    public final long mo5755k(li1 li1) {
        this.f8588c = li1.f10058a;
        this.f8589d = Collections.emptyMap();
        long k = this.f8586a.mo5755k(li1);
        Uri h = mo5753h();
        Objects.requireNonNull(h);
        this.f8588c = h;
        this.f8589d = zza();
        return k;
    }

    /* renamed from: o */
    public final Uri mo8122o() {
        return this.f8588c;
    }

    /* renamed from: p */
    public final Map<String, List<String>> mo8123p() {
        return this.f8589d;
    }

    public final Map<String, List<String>> zza() {
        return this.f8586a.zza();
    }
}
