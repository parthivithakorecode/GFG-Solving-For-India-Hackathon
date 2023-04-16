package p003a2;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import p160x1.C4280b;
import p160x1.C4282d;
import p160x1.C4284f;

/* renamed from: a2.c */
public abstract class C0052c<T extends IInterface> {
    @RecentlyNonNull

    /* renamed from: I */
    public static final String[] f85I = {"service_esmobile", "service_googleme"};

    /* renamed from: J */
    private static final C4282d[] f86J = new C4282d[0];
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final C0054b f87A;

    /* renamed from: B */
    private final int f88B;

    /* renamed from: C */
    private final String f89C;

    /* renamed from: D */
    private volatile String f90D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public C4280b f91E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public boolean f92F;

    /* renamed from: G */
    private volatile C0108v0 f93G;
    @RecentlyNonNull

    /* renamed from: H */
    protected AtomicInteger f94H;

    /* renamed from: f */
    private int f95f;

    /* renamed from: g */
    private long f96g;

    /* renamed from: h */
    private long f97h;

    /* renamed from: i */
    private int f98i;

    /* renamed from: j */
    private long f99j;

    /* renamed from: k */
    private volatile String f100k;

    /* renamed from: l */
    C0072g1 f101l;

    /* renamed from: m */
    private final Context f102m;

    /* renamed from: n */
    private final Looper f103n;

    /* renamed from: o */
    private final C0073h f104o;

    /* renamed from: p */
    private final C4284f f105p;

    /* renamed from: q */
    final Handler f106q;

    /* renamed from: r */
    private final Object f107r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final Object f108s;
    /* access modifiers changed from: private */
    @GuardedBy("mServiceBrokerLock")

    /* renamed from: t */
    public C0085l f109t;
    @RecentlyNonNull

    /* renamed from: u */
    protected C0055c f110u;
    @GuardedBy("mLock")

    /* renamed from: v */
    private T f111v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final ArrayList<C0097q0<?>> f112w;
    @GuardedBy("mLock")

    /* renamed from: x */
    private C0101s0 f113x;
    @GuardedBy("mLock")

    /* renamed from: y */
    private int f114y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final C0053a f115z;

    /* renamed from: a2.c$a */
    public interface C0053a {
        /* renamed from: C0 */
        void mo139C0(Bundle bundle);

        /* renamed from: D */
        void mo140D(int i);
    }

    /* renamed from: a2.c$b */
    public interface C0054b {
        /* renamed from: n0 */
        void mo196n0(@RecentlyNonNull C4280b bVar);
    }

    /* renamed from: a2.c$c */
    public interface C0055c {
        /* renamed from: b */
        void mo197b(@RecentlyNonNull C4280b bVar);
    }

    /* renamed from: a2.c$d */
    protected class C0056d implements C0055c {
        public C0056d() {
        }

        /* renamed from: b */
        public final void mo197b(@RecentlyNonNull C4280b bVar) {
            if (bVar.mo15846g()) {
                C0052c cVar = C0052c.this;
                cVar.mo183n((C0076i) null, cVar.mo154B());
            } else if (C0052c.this.f87A != null) {
                C0052c.this.f87A.mo196n0(bVar);
            }
        }
    }

    /* renamed from: a2.c$e */
    public interface C0057e {
        /* renamed from: a */
        void mo198a();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C0052c(@androidx.annotation.RecentlyNonNull android.content.Context r10, @androidx.annotation.RecentlyNonNull android.os.Looper r11, int r12, p003a2.C0052c.C0053a r13, p003a2.C0052c.C0054b r14, java.lang.String r15) {
        /*
            r9 = this;
            a2.h r3 = p003a2.C0073h.m277b(r10)
            x1.f r4 = p160x1.C4284f.m26845f()
            p003a2.C0092o.m313i(r13)
            p003a2.C0092o.m313i(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p003a2.C0052c.<init>(android.content.Context, android.os.Looper, int, a2.c$a, a2.c$b, java.lang.String):void");
    }

    protected C0052c(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull C0073h hVar, @RecentlyNonNull C4284f fVar, int i, C0053a aVar, C0054b bVar, String str) {
        this.f100k = null;
        this.f107r = new Object();
        this.f108s = new Object();
        this.f112w = new ArrayList<>();
        this.f114y = 1;
        this.f91E = null;
        this.f92F = false;
        this.f93G = null;
        this.f94H = new AtomicInteger(0);
        C0092o.m314j(context, "Context must not be null");
        this.f102m = context;
        C0092o.m314j(looper, "Looper must not be null");
        this.f103n = looper;
        C0092o.m314j(hVar, "Supervisor must not be null");
        this.f104o = hVar;
        C0092o.m314j(fVar, "API availability must not be null");
        this.f105p = fVar;
        this.f106q = new C0095p0(this, looper);
        this.f88B = i;
        this.f115z = aVar;
        this.f87A = bVar;
        this.f89C = str;
    }

    /* renamed from: U */
    static /* synthetic */ void m169U(C0052c cVar, int i) {
        int i2;
        int i3;
        synchronized (cVar.f107r) {
            i2 = cVar.f114y;
        }
        if (i2 == 3) {
            cVar.f92F = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        Handler handler = cVar.f106q;
        handler.sendMessage(handler.obtainMessage(i3, cVar.f94H.get(), 16));
    }

    /* renamed from: Y */
    static /* synthetic */ boolean m173Y(C0052c cVar) {
        if (cVar.f92F || TextUtils.isEmpty(cVar.mo156D()) || TextUtils.isEmpty(cVar.mo153A())) {
            return false;
        }
        try {
            Class.forName(cVar.mo156D());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: d0 */
    static /* synthetic */ boolean m178d0(C0052c cVar, int i, int i2, IInterface iInterface) {
        synchronized (cVar.f107r) {
            if (cVar.f114y != i) {
                return false;
            }
            cVar.m182h0(i2, iInterface);
            return true;
        }
    }

    /* renamed from: g0 */
    static /* synthetic */ void m181g0(C0052c cVar, C0108v0 v0Var) {
        cVar.f93G = v0Var;
        if (cVar.mo170R()) {
            C0064e eVar = v0Var.f228i;
            C0094p.m317b().mo265c(eVar == null ? null : eVar.mo224h());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public final void m182h0(int i, T t) {
        C0072g1 g1Var;
        boolean z = false;
        if ((i == 4) == (t != null)) {
            z = true;
        }
        C0092o.m305a(z);
        synchronized (this.f107r) {
            this.f114y = i;
            this.f111v = t;
            if (i == 1) {
                C0101s0 s0Var = this.f113x;
                if (s0Var != null) {
                    C0073h hVar = this.f104o;
                    String a = this.f101l.mo235a();
                    C0092o.m313i(a);
                    hVar.mo239c(a, this.f101l.mo236b(), this.f101l.mo237c(), s0Var, mo171S(), this.f101l.mo238d());
                    this.f113x = null;
                }
            } else if (i == 2 || i == 3) {
                C0101s0 s0Var2 = this.f113x;
                if (!(s0Var2 == null || (g1Var = this.f101l) == null)) {
                    String a2 = g1Var.mo235a();
                    String b = this.f101l.mo236b();
                    StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 70 + String.valueOf(b).length());
                    sb.append("Calling connect() while still connected, missing disconnect() for ");
                    sb.append(a2);
                    sb.append(" on ");
                    sb.append(b);
                    Log.e("GmsClient", sb.toString());
                    C0073h hVar2 = this.f104o;
                    String a3 = this.f101l.mo235a();
                    C0092o.m313i(a3);
                    hVar2.mo239c(a3, this.f101l.mo236b(), this.f101l.mo237c(), s0Var2, mo171S(), this.f101l.mo238d());
                    this.f94H.incrementAndGet();
                }
                C0101s0 s0Var3 = new C0101s0(this, this.f94H.get());
                this.f113x = s0Var3;
                C0072g1 g1Var2 = (this.f114y != 3 || mo153A() == null) ? new C0072g1(mo158F(), mo157E(), false, C0073h.m276a(), mo160H()) : new C0072g1(mo193x().getPackageName(), mo153A(), true, C0073h.m276a(), false);
                this.f101l = g1Var2;
                if (!g1Var2.mo238d() || mo178i() >= 17895000) {
                    C0073h hVar3 = this.f104o;
                    String a4 = this.f101l.mo235a();
                    C0092o.m313i(a4);
                    if (!hVar3.mo217d(new C0116z0(a4, this.f101l.mo236b(), this.f101l.mo237c(), this.f101l.mo238d()), s0Var3, mo171S())) {
                        String a5 = this.f101l.mo235a();
                        String b2 = this.f101l.mo236b();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(a5).length() + 34 + String.valueOf(b2).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(a5);
                        sb2.append(" on ");
                        sb2.append(b2);
                        Log.e("GmsClient", sb2.toString());
                        mo172T(16, (Bundle) null, this.f94H.get());
                    }
                } else {
                    String valueOf = String.valueOf(this.f101l.mo235a());
                    throw new IllegalStateException(valueOf.length() != 0 ? "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(valueOf) : new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "));
                }
            } else if (i == 4) {
                C0092o.m313i(t);
                mo162J(t);
            }
        }
    }

    /* access modifiers changed from: protected */
    @RecentlyNullable
    /* renamed from: A */
    public String mo153A() {
        return null;
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    /* renamed from: B */
    public Set<Scope> mo154B() {
        return Collections.emptySet();
    }

    @RecentlyNonNull
    /* renamed from: C */
    public final T mo155C() {
        T t;
        synchronized (this.f107r) {
            if (this.f114y != 5) {
                mo187r();
                t = this.f111v;
                C0092o.m314j(t, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public abstract String mo156D();

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public abstract String mo157E();

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    /* renamed from: F */
    public String mo158F() {
        return "com.google.android.gms";
    }

    @RecentlyNullable
    /* renamed from: G */
    public C0064e mo159G() {
        C0108v0 v0Var = this.f93G;
        if (v0Var == null) {
            return null;
        }
        return v0Var.f228i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public boolean mo160H() {
        return false;
    }

    /* renamed from: I */
    public boolean mo161I() {
        return this.f93G != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo162J(@RecentlyNonNull T t) {
        this.f97h = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo163K(@RecentlyNonNull C4280b bVar) {
        this.f98i = bVar.mo15841c();
        this.f99j = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo164L(int i) {
        this.f95f = i;
        this.f96g = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo165M(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.f106q;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new C0103t0(this, i, iBinder, bundle)));
    }

    /* renamed from: N */
    public boolean mo166N() {
        return false;
    }

    /* renamed from: O */
    public void mo167O(@RecentlyNonNull String str) {
        this.f90D = str;
    }

    /* renamed from: P */
    public void mo168P(int i) {
        Handler handler = this.f106q;
        handler.sendMessage(handler.obtainMessage(6, this.f94H.get(), i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public void mo169Q(@RecentlyNonNull C0055c cVar, int i, PendingIntent pendingIntent) {
        C0092o.m314j(cVar, "Connection progress callbacks cannot be null.");
        this.f110u = cVar;
        Handler handler = this.f106q;
        handler.sendMessage(handler.obtainMessage(3, this.f94H.get(), i, pendingIntent));
    }

    /* renamed from: R */
    public boolean mo170R() {
        return false;
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    /* renamed from: S */
    public final String mo171S() {
        String str = this.f89C;
        return str == null ? this.f102m.getClass().getName() : str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public final void mo172T(int i, Bundle bundle, int i2) {
        Handler handler = this.f106q;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new C0106u0(this, i, (Bundle) null)));
    }

    /* renamed from: a */
    public boolean mo173a() {
        boolean z;
        synchronized (this.f107r) {
            z = this.f114y == 4;
        }
        return z;
    }

    /* renamed from: b */
    public void mo174b(@RecentlyNonNull C0057e eVar) {
        eVar.mo198a();
    }

    /* renamed from: d */
    public void mo175d(@RecentlyNonNull String str) {
        this.f100k = str;
        mo184o();
    }

    /* renamed from: e */
    public boolean mo176e() {
        return true;
    }

    /* renamed from: h */
    public void mo177h(@RecentlyNonNull C0055c cVar) {
        C0092o.m314j(cVar, "Connection progress callbacks cannot be null.");
        this.f110u = cVar;
        m182h0(2, (IInterface) null);
    }

    /* renamed from: i */
    public int mo178i() {
        return C4284f.f22589a;
    }

    /* renamed from: j */
    public boolean mo179j() {
        boolean z;
        synchronized (this.f107r) {
            int i = this.f114y;
            z = true;
            if (i != 2) {
                if (i != 3) {
                    z = false;
                }
            }
        }
        return z;
    }

    @RecentlyNullable
    /* renamed from: k */
    public final C4282d[] mo180k() {
        C0108v0 v0Var = this.f93G;
        if (v0Var == null) {
            return null;
        }
        return v0Var.f226g;
    }

    @RecentlyNonNull
    /* renamed from: l */
    public String mo181l() {
        C0072g1 g1Var;
        if (mo173a() && (g1Var = this.f101l) != null) {
            return g1Var.mo236b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    @RecentlyNullable
    /* renamed from: m */
    public String mo182m() {
        return this.f100k;
    }

    /* renamed from: n */
    public void mo183n(C0076i iVar, @RecentlyNonNull Set<Scope> set) {
        Bundle z = mo195z();
        C0067f fVar = new C0067f(this.f88B, this.f90D);
        fVar.f151i = this.f102m.getPackageName();
        fVar.f154l = z;
        if (set != null) {
            fVar.f153k = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (mo185p()) {
            Account u = mo190u();
            if (u == null) {
                u = new Account("<<default account>>", "com.google");
            }
            fVar.f155m = u;
            if (iVar != null) {
                fVar.f152j = iVar.asBinder();
            }
        } else if (mo166N()) {
            fVar.f155m = mo190u();
        }
        fVar.f156n = f86J;
        fVar.f157o = mo191v();
        if (mo170R()) {
            fVar.f160r = true;
        }
        try {
            synchronized (this.f108s) {
                C0085l lVar = this.f109t;
                if (lVar != null) {
                    lVar.mo257i3(new C0099r0(this, this.f94H.get()), fVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            mo168P(3);
        } catch (SecurityException e2) {
            throw e2;
        } catch (RemoteException | RuntimeException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            mo165M(8, (IBinder) null, (Bundle) null, this.f94H.get());
        }
    }

    /* renamed from: o */
    public void mo184o() {
        this.f94H.incrementAndGet();
        synchronized (this.f112w) {
            int size = this.f112w.size();
            for (int i = 0; i < size; i++) {
                this.f112w.get(i).mo275e();
            }
            this.f112w.clear();
        }
        synchronized (this.f108s) {
            this.f109t = null;
        }
        m182h0(1, (IInterface) null);
    }

    /* renamed from: p */
    public boolean mo185p() {
        return false;
    }

    /* renamed from: q */
    public void mo186q() {
        int h = this.f105p.mo15863h(this.f102m, mo178i());
        if (h != 0) {
            m182h0(1, (IInterface) null);
            mo169Q(new C0056d(), h, (PendingIntent) null);
            return;
        }
        mo177h(new C0056d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo187r() {
        if (!mo173a()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* access modifiers changed from: protected */
    @RecentlyNullable
    /* renamed from: s */
    public abstract T mo188s(@RecentlyNonNull IBinder iBinder);

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public boolean mo189t() {
        return false;
    }

    @RecentlyNullable
    /* renamed from: u */
    public Account mo190u() {
        return null;
    }

    @RecentlyNonNull
    /* renamed from: v */
    public C4282d[] mo191v() {
        return f86J;
    }

    @RecentlyNullable
    /* renamed from: w */
    public Bundle mo192w() {
        return null;
    }

    @RecentlyNonNull
    /* renamed from: x */
    public final Context mo193x() {
        return this.f102m;
    }

    /* renamed from: y */
    public int mo194y() {
        return this.f88B;
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    /* renamed from: z */
    public Bundle mo195z() {
        return new Bundle();
    }
}
