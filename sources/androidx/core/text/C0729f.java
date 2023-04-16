package androidx.core.text;

import java.util.Locale;

/* renamed from: androidx.core.text.f */
public final class C0729f {

    /* renamed from: a */
    public static final C0728e f2107a = new C0734e((C0732c) null, false);

    /* renamed from: b */
    public static final C0728e f2108b = new C0734e((C0732c) null, true);

    /* renamed from: c */
    public static final C0728e f2109c;

    /* renamed from: d */
    public static final C0728e f2110d;

    /* renamed from: e */
    public static final C0728e f2111e = new C0734e(C0730a.f2113b, false);

    /* renamed from: f */
    public static final C0728e f2112f = C0735f.f2118b;

    /* renamed from: androidx.core.text.f$a */
    private static class C0730a implements C0732c {

        /* renamed from: b */
        static final C0730a f2113b = new C0730a(true);

        /* renamed from: a */
        private final boolean f2114a;

        private C0730a(boolean z) {
            this.f2114a = z;
        }

        /* renamed from: a */
        public int mo2758a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a = C0729f.m2932a(Character.getDirectionality(charSequence.charAt(i)));
                if (a != 0) {
                    if (a != 1) {
                        continue;
                        i++;
                    } else if (!this.f2114a) {
                        return 1;
                    }
                } else if (this.f2114a) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.f2114a ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: androidx.core.text.f$b */
    private static class C0731b implements C0732c {

        /* renamed from: a */
        static final C0731b f2115a = new C0731b();

        private C0731b() {
        }

        /* renamed from: a */
        public int mo2758a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = C0729f.m2933b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* renamed from: androidx.core.text.f$c */
    private interface C0732c {
        /* renamed from: a */
        int mo2758a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: androidx.core.text.f$d */
    private static abstract class C0733d implements C0728e {

        /* renamed from: a */
        private final C0732c f2116a;

        C0733d(C0732c cVar) {
            this.f2116a = cVar;
        }

        /* renamed from: c */
        private boolean m2937c(CharSequence charSequence, int i, int i2) {
            int a = this.f2116a.mo2758a(charSequence, i, i2);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return mo2759b();
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo2757a(CharSequence charSequence, int i, int i2) {
            if (charSequence != null && i >= 0 && i2 >= 0 && charSequence.length() - i2 >= i) {
                return this.f2116a == null ? mo2759b() : m2937c(charSequence, i, i2);
            }
            throw new IllegalArgumentException();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract boolean mo2759b();
    }

    /* renamed from: androidx.core.text.f$e */
    private static class C0734e extends C0733d {

        /* renamed from: b */
        private final boolean f2117b;

        C0734e(C0732c cVar, boolean z) {
            super(cVar);
            this.f2117b = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public boolean mo2759b() {
            return this.f2117b;
        }
    }

    /* renamed from: androidx.core.text.f$f */
    private static class C0735f extends C0733d {

        /* renamed from: b */
        static final C0735f f2118b = new C0735f();

        C0735f() {
            super((C0732c) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public boolean mo2759b() {
            return C0736g.m2943b(Locale.getDefault()) == 1;
        }
    }

    static {
        C0731b bVar = C0731b.f2115a;
        f2109c = new C0734e(bVar, false);
        f2110d = new C0734e(bVar, true);
    }

    /* renamed from: a */
    static int m2932a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    static int m2933b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
