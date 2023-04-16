package p016b5;

import p079k4.C3330q;
import p100n4.C3773d;
import p145u4.C4150l;

/* renamed from: b5.k */
public interface C1366k<T> extends C3773d<T> {

    /* renamed from: b5.k$a */
    public static final class C1367a {
        /* renamed from: a */
        public static /* synthetic */ Object m5372a(C1366k kVar, Object obj, Object obj2, int i, Object obj3) {
            if (obj3 == null) {
                if ((i & 2) != 0) {
                    obj2 = null;
                }
                return kVar.mo4730b(obj, obj2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
        }
    }

    /* renamed from: a */
    void mo4729a(T t, C4150l<? super Throwable, C3330q> lVar);

    /* renamed from: b */
    Object mo4730b(T t, Object obj);

    /* renamed from: c */
    void mo4731c(C4150l<? super Throwable, C3330q> lVar);

    /* renamed from: f */
    Object mo4732f(T t, Object obj, C4150l<? super Throwable, C3330q> lVar);

    /* renamed from: g */
    Object mo4733g(Throwable th);

    /* renamed from: i */
    void mo4734i(Object obj);
}
