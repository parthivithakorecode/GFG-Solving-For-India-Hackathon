package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

public final class hz2 {

    /* renamed from: f */
    private static hz2 f8470f;

    /* renamed from: a */
    private float f8471a = 0.0f;

    /* renamed from: b */
    private final zy2 f8472b;

    /* renamed from: c */
    private final xy2 f8473c;

    /* renamed from: d */
    private yy2 f8474d;

    /* renamed from: e */
    private az2 f8475e;

    public hz2(zy2 zy2, xy2 xy2) {
        this.f8472b = zy2;
        this.f8473c = xy2;
    }

    /* renamed from: b */
    public static hz2 m10831b() {
        if (f8470f == null) {
            f8470f = new hz2(new zy2(), new xy2());
        }
        return f8470f;
    }

    /* renamed from: a */
    public final float mo8045a() {
        return this.f8471a;
    }

    /* renamed from: c */
    public final void mo8046c(Context context) {
        this.f8474d = new yy2(new Handler(), context, new wy2(), this, (byte[]) null);
    }

    /* renamed from: d */
    public final void mo8047d(float f) {
        this.f8471a = f;
        if (this.f8475e == null) {
            this.f8475e = az2.m6457a();
        }
        for (py2 g : this.f8475e.mo5586b()) {
            g.mo10203g().mo9900h(f);
        }
    }

    /* renamed from: e */
    public final void mo8048e() {
        cz2.m7667a().mo6352g(this);
        cz2.m7667a().mo6349d();
        if (cz2.m7667a().mo6351f()) {
            e03.m8240d().mo6769i();
        }
        this.f8474d.mo12107a();
    }

    /* renamed from: f */
    public final void mo8049f() {
        e03.m8240d().mo6770j();
        cz2.m7667a().mo6350e();
        this.f8474d.mo12108b();
    }
}
