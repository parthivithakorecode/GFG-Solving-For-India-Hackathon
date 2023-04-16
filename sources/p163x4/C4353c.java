package p163x4;

import kotlin.jvm.internal.C3353e;

/* renamed from: x4.c */
public final class C4353c extends C4350a {

    /* renamed from: j */
    public static final C4354a f22702j = new C4354a((C3353e) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4353c f22703k = new C4353c(1, 0);

    /* renamed from: x4.c$a */
    public static final class C4354a {
        private C4354a() {
        }

        public /* synthetic */ C4354a(C3353e eVar) {
            this();
        }

        /* renamed from: a */
        public final C4353c mo15975a() {
            return C4353c.f22703k;
        }
    }

    public C4353c(int i, int i2) {
        super(i, i2, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4353c) {
            if (!isEmpty() || !((C4353c) obj).isEmpty()) {
                C4353c cVar = (C4353c) obj;
                if (!(mo15962h() == cVar.mo15962h() && mo15964i() == cVar.mo15964i())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (mo15962h() * 31) + mo15964i();
    }

    public boolean isEmpty() {
        return mo15962h() > mo15964i();
    }

    /* renamed from: m */
    public boolean mo15972m(int i) {
        return mo15962h() <= i && i <= mo15964i();
    }

    /* renamed from: n */
    public Integer mo15973n() {
        return Integer.valueOf(mo15964i());
    }

    /* renamed from: o */
    public Integer mo15974o() {
        return Integer.valueOf(mo15962h());
    }

    public String toString() {
        return mo15962h() + ".." + mo15964i();
    }
}
