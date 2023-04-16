package p089m0;

import android.annotation.SuppressLint;

/* renamed from: m0.m */
public interface C3651m {
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: a */
    public static final C3653b.C3656c f21400a = new C3653b.C3656c();
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: b */
    public static final C3653b.C3655b f21401b = new C3653b.C3655b();

    /* renamed from: m0.m$b */
    public static abstract class C3653b {

        /* renamed from: m0.m$b$a */
        public static final class C3654a extends C3653b {

            /* renamed from: a */
            private final Throwable f21402a;

            public C3654a(Throwable th) {
                this.f21402a = th;
            }

            /* renamed from: a */
            public Throwable mo14815a() {
                return this.f21402a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", new Object[]{this.f21402a.getMessage()});
            }
        }

        /* renamed from: m0.m$b$b */
        public static final class C3655b extends C3653b {
            private C3655b() {
            }

            public String toString() {
                return "IN_PROGRESS";
            }
        }

        /* renamed from: m0.m$b$c */
        public static final class C3656c extends C3653b {
            private C3656c() {
            }

            public String toString() {
                return "SUCCESS";
            }
        }

        C3653b() {
        }
    }
}
