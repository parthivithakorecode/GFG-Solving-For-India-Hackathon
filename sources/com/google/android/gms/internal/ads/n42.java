package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

final class n42 implements nb3<SQLiteDatabase> {

    /* renamed from: a */
    final /* synthetic */ pv2 f11307a;

    n42(o42 o42, pv2 pv2) {
        this.f11307a = pv2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5436a(Object obj) {
        try {
            this.f11307a.mo6109c((SQLiteDatabase) obj);
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            io0.m11128d(valueOf.length() != 0 ? "Error executing function on offline buffered ping database: ".concat(valueOf) : new String("Error executing function on offline buffered ping database: "));
        }
    }

    /* renamed from: b */
    public final void mo5437b(Throwable th) {
        String valueOf = String.valueOf(th.getMessage());
        io0.m11128d(valueOf.length() != 0 ? "Failed to get offline buffered ping database: ".concat(valueOf) : new String("Failed to get offline buffered ping database: "));
    }
}
