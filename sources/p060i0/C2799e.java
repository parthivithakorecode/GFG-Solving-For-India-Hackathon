package p060i0;

import android.database.sqlite.SQLiteStatement;
import p053h0.C2674f;

/* renamed from: i0.e */
class C2799e extends C2798d implements C2674f {

    /* renamed from: g */
    private final SQLiteStatement f19467g;

    C2799e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f19467g = sQLiteStatement;
    }

    /* renamed from: L */
    public long mo12664L() {
        return this.f19467g.executeInsert();
    }

    /* renamed from: k */
    public int mo12665k() {
        return this.f19467g.executeUpdateDelete();
    }
}
