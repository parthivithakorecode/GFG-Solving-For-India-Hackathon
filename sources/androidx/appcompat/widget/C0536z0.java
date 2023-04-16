package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.z0 */
class C0536z0 extends C0513r0 {

    /* renamed from: b */
    private final WeakReference<Context> f1700b;

    public C0536z0(Context context, Resources resources) {
        super(resources);
        this.f1700b = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i) {
        Drawable a = mo2286a(i);
        Context context = (Context) this.f1700b.get();
        if (!(a == null || context == null)) {
            C0504q0.m2077h().mo2273x(context, i, a);
        }
        return a;
    }
}
