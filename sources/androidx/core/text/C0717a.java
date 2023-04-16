package androidx.core.text;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* renamed from: androidx.core.text.a */
public final class C0717a {

    /* renamed from: d */
    static final C0728e f2075d;

    /* renamed from: e */
    private static final String f2076e = Character.toString(8206);

    /* renamed from: f */
    private static final String f2077f = Character.toString(8207);

    /* renamed from: g */
    static final C0717a f2078g;

    /* renamed from: h */
    static final C0717a f2079h;

    /* renamed from: a */
    private final boolean f2080a;

    /* renamed from: b */
    private final int f2081b;

    /* renamed from: c */
    private final C0728e f2082c;

    /* renamed from: androidx.core.text.a$a */
    public static final class C0718a {

        /* renamed from: a */
        private boolean f2083a;

        /* renamed from: b */
        private int f2084b;

        /* renamed from: c */
        private C0728e f2085c;

        public C0718a() {
            m2898c(C0717a.m2891e(Locale.getDefault()));
        }

        /* renamed from: b */
        private static C0717a m2897b(boolean z) {
            return z ? C0717a.f2079h : C0717a.f2078g;
        }

        /* renamed from: c */
        private void m2898c(boolean z) {
            this.f2083a = z;
            this.f2085c = C0717a.f2075d;
            this.f2084b = 2;
        }

        /* renamed from: a */
        public C0717a mo2727a() {
            return (this.f2084b == 2 && this.f2085c == C0717a.f2075d) ? m2897b(this.f2083a) : new C0717a(this.f2083a, this.f2084b, this.f2085c);
        }
    }

    /* renamed from: androidx.core.text.a$b */
    private static class C0719b {

        /* renamed from: f */
        private static final byte[] f2086f = new byte[1792];

        /* renamed from: a */
        private final CharSequence f2087a;

        /* renamed from: b */
        private final boolean f2088b;

        /* renamed from: c */
        private final int f2089c;

        /* renamed from: d */
        private int f2090d;

        /* renamed from: e */
        private char f2091e;

        static {
            for (int i = 0; i < 1792; i++) {
                f2086f[i] = Character.getDirectionality(i);
            }
        }

        C0719b(CharSequence charSequence, boolean z) {
            this.f2087a = charSequence;
            this.f2088b = z;
            this.f2089c = charSequence.length();
        }

        /* renamed from: c */
        private static byte m2900c(char c) {
            return c < 1792 ? f2086f[c] : Character.getDirectionality(c);
        }

        /* renamed from: f */
        private byte m2901f() {
            char charAt;
            int i = this.f2090d;
            do {
                int i2 = this.f2090d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f2087a;
                int i3 = i2 - 1;
                this.f2090d = i3;
                charAt = charSequence.charAt(i3);
                this.f2091e = charAt;
                if (charAt == '&') {
                    return 12;
                }
            } while (charAt != ';');
            this.f2090d = i;
            this.f2091e = ';';
            return 13;
        }

        /* renamed from: g */
        private byte m2902g() {
            char charAt;
            do {
                int i = this.f2090d;
                if (i >= this.f2089c) {
                    return 12;
                }
                CharSequence charSequence = this.f2087a;
                this.f2090d = i + 1;
                charAt = charSequence.charAt(i);
                this.f2091e = charAt;
            } while (charAt != ';');
            return 12;
        }

        /* renamed from: h */
        private byte m2903h() {
            char charAt;
            int i = this.f2090d;
            while (true) {
                int i2 = this.f2090d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f2087a;
                int i3 = i2 - 1;
                this.f2090d = i3;
                char charAt2 = charSequence.charAt(i3);
                this.f2091e = charAt2;
                if (charAt2 == '<') {
                    return 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i4 = this.f2090d;
                        if (i4 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f2087a;
                        int i5 = i4 - 1;
                        this.f2090d = i5;
                        charAt = charSequence2.charAt(i5);
                        this.f2091e = charAt;
                    } while (charAt != charAt2);
                }
            }
            this.f2090d = i;
            this.f2091e = '>';
            return 13;
        }

        /* renamed from: i */
        private byte m2904i() {
            char charAt;
            int i = this.f2090d;
            while (true) {
                int i2 = this.f2090d;
                if (i2 < this.f2089c) {
                    CharSequence charSequence = this.f2087a;
                    this.f2090d = i2 + 1;
                    char charAt2 = charSequence.charAt(i2);
                    this.f2091e = charAt2;
                    if (charAt2 == '>') {
                        return 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i3 = this.f2090d;
                            if (i3 >= this.f2089c) {
                                break;
                            }
                            CharSequence charSequence2 = this.f2087a;
                            this.f2090d = i3 + 1;
                            charAt = charSequence2.charAt(i3);
                            this.f2091e = charAt;
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f2090d = i;
                    this.f2091e = '<';
                    return 13;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public byte mo2728a() {
            char charAt = this.f2087a.charAt(this.f2090d - 1);
            this.f2091e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f2087a, this.f2090d);
                this.f2090d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f2090d--;
            byte c = m2900c(this.f2091e);
            if (!this.f2088b) {
                return c;
            }
            char c2 = this.f2091e;
            return c2 == '>' ? m2903h() : c2 == ';' ? m2901f() : c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public byte mo2729b() {
            char charAt = this.f2087a.charAt(this.f2090d);
            this.f2091e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f2087a, this.f2090d);
                this.f2090d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f2090d++;
            byte c = m2900c(this.f2091e);
            if (!this.f2088b) {
                return c;
            }
            char c2 = this.f2091e;
            return c2 == '<' ? m2904i() : c2 == '&' ? m2902g() : c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo2730d() {
            this.f2090d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f2090d < this.f2089c && i == 0) {
                byte b = mo2729b();
                if (b != 0) {
                    if (b == 1 || b == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (b != 9) {
                        switch (b) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f2090d > 0) {
                switch (mo2728a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo2731e() {
            this.f2090d = this.f2089c;
            int i = 0;
            while (true) {
                int i2 = i;
                while (this.f2090d > 0) {
                    byte a = mo2728a();
                    if (a != 0) {
                        if (a == 1 || a == 2) {
                            if (i == 0) {
                                return 1;
                            }
                            if (i2 == 0) {
                            }
                        } else if (a != 9) {
                            switch (a) {
                                case 14:
                                case 15:
                                    if (i2 == i) {
                                        return -1;
                                    }
                                    break;
                                case 16:
                                case 17:
                                    if (i2 == i) {
                                        return 1;
                                    }
                                    break;
                                case 18:
                                    i++;
                                    break;
                                default:
                                    if (i2 != 0) {
                                        break;
                                    } else {
                                        continue;
                                    }
                            }
                            i--;
                        } else {
                            continue;
                        }
                    } else if (i == 0) {
                        return -1;
                    } else {
                        if (i2 == 0) {
                        }
                    }
                }
                return 0;
            }
        }
    }

    static {
        C0728e eVar = C0729f.f2109c;
        f2075d = eVar;
        f2078g = new C0717a(false, 2, eVar);
        f2079h = new C0717a(true, 2, eVar);
    }

    C0717a(boolean z, int i, C0728e eVar) {
        this.f2080a = z;
        this.f2081b = i;
        this.f2082c = eVar;
    }

    /* renamed from: a */
    private static int m2888a(CharSequence charSequence) {
        return new C0719b(charSequence, false).mo2730d();
    }

    /* renamed from: b */
    private static int m2889b(CharSequence charSequence) {
        return new C0719b(charSequence, false).mo2731e();
    }

    /* renamed from: c */
    public static C0717a m2890c() {
        return new C0718a().mo2727a();
    }

    /* renamed from: e */
    static boolean m2891e(Locale locale) {
        return C0736g.m2943b(locale) == 1;
    }

    /* renamed from: f */
    private String m2892f(CharSequence charSequence, C0728e eVar) {
        boolean a = eVar.mo2757a(charSequence, 0, charSequence.length());
        return (this.f2080a || (!a && m2889b(charSequence) != 1)) ? this.f2080a ? (!a || m2889b(charSequence) == -1) ? f2077f : "" : "" : f2076e;
    }

    /* renamed from: g */
    private String m2893g(CharSequence charSequence, C0728e eVar) {
        boolean a = eVar.mo2757a(charSequence, 0, charSequence.length());
        return (this.f2080a || (!a && m2888a(charSequence) != 1)) ? this.f2080a ? (!a || m2888a(charSequence) == -1) ? f2077f : "" : "" : f2076e;
    }

    /* renamed from: d */
    public boolean mo2724d() {
        return (this.f2081b & 2) != 0;
    }

    /* renamed from: h */
    public CharSequence mo2725h(CharSequence charSequence) {
        return mo2726i(charSequence, this.f2082c, true);
    }

    /* renamed from: i */
    public CharSequence mo2726i(CharSequence charSequence, C0728e eVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean a = eVar.mo2757a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (mo2724d() && z) {
            spannableStringBuilder.append(m2893g(charSequence, a ? C0729f.f2108b : C0729f.f2107a));
        }
        if (a != this.f2080a) {
            spannableStringBuilder.append(a ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append(m2892f(charSequence, a ? C0729f.f2108b : C0729f.f2107a));
        }
        return spannableStringBuilder;
    }
}
