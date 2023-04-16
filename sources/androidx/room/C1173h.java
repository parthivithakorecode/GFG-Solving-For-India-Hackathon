package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p032e0.C2537a;
import p053h0.C2666b;
import p053h0.C2667c;
import p053h0.C2673e;
import p053h0.C2674f;

/* renamed from: androidx.room.h */
public abstract class C1173h {
    @Deprecated

    /* renamed from: a */
    protected volatile C2666b f3124a;

    /* renamed from: b */
    private Executor f3125b;

    /* renamed from: c */
    private Executor f3126c;

    /* renamed from: d */
    private C2667c f3127d;

    /* renamed from: e */
    private final C1159e f3128e = mo3953e();

    /* renamed from: f */
    private boolean f3129f;

    /* renamed from: g */
    boolean f3130g;
    @Deprecated

    /* renamed from: h */
    protected List<C1175b> f3131h;

    /* renamed from: i */
    private final ReentrantReadWriteLock f3132i = new ReentrantReadWriteLock();

    /* renamed from: j */
    private final ThreadLocal<Integer> f3133j = new ThreadLocal<>();

    /* renamed from: k */
    private final Map<String, Object> f3134k = new ConcurrentHashMap();

    /* renamed from: androidx.room.h$a */
    public static class C1174a<T extends C1173h> {

        /* renamed from: a */
        private final Class<T> f3135a;

        /* renamed from: b */
        private final String f3136b;

        /* renamed from: c */
        private final Context f3137c;

        /* renamed from: d */
        private ArrayList<C1175b> f3138d;

        /* renamed from: e */
        private Executor f3139e;

        /* renamed from: f */
        private Executor f3140f;

        /* renamed from: g */
        private C2667c.C2671c f3141g;

        /* renamed from: h */
        private boolean f3142h;

        /* renamed from: i */
        private C1176c f3143i = C1176c.AUTOMATIC;

        /* renamed from: j */
        private boolean f3144j;

        /* renamed from: k */
        private boolean f3145k = true;

        /* renamed from: l */
        private boolean f3146l;

        /* renamed from: m */
        private final C1177d f3147m = new C1177d();

        /* renamed from: n */
        private Set<Integer> f3148n;

        /* renamed from: o */
        private Set<Integer> f3149o;

        /* renamed from: p */
        private String f3150p;

        /* renamed from: q */
        private File f3151q;

        C1174a(Context context, Class<T> cls, String str) {
            this.f3137c = context;
            this.f3135a = cls;
            this.f3136b = str;
        }

        /* renamed from: a */
        public C1174a<T> mo3966a(C1175b bVar) {
            if (this.f3138d == null) {
                this.f3138d = new ArrayList<>();
            }
            this.f3138d.add(bVar);
            return this;
        }

        /* renamed from: b */
        public C1174a<T> mo3967b(C2537a... aVarArr) {
            if (this.f3149o == null) {
                this.f3149o = new HashSet();
            }
            for (C2537a aVar : aVarArr) {
                this.f3149o.add(Integer.valueOf(aVar.f18642a));
                this.f3149o.add(Integer.valueOf(aVar.f18643b));
            }
            this.f3147m.mo3977b(aVarArr);
            return this;
        }

        /* renamed from: c */
        public C1174a<T> mo3968c() {
            this.f3142h = true;
            return this;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
            if (r1 != null) goto L_0x0018;
         */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x003d  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0067  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x007a  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00d4  */
        @android.annotation.SuppressLint({"RestrictedApi"})
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public T mo3969d() {
            /*
                r21 = this;
                r0 = r21
                android.content.Context r1 = r0.f3137c
                if (r1 == 0) goto L_0x00e4
                java.lang.Class<T> r1 = r0.f3135a
                if (r1 == 0) goto L_0x00dc
                java.util.concurrent.Executor r1 = r0.f3139e
                if (r1 != 0) goto L_0x001b
                java.util.concurrent.Executor r2 = r0.f3140f
                if (r2 != 0) goto L_0x001b
                java.util.concurrent.Executor r1 = p067j.C3127a.m23805d()
                r0.f3140f = r1
            L_0x0018:
                r0.f3139e = r1
                goto L_0x002b
            L_0x001b:
                if (r1 == 0) goto L_0x0024
                java.util.concurrent.Executor r2 = r0.f3140f
                if (r2 != 0) goto L_0x0024
                r0.f3140f = r1
                goto L_0x002b
            L_0x0024:
                if (r1 != 0) goto L_0x002b
                java.util.concurrent.Executor r1 = r0.f3140f
                if (r1 == 0) goto L_0x002b
                goto L_0x0018
            L_0x002b:
                java.util.Set<java.lang.Integer> r1 = r0.f3149o
                if (r1 == 0) goto L_0x0063
                java.util.Set<java.lang.Integer> r2 = r0.f3148n
                if (r2 == 0) goto L_0x0063
                java.util.Iterator r1 = r1.iterator()
            L_0x0037:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x0063
                java.lang.Object r2 = r1.next()
                java.lang.Integer r2 = (java.lang.Integer) r2
                java.util.Set<java.lang.Integer> r3 = r0.f3148n
                boolean r3 = r3.contains(r2)
                if (r3 != 0) goto L_0x004c
                goto L_0x0037
            L_0x004c:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: "
                r3.append(r4)
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
            L_0x0063:
                h0.c$c r1 = r0.f3141g
                if (r1 != 0) goto L_0x006e
                i0.c r1 = new i0.c
                r1.<init>()
                r0.f3141g = r1
            L_0x006e:
                java.lang.String r1 = r0.f3150p
                if (r1 != 0) goto L_0x0076
                java.io.File r2 = r0.f3151q
                if (r2 == 0) goto L_0x0094
            L_0x0076:
                java.lang.String r2 = r0.f3136b
                if (r2 == 0) goto L_0x00d4
                if (r1 == 0) goto L_0x0089
                java.io.File r2 = r0.f3151q
                if (r2 != 0) goto L_0x0081
                goto L_0x0089
            L_0x0081:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Both createFromAsset() and createFromFile() was called on this Builder but the database can only be created using one of the two configurations."
                r1.<init>(r2)
                throw r1
            L_0x0089:
                androidx.room.k r2 = new androidx.room.k
                java.io.File r3 = r0.f3151q
                h0.c$c r4 = r0.f3141g
                r2.<init>(r1, r3, r4)
                r0.f3141g = r2
            L_0x0094:
                androidx.room.a r1 = new androidx.room.a
                android.content.Context r6 = r0.f3137c
                java.lang.String r7 = r0.f3136b
                h0.c$c r8 = r0.f3141g
                androidx.room.h$d r9 = r0.f3147m
                java.util.ArrayList<androidx.room.h$b> r10 = r0.f3138d
                boolean r11 = r0.f3142h
                androidx.room.h$c r2 = r0.f3143i
                androidx.room.h$c r12 = r2.mo3976d(r6)
                java.util.concurrent.Executor r13 = r0.f3139e
                java.util.concurrent.Executor r14 = r0.f3140f
                boolean r15 = r0.f3144j
                boolean r2 = r0.f3145k
                boolean r3 = r0.f3146l
                java.util.Set<java.lang.Integer> r4 = r0.f3148n
                java.lang.String r5 = r0.f3150p
                r18 = r4
                java.io.File r4 = r0.f3151q
                r19 = r5
                r5 = r1
                r16 = r2
                r17 = r3
                r20 = r4
                r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                java.lang.Class<T> r2 = r0.f3135a
                java.lang.String r3 = "_Impl"
                java.lang.Object r2 = androidx.room.C1172g.m4716b(r2, r3)
                androidx.room.h r2 = (androidx.room.C1173h) r2
                r2.mo3960l(r1)
                return r2
            L_0x00d4:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Cannot create from asset or file for an in-memory database."
                r1.<init>(r2)
                throw r1
            L_0x00dc:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Must provide an abstract class that extends RoomDatabase"
                r1.<init>(r2)
                throw r1
            L_0x00e4:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Cannot provide null context for the database."
                r1.<init>(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.C1173h.C1174a.mo3969d():androidx.room.h");
        }

        /* renamed from: e */
        public C1174a<T> mo3970e() {
            this.f3145k = false;
            this.f3146l = true;
            return this;
        }

        /* renamed from: f */
        public C1174a<T> mo3971f(C2667c.C2671c cVar) {
            this.f3141g = cVar;
            return this;
        }

        /* renamed from: g */
        public C1174a<T> mo3972g(Executor executor) {
            this.f3139e = executor;
            return this;
        }
    }

    /* renamed from: androidx.room.h$b */
    public static abstract class C1175b {
        /* renamed from: a */
        public void mo3973a(C2666b bVar) {
        }

        /* renamed from: b */
        public void mo3974b(C2666b bVar) {
        }

        /* renamed from: c */
        public void mo3975c(C2666b bVar) {
        }
    }

    /* renamed from: androidx.room.h$c */
    public enum C1176c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        /* renamed from: b */
        private static boolean m4746b(ActivityManager activityManager) {
            if (Build.VERSION.SDK_INT >= 19) {
                return activityManager.isLowRamDevice();
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
            r3 = (android.app.ActivityManager) r3.getSystemService("activity");
         */
        @android.annotation.SuppressLint({"NewApi"})
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.room.C1173h.C1176c mo3976d(android.content.Context r3) {
            /*
                r2 = this;
                androidx.room.h$c r0 = AUTOMATIC
                if (r2 == r0) goto L_0x0005
                return r2
            L_0x0005:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 16
                if (r0 < r1) goto L_0x001e
                java.lang.String r0 = "activity"
                java.lang.Object r3 = r3.getSystemService(r0)
                android.app.ActivityManager r3 = (android.app.ActivityManager) r3
                if (r3 == 0) goto L_0x001e
                boolean r3 = m4746b(r3)
                if (r3 != 0) goto L_0x001e
                androidx.room.h$c r3 = WRITE_AHEAD_LOGGING
                return r3
            L_0x001e:
                androidx.room.h$c r3 = TRUNCATE
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.C1173h.C1176c.mo3976d(android.content.Context):androidx.room.h$c");
        }
    }

    /* renamed from: androidx.room.h$d */
    public static class C1177d {

        /* renamed from: a */
        private HashMap<Integer, TreeMap<Integer, C2537a>> f3156a = new HashMap<>();

        /* renamed from: a */
        private void m4748a(C2537a aVar) {
            int i = aVar.f18642a;
            int i2 = aVar.f18643b;
            TreeMap treeMap = this.f3156a.get(Integer.valueOf(i));
            if (treeMap == null) {
                treeMap = new TreeMap();
                this.f3156a.put(Integer.valueOf(i), treeMap);
            }
            C2537a aVar2 = (C2537a) treeMap.get(Integer.valueOf(i2));
            if (aVar2 != null) {
                Log.w("ROOM", "Overriding migration " + aVar2 + " with " + aVar);
            }
            treeMap.put(Integer.valueOf(i2), aVar);
        }

        /* renamed from: d */
        private List<C2537a> m4749d(List<C2537a> list, boolean z, int i, int i2) {
            boolean z2;
            do {
                if (z) {
                    if (i >= i2) {
                        return list;
                    }
                } else if (i <= i2) {
                    return list;
                }
                TreeMap treeMap = this.f3156a.get(Integer.valueOf(i));
                if (treeMap != null) {
                    Iterator it = (z ? treeMap.descendingKeySet() : treeMap.keySet()).iterator();
                    while (true) {
                        z2 = true;
                        boolean z3 = false;
                        if (!it.hasNext()) {
                            z2 = false;
                            continue;
                            break;
                        }
                        int intValue = ((Integer) it.next()).intValue();
                        if (!z ? !(intValue < i2 || intValue >= i) : !(intValue > i2 || intValue <= i)) {
                            z3 = true;
                            continue;
                        }
                        if (z3) {
                            list.add(treeMap.get(Integer.valueOf(intValue)));
                            i = intValue;
                            continue;
                            break;
                        }
                    }
                } else {
                    return null;
                }
            } while (z2);
            return null;
        }

        /* renamed from: b */
        public void mo3977b(C2537a... aVarArr) {
            for (C2537a a : aVarArr) {
                m4748a(a);
            }
        }

        /* renamed from: c */
        public List<C2537a> mo3978c(int i, int i2) {
            if (i == i2) {
                return Collections.emptyList();
            }
            return m4749d(new ArrayList(), i2 > i, i, i2);
        }
    }

    /* renamed from: n */
    private static boolean m4718n() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: a */
    public void mo3949a() {
        if (!this.f3129f && m4718n()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    /* renamed from: b */
    public void mo3950b() {
        if (!mo3959k() && this.f3133j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    /* renamed from: c */
    public void mo3951c() {
        mo3949a();
        C2666b J = this.f3127d.mo3991J();
        this.f3128e.mo3933m(J);
        J.mo12649f();
    }

    /* renamed from: d */
    public C2674f mo3952d(String str) {
        mo3949a();
        mo3950b();
        return this.f3127d.mo3991J().mo12653l(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract C1159e mo3953e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract C2667c mo3954f(C1151a aVar);

    @Deprecated
    /* renamed from: g */
    public void mo3955g() {
        this.f3127d.mo3991J().mo12648e();
        if (!mo3959k()) {
            this.f3128e.mo3929f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Lock mo3956h() {
        return this.f3132i.readLock();
    }

    /* renamed from: i */
    public C2667c mo3957i() {
        return this.f3127d;
    }

    /* renamed from: j */
    public Executor mo3958j() {
        return this.f3125b;
    }

    /* renamed from: k */
    public boolean mo3959k() {
        return this.f3127d.mo3991J().mo12656s();
    }

    /* renamed from: l */
    public void mo3960l(C1151a aVar) {
        C2667c f = mo3954f(aVar);
        this.f3127d = f;
        if (f instanceof C1181j) {
            ((C1181j) f).mo3994h(aVar);
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 16) {
            if (aVar.f3066g == C1176c.WRITE_AHEAD_LOGGING) {
                z = true;
            }
            this.f3127d.setWriteAheadLoggingEnabled(z);
        }
        this.f3131h = aVar.f3064e;
        this.f3125b = aVar.f3067h;
        this.f3126c = new C1183l(aVar.f3068i);
        this.f3129f = aVar.f3065f;
        this.f3130g = z;
        if (aVar.f3069j) {
            this.f3128e.mo3931i(aVar.f3061b, aVar.f3062c);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo3961m(C2666b bVar) {
        this.f3128e.mo3927d(bVar);
    }

    /* renamed from: o */
    public boolean mo3962o() {
        C2666b bVar = this.f3124a;
        return bVar != null && bVar.isOpen();
    }

    /* renamed from: p */
    public Cursor mo3963p(C2673e eVar) {
        return mo3964q(eVar, (CancellationSignal) null);
    }

    /* renamed from: q */
    public Cursor mo3964q(C2673e eVar, CancellationSignal cancellationSignal) {
        mo3949a();
        mo3950b();
        return (cancellationSignal == null || Build.VERSION.SDK_INT < 16) ? this.f3127d.mo3991J().mo12657t(eVar) : this.f3127d.mo3991J().mo12654o(eVar, cancellationSignal);
    }

    @Deprecated
    /* renamed from: r */
    public void mo3965r() {
        this.f3127d.mo3991J().mo12658y();
    }
}
