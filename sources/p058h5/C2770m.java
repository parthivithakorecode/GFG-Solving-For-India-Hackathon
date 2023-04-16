package p058h5;

import java.io.Serializable;
import java.util.regex.Pattern;
import p065i5.C2864e;

/* renamed from: h5.m */
public final class C2770m extends C2864e implements Serializable {

    /* renamed from: i */
    public static final C2770m f19394i = new C2770m(0, 0, 0);

    /* renamed from: j */
    private static final Pattern f19395j = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);

    /* renamed from: f */
    private final int f19396f;

    /* renamed from: g */
    private final int f19397g;

    /* renamed from: h */
    private final int f19398h;

    private C2770m(int i, int i2, int i3) {
        this.f19396f = i;
        this.f19397g = i2;
        this.f19398h = i3;
    }

    /* renamed from: a */
    private static C2770m m22065a(int i, int i2, int i3) {
        return ((i | i2) | i3) == 0 ? f19394i : new C2770m(i, i2, i3);
    }

    /* renamed from: d */
    public static C2770m m22066d(int i) {
        return m22065a(0, 0, i);
    }

    private Object readResolve() {
        return ((this.f19396f | this.f19397g) | this.f19398h) == 0 ? f19394i : this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p087l5.C3613d mo12785b(p087l5.C3613d r4) {
        /*
            r3 = this;
            java.lang.String r0 = "temporal"
            p080k5.C3334d.m24473i(r4, r0)
            int r0 = r3.f19396f
            if (r0 == 0) goto L_0x0016
            int r1 = r3.f19397g
            if (r1 == 0) goto L_0x0012
            long r0 = r3.mo12968e()
            goto L_0x001b
        L_0x0012:
            long r0 = (long) r0
            l5.b r2 = p087l5.C3604b.YEARS
            goto L_0x001d
        L_0x0016:
            int r0 = r3.f19397g
            if (r0 == 0) goto L_0x0021
            long r0 = (long) r0
        L_0x001b:
            l5.b r2 = p087l5.C3604b.MONTHS
        L_0x001d:
            l5.d r4 = r4.mo12800e(r0, r2)
        L_0x0021:
            int r0 = r3.f19398h
            if (r0 == 0) goto L_0x002c
            long r0 = (long) r0
            l5.b r2 = p087l5.C3604b.DAYS
            l5.d r4 = r4.mo12800e(r0, r2)
        L_0x002c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p058h5.C2770m.mo12785b(l5.d):l5.d");
    }

    /* renamed from: c */
    public boolean mo12967c() {
        return this == f19394i;
    }

    /* renamed from: e */
    public long mo12968e() {
        return (((long) this.f19396f) * 12) + ((long) this.f19397g);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2770m)) {
            return false;
        }
        C2770m mVar = (C2770m) obj;
        return this.f19396f == mVar.f19396f && this.f19397g == mVar.f19397g && this.f19398h == mVar.f19398h;
    }

    public int hashCode() {
        return this.f19396f + Integer.rotateLeft(this.f19397g, 8) + Integer.rotateLeft(this.f19398h, 16);
    }

    public String toString() {
        if (this == f19394i) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('P');
        int i = this.f19396f;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.f19397g;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.f19398h;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }
}
