package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
import p048g2.C2637b;

final class w41 extends t41 {

    /* renamed from: i */
    private final Context f16691i;

    /* renamed from: j */
    private final View f16692j;

    /* renamed from: k */
    private final eu0 f16693k;

    /* renamed from: l */
    private final sr2 f16694l;

    /* renamed from: m */
    private final t61 f16695m;

    /* renamed from: n */
    private final cn1 f16696n;

    /* renamed from: o */
    private final ri1 f16697o;

    /* renamed from: p */
    private final ev3<mb2> f16698p;

    /* renamed from: q */
    private final Executor f16699q;

    /* renamed from: r */
    private C2087pv f16700r;

    w41(u61 u61, Context context, sr2 sr2, View view, eu0 eu0, t61 t61, cn1 cn1, ri1 ri1, ev3<mb2> ev3, Executor executor) {
        super(u61);
        this.f16691i = context;
        this.f16692j = view;
        this.f16693k = eu0;
        this.f16694l = sr2;
        this.f16695m = t61;
        this.f16696n = cn1;
        this.f16697o = ri1;
        this.f16698p = ev3;
        this.f16699q = executor;
    }

    /* renamed from: o */
    public static /* synthetic */ void m18862o(w41 w41) {
        if (w41.f16696n.mo6231e() != null) {
            try {
                w41.f16696n.mo6231e().mo10938D4(w41.f16698p.mo7166a(), C2637b.m21358Z2(w41.f16691i));
            } catch (RemoteException e) {
                io0.m11129e("RemoteException when notifyAdLoad is called", e);
            }
        }
    }

    /* renamed from: b */
    public final void mo6842b() {
        this.f16699q.execute(new v41(this));
        super.mo6842b();
    }

    /* renamed from: h */
    public final int mo6843h() {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10303I5)).booleanValue() && this.f15922b.f13893e0) {
            if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10311J5)).booleanValue()) {
                return 0;
            }
        }
        return this.f15921a.f5904b.f5509b.f15730c;
    }

    /* renamed from: i */
    public final View mo6844i() {
        return this.f16692j;
    }

    /* renamed from: j */
    public final C1609cz mo6845j() {
        try {
            return this.f16695m.zza();
        } catch (ps2 unused) {
            return null;
        }
    }

    /* renamed from: k */
    public final sr2 mo6846k() {
        C2087pv pvVar = this.f16700r;
        if (pvVar != null) {
            return os2.m14628c(pvVar);
        }
        rr2 rr2 = this.f15922b;
        if (rr2.f13883Z) {
            for (String next : rr2.f13884a) {
                if (next == null || !next.contains("FirstParty")) {
                }
            }
            return new sr2(this.f16692j.getWidth(), this.f16692j.getHeight(), false);
        }
        return os2.m14627b(this.f15922b.f13913s, this.f16694l);
    }

    /* renamed from: l */
    public final sr2 mo6847l() {
        return this.f16694l;
    }

    /* renamed from: m */
    public final void mo6848m() {
        this.f16697o.zza();
    }

    /* renamed from: n */
    public final void mo6849n(ViewGroup viewGroup, C2087pv pvVar) {
        eu0 eu0;
        if (viewGroup != null && (eu0 = this.f16693k) != null) {
            eu0.mo7115g0(vv0.m18688c(pvVar));
            viewGroup.setMinimumHeight(pvVar.f12806h);
            viewGroup.setMinimumWidth(pvVar.f12809k);
            this.f16700r = pvVar;
        }
    }
}
