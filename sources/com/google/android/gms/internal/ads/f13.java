package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

public final class f13 {

    /* renamed from: a */
    private final Context f6657a;

    /* renamed from: b */
    private final Looper f6658b;

    public f13(Context context, Looper looper) {
        this.f6657a = context;
        this.f6658b = looper;
    }

    /* renamed from: a */
    public final void mo7215a(String str) {
        u13 F = w13.m18818F();
        F.mo11144r(this.f6657a.getPackageName());
        F.mo11146t(2);
        r13 F2 = s13.m16567F();
        F2.mo10454r(str);
        F2.mo10455s(2);
        F.mo11145s(F2);
        new g13(this.f6657a, this.f6658b, (w13) F.mo11894o()).mo7493a();
    }
}
