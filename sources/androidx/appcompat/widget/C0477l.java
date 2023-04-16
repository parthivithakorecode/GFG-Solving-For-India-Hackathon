package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.view.C0769c;
import androidx.core.view.C0829u;
import androidx.core.view.C0831w;
import androidx.core.view.C0833y;
import androidx.core.widget.C0883j;
import androidx.core.widget.C0890k;
import androidx.core.widget.C0895n;
import p038f.C2582a;
import p128s.C3994a;
import p128s.C3997c;

/* renamed from: androidx.appcompat.widget.l */
public class C0477l extends EditText implements C0831w, C0829u, C0895n {

    /* renamed from: f */
    private final C0444e f1509f;

    /* renamed from: g */
    private final C0429c0 f1510g;

    /* renamed from: h */
    private final C0418b0 f1511h;

    /* renamed from: i */
    private final C0890k f1512i;

    /* renamed from: j */
    private final C0481m f1513j;

    public C0477l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2582a.editTextStyle);
    }

    public C0477l(Context context, AttributeSet attributeSet, int i) {
        super(C0532x0.m2168b(context), attributeSet, i);
        C0527v0.m2156a(this, getContext());
        C0444e eVar = new C0444e(this);
        this.f1509f = eVar;
        eVar.mo1932e(attributeSet, i);
        C0429c0 c0Var = new C0429c0(this);
        this.f1510g = c0Var;
        c0Var.mo1820m(attributeSet, i);
        c0Var.mo1810b();
        this.f1511h = new C0418b0(this);
        this.f1512i = new C0890k();
        C0481m mVar = new C0481m(this);
        this.f1513j = mVar;
        mVar.mo2155c(attributeSet, i);
        mo2128b(mVar);
    }

    /* renamed from: a */
    public C0769c mo2127a(C0769c cVar) {
        return this.f1512i.mo2952a(this, cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2128b(C0481m mVar) {
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
        C0444e eVar = this.f1509f;
        if (eVar != null) {
            eVar.mo1929b();
        }
        C0429c0 c0Var = this.f1510g;
        if (c0Var != null) {
            c0Var.mo1810b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C0883j.m3649m(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0444e eVar = this.f1509f;
        if (eVar != null) {
            return eVar.mo1930c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0444e eVar = this.f1509f;
        if (eVar != null) {
            return eVar.mo1931d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1510g.mo1817j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1510g.mo1818k();
    }

    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f1511h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L_0x0010
            androidx.appcompat.widget.b0 r0 = r2.f1511h
            if (r0 != 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            android.view.textclassifier.TextClassifier r0 = r0.mo1790a()
            return r0
        L_0x0010:
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0477l.getTextClassifier():android.view.textclassifier.TextClassifier");
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] t;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1510g.mo1825r(this, onCreateInputConnection, editorInfo);
        InputConnection a = C0495o.m2042a(onCreateInputConnection, editorInfo, this);
        if (!(a == null || Build.VERSION.SDK_INT > 30 || (t = C0833y.m3364t(this)) == null)) {
            C3994a.m26224d(editorInfo, t);
            a = C3997c.m26233c(this, a, editorInfo);
        }
        return this.f1513j.mo2156d(a, editorInfo);
    }

    public boolean onDragEvent(DragEvent dragEvent) {
        if (C0530x.m2162a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public boolean onTextContextMenuItem(int i) {
        if (C0530x.m2163b(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0444e eVar = this.f1509f;
        if (eVar != null) {
            eVar.mo1933f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0444e eVar = this.f1509f;
        if (eVar != null) {
            eVar.mo1934g(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0429c0 c0Var = this.f1510g;
        if (c0Var != null) {
            c0Var.mo1823p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0429c0 c0Var = this.f1510g;
        if (c0Var != null) {
            c0Var.mo1823p();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0883j.m3650n(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f1513j.mo2157e(z);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1513j.mo2153a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0444e eVar = this.f1509f;
        if (eVar != null) {
            eVar.mo1936i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0444e eVar = this.f1509f;
        if (eVar != null) {
            eVar.mo1937j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1510g.mo1830w(colorStateList);
        this.f1510g.mo1810b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1510g.mo1831x(mode);
        this.f1510g.mo1810b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0429c0 c0Var = this.f1510g;
        if (c0Var != null) {
            c0Var.mo1824q(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C0418b0 b0Var;
        if (Build.VERSION.SDK_INT >= 28 || (b0Var = this.f1511h) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            b0Var.mo1791b(textClassifier);
        }
    }
}
