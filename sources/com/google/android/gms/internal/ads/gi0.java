package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p003a2.C0052c;
import p054h1.C2677c;

public final class gi0 extends C2677c<ni0> {
    public gi0(Context context, Looper looper, C0052c.C0053a aVar, C0052c.C0054b bVar) {
        super(kj0.m12224a(context), looper, 8, aVar, bVar, (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final String mo156D() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final String mo157E() {
        return "com.google.android.gms.ads.service.START";
    }

    /* renamed from: i0 */
    public final ni0 mo7641i0() {
        return (ni0) super.mo155C();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final /* synthetic */ IInterface mo188s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return queryLocalInterface instanceof ni0 ? (ni0) queryLocalInterface : new li0(iBinder);
    }
}
