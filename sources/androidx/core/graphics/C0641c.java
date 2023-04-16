package androidx.core.graphics;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import androidx.core.util.C0742d;

/* renamed from: androidx.core.graphics.c */
public final class C0641c {

    /* renamed from: a */
    private static final ThreadLocal<C0742d<Rect, Rect>> f1952a = new ThreadLocal<>();

    /* renamed from: androidx.core.graphics.c$a */
    static class C0642a {
        /* renamed from: a */
        static boolean m2627a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    /* renamed from: a */
    public static boolean m2625a(Paint paint, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C0642a.m2627a(paint, str);
        }
        int length = str.length();
        if (length == 1 && Character.isWhitespace(str.charAt(0))) {
            return true;
        }
        float measureText = paint.measureText("󟿽");
        float measureText2 = paint.measureText("m");
        float measureText3 = paint.measureText(str);
        float f = 0.0f;
        if (measureText3 == 0.0f) {
            return false;
        }
        if (str.codePointCount(0, str.length()) > 1) {
            if (measureText3 > measureText2 * 2.0f) {
                return false;
            }
            int i = 0;
            while (i < length) {
                int charCount = Character.charCount(str.codePointAt(i)) + i;
                f += paint.measureText(str, i, charCount);
                i = charCount;
            }
            if (measureText3 >= f) {
                return false;
            }
        }
        if (measureText3 != measureText) {
            return true;
        }
        C0742d<Rect, Rect> b = m2626b();
        paint.getTextBounds("󟿽", 0, 2, (Rect) b.f2120a);
        paint.getTextBounds(str, 0, length, (Rect) b.f2121b);
        return !((Rect) b.f2120a).equals(b.f2121b);
    }

    /* renamed from: b */
    private static C0742d<Rect, Rect> m2626b() {
        ThreadLocal<C0742d<Rect, Rect>> threadLocal = f1952a;
        C0742d<Rect, Rect> dVar = threadLocal.get();
        if (dVar == null) {
            C0742d<Rect, Rect> dVar2 = new C0742d<>(new Rect(), new Rect());
            threadLocal.set(dVar2);
            return dVar2;
        }
        ((Rect) dVar.f2120a).setEmpty();
        ((Rect) dVar.f2121b).setEmpty();
        return dVar;
    }
}
