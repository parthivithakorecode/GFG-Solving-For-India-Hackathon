package p172z1;

/* renamed from: z1.h */
public final class C4502h<L> {

    /* renamed from: a */
    private final L f22992a;

    /* renamed from: b */
    private final String f22993b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4502h)) {
            return false;
        }
        C4502h hVar = (C4502h) obj;
        return this.f22992a == hVar.f22992a && this.f22993b.equals(hVar.f22993b);
    }

    public int hashCode() {
        return (System.identityHashCode(this.f22992a) * 31) + this.f22993b.hashCode();
    }
}
