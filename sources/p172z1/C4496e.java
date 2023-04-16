package p172z1;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p003a2.C0062d0;
import p003a2.C0087m;
import p003a2.C0094p;
import p003a2.C0096q;
import p003a2.C0098r;
import p003a2.C0100s;
import p003a2.C0102t;
import p034e2.C2551h;
import p070j2.C3231e;
import p102o.C3803b;
import p131s2.C4028h;
import p131s2.C4029i;
import p160x1.C4280b;
import p160x1.C4283e;
import p166y1.C4365a;
import p166y1.C4379e;

/* renamed from: z1.e */
public class C4496e implements Handler.Callback {
    @RecentlyNonNull

    /* renamed from: w */
    public static final Status f22961w = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */

    /* renamed from: x */
    public static final Status f22962x = new Status(4, "The user must be signed in to make this API call.");
    /* access modifiers changed from: private */

    /* renamed from: y */
    public static final Object f22963y = new Object();
    @GuardedBy("lock")

    /* renamed from: z */
    private static C4496e f22964z;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f22965f = 5000;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public long f22966g = 120000;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public long f22967h = 10000;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f22968i = false;

    /* renamed from: j */
    private C0098r f22969j;

    /* renamed from: k */
    private C0102t f22970k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final Context f22971l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C4283e f22972m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C0062d0 f22973n;

    /* renamed from: o */
    private final AtomicInteger f22974o = new AtomicInteger(1);

    /* renamed from: p */
    private final AtomicInteger f22975p = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final Map<C4489b<?>, C4538z<?>> f22976q = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: private */
    @GuardedBy("lock")

    /* renamed from: r */
    public C4521q f22977r;
    @GuardedBy("lock")

    /* renamed from: s */
    private final Set<C4489b<?>> f22978s = new C3803b();

    /* renamed from: t */
    private final Set<C4489b<?>> f22979t = new C3803b();
    /* access modifiers changed from: private */
    @NotOnlyInitialized

    /* renamed from: u */
    public final Handler f22980u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public volatile boolean f22981v = true;

    private C4496e(Context context, Looper looper, C4283e eVar) {
        this.f22971l = context;
        C3231e eVar2 = new C3231e(looper, this);
        this.f22980u = eVar2;
        this.f22972m = eVar;
        this.f22973n = new C0062d0(eVar);
        if (C2551h.m21191a(context)) {
            this.f22981v = false;
        }
        eVar2.sendMessage(eVar2.obtainMessage(6));
    }

    /* renamed from: h */
    private final C4538z<?> m27324h(C4379e<?> eVar) {
        C4489b<?> f = eVar.mo16004f();
        C4538z<?> zVar = this.f22976q.get(f);
        if (zVar == null) {
            zVar = new C4538z<>(this, eVar);
            this.f22976q.put(f, zVar);
        }
        if (zVar.mo16201C()) {
            this.f22979t.add(f);
        }
        zVar.mo16216z();
        return zVar;
    }

    /* renamed from: i */
    private final <T> void m27325i(C4029i<T> iVar, int i, C4379e eVar) {
        C4497e0 b;
        if (i != 0 && (b = C4497e0.m27343b(this, i, eVar.mo16004f())) != null) {
            C4028h<T> a = iVar.mo15524a();
            Handler handler = this.f22980u;
            handler.getClass();
            a.mo15504b(C4527t.m27411a(handler), b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static Status m27326j(C4489b<?> bVar, C4280b bVar2) {
        String b = bVar.mo16125b();
        String valueOf = String.valueOf(bVar2);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 63 + valueOf.length());
        sb.append("API: ");
        sb.append(b);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(bVar2, sb.toString());
    }

    /* renamed from: k */
    private final void m27327k() {
        C0098r rVar = this.f22969j;
        if (rVar != null) {
            if (rVar.mo276c() > 0 || mo16153s()) {
                m27328l().mo282b(rVar);
            }
            this.f22969j = null;
        }
    }

    /* renamed from: l */
    private final C0102t m27328l() {
        if (this.f22970k == null) {
            this.f22970k = C0100s.m338a(this.f22971l);
        }
        return this.f22970k;
    }

    @RecentlyNonNull
    /* renamed from: m */
    public static C4496e m27329m(@RecentlyNonNull Context context) {
        C4496e eVar;
        synchronized (f22963y) {
            if (f22964z == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f22964z = new C4496e(context.getApplicationContext(), handlerThread.getLooper(), C4283e.m26829l());
            }
            eVar = f22964z;
        }
        return eVar;
    }

    public final boolean handleMessage(@RecentlyNonNull Message message) {
        C4029i<Boolean> iVar;
        Boolean bool;
        int i = message.what;
        long j = 300000;
        C4538z zVar = null;
        switch (i) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.f22967h = j;
                this.f22980u.removeMessages(12);
                for (C4489b<?> obtainMessage : this.f22976q.keySet()) {
                    Handler handler = this.f22980u;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.f22967h);
                }
                break;
            case 2:
                C4532v0 v0Var = (C4532v0) message.obj;
                Iterator<C4489b<?>> it = v0Var.mo16195a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        C4489b next = it.next();
                        C4538z zVar2 = this.f22976q.get(next);
                        if (zVar2 == null) {
                            v0Var.mo16196b(next, new C4280b(13), (String) null);
                            break;
                        } else if (zVar2.mo16200B()) {
                            v0Var.mo16196b(next, C4280b.f22574j, zVar2.mo16209s().mo15994l());
                        } else {
                            C4280b v = zVar2.mo16212v();
                            if (v != null) {
                                v0Var.mo16196b(next, v, (String) null);
                            } else {
                                zVar2.mo16199A(v0Var);
                                zVar2.mo16216z();
                            }
                        }
                    }
                }
            case 3:
                for (C4538z next2 : this.f22976q.values()) {
                    next2.mo16211u();
                    next2.mo16216z();
                }
                break;
            case 4:
            case 8:
            case 13:
                C4507j0 j0Var = (C4507j0) message.obj;
                C4538z<?> zVar3 = this.f22976q.get(j0Var.f23009c.mo16004f());
                if (zVar3 == null) {
                    zVar3 = m27324h(j0Var.f23009c);
                }
                if (zVar3.mo16201C() && this.f22975p.get() != j0Var.f23008b) {
                    j0Var.f23007a.mo16188a(f22961w);
                    zVar3.mo16208r();
                    break;
                } else {
                    zVar3.mo16207q(j0Var.f23007a);
                    break;
                }
                break;
            case 5:
                int i2 = message.arg1;
                C4280b bVar = (C4280b) message.obj;
                Iterator<C4538z<?>> it2 = this.f22976q.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C4538z next3 = it2.next();
                        if (next3.mo16202E() == i2) {
                            zVar = next3;
                        }
                    }
                }
                if (zVar != null) {
                    if (bVar.mo15841c() != 13) {
                        zVar.m27441i(m27326j(zVar.f23058h, bVar));
                        break;
                    } else {
                        String e = this.f22972m.mo15861e(bVar.mo15841c());
                        String d = bVar.mo15842d();
                        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 69 + String.valueOf(d).length());
                        sb.append("Error resolution was canceled by the user, original error message: ");
                        sb.append(e);
                        sb.append(": ");
                        sb.append(d);
                        zVar.m27441i(new Status(17, sb.toString()));
                        break;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i2);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                    break;
                }
            case 6:
                if (this.f22971l.getApplicationContext() instanceof Application) {
                    C4491c.m27298c((Application) this.f22971l.getApplicationContext());
                    C4491c.m27297b().mo16129a(new C4529u(this));
                    if (!C4491c.m27297b().mo16131e(true)) {
                        this.f22967h = 300000;
                        break;
                    }
                }
                break;
            case 7:
                m27324h((C4379e) message.obj);
                break;
            case 9:
                if (this.f22976q.containsKey(message.obj)) {
                    this.f22976q.get(message.obj).mo16213w();
                    break;
                }
                break;
            case 10:
                for (C4489b<?> remove : this.f22979t) {
                    C4538z remove2 = this.f22976q.remove(remove);
                    if (remove2 != null) {
                        remove2.mo16208r();
                    }
                }
                this.f22979t.clear();
                break;
            case 11:
                if (this.f22976q.containsKey(message.obj)) {
                    this.f22976q.get(message.obj).mo16214x();
                    break;
                }
                break;
            case 12:
                if (this.f22976q.containsKey(message.obj)) {
                    this.f22976q.get(message.obj).mo16215y();
                    break;
                }
                break;
            case 14:
                C4523r rVar = (C4523r) message.obj;
                C4489b<?> a = rVar.mo16186a();
                if (!this.f22976q.containsKey(a)) {
                    iVar = rVar.mo16187b();
                    bool = Boolean.FALSE;
                } else {
                    boolean H = this.f22976q.get(a).m27444l(false);
                    iVar = rVar.mo16187b();
                    bool = Boolean.valueOf(H);
                }
                iVar.mo15526c(bool);
                break;
            case 15:
                C4488a0 a0Var = (C4488a0) message.obj;
                if (this.f22976q.containsKey(a0Var.f22941a)) {
                    C4538z.m27427I(this.f22976q.get(a0Var.f22941a), a0Var);
                    break;
                }
                break;
            case 16:
                C4488a0 a0Var2 = (C4488a0) message.obj;
                if (this.f22976q.containsKey(a0Var2.f22941a)) {
                    C4538z.m27428J(this.f22976q.get(a0Var2.f22941a), a0Var2);
                    break;
                }
                break;
            case 17:
                m27327k();
                break;
            case 18:
                C4499f0 f0Var = (C4499f0) message.obj;
                if (f0Var.f22988c != 0) {
                    C0098r rVar2 = this.f22969j;
                    if (rVar2 != null) {
                        List<C0087m> d2 = rVar2.mo277d();
                        if (this.f22969j.mo276c() != f0Var.f22987b || (d2 != null && d2.size() >= f0Var.f22989d)) {
                            this.f22980u.removeMessages(17);
                            m27327k();
                        } else {
                            this.f22969j.mo278e(f0Var.f22986a);
                        }
                    }
                    if (this.f22969j == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(f0Var.f22986a);
                        this.f22969j = new C0098r(f0Var.f22987b, arrayList);
                        Handler handler2 = this.f22980u;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), f0Var.f22988c);
                        break;
                    }
                } else {
                    m27328l().mo282b(new C0098r(f0Var.f22987b, Arrays.asList(new C0087m[]{f0Var.f22986a})));
                    break;
                }
                break;
            case 19:
                this.f22968i = false;
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }

    /* renamed from: n */
    public final int mo16148n() {
        return this.f22974o.getAndIncrement();
    }

    /* renamed from: o */
    public final void mo16149o(@RecentlyNonNull C4379e<?> eVar) {
        Handler handler = this.f22980u;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final C4538z mo16150p(C4489b<?> bVar) {
        return this.f22976q.get(bVar);
    }

    /* renamed from: q */
    public final void mo16151q() {
        Handler handler = this.f22980u;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* renamed from: r */
    public final <O extends C4365a.C4369d, ResultT> void mo16152r(@RecentlyNonNull C4379e<O> eVar, int i, @RecentlyNonNull C4514n<C4365a.C4367b, ResultT> nVar, @RecentlyNonNull C4029i<ResultT> iVar, @RecentlyNonNull C4512m mVar) {
        m27325i(iVar, nVar.mo16174e(), eVar);
        C4526s0 s0Var = new C4526s0(i, nVar, iVar, mVar);
        Handler handler = this.f22980u;
        handler.sendMessage(handler.obtainMessage(4, new C4507j0(s0Var, this.f22975p.get(), eVar)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final boolean mo16153s() {
        if (this.f22968i) {
            return false;
        }
        C0096q a = C0094p.m317b().mo264a();
        if (a != null && !a.mo269e()) {
            return false;
        }
        int b = this.f22973n.mo215b(this.f22971l, 203390000);
        return b == -1 || b == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final boolean mo16154t(C4280b bVar, int i) {
        return this.f22972m.mo15870p(this.f22971l, bVar, i);
    }

    /* renamed from: u */
    public final void mo16155u(@RecentlyNonNull C4280b bVar, int i) {
        if (!mo16154t(bVar, i)) {
            Handler handler = this.f22980u;
            handler.sendMessage(handler.obtainMessage(5, i, 0, bVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo16156v(C0087m mVar, int i, long j, int i2) {
        Handler handler = this.f22980u;
        handler.sendMessage(handler.obtainMessage(18, new C4499f0(mVar, i, j, i2)));
    }
}
