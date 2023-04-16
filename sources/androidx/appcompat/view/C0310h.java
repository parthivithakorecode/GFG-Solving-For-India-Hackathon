package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.C0783e0;
import androidx.core.view.C0789f0;
import androidx.core.view.C0791g0;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.appcompat.view.h */
public class C0310h {

    /* renamed from: a */
    final ArrayList<C0783e0> f809a = new ArrayList<>();

    /* renamed from: b */
    private long f810b = -1;

    /* renamed from: c */
    private Interpolator f811c;

    /* renamed from: d */
    C0789f0 f812d;

    /* renamed from: e */
    private boolean f813e;

    /* renamed from: f */
    private final C0791g0 f814f = new C0311a();

    /* renamed from: androidx.appcompat.view.h$a */
    class C0311a extends C0791g0 {

        /* renamed from: a */
        private boolean f815a = false;

        /* renamed from: b */
        private int f816b = 0;

        C0311a() {
        }

        /* renamed from: b */
        public void mo723b(View view) {
            int i = this.f816b + 1;
            this.f816b = i;
            if (i == C0310h.this.f809a.size()) {
                C0789f0 f0Var = C0310h.this.f812d;
                if (f0Var != null) {
                    f0Var.mo723b((View) null);
                }
                mo882d();
            }
        }

        /* renamed from: c */
        public void mo724c(View view) {
            if (!this.f815a) {
                this.f815a = true;
                C0789f0 f0Var = C0310h.this.f812d;
                if (f0Var != null) {
                    f0Var.mo724c((View) null);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo882d() {
            this.f816b = 0;
            this.f815a = false;
            C0310h.this.mo875b();
        }
    }

    /* renamed from: a */
    public void mo874a() {
        if (this.f813e) {
            Iterator<C0783e0> it = this.f809a.iterator();
            while (it.hasNext()) {
                it.next().mo2854c();
            }
            this.f813e = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo875b() {
        this.f813e = false;
    }

    /* renamed from: c */
    public C0310h mo876c(C0783e0 e0Var) {
        if (!this.f813e) {
            this.f809a.add(e0Var);
        }
        return this;
    }

    /* renamed from: d */
    public C0310h mo877d(C0783e0 e0Var, C0783e0 e0Var2) {
        this.f809a.add(e0Var);
        e0Var2.mo2859j(e0Var.mo2855d());
        this.f809a.add(e0Var2);
        return this;
    }

    /* renamed from: e */
    public C0310h mo878e(long j) {
        if (!this.f813e) {
            this.f810b = j;
        }
        return this;
    }

    /* renamed from: f */
    public C0310h mo879f(Interpolator interpolator) {
        if (!this.f813e) {
            this.f811c = interpolator;
        }
        return this;
    }

    /* renamed from: g */
    public C0310h mo880g(C0789f0 f0Var) {
        if (!this.f813e) {
            this.f812d = f0Var;
        }
        return this;
    }

    /* renamed from: h */
    public void mo881h() {
        if (!this.f813e) {
            Iterator<C0783e0> it = this.f809a.iterator();
            while (it.hasNext()) {
                C0783e0 next = it.next();
                long j = this.f810b;
                if (j >= 0) {
                    next.mo2856f(j);
                }
                Interpolator interpolator = this.f811c;
                if (interpolator != null) {
                    next.mo2857g(interpolator);
                }
                if (this.f812d != null) {
                    next.mo2858h(this.f814f);
                }
                next.mo2861l();
            }
            this.f813e = true;
        }
    }
}
