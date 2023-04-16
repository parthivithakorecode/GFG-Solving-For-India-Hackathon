package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p002a1.C0045z;
import p003a2.C0052c;
import p034e2.C2544a;
import p038f.C2591j;
import p054h1.C2677c;
import p160x1.C4282d;

/* renamed from: com.google.android.gms.internal.ads.lq */
public final class C1934lq extends C2677c<C2045oq> {
    C1934lq(Context context, Looper looper, C0052c.C0053a aVar, C0052c.C0054b bVar) {
        super(kj0.m12224a(context), looper, C2591j.f18741J0, aVar, bVar, (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final String mo156D() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final String mo157E() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    /* renamed from: i0 */
    public final boolean mo8988i0() {
        return ((Boolean) C2199sw.m17001c().mo8579b(m10.f10596r1)).booleanValue() && C2544a.m21174b(mo180k(), C0045z.f75a);
    }

    /* renamed from: j0 */
    public final C2045oq mo8989j0() {
        return (C2045oq) super.mo155C();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final /* synthetic */ IInterface mo188s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return queryLocalInterface instanceof C2045oq ? (C2045oq) queryLocalInterface : new C2045oq(iBinder);
    }

    /* renamed from: v */
    public final C4282d[] mo191v() {
        return C0045z.f76b;
    }
}
