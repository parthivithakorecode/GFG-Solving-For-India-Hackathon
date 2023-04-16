package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.i */
final class C1491i implements DynamiteModule.C1482b {
    C1491i() {
    }

    /* renamed from: a */
    public final C1496n mo5026a(Context context, String str, C1495m mVar) {
        C1496n nVar = new C1496n();
        nVar.f3812a = mVar.mo5030b(context, str);
        int a = mVar.mo5029a(context, str, true);
        nVar.f3813b = a;
        int i = nVar.f3812a;
        if (i == 0) {
            if (a == 0) {
                nVar.f3814c = 0;
                return nVar;
            }
            i = 0;
        }
        if (a >= i) {
            nVar.f3814c = 1;
        } else {
            nVar.f3814c = -1;
        }
        return nVar;
    }
}
