package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import p102o.C3814g;

/* renamed from: androidx.core.view.j0 */
public final class C0813j0 {

    /* renamed from: a */
    private final C0818e f2250a;

    /* renamed from: androidx.core.view.j0$a */
    private static class C0814a extends C0818e {

        /* renamed from: a */
        protected final Window f2251a;

        /* renamed from: b */
        private final View f2252b;

        C0814a(Window window, View view) {
            this.f2251a = window;
            this.f2252b = view;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo2925c(int i) {
            View decorView = this.f2251a.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo2926d(int i) {
            this.f2251a.addFlags(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo2927e(int i) {
            View decorView = this.f2251a.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo2928f(int i) {
            this.f2251a.clearFlags(i);
        }
    }

    /* renamed from: androidx.core.view.j0$b */
    private static class C0815b extends C0814a {
        C0815b(Window window, View view) {
            super(window, view);
        }

        /* renamed from: b */
        public void mo2929b(boolean z) {
            if (z) {
                mo2928f(67108864);
                mo2926d(Integer.MIN_VALUE);
                mo2925c(8192);
                return;
            }
            mo2927e(8192);
        }
    }

    /* renamed from: androidx.core.view.j0$c */
    private static class C0816c extends C0815b {
        C0816c(Window window, View view) {
            super(window, view);
        }

        /* renamed from: a */
        public void mo2930a(boolean z) {
            if (z) {
                mo2928f(134217728);
                mo2926d(Integer.MIN_VALUE);
                mo2925c(16);
                return;
            }
            mo2927e(16);
        }
    }

    /* renamed from: androidx.core.view.j0$d */
    private static class C0817d extends C0818e {

        /* renamed from: a */
        final C0813j0 f2253a;

        /* renamed from: b */
        final WindowInsetsController f2254b;

        /* renamed from: c */
        private final C3814g<Object, WindowInsetsController.OnControllableInsetsChangedListener> f2255c;

        /* renamed from: d */
        protected Window f2256d;

        C0817d(Window window, C0813j0 j0Var) {
            this(window.getInsetsController(), j0Var);
            this.f2256d = window;
        }

        C0817d(WindowInsetsController windowInsetsController, C0813j0 j0Var) {
            this.f2255c = new C3814g<>();
            this.f2254b = windowInsetsController;
            this.f2253a = j0Var;
        }

        /* renamed from: a */
        public void mo2930a(boolean z) {
            if (z) {
                if (this.f2256d != null) {
                    mo2931c(16);
                }
                this.f2254b.setSystemBarsAppearance(16, 16);
                return;
            }
            if (this.f2256d != null) {
                mo2932d(16);
            }
            this.f2254b.setSystemBarsAppearance(0, 16);
        }

        /* renamed from: b */
        public void mo2929b(boolean z) {
            if (z) {
                if (this.f2256d != null) {
                    mo2931c(8192);
                }
                this.f2254b.setSystemBarsAppearance(8, 8);
                return;
            }
            if (this.f2256d != null) {
                mo2932d(8192);
            }
            this.f2254b.setSystemBarsAppearance(0, 8);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo2931c(int i) {
            View decorView = this.f2256d.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo2932d(int i) {
            View decorView = this.f2256d.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }
    }

    /* renamed from: androidx.core.view.j0$e */
    private static class C0818e {
        C0818e() {
        }

        /* renamed from: a */
        public void mo2930a(boolean z) {
        }

        /* renamed from: b */
        public void mo2929b(boolean z) {
        }
    }

    public C0813j0(Window window, View view) {
        C0818e aVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f2250a = new C0817d(window, this);
            return;
        }
        if (i >= 26) {
            aVar = new C0816c(window, view);
        } else if (i >= 23) {
            aVar = new C0815b(window, view);
        } else if (i >= 20) {
            aVar = new C0814a(window, view);
        } else {
            this.f2250a = new C0818e();
            return;
        }
        this.f2250a = aVar;
    }

    /* renamed from: a */
    public void mo2923a(boolean z) {
        this.f2250a.mo2930a(z);
    }

    /* renamed from: b */
    public void mo2924b(boolean z) {
        this.f2250a.mo2929b(z);
    }
}
