package p089m0;

import android.util.Log;

/* renamed from: m0.j */
public abstract class C3646j {

    /* renamed from: a */
    private static C3646j f21390a = null;

    /* renamed from: b */
    private static final int f21391b = 20;

    /* renamed from: m0.j$a */
    public static class C3647a extends C3646j {

        /* renamed from: c */
        private int f21392c;

        public C3647a(int i) {
            super(i);
            this.f21392c = i;
        }

        /* renamed from: a */
        public void mo14806a(String str, String str2, Throwable... thArr) {
            if (this.f21392c > 3) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.d(str, str2);
            } else {
                Log.d(str, str2, thArr[0]);
            }
        }

        /* renamed from: b */
        public void mo14807b(String str, String str2, Throwable... thArr) {
            if (this.f21392c > 6) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.e(str, str2);
            } else {
                Log.e(str, str2, thArr[0]);
            }
        }

        /* renamed from: d */
        public void mo14808d(String str, String str2, Throwable... thArr) {
            if (this.f21392c > 4) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.i(str, str2);
            } else {
                Log.i(str, str2, thArr[0]);
            }
        }

        /* renamed from: g */
        public void mo14809g(String str, String str2, Throwable... thArr) {
            if (this.f21392c > 2) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.v(str, str2);
            } else {
                Log.v(str, str2, thArr[0]);
            }
        }

        /* renamed from: h */
        public void mo14810h(String str, String str2, Throwable... thArr) {
            if (this.f21392c > 5) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.w(str, str2);
            } else {
                Log.w(str, str2, thArr[0]);
            }
        }
    }

    public C3646j(int i) {
    }

    /* renamed from: c */
    public static synchronized C3646j m25229c() {
        C3646j jVar;
        synchronized (C3646j.class) {
            if (f21390a == null) {
                f21390a = new C3647a(3);
            }
            jVar = f21390a;
        }
        return jVar;
    }

    /* renamed from: e */
    public static synchronized void m25230e(C3646j jVar) {
        synchronized (C3646j.class) {
            f21390a = jVar;
        }
    }

    /* renamed from: f */
    public static String m25231f(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i = f21391b;
        if (length >= i) {
            str = str.substring(0, i);
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public abstract void mo14806a(String str, String str2, Throwable... thArr);

    /* renamed from: b */
    public abstract void mo14807b(String str, String str2, Throwable... thArr);

    /* renamed from: d */
    public abstract void mo14808d(String str, String str2, Throwable... thArr);

    /* renamed from: g */
    public abstract void mo14809g(String str, String str2, Throwable... thArr);

    /* renamed from: h */
    public abstract void mo14810h(String str, String str2, Throwable... thArr);
}
