package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

final class iw2 implements h52 {

    /* renamed from: b */
    private static final List<hv2> f8822b = new ArrayList(50);

    /* renamed from: a */
    private final Handler f8823a;

    public iw2(Handler handler) {
        this.f8823a = handler;
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ void m11306a(hv2 hv2) {
        List<hv2> list = f8822b;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(hv2);
            }
        }
    }

    /* renamed from: b */
    private static hv2 m11307b() {
        hv2 hv2;
        List<hv2> list = f8822b;
        synchronized (list) {
            hv2 = list.isEmpty() ? new hv2((gu2) null) : list.remove(list.size() - 1);
        }
        return hv2;
    }

    /* renamed from: C */
    public final void mo7840C(int i) {
        this.f8823a.removeMessages(2);
    }

    /* renamed from: D */
    public final boolean mo7841D(int i) {
        return this.f8823a.hasMessages(0);
    }

    /* renamed from: E */
    public final boolean mo7842E(Runnable runnable) {
        return this.f8823a.post(runnable);
    }

    /* renamed from: F */
    public final g42 mo7843F(int i, Object obj) {
        hv2 b = m11307b();
        b.mo8028a(this.f8823a.obtainMessage(i, obj), this);
        return b;
    }

    /* renamed from: G */
    public final void mo7844G(Object obj) {
        this.f8823a.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: H */
    public final g42 mo7845H(int i, int i2, int i3) {
        hv2 b = m11307b();
        b.mo8028a(this.f8823a.obtainMessage(1, i2, i3), this);
        return b;
    }

    /* renamed from: I */
    public final boolean mo7846I(g42 g42) {
        return ((hv2) g42).mo8029b(this.f8823a);
    }

    /* renamed from: J */
    public final boolean mo7847J(int i, long j) {
        return this.f8823a.sendEmptyMessageAtTime(2, j);
    }

    /* renamed from: N */
    public final boolean mo7848N(int i) {
        return this.f8823a.sendEmptyMessage(i);
    }

    /* renamed from: d */
    public final g42 mo7849d(int i) {
        hv2 b = m11307b();
        b.mo8028a(this.f8823a.obtainMessage(i), this);
        return b;
    }
}
