package p056h3;

import android.database.sqlite.SQLiteProgram;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: h3.d0 */
public class C2710d0 {

    /* renamed from: a */
    private final String f19230a;

    /* renamed from: b */
    private final List<Object> f19231b;

    public C2710d0(String str, List<Object> list) {
        this.f19230a = str;
        this.f19231b = list == null ? new ArrayList<>() : list;
    }

    /* renamed from: e */
    private Object[] m21669e(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Object f : list) {
                arrayList.add(m21670f(f));
            }
        }
        return arrayList.toArray(new Object[0]);
    }

    /* renamed from: f */
    private static Object m21670f(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof List)) {
            return obj;
        }
        List list = (List) obj;
        byte[] bArr = new byte[list.size()];
        for (int i = 0; i < list.size(); i++) {
            bArr[i] = (byte) ((Integer) list.get(i)).intValue();
        }
        return bArr;
    }

    /* renamed from: a */
    public void mo12713a(SQLiteProgram sQLiteProgram) {
        long j;
        List<Object> list = this.f19231b;
        if (list != null) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                Object f = m21670f(this.f19231b.get(i));
                int i2 = i + 1;
                if (f == null) {
                    sQLiteProgram.bindNull(i2);
                } else if (f instanceof byte[]) {
                    sQLiteProgram.bindBlob(i2, (byte[]) f);
                } else if (f instanceof Double) {
                    sQLiteProgram.bindDouble(i2, ((Double) f).doubleValue());
                } else {
                    if (f instanceof Integer) {
                        j = (long) ((Integer) f).intValue();
                    } else if (f instanceof Long) {
                        j = ((Long) f).longValue();
                    } else if (f instanceof String) {
                        sQLiteProgram.bindString(i2, (String) f);
                    } else if (f instanceof Boolean) {
                        j = ((Boolean) f).booleanValue() ? 1 : 0;
                    } else {
                        throw new IllegalArgumentException("Could not bind " + f + " from index " + i + ": Supported types are null, byte[], double, long, boolean and String");
                    }
                    sQLiteProgram.bindLong(i2, j);
                }
                i = i2;
            }
        }
    }

    /* renamed from: b */
    public List<Object> mo12714b() {
        return this.f19231b;
    }

    /* renamed from: c */
    public String mo12715c() {
        return this.f19230a;
    }

    /* renamed from: d */
    public Object[] mo12716d() {
        return m21669e(this.f19231b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2710d0)) {
            return false;
        }
        C2710d0 d0Var = (C2710d0) obj;
        String str = this.f19230a;
        if (str != null) {
            if (!str.equals(d0Var.f19230a)) {
                return false;
            }
        } else if (d0Var.f19230a != null) {
            return false;
        }
        if (this.f19231b.size() != d0Var.f19231b.size()) {
            return false;
        }
        for (int i = 0; i < this.f19231b.size(); i++) {
            if (!(this.f19231b.get(i) instanceof byte[]) || !(d0Var.f19231b.get(i) instanceof byte[])) {
                if (!this.f19231b.get(i).equals(d0Var.f19231b.get(i))) {
                    return false;
                }
            } else if (!Arrays.equals((byte[]) this.f19231b.get(i), (byte[]) d0Var.f19231b.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str = this.f19230a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f19230a);
        List<Object> list = this.f19231b;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            str = " " + this.f19231b;
        }
        sb.append(str);
        return sb.toString();
    }
}
