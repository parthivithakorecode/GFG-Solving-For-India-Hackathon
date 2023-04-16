package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.view.C0831w;
import androidx.core.widget.C0883j;
import androidx.core.widget.C0893l;
import androidx.core.widget.C0895n;
import p038f.C2582a;
import p045g.C2620a;

/* renamed from: androidx.appcompat.widget.h */
public class C0459h extends CheckedTextView implements C0893l, C0831w, C0895n {

    /* renamed from: f */
    private final C0462i f1451f;

    /* renamed from: g */
    private final C0444e f1452g;

    /* renamed from: h */
    private final C0429c0 f1453h;

    /* renamed from: i */
    private C0484n f1454i;

    public C0459h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2582a.checkedTextViewStyle);
    }

    public C0459h(Context context, AttributeSet attributeSet, int i) {
        super(C0532x0.m2168b(context), attributeSet, i);
        C0527v0.m2156a(this, getContext());
        C0429c0 c0Var = new C0429c0(this);
        this.f1453h = c0Var;
        c0Var.mo1820m(attributeSet, i);
        c0Var.mo1810b();
        C0444e eVar = new C0444e(this);
        this.f1452g = eVar;
        eVar.mo1932e(attributeSet, i);
        C0462i iVar = new C0462i(this);
        this.f1451f = iVar;
        iVar.mo2039d(attributeSet, i);
        getEmojiTextViewHelper().mo2199b(attributeSet, i);
    }

    private C0484n getEmojiTextViewHelper() {
        if (this.f1454i == null) {
            this.f1454i = new C0484n(this);
        }
        return this.f1454i;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0429c0 c0Var = this.f1453h;
        if (c0Var != null) {
            c0Var.mo1810b();
        }
        C0444e eVar = this.f1452g;
        if (eVar != null) {
            eVar.mo1929b();
        }
        C0462i iVar = this.f1451f;
        if (iVar != null) {
            iVar.mo2036a();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C0883j.m3649m(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0444e eVar = this.f1452g;
        if (eVar != null) {
            return eVar.mo1930c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0444e eVar = this.f1452g;
        if (eVar != null) {
            return eVar.mo1931d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0462i iVar = this.f1451f;
        if (iVar != null) {
            return iVar.mo2037b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0462i iVar = this.f1451f;
        if (iVar != null) {
            return iVar.mo2038c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1453h.mo1817j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1453h.mo1818k();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0495o.m2042a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo2200c(z);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0444e eVar = this.f1452g;
        if (eVar != null) {
            eVar.mo1933f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0444e eVar = this.f1452g;
        if (eVar != null) {
            eVar.mo1934g(i);
        }
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C2620a.m21330b(getContext(), i));
    }

    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0462i iVar = this.f1451f;
        if (iVar != null) {
            iVar.mo2040e();
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0429c0 c0Var = this.f1453h;
        if (c0Var != null) {
            c0Var.mo1823p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0429c0 c0Var = this.f1453h;
        if (c0Var != null) {
            c0Var.mo1823p();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0883j.m3650n(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().mo2201d(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0444e eVar = this.f1452g;
        if (eVar != null) {
            eVar.mo1936i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0444e eVar = this.f1452g;
        if (eVar != null) {
            eVar.mo1937j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0462i iVar = this.f1451f;
        if (iVar != null) {
            iVar.mo2041f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0462i iVar = this.f1451f;
        if (iVar != null) {
            iVar.mo2042g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1453h.mo1830w(colorStateList);
        this.f1453h.mo1810b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1453h.mo1831x(mode);
        this.f1453h.mo1810b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0429c0 c0Var = this.f1453h;
        if (c0Var != null) {
            c0Var.mo1824q(context, i);
        }
    }
}
