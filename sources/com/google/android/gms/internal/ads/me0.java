package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p026d1.C2472d;
import p048g2.C2635a;
import p048g2.C2637b;
import p083l1.C3465v;

public final class me0 extends rd0 {

    /* renamed from: f */
    private final C3465v f10818f;

    public me0(C3465v vVar) {
        this.f10818f = vVar;
    }

    /* renamed from: F */
    public final boolean mo9205F() {
        return this.f10818f.mo14542l();
    }

    /* renamed from: G */
    public final boolean mo9206G() {
        return this.f10818f.mo14543m();
    }

    /* renamed from: M */
    public final void mo9207M() {
        this.f10818f.mo14549s();
    }

    /* renamed from: P1 */
    public final void mo9208P1(C2635a aVar) {
        this.f10818f.mo14525F((View) C2637b.m21357C0(aVar));
    }

    /* renamed from: b */
    public final double mo9209b() {
        if (this.f10818f.mo14545o() != null) {
            return this.f10818f.mo14545o().doubleValue();
        }
        return -1.0d;
    }

    /* renamed from: d */
    public final float mo9210d() {
        return this.f10818f.mo14541k();
    }

    /* renamed from: e */
    public final float mo9211e() {
        return this.f10818f.mo14535e();
    }

    /* renamed from: f */
    public final float mo9212f() {
        return this.f10818f.mo14536f();
    }

    /* renamed from: h */
    public final Bundle mo9213h() {
        return this.f10818f.mo14537g();
    }

    /* renamed from: i */
    public final C1609cz mo9214i() {
        if (this.f10818f.mo14527H() != null) {
            return this.f10818f.mo14527H().mo123b();
        }
        return null;
    }

    /* renamed from: j */
    public final g40 mo9215j() {
        return null;
    }

    /* renamed from: k */
    public final n40 mo9216k() {
        C2472d i = this.f10818f.mo14539i();
        if (i != null) {
            return new z30(i.mo9642a(), i.mo9644c(), i.mo9643b(), i.mo9646e(), i.mo9645d());
        }
        return null;
    }

    /* renamed from: l */
    public final String mo9217l() {
        return this.f10818f.mo14532b();
    }

    /* renamed from: m */
    public final C2635a mo9218m() {
        View G = this.f10818f.mo14526G();
        if (G == null) {
            return null;
        }
        return C2637b.m21358Z2(G);
    }

    /* renamed from: n */
    public final C2635a mo9219n() {
        Object I = this.f10818f.mo14528I();
        if (I == null) {
            return null;
        }
        return C2637b.m21358Z2(I);
    }

    /* renamed from: o */
    public final C2635a mo9220o() {
        View a = this.f10818f.mo14531a();
        if (a == null) {
            return null;
        }
        return C2637b.m21358Z2(a);
    }

    /* renamed from: p */
    public final String mo9221p() {
        return this.f10818f.mo14538h();
    }

    /* renamed from: p1 */
    public final void mo9222p1(C2635a aVar, C2635a aVar2, C2635a aVar3) {
        this.f10818f.mo4911E((View) C2637b.m21357C0(aVar), (HashMap) C2637b.m21357C0(aVar2), (HashMap) C2637b.m21357C0(aVar3));
    }

    /* renamed from: p3 */
    public final void mo9223p3(C2635a aVar) {
        this.f10818f.mo14547q((View) C2637b.m21357C0(aVar));
    }

    /* renamed from: q */
    public final String mo9224q() {
        return this.f10818f.mo14544n();
    }

    /* renamed from: r */
    public final String mo9225r() {
        return this.f10818f.mo14533c();
    }

    /* renamed from: t */
    public final String mo9226t() {
        return this.f10818f.mo14534d();
    }

    /* renamed from: x */
    public final List mo9227x() {
        List<C2472d> j = this.f10818f.mo14540j();
        ArrayList arrayList = new ArrayList();
        if (j != null) {
            for (C2472d next : j) {
                arrayList.add(new z30(next.mo9642a(), next.mo9644c(), next.mo9643b(), next.mo9646e(), next.mo9645d()));
            }
        }
        return arrayList;
    }

    /* renamed from: y */
    public final String mo9228y() {
        return this.f10818f.mo14546p();
    }
}
