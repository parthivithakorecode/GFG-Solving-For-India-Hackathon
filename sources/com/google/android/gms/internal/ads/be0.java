package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p002a1.C0013a;
import p083l1.C3447d;
import p083l1.C3460q;

final class be0 implements C3447d<C3460q, Object> {

    /* renamed from: a */
    final /* synthetic */ jd0 f4872a;

    /* renamed from: b */
    final /* synthetic */ ce0 f4873b;

    be0(ce0 ce0, jd0 jd0) {
        this.f4873b = ce0;
        this.f4872a = jd0;
    }

    /* renamed from: a */
    public final void mo5246a(C0013a aVar) {
        try {
            String canonicalName = this.f4873b.f5395f.getClass().getCanonicalName();
            int a = aVar.mo19a();
            String c = aVar.mo21c();
            String b = aVar.mo20b();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 85 + String.valueOf(c).length() + String.valueOf(b).length());
            sb.append(canonicalName);
            sb.append("failed to load mediation ad: ErrorCode = ");
            sb.append(a);
            sb.append(". ErrorMessage = ");
            sb.append(c);
            sb.append(". ErrorDomain = ");
            sb.append(b);
            io0.m11126b(sb.toString());
            this.f4872a.mo7318x3(aVar.mo22d());
            this.f4872a.mo7306G1(aVar.mo19a(), aVar.mo21c());
            this.f4872a.mo7304A(aVar.mo19a());
        } catch (RemoteException e) {
            io0.m11129e("", e);
        }
    }
}
