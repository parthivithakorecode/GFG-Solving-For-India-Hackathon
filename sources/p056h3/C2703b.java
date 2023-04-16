package p056h3;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* renamed from: h3.b */
public final /* synthetic */ class C2703b implements SQLiteDatabase.CursorFactory {

    /* renamed from: a */
    public final /* synthetic */ C2710d0 f19199a;

    public /* synthetic */ C2703b(C2710d0 d0Var) {
        this.f19199a = d0Var;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return this.f19199a.mo12713a(sQLiteQuery);
    }
}
