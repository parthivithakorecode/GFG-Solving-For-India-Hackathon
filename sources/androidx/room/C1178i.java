package androidx.room;

import android.database.Cursor;
import java.util.List;
import p025d0.C2466b;
import p032e0.C2537a;
import p053h0.C2665a;
import p053h0.C2666b;
import p053h0.C2667c;

/* renamed from: androidx.room.i */
public class C1178i extends C2667c.C2668a {

    /* renamed from: b */
    private C1151a f3157b;

    /* renamed from: c */
    private final C1179a f3158c;

    /* renamed from: d */
    private final String f3159d;

    /* renamed from: e */
    private final String f3160e;

    /* renamed from: androidx.room.i$a */
    public static abstract class C1179a {

        /* renamed from: a */
        public final int f3161a;

        public C1179a(int i) {
            this.f3161a = i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo3984a(C2666b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract void mo3985b(C2666b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract void mo3986c(C2666b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public abstract void mo3987d(C2666b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public abstract void mo3988e(C2666b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public abstract void mo3989f(C2666b bVar);

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public abstract C1180b mo3990g(C2666b bVar);
    }

    /* renamed from: androidx.room.i$b */
    public static class C1180b {

        /* renamed from: a */
        public final boolean f3162a;

        /* renamed from: b */
        public final String f3163b;

        public C1180b(boolean z, String str) {
            this.f3162a = z;
            this.f3163b = str;
        }
    }

    public C1178i(C1151a aVar, C1179a aVar2, String str, String str2) {
        super(aVar2.f3161a);
        this.f3157b = aVar;
        this.f3158c = aVar2;
        this.f3159d = str;
        this.f3160e = str2;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: h */
    private void m4752h(C2666b bVar) {
        if (m4755k(bVar)) {
            String str = null;
            Cursor t = bVar.mo12657t(new C2665a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                if (t.moveToFirst()) {
                    str = t.getString(0);
                }
                t.close();
                if (!this.f3159d.equals(str) && !this.f3160e.equals(str)) {
                    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                }
            } catch (Throwable th) {
                t.close();
                throw th;
            }
        } else {
            C1180b g = this.f3158c.mo3990g(bVar);
            if (g.f3162a) {
                this.f3158c.mo3988e(bVar);
                m4756l(bVar);
                return;
            }
            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g.f3163b);
        }
    }

    /* renamed from: i */
    private void m4753i(C2666b bVar) {
        bVar.mo12651i("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    /* renamed from: j */
    private static boolean m4754j(C2666b bVar) {
        Cursor M = bVar.mo12647M("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (M.moveToFirst() && M.getInt(0) == 0) {
                z = true;
            }
            return z;
        } finally {
            M.close();
        }
    }

    /* renamed from: k */
    private static boolean m4755k(C2666b bVar) {
        Cursor M = bVar.mo12647M("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (M.moveToFirst() && M.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            M.close();
        }
    }

    /* renamed from: l */
    private void m4756l(C2666b bVar) {
        m4753i(bVar);
        bVar.mo12651i(C2466b.m20904a(this.f3159d));
    }

    /* renamed from: b */
    public void mo3979b(C2666b bVar) {
        super.mo3979b(bVar);
    }

    /* renamed from: d */
    public void mo3980d(C2666b bVar) {
        boolean j = m4754j(bVar);
        this.f3158c.mo3984a(bVar);
        if (!j) {
            C1180b g = this.f3158c.mo3990g(bVar);
            if (!g.f3162a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g.f3163b);
            }
        }
        m4756l(bVar);
        this.f3158c.mo3986c(bVar);
    }

    /* renamed from: e */
    public void mo3981e(C2666b bVar, int i, int i2) {
        mo3983g(bVar, i, i2);
    }

    /* renamed from: f */
    public void mo3982f(C2666b bVar) {
        super.mo3982f(bVar);
        m4752h(bVar);
        this.f3158c.mo3987d(bVar);
        this.f3157b = null;
    }

    /* renamed from: g */
    public void mo3983g(C2666b bVar, int i, int i2) {
        boolean z;
        List<C2537a> c;
        C1151a aVar = this.f3157b;
        if (aVar == null || (c = aVar.f3063d.mo3978c(i, i2)) == null) {
            z = false;
        } else {
            this.f3158c.mo3989f(bVar);
            for (C2537a a : c) {
                a.mo4520a(bVar);
            }
            C1180b g = this.f3158c.mo3990g(bVar);
            if (g.f3162a) {
                this.f3158c.mo3988e(bVar);
                m4756l(bVar);
                z = true;
            } else {
                throw new IllegalStateException("Migration didn't properly handle: " + g.f3163b);
            }
        }
        if (!z) {
            C1151a aVar2 = this.f3157b;
            if (aVar2 == null || aVar2.mo3917a(i, i2)) {
                throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
            }
            this.f3158c.mo3985b(bVar);
            this.f3158c.mo3984a(bVar);
        }
    }
}
