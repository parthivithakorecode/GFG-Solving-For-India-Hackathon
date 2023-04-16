package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.C0833y;

/* renamed from: androidx.core.widget.a */
public abstract class C0861a implements View.OnTouchListener {

    /* renamed from: w */
    private static final int f2321w = ViewConfiguration.getTapTimeout();

    /* renamed from: f */
    final C0862a f2322f = new C0862a();

    /* renamed from: g */
    private final Interpolator f2323g = new AccelerateInterpolator();

    /* renamed from: h */
    final View f2324h;

    /* renamed from: i */
    private Runnable f2325i;

    /* renamed from: j */
    private float[] f2326j = {0.0f, 0.0f};

    /* renamed from: k */
    private float[] f2327k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: l */
    private int f2328l;

    /* renamed from: m */
    private int f2329m;

    /* renamed from: n */
    private float[] f2330n = {0.0f, 0.0f};

    /* renamed from: o */
    private float[] f2331o = {0.0f, 0.0f};

    /* renamed from: p */
    private float[] f2332p = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: q */
    private boolean f2333q;

    /* renamed from: r */
    boolean f2334r;

    /* renamed from: s */
    boolean f2335s;

    /* renamed from: t */
    boolean f2336t;

    /* renamed from: u */
    private boolean f2337u;

    /* renamed from: v */
    private boolean f2338v;

    /* renamed from: androidx.core.widget.a$a */
    private static class C0862a {

        /* renamed from: a */
        private int f2339a;

        /* renamed from: b */
        private int f2340b;

        /* renamed from: c */
        private float f2341c;

        /* renamed from: d */
        private float f2342d;

        /* renamed from: e */
        private long f2343e = Long.MIN_VALUE;

        /* renamed from: f */
        private long f2344f = 0;

        /* renamed from: g */
        private int f2345g = 0;

        /* renamed from: h */
        private int f2346h = 0;

        /* renamed from: i */
        private long f2347i = -1;

        /* renamed from: j */
        private float f2348j;

        /* renamed from: k */
        private int f2349k;

        C0862a() {
        }

        /* renamed from: e */
        private float m3579e(long j) {
            long j2 = this.f2343e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.f2347i;
            if (j3 < 0 || j < j3) {
                return C0861a.m3559g(((float) (j - j2)) / ((float) this.f2339a), 0.0f, 1.0f) * 0.5f;
            }
            float f = this.f2348j;
            return (1.0f - f) + (f * C0861a.m3559g(((float) (j - j3)) / ((float) this.f2349k), 0.0f, 1.0f));
        }

        /* renamed from: g */
        private float m3580g(float f) {
            return (-4.0f * f * f) + (f * 4.0f);
        }

        /* renamed from: a */
        public void mo3072a() {
            if (this.f2344f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g = m3580g(m3579e(currentAnimationTimeMillis));
                this.f2344f = currentAnimationTimeMillis;
                float f = ((float) (currentAnimationTimeMillis - this.f2344f)) * g;
                this.f2345g = (int) (this.f2341c * f);
                this.f2346h = (int) (f * this.f2342d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: b */
        public int mo3073b() {
            return this.f2345g;
        }

        /* renamed from: c */
        public int mo3074c() {
            return this.f2346h;
        }

        /* renamed from: d */
        public int mo3075d() {
            float f = this.f2341c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: f */
        public int mo3076f() {
            float f = this.f2342d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: h */
        public boolean mo3077h() {
            return this.f2347i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f2347i + ((long) this.f2349k);
        }

        /* renamed from: i */
        public void mo3078i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2349k = C0861a.m3560p((int) (currentAnimationTimeMillis - this.f2343e), 0, this.f2340b);
            this.f2348j = m3579e(currentAnimationTimeMillis);
            this.f2347i = currentAnimationTimeMillis;
        }

        /* renamed from: j */
        public void mo3079j(int i) {
            this.f2340b = i;
        }

        /* renamed from: k */
        public void mo3080k(int i) {
            this.f2339a = i;
        }

        /* renamed from: l */
        public void mo3081l(float f, float f2) {
            this.f2341c = f;
            this.f2342d = f2;
        }

        /* renamed from: m */
        public void mo3082m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2343e = currentAnimationTimeMillis;
            this.f2347i = -1;
            this.f2344f = currentAnimationTimeMillis;
            this.f2348j = 0.5f;
            this.f2345g = 0;
            this.f2346h = 0;
        }
    }

    /* renamed from: androidx.core.widget.a$b */
    private class C0863b implements Runnable {
        C0863b() {
        }

        public void run() {
            C0861a aVar = C0861a.this;
            if (aVar.f2336t) {
                if (aVar.f2334r) {
                    aVar.f2334r = false;
                    aVar.f2322f.mo3082m();
                }
                C0862a aVar2 = C0861a.this.f2322f;
                if (aVar2.mo3077h() || !C0861a.this.mo3060E()) {
                    C0861a.this.f2336t = false;
                    return;
                }
                C0861a aVar3 = C0861a.this;
                if (aVar3.f2335s) {
                    aVar3.f2335s = false;
                    aVar3.mo3063c();
                }
                aVar2.mo3072a();
                C0861a.this.mo3065t(aVar2.mo3073b(), aVar2.mo3074c());
                C0833y.m3325J(C0861a.this.f2324h, this);
            }
        }
    }

    public C0861a(View view) {
        this.f2324h = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (float) ((int) ((1575.0f * f) + 0.5f));
        mo3070y(f2, f2);
        float f3 = (float) ((int) ((f * 315.0f) + 0.5f));
        mo3071z(f3, f3);
        mo3067v(1);
        mo3069x(Float.MAX_VALUE, Float.MAX_VALUE);
        mo3058C(0.2f, 0.2f);
        mo3059D(1.0f, 1.0f);
        mo3066u(f2321w);
        mo3057B(500);
        mo3056A(500);
    }

    /* renamed from: F */
    private void m3557F() {
        int i;
        if (this.f2325i == null) {
            this.f2325i = new C0863b();
        }
        this.f2336t = true;
        this.f2334r = true;
        if (this.f2333q || (i = this.f2329m) <= 0) {
            this.f2325i.run();
        } else {
            C0833y.m3326K(this.f2324h, this.f2325i, (long) i);
        }
        this.f2333q = true;
    }

    /* renamed from: e */
    private float m3558e(int i, float f, float f2, float f3) {
        float r = m3562r(this.f2326j[i], f2, this.f2327k[i], f);
        int i2 = (r > 0.0f ? 1 : (r == 0.0f ? 0 : -1));
        if (i2 == 0) {
            return 0.0f;
        }
        float f4 = this.f2330n[i];
        float f5 = this.f2331o[i];
        float f6 = this.f2332p[i];
        float f7 = f4 * f3;
        return i2 > 0 ? m3559g(r * f7, f5, f6) : -m3559g((-r) * f7, f5, f6);
    }

    /* renamed from: g */
    static float m3559g(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: p */
    static int m3560p(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: q */
    private float m3561q(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f2328l;
        if (i == 0 || i == 1) {
            if (f < f2) {
                return f >= 0.0f ? 1.0f - (f / f2) : (!this.f2336t || i != 1) ? 0.0f : 1.0f;
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
    }

    /* renamed from: r */
    private float m3562r(float f, float f2, float f3, float f4) {
        float f5;
        float g = m3559g(f * f2, 0.0f, f3);
        float q = m3561q(f2 - f4, g) - m3561q(f4, g);
        if (q < 0.0f) {
            f5 = -this.f2323g.getInterpolation(-q);
        } else if (q <= 0.0f) {
            return 0.0f;
        } else {
            f5 = this.f2323g.getInterpolation(q);
        }
        return m3559g(f5, -1.0f, 1.0f);
    }

    /* renamed from: s */
    private void m3563s() {
        if (this.f2334r) {
            this.f2336t = false;
        } else {
            this.f2322f.mo3078i();
        }
    }

    /* renamed from: A */
    public C0861a mo3056A(int i) {
        this.f2322f.mo3079j(i);
        return this;
    }

    /* renamed from: B */
    public C0861a mo3057B(int i) {
        this.f2322f.mo3080k(i);
        return this;
    }

    /* renamed from: C */
    public C0861a mo3058C(float f, float f2) {
        float[] fArr = this.f2326j;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: D */
    public C0861a mo3059D(float f, float f2) {
        float[] fArr = this.f2330n;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public boolean mo3060E() {
        C0862a aVar = this.f2322f;
        int f = aVar.mo3076f();
        int d = aVar.mo3075d();
        return (f != 0 && mo3062b(f)) || (d != 0 && mo3061a(d));
    }

    /* renamed from: a */
    public abstract boolean mo3061a(int i);

    /* renamed from: b */
    public abstract boolean mo3062b(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3063c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f2324h.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f2337u
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.m3563s()
            goto L_0x0058
        L_0x001a:
            r5.f2335s = r2
            r5.f2333q = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f2324h
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m3558e(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f2324h
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m3558e(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f2322f
            r7.mo3081l(r0, r6)
            boolean r6 = r5.f2336t
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.mo3060E()
            if (r6 == 0) goto L_0x0058
            r5.m3557F()
        L_0x0058:
            boolean r6 = r5.f2338v
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.f2336t
            if (r6 == 0) goto L_0x0061
            r1 = r2
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.C0861a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: t */
    public abstract void mo3065t(int i, int i2);

    /* renamed from: u */
    public C0861a mo3066u(int i) {
        this.f2329m = i;
        return this;
    }

    /* renamed from: v */
    public C0861a mo3067v(int i) {
        this.f2328l = i;
        return this;
    }

    /* renamed from: w */
    public C0861a mo3068w(boolean z) {
        if (this.f2337u && !z) {
            m3563s();
        }
        this.f2337u = z;
        return this;
    }

    /* renamed from: x */
    public C0861a mo3069x(float f, float f2) {
        float[] fArr = this.f2327k;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: y */
    public C0861a mo3070y(float f, float f2) {
        float[] fArr = this.f2332p;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: z */
    public C0861a mo3071z(float f, float f2) {
        float[] fArr = this.f2331o;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }
}
