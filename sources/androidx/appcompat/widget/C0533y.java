package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p038f.C2582a;

/* renamed from: androidx.appcompat.widget.y */
public class C0533y extends SeekBar {

    /* renamed from: f */
    private final C0535z f1689f;

    public C0533y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2582a.seekBarStyle);
    }

    public C0533y(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0527v0.m2156a(this, getContext());
        C0535z zVar = new C0535z(this);
        this.f1689f = zVar;
        zVar.mo2335c(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1689f.mo2378h();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1689f.mo2379i();
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1689f.mo2377g(canvas);
    }
}
