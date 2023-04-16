package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class e03 implements iz2 {

    /* renamed from: g */
    private static final e03 f6006g = new e03();

    /* renamed from: h */
    private static final Handler f6007h = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static Handler f6008i = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Runnable f6009j = new a03();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Runnable f6010k = new b03();

    /* renamed from: a */
    private final List<d03> f6011a = new ArrayList();

    /* renamed from: b */
    private int f6012b;

    /* renamed from: c */
    private final kz2 f6013c = new kz2();

    /* renamed from: d */
    private final xz2 f6014d = new xz2();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final yz2 f6015e = new yz2(new h03());

    /* renamed from: f */
    private long f6016f;

    e03() {
    }

    /* renamed from: d */
    public static e03 m8240d() {
        return f6006g;
    }

    /* renamed from: g */
    static /* bridge */ /* synthetic */ void m8243g(e03 e03) {
        e03.f6012b = 0;
        e03.f6016f = System.nanoTime();
        e03.f6014d.mo11944i();
        long nanoTime = System.nanoTime();
        jz2 a = e03.f6013c.mo8843a();
        if (e03.f6014d.mo11940e().size() > 0) {
            Iterator<String> it = e03.f6014d.mo11940e().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a2 = sz2.m17040a(0, 0, 0, 0);
                View a3 = e03.f6014d.mo11936a(next);
                jz2 b = e03.f6013c.mo8844b();
                String c = e03.f6014d.mo11938c(next);
                if (c != null) {
                    JSONObject b2 = b.mo8573b(a3);
                    sz2.m17041b(b2, next);
                    sz2.m17044e(b2, c);
                    sz2.m17042c(a2, b2);
                }
                sz2.m17047h(a2);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                e03.f6015e.mo12114c(a2, hashSet, nanoTime);
            }
        }
        if (e03.f6014d.mo11941f().size() > 0) {
            JSONObject a4 = sz2.m17040a(0, 0, 0, 0);
            e03.m8244k((View) null, a, a4, 1);
            sz2.m17047h(a4);
            e03.f6015e.mo12115d(a4, e03.f6014d.mo11941f(), nanoTime);
        } else {
            e03.f6015e.mo12113b();
        }
        e03.f6014d.mo11942g();
        long nanoTime2 = System.nanoTime() - e03.f6016f;
        if (e03.f6011a.size() > 0) {
            for (d03 next2 : e03.f6011a) {
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                next2.mo6372a();
                if (next2 instanceof c03) {
                    ((c03) next2).zza();
                }
            }
        }
    }

    /* renamed from: k */
    private final void m8244k(View view, jz2 jz2, JSONObject jSONObject, int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        jz2.mo8574c(view, jSONObject, this, z);
    }

    /* renamed from: l */
    private static final void m8245l() {
        Handler handler = f6008i;
        if (handler != null) {
            handler.removeCallbacks(f6010k);
            f6008i = null;
        }
    }

    /* renamed from: a */
    public final void mo6767a(View view, jz2 jz2, JSONObject jSONObject) {
        int j;
        if (vz2.m18791b(view) == null && (j = this.f6014d.mo11945j(view)) != 3) {
            JSONObject b = jz2.mo8573b(view);
            sz2.m17042c(jSONObject, b);
            String d = this.f6014d.mo11939d(view);
            if (d != null) {
                sz2.m17041b(b, d);
                this.f6014d.mo11943h();
            } else {
                wz2 b2 = this.f6014d.mo11937b(view);
                if (b2 != null) {
                    sz2.m17043d(b, b2);
                }
                m8244k(view, jz2, b, j);
            }
            this.f6012b++;
        }
    }

    /* renamed from: h */
    public final void mo6768h() {
        m8245l();
    }

    /* renamed from: i */
    public final void mo6769i() {
        if (f6008i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f6008i = handler;
            handler.post(f6009j);
            f6008i.postDelayed(f6010k, 200);
        }
    }

    /* renamed from: j */
    public final void mo6770j() {
        m8245l();
        this.f6011a.clear();
        f6007h.post(new zz2(this));
    }
}
