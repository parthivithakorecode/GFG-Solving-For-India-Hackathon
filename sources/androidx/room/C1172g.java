package androidx.room;

import android.content.Context;
import androidx.room.C1173h;

/* renamed from: androidx.room.g */
public class C1172g {
    /* renamed from: a */
    public static <T extends C1173h> C1173h.C1174a<T> m4715a(Context context, Class<T> cls, String str) {
        if (str != null && str.trim().length() != 0) {
            return new C1173h.C1174a<>(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }

    /* renamed from: b */
    static <T, C> T m4716b(Class<C> cls, String str) {
        String str2;
        String name = cls.getPackage().getName();
        String canonicalName = cls.getCanonicalName();
        if (!name.isEmpty()) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String str3 = canonicalName.replace('.', '_') + str;
        try {
            if (name.isEmpty()) {
                str2 = str3;
            } else {
                str2 = name + "." + str3;
            }
            return Class.forName(str2).newInstance();
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("cannot find implementation for " + cls.getCanonicalName() + ". " + str3 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor" + cls.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
        }
    }

    /* renamed from: c */
    public static <T extends C1173h> C1173h.C1174a<T> m4717c(Context context, Class<T> cls) {
        return new C1173h.C1174a<>(context, cls, (String) null);
    }
}
