package p094m5;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p058h5.C2745d;
import p058h5.C2746e;
import p058h5.C2752g;
import p058h5.C2780r;

/* renamed from: m5.d */
public final class C3728d implements Comparable<C3728d>, Serializable {

    /* renamed from: f */
    private final C2752g f21550f;

    /* renamed from: g */
    private final C2780r f21551g;

    /* renamed from: h */
    private final C2780r f21552h;

    C3728d(long j, C2780r rVar, C2780r rVar2) {
        this.f21550f = C2752g.m21888R(j, 0, rVar);
        this.f21551g = rVar;
        this.f21552h = rVar2;
    }

    C3728d(C2752g gVar, C2780r rVar, C2780r rVar2) {
        this.f21550f = gVar;
        this.f21551g = rVar;
        this.f21552h = rVar2;
    }

    /* renamed from: g */
    private int m25443g() {
        return mo14932i().mo13013w() - mo14933j().mo13013w();
    }

    /* renamed from: m */
    static C3728d m25444m(DataInput dataInput) {
        long b = C3724a.m25419b(dataInput);
        C2780r d = C3724a.m25421d(dataInput);
        C2780r d2 = C3724a.m25421d(dataInput);
        if (!d.equals(d2)) {
            return new C3728d(b, d, d2);
        }
        throw new IllegalArgumentException("Offsets must not be equal");
    }

    private Object writeReplace() {
        return new C3724a((byte) 2, this);
    }

    /* renamed from: b */
    public int compareTo(C3728d dVar) {
        return mo14930h().compareTo(dVar.mo14930h());
    }

    /* renamed from: d */
    public C2752g mo14926d() {
        return this.f21550f.mo12876Z((long) m25443g());
    }

    /* renamed from: e */
    public C2752g mo14927e() {
        return this.f21550f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3728d)) {
            return false;
        }
        C3728d dVar = (C3728d) obj;
        return this.f21550f.equals(dVar.f21550f) && this.f21551g.equals(dVar.f21551g) && this.f21552h.equals(dVar.f21552h);
    }

    /* renamed from: f */
    public C2745d mo14929f() {
        return C2745d.m21785h((long) m25443g());
    }

    /* renamed from: h */
    public C2746e mo14930h() {
        return this.f21550f.mo13110x(this.f21551g);
    }

    public int hashCode() {
        return (this.f21550f.hashCode() ^ this.f21551g.hashCode()) ^ Integer.rotateLeft(this.f21552h.hashCode(), 16);
    }

    /* renamed from: i */
    public C2780r mo14932i() {
        return this.f21552h;
    }

    /* renamed from: j */
    public C2780r mo14933j() {
        return this.f21551g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public List<C2780r> mo14934k() {
        if (mo14935l()) {
            return Collections.emptyList();
        }
        return Arrays.asList(new C2780r[]{mo14933j(), mo14932i()});
    }

    /* renamed from: l */
    public boolean mo14935l() {
        return mo14932i().mo13013w() > mo14933j().mo13013w();
    }

    /* renamed from: n */
    public long mo14936n() {
        return this.f21550f.mo13109w(this.f21551g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo14937o(DataOutput dataOutput) {
        C3724a.m25422e(mo14936n(), dataOutput);
        C3724a.m25424g(this.f21551g, dataOutput);
        C3724a.m25424g(this.f21552h, dataOutput);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Transition[");
        sb.append(mo14935l() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.f21550f);
        sb.append(this.f21551g);
        sb.append(" to ");
        sb.append(this.f21552h);
        sb.append(']');
        return sb.toString();
    }
}
