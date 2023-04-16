package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.om */
public final class C2041om {
    /* renamed from: a */
    public static boolean m14519a(String str) {
        return "audio".equals(m14521c(str));
    }

    /* renamed from: b */
    public static boolean m14520b(String str) {
        return "video".equals(m14521c(str));
    }

    /* renamed from: c */
    private static String m14521c(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        throw new IllegalArgumentException(str.length() != 0 ? "Invalid mime type: ".concat(str) : new String("Invalid mime type: "));
    }
}
