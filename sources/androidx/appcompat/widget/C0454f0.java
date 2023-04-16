package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import androidx.core.view.C0831w;
import androidx.core.widget.C0895n;

/* renamed from: androidx.appcompat.widget.f0 */
public class C0454f0 extends ToggleButton implements C0831w, C0895n {

    /* renamed from: f */
    private final C0444e f1431f;

    /* renamed from: g */
    private final C0429c0 f1432g;

    /* renamed from: h */
    private C0484n f1433h;

    public C0454f0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    public C0454f0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0527v0.m2156a(this, getContext());
        C0444e eVar = new C0444e(this);
        this.f1431f = eVar;
        eVar.mo1932e(attributeSet, i);
        C0429c0 c0Var = new C0429c0(this);
        this.f1432g = c0Var;
        c0Var.mo1820m(attributeSet, i);
        getEmojiTextViewHelper().mo2199b(attributeSet, i);
    }

    private C0484n getEmojiTextViewHelper() {
        if (this.f1433h == null) {
            this.f1433h = new C0484n(this);
        }
        return this.f1433h;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0444e eVar = this.f1431f;
        if (eVar != null) {
            eVar.mo1929b();
        }
        C0429c0 c0Var = this.f1432g;
        if (c0Var != null) {
            c0Var.mo1810b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0444e eVar = this.f1431f;
        if (eVar != null) {
            return eVar.mo1930c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0444e eVar = this.f1431f;
        if (eVar != null) {
            return eVar.mo1931d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1432g.mo1817j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1432g.mo1818k();
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo2200c(z);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0444e eVar = this.f1431f;
        if (eVar != null) {
            eVar.mo1933f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0444e eVar = this.f1431f;
        if (eVar != null) {
            eVar.mo1934g(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0429c0 c0Var = this.f1432g;
        if (c0Var != null) {
            c0Var.mo1823p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0429c0 c0Var = this.f1432g;
        if (c0Var != null) {
            c0Var.mo1823p();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().mo2201d(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().mo2198a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0444e eVar = this.f1431f;
        if (eVar != null) {
            eVar.mo1936i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0444e eVar = this.f1431f;
        if (eVar != null) {
            eVar.mo1937j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1432g.mo1830w(colorStateList);
        this.f1432g.mo1810b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1432g.mo1831x(mode);
        this.f1432g.mo1810b();
    }
}
