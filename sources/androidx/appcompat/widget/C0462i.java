package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.core.graphics.drawable.C0650a;
import androidx.core.widget.C0865c;

/* renamed from: androidx.appcompat.widget.i */
class C0462i {

    /* renamed from: a */
    private final CheckedTextView f1462a;

    /* renamed from: b */
    private ColorStateList f1463b = null;

    /* renamed from: c */
    private PorterDuff.Mode f1464c = null;

    /* renamed from: d */
    private boolean f1465d = false;

    /* renamed from: e */
    private boolean f1466e = false;

    /* renamed from: f */
    private boolean f1467f;

    C0462i(CheckedTextView checkedTextView) {
        this.f1462a = checkedTextView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2036a() {
        Drawable a = C0865c.m3592a(this.f1462a);
        if (a == null) {
            return;
        }
        if (this.f1465d || this.f1466e) {
            Drawable mutate = C0650a.m2699p(a).mutate();
            if (this.f1465d) {
                C0650a.m2697n(mutate, this.f1463b);
            }
            if (this.f1466e) {
                C0650a.m2698o(mutate, this.f1464c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f1462a.getDrawableState());
            }
            this.f1462a.setCheckMarkDrawable(mutate);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ColorStateList mo2037b() {
        return this.f1463b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public PorterDuff.Mode mo2038c() {
        return this.f1464c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d A[SYNTHETIC, Splitter:B:12:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060 A[Catch:{ all -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071 A[Catch:{ all -> 0x0084 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2039d(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CheckedTextView r0 = r9.f1462a
            android.content.Context r0 = r0.getContext()
            int[] r3 = p038f.C2591j.f18765P0
            r8 = 0
            androidx.appcompat.widget.a1 r0 = androidx.appcompat.widget.C0415a1.m1660u(r0, r10, r3, r11, r8)
            android.widget.CheckedTextView r1 = r9.f1462a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.mo1782q()
            r7 = 0
            r4 = r10
            r6 = r11
            androidx.core.view.C0833y.m3328M(r1, r2, r3, r4, r5, r6, r7)
            int r10 = p038f.C2591j.f18773R0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo1783r(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x003a
            int r10 = r0.mo1778m(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x003a
            android.widget.CheckedTextView r11 = r9.f1462a     // Catch:{ NotFoundException -> 0x003a }
            android.content.Context r1 = r11.getContext()     // Catch:{ NotFoundException -> 0x003a }
            android.graphics.drawable.Drawable r10 = p045g.C2620a.m21330b(r1, r10)     // Catch:{ NotFoundException -> 0x003a }
            r11.setCheckMarkDrawable(r10)     // Catch:{ NotFoundException -> 0x003a }
            r10 = 1
            goto L_0x003b
        L_0x003a:
            r10 = r8
        L_0x003b:
            if (r10 != 0) goto L_0x0058
            int r10 = p038f.C2591j.f18769Q0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo1783r(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0058
            int r10 = r0.mo1778m(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x0058
            android.widget.CheckedTextView r11 = r9.f1462a     // Catch:{ all -> 0x0084 }
            android.content.Context r1 = r11.getContext()     // Catch:{ all -> 0x0084 }
            android.graphics.drawable.Drawable r10 = p045g.C2620a.m21330b(r1, r10)     // Catch:{ all -> 0x0084 }
            r11.setCheckMarkDrawable(r10)     // Catch:{ all -> 0x0084 }
        L_0x0058:
            int r10 = p038f.C2591j.f18777S0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo1783r(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0069
            android.widget.CheckedTextView r11 = r9.f1462a     // Catch:{ all -> 0x0084 }
            android.content.res.ColorStateList r10 = r0.mo1768c(r10)     // Catch:{ all -> 0x0084 }
            androidx.core.widget.C0865c.m3593b(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0069:
            int r10 = p038f.C2591j.f18781T0     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo1783r(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0080
            android.widget.CheckedTextView r11 = r9.f1462a     // Catch:{ all -> 0x0084 }
            r1 = -1
            int r10 = r0.mo1775j(r10, r1)     // Catch:{ all -> 0x0084 }
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.C0463i0.m1909d(r10, r1)     // Catch:{ all -> 0x0084 }
            androidx.core.widget.C0865c.m3594c(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0080:
            r0.mo1784v()
            return
        L_0x0084:
            r10 = move-exception
            r0.mo1784v()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0462i.mo2039d(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2040e() {
        if (this.f1467f) {
            this.f1467f = false;
            return;
        }
        this.f1467f = true;
        mo2036a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo2041f(ColorStateList colorStateList) {
        this.f1463b = colorStateList;
        this.f1465d = true;
        mo2036a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2042g(PorterDuff.Mode mode) {
        this.f1464c = mode;
        this.f1466e = true;
        mo2036a();
    }
}
