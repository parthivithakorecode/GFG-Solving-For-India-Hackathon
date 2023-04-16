package p016b5;

import p051g5.C2647a;
import p051g5.C2648b;
import p079k4.C3320i;
import p100n4.C3773d;
import p100n4.C3777f;
import p145u4.C4150l;
import p145u4.C4154p;

/* renamed from: b5.m0 */
public enum C1377m0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* renamed from: b5.m0$a */
    public /* synthetic */ class C1378a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3579a = null;

        static {
            int[] iArr = new int[C1377m0.values().length];
            iArr[C1377m0.DEFAULT.ordinal()] = 1;
            iArr[C1377m0.ATOMIC.ordinal()] = 2;
            iArr[C1377m0.UNDISPATCHED.ordinal()] = 3;
            iArr[C1377m0.LAZY.ordinal()] = 4;
            f3579a = iArr;
        }
    }

    /* renamed from: d */
    public final <R, T> void mo4757d(C4154p<? super R, ? super C3773d<? super T>, ? extends Object> pVar, R r, C3773d<? super T> dVar) {
        int i = C1378a.f3579a[ordinal()];
        if (i == 1) {
            C2647a.m21375d(pVar, r, dVar, (C4150l) null, 4, (Object) null);
        } else if (i == 2) {
            C3777f.m25605a(pVar, r, dVar);
        } else if (i == 3) {
            C2648b.m21376a(pVar, r, dVar);
        } else if (i != 4) {
            throw new C3320i();
        }
    }

    /* renamed from: e */
    public final boolean mo4758e() {
        return this == LAZY;
    }
}
