package p002a1;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.C1680ev;
import com.google.android.gms.internal.ads.C1756gx;
import com.google.android.gms.internal.ads.C1867jx;
import com.google.android.gms.internal.ads.C1906kz;
import com.google.android.gms.internal.ads.C2050ov;
import com.google.android.gms.internal.ads.C2125qw;
import com.google.android.gms.internal.ads.ad0;
import com.google.android.gms.internal.ads.b40;
import com.google.android.gms.internal.ads.d00;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.kg0;
import com.google.android.gms.internal.ads.p60;
import com.google.android.gms.internal.ads.q60;
import com.google.android.gms.internal.ads.s00;
import p003a2.C0092o;
import p012b1.C1291a;
import p026d1.C2473e;
import p026d1.C2475f;
import p026d1.C2479h;
import p104o1.C3821c;
import p104o1.C3825d;

/* renamed from: a1.f */
public class C0020f {

    /* renamed from: a */
    private final C2050ov f18a;

    /* renamed from: b */
    private final Context f19b;

    /* renamed from: c */
    private final C1756gx f20c;

    /* renamed from: a1.f$a */
    public static class C0021a {

        /* renamed from: a */
        private final Context f21a;

        /* renamed from: b */
        private final C1867jx f22b;

        public C0021a(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
            C1867jx c = C2125qw.m15896a().mo9871c(context, str, new ad0());
            this.f21a = (Context) C0092o.m314j(context, "context cannot be null");
            this.f22b = c;
        }

        @RecentlyNonNull
        /* renamed from: a */
        public C0020f mo35a() {
            try {
                return new C0020f(this.f21a, this.f22b.mo6367b(), C2050ov.f12212a);
            } catch (RemoteException e) {
                io0.m11129e("Failed to build AdLoader.", e);
                return new C0020f(this.f21a, new d00().mo6358A5(), C2050ov.f12212a);
            }
        }

        @RecentlyNonNull
        @Deprecated
        /* renamed from: b */
        public C0021a mo36b(@RecentlyNonNull String str, @RecentlyNonNull C2475f.C2477b bVar, C2475f.C2476a aVar) {
            p60 p60 = new p60(bVar, aVar);
            try {
                this.f22b.mo6360G3(str, p60.mo9980e(), p60.mo9979d());
            } catch (RemoteException e) {
                io0.m11132h("Failed to add custom template ad listener", e);
            }
            return this;
        }

        @RecentlyNonNull
        /* renamed from: c */
        public C0021a mo37c(@RecentlyNonNull C3821c.C3824c cVar) {
            try {
                this.f22b.mo6369j4(new kg0(cVar));
            } catch (RemoteException e) {
                io0.m11132h("Failed to add google native ad listener", e);
            }
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        /* renamed from: d */
        public C0021a mo38d(@RecentlyNonNull C2479h.C2480a aVar) {
            try {
                this.f22b.mo6369j4(new q60(aVar));
            } catch (RemoteException e) {
                io0.m11132h("Failed to add google native ad listener", e);
            }
            return this;
        }

        @RecentlyNonNull
        /* renamed from: e */
        public C0021a mo39e(@RecentlyNonNull C0018d dVar) {
            try {
                this.f22b.mo6362Q4(new C1680ev(dVar));
            } catch (RemoteException e) {
                io0.m11132h("Failed to set AdListener.", e);
            }
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        /* renamed from: f */
        public C0021a mo40f(@RecentlyNonNull C2473e eVar) {
            try {
                this.f22b.mo6363R3(new b40(eVar));
            } catch (RemoteException e) {
                io0.m11132h("Failed to specify native ad options", e);
            }
            return this;
        }

        @RecentlyNonNull
        /* renamed from: g */
        public C0021a mo41g(@RecentlyNonNull C3825d dVar) {
            try {
                this.f22b.mo6363R3(new b40(4, dVar.mo15210e(), -1, dVar.mo15209d(), dVar.mo15206a(), dVar.mo15208c() != null ? new s00(dVar.mo15208c()) : null, dVar.mo15211f(), dVar.mo15207b()));
            } catch (RemoteException e) {
                io0.m11132h("Failed to specify native ad options", e);
            }
            return this;
        }
    }

    C0020f(Context context, C1756gx gxVar, C2050ov ovVar) {
        this.f19b = context;
        this.f20c = gxVar;
        this.f18a = ovVar;
    }

    /* renamed from: c */
    private final void m32c(C1906kz kzVar) {
        try {
            this.f20c.mo6010N1(this.f18a.mo9869a(this.f19b, kzVar));
        } catch (RemoteException e) {
            io0.m11129e("Failed to load ad.", e);
        }
    }

    /* renamed from: a */
    public void mo33a(@RecentlyNonNull C0022g gVar) {
        m32c(gVar.mo42a());
    }

    /* renamed from: b */
    public void mo34b(@RecentlyNonNull C1291a aVar) {
        m32c(aVar.f23a);
    }
}
