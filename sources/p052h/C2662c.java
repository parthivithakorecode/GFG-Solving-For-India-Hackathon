package p052h;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.C0650a;

/* renamed from: h.c */
public class C2662c extends Drawable implements Drawable.Callback {

    /* renamed from: f */
    private Drawable f19089f;

    public C2662c(Drawable drawable) {
        mo12615b(drawable);
    }

    /* renamed from: a */
    public Drawable mo12614a() {
        return this.f19089f;
    }

    /* renamed from: b */
    public void mo12615b(Drawable drawable) {
        Drawable drawable2 = this.f19089f;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f19089f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f19089f.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f19089f.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f19089f.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f19089f.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f19089f.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f19089f.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f19089f.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f19089f.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f19089f.getPadding(rect);
    }

    public int[] getState() {
        return this.f19089f.getState();
    }

    public Region getTransparentRegion() {
        return this.f19089f.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C0650a.m2690g(this.f19089f);
    }

    public boolean isStateful() {
        return this.f19089f.isStateful();
    }

    public void jumpToCurrentState() {
        this.f19089f.jumpToCurrentState();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f19089f.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f19089f.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f19089f.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C0650a.m2692i(this.f19089f, z);
    }

    public void setChangingConfigurations(int i) {
        this.f19089f.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f19089f.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f19089f.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f19089f.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        C0650a.m2693j(this.f19089f, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C0650a.m2694k(this.f19089f, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f19089f.setState(iArr);
    }

    public void setTint(int i) {
        C0650a.m2696m(this.f19089f, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C0650a.m2697n(this.f19089f, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C0650a.m2698o(this.f19089f, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f19089f.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
