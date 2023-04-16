package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;
import p002a1.C0015b;
import p048g2.C2635a;
import p048g2.C2637b;
import p118q1.C3942c;

public final class rh0 {
    @GuardedBy("InternalQueryInfoGenerator.class")

    /* renamed from: d */
    private static bn0 f13642d;

    /* renamed from: a */
    private final Context f13643a;

    /* renamed from: b */
    private final C0015b f13644b;

    /* renamed from: c */
    private final C1906kz f13645c;

    public rh0(Context context, C0015b bVar, C1906kz kzVar) {
        this.f13643a = context;
        this.f13644b = bVar;
        this.f13645c = kzVar;
    }

    /* renamed from: a */
    public static bn0 m16186a(Context context) {
        bn0 bn0;
        synchronized (rh0.class) {
            if (f13642d == null) {
                f13642d = C2125qw.m15896a().mo9877l(context, new ad0());
            }
            bn0 = f13642d;
        }
        return bn0;
    }

    /* renamed from: b */
    public final void mo10522b(C3942c cVar) {
        String str;
        bn0 a = m16186a(this.f13643a);
        if (a == null) {
            str = "Internal Error, query info generator is null.";
        } else {
            C2635a Z2 = C2637b.m21358Z2(this.f13643a);
            C1906kz kzVar = this.f13645c;
            try {
                a.mo5890K1(Z2, new fn0((String) null, this.f13644b.name(), (C2087pv) null, kzVar == null ? new C1939lv().mo9078a() : C2050ov.f12212a.mo9869a(this.f13643a, kzVar)), new qh0(this, cVar));
                return;
            } catch (RemoteException unused) {
                str = "Internal Error.";
            }
        }
        cVar.mo15368a(str);
    }
}
