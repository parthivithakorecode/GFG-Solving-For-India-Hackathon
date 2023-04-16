package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p002a1.C0037u;
import p118q1.C3940a;
import p136t1.C4059a;

/* renamed from: com.google.android.gms.internal.ads.kz */
public final class C1906kz {

    /* renamed from: a */
    private final Date f9800a;

    /* renamed from: b */
    private final String f9801b;

    /* renamed from: c */
    private final List<String> f9802c;

    /* renamed from: d */
    private final int f9803d;

    /* renamed from: e */
    private final Set<String> f9804e;

    /* renamed from: f */
    private final Location f9805f;

    /* renamed from: g */
    private final Bundle f9806g;

    /* renamed from: h */
    private final Map<Class<Object>, Object> f9807h;

    /* renamed from: i */
    private final String f9808i;

    /* renamed from: j */
    private final String f9809j;
    @NotOnlyInitialized

    /* renamed from: k */
    private final C4059a f9810k;

    /* renamed from: l */
    private final int f9811l;

    /* renamed from: m */
    private final Set<String> f9812m;

    /* renamed from: n */
    private final Bundle f9813n;

    /* renamed from: o */
    private final Set<String> f9814o;

    /* renamed from: p */
    private final boolean f9815p;

    /* renamed from: q */
    private final C3940a f9816q;

    /* renamed from: r */
    private final String f9817r;

    /* renamed from: s */
    private final int f9818s;

    public C1906kz(C1869jz jzVar, C4059a aVar) {
        this.f9800a = jzVar.f9307g;
        this.f9801b = jzVar.f9308h;
        this.f9802c = jzVar.f9309i;
        this.f9803d = jzVar.f9310j;
        this.f9804e = Collections.unmodifiableSet(jzVar.f9301a);
        this.f9805f = jzVar.f9311k;
        this.f9806g = jzVar.f9302b;
        this.f9807h = Collections.unmodifiableMap(jzVar.f9303c);
        this.f9808i = jzVar.f9312l;
        this.f9809j = jzVar.f9313m;
        this.f9811l = jzVar.f9314n;
        this.f9812m = Collections.unmodifiableSet(jzVar.f9304d);
        this.f9813n = jzVar.f9305e;
        this.f9814o = Collections.unmodifiableSet(jzVar.f9306f);
        this.f9815p = jzVar.f9315o;
        C3940a unused = jzVar.f9316p;
        this.f9817r = jzVar.f9317q;
        this.f9818s = jzVar.f9318r;
    }

    @Deprecated
    /* renamed from: a */
    public final int mo8822a() {
        return this.f9803d;
    }

    /* renamed from: b */
    public final int mo8823b() {
        return this.f9818s;
    }

    /* renamed from: c */
    public final int mo8824c() {
        return this.f9811l;
    }

    /* renamed from: d */
    public final Location mo8825d() {
        return this.f9805f;
    }

    /* renamed from: e */
    public final Bundle mo8826e() {
        return this.f9813n;
    }

    /* renamed from: f */
    public final Bundle mo8827f(Class<Object> cls) {
        return this.f9806g.getBundle(cls.getName());
    }

    /* renamed from: g */
    public final Bundle mo8828g() {
        return this.f9806g;
    }

    /* renamed from: h */
    public final C3940a mo8829h() {
        return this.f9816q;
    }

    /* renamed from: i */
    public final C4059a mo8830i() {
        return this.f9810k;
    }

    /* renamed from: j */
    public final String mo8831j() {
        return this.f9817r;
    }

    /* renamed from: k */
    public final String mo8832k() {
        return this.f9801b;
    }

    /* renamed from: l */
    public final String mo8833l() {
        return this.f9808i;
    }

    /* renamed from: m */
    public final String mo8834m() {
        return this.f9809j;
    }

    @Deprecated
    /* renamed from: n */
    public final Date mo8835n() {
        return this.f9800a;
    }

    /* renamed from: o */
    public final List<String> mo8836o() {
        return new ArrayList(this.f9802c);
    }

    /* renamed from: p */
    public final Map<Class<Object>, Object> mo8837p() {
        return this.f9807h;
    }

    /* renamed from: q */
    public final Set<String> mo8838q() {
        return this.f9814o;
    }

    /* renamed from: r */
    public final Set<String> mo8839r() {
        return this.f9804e;
    }

    @Deprecated
    /* renamed from: s */
    public final boolean mo8840s() {
        return this.f9815p;
    }

    /* renamed from: t */
    public final boolean mo8841t(Context context) {
        C0037u b = C2276uz.m18256e().mo11346b();
        C2125qw.m15897b();
        String t = bo0.m6996t(context);
        return this.f9812m.contains(t) || b.mo110d().contains(t);
    }
}
