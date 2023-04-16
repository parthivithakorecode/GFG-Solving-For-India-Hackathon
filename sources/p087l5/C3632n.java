package p087l5;

import java.io.Serializable;
import p058h5.C2742b;

/* renamed from: l5.n */
public final class C3632n implements Serializable {

    /* renamed from: f */
    private final long f21354f;

    /* renamed from: g */
    private final long f21355g;

    /* renamed from: h */
    private final long f21356h;

    /* renamed from: i */
    private final long f21357i;

    private C3632n(long j, long j2, long j3, long j4) {
        this.f21354f = j;
        this.f21355g = j2;
        this.f21356h = j3;
        this.f21357i = j4;
    }

    /* renamed from: i */
    public static C3632n m25183i(long j, long j2) {
        if (j <= j2) {
            return new C3632n(j, j, j2, j2);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    /* renamed from: j */
    public static C3632n m25184j(long j, long j2, long j3) {
        return m25185k(j, j, j2, j3);
    }

    /* renamed from: k */
    public static C3632n m25185k(long j, long j2, long j3, long j4) {
        if (j > j2) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        } else if (j3 > j4) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        } else if (j2 <= j4) {
            return new C3632n(j, j2, j3, j4);
        } else {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
    }

    /* renamed from: a */
    public int mo14755a(long j, C3620i iVar) {
        if (mo14762g(j)) {
            return (int) j;
        }
        throw new C2742b("Invalid int value for " + iVar + ": " + j);
    }

    /* renamed from: b */
    public long mo14756b(long j, C3620i iVar) {
        if (mo14763h(j)) {
            return j;
        }
        if (iVar != null) {
            throw new C2742b("Invalid value for " + iVar + " (valid values " + this + "): " + j);
        }
        throw new C2742b("Invalid value (valid values " + this + "): " + j);
    }

    /* renamed from: c */
    public long mo14757c() {
        return this.f21357i;
    }

    /* renamed from: d */
    public long mo14758d() {
        return this.f21354f;
    }

    /* renamed from: e */
    public boolean mo14759e() {
        return this.f21354f == this.f21355g && this.f21356h == this.f21357i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3632n)) {
            return false;
        }
        C3632n nVar = (C3632n) obj;
        return this.f21354f == nVar.f21354f && this.f21355g == nVar.f21355g && this.f21356h == nVar.f21356h && this.f21357i == nVar.f21357i;
    }

    /* renamed from: f */
    public boolean mo14761f() {
        return mo14758d() >= -2147483648L && mo14757c() <= 2147483647L;
    }

    /* renamed from: g */
    public boolean mo14762g(long j) {
        return mo14761f() && mo14763h(j);
    }

    /* renamed from: h */
    public boolean mo14763h(long j) {
        return j >= mo14758d() && j <= mo14757c();
    }

    public int hashCode() {
        long j = this.f21354f;
        long j2 = this.f21355g;
        long j3 = (j + j2) << ((int) (j2 + 16));
        long j4 = this.f21356h;
        long j5 = (j3 >> ((int) (j4 + 48))) << ((int) (j4 + 32));
        long j6 = this.f21357i;
        long j7 = ((j5 >> ((int) (32 + j6))) << ((int) (j6 + 48))) >> 16;
        return (int) (j7 ^ (j7 >>> 32));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f21354f);
        if (this.f21354f != this.f21355g) {
            sb.append('/');
            sb.append(this.f21355g);
        }
        sb.append(" - ");
        sb.append(this.f21356h);
        if (this.f21356h != this.f21357i) {
            sb.append('/');
            sb.append(this.f21357i);
        }
        return sb.toString();
    }
}
