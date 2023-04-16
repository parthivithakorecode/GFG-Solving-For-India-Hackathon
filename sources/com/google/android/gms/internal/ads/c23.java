package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p003a2.C0052c;
import p038f.C2591j;
import p054h1.C2677c;

public final class c23 extends C2677c<h23> {

    /* renamed from: K */
    private final int f5281K;

    public c23(Context context, Looper looper, C0052c.C0053a aVar, C0052c.C0054b bVar, int i) {
        super(context, looper, C2591j.f18709C0, aVar, bVar, (String) null);
        this.f5281K = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final String mo156D() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final String mo157E() {
        return "com.google.android.gms.gass.START";
    }

    /* renamed from: i */
    public final int mo178i() {
        return this.f5281K;
    }

    /* renamed from: i0 */
    public final h23 mo6038i0() {
        return (h23) super.mo155C();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final /* synthetic */ IInterface mo188s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof h23 ? (h23) queryLocalInterface : new h23(iBinder);
    }
}
