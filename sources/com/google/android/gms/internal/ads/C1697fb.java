package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.fb */
public final class C1697fb extends C1660eb {
    protected C1697fb(Context context, String str, boolean z) {
        super(context, str, z);
    }

    /* renamed from: v */
    public static C1697fb m9093v(String str, Context context, boolean z) {
        C1660eb.m8415s(context, false);
        return new C1697fb(context, str, false);
    }

    @Deprecated
    /* renamed from: w */
    public static C1697fb m9094w(String str, Context context, boolean z, int i) {
        C1660eb.m8415s(context, z);
        return new C1697fb(context, str, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final List<Callable<Void>> mo6890q(C1735gc gcVar, Context context, C1842j8 j8Var, C1582c8 c8Var) {
        if (gcVar.mo7575k() == null || !this.f6154z) {
            return super.mo6890q(gcVar, context, j8Var, (C1582c8) null);
        }
        int a = gcVar.mo7566a();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.mo6890q(gcVar, context, j8Var, (C1582c8) null));
        arrayList.add(new C2328wc(gcVar, "pzhIFr8jSwvyB8FXK2qfBOfw0jXHNl6+dmbReaTm1jquB51r9sbZLlTA4zaBxZEm", "RbRyr5uGUYOSrOuNnmzV0kl42YeLvs7OFWbwh2MFm18=", j8Var, a, 24));
        return arrayList;
    }
}
