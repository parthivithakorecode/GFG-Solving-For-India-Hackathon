package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

public final class cw0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public po0 f5539a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f5540b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public WeakReference<Context> f5541c;

    /* renamed from: c */
    public final cw0 mo6310c(Context context) {
        this.f5541c = new WeakReference<>(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f5540b = context;
        return this;
    }

    /* renamed from: d */
    public final cw0 mo6311d(po0 po0) {
        this.f5539a = po0;
        return this;
    }
}
