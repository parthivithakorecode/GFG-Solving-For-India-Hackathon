package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

final class m32 implements nb3<SQLiteDatabase> {

    /* renamed from: a */
    final /* synthetic */ pv2 f10707a;

    m32(n32 n32, pv2 pv2) {
        this.f10707a = pv2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5436a(Object obj) {
        try {
            this.f10707a.mo6109c((SQLiteDatabase) obj);
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            io0.m11128d(valueOf.length() != 0 ? "Error executing function on offline signal database: ".concat(valueOf) : new String("Error executing function on offline signal database: "));
        }
    }

    /* renamed from: b */
    public final void mo5437b(Throwable th) {
        String valueOf = String.valueOf(th.getMessage());
        io0.m11128d(valueOf.length() != 0 ? "Failed to get offline signal database: ".concat(valueOf) : new String("Failed to get offline signal database: "));
    }
}
