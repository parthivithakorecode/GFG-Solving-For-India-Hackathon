package p016b5;

import kotlinx.coroutines.internal.C3382h;
import kotlinx.coroutines.internal.C3385i0;
import p079k4.C3322k;
import p079k4.C3325l;
import p079k4.C3330q;
import p100n4.C3773d;
import p100n4.C3778g;

/* renamed from: b5.w0 */
public final class C1410w0 {
    /* renamed from: a */
    public static final <T> void m5491a(C1407v0<? super T> v0Var, int i) {
        boolean z = true;
        if (C1384o0.m5425a()) {
            if (!(i != -1)) {
                throw new AssertionError();
            }
        }
        C3773d<? super T> e = v0Var.mo4743e();
        if (i != 4) {
            z = false;
        }
        if (z || !(e instanceof C3382h) || m5492b(i) != m5492b(v0Var.f3609h)) {
            m5494d(v0Var, e, z);
            return;
        }
        C1332d0 d0Var = ((C3382h) e).f20868i;
        C3778g context = e.getContext();
        if (d0Var.mo4694P(context)) {
            d0Var.mo4673O(context, v0Var);
        } else {
            m5495e(v0Var);
        }
    }

    /* renamed from: b */
    public static final boolean m5492b(int i) {
        return i == 1 || i == 2;
    }

    /* renamed from: c */
    public static final boolean m5493c(int i) {
        return i == 2;
    }

    /* renamed from: d */
    public static final <T> void m5494d(C1407v0<? super T> v0Var, C3773d<? super T> dVar, boolean z) {
        Object obj;
        Object l = v0Var.mo4748l();
        Throwable h = v0Var.mo4746h(l);
        if (h != null) {
            C3322k.C3323a aVar = C3322k.f20823f;
            obj = C3325l.m24450a(h);
        } else {
            C3322k.C3323a aVar2 = C3322k.f20823f;
            obj = v0Var.mo4747j(l);
        }
        Object a = C3322k.m24446a(obj);
        if (z) {
            C3382h hVar = (C3382h) dVar;
            C3773d<T> dVar2 = hVar.f20869j;
            Object obj2 = hVar.f20871l;
            C3778g context = dVar2.getContext();
            Object c = C3385i0.m24604c(context, obj2);
            C1365j2<?> f = c != C3385i0.f20874a ? C1323c0.m5290f(dVar2, context, c) : null;
            try {
                hVar.f20869j.resumeWith(a);
                C3330q qVar = C3330q.f20829a;
            } finally {
                if (f == null || f.mo4728z0()) {
                    C3385i0.m24602a(context, c);
                }
            }
        } else {
            dVar.resumeWith(a);
        }
    }

    /* renamed from: e */
    private static final void m5495e(C1407v0<?> v0Var) {
        C1320b1 a = C1355h2.f3555a.mo4709a();
        if (a.mo4664X()) {
            a.mo4661T(v0Var);
            return;
        }
        a.mo4663V(true);
        try {
            m5494d(v0Var, v0Var.mo4743e(), true);
            do {
            } while (a.mo4666Z());
        } catch (Throwable th) {
            a.mo4660R(true);
            throw th;
        }
        a.mo4660R(true);
    }
}
