package androidx.lifecycle;

import androidx.lifecycle.C1099i;
import java.util.Map;
import p067j.C3127a;
import p074k.C3286b;

public abstract class LiveData<T> {

    /* renamed from: k */
    static final Object f2920k = new Object();

    /* renamed from: a */
    final Object f2921a = new Object();

    /* renamed from: b */
    private C3286b<C1118t<? super T>, LiveData<T>.c> f2922b = new C3286b<>();

    /* renamed from: c */
    int f2923c = 0;

    /* renamed from: d */
    private boolean f2924d;

    /* renamed from: e */
    private volatile Object f2925e;

    /* renamed from: f */
    volatile Object f2926f;

    /* renamed from: g */
    private int f2927g;

    /* renamed from: h */
    private boolean f2928h;

    /* renamed from: i */
    private boolean f2929i;

    /* renamed from: j */
    private final Runnable f2930j;

    class LifecycleBoundObserver extends LiveData<T>.c implements C1107k {

        /* renamed from: e */
        final C1110m f2931e;

        /* renamed from: f */
        final /* synthetic */ LiveData f2932f;

        /* renamed from: e */
        public void mo527e(C1110m mVar, C1099i.C1101b bVar) {
            C1099i.C1102c b = this.f2931e.mo491a().mo3831b();
            if (b == C1099i.C1102c.DESTROYED) {
                this.f2932f.mo3788i(this.f2935a);
                return;
            }
            C1099i.C1102c cVar = null;
            while (cVar != b) {
                mo3793d(mo3791j());
                cVar = b;
                b = this.f2931e.mo491a().mo3831b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo3790h() {
            this.f2931e.mo491a().mo3832c(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo3791j() {
            return this.f2931e.mo491a().mo3831b().mo3834b(C1099i.C1102c.STARTED);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    class C1067a implements Runnable {
        C1067a() {
        }

        public void run() {
            Object obj;
            synchronized (LiveData.this.f2921a) {
                obj = LiveData.this.f2926f;
                LiveData.this.f2926f = LiveData.f2920k;
            }
            LiveData.this.mo3789j(obj);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    private class C1068b extends LiveData<T>.c {
        C1068b(C1118t<? super T> tVar) {
            super(tVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo3791j() {
            return true;
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$c */
    private abstract class C1069c {

        /* renamed from: a */
        final C1118t<? super T> f2935a;

        /* renamed from: b */
        boolean f2936b;

        /* renamed from: c */
        int f2937c = -1;

        C1069c(C1118t<? super T> tVar) {
            this.f2935a = tVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo3793d(boolean z) {
            if (z != this.f2936b) {
                this.f2936b = z;
                LiveData.this.mo3782b(z ? 1 : -1);
                if (this.f2936b) {
                    LiveData.this.mo3783d(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo3790h() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public abstract boolean mo3791j();
    }

    public LiveData() {
        Object obj = f2920k;
        this.f2926f = obj;
        this.f2930j = new C1067a();
        this.f2925e = obj;
        this.f2927g = -1;
    }

    /* renamed from: a */
    static void m4490a(String str) {
        if (!C3127a.m23806e().mo13965b()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    /* renamed from: c */
    private void m4491c(LiveData<T>.c cVar) {
        if (cVar.f2936b) {
            if (!cVar.mo3791j()) {
                cVar.mo3793d(false);
                return;
            }
            int i = cVar.f2937c;
            int i2 = this.f2927g;
            if (i < i2) {
                cVar.f2937c = i2;
                cVar.f2935a.mo3456a(this.f2925e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3782b(int i) {
        int i2 = this.f2923c;
        this.f2923c = i + i2;
        if (!this.f2924d) {
            this.f2924d = true;
            while (true) {
                try {
                    int i3 = this.f2923c;
                    if (i2 != i3) {
                        boolean z = i2 == 0 && i3 > 0;
                        boolean z2 = i2 > 0 && i3 == 0;
                        if (z) {
                            mo3785f();
                        } else if (z2) {
                            mo3786g();
                        }
                        i2 = i3;
                    } else {
                        return;
                    }
                } finally {
                    this.f2924d = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3783d(LiveData<T>.c cVar) {
        if (this.f2928h) {
            this.f2929i = true;
            return;
        }
        this.f2928h = true;
        do {
            this.f2929i = false;
            if (cVar == null) {
                C3286b<K, V>.d j = this.f2922b.mo14280j();
                while (j.hasNext()) {
                    m4491c((C1069c) ((Map.Entry) j.next()).getValue());
                    if (this.f2929i) {
                        break;
                    }
                }
            } else {
                m4491c(cVar);
                cVar = null;
            }
        } while (this.f2929i);
        this.f2928h = false;
    }

    /* renamed from: e */
    public void mo3784e(C1118t<? super T> tVar) {
        m4490a("observeForever");
        C1068b bVar = new C1068b(tVar);
        C1069c m = this.f2922b.mo14272m(tVar, bVar);
        if (m instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (m == null) {
            bVar.mo3793d(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo3785f() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo3786g() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo3787h(T t) {
        boolean z;
        synchronized (this.f2921a) {
            z = this.f2926f == f2920k;
            this.f2926f = t;
        }
        if (z) {
            C3127a.m23806e().mo13966c(this.f2930j);
        }
    }

    /* renamed from: i */
    public void mo3788i(C1118t<? super T> tVar) {
        m4490a("removeObserver");
        C1069c n = this.f2922b.mo14273n(tVar);
        if (n != null) {
            n.mo3790h();
            n.mo3793d(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo3789j(T t) {
        m4490a("setValue");
        this.f2927g++;
        this.f2925e = t;
        mo3783d((LiveData<T>.c) null);
    }
}
