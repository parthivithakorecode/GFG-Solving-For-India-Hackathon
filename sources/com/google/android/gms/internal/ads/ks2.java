package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import p026d1.C2469a;
import p026d1.C2473e;
import p026d1.C2478g;
import p069j1.C3163g2;

public final class ks2 {

    /* renamed from: a */
    public final s00 f9636a;

    /* renamed from: b */
    public final r90 f9637b;

    /* renamed from: c */
    public final lc2 f9638c;

    /* renamed from: d */
    public final C1902kv f9639d;

    /* renamed from: e */
    public final C2087pv f9640e;

    /* renamed from: f */
    public final String f9641f;

    /* renamed from: g */
    public final ArrayList<String> f9642g;

    /* renamed from: h */
    public final ArrayList<String> f9643h;

    /* renamed from: i */
    public final b40 f9644i;

    /* renamed from: j */
    public final C2309vv f9645j;

    /* renamed from: k */
    public final int f9646k;

    /* renamed from: l */
    public final C2469a f9647l;

    /* renamed from: m */
    public final C2478g f9648m;

    /* renamed from: n */
    public final C2274ux f9649n;

    /* renamed from: o */
    public final zr2 f9650o;

    /* renamed from: p */
    public final boolean f9651p;

    /* renamed from: q */
    public final C2423yx f9652q;

    /* synthetic */ ks2(is2 is2, js2 js2) {
        this.f9640e = is2.f8775b;
        this.f9641f = is2.f8776c;
        this.f9652q = is2.f8791r;
        int i = is2.f8774a.f9667f;
        long j = is2.f8774a.f9668g;
        Bundle bundle = is2.f8774a.f9669h;
        int i2 = is2.f8774a.f9670i;
        List<String> list = is2.f8774a.f9671j;
        boolean z = is2.f8774a.f9672k;
        int i3 = is2.f8774a.f9673l;
        boolean z2 = true;
        if (!is2.f8774a.f9674m && !is2.f8778e) {
            z2 = false;
        }
        this.f9639d = new C1902kv(i, j, bundle, i2, list, z, i3, z2, is2.f8774a.f9675n, is2.f8774a.f9676o, is2.f8774a.f9677p, is2.f8774a.f9678q, is2.f8774a.f9679r, is2.f8774a.f9680s, is2.f8774a.f9681t, is2.f8774a.f9682u, is2.f8774a.f9683v, is2.f8774a.f9684w, is2.f8774a.f9685x, is2.f8774a.f9686y, is2.f8774a.f9687z, is2.f8774a.f9664A, C3163g2.m23904A(is2.f8774a.f9665B), is2.f8774a.f9666C);
        this.f9636a = is2.f8777d != null ? is2.f8777d : is2.f8781h != null ? is2.f8781h.f4686k : null;
        this.f9642g = is2.f8779f;
        this.f9643h = is2.f8780g;
        this.f9644i = is2.f8779f == null ? null : is2.f8781h == null ? new b40(new C2473e.C2474a().mo12319a()) : is2.f8781h;
        this.f9645j = is2.f8782i;
        this.f9646k = is2.f8786m;
        this.f9647l = is2.f8783j;
        this.f9648m = is2.f8784k;
        this.f9649n = is2.f8785l;
        this.f9637b = is2.f8787n;
        this.f9650o = new zr2(is2.f8788o, (yr2) null);
        this.f9651p = is2.f8789p;
        this.f9638c = is2.f8790q;
    }

    /* renamed from: a */
    public final b60 mo8784a() {
        C2478g gVar = this.f9648m;
        if (gVar == null && this.f9647l == null) {
            return null;
        }
        return gVar != null ? gVar.mo12328d() : this.f9647l.mo12308d();
    }
}
