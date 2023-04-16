package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public final class n22 implements kv3<m22> {

    /* renamed from: a */
    private final yv3<Context> f11258a;

    /* renamed from: b */
    private final yv3<Executor> f11259b;

    /* renamed from: c */
    private final yv3<ij0> f11260c;

    /* renamed from: d */
    private final yv3<i11> f11261d;

    /* renamed from: e */
    private final yv3<hj0> f11262e;

    /* renamed from: f */
    private final yv3<ArrayDeque<j22>> f11263f;

    /* renamed from: g */
    private final yv3<r22> f11264g;

    public n22(yv3<Context> yv3, yv3<Executor> yv32, yv3<ij0> yv33, yv3<i11> yv34, yv3<hj0> yv35, yv3<ArrayDeque<j22>> yv36, yv3<r22> yv37) {
        this.f11258a = yv3;
        this.f11259b = yv32;
        this.f11260c = yv33;
        this.f11261d = yv34;
        this.f11262e = yv35;
        this.f11263f = yv36;
        this.f11264g = yv37;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5051a() {
        return new m22(((gw0) this.f11258a).mo7719b(), this.f11259b.mo5051a(), new ij0(), ((nw0) this.f11261d).mo5051a(), ((zw0) this.f11262e).mo5051a(), this.f11263f.mo5051a(), new r22(), (r22) null);
    }
}
