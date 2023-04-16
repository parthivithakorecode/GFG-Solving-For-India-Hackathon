package p060i0;

import android.database.sqlite.SQLiteProgram;
import p053h0.C2672d;

/* renamed from: i0.d */
class C2798d implements C2672d {

    /* renamed from: f */
    private final SQLiteProgram f19466f;

    C2798d(SQLiteProgram sQLiteProgram) {
        this.f19466f = sQLiteProgram;
    }

    /* renamed from: D */
    public void mo12293D(int i, byte[] bArr) {
        this.f19466f.bindBlob(i, bArr);
    }

    public void close() {
        this.f19466f.close();
    }

    /* renamed from: j */
    public void mo12297j(int i, String str) {
        this.f19466f.bindString(i, str);
    }

    /* renamed from: p */
    public void mo12299p(int i) {
        this.f19466f.bindNull(i);
    }

    /* renamed from: q */
    public void mo12300q(int i, double d) {
        this.f19466f.bindDouble(i, d);
    }

    /* renamed from: x */
    public void mo12302x(int i, long j) {
        this.f19466f.bindLong(i, j);
    }
}
