package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class w92 implements j52<hs1, at2, z62> {

    /* renamed from: a */
    private final Context f16763a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f16764b;

    /* renamed from: c */
    private final ms1 f16765c;

    public w92(Context context, Executor executor, ms1 ms1) {
        this.f16763a = context;
        this.f16764b = executor;
        this.f16765c = ms1;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m18939e(ds2 ds2, rr2 rr2, d52<at2, z62> d52) {
        try {
            ((at2) d52.f5647b).mo5507n(ds2.f5903a.f4336a.f9639d, rr2.f13917w.toString());
        } catch (Exception e) {
            String valueOf = String.valueOf(d52.f5646a);
            io0.m11132h(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6411a(ds2 ds2, rr2 rr2, d52 d52) {
        is1 f = this.f16765c.mo9362f(new l71(ds2, rr2, d52.f5646a), new js1(new s92(d52)));
        f.mo5577c().mo8945B0(new g21((at2) d52.f5647b), this.f16764b);
        dc1 d = f.mo9892d();
        ta1 a = f.mo5575a();
        ((z62) d52.f5648c).mo12162A5(new v92(this, f.mo8242h(), a, d, f.mo8243i()));
        return f.mo8245k();
    }

    /* renamed from: b */
    public final void mo6412b(ds2 ds2, rr2 rr2, d52<at2, z62> d52) {
        if (!((at2) d52.f5647b).mo5494a()) {
            ((z62) d52.f5648c).mo12163B5(new u92(this, ds2, rr2, d52));
            ((at2) d52.f5647b).mo5504k(this.f16763a, ds2.f5903a.f4336a.f9639d, (String) null, (xj0) d52.f5648c, rr2.f13917w.toString());
            return;
        }
        m18939e(ds2, rr2, d52);
    }
}
