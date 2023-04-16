package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p038f.C2582a;

/* renamed from: androidx.appcompat.widget.w */
public class C0528w extends RatingBar {

    /* renamed from: f */
    private final C0522u f1684f;

    public C0528w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2582a.ratingBarStyle);
    }

    public C0528w(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0527v0.m2156a(this, getContext());
        C0522u uVar = new C0522u(this);
        this.f1684f = uVar;
        uVar.mo2335c(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap b = this.f1684f.mo2334b();
        if (b != null) {
            setMeasuredDimension(View.resolveSizeAndState(b.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
