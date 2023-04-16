package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.C0650a;
import androidx.core.widget.C0869d;

/* renamed from: androidx.appcompat.widget.j */
class C0465j {

    /* renamed from: a */
    private final CompoundButton f1473a;

    /* renamed from: b */
    private ColorStateList f1474b = null;

    /* renamed from: c */
    private PorterDuff.Mode f1475c = null;

    /* renamed from: d */
    private boolean f1476d = false;

    /* renamed from: e */
    private boolean f1477e = false;

    /* renamed from: f */
    private boolean f1478f;

    C0465j(CompoundButton compoundButton) {
        this.f1473a = compoundButton;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2087a() {
        Drawable a = C0869d.m3599a(this.f1473a);
        if (a == null) {
            return;
        }
        if (this.f1476d || this.f1477e) {
            Drawable mutate = C0650a.m2699p(a).mutate();
            if (this.f1476d) {
                C0650a.m2697n(mutate, this.f1474b);
            }
            if (this.f1477e) {
                C0650a.m2698o(mutate, this.f1475c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f1473a.getDrawableState());
            }
            this.f1473a.setButtonDrawable(mutate);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = androidx.core.widget.C0869d.m3599a(r2.f1473a);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo2088b(int r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 >= r1) goto L_0x0013
            android.widget.CompoundButton r0 = r2.f1473a
            android.graphics.drawable.Drawable r0 = androidx.core.widget.C0869d.m3599a(r0)
            if (r0 == 0) goto L_0x0013
            int r0 = r0.getIntrinsicWidth()
            int r3 = r3 + r0
        L_0x0013:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0465j.mo2088b(int):int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList mo2089c() {
        return this.f1474b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode mo2090d() {
        return this.f1475c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d A[SYNTHETIC, Splitter:B:12:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060 A[Catch:{ all -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071 A[Catch:{ all -> 0x0084 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2091e(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.f1473a
            android.content.Context r0 = r0.getContext()
            int[] r3 = p038f.C2591j.f18785U0
            r8 = 0
            androidx.appcompat.widget.a1 r0 = androidx.appcompat.widget.C0415a1.m1660u(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.f1473a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.mo1782q()
            r7 = 0
            r4 = r10
            r6 = r11
            androidx.core.view.C0833y.m3328M(r1, r2, r3, r4, r5, r6, r7)
            int r10 = p038f.C2591j.f18793W0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo1783r(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x003a
            int r10 = r0.mo1778m(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x003a
            android.widget.CompoundButton r11 = r9.f1473a     // Catch:{ NotFoundException -> 0x003a }
            android.content.Context r1 = r11.getContext()     // Catch:{ NotFoundException -> 0x003a }
            android.graphics.drawable.Drawable r10 = p045g.C2620a.m21330b(r1, r10)     // Catch:{ NotFoundException -> 0x003a }
            r11.setButtonDrawable(r10)     // Catch:{ NotFoundException -> 0x003a }
            r10 = 1
            goto L_0x003b
        L_0x003a:
            r10 = r8
        L_0x003b:
            if (r10 != 0) goto L_0x0058
            int r10 = p038f.C2591j.f18789V0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo1783r(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0058
            int r10 = r0.mo1778m(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x0058
            android.widget.CompoundButton r11 = r9.f1473a     // Catch:{ all -> 0x0084 }
            android.content.Context r1 = r11.getContext()     // Catch:{ all -> 0x0084 }
            android.graphics.drawable.Drawable r10 = p045g.C2620a.m21330b(r1, r10)     // Catch:{ all -> 0x0084 }
            r11.setButtonDrawable(r10)     // Catch:{ all -> 0x0084 }
        L_0x0058:
            int r10 = p038f.C2591j.f18797X0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo1783r(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0069
            android.widget.CompoundButton r11 = r9.f1473a     // Catch:{ all -> 0x0084 }
            android.content.res.ColorStateList r10 = r0.mo1768c(r10)     // Catch:{ all -> 0x0084 }
            androidx.core.widget.C0869d.m3600b(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0069:
            int r10 = p038f.C2591j.f18801Y0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo1783r(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0080
            android.widget.CompoundButton r11 = r9.f1473a     // Catch:{ all -> 0x0084 }
            r1 = -1
            int r10 = r0.mo1775j(r10, r1)     // Catch:{ all -> 0x0084 }
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.C0463i0.m1909d(r10, r1)     // Catch:{ all -> 0x0084 }
            androidx.core.widget.C0869d.m3601c(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0080:
            r0.mo1784v()
            return
        L_0x0084:
            r10 = move-exception
            r0.mo1784v()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0465j.mo2091e(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo2092f() {
        if (this.f1478f) {
            this.f1478f = false;
            return;
        }
        this.f1478f = true;
        mo2087a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2093g(ColorStateList colorStateList) {
        this.f1474b = colorStateList;
        this.f1476d = true;
        mo2087a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2094h(PorterDuff.Mode mode) {
        this.f1475c = mode;
        this.f1477e = true;
        mo2087a();
    }
}
