package p079k4;

import java.io.Serializable;
import kotlin.jvm.internal.C3357i;

/* renamed from: k4.j */
public final class C3321j<A, B> implements Serializable {

    /* renamed from: f */
    private final A f20821f;

    /* renamed from: g */
    private final B f20822g;

    public C3321j(A a, B b) {
        this.f20821f = a;
        this.f20822g = b;
    }

    /* renamed from: a */
    public final A mo14321a() {
        return this.f20821f;
    }

    /* renamed from: b */
    public final B mo14322b() {
        return this.f20822g;
    }

    /* renamed from: c */
    public final A mo14323c() {
        return this.f20821f;
    }

    /* renamed from: d */
    public final B mo14324d() {
        return this.f20822g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3321j)) {
            return false;
        }
        C3321j jVar = (C3321j) obj;
        return C3357i.m24504a(this.f20821f, jVar.f20821f) && C3357i.m24504a(this.f20822g, jVar.f20822g);
    }

    public int hashCode() {
        A a = this.f20821f;
        int i = 0;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.f20822g;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return '(' + this.f20821f + ", " + this.f20822g + ')';
    }
}
