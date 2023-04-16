package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

final class lg3 implements um3 {

    /* renamed from: a */
    private final String f10041a;

    /* renamed from: b */
    private final int f10042b;

    /* renamed from: c */
    private ji3 f10043c;

    /* renamed from: d */
    private kh3 f10044d;

    /* renamed from: e */
    private int f10045e;

    /* renamed from: f */
    private vi3 f10046f;

    lg3(tk3 tk3) {
        String J = tk3.mo11011J();
        this.f10041a = J;
        if (J.equals(ge3.f7405b)) {
            try {
                mi3 I = mi3.m13317I(tk3.mo11010I(), mp3.m13445a());
                this.f10043c = (ji3) ee3.m8520d(tk3);
                this.f10042b = I.mo9257F();
            } catch (mq3 e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (J.equals(ge3.f7404a)) {
            try {
                nh3 H = nh3.m13926H(tk3.mo11010I(), mp3.m13445a());
                this.f10044d = (kh3) ee3.m8520d(tk3);
                this.f10045e = H.mo9529I().mo10988F();
                this.f10042b = this.f10045e + H.mo9530J().mo8480F();
            } catch (mq3 e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        } else if (J.equals(vf3.f16218a)) {
            try {
                yi3 I2 = yi3.m20044I(tk3.mo11010I(), mp3.m13445a());
                this.f10046f = (vi3) ee3.m8520d(tk3);
                this.f10042b = I2.mo12036F();
            } catch (mq3 e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        } else {
            String valueOf = String.valueOf(J);
            throw new GeneralSecurityException(valueOf.length() != 0 ? "unsupported AEAD DEM key type: ".concat(valueOf) : new String("unsupported AEAD DEM key type: "));
        }
    }

    /* renamed from: a */
    public final mg3 mo8949a(byte[] bArr) {
        Class<wc3> cls = wc3.class;
        if (bArr.length != this.f10042b) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        } else if (this.f10041a.equals(ge3.f7405b)) {
            hi3 G = ji3.m11661G();
            G.mo11892m(this.f10043c);
            G.mo7947r(uo3.m17969J(bArr, 0, this.f10042b));
            return new mg3((wc3) ee3.m8523g(this.f10041a, (ji3) G.mo11894o(), cls));
        } else if (this.f10041a.equals(ge3.f7404a)) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.f10045e);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.f10045e, this.f10042b);
            ph3 G2 = qh3.m15621G();
            G2.mo11892m(this.f10044d.mo8672J());
            G2.mo10059r(uo3.m17968I(copyOfRange));
            fk3 G3 = gk3.m9817G();
            G3.mo11892m(this.f10044d.mo8673K());
            G3.mo7362r(uo3.m17968I(copyOfRange2));
            jh3 G4 = kh3.m12212G();
            G4.mo8464t(this.f10044d.mo8671F());
            G4.mo8462r((qh3) G2.mo11894o());
            G4.mo8463s((gk3) G3.mo11894o());
            return new mg3((wc3) ee3.m8523g(this.f10041a, (kh3) G4.mo11894o(), cls));
        } else if (this.f10041a.equals(vf3.f16218a)) {
            ui3 G5 = vi3.m18566G();
            G5.mo11892m(this.f10046f);
            G5.mo11229r(uo3.m17969J(bArr, 0, this.f10042b));
            return new mg3((zc3) ee3.m8523g(this.f10041a, (vi3) G5.mo11894o(), zc3.class));
        } else {
            throw new GeneralSecurityException("unknown DEM key type");
        }
    }

    public final int zza() {
        return this.f10042b;
    }
}
