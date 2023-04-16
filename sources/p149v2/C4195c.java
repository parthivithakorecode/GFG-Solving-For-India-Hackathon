package p149v2;

import java.lang.reflect.Field;
import java.util.Locale;

/* renamed from: v2.c */
public enum C4195c implements C4202d {
    IDENTITY {
        /* renamed from: b */
        public String mo15712b(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE {
        /* renamed from: b */
        public String mo15712b(Field field) {
            return C4195c.m26650e(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES {
        /* renamed from: b */
        public String mo15712b(Field field) {
            return C4195c.m26650e(C4195c.m26649d(field.getName(), " "));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES {
        /* renamed from: b */
        public String mo15712b(Field field) {
            return C4195c.m26649d(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES {
        /* renamed from: b */
        public String mo15712b(Field field) {
            return C4195c.m26649d(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS {
        /* renamed from: b */
        public String mo15712b(Field field) {
            return C4195c.m26649d(field.getName(), ".").toLowerCase(Locale.ENGLISH);
        }
    };

    /* renamed from: d */
    static String m26649d(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    /* renamed from: e */
    static String m26650e(String str) {
        int length = str.length() - 1;
        int i = 0;
        while (!Character.isLetter(str.charAt(i)) && i < length) {
            i++;
        }
        char charAt = str.charAt(i);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        if (i == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i) + upperCase + str.substring(i + 1);
    }
}
