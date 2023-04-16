package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.bk */
final class C1557bk implements C1708fm {

    /* renamed from: a */
    private final Uri f4961a;

    /* renamed from: b */
    private final C2225tl f4962b;

    /* renamed from: c */
    private final C1594ck f4963c;

    /* renamed from: d */
    private final C1930lm f4964d;

    /* renamed from: e */
    private final C1777hh f4965e = new C1777hh();

    /* renamed from: f */
    private volatile boolean f4966f;

    /* renamed from: g */
    private boolean f4967g = true;

    /* renamed from: h */
    private long f4968h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public long f4969i = -1;

    /* renamed from: j */
    final /* synthetic */ C1669ek f4970j;

    public C1557bk(C1669ek ekVar, Uri uri, C2225tl tlVar, C1594ck ckVar, C1930lm lmVar) {
        this.f4970j = ekVar;
        Objects.requireNonNull(uri);
        this.f4961a = uri;
        Objects.requireNonNull(tlVar);
        this.f4962b = tlVar;
        Objects.requireNonNull(ckVar);
        this.f4963c = ckVar;
        this.f4964d = lmVar;
    }

    /* renamed from: a */
    public final void mo5870a() {
        this.f4966f = true;
    }

    /* renamed from: b */
    public final boolean mo5871b() {
        return this.f4966f;
    }

    /* renamed from: c */
    public final void mo5872c() {
        C1554bh bhVar;
        while (!this.f4966f) {
            int i = 0;
            try {
                long j = this.f4965e.f8220a;
                C2225tl tlVar = this.f4962b;
                C2299vl vlVar = r4;
                C2299vl vlVar2 = new C2299vl(this.f4961a, (byte[]) null, j, j, -1, (String) null, 0);
                long e = tlVar.mo5936e(vlVar);
                this.f4969i = e;
                long j2 = j;
                if (e != -1) {
                    e += j2;
                    this.f4969i = e;
                }
                bhVar = new C1554bh(this.f4962b, j2, e);
                try {
                    C1591ch b = this.f4963c.mo6211b(bhVar, this.f4962b.mo5934c());
                    if (this.f4967g) {
                        b.mo6196b(j2, this.f4968h);
                        this.f4967g = false;
                    }
                    int i2 = 0;
                    long j3 = j2;
                    while (true) {
                        if (i2 != 0) {
                            break;
                        }
                        try {
                            if (this.f4966f) {
                                i2 = 0;
                                break;
                            }
                            this.f4964d.mo8973a();
                            i2 = b.mo6198e(bhVar, this.f4965e);
                            if (bhVar.mo5857d() > this.f4970j.f6247l + j3) {
                                j3 = bhVar.mo5857d();
                                this.f4964d.mo8974b();
                                this.f4970j.f6253r.post(this.f4970j.f6252q);
                            }
                        } catch (Throwable th) {
                            th = th;
                            i = i2;
                            if (!(i == 1 || bhVar == null)) {
                                this.f4965e.f8220a = bhVar.mo5857d();
                            }
                            C2449zm.m20734m(this.f4962b);
                            throw th;
                        }
                    }
                    if (i2 != 1) {
                        this.f4965e.f8220a = bhVar.mo5857d();
                        i = i2;
                    }
                    C2449zm.m20734m(this.f4962b);
                    if (i != 0) {
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.f4965e.f8220a = bhVar.mo5857d();
                    C2449zm.m20734m(this.f4962b);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bhVar = null;
                this.f4965e.f8220a = bhVar.mo5857d();
                C2449zm.m20734m(this.f4962b);
                throw th;
            }
        }
    }

    /* renamed from: e */
    public final void mo5873e(long j, long j2) {
        this.f4965e.f8220a = j;
        this.f4968h = j2;
        this.f4967g = true;
    }
}
