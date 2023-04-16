package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.rc */
public final class C2142rc extends C2106qd {

    /* renamed from: j */
    private static final C2143rd<String> f13584j = new C2143rd<>();

    /* renamed from: i */
    private final Context f13585i;

    public C2142rc(C1735gc gcVar, String str, String str2, C1842j8 j8Var, int i, int i2, Context context) {
        super(gcVar, "t7YLiNn9wSLVfNzBPSP796qGY15c9YWt19X86sjfqa1MN8DTMOAxKskDGE2b7plQ", "lEEnhl5euaIfSg9vXz1JH43pBH/xGM9fvSrfPaUZwEI=", j8Var, i, 29);
        this.f13585i = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5238a() {
        this.f13133e.mo8396d0("E");
        AtomicReference<String> a = f13584j.mo10504a(this.f13585i.getPackageName());
        if (a.get() == null) {
            synchronized (a) {
                if (a.get() == null) {
                    a.set((String) this.f13134f.invoke((Object) null, new Object[]{this.f13585i}));
                }
            }
        }
        String str = a.get();
        synchronized (this.f13133e) {
            this.f13133e.mo8396d0(C2102q9.m15534a(str.getBytes(), true));
        }
    }
}
