package p006a5;

import kotlin.jvm.internal.C3357i;

/* renamed from: a5.q */
class C0184q extends C0183p {
    /* renamed from: h0 */
    public static final String m563h0(String str, int i) {
        C3357i.m24508e(str, "<this>");
        if (i >= 0) {
            String substring = str.substring(C4357f.m26995c(i, str.length()));
            C3357i.m24507d(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }
}
