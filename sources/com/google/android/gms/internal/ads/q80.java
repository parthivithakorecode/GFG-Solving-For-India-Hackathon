package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p003a2.C0052c;
import p054h1.C2677c;

public final class q80 extends C2677c<y80> {
    q80(Context context, Looper looper, C0052c.C0053a aVar, C0052c.C0054b bVar) {
        super(kj0.m12224a(context), looper, 166, aVar, bVar, (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final String mo156D() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final String mo157E() {
        return "com.google.android.gms.ads.service.HTTP";
    }

    /* renamed from: i0 */
    public final y80 mo10256i0() {
        return (y80) super.mo155C();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final /* synthetic */ IInterface mo188s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return queryLocalInterface instanceof y80 ? (y80) queryLocalInterface : new y80(iBinder);
    }
}
