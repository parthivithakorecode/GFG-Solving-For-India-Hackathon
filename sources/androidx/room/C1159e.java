package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import p053h0.C2665a;
import p053h0.C2666b;
import p053h0.C2674f;
import p074k.C3286b;

/* renamed from: androidx.room.e */
public class C1159e {

    /* renamed from: m */
    private static final String[] f3079m = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a */
    final HashMap<String, Integer> f3080a;

    /* renamed from: b */
    final String[] f3081b;

    /* renamed from: c */
    private Map<String, Set<String>> f3082c;

    /* renamed from: d */
    final C1173h f3083d;

    /* renamed from: e */
    AtomicBoolean f3084e = new AtomicBoolean(false);

    /* renamed from: f */
    private volatile boolean f3085f = false;

    /* renamed from: g */
    volatile C2674f f3086g;

    /* renamed from: h */
    private C1161b f3087h;

    /* renamed from: i */
    private final C1158d f3088i;
    @SuppressLint({"RestrictedApi"})

    /* renamed from: j */
    final C3286b<C1162c, C1163d> f3089j = new C3286b<>();

    /* renamed from: k */
    private C1164f f3090k;

    /* renamed from: l */
    Runnable f3091l = new C1160a();

    /* renamed from: androidx.room.e$a */
    class C1160a implements Runnable {
        C1160a() {
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        private Set<Integer> m4703a() {
            HashSet hashSet = new HashSet();
            Cursor p = C1159e.this.f3083d.mo3963p(new C2665a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (p.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(p.getInt(0)));
                } catch (Throwable th) {
                    p.close();
                    throw th;
                }
            }
            p.close();
            if (!hashSet.isEmpty()) {
                C1159e.this.f3086g.mo12665k();
            }
            return hashSet;
        }

        public void run() {
            C2666b J;
            Lock h = C1159e.this.f3083d.mo3956h();
            Set<Integer> set = null;
            try {
                h.lock();
                if (!C1159e.this.mo3926c()) {
                    h.unlock();
                } else if (!C1159e.this.f3084e.compareAndSet(true, false)) {
                    h.unlock();
                } else if (C1159e.this.f3083d.mo3959k()) {
                    h.unlock();
                } else {
                    C1173h hVar = C1159e.this.f3083d;
                    if (hVar.f3130g) {
                        J = hVar.mo3957i().mo3991J();
                        J.mo12649f();
                        set = m4703a();
                        J.mo12658y();
                        J.mo12648e();
                    } else {
                        set = m4703a();
                    }
                    h.unlock();
                    if (set != null && !set.isEmpty()) {
                        synchronized (C1159e.this.f3089j) {
                            Iterator<Map.Entry<C1162c, C1163d>> it = C1159e.this.f3089j.iterator();
                            while (it.hasNext()) {
                                ((C1163d) it.next().getValue()).mo3941a(set);
                            }
                        }
                    }
                }
            } catch (SQLiteException | IllegalStateException e) {
                try {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                } catch (Throwable th) {
                    h.unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                J.mo12648e();
                throw th2;
            }
        }
    }

    /* renamed from: androidx.room.e$b */
    static class C1161b {

        /* renamed from: a */
        final long[] f3093a;

        /* renamed from: b */
        final boolean[] f3094b;

        /* renamed from: c */
        final int[] f3095c;

        /* renamed from: d */
        boolean f3096d;

        /* renamed from: e */
        boolean f3097e;

        C1161b(int i) {
            long[] jArr = new long[i];
            this.f3093a = jArr;
            boolean[] zArr = new boolean[i];
            this.f3094b = zArr;
            this.f3095c = new int[i];
            Arrays.fill(jArr, 0);
            Arrays.fill(zArr, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int[] mo3935a() {
            synchronized (this) {
                if (this.f3096d) {
                    if (!this.f3097e) {
                        int length = this.f3093a.length;
                        int i = 0;
                        while (true) {
                            int i2 = 1;
                            if (i < length) {
                                boolean z = this.f3093a[i] > 0;
                                boolean[] zArr = this.f3094b;
                                if (z != zArr[i]) {
                                    int[] iArr = this.f3095c;
                                    if (!z) {
                                        i2 = 2;
                                    }
                                    iArr[i] = i2;
                                } else {
                                    this.f3095c[i] = 0;
                                }
                                zArr[i] = z;
                                i++;
                            } else {
                                this.f3097e = true;
                                this.f3096d = false;
                                int[] iArr2 = this.f3095c;
                                return iArr2;
                            }
                        }
                    }
                }
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo3936b(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.f3093a;
                    long j = jArr[i];
                    jArr[i] = 1 + j;
                    if (j == 0) {
                        this.f3096d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo3937c(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.f3093a;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        this.f3096d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo3938d() {
            synchronized (this) {
                this.f3097e = false;
            }
        }
    }

    /* renamed from: androidx.room.e$c */
    public static abstract class C1162c {

        /* renamed from: a */
        final String[] f3098a;

        public C1162c(String[] strArr) {
            this.f3098a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3939a() {
            return false;
        }

        /* renamed from: b */
        public abstract void mo3940b(Set<String> set);
    }

    /* renamed from: androidx.room.e$d */
    static class C1163d {

        /* renamed from: a */
        final int[] f3099a;

        /* renamed from: b */
        private final String[] f3100b;

        /* renamed from: c */
        final C1162c f3101c;

        /* renamed from: d */
        private final Set<String> f3102d;

        C1163d(C1162c cVar, int[] iArr, String[] strArr) {
            Set<String> set;
            this.f3101c = cVar;
            this.f3099a = iArr;
            this.f3100b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(strArr[0]);
                set = Collections.unmodifiableSet(hashSet);
            } else {
                set = null;
            }
            this.f3102d = set;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3941a(Set<Integer> set) {
            int length = this.f3099a.length;
            Set set2 = null;
            for (int i = 0; i < length; i++) {
                if (set.contains(Integer.valueOf(this.f3099a[i]))) {
                    if (length == 1) {
                        set2 = this.f3102d;
                    } else {
                        if (set2 == null) {
                            set2 = new HashSet(length);
                        }
                        set2.add(this.f3100b[i]);
                    }
                }
            }
            if (set2 != null) {
                this.f3101c.mo3940b(set2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3942b(String[] strArr) {
            Set<String> set = null;
            if (this.f3100b.length == 1) {
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (strArr[i].equalsIgnoreCase(this.f3100b[0])) {
                        set = this.f3102d;
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.f3100b;
                    int length2 = strArr2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            break;
                        }
                        String str2 = strArr2[i2];
                        if (str2.equalsIgnoreCase(str)) {
                            hashSet.add(str2);
                            break;
                        }
                        i2++;
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f3101c.mo3940b(set);
            }
        }
    }

    public C1159e(C1173h hVar, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f3083d = hVar;
        this.f3087h = new C1161b(strArr.length);
        this.f3080a = new HashMap<>();
        this.f3082c = map2;
        this.f3088i = new C1158d(hVar);
        int length = strArr.length;
        this.f3081b = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f3080a.put(lowerCase, Integer.valueOf(i));
            String str2 = map.get(strArr[i]);
            if (str2 != null) {
                this.f3081b[i] = str2.toLowerCase(locale);
            } else {
                this.f3081b[i] = lowerCase;
            }
        }
        for (Map.Entry next : map.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase2 = ((String) next.getValue()).toLowerCase(locale2);
            if (this.f3080a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) next.getKey()).toLowerCase(locale2);
                HashMap<String, Integer> hashMap = this.f3080a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    /* renamed from: b */
    private static void m4690b(StringBuilder sb, String str, String str2) {
        sb.append("`");
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }

    /* renamed from: h */
    private String[] m4691h(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f3082c.containsKey(lowerCase)) {
                hashSet.addAll(this.f3082c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    /* renamed from: j */
    private void m4692j(C2666b bVar, int i) {
        bVar.mo12651i("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.f3081b[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f3079m) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            m4690b(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            bVar.mo12651i(sb.toString());
        }
    }

    /* renamed from: k */
    private void m4693k(C2666b bVar, int i) {
        String str = this.f3081b[i];
        StringBuilder sb = new StringBuilder();
        for (String b : f3079m) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            m4690b(sb, str, b);
            bVar.mo12651i(sb.toString());
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: a */
    public void mo3925a(C1162c cVar) {
        C1163d m;
        String[] h = m4691h(cVar.f3098a);
        int[] iArr = new int[h.length];
        int length = h.length;
        int i = 0;
        while (i < length) {
            Integer num = this.f3080a.get(h[i].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i] = num.intValue();
                i++;
            } else {
                throw new IllegalArgumentException("There is no table with name " + h[i]);
            }
        }
        C1163d dVar = new C1163d(cVar, iArr, h);
        synchronized (this.f3089j) {
            m = this.f3089j.mo14272m(cVar, dVar);
        }
        if (m == null && this.f3087h.mo3936b(iArr)) {
            mo3932l();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo3926c() {
        if (!this.f3083d.mo3962o()) {
            return false;
        }
        if (!this.f3085f) {
            this.f3083d.mo3957i().mo3991J();
        }
        if (this.f3085f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3927d(C2666b bVar) {
        synchronized (this) {
            if (this.f3085f) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            bVar.mo12651i("PRAGMA temp_store = MEMORY;");
            bVar.mo12651i("PRAGMA recursive_triggers='ON';");
            bVar.mo12651i("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            mo3933m(bVar);
            this.f3086g = bVar.mo12653l("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            this.f3085f = true;
        }
    }

    /* renamed from: e */
    public void mo3928e(String... strArr) {
        synchronized (this.f3089j) {
            Iterator<Map.Entry<C1162c, C1163d>> it = this.f3089j.iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                if (!((C1162c) next.getKey()).mo3939a()) {
                    ((C1163d) next.getValue()).mo3942b(strArr);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo3929f() {
        if (this.f3084e.compareAndSet(false, true)) {
            this.f3083d.mo3958j().execute(this.f3091l);
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: g */
    public void mo3930g(C1162c cVar) {
        C1163d n;
        synchronized (this.f3089j) {
            n = this.f3089j.mo14273n(cVar);
        }
        if (n != null && this.f3087h.mo3937c(n.f3099a)) {
            mo3932l();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo3931i(Context context, String str) {
        this.f3090k = new C1164f(context, str, this, this.f3083d.mo3958j());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo3932l() {
        if (this.f3083d.mo3962o()) {
            mo3933m(this.f3083d.mo3957i().mo3991J());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo3933m(C2666b bVar) {
        if (!bVar.mo12656s()) {
            while (true) {
                try {
                    Lock h = this.f3083d.mo3956h();
                    h.lock();
                    try {
                        int[] a = this.f3087h.mo3935a();
                        if (a == null) {
                            h.unlock();
                            return;
                        }
                        int length = a.length;
                        bVar.mo12649f();
                        for (int i = 0; i < length; i++) {
                            int i2 = a[i];
                            if (i2 == 1) {
                                m4692j(bVar, i);
                            } else if (i2 == 2) {
                                m4693k(bVar, i);
                            }
                        }
                        bVar.mo12658y();
                        bVar.mo12648e();
                        this.f3087h.mo3938d();
                        h.unlock();
                    } catch (Throwable th) {
                        h.unlock();
                        throw th;
                    }
                } catch (SQLiteException | IllegalStateException e) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                    return;
                }
            }
        }
    }
}
