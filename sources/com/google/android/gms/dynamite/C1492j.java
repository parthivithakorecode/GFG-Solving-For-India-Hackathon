package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.j */
final class C1492j implements DynamiteModule.C1482b {
    C1492j() {
    }

    /* renamed from: a */
    public final C1496n mo5026a(Context context, String str, C1495m mVar) {
        C1496n nVar = new C1496n();
        int b = mVar.mo5030b(context, str);
        nVar.f3812a = b;
        int i = 0;
        int a = b != 0 ? mVar.mo5029a(context, str, false) : mVar.mo5029a(context, str, true);
        nVar.f3813b = a;
        int i2 = nVar.f3812a;
        if (i2 != 0) {
            i = i2;
        } else if (a == 0) {
            nVar.f3814c = 0;
            return nVar;
        }
        if (a >= i) {
            nVar.f3814c = 1;
        } else {
            nVar.f3814c = -1;
        }
        return nVar;
    }
}
