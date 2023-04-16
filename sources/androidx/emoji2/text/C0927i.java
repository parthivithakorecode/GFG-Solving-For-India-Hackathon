package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.core.util.C0743e;

/* renamed from: androidx.emoji2.text.i */
public abstract class C0927i extends ReplacementSpan {

    /* renamed from: f */
    private final Paint.FontMetricsInt f2429f = new Paint.FontMetricsInt();

    /* renamed from: g */
    private final C0923g f2430g;

    /* renamed from: h */
    private short f2431h = -1;

    /* renamed from: i */
    private short f2432i = -1;

    /* renamed from: j */
    private float f2433j = 1.0f;

    C0927i(C0923g gVar) {
        C0743e.m2959g(gVar, "metadata cannot be null");
        this.f2430g = gVar;
    }

    /* renamed from: a */
    public final C0923g mo3152a() {
        return this.f2430g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo3153b() {
        return this.f2431h;
    }

    public int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f2429f);
        Paint.FontMetricsInt fontMetricsInt2 = this.f2429f;
        this.f2433j = (((float) Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent)) * 1.0f) / ((float) this.f2430g.mo3140e());
        this.f2432i = (short) ((int) (((float) this.f2430g.mo3140e()) * this.f2433j));
        short i3 = (short) ((int) (((float) this.f2430g.mo3143i()) * this.f2433j));
        this.f2431h = i3;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f2429f;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return i3;
    }
}
