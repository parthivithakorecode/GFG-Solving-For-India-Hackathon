package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public final class xd2 implements ij2<yd2> {

    /* renamed from: a */
    private final ij2<nj2> f17141a;

    /* renamed from: b */
    private final ks2 f17142b;

    /* renamed from: c */
    private final Context f17143c;

    /* renamed from: d */
    private final tn0 f17144d;

    public xd2(nf2<nj2> nf2, ks2 ks2, Context context, tn0 tn0) {
        this.f17141a = nf2;
        this.f17142b = ks2;
        this.f17143c = context;
        this.f17144d = tn0;
    }

    /* renamed from: a */
    public final cc3<yd2> mo5813a() {
        return rb3.m16135m(this.f17141a.mo5813a(), new wd2(this), wo0.f16891f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ yd2 mo11805b(nj2 nj2) {
        boolean z;
        String str;
        int i;
        int i2;
        float f;
        String str2;
        int i3;
        DisplayMetrics displayMetrics;
        C2087pv pvVar = this.f17142b.f9640e;
        C2087pv[] pvVarArr = pvVar.f12810l;
        if (pvVarArr != null) {
            str = null;
            boolean z2 = false;
            boolean z3 = false;
            z = false;
            for (C2087pv pvVar2 : pvVarArr) {
                boolean z4 = pvVar2.f12812n;
                if (!z4 && !z2) {
                    str = pvVar2.f12804f;
                    z2 = true;
                }
                if (z4) {
                    if (!z3) {
                        z3 = true;
                        z = true;
                    } else {
                        z3 = true;
                    }
                }
                if (z2 && z3) {
                    break;
                }
            }
        } else {
            str = pvVar.f12804f;
            z = pvVar.f12812n;
        }
        Resources resources = this.f17143c.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            str2 = null;
            f = 0.0f;
            i2 = 0;
            i = 0;
        } else {
            float f2 = displayMetrics.density;
            int i4 = displayMetrics.widthPixels;
            i = displayMetrics.heightPixels;
            str2 = this.f17144d.mo11025h().mo14090k();
            i2 = i4;
            f = f2;
        }
        StringBuilder sb = new StringBuilder();
        C2087pv[] pvVarArr2 = pvVar.f12810l;
        if (pvVarArr2 != null) {
            boolean z5 = false;
            for (C2087pv pvVar3 : pvVarArr2) {
                if (pvVar3.f12812n) {
                    z5 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    int i5 = pvVar3.f12808j;
                    if (i5 == -1) {
                        i5 = f != 0.0f ? (int) (((float) pvVar3.f12809k) / f) : -1;
                    }
                    sb.append(i5);
                    sb.append("x");
                    int i6 = pvVar3.f12805g;
                    if (i6 == -2) {
                        i6 = f != 0.0f ? (int) (((float) pvVar3.f12806h) / f) : -2;
                    }
                    sb.append(i6);
                }
            }
            if (z5) {
                if (sb.length() != 0) {
                    i3 = 0;
                    sb.insert(0, "|");
                } else {
                    i3 = 0;
                }
                sb.insert(i3, "320x50");
            }
        }
        return new yd2(pvVar, str, z, sb.toString(), f, i2, i, str2, this.f17142b.f9651p);
    }
}
