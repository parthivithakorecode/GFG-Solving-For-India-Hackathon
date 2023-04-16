package p060i0;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.io.File;
import p053h0.C2666b;
import p053h0.C2667c;

/* renamed from: i0.b */
class C2794b implements C2667c {

    /* renamed from: f */
    private final Context f19454f;

    /* renamed from: g */
    private final String f19455g;

    /* renamed from: h */
    private final C2667c.C2668a f19456h;

    /* renamed from: i */
    private final boolean f19457i;

    /* renamed from: j */
    private final Object f19458j = new Object();

    /* renamed from: k */
    private C2795a f19459k;

    /* renamed from: l */
    private boolean f19460l;

    /* renamed from: i0.b$a */
    static class C2795a extends SQLiteOpenHelper {

        /* renamed from: f */
        final C2791a[] f19461f;

        /* renamed from: g */
        final C2667c.C2668a f19462g;

        /* renamed from: h */
        private boolean f19463h;

        /* renamed from: i0.b$a$a */
        class C2796a implements DatabaseErrorHandler {

            /* renamed from: a */
            final /* synthetic */ C2667c.C2668a f19464a;

            /* renamed from: b */
            final /* synthetic */ C2791a[] f19465b;

            C2796a(C2667c.C2668a aVar, C2791a[] aVarArr) {
                this.f19464a = aVar;
                this.f19465b = aVarArr;
            }

            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f19464a.mo12659c(C2795a.m22235h(this.f19465b, sQLiteDatabase));
            }
        }

        C2795a(Context context, String str, C2791a[] aVarArr, C2667c.C2668a aVar) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, aVar.f19095a, new C2796a(aVar, aVarArr));
            this.f19462g = aVar;
            this.f19461f = aVarArr;
        }

        /* renamed from: h */
        static C2791a m22235h(C2791a[] aVarArr, SQLiteDatabase sQLiteDatabase) {
            C2791a aVar = aVarArr[0];
            if (aVar == null || !aVar.mo13048d(sQLiteDatabase)) {
                aVarArr[0] = new C2791a(sQLiteDatabase);
            }
            return aVarArr[0];
        }

        public synchronized void close() {
            super.close();
            this.f19461f[0] = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C2791a mo13052d(SQLiteDatabase sQLiteDatabase) {
            return m22235h(this.f19461f, sQLiteDatabase);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public synchronized C2666b mo13053m() {
            this.f19463h = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.f19463h) {
                close();
                return mo13053m();
            }
            return mo13052d(writableDatabase);
        }

        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f19462g.mo3979b(mo13052d(sQLiteDatabase));
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f19462g.mo3980d(mo13052d(sQLiteDatabase));
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f19463h = true;
            this.f19462g.mo3981e(mo13052d(sQLiteDatabase), i, i2);
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f19463h) {
                this.f19462g.mo3982f(mo13052d(sQLiteDatabase));
            }
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f19463h = true;
            this.f19462g.mo3983g(mo13052d(sQLiteDatabase), i, i2);
        }
    }

    C2794b(Context context, String str, C2667c.C2668a aVar, boolean z) {
        this.f19454f = context;
        this.f19455g = str;
        this.f19456h = aVar;
        this.f19457i = z;
    }

    /* renamed from: d */
    private C2795a m22233d() {
        C2795a aVar;
        synchronized (this.f19458j) {
            if (this.f19459k == null) {
                C2791a[] aVarArr = new C2791a[1];
                int i = Build.VERSION.SDK_INT;
                if (i < 23 || this.f19455g == null || !this.f19457i) {
                    this.f19459k = new C2795a(this.f19454f, this.f19455g, aVarArr, this.f19456h);
                } else {
                    this.f19459k = new C2795a(this.f19454f, new File(this.f19454f.getNoBackupFilesDir(), this.f19455g).getAbsolutePath(), aVarArr, this.f19456h);
                }
                if (i >= 16) {
                    this.f19459k.setWriteAheadLoggingEnabled(this.f19460l);
                }
            }
            aVar = this.f19459k;
        }
        return aVar;
    }

    /* renamed from: J */
    public C2666b mo3991J() {
        return m22233d().mo13053m();
    }

    public void close() {
        m22233d().close();
    }

    public String getDatabaseName() {
        return this.f19455g;
    }

    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.f19458j) {
            C2795a aVar = this.f19459k;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z);
            }
            this.f19460l = z;
        }
    }
}
