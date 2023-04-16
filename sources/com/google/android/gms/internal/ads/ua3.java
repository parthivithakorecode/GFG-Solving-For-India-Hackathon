package com.google.android.gms.internal.ads;

import java.util.Set;
import javax.annotation.CheckForNull;

final class ua3 extends ra3 {
    /* synthetic */ ua3(ta3 ta3) {
        super((qa3) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo10500a(va3<?> va3) {
        int E;
        synchronized (va3) {
            E = va3.f16153n - 1;
            va3.f16153n = E;
        }
        return E;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo10501b(va3<?> va3, @CheckForNull Set<Throwable> set, Set<Throwable> set2) {
        synchronized (va3) {
            if (va3.f16152m == null) {
                va3.f16152m = set2;
            }
        }
    }
}
