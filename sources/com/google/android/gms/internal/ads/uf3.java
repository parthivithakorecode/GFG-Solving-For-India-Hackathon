package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;

public final class uf3 extends ld3<vi3> {
    uf3() {
        super(vi3.class, new sf3(zc3.class));
    }

    /* renamed from: a */
    public final jd3<yi3, vi3> mo5279a() {
        return new tf3(this, yi3.class);
    }

    /* renamed from: b */
    public final /* synthetic */ kr3 mo5280b(uo3 uo3) {
        return vi3.m18568I(uo3, mp3.m13445a());
    }

    /* renamed from: f */
    public final String mo5281f() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo5282h(kr3 kr3) {
        vi3 vi3 = (vi3) kr3;
        wn3.m19070b(vi3.mo11480F(), 0);
        if (vi3.mo11481J().mo6627p() != 64) {
            int p = vi3.mo11481J().mo6627p();
            StringBuilder sb = new StringBuilder(61);
            sb.append("invalid key size: ");
            sb.append(p);
            sb.append(". Valid keys must have 64 bytes.");
            throw new InvalidKeyException(sb.toString());
        }
    }

    /* renamed from: j */
    public final int mo5283j() {
        return 3;
    }
}
