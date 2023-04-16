package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: androidx.core.graphics.drawable.f */
final class C0658f extends Drawable.ConstantState {

    /* renamed from: a */
    int f1980a;

    /* renamed from: b */
    Drawable.ConstantState f1981b;

    /* renamed from: c */
    ColorStateList f1982c = null;

    /* renamed from: d */
    PorterDuff.Mode f1983d = C0656d.f1972l;

    C0658f(C0658f fVar) {
        if (fVar != null) {
            this.f1980a = fVar.f1980a;
            this.f1981b = fVar.f1981b;
            this.f1982c = fVar.f1982c;
            this.f1983d = fVar.f1983d;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2651a() {
        return this.f1981b != null;
    }

    public int getChangingConfigurations() {
        int i = this.f1980a;
        Drawable.ConstantState constantState = this.f1981b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    public Drawable newDrawable() {
        return newDrawable((Resources) null);
    }

    public Drawable newDrawable(Resources resources) {
        return Build.VERSION.SDK_INT >= 21 ? new C0657e(this, resources) : new C0656d(this, resources);
    }
}
