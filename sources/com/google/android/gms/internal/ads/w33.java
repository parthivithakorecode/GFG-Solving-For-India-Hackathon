package com.google.android.gms.internal.ads;

public final class w33 {
    /* renamed from: a */
    public static String m18852a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m18856e(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m18856e(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* renamed from: b */
    public static String m18853b(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m18855d(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m18855d(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* renamed from: c */
    public static boolean m18854c(CharSequence charSequence, CharSequence charSequence2) {
        int f;
        int length = "content-length".length();
        if (charSequence2 == "content-length") {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = "content-length".charAt(i);
            char charAt2 = charSequence2.charAt(i);
            if (charAt != charAt2 && ((f = m18857f(charAt)) >= 26 || f != m18857f(charAt2))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m18855d(char c) {
        return c >= 'a' && c <= 'z';
    }

    /* renamed from: e */
    public static boolean m18856e(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /* renamed from: f */
    private static int m18857f(char c) {
        return (char) ((c | ' ') - 'a');
    }
}
