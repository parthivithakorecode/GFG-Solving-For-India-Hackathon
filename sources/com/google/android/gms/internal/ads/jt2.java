package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
import javax.annotation.concurrent.GuardedBy;

public final class jt2 implements ya1 {
    @GuardedBy("this")

    /* renamed from: f */
    private final HashSet<nn0> f9260f = new HashSet<>();

    /* renamed from: g */
    private final Context f9261g;

    /* renamed from: h */
    private final xn0 f9262h;

    public jt2(Context context, xn0 xn0) {
        this.f9261g = context;
        this.f9262h = xn0;
    }

    /* renamed from: a */
    public final Bundle mo8540a() {
        return this.f9262h.mo11874k(this.f9261g, this);
    }

    /* renamed from: b */
    public final synchronized void mo8541b(HashSet<nn0> hashSet) {
        this.f9260f.clear();
        this.f9260f.addAll(hashSet);
    }

    /* renamed from: d */
    public final synchronized void mo7808d(C1605cv cvVar) {
        if (cvVar.f5529f != 3) {
            this.f9262h.mo11872i(this.f9260f);
        }
    }
}
