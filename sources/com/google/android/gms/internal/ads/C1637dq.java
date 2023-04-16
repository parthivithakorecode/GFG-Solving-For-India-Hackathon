package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p019c1.C1432a;

/* renamed from: com.google.android.gms.internal.ads.dq */
public final class C1637dq {

    /* renamed from: a */
    private C2015nx f5867a;

    /* renamed from: b */
    private final Context f5868b;

    /* renamed from: c */
    private final String f5869c;

    /* renamed from: d */
    private final C1906kz f5870d;

    /* renamed from: e */
    private final int f5871e;

    /* renamed from: f */
    private final C1432a.C1433a f5872f;

    /* renamed from: g */
    private final ad0 f5873g = new ad0();

    /* renamed from: h */
    private final C2050ov f5874h;

    public C1637dq(Context context, String str, C1906kz kzVar, int i, C1432a.C1433a aVar) {
        this.f5868b = context;
        this.f5869c = str;
        this.f5870d = kzVar;
        this.f5871e = i;
        this.f5872f = aVar;
        this.f5874h = C2050ov.f12212a;
    }

    /* renamed from: a */
    public final void mo6564a() {
        try {
            this.f5867a = C2125qw.m15896a().mo9872d(this.f5868b, C2087pv.m15286d(), this.f5869c, this.f5873g);
            C2309vv vvVar = new C2309vv(this.f5871e);
            C2015nx nxVar = this.f5867a;
            if (nxVar != null) {
                nxVar.mo7470b4(vvVar);
                this.f5867a.mo7451C4(new C2044op(this.f5872f, this.f5869c));
                this.f5867a.mo7467X3(this.f5874h.mo9869a(this.f5868b, this.f5870d));
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }
}
