package p172z1;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p003a2.C0089n;
import p003a2.C0092o;
import p020c2.C1438e;
import p034e2.C2544a;
import p102o.C3801a;
import p131s2.C4029i;
import p160x1.C4280b;
import p160x1.C4282d;
import p166y1.C4365a;
import p166y1.C4365a.C4369d;
import p166y1.C4379e;
import p166y1.C4382f;
import p166y1.C4391l;

/* renamed from: z1.z */
public final class C4538z<O extends C4365a.C4369d> implements C4382f.C4383a, C4382f.C4384b {

    /* renamed from: f */
    private final Queue<C4530u0> f23056f = new LinkedList();
    /* access modifiers changed from: private */
    @NotOnlyInitialized

    /* renamed from: g */
    public final C4365a.C4374f f23057g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C4489b<O> f23058h;

    /* renamed from: i */
    private final C4519p f23059i;

    /* renamed from: j */
    private final Set<C4532v0> f23060j = new HashSet();

    /* renamed from: k */
    private final Map<C4502h<?>, C4509k0> f23061k = new HashMap();

    /* renamed from: l */
    private final int f23062l;

    /* renamed from: m */
    private final C4518o0 f23063m;

    /* renamed from: n */
    private boolean f23064n;

    /* renamed from: o */
    private final List<C4488a0> f23065o = new ArrayList();

    /* renamed from: p */
    private C4280b f23066p = null;

    /* renamed from: q */
    private int f23067q = 0;

    /* renamed from: r */
    final /* synthetic */ C4496e f23068r;

    public C4538z(C4496e eVar, C4379e<O> eVar2) {
        this.f23068r = eVar;
        C4365a.C4374f h = eVar2.mo16006h(eVar.f22980u.getLooper(), this);
        this.f23057g = h;
        this.f23058h = eVar2.mo16004f();
        this.f23059i = new C4519p();
        this.f23062l = eVar2.mo16007i();
        if (h.mo185p()) {
            this.f23063m = eVar2.mo16008j(eVar.f22971l, eVar.f22980u);
        } else {
            this.f23063m = null;
        }
    }

    /* renamed from: I */
    static /* synthetic */ void m27427I(C4538z zVar, C4488a0 a0Var) {
        if (!zVar.f23065o.contains(a0Var) || zVar.f23064n) {
            return;
        }
        if (!zVar.f23057g.mo15987a()) {
            zVar.mo16216z();
        } else {
            zVar.m27437e();
        }
    }

    /* renamed from: J */
    static /* synthetic */ void m27428J(C4538z zVar, C4488a0 a0Var) {
        C4282d[] f;
        if (zVar.f23065o.remove(a0Var)) {
            zVar.f23068r.f22980u.removeMessages(15, a0Var);
            zVar.f23068r.f22980u.removeMessages(16, a0Var);
            C4282d b = a0Var.f22942b;
            ArrayList arrayList = new ArrayList(zVar.f23056f.size());
            for (C4530u0 u0Var : zVar.f23056f) {
                if ((u0Var instanceof C4503h0) && (f = ((C4503h0) u0Var).mo16160f(zVar)) != null && C2544a.m21174b(f, b)) {
                    arrayList.add(u0Var);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C4530u0 u0Var2 = (C4530u0) arrayList.get(i);
                zVar.f23056f.remove(u0Var2);
                u0Var2.mo16189b(new C4391l(b));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m27434b() {
        mo16211u();
        m27445m(C4280b.f22574j);
        m27442j();
        Iterator<C4509k0> it = this.f23061k.values().iterator();
        if (!it.hasNext()) {
            m27437e();
            m27443k();
            return;
        }
        C4508k<C4365a.C4367b, ?> kVar = it.next().f23010a;
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m27435c(int i) {
        mo16211u();
        this.f23064n = true;
        this.f23059i.mo16185d(i, this.f23057g.mo15995m());
        this.f23068r.f22980u.sendMessageDelayed(Message.obtain(this.f23068r.f22980u, 9, this.f23058h), this.f23068r.f22965f);
        this.f23068r.f22980u.sendMessageDelayed(Message.obtain(this.f23068r.f22980u, 11, this.f23058h), this.f23068r.f22966g);
        this.f23068r.f22973n.mo216c();
        for (C4509k0 k0Var : this.f23061k.values()) {
            k0Var.f23011b.run();
        }
    }

    /* renamed from: d */
    private final boolean m27436d(C4280b bVar) {
        synchronized (C4496e.f22963y) {
            C4521q unused = this.f23068r.f22977r;
        }
        return false;
    }

    /* renamed from: e */
    private final void m27437e() {
        ArrayList arrayList = new ArrayList(this.f23056f);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C4530u0 u0Var = (C4530u0) arrayList.get(i);
            if (this.f23057g.mo15987a()) {
                if (m27438f(u0Var)) {
                    this.f23056f.remove(u0Var);
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    private final boolean m27438f(C4530u0 u0Var) {
        if (!(u0Var instanceof C4503h0)) {
            m27439g(u0Var);
            return true;
        }
        C4503h0 h0Var = (C4503h0) u0Var;
        C4282d n = m27446n(h0Var.mo16160f(this));
        if (n == null) {
            m27439g(u0Var);
            return true;
        }
        String name = this.f23057g.getClass().getName();
        String c = n.mo15853c();
        long d = n.mo15854d();
        StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(c).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(c);
        sb.append(", ");
        sb.append(d);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        if (!this.f23068r.f22981v || !h0Var.mo16161g(this)) {
            h0Var.mo16189b(new C4391l(n));
            return true;
        }
        C4488a0 a0Var = new C4488a0(this.f23058h, n, (C4529u) null);
        int indexOf = this.f23065o.indexOf(a0Var);
        if (indexOf >= 0) {
            C4488a0 a0Var2 = this.f23065o.get(indexOf);
            this.f23068r.f22980u.removeMessages(15, a0Var2);
            this.f23068r.f22980u.sendMessageDelayed(Message.obtain(this.f23068r.f22980u, 15, a0Var2), this.f23068r.f22965f);
            return false;
        }
        this.f23065o.add(a0Var);
        this.f23068r.f22980u.sendMessageDelayed(Message.obtain(this.f23068r.f22980u, 15, a0Var), this.f23068r.f22965f);
        this.f23068r.f22980u.sendMessageDelayed(Message.obtain(this.f23068r.f22980u, 16, a0Var), this.f23068r.f22966g);
        C4280b bVar = new C4280b(2, (PendingIntent) null);
        if (m27436d(bVar)) {
            return false;
        }
        this.f23068r.mo16154t(bVar, this.f23062l);
        return false;
    }

    /* renamed from: g */
    private final void m27439g(C4530u0 u0Var) {
        u0Var.mo16192c(this.f23059i, mo16201C());
        try {
            u0Var.mo16190d(this);
        } catch (DeadObjectException unused) {
            mo16146D(1);
            this.f23057g.mo15989d("DeadObjectException thrown while running ApiCallRunner.");
        } catch (Throwable th) {
            throw new IllegalStateException(String.format("Error in GoogleApi implementation for client %s.", new Object[]{this.f23057g.getClass().getName()}), th);
        }
    }

    /* renamed from: h */
    private final void m27440h(Status status, Exception exc, boolean z) {
        C0092o.m308d(this.f23068r.f22980u);
        boolean z2 = false;
        boolean z3 = status == null;
        if (exc == null) {
            z2 = true;
        }
        if (z3 != z2) {
            Iterator it = this.f23056f.iterator();
            while (it.hasNext()) {
                C4530u0 u0Var = (C4530u0) it.next();
                if (!z || u0Var.f23043a == 2) {
                    if (status != null) {
                        u0Var.mo16188a(status);
                    } else {
                        u0Var.mo16189b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final void m27441i(Status status) {
        C0092o.m308d(this.f23068r.f22980u);
        m27440h(status, (Exception) null, false);
    }

    /* renamed from: j */
    private final void m27442j() {
        if (this.f23064n) {
            this.f23068r.f22980u.removeMessages(11, this.f23058h);
            this.f23068r.f22980u.removeMessages(9, this.f23058h);
            this.f23064n = false;
        }
    }

    /* renamed from: k */
    private final void m27443k() {
        this.f23068r.f22980u.removeMessages(12, this.f23058h);
        this.f23068r.f22980u.sendMessageDelayed(this.f23068r.f22980u.obtainMessage(12, this.f23058h), this.f23068r.f22967h);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final boolean m27444l(boolean z) {
        C0092o.m308d(this.f23068r.f22980u);
        if (!this.f23057g.mo15987a() || this.f23061k.size() != 0) {
            return false;
        }
        if (this.f23059i.mo16183b()) {
            if (z) {
                m27443k();
            }
            return false;
        }
        this.f23057g.mo15989d("Timing out service connection.");
        return true;
    }

    /* renamed from: m */
    private final void m27445m(C4280b bVar) {
        for (C4532v0 b : this.f23060j) {
            b.mo16196b(this.f23058h, bVar, C0089n.m301a(bVar, C4280b.f22574j) ? this.f23057g.mo15994l() : null);
        }
        this.f23060j.clear();
    }

    /* renamed from: n */
    private final C4282d m27446n(C4282d[] dVarArr) {
        if (!(dVarArr == null || dVarArr.length == 0)) {
            C4282d[] k = this.f23057g.mo15993k();
            if (k == null) {
                k = new C4282d[0];
            }
            C3801a aVar = new C3801a(r3);
            for (C4282d dVar : k) {
                aVar.put(dVar.mo15853c(), Long.valueOf(dVar.mo15854d()));
            }
            for (C4282d dVar2 : dVarArr) {
                Long l = (Long) aVar.get(dVar2.mo15853c());
                if (l == null || l.longValue() < dVar2.mo15854d()) {
                    return dVar2;
                }
            }
        }
        return null;
    }

    /* renamed from: A */
    public final void mo16199A(C4532v0 v0Var) {
        C0092o.m308d(this.f23068r.f22980u);
        this.f23060j.add(v0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final boolean mo16200B() {
        return this.f23057g.mo15987a();
    }

    /* renamed from: C */
    public final boolean mo16201C() {
        return this.f23057g.mo185p();
    }

    /* renamed from: C0 */
    public final void mo16145C0(Bundle bundle) {
        if (Looper.myLooper() == this.f23068r.f22980u.getLooper()) {
            m27434b();
        } else {
            this.f23068r.f22980u.post(new C4531v(this));
        }
    }

    /* renamed from: D */
    public final void mo16146D(int i) {
        if (Looper.myLooper() == this.f23068r.f22980u.getLooper()) {
            m27435c(i);
        } else {
            this.f23068r.f22980u.post(new C4533w(this, i));
        }
    }

    /* renamed from: E */
    public final int mo16202E() {
        return this.f23062l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final int mo16203F() {
        return this.f23067q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final void mo16204G() {
        this.f23067q++;
    }

    /* renamed from: n0 */
    public final void mo16168n0(C4280b bVar) {
        mo16206p(bVar, (Exception) null);
    }

    /* renamed from: o */
    public final void mo16205o(C4280b bVar) {
        C0092o.m308d(this.f23068r.f22980u);
        C4365a.C4374f fVar = this.f23057g;
        String name = fVar.getClass().getName();
        String valueOf = String.valueOf(bVar);
        StringBuilder sb = new StringBuilder(name.length() + 25 + valueOf.length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(valueOf);
        fVar.mo15989d(sb.toString());
        mo16206p(bVar, (Exception) null);
    }

    /* renamed from: p */
    public final void mo16206p(C4280b bVar, Exception exc) {
        C0092o.m308d(this.f23068r.f22980u);
        C4518o0 o0Var = this.f23063m;
        if (o0Var != null) {
            o0Var.mo16180M3();
        }
        mo16211u();
        this.f23068r.f22973n.mo216c();
        m27445m(bVar);
        if ((this.f23057g instanceof C1438e) && bVar.mo15841c() != 24) {
            boolean unused = this.f23068r.f22968i = true;
            this.f23068r.f22980u.sendMessageDelayed(this.f23068r.f22980u.obtainMessage(19), 300000);
        }
        if (bVar.mo15841c() == 4) {
            m27441i(C4496e.f22962x);
        } else if (this.f23056f.isEmpty()) {
            this.f23066p = bVar;
        } else if (exc != null) {
            C0092o.m308d(this.f23068r.f22980u);
            m27440h((Status) null, exc, false);
        } else if (this.f23068r.f22981v) {
            m27440h(C4496e.m27326j(this.f23058h, bVar), (Exception) null, true);
            if (!this.f23056f.isEmpty() && !m27436d(bVar) && !this.f23068r.mo16154t(bVar, this.f23062l)) {
                if (bVar.mo15841c() == 18) {
                    this.f23064n = true;
                }
                if (this.f23064n) {
                    this.f23068r.f22980u.sendMessageDelayed(Message.obtain(this.f23068r.f22980u, 9, this.f23058h), this.f23068r.f22965f);
                } else {
                    m27441i(C4496e.m27326j(this.f23058h, bVar));
                }
            }
        } else {
            m27441i(C4496e.m27326j(this.f23058h, bVar));
        }
    }

    /* renamed from: q */
    public final void mo16207q(C4530u0 u0Var) {
        C0092o.m308d(this.f23068r.f22980u);
        if (!this.f23057g.mo15987a()) {
            this.f23056f.add(u0Var);
            C4280b bVar = this.f23066p;
            if (bVar == null || !bVar.mo15845f()) {
                mo16216z();
            } else {
                mo16206p(this.f23066p, (Exception) null);
            }
        } else if (m27438f(u0Var)) {
            m27443k();
        } else {
            this.f23056f.add(u0Var);
        }
    }

    /* renamed from: r */
    public final void mo16208r() {
        C0092o.m308d(this.f23068r.f22980u);
        m27441i(C4496e.f22961w);
        this.f23059i.mo16184c();
        for (C4502h t0Var : (C4502h[]) this.f23061k.keySet().toArray(new C4502h[0])) {
            mo16207q(new C4528t0(t0Var, new C4029i()));
        }
        m27445m(new C4280b(4));
        if (this.f23057g.mo15987a()) {
            this.f23057g.mo15988b(new C4537y(this));
        }
    }

    /* renamed from: s */
    public final C4365a.C4374f mo16209s() {
        return this.f23057g;
    }

    /* renamed from: t */
    public final Map<C4502h<?>, C4509k0> mo16210t() {
        return this.f23061k;
    }

    /* renamed from: u */
    public final void mo16211u() {
        C0092o.m308d(this.f23068r.f22980u);
        this.f23066p = null;
    }

    /* renamed from: v */
    public final C4280b mo16212v() {
        C0092o.m308d(this.f23068r.f22980u);
        return this.f23066p;
    }

    /* renamed from: w */
    public final void mo16213w() {
        C0092o.m308d(this.f23068r.f22980u);
        if (this.f23064n) {
            mo16216z();
        }
    }

    /* renamed from: x */
    public final void mo16214x() {
        C0092o.m308d(this.f23068r.f22980u);
        if (this.f23064n) {
            m27442j();
            m27441i(this.f23068r.f22972m.mo15862g(this.f23068r.f22971l) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f23057g.mo15989d("Timing out connection while resuming.");
        }
    }

    /* renamed from: y */
    public final boolean mo16215y() {
        return m27444l(true);
    }

    /* renamed from: z */
    public final void mo16216z() {
        C4280b bVar;
        C0092o.m308d(this.f23068r.f22980u);
        if (!this.f23057g.mo15987a() && !this.f23057g.mo15992j()) {
            try {
                int a = this.f23068r.f22973n.mo214a(this.f23068r.f22971l, this.f23057g);
                if (a != 0) {
                    C4280b bVar2 = new C4280b(a, (PendingIntent) null);
                    String name = this.f23057g.getClass().getName();
                    String valueOf = String.valueOf(bVar2);
                    StringBuilder sb = new StringBuilder(name.length() + 35 + valueOf.length());
                    sb.append("The service for ");
                    sb.append(name);
                    sb.append(" is not available: ");
                    sb.append(valueOf);
                    Log.w("GoogleApiManager", sb.toString());
                    mo16206p(bVar2, (Exception) null);
                    return;
                }
                C4493c0 c0Var = new C4493c0(this.f23068r, this.f23057g, this.f23058h);
                if (this.f23057g.mo185p()) {
                    ((C4518o0) C0092o.m313i(this.f23063m)).mo16181b3(c0Var);
                }
                try {
                    this.f23057g.mo15991h(c0Var);
                } catch (SecurityException e) {
                    e = e;
                    bVar = new C4280b(10);
                    mo16206p(bVar, e);
                }
            } catch (IllegalStateException e2) {
                e = e2;
                bVar = new C4280b(10);
                mo16206p(bVar, e);
            }
        }
    }
}
