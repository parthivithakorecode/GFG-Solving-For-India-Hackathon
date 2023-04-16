package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

public class nj1 {

    /* renamed from: a */
    private final pk1 f11498a;

    /* renamed from: b */
    private final eu0 f11499b;

    public nj1(pk1 pk1, eu0 eu0) {
        this.f11498a = pk1;
        this.f11499b = eu0;
    }

    /* renamed from: h */
    public static final hi1<zh1> m13943h(uk1 uk1) {
        return new hi1<>(uk1, wo0.f16891f);
    }

    /* renamed from: a */
    public final View mo9535a() {
        eu0 eu0 = this.f11499b;
        if (eu0 == null) {
            return null;
        }
        return eu0.mo7150w();
    }

    /* renamed from: b */
    public final View mo9536b() {
        eu0 eu0 = this.f11499b;
        if (eu0 != null) {
            return eu0.mo7150w();
        }
        return null;
    }

    /* renamed from: c */
    public final eu0 mo9537c() {
        return this.f11499b;
    }

    /* renamed from: d */
    public final hi1<qf1> mo9538d(Executor executor) {
        return new hi1<>(new lj1(this.f11499b), executor);
    }

    /* renamed from: e */
    public final pk1 mo9539e() {
        return this.f11498a;
    }

    /* renamed from: f */
    public Set<hi1<va1>> mo9540f(u91 u91) {
        return Collections.singleton(new hi1(u91, wo0.f16891f));
    }

    /* renamed from: g */
    public Set<hi1<zh1>> mo9541g(u91 u91) {
        return Collections.singleton(new hi1(u91, wo0.f16891f));
    }
}
