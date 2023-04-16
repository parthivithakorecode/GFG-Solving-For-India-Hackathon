package p002a1;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C1609cz;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.r00;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: a1.w */
public final class C0040w {

    /* renamed from: a */
    private final Object f66a = new Object();
    @GuardedBy("lock")

    /* renamed from: b */
    private C1609cz f67b;
    @GuardedBy("lock")

    /* renamed from: c */
    private C0041a f68c;

    /* renamed from: a1.w$a */
    public static abstract class C0041a {
        /* renamed from: a */
        public void mo125a() {
        }

        /* renamed from: b */
        public void mo126b(boolean z) {
        }

        /* renamed from: c */
        public void mo127c() {
        }

        /* renamed from: d */
        public void mo128d() {
        }

        /* renamed from: e */
        public void mo129e() {
        }
    }

    /* renamed from: a */
    public void mo122a(C0041a aVar) {
        r00 r00;
        synchronized (this.f66a) {
            this.f68c = aVar;
            C1609cz czVar = this.f67b;
            if (czVar != null) {
                if (aVar == null) {
                    r00 = null;
                } else {
                    try {
                        r00 = new r00(aVar);
                    } catch (RemoteException e) {
                        io0.m11129e("Unable to call setVideoLifecycleCallbacks on video controller.", e);
                        return;
                    }
                }
                czVar.mo5570Y4(r00);
            }
        }
    }

    /* renamed from: b */
    public final C1609cz mo123b() {
        C1609cz czVar;
        synchronized (this.f66a) {
            czVar = this.f67b;
        }
        return czVar;
    }

    /* renamed from: c */
    public final void mo124c(C1609cz czVar) {
        synchronized (this.f66a) {
            this.f67b = czVar;
            C0041a aVar = this.f68c;
            if (aVar != null) {
                mo122a(aVar);
            }
        }
    }
}
