package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.appcompat.widget.b */
class C0416b extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f1321a;

    /* renamed from: androidx.appcompat.widget.b$a */
    private static class C0417a {
        /* renamed from: a */
        public static void m1680a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public C0416b(ActionBarContainer actionBarContainer) {
        this.f1321a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f1321a;
        if (actionBarContainer.f1060m) {
            Drawable drawable = actionBarContainer.f1059l;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1057j;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f1321a;
        Drawable drawable3 = actionBarContainer2.f1058k;
        if (drawable3 != null && actionBarContainer2.f1061n) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f1321a;
        if (!actionBarContainer.f1060m) {
            drawable = actionBarContainer.f1057j;
            if (drawable == null) {
                return;
            }
        } else if (actionBarContainer.f1059l != null) {
            drawable = actionBarContainer.f1057j;
        } else {
            return;
        }
        C0417a.m1680a(drawable, outline);
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
