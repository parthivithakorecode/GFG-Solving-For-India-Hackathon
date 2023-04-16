package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;

public final class ez2 {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b */
    private static final ez2 f6635b = new ez2();

    /* renamed from: a */
    private Context f6636a;

    private ez2() {
    }

    /* renamed from: b */
    public static ez2 m8914b() {
        return f6635b;
    }

    /* renamed from: a */
    public final Context mo7204a() {
        return this.f6636a;
    }

    /* renamed from: c */
    public final void mo7205c(Context context) {
        this.f6636a = context != null ? context.getApplicationContext() : null;
    }
}
