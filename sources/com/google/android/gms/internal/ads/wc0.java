package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

public final class wc0 {

    /* renamed from: b */
    private static wc0 f16782b;

    /* renamed from: a */
    private final AtomicBoolean f16783a = new AtomicBoolean(false);

    wc0() {
    }

    /* renamed from: a */
    public static wc0 m18958a() {
        if (f16782b == null) {
            f16782b = new wc0();
        }
        return f16782b;
    }

    /* renamed from: b */
    public final Thread mo11639b(Context context, String str) {
        if (!this.f16783a.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new uc0(this, context, str));
        thread.start();
        return thread;
    }
}
