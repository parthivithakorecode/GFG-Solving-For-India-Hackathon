package p149v2;

import java.io.IOException;
import java.io.StringWriter;
import p028d3.C2491c;
import p161x2.C4341l;

/* renamed from: v2.k */
public abstract class C4215k {
    /* renamed from: h */
    public C4212h mo15749h() {
        if (mo15752l()) {
            return (C4212h) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    /* renamed from: i */
    public C4218n mo15750i() {
        if (mo15754n()) {
            return (C4218n) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    /* renamed from: j */
    public C4220p mo15751j() {
        if (mo15755o()) {
            return (C4220p) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    /* renamed from: k */
    public String mo15746k() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: l */
    public boolean mo15752l() {
        return this instanceof C4212h;
    }

    /* renamed from: m */
    public boolean mo15753m() {
        return this instanceof C4217m;
    }

    /* renamed from: n */
    public boolean mo15754n() {
        return this instanceof C4218n;
    }

    /* renamed from: o */
    public boolean mo15755o() {
        return this instanceof C4220p;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C2491c cVar = new C2491c(stringWriter);
            cVar.mo12372S(true);
            C4341l.m26965b(this, cVar);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
