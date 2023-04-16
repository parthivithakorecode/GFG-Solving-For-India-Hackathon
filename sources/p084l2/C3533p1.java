package p084l2;

import java.util.Objects;

/* renamed from: l2.p1 */
final class C3533p1 extends C3516l1 {

    /* renamed from: b */
    private final C3529o1 f21169b = new C3529o1();

    C3533p1() {
    }

    /* renamed from: a */
    public final void mo14605a(Throwable th, Throwable th2) {
        if (th2 != th) {
            Objects.requireNonNull(th2, "The suppressed exception cannot be null.");
            this.f21169b.mo14621a(th, true).add(th2);
            return;
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", th2);
    }
}
