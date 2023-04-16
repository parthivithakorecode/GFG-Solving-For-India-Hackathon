package p141u0;

/* renamed from: u0.d */
public class C4089d {

    /* renamed from: a */
    public String f22286a;

    /* renamed from: b */
    public Long f22287b;

    public C4089d(String str, long j) {
        this.f22286a = str;
        this.f22287b = Long.valueOf(j);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C4089d(String str, boolean z) {
        this(str, z ? 1 : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4089d)) {
            return false;
        }
        C4089d dVar = (C4089d) obj;
        if (!this.f22286a.equals(dVar.f22286a)) {
            return false;
        }
        Long l = this.f22287b;
        Long l2 = dVar.f22287b;
        return l != null ? l.equals(l2) : l2 == null;
    }

    public int hashCode() {
        int hashCode = this.f22286a.hashCode() * 31;
        Long l = this.f22287b;
        return hashCode + (l != null ? l.hashCode() : 0);
    }
}
