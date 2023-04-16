package p016b5;

import kotlin.coroutines.jvm.internal.C3339e;
import kotlin.jvm.internal.C3358j;
import kotlin.jvm.internal.C3363o;
import p100n4.C3773d;
import p100n4.C3774e;
import p100n4.C3778g;
import p100n4.C3784h;
import p145u4.C4154p;

/* renamed from: b5.c0 */
public final class C1323c0 {

    /* renamed from: b5.c0$a */
    static final class C1324a extends C3358j implements C4154p<C3778g, C3778g.C3781b, C3778g> {

        /* renamed from: f */
        public static final C1324a f3533f = new C1324a();

        C1324a() {
            super(2);
        }

        /* renamed from: a */
        public final C3778g invoke(C3778g gVar, C3778g.C3781b bVar) {
            return bVar instanceof C1315a0 ? gVar.plus(((C1315a0) bVar).mo4652m()) : gVar.plus(bVar);
        }
    }

    /* renamed from: b5.c0$b */
    static final class C1325b extends C3358j implements C4154p<C3778g, C3778g.C3781b, C3778g> {

        /* renamed from: f */
        final /* synthetic */ C3363o<C3778g> f3534f;

        /* renamed from: g */
        final /* synthetic */ boolean f3535g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1325b(C3363o<C3778g> oVar, boolean z) {
            super(2);
            this.f3534f = oVar;
            this.f3535g = z;
        }

        /* renamed from: a */
        public final C3778g invoke(C3778g gVar, C3778g.C3781b bVar) {
            if (!(bVar instanceof C1315a0)) {
                return gVar.plus(bVar);
            }
            C3778g.C3781b bVar2 = ((C3778g) this.f3534f.f20848f).get(bVar.getKey());
            if (bVar2 == null) {
                C1315a0 a0Var = (C1315a0) bVar;
                if (this.f3535g) {
                    a0Var = a0Var.mo4652m();
                }
                return gVar.plus(a0Var);
            }
            C3363o<C3778g> oVar = this.f3534f;
            oVar.f20848f = ((C3778g) oVar.f20848f).minusKey(bVar.getKey());
            return gVar.plus(((C1315a0) bVar).mo4651H(bVar2));
        }
    }

    /* renamed from: b5.c0$c */
    static final class C1326c extends C3358j implements C4154p<Boolean, C3778g.C3781b, Boolean> {

        /* renamed from: f */
        public static final C1326c f3536f = new C1326c();

        C1326c() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean mo4672a(boolean z, C3778g.C3781b bVar) {
            return Boolean.valueOf(z || (bVar instanceof C1315a0));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo4672a(((Boolean) obj).booleanValue(), (C3778g.C3781b) obj2);
        }
    }

    /* renamed from: a */
    private static final C3778g m5285a(C3778g gVar, C3778g gVar2, boolean z) {
        boolean c = m5287c(gVar);
        boolean c2 = m5287c(gVar2);
        if (!c && !c2) {
            return gVar.plus(gVar2);
        }
        C3363o oVar = new C3363o();
        oVar.f20848f = gVar2;
        C3784h hVar = C3784h.f21692f;
        C3778g gVar3 = (C3778g) gVar.fold(hVar, new C1325b(oVar, z));
        if (c2) {
            oVar.f20848f = ((C3778g) oVar.f20848f).fold(hVar, C1324a.f3533f);
        }
        return gVar3.plus((C3778g) oVar.f20848f);
    }

    /* renamed from: b */
    public static final String m5286b(C3778g gVar) {
        C1357i0 i0Var;
        String O;
        if (!C1384o0.m5427c() || (i0Var = (C1357i0) gVar.get(C1357i0.f3557g)) == null) {
            return null;
        }
        C1362j0 j0Var = (C1362j0) gVar.get(C1362j0.f3561g);
        String str = "coroutine";
        if (!(j0Var == null || (O = j0Var.mo4723O()) == null)) {
            str = O;
        }
        return str + '#' + i0Var.mo4712O();
    }

    /* renamed from: c */
    private static final boolean m5287c(C3778g gVar) {
        return ((Boolean) gVar.fold(Boolean.FALSE, C1326c.f3536f)).booleanValue();
    }

    /* renamed from: d */
    public static final C3778g m5288d(C1368k0 k0Var, C3778g gVar) {
        C3778g a = m5285a(k0Var.mo4642e(), gVar, true);
        C3778g plus = C1384o0.m5427c() ? a.plus(new C1357i0(C1384o0.m5426b().incrementAndGet())) : a;
        return (a == C1419y0.m5577a() || a.get(C3774e.f21689e) != null) ? plus : plus.plus(C1419y0.m5577a());
    }

    /* renamed from: e */
    public static final C1365j2<?> m5289e(C3339e eVar) {
        while (!(eVar instanceof C1404u0) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof C1365j2) {
                return (C1365j2) eVar;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static final C1365j2<?> m5290f(C3773d<?> dVar, C3778g gVar, Object obj) {
        if (!(dVar instanceof C3339e)) {
            return null;
        }
        if (!(gVar.get(C1370k2.f3565f) != null)) {
            return null;
        }
        C1365j2<?> e = m5289e((C3339e) dVar);
        if (e != null) {
            e.mo4727A0(gVar, obj);
        }
        return e;
    }
}
