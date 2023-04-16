package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import p054h1.C2694t;

public final /* synthetic */ class w32 implements pv2 {

    /* renamed from: a */
    public final /* synthetic */ x32 f16680a;

    /* renamed from: b */
    public final /* synthetic */ boolean f16681b;

    /* renamed from: c */
    public final /* synthetic */ ArrayList f16682c;

    /* renamed from: d */
    public final /* synthetic */ C1715ft f16683d;

    /* renamed from: e */
    public final /* synthetic */ C2048ot f16684e;

    public /* synthetic */ w32(x32 x32, boolean z, ArrayList arrayList, C1715ft ftVar, C2048ot otVar) {
        this.f16680a = x32;
        this.f16681b = z;
        this.f16682c = arrayList;
        this.f16683d = ftVar;
        this.f16684e = otVar;
    }

    /* renamed from: c */
    public final Object mo6109c(Object obj) {
        x32 x32 = this.f16680a;
        boolean z = this.f16681b;
        ArrayList arrayList = this.f16682c;
        C1715ft ftVar = this.f16683d;
        C2048ot otVar = this.f16684e;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (!x32.f17020b.f17586f.mo14078J()) {
            byte[] f = y32.m19833f(x32.f17020b, z, arrayList, ftVar, otVar);
            ContentValues contentValues = new ContentValues();
            contentValues.put("timestamp", Long.valueOf(C2694t.m21592a().mo12462a()));
            contentValues.put("serialized_proto_data", f);
            sQLiteDatabase.insert("offline_signal_contents", (String) null, contentValues);
            sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", new Object[]{"total_requests"}));
            if (!z) {
                sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", new Object[]{"failed_requests"}));
            }
        }
        return null;
    }
}
