package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import p038f.C2591j;
import p152w.C4253f;

/* renamed from: androidx.appcompat.widget.n */
class C0484n {

    /* renamed from: a */
    private final TextView f1542a;

    /* renamed from: b */
    private final C4253f f1543b;

    C0484n(TextView textView) {
        this.f1542a = textView;
        this.f1543b = new C4253f(textView, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public InputFilter[] mo2198a(InputFilter[] inputFilterArr) {
        return this.f1543b.mo15806a(inputFilterArr);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2199b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f1542a.getContext().obtainStyledAttributes(attributeSet, C2591j.f18839g0, i, 0);
        try {
            int i2 = C2591j.f18909u0;
            boolean z = true;
            if (obtainStyledAttributes.hasValue(i2)) {
                z = obtainStyledAttributes.getBoolean(i2, true);
            }
            obtainStyledAttributes.recycle();
            mo2201d(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2200c(boolean z) {
        this.f1543b.mo15807b(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo2201d(boolean z) {
        this.f1543b.mo15808c(z);
    }
}
