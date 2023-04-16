package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.graphics.C0659e;
import androidx.core.text.C0725d;
import androidx.core.view.C0831w;
import androidx.core.widget.C0864b;
import androidx.core.widget.C0883j;
import androidx.core.widget.C0895n;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p045g.C2620a;

/* renamed from: androidx.appcompat.widget.d0 */
public class C0441d0 extends TextView implements C0831w, C0895n, C0864b {

    /* renamed from: f */
    private final C0444e f1401f;

    /* renamed from: g */
    private final C0429c0 f1402g;

    /* renamed from: h */
    private final C0418b0 f1403h;

    /* renamed from: i */
    private C0484n f1404i;

    /* renamed from: j */
    private boolean f1405j;

    /* renamed from: k */
    private Future<C0725d> f1406k;

    public C0441d0(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0441d0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public C0441d0(Context context, AttributeSet attributeSet, int i) {
        super(C0532x0.m2168b(context), attributeSet, i);
        this.f1405j = false;
        C0527v0.m2156a(this, getContext());
        C0444e eVar = new C0444e(this);
        this.f1401f = eVar;
        eVar.mo1932e(attributeSet, i);
        C0429c0 c0Var = new C0429c0(this);
        this.f1402g = c0Var;
        c0Var.mo1820m(attributeSet, i);
        c0Var.mo1810b();
        this.f1403h = new C0418b0(this);
        getEmojiTextViewHelper().mo2199b(attributeSet, i);
    }

    /* renamed from: g */
    private void m1803g() {
        Future<C0725d> future = this.f1406k;
        if (future != null) {
            try {
                this.f1406k = null;
                C0883j.m3647k(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    private C0484n getEmojiTextViewHelper() {
        if (this.f1404i == null) {
            this.f1404i = new C0484n(this);
        }
        return this.f1404i;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0444e eVar = this.f1401f;
        if (eVar != null) {
            eVar.mo1929b();
        }
        C0429c0 c0Var = this.f1402g;
        if (c0Var != null) {
            c0Var.mo1810b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (C0864b.f2351a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0429c0 c0Var = this.f1402g;
        if (c0Var != null) {
            return c0Var.mo1812e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C0864b.f2351a) {
            return super.getAutoSizeMinTextSize();
        }
        C0429c0 c0Var = this.f1402g;
        if (c0Var != null) {
            return c0Var.mo1813f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C0864b.f2351a) {
            return super.getAutoSizeStepGranularity();
        }
        C0429c0 c0Var = this.f1402g;
        if (c0Var != null) {
            return c0Var.mo1814g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C0864b.f2351a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0429c0 c0Var = this.f1402g;
        return c0Var != null ? c0Var.mo1815h() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (C0864b.f2351a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0429c0 c0Var = this.f1402g;
        if (c0Var != null) {
            return c0Var.mo1816i();
        }
        return 0;
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C0883j.m3649m(super.getCustomSelectionActionModeCallback());
    }

    public int getFirstBaselineToTopHeight() {
        return C0883j.m3637a(this);
    }

    public int getLastBaselineToBottomHeight() {
        return C0883j.m3638b(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0444e eVar = this.f1401f;
        if (eVar != null) {
            return eVar.mo1930c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0444e eVar = this.f1401f;
        if (eVar != null) {
            return eVar.mo1931d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1402g.mo1817j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1402g.mo1818k();
    }

    public CharSequence getText() {
        m1803g();
        return super.getText();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f1403h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L_0x0010
            androidx.appcompat.widget.b0 r0 = r2.f1403h
            if (r0 != 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            android.view.textclassifier.TextClassifier r0 = r0.mo1790a()
            return r0
        L_0x0010:
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0441d0.getTextClassifier():android.view.textclassifier.TextClassifier");
    }

    public C0725d.C0726a getTextMetricsParamsCompat() {
        return C0883j.m3641e(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1402g.mo1825r(this, onCreateInputConnection, editorInfo);
        return C0495o.m2042a(onCreateInputConnection, editorInfo, this);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0429c0 c0Var = this.f1402g;
        if (c0Var != null) {
            c0Var.mo1822o(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        m1803g();
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0429c0 c0Var = this.f1402g;
        if (c0Var != null && !C0864b.f2351a && c0Var.mo1819l()) {
            this.f1402g.mo1811c();
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
        C0429c0 c0Var = this.f1402g;
        if (c0Var != null) {
            c0Var.mo1827t(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (C0864b.f2351a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0429c0 c0Var = this.f1402g;
        if (c0Var != null) {
            c0Var.mo1828u(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C0864b.f2351a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0429c0 c0Var = this.f1402g;
        if (c0Var != null) {
            c0Var.mo1829v(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0444e eVar = this.f1401f;
        if (eVar != null) {
            eVar.mo1933f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0444e eVar = this.f1401f;
        if (eVar != null) {
            eVar.mo1934g(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0429c0 c0Var = this.f1402g;
        if (c0Var != null) {
            c0Var.mo1823p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0429c0 c0Var = this.f1402g;
        if (c0Var != null) {
            c0Var.mo1823p();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b = i != 0 ? C2620a.m21330b(context, i) : null;
        Drawable b2 = i2 != 0 ? C2620a.m21330b(context, i2) : null;
        Drawable b3 = i3 != 0 ? C2620a.m21330b(context, i3) : null;
        if (i4 != 0) {
            drawable = C2620a.m21330b(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(b, b2, b3, drawable);
        C0429c0 c0Var = this.f1402g;
        if (c0Var != null) {
            c0Var.mo1823p();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0429c0 c0Var = this.f1402g;
        if (c0Var != null) {
            c0Var.mo1823p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b = i != 0 ? C2620a.m21330b(context, i) : null;
        Drawable b2 = i2 != 0 ? C2620a.m21330b(context, i2) : null;
        Drawable b3 = i3 != 0 ? C2620a.m21330b(context, i3) : null;
        if (i4 != 0) {
            drawable = C2620a.m21330b(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(b, b2, b3, drawable);
        C0429c0 c0Var = this.f1402g;
        if (c0Var != null) {
            c0Var.mo1823p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0429c0 c0Var = this.f1402g;
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

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().mo2198a(inputFilterArr));
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C0883j.m3644h(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C0883j.m3645i(this, i);
        }
    }

    public void setLineHeight(int i) {
        C0883j.m3646j(this, i);
    }

    public void setPrecomputedText(C0725d dVar) {
        C0883j.m3647k(this, dVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0444e eVar = this.f1401f;
        if (eVar != null) {
            eVar.mo1936i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0444e eVar = this.f1401f;
        if (eVar != null) {
            eVar.mo1937j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1402g.mo1830w(colorStateList);
        this.f1402g.mo1810b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1402g.mo1831x(mode);
        this.f1402g.mo1810b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0429c0 c0Var = this.f1402g;
        if (c0Var != null) {
            c0Var.mo1824q(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C0418b0 b0Var;
        if (Build.VERSION.SDK_INT >= 28 || (b0Var = this.f1403h) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            b0Var.mo1791b(textClassifier);
        }
    }

    public void setTextFuture(Future<C0725d> future) {
        this.f1406k = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C0725d.C0726a aVar) {
        C0883j.m3648l(this, aVar);
    }

    public void setTextSize(int i, float f) {
        if (C0864b.f2351a) {
            super.setTextSize(i, f);
            return;
        }
        C0429c0 c0Var = this.f1402g;
        if (c0Var != null) {
            c0Var.mo1809A(i, f);
        }
    }

    public void setTypeface(Typeface typeface, int i) {
        if (!this.f1405j) {
            Typeface typeface2 = null;
            if (typeface != null && i > 0) {
                typeface2 = C0659e.m2727a(getContext(), typeface, i);
            }
            this.f1405j = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i);
            } finally {
                this.f1405j = false;
            }
        }
    }
}
