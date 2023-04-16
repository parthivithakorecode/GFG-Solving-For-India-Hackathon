package com.google.android.gms.internal.ads;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

public final class ye3 extends ld3<pi3> {
    ye3() {
        super(pi3.class, new we3(wc3.class));
    }

    /* renamed from: k */
    public static void m19986k(boolean z) {
        if (m19988m()) {
            ee3.m8529m(new ye3(), true);
        }
    }

    /* renamed from: l */
    static /* bridge */ /* synthetic */ id3 m19987l(int i, int i2) {
        ri3 G = si3.m16862G();
        G.mo10525r(i);
        return new id3((si3) G.mo11894o(), i2);
    }

    /* renamed from: m */
    private static boolean m19988m() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final jd3<si3, pi3> mo5279a() {
        return new xe3(this, si3.class);
    }

    /* renamed from: b */
    public final /* synthetic */ kr3 mo5280b(uo3 uo3) {
        return pi3.m15081I(uo3, mp3.m13445a());
    }

    /* renamed from: f */
    public final String mo5281f() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo5282h(kr3 kr3) {
        pi3 pi3 = (pi3) kr3;
        wn3.m19070b(pi3.mo10064F(), 0);
        wn3.m19069a(pi3.mo10065J().mo6627p());
    }

    /* renamed from: j */
    public final int mo5283j() {
        return 3;
    }
}
