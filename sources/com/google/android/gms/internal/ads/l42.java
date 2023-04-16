package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

public final /* synthetic */ class l42 implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ SQLiteDatabase f9887f;

    /* renamed from: g */
    public final /* synthetic */ String f9888g;

    /* renamed from: h */
    public final /* synthetic */ oo0 f9889h;

    public /* synthetic */ l42(SQLiteDatabase sQLiteDatabase, String str, oo0 oo0) {
        this.f9887f = sQLiteDatabase;
        this.f9888g = str;
        this.f9889h = oo0;
    }

    public final void run() {
        o42.m14282v(this.f9887f, this.f9888g, this.f9889h);
    }
}
