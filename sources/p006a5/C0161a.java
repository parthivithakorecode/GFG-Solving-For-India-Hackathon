package p006a5;

import p163x4.C4353c;

/* renamed from: a5.a */
class C0161a {
    /* renamed from: a */
    public static final int m470a(int i) {
        if (new C4353c(2, 36).mo15972m(i)) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new C4353c(2, 36));
    }

    /* renamed from: b */
    public static final int m471b(char c, int i) {
        return Character.digit(c, i);
    }

    /* renamed from: c */
    public static final boolean m472c(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
}
