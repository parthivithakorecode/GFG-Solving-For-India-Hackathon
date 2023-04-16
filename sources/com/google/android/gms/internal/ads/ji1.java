package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;

public final class ji1 extends lg1<C2450zn> implements C2450zn {
    @GuardedBy("this")

    /* renamed from: g */
    private final Map<View, C1524ao> f9141g = new WeakHashMap(1);

    /* renamed from: h */
    private final Context f9142h;

    /* renamed from: i */
    private final rr2 f9143i;

    public ji1(Context context, Set<hi1<C2450zn>> set, rr2 rr2) {
        super(set);
        this.f9142h = context;
        this.f9143i = rr2;
    }

    /* renamed from: S0 */
    public final synchronized void mo8466S0(View view) {
        C1524ao aoVar = this.f9141g.get(view);
        if (aoVar == null) {
            aoVar = new C1524ao(this.f9142h, view);
            aoVar.mo5329c(this);
            this.f9141g.put(view, aoVar);
        }
        if (this.f9143i.f13878U) {
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10434Z0)).booleanValue()) {
                aoVar.mo5333g(((Long) C2199sw.m17001c().mo8579b(m10.f10426Y0)).longValue());
                return;
            }
        }
        aoVar.mo5332f();
    }

    /* renamed from: T0 */
    public final synchronized void mo8467T0(View view) {
        if (this.f9141g.containsKey(view)) {
            this.f9141g.get(view).mo5331e(this);
            this.f9141g.remove(view);
        }
    }

    /* renamed from: m0 */
    public final synchronized void mo5653m0(C2376xn xnVar) {
        mo8947Q0(new ii1(xnVar));
    }
}
