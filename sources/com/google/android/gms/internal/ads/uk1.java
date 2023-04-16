package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import javax.annotation.ParametersAreNonnullByDefault;

public final class uk1 implements va1, zh1 {

    /* renamed from: f */
    private final xl0 f15615f;

    /* renamed from: g */
    private final Context f15616g;

    /* renamed from: h */
    private final pm0 f15617h;

    /* renamed from: i */
    private final View f15618i;

    /* renamed from: j */
    private String f15619j;

    /* renamed from: k */
    private final C1861jr f15620k;

    public uk1(xl0 xl0, Context context, pm0 pm0, View view, C1861jr jrVar) {
        this.f15615f = xl0;
        this.f15616g = context;
        this.f15617h = pm0;
        this.f15618i = view;
        this.f15620k = jrVar;
    }

    /* renamed from: b */
    public final void mo11193b() {
    }

    /* renamed from: d */
    public final void mo11194d() {
        String i = this.f15617h.mo10092i(this.f15616g);
        this.f15619j = i;
        String valueOf = String.valueOf(i);
        String str = this.f15620k == C1861jr.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial";
        this.f15619j = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
    }

    /* renamed from: e */
    public final void mo5297e() {
    }

    @ParametersAreNonnullByDefault
    /* renamed from: h */
    public final void mo5298h(mj0 mj0, String str, String str2) {
        if (this.f15617h.mo10109z(this.f15616g)) {
            try {
                pm0 pm0 = this.f15617h;
                Context context = this.f15616g;
                pm0.mo10103t(context, pm0.mo10089f(context), this.f15615f.mo11859a(), mj0.mo8471c(), mj0.mo8470a());
            } catch (RemoteException e) {
                io0.m11132h("Remote Exception to get reward item.", e);
            }
        }
    }

    /* renamed from: i */
    public final void mo5299i() {
        this.f15615f.mo11860b(false);
    }

    /* renamed from: n */
    public final void mo5300n() {
        View view = this.f15618i;
        if (!(view == null || this.f15619j == null)) {
            this.f15617h.mo10107x(view.getContext(), this.f15619j);
        }
        this.f15615f.mo11860b(true);
    }

    /* renamed from: o */
    public final void mo5301o() {
    }

    /* renamed from: t */
    public final void mo5302t() {
    }
}
