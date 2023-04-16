package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.core.graphics.drawable.d */
class C0656d extends Drawable implements Drawable.Callback, C0655c, C0654b {

    /* renamed from: l */
    static final PorterDuff.Mode f1972l = PorterDuff.Mode.SRC_IN;

    /* renamed from: f */
    private int f1973f;

    /* renamed from: g */
    private PorterDuff.Mode f1974g;

    /* renamed from: h */
    private boolean f1975h;

    /* renamed from: i */
    C0658f f1976i;

    /* renamed from: j */
    private boolean f1977j;

    /* renamed from: k */
    Drawable f1978k;

    C0656d(Drawable drawable) {
        this.f1976i = m2718d();
        mo2612a(drawable);
    }

    C0656d(C0658f fVar, Resources resources) {
        this.f1976i = fVar;
        m2719e(resources);
    }

    /* renamed from: d */
    private C0658f m2718d() {
        return new C0658f(this.f1976i);
    }

    /* renamed from: e */
    private void m2719e(Resources resources) {
        Drawable.ConstantState constantState;
        C0658f fVar = this.f1976i;
        if (fVar != null && (constantState = fVar.f1981b) != null) {
            mo2612a(constantState.newDrawable(resources));
        }
    }

    /* renamed from: f */
    private boolean m2720f(int[] iArr) {
        if (!mo2614c()) {
            return false;
        }
        C0658f fVar = this.f1976i;
        ColorStateList colorStateList = fVar.f1982c;
        PorterDuff.Mode mode = fVar.f1983d;
        if (colorStateList == null || mode == null) {
            this.f1975h = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f1975h && colorForState == this.f1973f && mode == this.f1974g)) {
                setColorFilter(colorForState, mode);
                this.f1973f = colorForState;
                this.f1974g = mode;
                this.f1975h = true;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo2612a(Drawable drawable) {
        Drawable drawable2 = this.f1978k;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1978k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C0658f fVar = this.f1976i;
            if (fVar != null) {
                fVar.f1981b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* renamed from: b */
    public final Drawable mo2613b() {
        return this.f1978k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo2614c() {
        return true;
    }

    public void draw(Canvas canvas) {
        this.f1978k.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C0658f fVar = this.f1976i;
        return changingConfigurations | (fVar != null ? fVar.getChangingConfigurations() : 0) | this.f1978k.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        C0658f fVar = this.f1976i;
        if (fVar == null || !fVar.mo2651a()) {
            return null;
        }
        this.f1976i.f1980a = getChangingConfigurations();
        return this.f1976i;
    }

    public Drawable getCurrent() {
        return this.f1978k.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f1978k.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f1978k.getIntrinsicWidth();
    }

    public int getLayoutDirection() {
        return C0650a.m2688e(this.f1978k);
    }

    public int getMinimumHeight() {
        return this.f1978k.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f1978k.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f1978k.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f1978k.getPadding(rect);
    }

    public int[] getState() {
        return this.f1978k.getState();
    }

    public Region getTransparentRegion() {
        return this.f1978k.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C0650a.m2690g(this.f1978k);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f1976i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = r1.mo2614c()
            if (r0 == 0) goto L_0x000d
            androidx.core.graphics.drawable.f r0 = r1.f1976i
            if (r0 == 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r0.f1982c
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001e
        L_0x0016:
            android.graphics.drawable.Drawable r0 = r1.f1978k
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.C0656d.isStateful():boolean");
    }

    public void jumpToCurrentState() {
        this.f1978k.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f1977j && super.mutate() == this) {
            this.f1976i = m2718d();
            Drawable drawable = this.f1978k;
            if (drawable != null) {
                drawable.mutate();
            }
            C0658f fVar = this.f1976i;
            if (fVar != null) {
                Drawable drawable2 = this.f1978k;
                fVar.f1981b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f1977j = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1978k;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        return C0650a.m2695l(this.f1978k, i);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f1978k.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f1978k.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C0650a.m2692i(this.f1978k, z);
    }

    public void setChangingConfigurations(int i) {
        this.f1978k.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1978k.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f1978k.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f1978k.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return m2720f(iArr) || this.f1978k.setState(iArr);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f1976i.f1982c = colorStateList;
        m2720f(getState());
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f1976i.f1983d = mode;
        m2720f(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f1978k.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
