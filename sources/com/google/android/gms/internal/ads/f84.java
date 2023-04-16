package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

public final class f84 extends kp0 {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f6750k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f6751l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f6752m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f6753n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f6754o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final SparseArray<Map<hm0, h84>> f6755p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final SparseBooleanArray f6756q;

    @Deprecated
    public f84() {
        this.f6755p = new SparseArray<>();
        this.f6756q = new SparseBooleanArray();
        m9060u();
    }

    public f84(Context context) {
        super.mo8726d(context);
        Point d0 = n13.m13629d0(context);
        mo7260e(d0.x, d0.y, true);
        this.f6755p = new SparseArray<>();
        this.f6756q = new SparseBooleanArray();
        m9060u();
    }

    /* synthetic */ f84(d84 d84, e84 e84) {
        super(d84);
        this.f6750k = d84.f5698C;
        this.f6751l = d84.f5700E;
        this.f6752m = d84.f5701F;
        this.f6753n = d84.f5705J;
        this.f6754o = d84.f5707L;
        SparseArray a = d84.f5708M;
        SparseArray<Map<hm0, h84>> sparseArray = new SparseArray<>();
        for (int i = 0; i < a.size(); i++) {
            sparseArray.put(a.keyAt(i), new HashMap((Map) a.valueAt(i)));
        }
        this.f6755p = sparseArray;
        this.f6756q = d84.f5709N.clone();
    }

    /* renamed from: u */
    private final void m9060u() {
        this.f6750k = true;
        this.f6751l = true;
        this.f6752m = true;
        this.f6753n = true;
        this.f6754o = true;
    }

    /* renamed from: e */
    public final /* synthetic */ kp0 mo7260e(int i, int i2, boolean z) {
        super.mo7260e(i, i2, true);
        return this;
    }

    /* renamed from: o */
    public final f84 mo7261o(int i, boolean z) {
        if (this.f6756q.get(i) == z) {
            return this;
        }
        if (z) {
            this.f6756q.put(i, true);
        } else {
            this.f6756q.delete(i);
        }
        return this;
    }
}
