package p016b5;

/* renamed from: b5.a1 */
final class C1316a1 implements C1373l1 {

    /* renamed from: f */
    private final boolean f3528f;

    public C1316a1(boolean z) {
        this.f3528f = z;
    }

    /* renamed from: d */
    public boolean mo4653d() {
        return this.f3528f;
    }

    /* renamed from: h */
    public C1321b2 mo4654h() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(mo4653d() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
