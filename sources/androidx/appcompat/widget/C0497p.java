package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.core.view.C0831w;
import androidx.core.widget.C0896o;
import p038f.C2582a;

/* renamed from: androidx.appcompat.widget.p */
public class C0497p extends ImageButton implements C0831w, C0896o {

    /* renamed from: f */
    private final C0444e f1586f;

    /* renamed from: g */
    private final C0503q f1587g;

    /* renamed from: h */
    private boolean f1588h;

    public C0497p(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2582a.imageButtonStyle);
    }

    public C0497p(Context context, AttributeSet attributeSet, int i) {
        super(C0532x0.m2168b(context), attributeSet, i);
        this.f1588h = false;
        C0527v0.m2156a(this, getContext());
        C0444e eVar = new C0444e(this);
        this.f1586f = eVar;
        eVar.mo1932e(attributeSet, i);
        C0503q qVar = new C0503q(this);
        this.f1587g = qVar;
        qVar.mo2261g(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0444e eVar = this.f1586f;
        if (eVar != null) {
            eVar.mo1929b();
        }
        C0503q qVar = this.f1587g;
        if (qVar != null) {
            qVar.mo2257c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0444e eVar = this.f1586f;
        if (eVar != null) {
            return eVar.mo1930c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0444e eVar = this.f1586f;
        if (eVar != null) {
            return eVar.mo1931d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0503q qVar = this.f1587g;
        if (qVar != null) {
            return qVar.mo2258d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0503q qVar = this.f1587g;
        if (qVar != null) {
            return qVar.mo2259e();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f1587g.mo2260f() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0444e eVar = this.f1586f;
        if (eVar != null) {
            eVar.mo1933f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0444e eVar = this.f1586f;
        if (eVar != null) {
            eVar.mo1934g(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0503q qVar = this.f1587g;
        if (qVar != null) {
            qVar.mo2257c();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        C0503q qVar = this.f1587g;
        if (!(qVar == null || drawable == null || this.f1588h)) {
            qVar.mo2262h(drawable);
        }
        super.setImageDrawable(drawable);
        C0503q qVar2 = this.f1587g;
        if (qVar2 != null) {
            qVar2.mo2257c();
            if (!this.f1588h) {
                this.f1587g.mo2256b();
            }
        }
    }

    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f1588h = true;
    }

    public void setImageResource(int i) {
        this.f1587g.mo2263i(i);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0503q qVar = this.f1587g;
        if (qVar != null) {
            qVar.mo2257c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0444e eVar = this.f1586f;
        if (eVar != null) {
            eVar.mo1936i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0444e eVar = this.f1586f;
        if (eVar != null) {
            eVar.mo1937j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0503q qVar = this.f1587g;
        if (qVar != null) {
            qVar.mo2264j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0503q qVar = this.f1587g;
        if (qVar != null) {
            qVar.mo2265k(mode);
        }
    }
}
