package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.C0351p;

/* renamed from: androidx.appcompat.widget.l0 */
public abstract class C0478l0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: f */
    private final float f1514f;

    /* renamed from: g */
    private final int f1515g;

    /* renamed from: h */
    private final int f1516h;

    /* renamed from: i */
    final View f1517i;

    /* renamed from: j */
    private Runnable f1518j;

    /* renamed from: k */
    private Runnable f1519k;

    /* renamed from: l */
    private boolean f1520l;

    /* renamed from: m */
    private int f1521m;

    /* renamed from: n */
    private final int[] f1522n = new int[2];

    /* renamed from: androidx.appcompat.widget.l0$a */
    private class C0479a implements Runnable {
        C0479a() {
        }

        public void run() {
            ViewParent parent = C0478l0.this.f1517i.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.l0$b */
    private class C0480b implements Runnable {
        C0480b() {
        }

        public void run() {
            C0478l0.this.mo2147g();
        }
    }

    public C0478l0(View view) {
        this.f1517i = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1514f = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1515g = tapTimeout;
        this.f1516h = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    private void m1966a() {
        Runnable runnable = this.f1519k;
        if (runnable != null) {
            this.f1517i.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1518j;
        if (runnable2 != null) {
            this.f1517i.removeCallbacks(runnable2);
        }
    }

    /* renamed from: p */
    private boolean m1967p(MotionEvent motionEvent) {
        C0466j0 j0Var;
        View view = this.f1517i;
        C0351p b = mo918b();
        if (b == null || !b.mo1017c() || (j0Var = (C0466j0) b.mo1019g()) == null || !j0Var.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m1970s(view, obtainNoHistory);
        m1971t(j0Var, obtainNoHistory);
        boolean e = j0Var.mo2098e(obtainNoHistory, this.f1521m);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return e && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1968q(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1517i
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.f1521m
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1514f
            boolean r6 = m1969r(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.m1966a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.m1966a()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.f1521m = r6
            java.lang.Runnable r6 = r5.f1518j
            if (r6 != 0) goto L_0x0052
            androidx.appcompat.widget.l0$a r6 = new androidx.appcompat.widget.l0$a
            r6.<init>()
            r5.f1518j = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.f1518j
            int r1 = r5.f1515g
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f1519k
            if (r6 != 0) goto L_0x0065
            androidx.appcompat.widget.l0$b r6 = new androidx.appcompat.widget.l0$b
            r6.<init>()
            r5.f1519k = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.f1519k
            int r1 = r5.f1516h
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0478l0.m1968q(android.view.MotionEvent):boolean");
    }

    /* renamed from: r */
    private static boolean m1969r(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* renamed from: s */
    private boolean m1970s(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1522n;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    /* renamed from: t */
    private boolean m1971t(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1522n;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    /* renamed from: b */
    public abstract C0351p mo918b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo919c();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo1808e() {
        C0351p b = mo918b();
        if (b == null || !b.mo1017c()) {
            return true;
        }
        b.dismiss();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2147g() {
        m1966a();
        View view = this.f1517i;
        if (view.isEnabled() && !view.isLongClickable() && mo919c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f1520l = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f1520l;
        if (z2) {
            z = m1967p(motionEvent) || !mo1808e();
        } else {
            z = m1968q(motionEvent) && mo919c();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1517i.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f1520l = z;
        return z || z2;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f1520l = false;
        this.f1521m = -1;
        Runnable runnable = this.f1518j;
        if (runnable != null) {
            this.f1517i.removeCallbacks(runnable);
        }
    }
}
