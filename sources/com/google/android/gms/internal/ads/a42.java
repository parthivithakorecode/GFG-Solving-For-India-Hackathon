package com.google.android.gms.internal.ads;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

public final class a42 {
    /* renamed from: a */
    public static int m5819a(SQLiteDatabase sQLiteDatabase, int i) {
        int i2;
        Cursor d = m5822d(sQLiteDatabase, i);
        if (d.getCount() > 0) {
            d.moveToNext();
            i2 = d.getInt(d.getColumnIndexOrThrow("value"));
        } else {
            i2 = 0;
        }
        d.close();
        return i2;
    }

    /* renamed from: b */
    public static long m5820b(SQLiteDatabase sQLiteDatabase, int i) {
        long j;
        Cursor d = m5822d(sQLiteDatabase, 2);
        if (d.getCount() > 0) {
            d.moveToNext();
            j = d.getLong(d.getColumnIndexOrThrow("value"));
        } else {
            j = 0;
        }
        d.close();
        return j;
    }

    /* renamed from: c */
    public static ArrayList<C1900kt> m5821c(SQLiteDatabase sQLiteDatabase) {
        ArrayList<C1900kt> arrayList = new ArrayList<>();
        Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
        while (query.moveToNext()) {
            try {
                arrayList.add(C1900kt.m12388O(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (mq3 e) {
                io0.m11128d("Unable to deserialize proto from offline signals database:");
                io0.m11128d(e.getMessage());
            }
        }
        query.close();
        return arrayList;
    }

    /* renamed from: d */
    private static Cursor m5822d(SQLiteDatabase sQLiteDatabase, int i) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i == 0) {
            strArr2[0] = "failed_requests";
        } else if (i != 1) {
            strArr2[0] = "last_successful_request_time";
        } else {
            strArr2[0] = "total_requests";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, (String) null, (String) null, (String) null);
    }
}
