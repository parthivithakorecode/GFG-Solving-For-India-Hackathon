package p117q0;

/* renamed from: q0.b */
public class C3937b {

    /* renamed from: a */
    private boolean f22070a;

    /* renamed from: b */
    private boolean f22071b;

    /* renamed from: c */
    private boolean f22072c;

    /* renamed from: d */
    private boolean f22073d;

    public C3937b(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f22070a = z;
        this.f22071b = z2;
        this.f22072c = z3;
        this.f22073d = z4;
    }

    /* renamed from: a */
    public boolean mo15393a() {
        return this.f22070a;
    }

    /* renamed from: b */
    public boolean mo15394b() {
        return this.f22072c;
    }

    /* renamed from: c */
    public boolean mo15395c() {
        return this.f22073d;
    }

    /* renamed from: d */
    public boolean mo15396d() {
        return this.f22071b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3937b)) {
            return false;
        }
        C3937b bVar = (C3937b) obj;
        return this.f22070a == bVar.f22070a && this.f22071b == bVar.f22071b && this.f22072c == bVar.f22072c && this.f22073d == bVar.f22073d;
    }

    public int hashCode() {
        int i = this.f22070a;
        if (this.f22071b) {
            i += 16;
        }
        if (this.f22072c) {
            i += 256;
        }
        return this.f22073d ? i + 4096 : i;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", new Object[]{Boolean.valueOf(this.f22070a), Boolean.valueOf(this.f22071b), Boolean.valueOf(this.f22072c), Boolean.valueOf(this.f22073d)});
    }
}
