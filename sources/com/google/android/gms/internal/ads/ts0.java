package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import p054h1.C2694t;
import p166y1.C4387h;

@ParametersAreNonnullByDefault
public abstract class ts0 implements C4387h {

    /* renamed from: f */
    protected final Context f15036f;

    /* renamed from: g */
    protected final String f15037g;

    /* renamed from: h */
    protected final WeakReference<tq0> f15038h;

    public ts0(tq0 tq0) {
        Context context = tq0.getContext();
        this.f15036f = context;
        this.f15037g = C2694t.m21608q().mo14022L(context, tq0.mo7129l().f12729f);
        this.f15038h = new WeakReference<>(tq0);
    }

    /* renamed from: f */
    static /* bridge */ /* synthetic */ void m17483f(ts0 ts0, String str, Map map) {
        tq0 tq0 = (tq0) ts0.f15038h.get();
        if (tq0 != null) {
            tq0.mo6424t("onPrecacheEvent", map);
        }
    }

    /* renamed from: a */
    public void mo6283a() {
    }

    /* renamed from: g */
    public abstract void mo6288g();

    /* renamed from: h */
    public final void mo11102h(String str, String str2, String str3, String str4) {
        bo0.f4987b.post(new ss0(this, str, str2, str3, str4));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo11103i(String str, String str2, int i) {
        bo0.f4987b.post(new qs0(this, str, str2, i));
    }

    /* renamed from: j */
    public final void mo11104j(String str, String str2, long j) {
        bo0.f4987b.post(new rs0(this, str, str2, j));
    }

    /* renamed from: l */
    public final void mo11105l(String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        bo0.f4987b.post(new ps0(this, str, str2, i, i2, j, j2, z, i3, i4));
    }

    /* renamed from: m */
    public final void mo11106m(String str, String str2, long j, long j2, boolean z, long j3, long j4, long j5, int i, int i2) {
        Handler handler = bo0.f4987b;
        os0 os0 = r0;
        os0 os02 = new os0(this, str, str2, j, j2, j3, j4, j5, z, i, i2);
        handler.post(os0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo6289n(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo6290o(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo6291q(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo6292r(int i) {
    }

    /* renamed from: t */
    public abstract boolean mo6294t(String str);

    /* renamed from: u */
    public boolean mo6295u(String str, String[] strArr) {
        return mo6294t(str);
    }

    /* renamed from: v */
    public boolean mo6296v(String str, String[] strArr, ks0 ks0) {
        return mo6294t(str);
    }
}
