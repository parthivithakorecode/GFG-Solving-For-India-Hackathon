package p053h0;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.File;

/* renamed from: h0.c */
public interface C2667c extends Closeable {

    /* renamed from: h0.c$a */
    public static abstract class C2668a {

        /* renamed from: a */
        public final int f19095a;

        public C2668a(int i) {
            this.f19095a = i;
        }

        /* renamed from: a */
        private void m21478a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                Log.w("SupportSQLite", "deleting the database file: " + str);
                try {
                    if (Build.VERSION.SDK_INT >= 16) {
                        SQLiteDatabase.deleteDatabase(new File(str));
                        return;
                    }
                    try {
                        if (!new File(str).delete()) {
                            Log.e("SupportSQLite", "Could not delete the database file " + str);
                        }
                    } catch (Exception e) {
                        Log.e("SupportSQLite", "error while deleting corrupted database file", e);
                    }
                } catch (Exception e2) {
                    Log.w("SupportSQLite", "delete failed: ", e2);
                }
            }
        }

        /* renamed from: b */
        public void mo3979b(C2666b bVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
            if (r0 != null) goto L_0x0036;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
            r3 = r0.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
            if (r3.hasNext() != false) goto L_0x0040;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
            m21478a((java.lang.String) r3.next().second);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
            m21478a(r3.mo12655r());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0030 */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x002e A[ExcHandler: all (r1v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
          PHI: (r0v10 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r0v3 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v4 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v4 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:5:0x0029, B:8:0x0030, B:9:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:5:0x0029] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo12659c(p053h0.C2666b r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Corruption reported by sqlite on database: "
                r0.append(r1)
                java.lang.String r1 = r3.mo12655r()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "SupportSQLite"
                android.util.Log.e(r1, r0)
                boolean r0 = r3.isOpen()
                if (r0 != 0) goto L_0x0028
                java.lang.String r3 = r3.mo12655r()
                r2.m21478a(r3)
                return
            L_0x0028:
                r0 = 0
                java.util.List r0 = r3.mo12650g()     // Catch:{ SQLiteException -> 0x0030, all -> 0x002e }
                goto L_0x0030
            L_0x002e:
                r1 = move-exception
                goto L_0x0034
            L_0x0030:
                r3.close()     // Catch:{ IOException -> 0x0056, all -> 0x002e }
                goto L_0x0056
            L_0x0034:
                if (r0 == 0) goto L_0x004e
                java.util.Iterator r3 = r0.iterator()
            L_0x003a:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0055
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r0 = r0.second
                java.lang.String r0 = (java.lang.String) r0
                r2.m21478a(r0)
                goto L_0x003a
            L_0x004e:
                java.lang.String r3 = r3.mo12655r()
                r2.m21478a(r3)
            L_0x0055:
                throw r1
            L_0x0056:
                if (r0 == 0) goto L_0x0070
                java.util.Iterator r3 = r0.iterator()
            L_0x005c:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0077
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r0 = r0.second
                java.lang.String r0 = (java.lang.String) r0
                r2.m21478a(r0)
                goto L_0x005c
            L_0x0070:
                java.lang.String r3 = r3.mo12655r()
                r2.m21478a(r3)
            L_0x0077:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p053h0.C2667c.C2668a.mo12659c(h0.b):void");
        }

        /* renamed from: d */
        public abstract void mo3980d(C2666b bVar);

        /* renamed from: e */
        public abstract void mo3981e(C2666b bVar, int i, int i2);

        /* renamed from: f */
        public void mo3982f(C2666b bVar) {
        }

        /* renamed from: g */
        public abstract void mo3983g(C2666b bVar, int i, int i2);
    }

    /* renamed from: h0.c$b */
    public static class C2669b {

        /* renamed from: a */
        public final Context f19096a;

        /* renamed from: b */
        public final String f19097b;

        /* renamed from: c */
        public final C2668a f19098c;

        /* renamed from: d */
        public final boolean f19099d;

        /* renamed from: h0.c$b$a */
        public static class C2670a {

            /* renamed from: a */
            Context f19100a;

            /* renamed from: b */
            String f19101b;

            /* renamed from: c */
            C2668a f19102c;

            /* renamed from: d */
            boolean f19103d;

            C2670a(Context context) {
                this.f19100a = context;
            }

            /* renamed from: a */
            public C2669b mo12660a() {
                if (this.f19102c == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                } else if (this.f19100a == null) {
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                } else if (!this.f19103d || !TextUtils.isEmpty(this.f19101b)) {
                    return new C2669b(this.f19100a, this.f19101b, this.f19102c, this.f19103d);
                } else {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
            }

            /* renamed from: b */
            public C2670a mo12661b(C2668a aVar) {
                this.f19102c = aVar;
                return this;
            }

            /* renamed from: c */
            public C2670a mo12662c(String str) {
                this.f19101b = str;
                return this;
            }

            /* renamed from: d */
            public C2670a mo12663d(boolean z) {
                this.f19103d = z;
                return this;
            }
        }

        C2669b(Context context, String str, C2668a aVar, boolean z) {
            this.f19096a = context;
            this.f19097b = str;
            this.f19098c = aVar;
            this.f19099d = z;
        }

        /* renamed from: a */
        public static C2670a m21485a(Context context) {
            return new C2670a(context);
        }
    }

    /* renamed from: h0.c$c */
    public interface C2671c {
        /* renamed from: a */
        C2667c mo3996a(C2669b bVar);
    }

    /* renamed from: J */
    C2666b mo3991J();

    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z);
}
