package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.xa */
final class C2363xa implements r23 {

    /* renamed from: a */
    final /* synthetic */ p03 f17095a;

    C2363xa(C2437za zaVar, p03 p03) {
        this.f17095a = p03;
    }

    /* renamed from: a */
    public final boolean mo10464a(File file) {
        try {
            return this.f17095a.mo9912a(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
