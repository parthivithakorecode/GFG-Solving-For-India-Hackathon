package p172z1;

import com.google.android.gms.common.api.Status;
import p003a2.C0052c;
import p003a2.C0064e;
import p003a2.C0087m;
import p003a2.C0094p;
import p003a2.C0096q;
import p034e2.C2544a;
import p131s2.C4024d;
import p131s2.C4028h;
import p160x1.C4280b;
import p166y1.C4376b;

/* renamed from: z1.e0 */
final class C4497e0<T> implements C4024d<T> {

    /* renamed from: a */
    private final C4496e f22982a;

    /* renamed from: b */
    private final int f22983b;

    /* renamed from: c */
    private final C4489b<?> f22984c;

    /* renamed from: d */
    private final long f22985d;

    C4497e0(C4496e eVar, int i, C4489b<?> bVar, long j, String str, String str2) {
        this.f22982a = eVar;
        this.f22983b = i;
        this.f22984c = bVar;
        this.f22985d = j;
    }

    /* renamed from: b */
    static <T> C4497e0<T> m27343b(C4496e eVar, int i, C4489b<?> bVar) {
        boolean z;
        if (!eVar.mo16153s()) {
            return null;
        }
        C0096q a = C0094p.m317b().mo264a();
        if (a == null) {
            z = true;
        } else if (!a.mo269e()) {
            return null;
        } else {
            z = a.mo270f();
            C4538z p = eVar.mo16150p(bVar);
            if (p != null) {
                if (!(p.mo16209s() instanceof C0052c)) {
                    return null;
                }
                C0052c cVar = (C0052c) p.mo16209s();
                if (cVar.mo161I() && !cVar.mo179j()) {
                    C0064e c = m27344c(p, cVar, i);
                    if (c == null) {
                        return null;
                    }
                    p.mo16204G();
                    z = c.mo223g();
                }
            }
        }
        return new C4497e0(eVar, i, bVar, z ? System.currentTimeMillis() : 0, (String) null, (String) null);
    }

    /* renamed from: c */
    private static C0064e m27344c(C4538z<?> zVar, C0052c<?> cVar, int i) {
        int[] d;
        int[] e;
        C0064e G = cVar.mo159G();
        if (G == null || !G.mo222f() || ((d = G.mo220d()) != null ? !C2544a.m21173a(d, i) : !((e = G.mo221e()) == null || !C2544a.m21173a(e, i))) || zVar.mo16203F() >= G.mo219c()) {
            return null;
        }
        return G;
    }

    /* renamed from: a */
    public final void mo10935a(C4028h<T> hVar) {
        C4538z p;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        if (this.f22982a.mo16153s()) {
            C0096q a = C0094p.m317b().mo264a();
            if ((a == null || a.mo269e()) && (p = this.f22982a.mo16150p(this.f22984c)) != null && (p.mo16209s() instanceof C0052c)) {
                C0052c cVar = (C0052c) p.mo16209s();
                boolean z = true;
                boolean z2 = this.f22985d > 0;
                int y = cVar.mo194y();
                int i6 = 100;
                if (a != null) {
                    boolean f = z2 & a.mo270f();
                    int c = a.mo267c();
                    int d = a.mo268d();
                    i3 = a.mo271g();
                    if (cVar.mo161I() && !cVar.mo179j()) {
                        C0064e c2 = m27344c(p, cVar, this.f22983b);
                        if (c2 != null) {
                            if (!c2.mo223g() || this.f22985d <= 0) {
                                z = false;
                            }
                            d = c2.mo219c();
                            f = z;
                        } else {
                            return;
                        }
                    }
                    i2 = c;
                    i = d;
                } else {
                    i3 = 0;
                    i = 100;
                    i2 = 5000;
                }
                C4496e eVar = this.f22982a;
                if (hVar.mo15515m()) {
                    i5 = 0;
                    i4 = 0;
                } else {
                    if (hVar.mo15513k()) {
                        i4 = -1;
                    } else {
                        Exception i7 = hVar.mo15511i();
                        if (i7 instanceof C4376b) {
                            Status a2 = ((C4376b) i7).mo15998a();
                            i6 = a2.mo5003d();
                            C4280b c3 = a2.mo5002c();
                            i4 = c3 == null ? -1 : c3.mo15841c();
                        } else {
                            i4 = -1;
                            i5 = 101;
                        }
                    }
                    i5 = i6;
                }
                if (z2) {
                    j2 = this.f22985d;
                    j = System.currentTimeMillis();
                } else {
                    j2 = 0;
                    j = 0;
                }
                eVar.mo16156v(new C0087m(this.f22983b, i5, i4, j2, j, (String) null, (String) null, y), i3, (long) i2, i);
            }
        }
    }
}
