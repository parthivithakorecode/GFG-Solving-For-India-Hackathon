package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;

/* renamed from: androidx.emoji2.text.o */
public final class C0940o extends C0927i {

    /* renamed from: k */
    private static Paint f2459k;

    public C0940o(C0923g gVar) {
        super(gVar);
    }

    /* renamed from: c */
    private static Paint m3843c() {
        if (f2459k == null) {
            TextPaint textPaint = new TextPaint();
            f2459k = textPaint;
            textPaint.setColor(C0911e.m3726b().mo3112c());
            f2459k.setStyle(Paint.Style.FILL);
        }
        return f2459k;
    }

    public void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (C0911e.m3726b().mo3114i()) {
            canvas.drawRect(f, (float) i3, f + ((float) mo3153b()), (float) i5, m3843c());
        }
        mo3152a().mo3136a(canvas, f, (float) i4, paint);
    }
}
