package p051g5;

import kotlinx.coroutines.internal.C3384i;
import p079k4.C3322k;
import p079k4.C3325l;
import p079k4.C3330q;
import p100n4.C3773d;
import p145u4.C4150l;
import p145u4.C4154p;

/* renamed from: g5.a */
public final class C2647a {
    /* renamed from: a */
    private static final void m21372a(C3773d<?> dVar, Throwable th) {
        C3322k.C3323a aVar = C3322k.f20823f;
        dVar.resumeWith(C3322k.m24446a(C3325l.m24450a(th)));
        throw th;
    }

    /* renamed from: b */
    public static final void m21373b(C3773d<? super C3330q> dVar, C3773d<?> dVar2) {
        try {
            C3773d b = C3855c.m25870b(dVar);
            C3322k.C3323a aVar = C3322k.f20823f;
            C3384i.m24601c(b, C3322k.m24446a(C3330q.f20829a), (C4150l) null, 2, (Object) null);
        } catch (Throwable th) {
            m21372a(dVar2, th);
        }
    }

    /* renamed from: c */
    public static final <R, T> void m21374c(C4154p<? super R, ? super C3773d<? super T>, ? extends Object> pVar, R r, C3773d<? super T> dVar, C4150l<? super Throwable, C3330q> lVar) {
        try {
            C3773d b = C3855c.m25870b(C3855c.m25869a(pVar, r, dVar));
            C3322k.C3323a aVar = C3322k.f20823f;
            C3384i.m24600b(b, C3322k.m24446a(C3330q.f20829a), lVar);
        } catch (Throwable th) {
            m21372a(dVar, th);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m21375d(C4154p pVar, Object obj, C3773d dVar, C4150l lVar, int i, Object obj2) {
        if ((i & 4) != 0) {
            lVar = null;
        }
        m21374c(pVar, obj, dVar, lVar);
    }
}
