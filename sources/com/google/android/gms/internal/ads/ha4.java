package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public final class ha4 {

    /* renamed from: g */
    private static final Comparator<ga4> f8135g = da4.f5720f;

    /* renamed from: h */
    private static final Comparator<ga4> f8136h = ea4.f6146f;

    /* renamed from: a */
    private final ArrayList<ga4> f8137a = new ArrayList<>();

    /* renamed from: b */
    private final ga4[] f8138b = new ga4[5];

    /* renamed from: c */
    private int f8139c = -1;

    /* renamed from: d */
    private int f8140d;

    /* renamed from: e */
    private int f8141e;

    /* renamed from: f */
    private int f8142f;

    public ha4(int i) {
    }

    /* renamed from: a */
    public final float mo7901a(float f) {
        if (this.f8139c != 0) {
            Collections.sort(this.f8137a, f8136h);
            this.f8139c = 0;
        }
        float f2 = ((float) this.f8141e) * 0.5f;
        int i = 0;
        for (int i2 = 0; i2 < this.f8137a.size(); i2++) {
            ga4 ga4 = this.f8137a.get(i2);
            i += ga4.f7341b;
            if (((float) i) >= f2) {
                return ga4.f7342c;
            }
        }
        if (this.f8137a.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<ga4> arrayList = this.f8137a;
        return arrayList.get(arrayList.size() - 1).f7342c;
    }

    /* renamed from: b */
    public final void mo7902b(int i, float f) {
        ga4 ga4;
        int i2;
        ga4 ga42;
        int i3;
        if (this.f8139c != 1) {
            Collections.sort(this.f8137a, f8135g);
            this.f8139c = 1;
        }
        int i4 = this.f8142f;
        if (i4 > 0) {
            ga4[] ga4Arr = this.f8138b;
            int i5 = i4 - 1;
            this.f8142f = i5;
            ga4 = ga4Arr[i5];
        } else {
            ga4 = new ga4((fa4) null);
        }
        int i6 = this.f8140d;
        this.f8140d = i6 + 1;
        ga4.f7340a = i6;
        ga4.f7341b = i;
        ga4.f7342c = f;
        this.f8137a.add(ga4);
        int i7 = this.f8141e + i;
        while (true) {
            this.f8141e = i7;
            while (true) {
                int i8 = this.f8141e;
                if (i8 > 2000) {
                    i2 = i8 - 2000;
                    ga42 = this.f8137a.get(0);
                    i3 = ga42.f7341b;
                    if (i3 > i2) {
                        break;
                    }
                    this.f8141e -= i3;
                    this.f8137a.remove(0);
                    int i9 = this.f8142f;
                    if (i9 < 5) {
                        ga4[] ga4Arr2 = this.f8138b;
                        this.f8142f = i9 + 1;
                        ga4Arr2[i9] = ga42;
                    }
                } else {
                    return;
                }
            }
            ga42.f7341b = i3 - i2;
            i7 = this.f8141e - i2;
        }
    }

    /* renamed from: c */
    public final void mo7903c() {
        this.f8137a.clear();
        this.f8139c = -1;
        this.f8140d = 0;
        this.f8141e = 0;
    }
}
