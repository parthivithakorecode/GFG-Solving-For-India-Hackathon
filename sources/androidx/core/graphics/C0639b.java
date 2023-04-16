package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;

/* renamed from: androidx.core.graphics.b */
public final class C0639b {

    /* renamed from: e */
    public static final C0639b f1947e = new C0639b(0, 0, 0, 0);

    /* renamed from: a */
    public final int f1948a;

    /* renamed from: b */
    public final int f1949b;

    /* renamed from: c */
    public final int f1950c;

    /* renamed from: d */
    public final int f1951d;

    /* renamed from: androidx.core.graphics.b$a */
    static class C0640a {
        /* renamed from: a */
        static Insets m2624a(int i, int i2, int i3, int i4) {
            return Insets.of(i, i2, i3, i4);
        }
    }

    private C0639b(int i, int i2, int i3, int i4) {
        this.f1948a = i;
        this.f1949b = i2;
        this.f1950c = i3;
        this.f1951d = i4;
    }

    /* renamed from: a */
    public static C0639b m2619a(C0639b bVar, C0639b bVar2) {
        return m2620b(Math.max(bVar.f1948a, bVar2.f1948a), Math.max(bVar.f1949b, bVar2.f1949b), Math.max(bVar.f1950c, bVar2.f1950c), Math.max(bVar.f1951d, bVar2.f1951d));
    }

    /* renamed from: b */
    public static C0639b m2620b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f1947e : new C0639b(i, i2, i3, i4);
    }

    /* renamed from: c */
    public static C0639b m2621c(Rect rect) {
        return m2620b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: d */
    public static C0639b m2622d(Insets insets) {
        return m2620b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* renamed from: e */
    public Insets mo2590e() {
        return C0640a.m2624a(this.f1948a, this.f1949b, this.f1950c, this.f1951d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0639b.class != obj.getClass()) {
            return false;
        }
        C0639b bVar = (C0639b) obj;
        return this.f1951d == bVar.f1951d && this.f1948a == bVar.f1948a && this.f1950c == bVar.f1950c && this.f1949b == bVar.f1949b;
    }

    public int hashCode() {
        return (((((this.f1948a * 31) + this.f1949b) * 31) + this.f1950c) * 31) + this.f1951d;
    }

    public String toString() {
        return "Insets{left=" + this.f1948a + ", top=" + this.f1949b + ", right=" + this.f1950c + ", bottom=" + this.f1951d + '}';
    }
}
