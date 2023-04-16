package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.C0880i;
import p038f.C2591j;

/* renamed from: androidx.appcompat.widget.t */
class C0516t extends PopupWindow {

    /* renamed from: b */
    private static final boolean f1626b = (Build.VERSION.SDK_INT < 21);

    /* renamed from: a */
    private boolean f1627a;

    public C0516t(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m2116a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m2116a(Context context, AttributeSet attributeSet, int i, int i2) {
        C0415a1 u = C0415a1.m1660u(context, attributeSet, C2591j.f18802Y1, i, i2);
        int i3 = C2591j.f18811a2;
        if (u.mo1783r(i3)) {
            m2117b(u.mo1766a(i3, false));
        }
        setBackgroundDrawable(u.mo1771f(C2591j.f18806Z1));
        u.mo1784v();
    }

    /* renamed from: b */
    private void m2117b(boolean z) {
        if (f1626b) {
            this.f1627a = z;
        } else {
            C0880i.m3629a(this, z);
        }
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (f1626b && this.f1627a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f1626b && this.f1627a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        if (f1626b && this.f1627a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}
