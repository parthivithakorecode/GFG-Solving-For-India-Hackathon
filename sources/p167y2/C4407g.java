package p167y2;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p028d3.C2491c;
import p149v2.C4212h;
import p149v2.C4215k;
import p149v2.C4217m;
import p149v2.C4218n;
import p149v2.C4220p;

/* renamed from: y2.g */
public final class C4407g extends C2491c {

    /* renamed from: t */
    private static final Writer f22768t = new C4408a();

    /* renamed from: u */
    private static final C4220p f22769u = new C4220p("closed");

    /* renamed from: q */
    private final List<C4215k> f22770q = new ArrayList();

    /* renamed from: r */
    private String f22771r;

    /* renamed from: s */
    private C4215k f22772s = C4217m.f22503a;

    /* renamed from: y2.g$a */
    class C4408a extends Writer {
        C4408a() {
        }

        public void close() {
            throw new AssertionError();
        }

        public void flush() {
            throw new AssertionError();
        }

        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public C4407g() {
        super(f22768t);
    }

    /* renamed from: c0 */
    private C4215k m27084c0() {
        List<C4215k> list = this.f22770q;
        return list.get(list.size() - 1);
    }

    /* renamed from: d0 */
    private void m27085d0(C4215k kVar) {
        if (this.f22771r != null) {
            if (!kVar.mo15753m() || mo12385z()) {
                ((C4218n) m27084c0()).mo15761p(this.f22771r, kVar);
            }
            this.f22771r = null;
        } else if (this.f22770q.isEmpty()) {
            this.f22772s = kVar;
        } else {
            C4215k c0 = m27084c0();
            if (c0 instanceof C4212h) {
                ((C4212h) c0).mo15747p(kVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: F */
    public C2491c mo12368F(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f22770q.isEmpty() || this.f22771r != null) {
            throw new IllegalStateException();
        } else if (m27084c0() instanceof C4218n) {
            this.f22771r = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: H */
    public C2491c mo12369H() {
        m27085d0(C4217m.f22503a);
        return this;
    }

    /* renamed from: V */
    public C2491c mo12374V(long j) {
        m27085d0(new C4220p((Number) Long.valueOf(j)));
        return this;
    }

    /* renamed from: W */
    public C2491c mo12375W(Boolean bool) {
        if (bool == null) {
            return mo12369H();
        }
        m27085d0(new C4220p(bool));
        return this;
    }

    /* renamed from: X */
    public C2491c mo12376X(Number number) {
        if (number == null) {
            return mo12369H();
        }
        if (!mo12367C()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        m27085d0(new C4220p(number));
        return this;
    }

    /* renamed from: Y */
    public C2491c mo12377Y(String str) {
        if (str == null) {
            return mo12369H();
        }
        m27085d0(new C4220p(str));
        return this;
    }

    /* renamed from: Z */
    public C2491c mo12378Z(boolean z) {
        m27085d0(new C4220p(Boolean.valueOf(z)));
        return this;
    }

    /* renamed from: b0 */
    public C4215k mo16027b0() {
        if (this.f22770q.isEmpty()) {
            return this.f22772s;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f22770q);
    }

    public void close() {
        if (this.f22770q.isEmpty()) {
            this.f22770q.add(f22769u);
            return;
        }
        throw new IOException("Incomplete document");
    }

    public void flush() {
    }

    /* renamed from: m */
    public C2491c mo12381m() {
        C4212h hVar = new C4212h();
        m27085d0(hVar);
        this.f22770q.add(hVar);
        return this;
    }

    /* renamed from: n */
    public C2491c mo12382n() {
        C4218n nVar = new C4218n();
        m27085d0(nVar);
        this.f22770q.add(nVar);
        return this;
    }

    /* renamed from: v */
    public C2491c mo12383v() {
        if (this.f22770q.isEmpty() || this.f22771r != null) {
            throw new IllegalStateException();
        } else if (m27084c0() instanceof C4212h) {
            List<C4215k> list = this.f22770q;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: w */
    public C2491c mo12384w() {
        if (this.f22770q.isEmpty() || this.f22771r != null) {
            throw new IllegalStateException();
        } else if (m27084c0() instanceof C4218n) {
            List<C4215k> list = this.f22770q;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }
}
