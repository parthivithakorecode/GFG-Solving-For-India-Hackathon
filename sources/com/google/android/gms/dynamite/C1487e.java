package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.e */
final class C1487e implements DynamiteModule.C1482b {
    C1487e() {
    }

    /* renamed from: a */
    public final C1496n mo5026a(Context context, String str, C1495m mVar) {
        C1496n nVar = new C1496n();
        int b = mVar.mo5030b(context, str);
        nVar.f3812a = b;
        if (b != 0) {
            nVar.f3814c = -1;
        } else {
            int a = mVar.mo5029a(context, str, true);
            nVar.f3813b = a;
            if (a != 0) {
                nVar.f3814c = 1;
            }
        }
        return nVar;
    }
}
