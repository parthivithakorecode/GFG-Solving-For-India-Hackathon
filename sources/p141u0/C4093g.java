package p141u0;

/* renamed from: u0.g */
public class C4093g {

    /* renamed from: a */
    public final String f22291a;

    /* renamed from: b */
    public final int f22292b;

    public C4093g(String str, int i) {
        this.f22291a = str;
        this.f22292b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4093g)) {
            return false;
        }
        C4093g gVar = (C4093g) obj;
        if (this.f22292b != gVar.f22292b) {
            return false;
        }
        return this.f22291a.equals(gVar.f22291a);
    }

    public int hashCode() {
        return (this.f22291a.hashCode() * 31) + this.f22292b;
    }
}
