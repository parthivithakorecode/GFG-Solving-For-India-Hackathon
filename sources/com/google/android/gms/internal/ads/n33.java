package com.google.android.gms.internal.ads;

import java.net.HttpURLConnection;
import java.util.Objects;

public final class n33 extends f33 {

    /* renamed from: f */
    private c53<Integer> f11289f;

    /* renamed from: g */
    private c53<Integer> f11290g;

    /* renamed from: h */
    private m33 f11291h;

    /* renamed from: i */
    private HttpURLConnection f11292i;

    n33() {
        this(k33.f9381f, l33.f9885f, (m33) null);
    }

    n33(c53<Integer> c53, c53<Integer> c532, m33 m33) {
        this.f11289f = c53;
        this.f11290g = c532;
        this.f11291h = m33;
    }

    /* renamed from: h */
    static /* synthetic */ Integer m13678h() {
        return -1;
    }

    /* renamed from: m */
    static /* synthetic */ Integer m13679m() {
        return -1;
    }

    /* renamed from: z */
    public static void m13682z(HttpURLConnection httpURLConnection) {
        g33.m9523a();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public void close() {
        m13682z(this.f11292i);
    }

    /* renamed from: v */
    public HttpURLConnection mo9413v() {
        g33.m9524b(this.f11289f.zza().intValue(), this.f11290g.zza().intValue());
        m33 m33 = this.f11291h;
        Objects.requireNonNull(m33);
        HttpURLConnection httpURLConnection = (HttpURLConnection) m33.zza();
        this.f11292i = httpURLConnection;
        return httpURLConnection;
    }

    /* renamed from: w */
    public HttpURLConnection mo9414w(m33 m33, int i, int i2) {
        this.f11289f = new h33(i);
        this.f11290g = new j33(i2);
        this.f11291h = m33;
        return mo9413v();
    }
}
