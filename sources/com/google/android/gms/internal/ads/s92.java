package com.google.android.gms.internal.ads;

import android.content.Context;

public final /* synthetic */ class s92 implements pk1 {

    /* renamed from: a */
    public final /* synthetic */ d52 f14337a;

    public /* synthetic */ s92(d52 d52) {
        this.f14337a = d52;
    }

    /* renamed from: a */
    public final void mo6852a(boolean z, Context context, jb1 jb1) {
        d52 d52 = this.f14337a;
        try {
            ((at2) d52.f5647b).mo5517x(z);
            ((at2) d52.f5647b).mo5492B();
        } catch (ps2 e) {
            io0.m11132h("Cannot show rewarded video.", e);
            throw new ok1(e.getCause());
        }
    }
}
