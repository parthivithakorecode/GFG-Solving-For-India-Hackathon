package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.f */
final class C1488f implements DynamiteModule.C1482b {
    C1488f() {
    }

    /* renamed from: a */
    public final C1496n mo5026a(Context context, String str, C1495m mVar) {
        C1496n nVar = new C1496n();
        int a = mVar.mo5029a(context, str, false);
        nVar.f3813b = a;
        if (a == 0) {
            nVar.f3814c = 0;
        } else {
            nVar.f3814c = 1;
        }
        return nVar;
    }
}
