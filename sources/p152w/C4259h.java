package p152w;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.C0911e;

/* renamed from: w.h */
class C4259h implements TransformationMethod {

    /* renamed from: f */
    private final TransformationMethod f22546f;

    C4259h(TransformationMethod transformationMethod) {
        this.f22546f = transformationMethod;
    }

    /* renamed from: a */
    public TransformationMethod mo15819a() {
        return this.f22546f;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f22546f;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || C0911e.m3726b().mo3113d() != 1) ? charSequence : C0911e.m3726b().mo3118o(charSequence);
    }

    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f22546f;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
