package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.core.view.C0831w;
import androidx.core.widget.C0883j;
import androidx.core.widget.C0895n;
import p038f.C2582a;
import p045g.C2620a;

/* renamed from: androidx.appcompat.widget.d */
public class C0440d extends AutoCompleteTextView implements C0831w, C0895n {

    /* renamed from: i */
    private static final int[] f1397i = {16843126};

    /* renamed from: f */
    private final C0444e f1398f;

    /* renamed from: g */
    private final C0429c0 f1399g;

    /* renamed from: h */
    private final C0481m f1400h;

    public C0440d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2582a.autoCompleteTextViewStyle);
    }

    public C0440d(Context context, AttributeSet attributeSet, int i) {
        super(C0532x0.m2168b(context), attributeSet, i);
        C0527v0.m2156a(this, getContext());
        C0415a1 u = C0415a1.m1660u(getContext(), attributeSet, f1397i, i, 0);
        if (u.mo1783r(0)) {
            setDropDownBackgroundDrawable(u.mo1771f(0));
        }
        u.mo1784v();
        C0444e eVar = new C0444e(this);
        this.f1398f = eVar;
        eVar.mo1932e(attributeSet, i);
        C0429c0 c0Var = new C0429c0(this);
        this.f1399g = c0Var;
        c0Var.mo1820m(attributeSet, i);
        c0Var.mo1810b();
        C0481m mVar = new C0481m(this);
        this.f1400h = mVar;
        mVar.mo2155c(attributeSet, i);
        mo1871a(mVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1871a(C0481m mVar) {
        KeyListener keyListener = getKeyListener();
        if (mVar.mo2154b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a = mVar.mo2153a(keyListener);
            if (a != keyListener) {
                super.setKeyListener(a);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0444e eVar = this.f1398f;
        if (eVar != null) {
            eVar.mo1929b();
        }
        C0429c0 c0Var = this.f1399g;
        if (c0Var != null) {
            c0Var.mo1810b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C0883j.m3649m(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0444e eVar = this.f1398f;
        if (eVar != null) {
            return eVar.mo1930c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0444e eVar = this.f1398f;
        if (eVar != null) {
            return eVar.mo1931d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1399g.mo1817j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1399g.mo1818k();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f1400h.mo2156d(C0495o.m2042a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0444e eVar = this.f1398f;
        if (eVar != null) {
            eVar.mo1933f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0444e eVar = this.f1398f;
        if (eVar != null) {
            eVar.mo1934g(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0429c0 c0Var = this.f1399g;
        if (c0Var != null) {
            c0Var.mo1823p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0429c0 c0Var = this.f1399g;
        if (c0Var != null) {
            c0Var.mo1823p();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0883j.m3650n(this, callback));
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C2620a.m21330b(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f1400h.mo2157e(z);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1400h.mo2153a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0444e eVar = this.f1398f;
        if (eVar != null) {
            eVar.mo1936i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0444e eVar = this.f1398f;
        if (eVar != null) {
            eVar.mo1937j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1399g.mo1830w(colorStateList);
        this.f1399g.mo1810b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1399g.mo1831x(mode);
        this.f1399g.mo1810b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0429c0 c0Var = this.f1399g;
        if (c0Var != null) {
            c0Var.mo1824q(context, i);
        }
    }
}
