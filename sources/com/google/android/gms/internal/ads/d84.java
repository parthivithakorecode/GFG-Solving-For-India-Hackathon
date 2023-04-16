package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;

public final class d84 extends ns0 {

    /* renamed from: O */
    public static final d84 f5694O;
    @Deprecated

    /* renamed from: P */
    public static final d84 f5695P;

    /* renamed from: Q */
    public static final my3<d84> f5696Q = b84.f4796a;

    /* renamed from: B */
    public final int f5697B;

    /* renamed from: C */
    public final boolean f5698C;

    /* renamed from: D */
    public final boolean f5699D;

    /* renamed from: E */
    public final boolean f5700E;

    /* renamed from: F */
    public final boolean f5701F;

    /* renamed from: G */
    public final boolean f5702G;

    /* renamed from: H */
    public final boolean f5703H;

    /* renamed from: I */
    public final boolean f5704I;

    /* renamed from: J */
    public final boolean f5705J;

    /* renamed from: K */
    public final boolean f5706K;

    /* renamed from: L */
    public final boolean f5707L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public final SparseArray<Map<hm0, h84>> f5708M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public final SparseBooleanArray f5709N;

    static {
        d84 d84 = new d84(new f84());
        f5694O = d84;
        f5695P = d84;
    }

    private d84(f84 f84) {
        super(f84);
        this.f5698C = f84.f6750k;
        this.f5699D = false;
        this.f5700E = f84.f6751l;
        this.f5701F = f84.f6752m;
        this.f5702G = false;
        this.f5703H = false;
        this.f5704I = false;
        this.f5697B = 0;
        this.f5705J = f84.f6753n;
        this.f5706K = false;
        this.f5707L = f84.f6754o;
        this.f5708M = f84.f6755p;
        this.f5709N = f84.f6756q;
    }

    /* renamed from: c */
    public static d84 m7768c(Context context) {
        return new d84(new f84(context));
    }

    /* renamed from: d */
    public final f84 mo6413d() {
        return new f84(this, (e84) null);
    }

    /* renamed from: e */
    public final h84 mo6414e(int i, hm0 hm0) {
        Map map = this.f5708M.get(i);
        if (map != null) {
            return (h84) map.get(hm0);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d84.class == obj.getClass()) {
            d84 d84 = (d84) obj;
            if (super.equals(d84) && this.f5698C == d84.f5698C && this.f5700E == d84.f5700E && this.f5701F == d84.f5701F && this.f5705J == d84.f5705J && this.f5707L == d84.f5707L) {
                SparseBooleanArray sparseBooleanArray = this.f5709N;
                SparseBooleanArray sparseBooleanArray2 = d84.f5709N;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray<Map<hm0, h84>> sparseArray = this.f5708M;
                            SparseArray<Map<hm0, h84>> sparseArray2 = d84.f5708M;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                int i2 = 0;
                                while (i2 < size2) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map valueAt = sparseArray.valueAt(i2);
                                        Map valueAt2 = sparseArray2.valueAt(indexOfKey);
                                        if (valueAt2.size() == valueAt.size()) {
                                            for (Map.Entry entry : valueAt.entrySet()) {
                                                hm0 hm0 = (hm0) entry.getKey();
                                                if (valueAt2.containsKey(hm0)) {
                                                    if (!n13.m13643p(entry.getValue(), valueAt2.get(hm0))) {
                                                    }
                                                }
                                            }
                                            i2++;
                                        }
                                    }
                                }
                                return true;
                            }
                        } else if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo6416f(int i) {
        return this.f5709N.get(i);
    }

    /* renamed from: g */
    public final boolean mo6417g(int i, hm0 hm0) {
        Map map = this.f5708M.get(i);
        return map != null && map.containsKey(hm0);
    }

    public final int hashCode() {
        return ((((((((((super.hashCode() + 31) * 31) + (this.f5698C ? 1 : 0)) * 961) + (this.f5700E ? 1 : 0)) * 31) + (this.f5701F ? 1 : 0)) * 28629151) + (this.f5705J ? 1 : 0)) * 961) + (this.f5707L ? 1 : 0);
    }
}
