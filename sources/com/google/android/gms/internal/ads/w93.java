package com.google.android.gms.internal.ads;

import java.util.Objects;

final class w93 {

    /* renamed from: b */
    static final w93 f16766b = new w93(new C2325a("Failure occurred while trying to finish a future."));

    /* renamed from: a */
    final Throwable f16767a;

    /* renamed from: com.google.android.gms.internal.ads.w93$a */
    class C2325a extends Throwable {
        C2325a(String str) {
            super("Failure occurred while trying to finish a future.");
        }

        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    w93(Throwable th) {
        Objects.requireNonNull(th);
        this.f16767a = th;
    }
}
