package p052h;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import androidx.core.graphics.drawable.C0650a;

/* renamed from: h.b */
class C2657b extends Drawable implements Drawable.Callback {

    /* renamed from: f */
    private C2661d f19040f;

    /* renamed from: g */
    private Rect f19041g;

    /* renamed from: h */
    private Drawable f19042h;

    /* renamed from: i */
    private Drawable f19043i;

    /* renamed from: j */
    private int f19044j = 255;

    /* renamed from: k */
    private boolean f19045k;

    /* renamed from: l */
    private int f19046l = -1;

    /* renamed from: m */
    private boolean f19047m;

    /* renamed from: n */
    private Runnable f19048n;

    /* renamed from: o */
    private long f19049o;

    /* renamed from: p */
    private long f19050p;

    /* renamed from: q */
    private C2660c f19051q;

    /* renamed from: h.b$a */
    class C2658a implements Runnable {
        C2658a() {
        }

        public void run() {
            C2657b.this.mo12577a(true);
            C2657b.this.invalidateSelf();
        }
    }

    /* renamed from: h.b$b */
    private static class C2659b {
        /* renamed from: a */
        public static boolean m21421a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        /* renamed from: b */
        public static void m21422b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        /* renamed from: c */
        public static Resources m21423c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* renamed from: h.b$c */
    static class C2660c implements Drawable.Callback {

        /* renamed from: f */
        private Drawable.Callback f19053f;

        C2660c() {
        }

        /* renamed from: a */
        public Drawable.Callback mo12585a() {
            Drawable.Callback callback = this.f19053f;
            this.f19053f = null;
            return callback;
        }

        /* renamed from: b */
        public C2660c mo12586b(Drawable.Callback callback) {
            this.f19053f = callback;
            return this;
        }

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f19053f;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f19053f;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: h.b$d */
    static abstract class C2661d extends Drawable.ConstantState {

        /* renamed from: A */
        int f19054A = 0;

        /* renamed from: B */
        int f19055B = 0;

        /* renamed from: C */
        boolean f19056C;

        /* renamed from: D */
        ColorFilter f19057D;

        /* renamed from: E */
        boolean f19058E;

        /* renamed from: F */
        ColorStateList f19059F;

        /* renamed from: G */
        PorterDuff.Mode f19060G;

        /* renamed from: H */
        boolean f19061H;

        /* renamed from: I */
        boolean f19062I;

        /* renamed from: a */
        final C2657b f19063a;

        /* renamed from: b */
        Resources f19064b;

        /* renamed from: c */
        int f19065c;

        /* renamed from: d */
        int f19066d;

        /* renamed from: e */
        int f19067e;

        /* renamed from: f */
        SparseArray<Drawable.ConstantState> f19068f;

        /* renamed from: g */
        Drawable[] f19069g;

        /* renamed from: h */
        int f19070h;

        /* renamed from: i */
        boolean f19071i = false;

        /* renamed from: j */
        boolean f19072j;

        /* renamed from: k */
        Rect f19073k;

        /* renamed from: l */
        boolean f19074l = false;

        /* renamed from: m */
        boolean f19075m;

        /* renamed from: n */
        int f19076n;

        /* renamed from: o */
        int f19077o;

        /* renamed from: p */
        int f19078p;

        /* renamed from: q */
        int f19079q;

        /* renamed from: r */
        boolean f19080r;

        /* renamed from: s */
        int f19081s;

        /* renamed from: t */
        boolean f19082t;

        /* renamed from: u */
        boolean f19083u;

        /* renamed from: v */
        boolean f19084v;

        /* renamed from: w */
        boolean f19085w;

        /* renamed from: x */
        boolean f19086x = true;

        /* renamed from: y */
        boolean f19087y;

        /* renamed from: z */
        int f19088z;

        C2661d(C2661d dVar, C2657b bVar, Resources resources) {
            this.f19063a = bVar;
            Rect rect = null;
            this.f19064b = resources != null ? resources : dVar != null ? dVar.f19064b : null;
            int f = C2657b.m21414f(resources, dVar != null ? dVar.f19065c : 0);
            this.f19065c = f;
            if (dVar != null) {
                this.f19066d = dVar.f19066d;
                this.f19067e = dVar.f19067e;
                this.f19084v = true;
                this.f19085w = true;
                this.f19071i = dVar.f19071i;
                this.f19074l = dVar.f19074l;
                this.f19086x = dVar.f19086x;
                this.f19087y = dVar.f19087y;
                this.f19088z = dVar.f19088z;
                this.f19054A = dVar.f19054A;
                this.f19055B = dVar.f19055B;
                this.f19056C = dVar.f19056C;
                this.f19057D = dVar.f19057D;
                this.f19058E = dVar.f19058E;
                this.f19059F = dVar.f19059F;
                this.f19060G = dVar.f19060G;
                this.f19061H = dVar.f19061H;
                this.f19062I = dVar.f19062I;
                if (dVar.f19065c == f) {
                    if (dVar.f19072j) {
                        this.f19073k = dVar.f19073k != null ? new Rect(dVar.f19073k) : rect;
                        this.f19072j = true;
                    }
                    if (dVar.f19075m) {
                        this.f19076n = dVar.f19076n;
                        this.f19077o = dVar.f19077o;
                        this.f19078p = dVar.f19078p;
                        this.f19079q = dVar.f19079q;
                        this.f19075m = true;
                    }
                }
                if (dVar.f19080r) {
                    this.f19081s = dVar.f19081s;
                    this.f19080r = true;
                }
                if (dVar.f19082t) {
                    this.f19083u = dVar.f19083u;
                    this.f19082t = true;
                }
                Drawable[] drawableArr = dVar.f19069g;
                this.f19069g = new Drawable[drawableArr.length];
                this.f19070h = dVar.f19070h;
                SparseArray<Drawable.ConstantState> sparseArray = dVar.f19068f;
                this.f19068f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f19070h);
                int i = this.f19070h;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null) {
                        Drawable.ConstantState constantState = drawableArr[i2].getConstantState();
                        if (constantState != null) {
                            this.f19068f.put(i2, constantState);
                        } else {
                            this.f19069g[i2] = drawableArr[i2];
                        }
                    }
                }
                return;
            }
            this.f19069g = new Drawable[10];
            this.f19070h = 0;
        }

        /* renamed from: e */
        private void m21426e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f19068f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f19069g[this.f19068f.keyAt(i)] = m21427s(this.f19068f.valueAt(i).newDrawable(this.f19064b));
                }
                this.f19068f = null;
            }
        }

        /* renamed from: s */
        private Drawable m21427s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                C0650a.m2695l(drawable, this.f19088z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f19063a);
            return mutate;
        }

        /* renamed from: a */
        public final int mo12590a(Drawable drawable) {
            int i = this.f19070h;
            if (i >= this.f19069g.length) {
                mo12605o(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f19063a);
            this.f19069g[i] = drawable;
            this.f19070h++;
            this.f19067e = drawable.getChangingConfigurations() | this.f19067e;
            mo12606p();
            this.f19073k = null;
            this.f19072j = false;
            this.f19075m = false;
            this.f19084v = false;
            return i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo12591b(Resources.Theme theme) {
            if (theme != null) {
                m21426e();
                int i = this.f19070h;
                Drawable[] drawableArr = this.f19069g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && C0650a.m2685b(drawableArr[i2])) {
                        C0650a.m2684a(drawableArr[i2], theme);
                        this.f19067e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                mo12613y(C2659b.m21423c(theme));
            }
        }

        /* renamed from: c */
        public boolean mo12592c() {
            if (this.f19084v) {
                return this.f19085w;
            }
            m21426e();
            this.f19084v = true;
            int i = this.f19070h;
            Drawable[] drawableArr = this.f19069g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f19085w = false;
                    return false;
                }
            }
            this.f19085w = true;
            return true;
        }

        public boolean canApplyTheme() {
            int i = this.f19070h;
            Drawable[] drawableArr = this.f19069g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f19068f.get(i2);
                    if (constantState != null && C2659b.m21421a(constantState)) {
                        return true;
                    }
                } else if (C0650a.m2685b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo12594d() {
            this.f19075m = true;
            m21426e();
            int i = this.f19070h;
            Drawable[] drawableArr = this.f19069g;
            this.f19077o = -1;
            this.f19076n = -1;
            this.f19079q = 0;
            this.f19078p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f19076n) {
                    this.f19076n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f19077o) {
                    this.f19077o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f19078p) {
                    this.f19078p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f19079q) {
                    this.f19079q = minimumHeight;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public final int mo12595f() {
            return this.f19069g.length;
        }

        /* renamed from: g */
        public final Drawable mo12596g(int i) {
            int indexOfKey;
            Drawable drawable = this.f19069g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f19068f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable s = m21427s(this.f19068f.valueAt(indexOfKey).newDrawable(this.f19064b));
            this.f19069g[i] = s;
            this.f19068f.removeAt(indexOfKey);
            if (this.f19068f.size() == 0) {
                this.f19068f = null;
            }
            return s;
        }

        public int getChangingConfigurations() {
            return this.f19066d | this.f19067e;
        }

        /* renamed from: h */
        public final int mo12598h() {
            return this.f19070h;
        }

        /* renamed from: i */
        public final int mo12599i() {
            if (!this.f19075m) {
                mo12594d();
            }
            return this.f19077o;
        }

        /* renamed from: j */
        public final int mo12600j() {
            if (!this.f19075m) {
                mo12594d();
            }
            return this.f19079q;
        }

        /* renamed from: k */
        public final int mo12601k() {
            if (!this.f19075m) {
                mo12594d();
            }
            return this.f19078p;
        }

        /* renamed from: l */
        public final Rect mo12602l() {
            Rect rect = null;
            if (this.f19071i) {
                return null;
            }
            Rect rect2 = this.f19073k;
            if (rect2 != null || this.f19072j) {
                return rect2;
            }
            m21426e();
            Rect rect3 = new Rect();
            int i = this.f19070h;
            Drawable[] drawableArr = this.f19069g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i3 = rect3.left;
                    if (i3 > rect.left) {
                        rect.left = i3;
                    }
                    int i4 = rect3.top;
                    if (i4 > rect.top) {
                        rect.top = i4;
                    }
                    int i5 = rect3.right;
                    if (i5 > rect.right) {
                        rect.right = i5;
                    }
                    int i6 = rect3.bottom;
                    if (i6 > rect.bottom) {
                        rect.bottom = i6;
                    }
                }
            }
            this.f19072j = true;
            this.f19073k = rect;
            return rect;
        }

        /* renamed from: m */
        public final int mo12603m() {
            if (!this.f19075m) {
                mo12594d();
            }
            return this.f19076n;
        }

        /* renamed from: n */
        public final int mo12604n() {
            if (this.f19080r) {
                return this.f19081s;
            }
            m21426e();
            int i = this.f19070h;
            Drawable[] drawableArr = this.f19069g;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.f19081s = opacity;
            this.f19080r = true;
            return opacity;
        }

        /* renamed from: o */
        public void mo12605o(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = this.f19069g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            this.f19069g = drawableArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo12606p() {
            this.f19080r = false;
            this.f19082t = false;
        }

        /* renamed from: q */
        public final boolean mo12607q() {
            return this.f19074l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public abstract void mo12571r();

        /* renamed from: t */
        public final void mo12608t(boolean z) {
            this.f19074l = z;
        }

        /* renamed from: u */
        public final void mo12609u(int i) {
            this.f19054A = i;
        }

        /* renamed from: v */
        public final void mo12610v(int i) {
            this.f19055B = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public final boolean mo12611w(int i, int i2) {
            int i3 = this.f19070h;
            Drawable[] drawableArr = this.f19069g;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    boolean l = Build.VERSION.SDK_INT >= 23 ? C0650a.m2695l(drawableArr[i4], i) : false;
                    if (i4 == i2) {
                        z = l;
                    }
                }
            }
            this.f19088z = i;
            return z;
        }

        /* renamed from: x */
        public final void mo12612x(boolean z) {
            this.f19071i = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public final void mo12613y(Resources resources) {
            if (resources != null) {
                this.f19064b = resources;
                int f = C2657b.m21414f(resources, this.f19065c);
                int i = this.f19065c;
                this.f19065c = f;
                if (i != f) {
                    this.f19075m = false;
                    this.f19072j = false;
                }
            }
        }
    }

    C2657b() {
    }

    /* renamed from: d */
    private void m21412d(Drawable drawable) {
        if (this.f19051q == null) {
            this.f19051q = new C2660c();
        }
        drawable.setCallback(this.f19051q.mo12586b(drawable.getCallback()));
        try {
            if (this.f19040f.f19054A <= 0 && this.f19045k) {
                drawable.setAlpha(this.f19044j);
            }
            C2661d dVar = this.f19040f;
            if (dVar.f19058E) {
                drawable.setColorFilter(dVar.f19057D);
            } else {
                if (dVar.f19061H) {
                    C0650a.m2697n(drawable, dVar.f19059F);
                }
                C2661d dVar2 = this.f19040f;
                if (dVar2.f19062I) {
                    C0650a.m2698o(drawable, dVar2.f19060G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f19040f.f19086x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i = Build.VERSION.SDK_INT;
            if (i >= 23) {
                C0650a.m2695l(drawable, C0650a.m2688e(this));
            }
            if (i >= 19) {
                C0650a.m2692i(drawable, this.f19040f.f19056C);
            }
            Rect rect = this.f19041g;
            if (i >= 21 && rect != null) {
                C0650a.m2694k(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f19051q.mo12585a());
        }
    }

    /* renamed from: e */
    private boolean m21413e() {
        return isAutoMirrored() && C0650a.m2688e(this) == 1;
    }

    /* renamed from: f */
    static int m21414f(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12577a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f19045k = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f19042h
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0034
            long r9 = r13.f19049o
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x0036
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0020
            int r9 = r13.f19044j
            r3.setAlpha(r9)
            goto L_0x0034
        L_0x0020:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            h.b$d r10 = r13.f19040f
            int r10 = r10.f19054A
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f19044j
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L_0x0037
        L_0x0034:
            r13.f19049o = r7
        L_0x0036:
            r3 = r6
        L_0x0037:
            android.graphics.drawable.Drawable r9 = r13.f19043i
            if (r9 == 0) goto L_0x005d
            long r10 = r13.f19050p
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x005f
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x004c
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f19043i = r0
            goto L_0x005d
        L_0x004c:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            h.b$d r4 = r13.f19040f
            int r4 = r4.f19055B
            int r3 = r3 / r4
            int r4 = r13.f19044j
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0060
        L_0x005d:
            r13.f19050p = r7
        L_0x005f:
            r0 = r3
        L_0x0060:
            if (r14 == 0) goto L_0x006c
            if (r0 == 0) goto L_0x006c
            java.lang.Runnable r14 = r13.f19048n
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p052h.C2657b.mo12577a(boolean):void");
    }

    public void applyTheme(Resources.Theme theme) {
        this.f19040f.mo12591b(theme);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C2661d mo12526b() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo12578c() {
        return this.f19046l;
    }

    public boolean canApplyTheme() {
        return this.f19040f.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f19042h;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f19043i;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo12579g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f19046l
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            h.b$d r0 = r9.f19040f
            int r0 = r0.f19055B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f19043i
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f19042h
            if (r0 == 0) goto L_0x0029
            r9.f19043i = r0
            h.b$d r0 = r9.f19040f
            int r0 = r0.f19055B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f19050p = r0
            goto L_0x0035
        L_0x0029:
            r9.f19043i = r4
            r9.f19050p = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f19042h
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            h.b$d r0 = r9.f19040f
            int r1 = r0.f19070h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.mo12596g(r10)
            r9.f19042h = r0
            r9.f19046l = r10
            if (r0 == 0) goto L_0x005a
            h.b$d r10 = r9.f19040f
            int r10 = r10.f19054A
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f19049o = r2
        L_0x0051:
            r9.m21412d(r0)
            goto L_0x005a
        L_0x0055:
            r9.f19042h = r4
            r10 = -1
            r9.f19046l = r10
        L_0x005a:
            long r0 = r9.f19049o
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L_0x0067
            long r1 = r9.f19050p
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r10 = r9.f19048n
            if (r10 != 0) goto L_0x0073
            h.b$a r10 = new h.b$a
            r10.<init>()
            r9.f19048n = r10
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r10)
        L_0x0076:
            r9.mo12577a(r0)
        L_0x0079:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p052h.C2657b.mo12579g(int):boolean");
    }

    public int getAlpha() {
        return this.f19044j;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f19040f.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f19040f.mo12592c()) {
            return null;
        }
        this.f19040f.f19066d = getChangingConfigurations();
        return this.f19040f;
    }

    public Drawable getCurrent() {
        return this.f19042h;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f19041g;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.f19040f.mo12607q()) {
            return this.f19040f.mo12599i();
        }
        Drawable drawable = this.f19042h;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.f19040f.mo12607q()) {
            return this.f19040f.mo12603m();
        }
        Drawable drawable = this.f19042h;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.f19040f.mo12607q()) {
            return this.f19040f.mo12600j();
        }
        Drawable drawable = this.f19042h;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.f19040f.mo12607q()) {
            return this.f19040f.mo12601k();
        }
        Drawable drawable = this.f19042h;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f19042h;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f19040f.mo12604n();
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f19042h;
        if (drawable != null) {
            C2659b.m21422b(drawable, outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        Rect l = this.f19040f.mo12602l();
        if (l != null) {
            rect.set(l);
            z = (l.right | ((l.left | l.top) | l.bottom)) != 0;
        } else {
            Drawable drawable = this.f19042h;
            z = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (m21413e()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo12540h(C2661d dVar) {
        this.f19040f = dVar;
        int i = this.f19046l;
        if (i >= 0) {
            Drawable g = dVar.mo12596g(i);
            this.f19042h = g;
            if (g != null) {
                m21412d(g);
            }
        }
        this.f19043i = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo12581i(Resources resources) {
        this.f19040f.mo12613y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        C2661d dVar = this.f19040f;
        if (dVar != null) {
            dVar.mo12606p();
        }
        if (drawable == this.f19042h && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f19040f.f19056C;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f19043i;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f19043i = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f19042h;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f19045k) {
                this.f19042h.setAlpha(this.f19044j);
            }
        }
        if (this.f19050p != 0) {
            this.f19050p = 0;
            z = true;
        }
        if (this.f19049o != 0) {
            this.f19049o = 0;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f19047m && super.mutate() == this) {
            C2661d b = mo12526b();
            b.mo12571r();
            mo12540h(b);
            this.f19047m = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f19043i;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f19042h;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        return this.f19040f.mo12611w(i, mo12578c());
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f19043i;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f19042h;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f19043i;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f19042h;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f19042h && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (!this.f19045k || this.f19044j != i) {
            this.f19045k = true;
            this.f19044j = i;
            Drawable drawable = this.f19042h;
            if (drawable == null) {
                return;
            }
            if (this.f19049o == 0) {
                drawable.setAlpha(i);
            } else {
                mo12577a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        C2661d dVar = this.f19040f;
        if (dVar.f19056C != z) {
            dVar.f19056C = z;
            Drawable drawable = this.f19042h;
            if (drawable != null) {
                C0650a.m2692i(drawable, z);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        C2661d dVar = this.f19040f;
        dVar.f19058E = true;
        if (dVar.f19057D != colorFilter) {
            dVar.f19057D = colorFilter;
            Drawable drawable = this.f19042h;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        C2661d dVar = this.f19040f;
        if (dVar.f19086x != z) {
            dVar.f19086x = z;
            Drawable drawable = this.f19042h;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f19042h;
        if (drawable != null) {
            C0650a.m2693j(drawable, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f19041g;
        if (rect == null) {
            this.f19041g = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f19042h;
        if (drawable != null) {
            C0650a.m2694k(drawable, i, i2, i3, i4);
        }
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        C2661d dVar = this.f19040f;
        dVar.f19061H = true;
        if (dVar.f19059F != colorStateList) {
            dVar.f19059F = colorStateList;
            C0650a.m2697n(this.f19042h, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C2661d dVar = this.f19040f;
        dVar.f19062I = true;
        if (dVar.f19060G != mode) {
            dVar.f19060G = mode;
            C0650a.m2698o(this.f19042h, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f19043i;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f19042h;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f19042h && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
