package p103o0;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.C1235a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p089m0.C3646j;
import p089m0.C3662s;
import p096n0.C3748b;
import p096n0.C3752e;
import p096n0.C3756i;
import p117q0.C3938c;
import p117q0.C3939d;
import p141u0.C4108p;
import p147v0.C4175f;
import p153w0.C4260a;

/* renamed from: o0.b */
public class C3818b implements C3752e, C3938c, C3748b {

    /* renamed from: n */
    private static final String f21796n = C3646j.m25231f("GreedyScheduler");

    /* renamed from: f */
    private final Context f21797f;

    /* renamed from: g */
    private final C3756i f21798g;

    /* renamed from: h */
    private final C3939d f21799h;

    /* renamed from: i */
    private final Set<C4108p> f21800i = new HashSet();

    /* renamed from: j */
    private C3816a f21801j;

    /* renamed from: k */
    private boolean f21802k;

    /* renamed from: l */
    private final Object f21803l;

    /* renamed from: m */
    Boolean f21804m;

    public C3818b(Context context, C1235a aVar, C4260a aVar2, C3756i iVar) {
        this.f21797f = context;
        this.f21798g = iVar;
        this.f21799h = new C3939d(context, aVar2, this);
        this.f21801j = new C3816a(this, aVar.mo4496k());
        this.f21803l = new Object();
    }

    /* renamed from: g */
    private void m25756g() {
        this.f21804m = Boolean.valueOf(C4175f.m26631b(this.f21797f, this.f21798g.mo14982i()));
    }

    /* renamed from: h */
    private void m25757h() {
        if (!this.f21802k) {
            this.f21798g.mo14984m().mo14958d(this);
            this.f21802k = true;
        }
    }

    /* renamed from: i */
    private void m25758i(String str) {
        synchronized (this.f21803l) {
            Iterator<C4108p> it = this.f21800i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C4108p next = it.next();
                if (next.f22314a.equals(str)) {
                    C3646j.m25229c().mo14806a(f21796n, String.format("Stopping tracking for %s", new Object[]{str}), new Throwable[0]);
                    this.f21800i.remove(next);
                    this.f21799h.mo15403d(this.f21800i);
                    break;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo4526a(String str, boolean z) {
        m25758i(str);
    }

    /* renamed from: b */
    public void mo4546b(String str) {
        if (this.f21804m == null) {
            m25756g();
        }
        if (!this.f21804m.booleanValue()) {
            C3646j.m25229c().mo14808d(f21796n, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        m25757h();
        C3646j.m25229c().mo14806a(f21796n, String.format("Cancelling work ID %s", new Object[]{str}), new Throwable[0]);
        C3816a aVar = this.f21801j;
        if (aVar != null) {
            aVar.mo15200b(str);
        }
        this.f21798g.mo14994x(str);
    }

    /* renamed from: c */
    public void mo4547c(C4108p... pVarArr) {
        if (this.f21804m == null) {
            m25756g();
        }
        if (!this.f21804m.booleanValue()) {
            C3646j.m25229c().mo14808d(f21796n, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        m25757h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C4108p pVar : pVarArr) {
            long a = pVar.mo15613a();
            long currentTimeMillis = System.currentTimeMillis();
            if (pVar.f22315b == C3662s.ENQUEUED) {
                if (currentTimeMillis < a) {
                    C3816a aVar = this.f21801j;
                    if (aVar != null) {
                        aVar.mo15199a(pVar);
                    }
                } else if (pVar.mo15614b()) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 23 && pVar.f22323j.mo14774h()) {
                        C3646j.m25229c().mo14806a(f21796n, String.format("Ignoring WorkSpec %s, Requires device idle.", new Object[]{pVar}), new Throwable[0]);
                    } else if (i < 24 || !pVar.f22323j.mo14770e()) {
                        hashSet.add(pVar);
                        hashSet2.add(pVar.f22314a);
                    } else {
                        C3646j.m25229c().mo14806a(f21796n, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", new Object[]{pVar}), new Throwable[0]);
                    }
                } else {
                    C3646j.m25229c().mo14806a(f21796n, String.format("Starting work for %s", new Object[]{pVar.f22314a}), new Throwable[0]);
                    this.f21798g.mo14991u(pVar.f22314a);
                }
            }
        }
        synchronized (this.f21803l) {
            if (!hashSet.isEmpty()) {
                C3646j.m25229c().mo14806a(f21796n, String.format("Starting tracking for [%s]", new Object[]{TextUtils.join(",", hashSet2)}), new Throwable[0]);
                this.f21800i.addAll(hashSet);
                this.f21799h.mo15403d(this.f21800i);
            }
        }
    }

    /* renamed from: d */
    public void mo4531d(List<String> list) {
        for (String next : list) {
            C3646j.m25229c().mo14806a(f21796n, String.format("Constraints not met: Cancelling work ID %s", new Object[]{next}), new Throwable[0]);
            this.f21798g.mo14994x(next);
        }
    }

    /* renamed from: e */
    public void mo4532e(List<String> list) {
        for (String next : list) {
            C3646j.m25229c().mo14806a(f21796n, String.format("Constraints met: Scheduling work ID %s", new Object[]{next}), new Throwable[0]);
            this.f21798g.mo14991u(next);
        }
    }

    /* renamed from: f */
    public boolean mo4548f() {
        return false;
    }
}
