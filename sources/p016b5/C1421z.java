package p016b5;

import kotlin.coroutines.jvm.internal.C3339e;
import kotlin.jvm.internal.C3353e;
import kotlinx.coroutines.internal.C3375d0;
import p079k4.C3322k;
import p079k4.C3325l;
import p079k4.C3330q;
import p100n4.C3773d;
import p145u4.C4150l;

/* renamed from: b5.z */
public final class C1421z {
    /* renamed from: a */
    public static final <T> Object m5587a(Object obj, C3773d<? super T> dVar) {
        if (obj instanceof C1406v) {
            C3322k.C3323a aVar = C3322k.f20823f;
            Throwable th = ((C1406v) obj).f3608a;
            if (C1384o0.m5428d() && (dVar instanceof C3339e)) {
                th = C3375d0.m24567j(th, (C3339e) dVar);
            }
            obj = C3325l.m24450a(th);
        } else {
            C3322k.C3323a aVar2 = C3322k.f20823f;
        }
        return C3322k.m24446a(obj);
    }

    /* renamed from: b */
    public static final <T> Object m5588b(Object obj, C1366k<?> kVar) {
        Throwable b = C3322k.m24447b(obj);
        if (b != null) {
            if (C1384o0.m5428d() && (kVar instanceof C3339e)) {
                b = C3375d0.m24567j(b, (C3339e) kVar);
            }
            obj = new C1406v(b, false, 2, (C3353e) null);
        }
        return obj;
    }

    /* renamed from: c */
    public static final <T> Object m5589c(Object obj, C4150l<? super Throwable, C3330q> lVar) {
        Throwable b = C3322k.m24447b(obj);
        return b == null ? lVar != null ? new C1409w(obj, lVar) : obj : new C1406v(b, false, 2, (C3353e) null);
    }

    /* renamed from: d */
    public static /* synthetic */ Object m5590d(Object obj, C4150l lVar, int i, Object obj2) {
        if ((i & 1) != 0) {
            lVar = null;
        }
        return m5589c(obj, lVar);
    }
}
