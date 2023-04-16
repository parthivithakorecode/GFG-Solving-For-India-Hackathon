package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.C0702f;
import androidx.core.provider.C0708g;

/* renamed from: androidx.core.provider.a */
class C0694a {

    /* renamed from: a */
    private final C0708g.C0711c f2027a;

    /* renamed from: b */
    private final Handler f2028b;

    /* renamed from: androidx.core.provider.a$a */
    class C0695a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C0708g.C0711c f2029f;

        /* renamed from: g */
        final /* synthetic */ Typeface f2030g;

        C0695a(C0708g.C0711c cVar, Typeface typeface) {
            this.f2029f = cVar;
            this.f2030g = typeface;
        }

        public void run() {
            this.f2029f.mo2656b(this.f2030g);
        }
    }

    /* renamed from: androidx.core.provider.a$b */
    class C0696b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C0708g.C0711c f2032f;

        /* renamed from: g */
        final /* synthetic */ int f2033g;

        C0696b(C0708g.C0711c cVar, int i) {
            this.f2032f = cVar;
            this.f2033g = i;
        }

        public void run() {
            this.f2032f.mo2655a(this.f2033g);
        }
    }

    C0694a(C0708g.C0711c cVar, Handler handler) {
        this.f2027a = cVar;
        this.f2028b = handler;
    }

    /* renamed from: a */
    private void m2841a(int i) {
        this.f2028b.post(new C0696b(this.f2027a, i));
    }

    /* renamed from: c */
    private void m2842c(Typeface typeface) {
        this.f2028b.post(new C0695a(this.f2027a, typeface));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2694b(C0702f.C0707e eVar) {
        if (eVar.mo2712a()) {
            m2842c(eVar.f2057a);
        } else {
            m2841a(eVar.f2058b);
        }
    }
}
