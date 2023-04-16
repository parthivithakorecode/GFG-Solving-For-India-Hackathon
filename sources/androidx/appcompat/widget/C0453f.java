package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.view.C0831w;
import androidx.core.widget.C0864b;
import androidx.core.widget.C0883j;
import androidx.core.widget.C0895n;
import p038f.C2582a;

/* renamed from: androidx.appcompat.widget.f */
public class C0453f extends Button implements C0831w, C0864b, C0895n {

    /* renamed from: f */
    private final C0444e f1428f;

    /* renamed from: g */
    private final C0429c0 f1429g;

    /* renamed from: h */
    private C0484n f1430h;

    public C0453f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2582a.buttonStyle);
    }

    public C0453f(Context context, AttributeSet attributeSet, int i) {
        super(C0532x0.m2168b(context), attributeSet, i);
        C0527v0.m2156a(this, getContext());
        C0444e eVar = new C0444e(this);
        this.f1428f = eVar;
        eVar.mo1932e(attributeSet, i);
        C0429c0 c0Var = new C0429c0(this);
        this.f1429g = c0Var;
        c0Var.mo1820m(attributeSet, i);
        c0Var.mo1810b();
        getEmojiTextViewHelper().mo2199b(attributeSet, i);
    }

    private C0484n getEmojiTextViewHelper() {
        if (this.f1430h == null) {
            this.f1430h = new C0484n(this);
        }
        return this.f1430h;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0444e eVar = this.f1428f;
        if (eVar != null) {
            eVar.mo1929b();
        }
        C0429c0 c0Var = this.f1429g;
        if (c0Var != null) {
            c0Var.mo1810b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (C0864b.f2351a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0429c0 c0Var = this.f1429g;
        if (c0Var != null) {
            return c0Var.mo1812e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C0864b.f2351a) {
            return super.getAutoSizeMinTextSize();
        }
        C0429c0 c0Var = this.f1429g;
        if (c0Var != null) {
            return c0Var.mo1813f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C0864b.f2351a) {
            return super.getAutoSizeStepGranularity();
        }
        C0429c0 c0Var = this.f1429g;
        if (c0Var != null) {
            return c0Var.mo1814g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C0864b.f2351a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0429c0 c0Var = this.f1429g;
        return c0Var != null ? c0Var.mo1815h() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (C0864b.f2351a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0429c0 c0Var = this.f1429g;
        if (c0Var != null) {
            return c0Var.mo1816i();
        }
        return 0;
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C0883j.m3649m(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0444e eVar = this.f1428f;
        if (eVar != null) {
            return eVar.mo1930c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0444e eVar = this.f1428f;
        if (eVar != null) {
            return eVar.mo1931d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1429g.mo1817j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1429g.mo1818k();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0429c0 c0Var = this.f1429g;
        if (c0Var != null) {
            c0Var.mo1822o(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0429c0 c0Var = this.f1429g;
        if (c0Var != null && !C0864b.f2351a && c0Var.mo1819l()) {
            this.f1429g.mo1811c();
        }
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo2200c(z);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (C0864b.f2351a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0429c0 c0Var = this.f1429g;
        if (c0Var != null) {
            c0Var.mo1827t(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (C0864b.f2351a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0429c0 c0Var = this.f1429g;
        if (c0Var != null) {
            c0Var.mo1828u(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C0864b.f2351a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0429c0 c0Var = this.f1429g;
        if (c0Var != null) {
            c0Var.mo1829v(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0444e eVar = this.f1428f;
        if (eVar != null) {
            eVar.mo1933f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0444e eVar = this.f1428f;
        if (eVar != null) {
            eVar.mo1934g(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0883j.m3650n(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().mo2201d(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().mo2198a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        C0429c0 c0Var = this.f1429g;
        if (c0Var != null) {
            c0Var.mo1826s(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0444e eVar = this.f1428f;
        if (eVar != null) {
            eVar.mo1936i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0444e eVar = this.f1428f;
        if (eVar != null) {
            eVar.mo1937j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1429g.mo1830w(colorStateList);
        this.f1429g.mo1810b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1429g.mo1831x(mode);
        this.f1429g.mo1810b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0429c0 c0Var = this.f1429g;
        if (c0Var != null) {
            c0Var.mo1824q(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (C0864b.f2351a) {
            super.setTextSize(i, f);
            return;
        }
        C0429c0 c0Var = this.f1429g;
        if (c0Var != null) {
            c0Var.mo1809A(i, f);
        }
    }
}
