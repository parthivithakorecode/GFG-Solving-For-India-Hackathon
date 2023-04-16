package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.C1099i;

/* renamed from: androidx.lifecycle.c0 */
public class C1078c0 {

    /* renamed from: a */
    private final C1111n f2959a;

    /* renamed from: b */
    private final Handler f2960b = new Handler();

    /* renamed from: c */
    private C1079a f2961c;

    /* renamed from: androidx.lifecycle.c0$a */
    static class C1079a implements Runnable {

        /* renamed from: f */
        private final C1111n f2962f;

        /* renamed from: g */
        final C1099i.C1101b f2963g;

        /* renamed from: h */
        private boolean f2964h = false;

        C1079a(C1111n nVar, C1099i.C1101b bVar) {
            this.f2962f = nVar;
            this.f2963g = bVar;
        }

        public void run() {
            if (!this.f2964h) {
                this.f2962f.mo3835h(this.f2963g);
                this.f2964h = true;
            }
        }
    }

    public C1078c0(C1110m mVar) {
        this.f2959a = new C1111n(mVar);
    }

    /* renamed from: f */
    private void m4534f(C1099i.C1101b bVar) {
        C1079a aVar = this.f2961c;
        if (aVar != null) {
            aVar.run();
        }
        C1079a aVar2 = new C1079a(this.f2959a, bVar);
        this.f2961c = aVar2;
        this.f2960b.postAtFrontOfQueue(aVar2);
    }

    /* renamed from: a */
    public C1099i mo3807a() {
        return this.f2959a;
    }

    /* renamed from: b */
    public void mo3808b() {
        m4534f(C1099i.C1101b.ON_START);
    }

    /* renamed from: c */
    public void mo3809c() {
        m4534f(C1099i.C1101b.ON_CREATE);
    }

    /* renamed from: d */
    public void mo3810d() {
        m4534f(C1099i.C1101b.ON_STOP);
        m4534f(C1099i.C1101b.ON_DESTROY);
    }

    /* renamed from: e */
    public void mo3811e() {
        m4534f(C1099i.C1101b.ON_START);
    }
}
