package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

@Deprecated
public final class by3 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f5196a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final xv1 f5197b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public q84 f5198c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final e64 f5199d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public dx3 f5200e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final a94 f5201f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final q04 f5202g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Looper f5203h = n13.m13622a();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final ef3 f5204i = ef3.f6200c;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final ay3 f5205j = ay3.f4433g;

    /* renamed from: k */
    private boolean f5206k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final pt0 f5207l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final gg3 f5208m = new gg3(0.97f, 1.03f, 1000, 1.0E-7f, nz3.m14195c(20), nz3.m14195c(500), 0.999f, (ff3) null);

    @Deprecated
    public by3(Context context, pt0 pt0, byte[] bArr) {
        Context context2 = context;
        kc4 kc4 = new kc4();
        k84 k84 = new k84(context2);
        g54 g54 = new g54(context2, kc4);
        hh3 hh3 = new hh3();
        j94 d = j94.m11522d(context);
        xv1 xv1 = xv1.f17360a;
        q04 q04 = new q04(xv1);
        this.f5196a = context2;
        this.f5207l = pt0;
        this.f5198c = k84;
        this.f5199d = g54;
        this.f5200e = hh3;
        this.f5201f = d;
        this.f5202g = q04;
        this.f5197b = xv1;
    }

    @Deprecated
    /* renamed from: g */
    public final by3 mo5995g(dx3 dx3) {
        wu1.m19207f(!this.f5206k);
        this.f5200e = dx3;
        return this;
    }

    @Deprecated
    /* renamed from: h */
    public final by3 mo5996h(q84 q84) {
        wu1.m19207f(!this.f5206k);
        this.f5198c = q84;
        return this;
    }

    @Deprecated
    /* renamed from: i */
    public final gy3 mo5997i() {
        wu1.m19207f(!this.f5206k);
        this.f5206k = true;
        return new gy3(this);
    }
}
