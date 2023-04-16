package p056h3;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p071j3.C3238e;
import p071j3.C3240g;
import p071j3.C3241h;

/* renamed from: h3.i */
class C2716i {

    /* renamed from: n */
    private static Boolean f19240n;

    /* renamed from: a */
    final boolean f19241a;

    /* renamed from: b */
    final String f19242b;

    /* renamed from: c */
    final int f19243c;

    /* renamed from: d */
    final int f19244d;

    /* renamed from: e */
    final Context f19245e;

    /* renamed from: f */
    final List<C3240g> f19246f = new ArrayList();

    /* renamed from: g */
    final Map<Integer, C2729t> f19247g = new HashMap();

    /* renamed from: h */
    public C2724o f19248h;

    /* renamed from: i */
    SQLiteDatabase f19249i;

    /* renamed from: j */
    private int f19250j = 0;

    /* renamed from: k */
    private int f19251k = 0;

    /* renamed from: l */
    private Integer f19252l;

    /* renamed from: m */
    private int f19253m = 0;

    /* renamed from: h3.i$a */
    class C2717a implements DatabaseErrorHandler {
        C2717a() {
        }

        public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        }
    }

    C2716i(Context context, String str, int i, boolean z, int i2) {
        this.f19245e = context;
        this.f19242b = str;
        this.f19241a = z;
        this.f19243c = i;
        this.f19244d = i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ void m21681F(C3238e eVar) {
        Boolean f = eVar.mo14149f();
        boolean z = Boolean.TRUE.equals(f) && eVar.mo14151h();
        if (z) {
            int i = this.f19251k + 1;
            this.f19251k = i;
            this.f19252l = Integer.valueOf(i);
        }
        if (!m21705v(eVar)) {
            if (z) {
                this.f19252l = null;
            }
        } else if (z) {
            HashMap hashMap = new HashMap();
            hashMap.put("transactionId", this.f19252l);
            eVar.mo14144a(hashMap);
        } else {
            if (Boolean.FALSE.equals(f)) {
                this.f19252l = null;
            }
            eVar.mo14144a((Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public void m21686O() {
        while (!this.f19246f.isEmpty() && this.f19252l == null) {
            this.f19246f.get(0).mo14162a();
            this.f19246f.remove(0);
        }
    }

    /* renamed from: Q */
    private void m21687Q(C3238e eVar, Runnable runnable) {
        Integer g = eVar.mo14150g();
        Integer num = this.f19252l;
        if (num == null) {
            runnable.run();
        } else if (g == null || (!g.equals(num) && g.intValue() != -1)) {
            this.f19246f.add(new C3240g(eVar, runnable));
        } else {
            runnable.run();
            if (this.f19252l == null && !this.f19246f.isEmpty()) {
                this.f19248h.mo12754c(this, new C2705c(this));
            }
        }
    }

    /* renamed from: i */
    protected static boolean m21695i(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.tekartik.sqflite.wal_enabled", false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: k */
    private void m21696k(int i) {
        C2729t tVar = this.f19247g.get(Integer.valueOf(i));
        if (tVar != null) {
            m21697l(tVar);
        }
    }

    /* renamed from: l */
    private void m21697l(C2729t tVar) {
        try {
            int i = tVar.f19280a;
            if (C2727r.m21753c(this.f19244d)) {
                Log.d("Sqflite", mo12738y() + "closing cursor " + i);
            }
            this.f19247g.remove(Integer.valueOf(i));
            tVar.f19282c.close();
        } catch (Exception unused) {
        }
    }

    /* renamed from: m */
    private Map<String, Object> m21698m(Cursor cursor, Integer num) {
        HashMap hashMap = null;
        int i = 0;
        ArrayList arrayList = null;
        while (cursor.moveToNext()) {
            if (hashMap == null) {
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap2 = new HashMap();
                i = cursor.getColumnCount();
                hashMap2.put("columns", Arrays.asList(cursor.getColumnNames()));
                hashMap2.put("rows", arrayList2);
                HashMap hashMap3 = hashMap2;
                arrayList = arrayList2;
                hashMap = hashMap3;
            }
            arrayList.add(C2712e0.m21675a(cursor, i));
            if (num != null && arrayList.size() >= num.intValue()) {
                break;
            }
        }
        return hashMap == null ? new HashMap() : hashMap;
    }

    /* renamed from: n */
    static void m21699n(String str) {
        SQLiteDatabase.deleteDatabase(new File(str));
    }

    /* renamed from: o */
    private boolean m21700o(C3238e eVar) {
        if (!m21705v(eVar)) {
            return false;
        }
        eVar.mo14144a((Object) null);
        return true;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cf  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m21682G(p071j3.C3238e r10) {
        /*
            r9 = this;
            boolean r0 = r9.m21705v(r10)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r10.mo14148e()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0014
            r10.mo14144a(r2)
            return r3
        L_0x0014:
            java.lang.String r0 = "SELECT changes(), last_insert_rowid()"
            android.database.sqlite.SQLiteDatabase r4 = r9.mo12724A()     // Catch:{ Exception -> 0x00be, all -> 0x00bc }
            android.database.Cursor r0 = r4.rawQuery(r0, r2)     // Catch:{ Exception -> 0x00be, all -> 0x00bc }
            java.lang.String r4 = "Sqflite"
            if (r0 == 0) goto L_0x009b
            int r5 = r0.getCount()     // Catch:{ Exception -> 0x0099 }
            if (r5 <= 0) goto L_0x009b
            boolean r5 = r0.moveToFirst()     // Catch:{ Exception -> 0x0099 }
            if (r5 == 0) goto L_0x009b
            int r5 = r0.getInt(r1)     // Catch:{ Exception -> 0x0099 }
            if (r5 != 0) goto L_0x0067
            int r5 = r9.f19244d     // Catch:{ Exception -> 0x0099 }
            boolean r5 = p056h3.C2727r.m21752b(r5)     // Catch:{ Exception -> 0x0099 }
            if (r5 == 0) goto L_0x0060
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0099 }
            r5.<init>()     // Catch:{ Exception -> 0x0099 }
            java.lang.String r6 = r9.mo12738y()     // Catch:{ Exception -> 0x0099 }
            r5.append(r6)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r6 = "no changes (id was "
            r5.append(r6)     // Catch:{ Exception -> 0x0099 }
            long r6 = r0.getLong(r3)     // Catch:{ Exception -> 0x0099 }
            r5.append(r6)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0099 }
            android.util.Log.d(r4, r5)     // Catch:{ Exception -> 0x0099 }
        L_0x0060:
            r10.mo14144a(r2)     // Catch:{ Exception -> 0x0099 }
            r0.close()
            return r3
        L_0x0067:
            long r5 = r0.getLong(r3)     // Catch:{ Exception -> 0x0099 }
            int r2 = r9.f19244d     // Catch:{ Exception -> 0x0099 }
            boolean r2 = p056h3.C2727r.m21752b(r2)     // Catch:{ Exception -> 0x0099 }
            if (r2 == 0) goto L_0x008e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0099 }
            r2.<init>()     // Catch:{ Exception -> 0x0099 }
            java.lang.String r7 = r9.mo12738y()     // Catch:{ Exception -> 0x0099 }
            r2.append(r7)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r7 = "inserted "
            r2.append(r7)     // Catch:{ Exception -> 0x0099 }
            r2.append(r5)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0099 }
            android.util.Log.d(r4, r2)     // Catch:{ Exception -> 0x0099 }
        L_0x008e:
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0099 }
            r10.mo14144a(r2)     // Catch:{ Exception -> 0x0099 }
            r0.close()
            return r3
        L_0x0099:
            r2 = move-exception
            goto L_0x00c2
        L_0x009b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0099 }
            r5.<init>()     // Catch:{ Exception -> 0x0099 }
            java.lang.String r6 = r9.mo12738y()     // Catch:{ Exception -> 0x0099 }
            r5.append(r6)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r6 = "fail to read changes for Insert"
            r5.append(r6)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0099 }
            android.util.Log.e(r4, r5)     // Catch:{ Exception -> 0x0099 }
            r10.mo14144a(r2)     // Catch:{ Exception -> 0x0099 }
            if (r0 == 0) goto L_0x00bb
            r0.close()
        L_0x00bb:
            return r3
        L_0x00bc:
            r10 = move-exception
            goto L_0x00cd
        L_0x00be:
            r0 = move-exception
            r8 = r2
            r2 = r0
            r0 = r8
        L_0x00c2:
            r9.mo12725B(r2, r10)     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x00ca
            r0.close()
        L_0x00ca:
            return r1
        L_0x00cb:
            r10 = move-exception
            r2 = r0
        L_0x00cd:
            if (r2 == 0) goto L_0x00d2
            r2.close()
        L_0x00d2:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p056h3.C2716i.m21682G(j3.e):boolean");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0098 A[Catch:{ all -> 0x00a3 }] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m21683H(p071j3.C3238e r10) {
        /*
            r9 = this;
            java.lang.String r0 = "cursorPageSize"
            java.lang.Object r0 = r10.mo14154c(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            h3.d0 r1 = r10.mo14147d()
            int r2 = r9.f19244d
            boolean r2 = p056h3.C2727r.m21752b(r2)
            if (r2 == 0) goto L_0x002c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r9.mo12738y()
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "Sqflite"
            android.util.Log.d(r3, r2)
        L_0x002c:
            r2 = 0
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r9.mo12737x()     // Catch:{ Exception -> 0x0091, all -> 0x008e }
            h3.b r5 = new h3.b     // Catch:{ Exception -> 0x0091, all -> 0x008e }
            r5.<init>(r1)     // Catch:{ Exception -> 0x0091, all -> 0x008e }
            java.lang.String r1 = r1.mo12715c()     // Catch:{ Exception -> 0x0091, all -> 0x008e }
            java.lang.String[] r6 = p056h3.C2701a.f19195a     // Catch:{ Exception -> 0x0091, all -> 0x008e }
            android.database.Cursor r1 = r4.rawQueryWithFactory(r5, r1, r6, r2)     // Catch:{ Exception -> 0x0091, all -> 0x008e }
            java.util.Map r4 = r9.m21698m(r1, r0)     // Catch:{ Exception -> 0x008c }
            r5 = 1
            if (r0 == 0) goto L_0x0056
            boolean r6 = r1.isLast()     // Catch:{ Exception -> 0x008c }
            if (r6 != 0) goto L_0x0056
            boolean r6 = r1.isAfterLast()     // Catch:{ Exception -> 0x008c }
            if (r6 != 0) goto L_0x0056
            r6 = r5
            goto L_0x0057
        L_0x0056:
            r6 = r3
        L_0x0057:
            if (r6 == 0) goto L_0x0081
            int r6 = r9.f19253m     // Catch:{ Exception -> 0x008c }
            int r6 = r6 + r5
            r9.f19253m = r6     // Catch:{ Exception -> 0x008c }
            java.lang.String r7 = "cursorId"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x008c }
            r4.put(r7, r8)     // Catch:{ Exception -> 0x008c }
            h3.t r7 = new h3.t     // Catch:{ Exception -> 0x008c }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x008c }
            r7.<init>(r6, r0, r1)     // Catch:{ Exception -> 0x008c }
            java.util.Map<java.lang.Integer, h3.t> r0 = r9.f19247g     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            r0.put(r2, r7)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            r2 = r7
            goto L_0x0081
        L_0x007b:
            r10 = move-exception
            r2 = r7
            goto L_0x00a4
        L_0x007e:
            r0 = move-exception
            r2 = r7
            goto L_0x0093
        L_0x0081:
            r10.mo14144a(r4)     // Catch:{ Exception -> 0x008c }
            if (r2 != 0) goto L_0x008b
            if (r1 == 0) goto L_0x008b
            r1.close()
        L_0x008b:
            return r5
        L_0x008c:
            r0 = move-exception
            goto L_0x0093
        L_0x008e:
            r10 = move-exception
            r1 = r2
            goto L_0x00a4
        L_0x0091:
            r0 = move-exception
            r1 = r2
        L_0x0093:
            r9.mo12725B(r0, r10)     // Catch:{ all -> 0x00a3 }
            if (r2 == 0) goto L_0x009b
            r9.m21697l(r2)     // Catch:{ all -> 0x00a3 }
        L_0x009b:
            if (r2 != 0) goto L_0x00a2
            if (r1 == 0) goto L_0x00a2
            r1.close()
        L_0x00a2:
            return r3
        L_0x00a3:
            r10 = move-exception
        L_0x00a4:
            if (r2 != 0) goto L_0x00ab
            if (r1 == 0) goto L_0x00ab
            r1.close()
        L_0x00ab:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p056h3.C2716i.m21683H(j3.e):boolean");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b6 A[Catch:{ all -> 0x00c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ba  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m21684I(p071j3.C3238e r10) {
        /*
            r9 = this;
            java.lang.String r0 = "cursorId"
            java.lang.Object r1 = r10.mo14154c(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.String r3 = "cancel"
            java.lang.Object r3 = r10.mo14154c(r3)
            boolean r2 = r2.equals(r3)
            int r3 = r9.f19244d
            boolean r3 = p056h3.C2727r.m21753c(r3)
            if (r3 == 0) goto L_0x0047
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r9.mo12738y()
            r3.append(r4)
            java.lang.String r4 = "cursor "
            r3.append(r4)
            r3.append(r1)
            if (r2 == 0) goto L_0x0039
            java.lang.String r4 = " cancel"
            goto L_0x003b
        L_0x0039:
            java.lang.String r4 = " next"
        L_0x003b:
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "Sqflite"
            android.util.Log.d(r4, r3)
        L_0x0047:
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0052
            r9.m21696k(r1)
            r10.mo14144a(r3)
            return r4
        L_0x0052:
            java.util.Map<java.lang.Integer, h3.t> r2 = r9.f19247g
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r2.get(r5)
            h3.t r2 = (p056h3.C2729t) r2
            r5 = 0
            if (r2 == 0) goto L_0x0095
            android.database.Cursor r6 = r2.f19282c     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            int r7 = r2.f19281b     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            java.util.Map r7 = r9.m21698m(r6, r7)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            boolean r8 = r6.isLast()     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            if (r8 != 0) goto L_0x007b
            boolean r6 = r6.isAfterLast()     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            if (r6 != 0) goto L_0x007b
            r6 = r4
            goto L_0x007c
        L_0x007b:
            r6 = r5
        L_0x007c:
            if (r6 == 0) goto L_0x0085
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x008e }
            r7.put(r0, r1)     // Catch:{ Exception -> 0x008e }
        L_0x0085:
            r10.mo14144a(r7)     // Catch:{ Exception -> 0x008e }
            if (r6 != 0) goto L_0x008d
            r9.m21697l(r2)
        L_0x008d:
            return r4
        L_0x008e:
            r0 = move-exception
            goto L_0x00b1
        L_0x0090:
            r10 = move-exception
            goto L_0x00c5
        L_0x0092:
            r0 = move-exception
            r6 = r5
            goto L_0x00b1
        L_0x0095:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            r4.<init>()     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            java.lang.String r6 = "Cursor "
            r4.append(r6)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            r4.append(r1)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            java.lang.String r1 = " not found"
            r4.append(r1)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            java.lang.String r1 = r4.toString()     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            throw r0     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
        L_0x00b1:
            r9.mo12725B(r0, r10)     // Catch:{ all -> 0x00c3 }
            if (r2 == 0) goto L_0x00ba
            r9.m21697l(r2)     // Catch:{ all -> 0x00c3 }
            goto L_0x00bb
        L_0x00ba:
            r3 = r2
        L_0x00bb:
            if (r6 != 0) goto L_0x00c2
            if (r3 == 0) goto L_0x00c2
            r9.m21697l(r3)
        L_0x00c2:
            return r5
        L_0x00c3:
            r10 = move-exception
            r5 = r6
        L_0x00c5:
            if (r5 != 0) goto L_0x00cc
            if (r2 == 0) goto L_0x00cc
            r9.m21697l(r2)
        L_0x00cc:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p056h3.C2716i.m21684I(j3.e):boolean");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0095  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m21685J(p071j3.C3238e r8) {
        /*
            r7 = this;
            boolean r0 = r7.m21705v(r8)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r8.mo14148e()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0014
            r8.mo14144a(r3)
            return r2
        L_0x0014:
            android.database.sqlite.SQLiteDatabase r0 = r7.mo12724A()     // Catch:{ Exception -> 0x0089 }
            java.lang.String r4 = "SELECT changes()"
            android.database.Cursor r0 = r0.rawQuery(r4, r3)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r4 = "Sqflite"
            if (r0 == 0) goto L_0x0066
            int r5 = r0.getCount()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            if (r5 <= 0) goto L_0x0066
            boolean r5 = r0.moveToFirst()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            if (r5 == 0) goto L_0x0066
            int r3 = r0.getInt(r1)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            int r5 = r7.f19244d     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            boolean r5 = p056h3.C2727r.m21752b(r5)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            if (r5 == 0) goto L_0x0055
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r5.<init>()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.String r6 = r7.mo12738y()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r5.append(r6)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.String r6 = "changed "
            r5.append(r6)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r5.append(r3)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            android.util.Log.d(r4, r5)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
        L_0x0055:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r8.mo14144a(r3)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r0.close()
            return r2
        L_0x0060:
            r8 = move-exception
            r3 = r0
            goto L_0x0093
        L_0x0063:
            r2 = move-exception
            r3 = r0
            goto L_0x008a
        L_0x0066:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r5.<init>()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.String r6 = r7.mo12738y()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r5.append(r6)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.String r6 = "fail to read changes for Update/Delete"
            r5.append(r6)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            android.util.Log.e(r4, r5)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r8.mo14144a(r3)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            if (r0 == 0) goto L_0x0086
            r0.close()
        L_0x0086:
            return r2
        L_0x0087:
            r8 = move-exception
            goto L_0x0093
        L_0x0089:
            r2 = move-exception
        L_0x008a:
            r7.mo12725B(r2, r8)     // Catch:{ all -> 0x0087 }
            if (r3 == 0) goto L_0x0092
            r3.close()
        L_0x0092:
            return r1
        L_0x0093:
            if (r3 == 0) goto L_0x0098
            r3.close()
        L_0x0098:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p056h3.C2716i.m21685J(j3.e):boolean");
    }

    /* renamed from: v */
    private boolean m21705v(C3238e eVar) {
        C2710d0 d = eVar.mo14147d();
        if (C2727r.m21752b(this.f19244d)) {
            Log.d("Sqflite", mo12738y() + d);
        }
        Boolean f = eVar.mo14149f();
        try {
            mo12724A().execSQL(d.mo12715c(), d.mo12716d());
            mo12735t(f);
            return true;
        } catch (Exception e) {
            mo12725B(e, eVar);
            return false;
        }
    }

    /* renamed from: w */
    public static boolean m21706w(String str) {
        try {
            return new File(str).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: A */
    public SQLiteDatabase mo12724A() {
        return this.f19249i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo12725B(Exception exc, C3238e eVar) {
        String message;
        Map<String, Object> a;
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            message = "open_failed " + this.f19242b;
            a = null;
        } else {
            boolean z = exc instanceof SQLException;
            message = exc.getMessage();
            a = C3241h.m24172a(eVar);
        }
        eVar.mo14145b("sqlite_error", message, a);
    }

    /* renamed from: C */
    public void mo12726C(C3238e eVar) {
        m21687Q(eVar, new C2709d(this, eVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public synchronized boolean mo12727D() {
        return this.f19250j > 0;
    }

    /* renamed from: K */
    public void mo12728K() {
        if (f19240n == null) {
            Boolean valueOf = Boolean.valueOf(m21695i(this.f19245e));
            f19240n = valueOf;
            if (valueOf.booleanValue() && C2727r.m21753c(this.f19244d)) {
                Log.d("Sqflite", mo12738y() + "[sqflite] WAL enabled");
            }
        }
        this.f19249i = SQLiteDatabase.openDatabase(this.f19242b, (SQLiteDatabase.CursorFactory) null, f19240n.booleanValue() ? 805306368 : 268435456);
    }

    /* renamed from: L */
    public void mo12729L() {
        this.f19249i = SQLiteDatabase.openDatabase(this.f19242b, (SQLiteDatabase.CursorFactory) null, 1, new C2717a());
    }

    /* renamed from: M */
    public void mo12730M(C3238e eVar) {
        m21687Q(eVar, new C2713f(this, eVar));
    }

    /* renamed from: N */
    public void mo12731N(C3238e eVar) {
        m21687Q(eVar, new C2711e(this, eVar));
    }

    /* renamed from: P */
    public void mo12732P(C3238e eVar) {
        m21687Q(eVar, new C2714g(this, eVar));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ba, code lost:
        r5.mo14161t(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c1, code lost:
        r5.mo14160s(r2);
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12733h(p005a4.C0144j r9, p005a4.C0145k.C0150d r10) {
        /*
            r8 = this;
            j3.d r0 = new j3.d
            r0.<init>(r9, r10)
            boolean r9 = r0.mo14148e()
            boolean r1 = r0.mo14152l()
            java.lang.String r2 = "operations"
            java.lang.Object r0 = r0.mo14154c(r2)
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x001e:
            boolean r3 = r0.hasNext()
            r4 = 0
            if (r3 == 0) goto L_0x00ca
            java.lang.Object r3 = r0.next()
            java.util.Map r3 = (java.util.Map) r3
            j3.c r5 = new j3.c
            r5.<init>(r3, r9)
            java.lang.String r3 = r5.mo14155i()
            r3.hashCode()
            r6 = -1
            int r7 = r3.hashCode()
            switch(r7) {
                case -1319569547: goto L_0x0061;
                case -1183792455: goto L_0x0056;
                case -838846263: goto L_0x004b;
                case 107944136: goto L_0x0040;
                default: goto L_0x003f;
            }
        L_0x003f:
            goto L_0x006b
        L_0x0040:
            java.lang.String r7 = "query"
            boolean r7 = r3.equals(r7)
            if (r7 != 0) goto L_0x0049
            goto L_0x006b
        L_0x0049:
            r6 = 3
            goto L_0x006b
        L_0x004b:
            java.lang.String r7 = "update"
            boolean r7 = r3.equals(r7)
            if (r7 != 0) goto L_0x0054
            goto L_0x006b
        L_0x0054:
            r6 = 2
            goto L_0x006b
        L_0x0056:
            java.lang.String r7 = "insert"
            boolean r7 = r3.equals(r7)
            if (r7 != 0) goto L_0x005f
            goto L_0x006b
        L_0x005f:
            r6 = 1
            goto L_0x006b
        L_0x0061:
            java.lang.String r7 = "execute"
            boolean r7 = r3.equals(r7)
            if (r7 != 0) goto L_0x006a
            goto L_0x006b
        L_0x006a:
            r6 = 0
        L_0x006b:
            switch(r6) {
                case 0: goto L_0x00b4;
                case 1: goto L_0x00a6;
                case 2: goto L_0x0098;
                case 3: goto L_0x008a;
                default: goto L_0x006e;
            }
        L_0x006e:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Batch method '"
            r9.append(r0)
            r9.append(r3)
            java.lang.String r0 = "' not supported"
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "bad_param"
            r10.mo339b(r0, r9, r4)
            return
        L_0x008a:
            boolean r3 = r8.m21683H(r5)
            if (r3 == 0) goto L_0x0091
            goto L_0x00ba
        L_0x0091:
            if (r1 == 0) goto L_0x0094
            goto L_0x00af
        L_0x0094:
            r5.mo14159r(r10)
            return
        L_0x0098:
            boolean r3 = r8.m21685J(r5)
            if (r3 == 0) goto L_0x009f
            goto L_0x00ba
        L_0x009f:
            if (r1 == 0) goto L_0x00a2
            goto L_0x00af
        L_0x00a2:
            r5.mo14159r(r10)
            return
        L_0x00a6:
            boolean r3 = r8.m21682G(r5)
            if (r3 == 0) goto L_0x00ad
            goto L_0x00ba
        L_0x00ad:
            if (r1 == 0) goto L_0x00b0
        L_0x00af:
            goto L_0x00c1
        L_0x00b0:
            r5.mo14159r(r10)
            return
        L_0x00b4:
            boolean r3 = r8.m21700o(r5)
            if (r3 == 0) goto L_0x00bf
        L_0x00ba:
            r5.mo14161t(r2)
            goto L_0x001e
        L_0x00bf:
            if (r1 == 0) goto L_0x00c6
        L_0x00c1:
            r5.mo14160s(r2)
            goto L_0x001e
        L_0x00c6:
            r5.mo14159r(r10)
            return
        L_0x00ca:
            if (r9 == 0) goto L_0x00d0
            r10.mo338a(r4)
            goto L_0x00d3
        L_0x00d0:
            r10.mo338a(r2)
        L_0x00d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p056h3.C2716i.mo12733h(a4.j, a4.k$d):void");
    }

    /* renamed from: j */
    public void mo12734j() {
        if (!this.f19247g.isEmpty() && C2727r.m21752b(this.f19244d)) {
            Log.d("Sqflite", mo12738y() + this.f19247g.size() + " cursor(s) are left opened");
        }
        this.f19249i.close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public synchronized void mo12735t(Boolean bool) {
        if (Boolean.TRUE.equals(bool)) {
            this.f19250j++;
        } else if (Boolean.FALSE.equals(bool)) {
            this.f19250j--;
        }
    }

    /* renamed from: u */
    public void mo12736u(C3238e eVar) {
        m21687Q(eVar, new C2715h(this, eVar));
    }

    /* renamed from: x */
    public SQLiteDatabase mo12737x() {
        return this.f19249i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public String mo12738y() {
        return "[" + mo12739z() + "] ";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public String mo12739z() {
        Thread currentThread = Thread.currentThread();
        return "" + this.f19243c + "," + currentThread.getName() + "(" + currentThread.getId() + ")";
    }
}
