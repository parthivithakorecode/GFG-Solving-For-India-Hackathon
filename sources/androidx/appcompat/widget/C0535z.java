package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.C0650a;
import androidx.core.view.C0833y;
import p038f.C2591j;

/* renamed from: androidx.appcompat.widget.z */
class C0535z extends C0522u {

    /* renamed from: d */
    private final SeekBar f1694d;

    /* renamed from: e */
    private Drawable f1695e;

    /* renamed from: f */
    private ColorStateList f1696f = null;

    /* renamed from: g */
    private PorterDuff.Mode f1697g = null;

    /* renamed from: h */
    private boolean f1698h = false;

    /* renamed from: i */
    private boolean f1699i = false;

    C0535z(SeekBar seekBar) {
        super(seekBar);
        this.f1694d = seekBar;
    }

    /* renamed from: f */
    private void m2170f() {
        Drawable drawable = this.f1695e;
        if (drawable == null) {
            return;
        }
        if (this.f1698h || this.f1699i) {
            Drawable p = C0650a.m2699p(drawable.mutate());
            this.f1695e = p;
            if (this.f1698h) {
                C0650a.m2697n(p, this.f1696f);
            }
            if (this.f1699i) {
                C0650a.m2698o(this.f1695e, this.f1697g);
            }
            if (this.f1695e.isStateful()) {
                this.f1695e.setState(this.f1694d.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2335c(AttributeSet attributeSet, int i) {
        super.mo2335c(attributeSet, i);
        Context context = this.f1694d.getContext();
        int[] iArr = C2591j.f18780T;
        C0415a1 u = C0415a1.m1660u(context, attributeSet, iArr, i, 0);
        SeekBar seekBar = this.f1694d;
        C0833y.m3328M(seekBar, seekBar.getContext(), iArr, attributeSet, u.mo1782q(), i, 0);
        Drawable g = u.mo1772g(C2591j.f18784U);
        if (g != null) {
            this.f1694d.setThumb(g);
        }
        mo2380j(u.mo1771f(C2591j.f18788V));
        int i2 = C2591j.f18796X;
        if (u.mo1783r(i2)) {
            this.f1697g = C0463i0.m1909d(u.mo1775j(i2, -1), this.f1697g);
            this.f1699i = true;
        }
        int i3 = C2591j.f18792W;
        if (u.mo1783r(i3)) {
            this.f1696f = u.mo1768c(i3);
            this.f1698h = true;
        }
        u.mo1784v();
        m2170f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2377g(Canvas canvas) {
        if (this.f1695e != null) {
            int max = this.f1694d.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.f1695e.getIntrinsicWidth();
                int intrinsicHeight = this.f1695e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.f1695e.setBounds(-i2, -i, i2, i);
                float width = ((float) ((this.f1694d.getWidth() - this.f1694d.getPaddingLeft()) - this.f1694d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f1694d.getPaddingLeft(), (float) (this.f1694d.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f1695e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2378h() {
        Drawable drawable = this.f1695e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1694d.getDrawableState())) {
            this.f1694d.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo2379i() {
        Drawable drawable = this.f1695e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo2380j(Drawable drawable) {
        Drawable drawable2 = this.f1695e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1695e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1694d);
            C0650a.m2695l(drawable, C0833y.m3362r(this.f1694d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1694d.getDrawableState());
            }
            m2170f();
        }
        this.f1694d.invalidate();
    }
}
