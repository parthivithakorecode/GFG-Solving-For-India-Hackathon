package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

final class gz0 implements up2 {

    /* renamed from: a */
    private final b01 f7927a;

    /* renamed from: b */
    private Context f7928b;

    /* renamed from: c */
    private String f7929c;

    /* renamed from: d */
    private C2087pv f7930d;

    /* synthetic */ gz0(b01 b01, fz0 fz0) {
        this.f7927a = b01;
    }

    /* renamed from: Q */
    public final /* synthetic */ up2 mo7765Q(Context context) {
        Objects.requireNonNull(context);
        this.f7928b = context;
        return this;
    }

    /* renamed from: a */
    public final /* synthetic */ up2 mo7766a(C2087pv pvVar) {
        Objects.requireNonNull(pvVar);
        this.f7930d = pvVar;
        return this;
    }

    /* renamed from: g */
    public final vp2 mo7767g() {
        sv3.m16998c(this.f7928b, Context.class);
        sv3.m16998c(this.f7929c, String.class);
        sv3.m16998c(this.f7930d, C2087pv.class);
        return new iz0(this.f7927a, this.f7928b, this.f7929c, this.f7930d, (hz0) null);
    }

    /* renamed from: s */
    public final /* synthetic */ up2 mo7768s(String str) {
        Objects.requireNonNull(str);
        this.f7929c = str;
        return this;
    }
}
