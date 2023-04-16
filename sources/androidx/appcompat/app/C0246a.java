package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.C0299b;
import p038f.C2591j;

/* renamed from: androidx.appcompat.app.a */
public abstract class C0246a {

    /* renamed from: androidx.appcompat.app.a$a */
    public static class C0247a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f556a;

        public C0247a(int i, int i2) {
            super(i, i2);
            this.f556a = 0;
            this.f556a = 8388627;
        }

        public C0247a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f556a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2591j.f18903t);
            this.f556a = obtainStyledAttributes.getInt(C2591j.f18908u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0247a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f556a = 0;
        }

        public C0247a(C0247a aVar) {
            super(aVar);
            this.f556a = 0;
            this.f556a = aVar.f556a;
        }
    }

    /* renamed from: androidx.appcompat.app.a$b */
    public interface C0248b {
        /* renamed from: a */
        void mo610a(boolean z);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.a$c */
    public static abstract class C0249c {
        /* renamed from: a */
        public abstract CharSequence mo611a();

        /* renamed from: b */
        public abstract View mo612b();

        /* renamed from: c */
        public abstract Drawable mo613c();

        /* renamed from: d */
        public abstract CharSequence mo614d();

        /* renamed from: e */
        public abstract void mo615e();
    }

    /* renamed from: f */
    public boolean mo595f() {
        return false;
    }

    /* renamed from: g */
    public abstract boolean mo596g();

    /* renamed from: h */
    public abstract void mo597h(boolean z);

    /* renamed from: i */
    public abstract int mo598i();

    /* renamed from: j */
    public abstract Context mo599j();

    /* renamed from: k */
    public boolean mo600k() {
        return false;
    }

    /* renamed from: l */
    public abstract void mo601l(Configuration configuration);

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo602m() {
    }

    /* renamed from: n */
    public abstract boolean mo603n(int i, KeyEvent keyEvent);

    /* renamed from: o */
    public boolean mo604o(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: p */
    public boolean mo605p() {
        return false;
    }

    /* renamed from: q */
    public abstract void mo606q(boolean z);

    /* renamed from: r */
    public abstract void mo607r(boolean z);

    /* renamed from: s */
    public abstract void mo608s(CharSequence charSequence);

    /* renamed from: t */
    public abstract C0299b mo609t(C0299b.C0300a aVar);
}
