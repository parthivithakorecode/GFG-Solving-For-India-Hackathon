package androidx.emoji2.text;

import android.os.Build;
import android.text.TextPaint;
import androidx.core.graphics.C0641c;
import androidx.emoji2.text.C0911e;

/* renamed from: androidx.emoji2.text.d */
class C0910d implements C0911e.C0916d {

    /* renamed from: b */
    private static final ThreadLocal<StringBuilder> f2375b = new ThreadLocal<>();

    /* renamed from: a */
    private final TextPaint f2376a;

    C0910d() {
        TextPaint textPaint = new TextPaint();
        this.f2376a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    /* renamed from: b */
    private static StringBuilder m3723b() {
        ThreadLocal<StringBuilder> threadLocal = f2375b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    /* renamed from: a */
    public boolean mo3111a(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 23 && i3 > i4) {
            return false;
        }
        StringBuilder b = m3723b();
        b.setLength(0);
        while (i < i2) {
            b.append(charSequence.charAt(i));
            i++;
        }
        return C0641c.m2625a(this.f2376a, b.toString());
    }
}
