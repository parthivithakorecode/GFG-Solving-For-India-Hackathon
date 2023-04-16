package p056h3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import p005a4.C0128c;
import p005a4.C0144j;
import p005a4.C0145k;
import p005a4.C0159s;
import p063i3.C2846a;
import p132s3.C4047a;

/* renamed from: h3.c0 */
public class C2706c0 implements C4047a, C0145k.C0149c {

    /* renamed from: c */
    static final Map<String, Integer> f19209c = new HashMap();
    @SuppressLint({"UseSparseArrays"})

    /* renamed from: d */
    static final Map<Integer, C2716i> f19210d = new HashMap();

    /* renamed from: e */
    private static final Object f19211e = new Object();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Object f19212f = new Object();

    /* renamed from: g */
    static int f19213g = 0;

    /* renamed from: h */
    static String f19214h;

    /* renamed from: i */
    private static int f19215i = 0;

    /* renamed from: j */
    private static int f19216j = 1;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static int f19217k = 0;

    /* renamed from: l */
    private static C2724o f19218l;

    /* renamed from: a */
    private Context f19219a;

    /* renamed from: b */
    private C0145k f19220b;

    /* renamed from: h3.c0$a */
    class C2707a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C2716i f19221f;

        /* renamed from: g */
        final /* synthetic */ C0145k.C0150d f19222g;

        C2707a(C2716i iVar, C0145k.C0150d dVar) {
            this.f19221f = iVar;
            this.f19222g = dVar;
        }

        public void run() {
            synchronized (C2706c0.f19212f) {
                C2706c0.this.m21652l(this.f19221f);
            }
            this.f19222g.mo338a((Object) null);
        }
    }

    /* renamed from: h3.c0$b */
    class C2708b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C2716i f19224f;

        /* renamed from: g */
        final /* synthetic */ String f19225g;

        /* renamed from: h */
        final /* synthetic */ C0145k.C0150d f19226h;

        C2708b(C2716i iVar, String str, C0145k.C0150d dVar) {
            this.f19224f = iVar;
            this.f19225g = str;
            this.f19226h = dVar;
        }

        public void run() {
            synchronized (C2706c0.f19212f) {
                C2716i iVar = this.f19224f;
                if (iVar != null) {
                    C2706c0.this.m21652l(iVar);
                }
                try {
                    if (C2727r.m21753c(C2706c0.f19213g)) {
                        Log.d("Sqflite", "delete database " + this.f19225g);
                    }
                    C2716i.m21699n(this.f19225g);
                } catch (Exception e) {
                    Log.e("Sqflite", "error " + e + " while closing database " + C2706c0.f19217k);
                }
            }
            this.f19226h.mo338a((Object) null);
        }
    }

    /* renamed from: A */
    private void m21629A(C0144j jVar, C0145k.C0150d dVar) {
        int intValue = ((Integer) jVar.mo332a("id")).intValue();
        C2716i n = m21654n(jVar, dVar);
        if (n != null) {
            if (C2727r.m21752b(n.f19244d)) {
                Log.d("Sqflite", n.mo12738y() + "closing " + intValue + " " + n.f19242b);
            }
            String str = n.f19242b;
            synchronized (f19211e) {
                f19210d.remove(Integer.valueOf(intValue));
                if (n.f19241a) {
                    f19209c.remove(str);
                }
            }
            f19218l.mo12754c(n, new C2707a(n, dVar));
        }
    }

    /* renamed from: B */
    private void m21630B(C0144j jVar, C0145k.C0150d dVar) {
        dVar.mo338a(Boolean.valueOf(C2716i.m21706w((String) jVar.mo332a("path"))));
    }

    /* renamed from: C */
    private void m21631C(C0144j jVar, C0145k.C0150d dVar) {
        HashMap hashMap = new HashMap();
        if ("get".equals((String) jVar.mo332a("cmd"))) {
            int i = f19213g;
            if (i > 0) {
                hashMap.put("logLevel", Integer.valueOf(i));
            }
            Map<Integer, C2716i> map = f19210d;
            if (!map.isEmpty()) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry next : map.entrySet()) {
                    C2716i iVar = (C2716i) next.getValue();
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("path", iVar.f19242b);
                    hashMap3.put("singleInstance", Boolean.valueOf(iVar.f19241a));
                    int i2 = iVar.f19244d;
                    if (i2 > 0) {
                        hashMap3.put("logLevel", Integer.valueOf(i2));
                    }
                    hashMap2.put(((Integer) next.getKey()).toString(), hashMap3);
                }
                hashMap.put("databases", hashMap2);
            }
        }
        dVar.mo338a(hashMap);
    }

    /* renamed from: D */
    private void m21632D(C0144j jVar, C0145k.C0150d dVar) {
        C2846a.f19542a = Boolean.TRUE.equals(jVar.mo333b());
        C2846a.f19544c = C2846a.f19543b && C2846a.f19542a;
        if (!C2846a.f19542a) {
            f19213g = 0;
        } else if (C2846a.f19544c) {
            f19213g = 2;
        } else if (C2846a.f19542a) {
            f19213g = 1;
        }
        dVar.mo338a((Object) null);
    }

    /* renamed from: E */
    private void m21633E(C0144j jVar, C0145k.C0150d dVar) {
        C2716i iVar;
        Map<Integer, C2716i> map;
        String str = (String) jVar.mo332a("path");
        synchronized (f19211e) {
            if (C2727r.m21753c(f19213g)) {
                Log.d("Sqflite", "Look for " + str + " in " + f19209c.keySet());
            }
            Map<String, Integer> map2 = f19209c;
            Integer num = map2.get(str);
            if (num == null || (iVar = map.get(num)) == null || !iVar.f19249i.isOpen()) {
                iVar = null;
            } else {
                if (C2727r.m21753c(f19213g)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(iVar.mo12738y());
                    sb.append("found single instance ");
                    sb.append(iVar.mo12727D() ? "(in transaction) " : "");
                    sb.append(num);
                    sb.append(" ");
                    sb.append(str);
                    Log.d("Sqflite", sb.toString());
                }
                (map = f19210d).remove(num);
                map2.remove(str);
            }
        }
        C2708b bVar = new C2708b(iVar, str, dVar);
        C2724o oVar = f19218l;
        if (oVar != null) {
            oVar.mo12754c(iVar, bVar);
        } else {
            bVar.run();
        }
    }

    /* renamed from: F */
    private void m21634F(C0144j jVar, C0145k.C0150d dVar) {
        C2716i n = m21654n(jVar, dVar);
        if (n != null) {
            f19218l.mo12754c(n, new C2733x(jVar, dVar, n));
        }
    }

    /* renamed from: H */
    private void m21635H(C0144j jVar, C0145k.C0150d dVar) {
        C2716i n = m21654n(jVar, dVar);
        if (n != null) {
            f19218l.mo12754c(n, new C2731v(jVar, dVar, n));
        }
    }

    /* renamed from: I */
    private void m21636I(C0144j jVar, C0145k.C0150d dVar) {
        int i;
        C2716i iVar;
        C0144j jVar2 = jVar;
        String str = (String) jVar2.mo332a("path");
        Boolean bool = (Boolean) jVar2.mo332a("readOnly");
        boolean o = m21655o(str);
        boolean z = !Boolean.FALSE.equals(jVar2.mo332a("singleInstance")) && !o;
        if (z) {
            synchronized (f19211e) {
                if (C2727r.m21753c(f19213g)) {
                    Log.d("Sqflite", "Look for " + str + " in " + f19209c.keySet());
                }
                Integer num = f19209c.get(str);
                if (!(num == null || (iVar = f19210d.get(num)) == null)) {
                    if (iVar.f19249i.isOpen()) {
                        if (C2727r.m21753c(f19213g)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(iVar.mo12738y());
                            sb.append("re-opened single instance ");
                            sb.append(iVar.mo12727D() ? "(in transaction) " : "");
                            sb.append(num);
                            sb.append(" ");
                            sb.append(str);
                            Log.d("Sqflite", sb.toString());
                        }
                        dVar.mo338a(m21664x(num.intValue(), true, iVar.mo12727D()));
                        return;
                    } else if (C2727r.m21753c(f19213g)) {
                        Log.d("Sqflite", iVar.mo12738y() + "single instance database of " + str + " not opened");
                    }
                }
                C0145k.C0150d dVar2 = dVar;
            }
        } else {
            C0145k.C0150d dVar3 = dVar;
        }
        Object obj = f19211e;
        synchronized (obj) {
            i = f19217k + 1;
            f19217k = i;
        }
        C2716i iVar2 = new C2716i(this.f19219a, str, i, z, f19213g);
        synchronized (obj) {
            if (f19218l == null) {
                C2724o b = C2722n.m21736b("Sqflite", f19216j, f19215i);
                f19218l = b;
                b.start();
                if (C2727r.m21752b(iVar2.f19244d)) {
                    Log.d("Sqflite", iVar2.mo12738y() + "starting worker pool with priority " + f19215i);
                }
            }
            iVar2.f19248h = f19218l;
            if (C2727r.m21752b(iVar2.f19244d)) {
                Log.d("Sqflite", iVar2.mo12738y() + "opened " + i + " " + str);
            }
            C2704b0 b0Var = r1;
            C2724o oVar = f19218l;
            C2704b0 b0Var2 = new C2704b0(o, str, dVar, bool, iVar2, jVar, z, i);
            oVar.mo12754c(iVar2, b0Var);
        }
    }

    /* renamed from: K */
    private void m21637K(C0144j jVar, C0145k.C0150d dVar) {
        C2716i n = m21654n(jVar, dVar);
        if (n != null) {
            f19218l.mo12754c(n, new C2730u(jVar, dVar, n));
        }
    }

    /* renamed from: L */
    private void m21638L(C0144j jVar, C0145k.C0150d dVar) {
        C2716i n = m21654n(jVar, dVar);
        if (n != null) {
            f19218l.mo12754c(n, new C2734y(jVar, dVar, n));
        }
    }

    /* renamed from: M */
    private void m21639M(C0144j jVar, C0145k.C0150d dVar) {
        C2716i n = m21654n(jVar, dVar);
        if (n != null) {
            f19218l.mo12754c(n, new C2735z(jVar, n, dVar));
        }
    }

    /* renamed from: N */
    private void m21640N(C0144j jVar, C0145k.C0150d dVar) {
        C2716i n = m21654n(jVar, dVar);
        if (n != null) {
            f19218l.mo12754c(n, new C2732w(jVar, dVar, n));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m21652l(C2716i iVar) {
        try {
            if (C2727r.m21752b(iVar.f19244d)) {
                Log.d("Sqflite", iVar.mo12738y() + "closing database ");
            }
            iVar.mo12734j();
        } catch (Exception e) {
            Log.e("Sqflite", "error " + e + " while closing database " + f19217k);
        }
        synchronized (f19211e) {
            if (f19210d.isEmpty() && f19218l != null) {
                if (C2727r.m21752b(iVar.f19244d)) {
                    Log.d("Sqflite", iVar.mo12738y() + "stopping thread");
                }
                f19218l.mo12753b();
                f19218l = null;
            }
        }
    }

    /* renamed from: m */
    private C2716i m21653m(int i) {
        return f19210d.get(Integer.valueOf(i));
    }

    /* renamed from: n */
    private C2716i m21654n(C0144j jVar, C0145k.C0150d dVar) {
        int intValue = ((Integer) jVar.mo332a("id")).intValue();
        C2716i m = m21653m(intValue);
        if (m != null) {
            return m;
        }
        dVar.mo339b("sqlite_error", "database_closed " + intValue, (Object) null);
        return null;
    }

    /* renamed from: o */
    static boolean m21655o(String str) {
        return str == null || str.equals(":memory:");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0093, code lost:
        r4.mo338a(m21664x(r9, false, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a1, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a2, code lost:
        r6.mo12725B(r2, new p071j3.C3236d(r7, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ab, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m21659s(boolean r2, java.lang.String r3, p005a4.C0145k.C0150d r4, java.lang.Boolean r5, p056h3.C2716i r6, p005a4.C0144j r7, boolean r8, int r9) {
        /*
            java.lang.Object r0 = f19212f
            monitor-enter(r0)
            if (r2 != 0) goto L_0x003e
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x009f }
            r2.<init>(r3)     // Catch:{ all -> 0x009f }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x009f }
            java.lang.String r2 = r2.getParent()     // Catch:{ all -> 0x009f }
            r1.<init>(r2)     // Catch:{ all -> 0x009f }
            boolean r2 = r1.exists()     // Catch:{ all -> 0x009f }
            if (r2 != 0) goto L_0x003e
            boolean r2 = r1.mkdirs()     // Catch:{ all -> 0x009f }
            if (r2 != 0) goto L_0x003e
            boolean r2 = r1.exists()     // Catch:{ all -> 0x009f }
            if (r2 != 0) goto L_0x003e
            java.lang.String r2 = "sqlite_error"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x009f }
            r5.<init>()     // Catch:{ all -> 0x009f }
            java.lang.String r6 = "open_failed "
            r5.append(r6)     // Catch:{ all -> 0x009f }
            r5.append(r3)     // Catch:{ all -> 0x009f }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x009f }
            r5 = 0
            r4.mo339b(r2, r3, r5)     // Catch:{ all -> 0x009f }
            monitor-exit(r0)     // Catch:{ all -> 0x009f }
            return
        L_0x003e:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x00a1 }
            boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x00a1 }
            if (r2 == 0) goto L_0x004a
            r6.mo12729L()     // Catch:{ Exception -> 0x00a1 }
            goto L_0x004d
        L_0x004a:
            r6.mo12728K()     // Catch:{ Exception -> 0x00a1 }
        L_0x004d:
            java.lang.Object r2 = f19211e     // Catch:{ all -> 0x009f }
            monitor-enter(r2)     // Catch:{ all -> 0x009f }
            if (r8 == 0) goto L_0x005b
            java.util.Map<java.lang.String, java.lang.Integer> r5 = f19209c     // Catch:{ all -> 0x009c }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x009c }
            r5.put(r3, r7)     // Catch:{ all -> 0x009c }
        L_0x005b:
            java.util.Map<java.lang.Integer, h3.i> r5 = f19210d     // Catch:{ all -> 0x009c }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x009c }
            r5.put(r7, r6)     // Catch:{ all -> 0x009c }
            monitor-exit(r2)     // Catch:{ all -> 0x009c }
            int r2 = r6.f19244d     // Catch:{ all -> 0x009f }
            boolean r2 = p056h3.C2727r.m21752b(r2)     // Catch:{ all -> 0x009f }
            if (r2 == 0) goto L_0x0092
            java.lang.String r2 = "Sqflite"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x009f }
            r5.<init>()     // Catch:{ all -> 0x009f }
            java.lang.String r6 = r6.mo12738y()     // Catch:{ all -> 0x009f }
            r5.append(r6)     // Catch:{ all -> 0x009f }
            java.lang.String r6 = "opened "
            r5.append(r6)     // Catch:{ all -> 0x009f }
            r5.append(r9)     // Catch:{ all -> 0x009f }
            java.lang.String r6 = " "
            r5.append(r6)     // Catch:{ all -> 0x009f }
            r5.append(r3)     // Catch:{ all -> 0x009f }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x009f }
            android.util.Log.d(r2, r3)     // Catch:{ all -> 0x009f }
        L_0x0092:
            monitor-exit(r0)     // Catch:{ all -> 0x009f }
            r2 = 0
            java.util.Map r2 = m21664x(r9, r2, r2)
            r4.mo338a(r2)
            return
        L_0x009c:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x009c }
            throw r3     // Catch:{ all -> 0x009f }
        L_0x009f:
            r2 = move-exception
            goto L_0x00ac
        L_0x00a1:
            r2 = move-exception
            j3.d r3 = new j3.d     // Catch:{ all -> 0x009f }
            r3.<init>(r7, r4)     // Catch:{ all -> 0x009f }
            r6.mo12725B(r2, r3)     // Catch:{ all -> 0x009f }
            monitor-exit(r0)     // Catch:{ all -> 0x009f }
            return
        L_0x00ac:
            monitor-exit(r0)     // Catch:{ all -> 0x009f }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p056h3.C2706c0.m21659s(boolean, java.lang.String, a4.k$d, java.lang.Boolean, h3.i, a4.j, boolean, int):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static /* synthetic */ void m21662v(C0144j jVar, C2716i iVar, C0145k.C0150d dVar) {
        try {
            iVar.f19249i.setLocale(C2712e0.m21679e((String) jVar.mo332a("locale")));
            dVar.mo338a((Object) null);
        } catch (Exception e) {
            dVar.mo339b("sqlite_error", "Error calling setLocale: " + e.getMessage(), (Object) null);
        }
    }

    /* renamed from: x */
    static Map m21664x(int i, boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", Integer.valueOf(i));
        if (z) {
            hashMap.put("recovered", Boolean.TRUE);
        }
        if (z2) {
            hashMap.put("recoveredInTransaction", Boolean.TRUE);
        }
        return hashMap;
    }

    /* renamed from: y */
    private void m21665y(Context context, C0128c cVar) {
        this.f19219a = context;
        C0145k kVar = new C0145k(cVar, "com.tekartik.sqflite", C0159s.f284b, cVar.mo313b());
        this.f19220b = kVar;
        kVar.mo337e(this);
    }

    /* renamed from: z */
    private void m21666z(C0144j jVar, C0145k.C0150d dVar) {
        C2716i n = m21654n(jVar, dVar);
        if (n != null) {
            f19218l.mo12754c(n, new C2702a0(n, jVar, dVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo12708G(C0144j jVar, C0145k.C0150d dVar) {
        if (f19214h == null) {
            f19214h = this.f19219a.getDatabasePath("tekartik_sqflite.db").getParent();
        }
        dVar.mo338a(f19214h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo12709J(C0144j jVar, C0145k.C0150d dVar) {
        Object a = jVar.mo332a("androidThreadPriority");
        if (a != null) {
            f19215i = ((Integer) a).intValue();
        }
        Object a2 = jVar.mo332a("androidThreadCount");
        if (a2 != null && !a2.equals(Integer.valueOf(f19216j))) {
            f19216j = ((Integer) a2).intValue();
            C2724o oVar = f19218l;
            if (oVar != null) {
                oVar.mo12753b();
                f19218l = null;
            }
        }
        Integer a3 = C2727r.m21751a(jVar);
        if (a3 != null) {
            f19213g = a3.intValue();
        }
        dVar.mo338a((Object) null);
    }

    public void onAttachedToEngine(C4047a.C4049b bVar) {
        m21665y(bVar.mo15539a(), bVar.mo15540b());
    }

    public void onDetachedFromEngine(C4047a.C4049b bVar) {
        this.f19219a = null;
        this.f19220b.mo337e((C0145k.C0149c) null);
        this.f19220b = null;
    }

    public void onMethodCall(C0144j jVar, C0145k.C0150d dVar) {
        String str = jVar.f269a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1319569547:
                if (str.equals("execute")) {
                    c = 0;
                    break;
                }
                break;
            case -1253581933:
                if (str.equals("closeDatabase")) {
                    c = 1;
                    break;
                }
                break;
            case -1249474914:
                if (str.equals("options")) {
                    c = 2;
                    break;
                }
                break;
            case -1183792455:
                if (str.equals("insert")) {
                    c = 3;
                    break;
                }
                break;
            case -838846263:
                if (str.equals("update")) {
                    c = 4;
                    break;
                }
                break;
            case -396289107:
                if (str.equals("androidSetLocale")) {
                    c = 5;
                    break;
                }
                break;
            case -263511994:
                if (str.equals("deleteDatabase")) {
                    c = 6;
                    break;
                }
                break;
            case -198450538:
                if (str.equals("debugMode")) {
                    c = 7;
                    break;
                }
                break;
            case -17190427:
                if (str.equals("openDatabase")) {
                    c = 8;
                    break;
                }
                break;
            case 93509434:
                if (str.equals("batch")) {
                    c = 9;
                    break;
                }
                break;
            case 95458899:
                if (str.equals("debug")) {
                    c = 10;
                    break;
                }
                break;
            case 107944136:
                if (str.equals("query")) {
                    c = 11;
                    break;
                }
                break;
            case 956410295:
                if (str.equals("databaseExists")) {
                    c = 12;
                    break;
                }
                break;
            case 1193546321:
                if (str.equals("queryCursorNext")) {
                    c = 13;
                    break;
                }
                break;
            case 1385449135:
                if (str.equals("getPlatformVersion")) {
                    c = 14;
                    break;
                }
                break;
            case 1863829223:
                if (str.equals("getDatabasesPath")) {
                    c = 15;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                m21634F(jVar, dVar);
                return;
            case 1:
                m21629A(jVar, dVar);
                return;
            case 2:
                mo12709J(jVar, dVar);
                return;
            case 3:
                m21635H(jVar, dVar);
                return;
            case 4:
                m21640N(jVar, dVar);
                return;
            case 5:
                m21639M(jVar, dVar);
                return;
            case 6:
                m21633E(jVar, dVar);
                return;
            case 7:
                m21632D(jVar, dVar);
                return;
            case 8:
                m21636I(jVar, dVar);
                return;
            case 9:
                m21666z(jVar, dVar);
                return;
            case 10:
                m21631C(jVar, dVar);
                return;
            case 11:
                m21637K(jVar, dVar);
                return;
            case 12:
                m21630B(jVar, dVar);
                return;
            case 13:
                m21638L(jVar, dVar);
                return;
            case 14:
                dVar.mo338a("Android " + Build.VERSION.RELEASE);
                return;
            case 15:
                mo12708G(jVar, dVar);
                return;
            default:
                dVar.mo340c();
                return;
        }
    }
}
