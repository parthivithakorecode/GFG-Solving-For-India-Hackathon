package p163x4;

import kotlin.jvm.internal.C3353e;
import p086l4.C3598v;
import p114p4.C3929c;

/* renamed from: x4.a */
public class C4350a implements Iterable<Integer> {

    /* renamed from: i */
    public static final C4351a f22694i = new C4351a((C3353e) null);

    /* renamed from: f */
    private final int f22695f;

    /* renamed from: g */
    private final int f22696g;

    /* renamed from: h */
    private final int f22697h;

    /* renamed from: x4.a$a */
    public static final class C4351a {
        private C4351a() {
        }

        public /* synthetic */ C4351a(C3353e eVar) {
            this();
        }

        /* renamed from: a */
        public final C4350a mo15970a(int i, int i2, int i3) {
            return new C4350a(i, i2, i3);
        }
    }

    public C4350a(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f22695f = i;
            this.f22696g = C3929c.m26091b(i, i2, i3);
            this.f22697h = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4350a) {
            if (!isEmpty() || !((C4350a) obj).isEmpty()) {
                C4350a aVar = (C4350a) obj;
                if (!(this.f22695f == aVar.f22695f && this.f22696g == aVar.f22696g && this.f22697h == aVar.f22697h)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final int mo15962h() {
        return this.f22695f;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f22695f * 31) + this.f22696g) * 31) + this.f22697h;
    }

    /* renamed from: i */
    public final int mo15964i() {
        return this.f22696g;
    }

    public boolean isEmpty() {
        if (this.f22697h > 0) {
            if (this.f22695f > this.f22696g) {
                return true;
            }
        } else if (this.f22695f < this.f22696g) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final int mo15967j() {
        return this.f22697h;
    }

    /* renamed from: k */
    public C3598v iterator() {
        return new C4352b(this.f22695f, this.f22696g, this.f22697h);
    }

    public String toString() {
        int i;
        StringBuilder sb;
        if (this.f22697h > 0) {
            sb = new StringBuilder();
            sb.append(this.f22695f);
            sb.append("..");
            sb.append(this.f22696g);
            sb.append(" step ");
            i = this.f22697h;
        } else {
            sb = new StringBuilder();
            sb.append(this.f22695f);
            sb.append(" downTo ");
            sb.append(this.f22696g);
            sb.append(" step ");
            i = -this.f22697h;
        }
        sb.append(i);
        return sb.toString();
    }
}
