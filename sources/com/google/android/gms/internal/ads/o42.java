package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import p048g2.C2637b;
import p054h1.C2694t;
import p069j1.C3163g2;
import p069j1.C3202r1;
import p069j1.C3219x0;

public final class o42 extends SQLiteOpenHelper {

    /* renamed from: f */
    private final Context f11881f;

    /* renamed from: g */
    private final dc3 f11882g;

    public o42(Context context, dc3 dc3) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) C2199sw.m17001c().mo8579b(m10.f10511h6)).intValue());
        this.f11881f = context;
        this.f11882g = dc3;
    }

    /* renamed from: B */
    static final void m14279B(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public static void m14280C(SQLiteDatabase sQLiteDatabase, oo0 oo0) {
        sQLiteDatabase.beginTransaction();
        try {
            StringBuilder sb = new StringBuilder(25);
            sb.append("event_state = ");
            sb.append(1);
            Cursor query = sQLiteDatabase.query("offline_buffered_pings", new String[]{"url"}, sb.toString(), (String[]) null, (String) null, (String) null, "timestamp ASC", (String) null);
            int count = query.getCount();
            String[] strArr = new String[count];
            int i = 0;
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex("url");
                if (columnIndex != -1) {
                    strArr[i] = query.getString(columnIndex);
                }
                i++;
            }
            query.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            for (int i2 = 0; i2 < count; i2++) {
                oo0.mo5345b(strArr[i2]);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    /* renamed from: v */
    static /* synthetic */ void m14282v(SQLiteDatabase sQLiteDatabase, String str, oo0 oo0) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        m14280C(sQLiteDatabase, oo0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ Void mo9647d(q42 q42, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(q42.f13051a));
        contentValues.put("gws_query_id", q42.f13052b);
        contentValues.put("url", q42.f13053c);
        contentValues.put("event_state", Integer.valueOf(q42.f13054d - 1));
        sQLiteDatabase.insert("offline_buffered_pings", (String) null, contentValues);
        C2694t.m21608q();
        C3219x0 e = C3163g2.m23925e(this.f11881f);
        if (e != null) {
            try {
                e.zze(C2637b.m21358Z2(this.f11881f));
            } catch (RemoteException e2) {
                C3202r1.m24016l("Failed to schedule offline ping sender.", e2);
            }
        }
        return null;
    }

    /* renamed from: m */
    public final void mo9648m(String str) {
        mo9653u(new k42(this, str));
    }

    /* renamed from: n */
    public final void mo9649n(q42 q42) {
        mo9653u(new j42(this, q42));
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo9653u(pv2<SQLiteDatabase, Void> pv2) {
        rb3.m16140r(this.f11882g.mo6445C(new m42(this)), new n42(this, pv2), this.f11882g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo9654w(SQLiteDatabase sQLiteDatabase, oo0 oo0, String str) {
        this.f11882g.execute(new l42(sQLiteDatabase, str, oo0));
    }

    /* renamed from: z */
    public final void mo9655z(oo0 oo0, String str) {
        mo9653u(new i42(this, oo0, str));
    }
}
