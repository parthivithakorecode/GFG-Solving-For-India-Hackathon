package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.core.view.C0831w;
import androidx.core.widget.C0894m;
import androidx.core.widget.C0895n;
import p038f.C2582a;
import p045g.C2620a;

/* renamed from: androidx.appcompat.widget.g */
public class C0456g extends CheckBox implements C0894m, C0831w, C0895n {

    /* renamed from: f */
    private final C0465j f1435f;

    /* renamed from: g */
    private final C0444e f1436g;

    /* renamed from: h */
    private final C0429c0 f1437h;

    /* renamed from: i */
    private C0484n f1438i;

    public C0456g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2582a.checkboxStyle);
    }

    public C0456g(Context context, AttributeSet attributeSet, int i) {
        super(C0532x0.m2168b(context), attributeSet, i);
        C0527v0.m2156a(this, getContext());
        C0465j jVar = new C0465j(this);
        this.f1435f = jVar;
        jVar.mo2091e(attributeSet, i);
        C0444e eVar = new C0444e(this);
        this.f1436g = eVar;
        eVar.mo1932e(attributeSet, i);
        C0429c0 c0Var = new C0429c0(this);
        this.f1437h = c0Var;
        c0Var.mo1820m(attributeSet, i);
        getEmojiTextViewHelper().mo2199b(attributeSet, i);
    }

    private C0484n getEmojiTextViewHelper() {
        if (this.f1438i == null) {
            this.f1438i = new C0484n(this);
        }
        return this.f1438i;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0444e eVar = this.f1436g;
        if (eVar != null) {
            eVar.mo1929b();
        }
        C0429c0 c0Var = this.f1437h;
        if (c0Var != null) {
            c0Var.mo1810b();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0465j jVar = this.f1435f;
        return jVar != null ? jVar.mo2088b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0444e eVar = this.f1436g;
        if (eVar != null) {
            return eVar.mo1930c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0444e eVar = this.f1436g;
        if (eVar != null) {
            return eVar.mo1931d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0465j jVar = this.f1435f;
        if (jVar != null) {
            return jVar.mo2089c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0465j jVar = this.f1435f;
        if (jVar != null) {
            return jVar.mo2090d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1437h.mo1817j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1437h.mo1818k();
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo2200c(z);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0444e eVar = this.f1436g;
        if (eVar != null) {
            eVar.mo1933f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0444e eVar = this.f1436g;
        if (eVar != null) {
            eVar.mo1934g(i);
        }
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C2620a.m21330b(getContext(), i));
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0465j jVar = this.f1435f;
        if (jVar != null) {
            jVar.mo2092f();
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0429c0 c0Var = this.f1437h;
        if (c0Var != null) {
            c0Var.mo1823p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0429c0 c0Var = this.f1437h;
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
        C0444e eVar = this.f1436g;
        if (eVar != null) {
            eVar.mo1936i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0444e eVar = this.f1436g;
        if (eVar != null) {
            eVar.mo1937j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0465j jVar = this.f1435f;
        if (jVar != null) {
            jVar.mo2093g(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0465j jVar = this.f1435f;
        if (jVar != null) {
            jVar.mo2094h(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1437h.mo1830w(colorStateList);
        this.f1437h.mo1810b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1437h.mo1831x(mode);
        this.f1437h.mo1810b();
    }
}
