package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import p003a2.C0092o;
import p026d1.C2469a;
import p026d1.C2478g;

public final class is2 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C1902kv f8774a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C2087pv f8775b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f8776c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public s00 f8777d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f8778e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ArrayList<String> f8779f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ArrayList<String> f8780g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public b40 f8781h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C2309vv f8782i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C2469a f8783j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C2478g f8784k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C2274ux f8785l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f8786m = 1;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public r90 f8787n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final xr2 f8788o = new xr2();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f8789p = false;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public lc2 f8790q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C2423yx f8791r;

    /* renamed from: D */
    public final xr2 mo8249D() {
        return this.f8788o;
    }

    /* renamed from: E */
    public final is2 mo8250E(ks2 ks2) {
        this.f8788o.mo11907a(ks2.f9650o.f18341a);
        this.f8774a = ks2.f9639d;
        this.f8775b = ks2.f9640e;
        this.f8791r = ks2.f9652q;
        this.f8776c = ks2.f9641f;
        this.f8777d = ks2.f9636a;
        this.f8779f = ks2.f9642g;
        this.f8780g = ks2.f9643h;
        this.f8781h = ks2.f9644i;
        this.f8782i = ks2.f9645j;
        mo8251F(ks2.f9647l);
        mo8263c(ks2.f9648m);
        this.f8789p = ks2.f9651p;
        this.f8790q = ks2.f9638c;
        return this;
    }

    /* renamed from: F */
    public final is2 mo8251F(C2469a aVar) {
        this.f8783j = aVar;
        if (aVar != null) {
            this.f8778e = aVar.mo12307c();
        }
        return this;
    }

    /* renamed from: G */
    public final is2 mo8252G(C2087pv pvVar) {
        this.f8775b = pvVar;
        return this;
    }

    /* renamed from: H */
    public final is2 mo8253H(String str) {
        this.f8776c = str;
        return this;
    }

    /* renamed from: I */
    public final is2 mo8254I(C2309vv vvVar) {
        this.f8782i = vvVar;
        return this;
    }

    /* renamed from: J */
    public final is2 mo8255J(lc2 lc2) {
        this.f8790q = lc2;
        return this;
    }

    /* renamed from: K */
    public final is2 mo8256K(r90 r90) {
        this.f8787n = r90;
        this.f8777d = new s00(false, true, false);
        return this;
    }

    /* renamed from: L */
    public final is2 mo8257L(boolean z) {
        this.f8789p = z;
        return this;
    }

    /* renamed from: M */
    public final is2 mo8258M(boolean z) {
        this.f8778e = z;
        return this;
    }

    /* renamed from: N */
    public final is2 mo8259N(int i) {
        this.f8786m = i;
        return this;
    }

    /* renamed from: O */
    public final is2 mo8260O(b40 b40) {
        this.f8781h = b40;
        return this;
    }

    /* renamed from: a */
    public final is2 mo8261a(ArrayList<String> arrayList) {
        this.f8779f = arrayList;
        return this;
    }

    /* renamed from: b */
    public final is2 mo8262b(ArrayList<String> arrayList) {
        this.f8780g = arrayList;
        return this;
    }

    /* renamed from: c */
    public final is2 mo8263c(C2478g gVar) {
        this.f8784k = gVar;
        if (gVar != null) {
            this.f8778e = gVar.mo12329e();
            this.f8785l = gVar.mo12327c();
        }
        return this;
    }

    /* renamed from: d */
    public final is2 mo8264d(C1902kv kvVar) {
        this.f8774a = kvVar;
        return this;
    }

    /* renamed from: e */
    public final is2 mo8265e(s00 s00) {
        this.f8777d = s00;
        return this;
    }

    /* renamed from: f */
    public final ks2 mo8266f() {
        C0092o.m314j(this.f8776c, "ad unit must not be null");
        C0092o.m314j(this.f8775b, "ad size must not be null");
        C0092o.m314j(this.f8774a, "ad request must not be null");
        return new ks2(this, (js2) null);
    }

    /* renamed from: h */
    public final String mo8267h() {
        return this.f8776c;
    }

    /* renamed from: m */
    public final boolean mo8268m() {
        return this.f8789p;
    }

    /* renamed from: o */
    public final is2 mo8269o(C2423yx yxVar) {
        this.f8791r = yxVar;
        return this;
    }

    /* renamed from: t */
    public final C1902kv mo8270t() {
        return this.f8774a;
    }

    /* renamed from: v */
    public final C2087pv mo8271v() {
        return this.f8775b;
    }
}
