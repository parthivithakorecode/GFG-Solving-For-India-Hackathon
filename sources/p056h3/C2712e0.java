package p056h3;

import android.database.Cursor;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p063i3.C2846a;

/* renamed from: h3.e0 */
public class C2712e0 {
    /* renamed from: a */
    public static List<Object> m21675a(Cursor cursor, int i) {
        String str;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            Object b = m21676b(cursor, i2);
            if (C2846a.f19544c) {
                String str2 = null;
                if (b != null) {
                    if (b.getClass().isArray()) {
                        str2 = "array(" + b.getClass().getComponentType().getName() + ")";
                    } else {
                        str2 = b.getClass().getName();
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("column ");
                sb.append(i2);
                sb.append(" ");
                sb.append(cursor.getType(i2));
                sb.append(": ");
                sb.append(b);
                if (str2 == null) {
                    str = "";
                } else {
                    str = " (" + str2 + ")";
                }
                sb.append(str);
                Log.d("Sqflite", sb.toString());
            }
            arrayList.add(b);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static Object m21676b(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i));
        }
        if (type == 3) {
            return cursor.getString(i);
        }
        if (type != 4) {
            return null;
        }
        return cursor.getBlob(i);
    }

    /* renamed from: c */
    static Locale m21677c(String str) {
        return Locale.forLanguageTag(str);
    }

    /* renamed from: d */
    static Locale m21678d(String str) {
        String str2;
        String str3;
        String[] split = str.split("-");
        String str4 = "";
        if (split.length > 0) {
            String str5 = split[0];
            if (split.length > 1) {
                str3 = split[1];
                if (split.length > 2) {
                    str4 = split[split.length - 1];
                }
                str2 = str4;
            } else {
                str2 = str4;
                str3 = str2;
            }
            str4 = str5;
        } else {
            str2 = str4;
            str3 = str2;
        }
        return new Locale(str4, str3, str2);
    }

    /* renamed from: e */
    static Locale m21679e(String str) {
        return Build.VERSION.SDK_INT >= 21 ? m21677c(str) : m21678d(str);
    }
}
