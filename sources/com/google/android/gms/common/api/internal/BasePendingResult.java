package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import p003a2.C0080j;
import p003a2.C0092o;
import p070j2.C3231e;
import p166y1.C4382f;
import p166y1.C4385g;
import p166y1.C4387h;
import p166y1.C4389j;
import p166y1.C4390k;

@KeepName
public abstract class BasePendingResult<R extends C4389j> extends C4385g<R> {

    /* renamed from: o */
    static final ThreadLocal<Boolean> f3777o = new C1479b();

    /* renamed from: p */
    public static final /* synthetic */ int f3778p = 0;

    /* renamed from: a */
    private final Object f3779a = new Object();
    @RecentlyNonNull

    /* renamed from: b */
    protected final C1477a<R> f3780b = new C1477a<>(Looper.getMainLooper());
    @RecentlyNonNull

    /* renamed from: c */
    protected final WeakReference<C4382f> f3781c = new WeakReference<>((Object) null);

    /* renamed from: d */
    private final CountDownLatch f3782d = new CountDownLatch(1);

    /* renamed from: e */
    private final ArrayList<C4385g.C4386a> f3783e = new ArrayList<>();

    /* renamed from: f */
    private C4390k<? super R> f3784f;

    /* renamed from: g */
    private final AtomicReference<C1478a> f3785g = new AtomicReference<>();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public R f3786h;

    /* renamed from: i */
    private Status f3787i;

    /* renamed from: j */
    private volatile boolean f3788j;

    /* renamed from: k */
    private boolean f3789k;

    /* renamed from: l */
    private boolean f3790l;

    /* renamed from: m */
    private C0080j f3791m;
    @KeepName
    private C1480c mResultGuardian;

    /* renamed from: n */
    private boolean f3792n = false;

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    public static class C1477a<R extends C4389j> extends C3231e {
        public C1477a(@RecentlyNonNull Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final void mo5020a(@RecentlyNonNull C4390k<? super R> kVar, @RecentlyNonNull R r) {
            int i = BasePendingResult.f3778p;
            sendMessage(obtainMessage(1, new Pair((C4390k) C0092o.m313i(kVar), r)));
        }

        public final void handleMessage(@RecentlyNonNull Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                C4390k kVar = (C4390k) pair.first;
                C4389j jVar = (C4389j) pair.second;
                try {
                    kVar.mo16011a(jVar);
                } catch (RuntimeException e) {
                    BasePendingResult.m5718g(jVar);
                    throw e;
                }
            } else if (i != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).mo5017b(Status.f3768n);
            }
        }
    }

    @Deprecated
    BasePendingResult() {
    }

    /* renamed from: e */
    private final R m5716e() {
        R r;
        synchronized (this.f3779a) {
            C0092o.m316l(!this.f3788j, "Result has already been consumed.");
            C0092o.m316l(mo5018c(), "Result is not ready.");
            r = this.f3786h;
            this.f3786h = null;
            this.f3784f = null;
            this.f3788j = true;
        }
        if (this.f3785g.getAndSet((Object) null) == null) {
            return (C4389j) C0092o.m313i(r);
        }
        throw null;
    }

    /* renamed from: f */
    private final void m5717f(R r) {
        this.f3786h = r;
        this.f3787i = r.mo5001b();
        this.f3791m = null;
        this.f3782d.countDown();
        if (this.f3789k) {
            this.f3784f = null;
        } else {
            C4390k<? super R> kVar = this.f3784f;
            if (kVar != null) {
                this.f3780b.removeMessages(2);
                this.f3780b.mo5020a(kVar, m5716e());
            } else if (this.f3786h instanceof C4387h) {
                this.mResultGuardian = new C1480c(this, (C1479b) null);
            }
        }
        ArrayList<C4385g.C4386a> arrayList = this.f3783e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).mo16010a(this.f3787i);
        }
        this.f3783e.clear();
    }

    /* renamed from: g */
    public static void m5718g(C4389j jVar) {
        if (jVar instanceof C4387h) {
            try {
                ((C4387h) jVar).mo6283a();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(jVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract R mo5016a(@RecentlyNonNull Status status);

    @Deprecated
    /* renamed from: b */
    public final void mo5017b(@RecentlyNonNull Status status) {
        synchronized (this.f3779a) {
            if (!mo5018c()) {
                mo5019d(mo5016a(status));
                this.f3790l = true;
            }
        }
    }

    /* renamed from: c */
    public final boolean mo5018c() {
        return this.f3782d.getCount() == 0;
    }

    /* renamed from: d */
    public final void mo5019d(@RecentlyNonNull R r) {
        synchronized (this.f3779a) {
            if (this.f3790l || this.f3789k) {
                m5718g(r);
                return;
            }
            mo5018c();
            C0092o.m316l(!mo5018c(), "Results have already been set");
            C0092o.m316l(!this.f3788j, "Result has already been consumed");
            m5717f(r);
        }
    }
}
