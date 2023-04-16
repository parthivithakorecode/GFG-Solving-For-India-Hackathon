package p060i0;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import java.util.List;
import p053h0.C2665a;
import p053h0.C2666b;
import p053h0.C2673e;
import p053h0.C2674f;

/* renamed from: i0.a */
class C2791a implements C2666b {

    /* renamed from: g */
    private static final String[] f19447g = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: h */
    private static final String[] f19448h = new String[0];

    /* renamed from: f */
    private final SQLiteDatabase f19449f;

    /* renamed from: i0.a$a */
    class C2792a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        final /* synthetic */ C2673e f19450a;

        C2792a(C2673e eVar) {
            this.f19450a = eVar;
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f19450a.mo12296h(new C2798d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* renamed from: i0.a$b */
    class C2793b implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        final /* synthetic */ C2673e f19452a;

        C2793b(C2673e eVar) {
            this.f19452a = eVar;
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f19452a.mo12296h(new C2798d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    C2791a(SQLiteDatabase sQLiteDatabase) {
        this.f19449f = sQLiteDatabase;
    }

    /* renamed from: A */
    public void mo12646A(String str, Object[] objArr) {
        this.f19449f.execSQL(str, objArr);
    }

    /* renamed from: M */
    public Cursor mo12647M(String str) {
        return mo12657t(new C2665a(str));
    }

    public void close() {
        this.f19449f.close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo13048d(SQLiteDatabase sQLiteDatabase) {
        return this.f19449f == sQLiteDatabase;
    }

    /* renamed from: e */
    public void mo12648e() {
        this.f19449f.endTransaction();
    }

    /* renamed from: f */
    public void mo12649f() {
        this.f19449f.beginTransaction();
    }

    /* renamed from: g */
    public List<Pair<String, String>> mo12650g() {
        return this.f19449f.getAttachedDbs();
    }

    /* renamed from: i */
    public void mo12651i(String str) {
        this.f19449f.execSQL(str);
    }

    public boolean isOpen() {
        return this.f19449f.isOpen();
    }

    /* renamed from: l */
    public C2674f mo12653l(String str) {
        return new C2799e(this.f19449f.compileStatement(str));
    }

    /* renamed from: o */
    public Cursor mo12654o(C2673e eVar, CancellationSignal cancellationSignal) {
        return this.f19449f.rawQueryWithFactory(new C2793b(eVar), eVar.mo12295d(), f19448h, (String) null, cancellationSignal);
    }

    /* renamed from: r */
    public String mo12655r() {
        return this.f19449f.getPath();
    }

    /* renamed from: s */
    public boolean mo12656s() {
        return this.f19449f.inTransaction();
    }

    /* renamed from: t */
    public Cursor mo12657t(C2673e eVar) {
        return this.f19449f.rawQueryWithFactory(new C2792a(eVar), eVar.mo12295d(), f19448h, (String) null);
    }

    /* renamed from: y */
    public void mo12658y() {
        this.f19449f.setTransactionSuccessful();
    }
}
