package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Collections;
import java.util.Set;

public class b51 {

    /* renamed from: a */
    private final t61 f4764a;

    /* renamed from: b */
    private final View f4765b;

    /* renamed from: c */
    private final sr2 f4766c;

    /* renamed from: d */
    private final eu0 f4767d;

    public b51(View view, eu0 eu0, t61 t61, sr2 sr2) {
        this.f4765b = view;
        this.f4767d = eu0;
        this.f4764a = t61;
        this.f4766c = sr2;
    }

    /* renamed from: f */
    public static final hi1<lc1> m6673f(Context context, po0 po0, rr2 rr2, ks2 ks2) {
        return new hi1<>(new z41(context, po0, rr2, ks2), wo0.f16891f);
    }

    /* renamed from: g */
    public static final Set<hi1<lc1>> m6674g(n61 n61) {
        return Collections.singleton(new hi1(n61, wo0.f16891f));
    }

    /* renamed from: h */
    public static final hi1<lc1> m6675h(l61 l61) {
        return new hi1<>(l61, wo0.f16890e);
    }

    /* renamed from: a */
    public final View mo5715a() {
        return this.f4765b;
    }

    /* renamed from: b */
    public final eu0 mo5716b() {
        return this.f4767d;
    }

    /* renamed from: c */
    public final t61 mo5717c() {
        return this.f4764a;
    }

    /* renamed from: d */
    public jc1 mo5718d(Set<hi1<lc1>> set) {
        return new jc1(set);
    }

    /* renamed from: e */
    public final sr2 mo5719e() {
        return this.f4766c;
    }
}
