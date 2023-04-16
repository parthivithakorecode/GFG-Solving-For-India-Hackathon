package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.core.view.r */
public class C0826r {

    /* renamed from: a */
    private int f2262a;

    /* renamed from: b */
    private int f2263b;

    public C0826r(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public int mo2948a() {
        return this.f2262a | this.f2263b;
    }

    /* renamed from: b */
    public void mo2949b(View view, View view2, int i) {
        mo2950c(view, view2, i, 0);
    }

    /* renamed from: c */
    public void mo2950c(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.f2263b = i;
        } else {
            this.f2262a = i;
        }
    }

    /* renamed from: d */
    public void mo2951d(View view, int i) {
        if (i == 1) {
            this.f2263b = 0;
        } else {
            this.f2262a = 0;
        }
    }
}
