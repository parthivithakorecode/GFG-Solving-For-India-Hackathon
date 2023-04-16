package p073j5;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: j5.h */
public final class C3278h {

    /* renamed from: e */
    public static final C3278h f20732e = new C3278h('0', '+', '-', '.');

    /* renamed from: f */
    private static final ConcurrentMap<Locale, C3278h> f20733f = new ConcurrentHashMap(16, 0.75f, 2);

    /* renamed from: a */
    private final char f20734a;

    /* renamed from: b */
    private final char f20735b;

    /* renamed from: c */
    private final char f20736c;

    /* renamed from: d */
    private final char f20737d;

    private C3278h(char c, char c2, char c3, char c4) {
        this.f20734a = c;
        this.f20735b = c2;
        this.f20736c = c3;
        this.f20737d = c4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo14256a(String str) {
        char c = this.f20734a;
        if (c == '0') {
            return str;
        }
        int i = c - '0';
        char[] charArray = str.toCharArray();
        for (int i2 = 0; i2 < charArray.length; i2++) {
            charArray[i2] = (char) (charArray[i2] + i);
        }
        return new String(charArray);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo14257b(char c) {
        int i = c - this.f20734a;
        if (i < 0 || i > 9) {
            return -1;
        }
        return i;
    }

    /* renamed from: c */
    public char mo14258c() {
        return this.f20737d;
    }

    /* renamed from: d */
    public char mo14259d() {
        return this.f20736c;
    }

    /* renamed from: e */
    public char mo14260e() {
        return this.f20735b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3278h)) {
            return false;
        }
        C3278h hVar = (C3278h) obj;
        return this.f20734a == hVar.f20734a && this.f20735b == hVar.f20735b && this.f20736c == hVar.f20736c && this.f20737d == hVar.f20737d;
    }

    /* renamed from: f */
    public char mo14262f() {
        return this.f20734a;
    }

    public int hashCode() {
        return this.f20734a + this.f20735b + this.f20736c + this.f20737d;
    }

    public String toString() {
        return "DecimalStyle[" + this.f20734a + this.f20735b + this.f20736c + this.f20737d + "]";
    }
}
