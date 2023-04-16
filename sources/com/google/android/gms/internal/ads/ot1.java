package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public final class ot1 {
    @GuardedBy("this")

    /* renamed from: a */
    private final Map<String, nt1> f12203a = new HashMap();

    ot1() {
    }

    @Nullable
    /* renamed from: a */
    public final synchronized nt1 mo9864a(String str) {
        return this.f12203a.get(str);
    }

    @Nullable
    /* renamed from: b */
    public final nt1 mo9865b(List<String> list) {
        for (String a : list) {
            nt1 a2 = mo9864a(a);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo9866c(String str, at2 at2) {
        if (!this.f12203a.containsKey(str)) {
            try {
                this.f12203a.put(str, new nt1(str, at2.mo5501h(), at2.mo5502i()));
            } catch (ps2 unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo9867d(String str, cf0 cf0) {
        if (!this.f12203a.containsKey(str)) {
            try {
                this.f12203a.put(str, new nt1(str, cf0.mo5260d(), cf0.mo5261e()));
            } catch (Throwable unused) {
            }
        }
    }
}
