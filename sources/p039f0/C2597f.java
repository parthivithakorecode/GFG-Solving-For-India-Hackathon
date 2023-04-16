package p039f0;

import android.database.Cursor;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p053h0.C2666b;

/* renamed from: f0.f */
public class C2597f {

    /* renamed from: a */
    public final String f18944a;

    /* renamed from: b */
    public final Map<String, C2598a> f18945b;

    /* renamed from: c */
    public final Set<C2599b> f18946c;

    /* renamed from: d */
    public final Set<C2601d> f18947d;

    /* renamed from: f0.f$a */
    public static class C2598a {

        /* renamed from: a */
        public final String f18948a;

        /* renamed from: b */
        public final String f18949b;

        /* renamed from: c */
        public final int f18950c;

        /* renamed from: d */
        public final boolean f18951d;

        /* renamed from: e */
        public final int f18952e;

        /* renamed from: f */
        public final String f18953f;

        /* renamed from: g */
        private final int f18954g;

        public C2598a(String str, String str2, boolean z, int i, String str3, int i2) {
            this.f18948a = str;
            this.f18949b = str2;
            this.f18951d = z;
            this.f18952e = i;
            this.f18950c = m21288a(str2);
            this.f18953f = str3;
            this.f18954g = i2;
        }

        /* renamed from: a */
        private static int m21288a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        /* renamed from: b */
        public boolean mo12479b() {
            return this.f18952e > 0;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C2598a aVar = (C2598a) obj;
            if (Build.VERSION.SDK_INT >= 20) {
                if (this.f18952e != aVar.f18952e) {
                    return false;
                }
            } else if (mo12479b() != aVar.mo12479b()) {
                return false;
            }
            if (!this.f18948a.equals(aVar.f18948a) || this.f18951d != aVar.f18951d) {
                return false;
            }
            if (this.f18954g == 1 && aVar.f18954g == 2 && (str3 = this.f18953f) != null && !str3.equals(aVar.f18953f)) {
                return false;
            }
            if (this.f18954g == 2 && aVar.f18954g == 1 && (str2 = aVar.f18953f) != null && !str2.equals(this.f18953f)) {
                return false;
            }
            int i = this.f18954g;
            if (i == 0 || i != aVar.f18954g || ((str = this.f18953f) == null ? aVar.f18953f == null : str.equals(aVar.f18953f))) {
                return this.f18950c == aVar.f18950c;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f18948a.hashCode() * 31) + this.f18950c) * 31) + (this.f18951d ? 1231 : 1237)) * 31) + this.f18952e;
        }

        public String toString() {
            return "Column{name='" + this.f18948a + '\'' + ", type='" + this.f18949b + '\'' + ", affinity='" + this.f18950c + '\'' + ", notNull=" + this.f18951d + ", primaryKeyPosition=" + this.f18952e + ", defaultValue='" + this.f18953f + '\'' + '}';
        }
    }

    /* renamed from: f0.f$b */
    public static class C2599b {

        /* renamed from: a */
        public final String f18955a;

        /* renamed from: b */
        public final String f18956b;

        /* renamed from: c */
        public final String f18957c;

        /* renamed from: d */
        public final List<String> f18958d;

        /* renamed from: e */
        public final List<String> f18959e;

        public C2599b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f18955a = str;
            this.f18956b = str2;
            this.f18957c = str3;
            this.f18958d = Collections.unmodifiableList(list);
            this.f18959e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C2599b bVar = (C2599b) obj;
            if (this.f18955a.equals(bVar.f18955a) && this.f18956b.equals(bVar.f18956b) && this.f18957c.equals(bVar.f18957c) && this.f18958d.equals(bVar.f18958d)) {
                return this.f18959e.equals(bVar.f18959e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f18955a.hashCode() * 31) + this.f18956b.hashCode()) * 31) + this.f18957c.hashCode()) * 31) + this.f18958d.hashCode()) * 31) + this.f18959e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f18955a + '\'' + ", onDelete='" + this.f18956b + '\'' + ", onUpdate='" + this.f18957c + '\'' + ", columnNames=" + this.f18958d + ", referenceColumnNames=" + this.f18959e + '}';
        }
    }

    /* renamed from: f0.f$c */
    static class C2600c implements Comparable<C2600c> {

        /* renamed from: f */
        final int f18960f;

        /* renamed from: g */
        final int f18961g;

        /* renamed from: h */
        final String f18962h;

        /* renamed from: i */
        final String f18963i;

        C2600c(int i, int i2, String str, String str2) {
            this.f18960f = i;
            this.f18961g = i2;
            this.f18962h = str;
            this.f18963i = str2;
        }

        /* renamed from: b */
        public int compareTo(C2600c cVar) {
            int i = this.f18960f - cVar.f18960f;
            return i == 0 ? this.f18961g - cVar.f18961g : i;
        }
    }

    /* renamed from: f0.f$d */
    public static class C2601d {

        /* renamed from: a */
        public final String f18964a;

        /* renamed from: b */
        public final boolean f18965b;

        /* renamed from: c */
        public final List<String> f18966c;

        public C2601d(String str, boolean z, List<String> list) {
            this.f18964a = str;
            this.f18965b = z;
            this.f18966c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C2601d dVar = (C2601d) obj;
            if (this.f18965b == dVar.f18965b && this.f18966c.equals(dVar.f18966c)) {
                return this.f18964a.startsWith("index_") ? dVar.f18964a.startsWith("index_") : this.f18964a.equals(dVar.f18964a);
            }
            return false;
        }

        public int hashCode() {
            return ((((this.f18964a.startsWith("index_") ? -1184239155 : this.f18964a.hashCode()) * 31) + (this.f18965b ? 1 : 0)) * 31) + this.f18966c.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f18964a + '\'' + ", unique=" + this.f18965b + ", columns=" + this.f18966c + '}';
        }
    }

    public C2597f(String str, Map<String, C2598a> map, Set<C2599b> set, Set<C2601d> set2) {
        this.f18944a = str;
        this.f18945b = Collections.unmodifiableMap(map);
        this.f18946c = Collections.unmodifiableSet(set);
        this.f18947d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    /* renamed from: a */
    public static C2597f m21282a(C2666b bVar, String str) {
        return new C2597f(str, m21283b(bVar, str), m21285d(bVar, str), m21287f(bVar, str));
    }

    /* renamed from: b */
    private static Map<String, C2598a> m21283b(C2666b bVar, String str) {
        Cursor M = bVar.mo12647M("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (M.getColumnCount() > 0) {
                int columnIndex = M.getColumnIndex("name");
                int columnIndex2 = M.getColumnIndex("type");
                int columnIndex3 = M.getColumnIndex("notnull");
                int columnIndex4 = M.getColumnIndex("pk");
                int columnIndex5 = M.getColumnIndex("dflt_value");
                while (M.moveToNext()) {
                    String string = M.getString(columnIndex);
                    hashMap.put(string, new C2598a(string, M.getString(columnIndex2), M.getInt(columnIndex3) != 0, M.getInt(columnIndex4), M.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            M.close();
        }
    }

    /* renamed from: c */
    private static List<C2600c> m21284c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new C2600c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: d */
    private static Set<C2599b> m21285d(C2666b bVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor M = bVar.mo12647M("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = M.getColumnIndex("id");
            int columnIndex2 = M.getColumnIndex("seq");
            int columnIndex3 = M.getColumnIndex("table");
            int columnIndex4 = M.getColumnIndex("on_delete");
            int columnIndex5 = M.getColumnIndex("on_update");
            List<C2600c> c = m21284c(M);
            int count = M.getCount();
            for (int i = 0; i < count; i++) {
                M.moveToPosition(i);
                if (M.getInt(columnIndex2) == 0) {
                    int i2 = M.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (C2600c next : c) {
                        if (next.f18960f == i2) {
                            arrayList.add(next.f18962h);
                            arrayList2.add(next.f18963i);
                        }
                    }
                    hashSet.add(new C2599b(M.getString(columnIndex3), M.getString(columnIndex4), M.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            M.close();
        }
    }

    /* renamed from: e */
    private static C2601d m21286e(C2666b bVar, String str, boolean z) {
        Cursor M = bVar.mo12647M("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = M.getColumnIndex("seqno");
            int columnIndex2 = M.getColumnIndex("cid");
            int columnIndex3 = M.getColumnIndex("name");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    TreeMap treeMap = new TreeMap();
                    while (M.moveToNext()) {
                        if (M.getInt(columnIndex2) >= 0) {
                            int i = M.getInt(columnIndex);
                            treeMap.put(Integer.valueOf(i), M.getString(columnIndex3));
                        }
                    }
                    ArrayList arrayList = new ArrayList(treeMap.size());
                    arrayList.addAll(treeMap.values());
                    C2601d dVar = new C2601d(str, z, arrayList);
                    M.close();
                    return dVar;
                }
            }
            return null;
        } finally {
            M.close();
        }
    }

    /* renamed from: f */
    private static Set<C2601d> m21287f(C2666b bVar, String str) {
        Cursor M = bVar.mo12647M("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = M.getColumnIndex("name");
            int columnIndex2 = M.getColumnIndex("origin");
            int columnIndex3 = M.getColumnIndex("unique");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    HashSet hashSet = new HashSet();
                    while (M.moveToNext()) {
                        if ("c".equals(M.getString(columnIndex2))) {
                            String string = M.getString(columnIndex);
                            boolean z = true;
                            if (M.getInt(columnIndex3) != 1) {
                                z = false;
                            }
                            C2601d e = m21286e(bVar, string, z);
                            if (e == null) {
                                M.close();
                                return null;
                            }
                            hashSet.add(e);
                        }
                    }
                    M.close();
                    return hashSet;
                }
            }
            return null;
        } finally {
            M.close();
        }
    }

    public boolean equals(Object obj) {
        Set<C2601d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2597f fVar = (C2597f) obj;
        String str = this.f18944a;
        if (str == null ? fVar.f18944a != null : !str.equals(fVar.f18944a)) {
            return false;
        }
        Map<String, C2598a> map = this.f18945b;
        if (map == null ? fVar.f18945b != null : !map.equals(fVar.f18945b)) {
            return false;
        }
        Set<C2599b> set2 = this.f18946c;
        if (set2 == null ? fVar.f18946c != null : !set2.equals(fVar.f18946c)) {
            return false;
        }
        Set<C2601d> set3 = this.f18947d;
        if (set3 == null || (set = fVar.f18947d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.f18944a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, C2598a> map = this.f18945b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<C2599b> set = this.f18946c;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "TableInfo{name='" + this.f18944a + '\'' + ", columns=" + this.f18945b + ", foreignKeys=" + this.f18946c + ", indices=" + this.f18947d + '}';
    }
}
