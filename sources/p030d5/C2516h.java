package p030d5;

import p079k4.C3330q;
import p145u4.C4150l;

/* renamed from: d5.h */
public final class C2516h {
    /* renamed from: a */
    public static final <E> C2513f<E> m21110a(int i, C2512e eVar, C4150l<? super E, C3330q> lVar) {
        int i2 = 1;
        if (i == -2) {
            if (eVar == C2512e.SUSPEND) {
                i2 = C2513f.f18631a.mo12434a();
            }
            return new C2510d(i2, eVar, lVar);
        } else if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? (i == 1 && eVar == C2512e.DROP_OLDEST) ? new C2524m(lVar) : new C2510d(i, eVar, lVar) : new C2525n(lVar) : eVar == C2512e.SUSPEND ? new C2529r(lVar) : new C2510d(1, eVar, lVar);
        } else {
            if (eVar != C2512e.SUSPEND) {
                i2 = 0;
            }
            if (i2 != 0) {
                return new C2524m(lVar);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
    }

    /* renamed from: b */
    public static /* synthetic */ C2513f m21111b(int i, C2512e eVar, C4150l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            eVar = C2512e.SUSPEND;
        }
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        return m21110a(i, eVar, lVar);
    }
}
