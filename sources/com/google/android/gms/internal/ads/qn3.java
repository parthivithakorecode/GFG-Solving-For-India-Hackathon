package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

final class qn3 extends ThreadLocal<Mac> {

    /* renamed from: a */
    final /* synthetic */ rn3 f13252a;

    qn3(rn3 rn3) {
        this.f13252a = rn3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Mac initialValue() {
        try {
            Mac a = cn3.f5467f.mo6236a(this.f13252a.f13765b);
            a.init(this.f13252a.f13766c);
            return a;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
