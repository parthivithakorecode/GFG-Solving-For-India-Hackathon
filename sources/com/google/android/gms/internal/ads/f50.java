package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p002a1.C0040w;
import p026d1.C2470b;
import p026d1.C2475f;
import p048g2.C2637b;

public final class f50 implements C2475f {

    /* renamed from: a */
    private final e50 f6712a;

    /* renamed from: b */
    private final C2470b f6713b;

    /* renamed from: c */
    private final C0040w f6714c = new C0040w();

    public f50(e50 e50) {
        Context context;
        this.f6712a = e50;
        C2470b bVar = null;
        try {
            context = (Context) C2637b.m21357C0(e50.mo6055e());
        } catch (RemoteException | NullPointerException e) {
            io0.m11129e("", e);
            context = null;
        }
        if (context != null) {
            C2470b bVar2 = new C2470b(context);
            try {
                if (true == this.f6712a.mo6057h0(C2637b.m21358Z2(bVar2))) {
                    bVar = bVar2;
                }
            } catch (RemoteException e2) {
                io0.m11129e("", e2);
            }
        }
        this.f6713b = bVar;
    }

    /* renamed from: a */
    public final String mo7231a() {
        try {
            return this.f6712a.mo6056f();
        } catch (RemoteException e) {
            io0.m11129e("", e);
            return null;
        }
    }

    /* renamed from: b */
    public final e50 mo7232b() {
        return this.f6712a;
    }
}
