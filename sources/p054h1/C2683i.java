package p054h1;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.C1585cb;
import com.google.android.gms.internal.ads.C1697fb;
import com.google.android.gms.internal.ads.C2125qw;
import com.google.android.gms.internal.ads.C2199sw;
import com.google.android.gms.internal.ads.C2437za;
import com.google.android.gms.internal.ads.bo0;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.po0;
import com.google.android.gms.internal.ads.s23;
import com.google.android.gms.internal.ads.u03;
import com.google.android.gms.internal.ads.wo0;
import com.google.android.gms.internal.ads.x13;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import p069j1.C3163g2;

/* renamed from: h1.i */
public final class C2683i implements Runnable, C1585cb {

    /* renamed from: f */
    private final List<Object[]> f19120f = new Vector();

    /* renamed from: g */
    private final AtomicReference<C1585cb> f19121g = new AtomicReference<>();

    /* renamed from: h */
    private final AtomicReference<C1585cb> f19122h = new AtomicReference<>();

    /* renamed from: i */
    protected boolean f19123i;

    /* renamed from: j */
    private final boolean f19124j;

    /* renamed from: k */
    private final boolean f19125k;

    /* renamed from: l */
    private final Executor f19126l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final u03 f19127m;

    /* renamed from: n */
    private Context f19128n;

    /* renamed from: o */
    private final Context f19129o;

    /* renamed from: p */
    private po0 f19130p;

    /* renamed from: q */
    private final po0 f19131q;

    /* renamed from: r */
    private final boolean f19132r;

    /* renamed from: s */
    final CountDownLatch f19133s = new CountDownLatch(1);

    /* renamed from: t */
    private int f19134t;

    public C2683i(Context context, po0 po0) {
        this.f19128n = context;
        this.f19129o = context;
        this.f19130p = po0;
        this.f19131q = po0;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.f19126l = newCachedThreadPool;
        boolean booleanValue = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10267E1)).booleanValue();
        this.f19132r = booleanValue;
        this.f19127m = u03.m17634a(context, newCachedThreadPool, booleanValue);
        this.f19124j = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10235A1)).booleanValue();
        this.f19125k = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10275F1)).booleanValue();
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10259D1)).booleanValue()) {
            this.f19134t = 2;
        } else {
            this.f19134t = 1;
        }
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10480e2)).booleanValue()) {
            this.f19123i = mo12674j();
        }
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10435Z1)).booleanValue()) {
            C2125qw.m15897b();
            if (!bo0.m6992p()) {
                run();
                return;
            }
        }
        wo0.f16886a.execute(this);
    }

    /* renamed from: m */
    private final C1585cb m21514m() {
        return (mo12676l() == 2 ? this.f19122h : this.f19121g).get();
    }

    /* renamed from: n */
    private final void m21515n() {
        C1585cb m = m21514m();
        if (!this.f19120f.isEmpty() && m != null) {
            for (Object[] next : this.f19120f) {
                int length = next.length;
                if (length == 1) {
                    m.mo6110a((MotionEvent) next[0]);
                } else if (length == 3) {
                    m.mo6114e(((Integer) next[0]).intValue(), ((Integer) next[1]).intValue(), ((Integer) next[2]).intValue());
                }
            }
            this.f19120f.clear();
        }
    }

    /* renamed from: o */
    private final void m21516o(boolean z) {
        this.f19121g.set(C1697fb.m9094w(this.f19130p.f12729f, m21517p(this.f19128n), z, this.f19134t));
    }

    /* renamed from: p */
    private static final Context m21517p(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* renamed from: a */
    public final void mo6110a(MotionEvent motionEvent) {
        C1585cb m = m21514m();
        if (m != null) {
            m21515n();
            m.mo6110a(motionEvent);
            return;
        }
        this.f19120f.add(new Object[]{motionEvent});
    }

    /* renamed from: b */
    public final void mo6111b(View view) {
        C1585cb m = m21514m();
        if (m != null) {
            m.mo6111b(view);
        }
    }

    /* renamed from: c */
    public final String mo6112c(Context context, View view, Activity activity) {
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10494f7)).booleanValue()) {
            C1585cb m = m21514m();
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10503g7)).booleanValue()) {
                C2694t.m21608q();
                C3163g2.m23938n(view, 2, (MotionEvent) null);
            }
            return m != null ? m.mo6112c(context, view, (Activity) null) : "";
        } else if (!mo12675k()) {
            return "";
        } else {
            C1585cb m2 = m21514m();
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10503g7)).booleanValue()) {
                C2694t.m21608q();
                C3163g2.m23938n(view, 2, (MotionEvent) null);
            }
            return m2 != null ? m2.mo6112c(context, view, (Activity) null) : "";
        }
    }

    /* renamed from: d */
    public final String mo6113d(Context context) {
        C1585cb m;
        if (!mo12675k() || (m = m21514m()) == null) {
            return "";
        }
        m21515n();
        return m.mo6113d(m21517p(context));
    }

    /* renamed from: e */
    public final void mo6114e(int i, int i2, int i3) {
        C1585cb m = m21514m();
        if (m != null) {
            m21515n();
            m.mo6114e(i, i2, i3);
            return;
        }
        this.f19120f.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    /* renamed from: f */
    public final String mo6115f(Context context, String str, View view) {
        return mo6116g(context, str, view, (Activity) null);
    }

    /* renamed from: g */
    public final String mo6116g(Context context, String str, View view, Activity activity) {
        if (!mo12675k()) {
            return "";
        }
        C1585cb m = m21514m();
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10503g7)).booleanValue()) {
            C2694t.m21608q();
            C3163g2.m23938n(view, 4, (MotionEvent) null);
        }
        if (m == null) {
            return "";
        }
        m21515n();
        return m.mo6116g(m21517p(context), str, view, activity);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo12673i(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C2437za.m20549h(this.f19131q.f12729f, m21517p(this.f19129o), z, this.f19132r).mo12192o();
        } catch (NullPointerException e) {
            this.f19127m.mo11132c(2027, System.currentTimeMillis() - currentTimeMillis, e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo12674j() {
        Context context = this.f19128n;
        u03 u03 = this.f19127m;
        C2682h hVar = new C2682h(this);
        return new s23(this.f19128n, x13.m19286b(context, u03), hVar, ((Boolean) C2199sw.m17001c().mo8579b(m10.f10243B1)).booleanValue()).mo10711d(1);
    }

    /* renamed from: k */
    public final boolean mo12675k() {
        try {
            this.f19133s.await();
            return true;
        } catch (InterruptedException e) {
            io0.m11132h("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final int mo12676l() {
        if (!this.f19124j || this.f19123i) {
            return this.f19134t;
        }
        return 1;
    }

    public final void run() {
        boolean z;
        long currentTimeMillis;
        try {
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10480e2)).booleanValue()) {
                this.f19123i = mo12674j();
            }
            boolean z2 = this.f19130p.f12732i;
            z = false;
            if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10314K0)).booleanValue() && z2) {
                z = true;
            }
            if (mo12676l() == 1) {
                m21516o(z);
                if (this.f19134t == 2) {
                    this.f19126l.execute(new C2681g(this, z));
                }
            } else {
                currentTimeMillis = System.currentTimeMillis();
                C2437za h = C2437za.m20549h(this.f19130p.f12729f, m21517p(this.f19128n), z, this.f19132r);
                this.f19122h.set(h);
                if (this.f19125k && !h.mo12193q()) {
                    this.f19134t = 1;
                    m21516o(z);
                }
            }
        } catch (NullPointerException e) {
            this.f19134t = 1;
            m21516o(z);
            this.f19127m.mo11132c(2031, System.currentTimeMillis() - currentTimeMillis, e);
        } catch (Throwable th) {
            this.f19133s.countDown();
            this.f19128n = null;
            this.f19130p = null;
            throw th;
        }
        this.f19133s.countDown();
        this.f19128n = null;
        this.f19130p = null;
    }
}
