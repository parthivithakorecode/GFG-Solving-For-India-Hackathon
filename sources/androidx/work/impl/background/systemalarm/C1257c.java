package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.C1259e;
import java.util.ArrayList;
import java.util.List;
import p089m0.C3646j;
import p117q0.C3938c;
import p117q0.C3939d;
import p141u0.C4108p;

/* renamed from: androidx.work.impl.background.systemalarm.c */
class C1257c {

    /* renamed from: e */
    private static final String f3398e = C3646j.m25231f("ConstraintsCmdHandler");

    /* renamed from: a */
    private final Context f3399a;

    /* renamed from: b */
    private final int f3400b;

    /* renamed from: c */
    private final C1259e f3401c;

    /* renamed from: d */
    private final C3939d f3402d;

    C1257c(Context context, int i, C1259e eVar) {
        this.f3399a = context;
        this.f3400b = i;
        this.f3401c = eVar;
        this.f3402d = new C3939d(context, eVar.mo4537f(), (C3938c) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4529a() {
        List<C4108p> r = this.f3401c.mo4538g().mo14986o().mo4514B().mo15639r();
        ConstraintProxy.m5043a(this.f3399a, r);
        this.f3402d.mo15403d(r);
        ArrayList<C4108p> arrayList = new ArrayList<>(r.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (C4108p next : r) {
            String str = next.f22314a;
            if (currentTimeMillis >= next.mo15613a() && (!next.mo15614b() || this.f3402d.mo15402c(str))) {
                arrayList.add(next);
            }
        }
        for (C4108p pVar : arrayList) {
            String str2 = pVar.f22314a;
            Intent c = C1256b.m5052c(this.f3399a, str2);
            C3646j.m25229c().mo14806a(f3398e, String.format("Creating a delay_met command for workSpec with id (%s)", new Object[]{str2}), new Throwable[0]);
            C1259e eVar = this.f3401c;
            eVar.mo4541k(new C1259e.C1261b(eVar, c, this.f3400b));
        }
        this.f3402d.mo15404e();
    }
}
