package p073j5;

import java.util.Locale;
import p058h5.C2742b;
import p058h5.C2746e;
import p058h5.C2778q;
import p058h5.C2780r;
import p065i5.C2858b;
import p065i5.C2870h;
import p065i5.C2877m;
import p080k5.C3333c;
import p080k5.C3334d;
import p087l5.C3603a;
import p087l5.C3614e;
import p087l5.C3620i;
import p087l5.C3621j;
import p087l5.C3629k;
import p087l5.C3632n;

/* renamed from: j5.f */
final class C3275f {

    /* renamed from: a */
    private C3614e f20723a;

    /* renamed from: b */
    private Locale f20724b;

    /* renamed from: c */
    private C3278h f20725c;

    /* renamed from: d */
    private int f20726d;

    /* renamed from: j5.f$a */
    class C3276a extends C3333c {

        /* renamed from: f */
        final /* synthetic */ C2858b f20727f;

        /* renamed from: g */
        final /* synthetic */ C3614e f20728g;

        /* renamed from: h */
        final /* synthetic */ C2870h f20729h;

        /* renamed from: i */
        final /* synthetic */ C2778q f20730i;

        C3276a(C2858b bVar, C3614e eVar, C2870h hVar, C2778q qVar) {
            this.f20727f = bVar;
            this.f20728g = eVar;
            this.f20729h = hVar;
            this.f20730i = qVar;
        }

        /* renamed from: b */
        public <R> R mo12776b(C3629k<R> kVar) {
            return kVar == C3621j.m25159a() ? this.f20729h : kVar == C3621j.m25165g() ? this.f20730i : kVar == C3621j.m25163e() ? this.f20728g.mo12776b(kVar) : kVar.mo12783a(this);
        }

        /* renamed from: d */
        public long mo12777d(C3620i iVar) {
            return ((this.f20727f == null || !iVar.mo14729b()) ? this.f20728g : this.f20727f).mo12777d(iVar);
        }

        /* renamed from: j */
        public boolean mo12781j(C3620i iVar) {
            return (this.f20727f == null || !iVar.mo14729b()) ? this.f20728g.mo12781j(iVar) : this.f20727f.mo12781j(iVar);
        }

        /* renamed from: n */
        public C3632n mo12782n(C3620i iVar) {
            return (this.f20727f == null || !iVar.mo14729b()) ? this.f20728g.mo12782n(iVar) : this.f20727f.mo12782n(iVar);
        }
    }

    C3275f(C3614e eVar, C3250b bVar) {
        this.f20723a = m24312a(eVar, bVar);
        this.f20724b = bVar.mo14175f();
        this.f20725c = bVar.mo14174e();
    }

    /* renamed from: a */
    private static C3614e m24312a(C3614e eVar, C3250b bVar) {
        C2870h d = bVar.mo14173d();
        C2778q g = bVar.mo14176g();
        if (d == null && g == null) {
            return eVar;
        }
        C2870h hVar = (C2870h) eVar.mo12776b(C3621j.m25159a());
        C2778q qVar = (C2778q) eVar.mo12776b(C3621j.m25165g());
        C2858b bVar2 = null;
        if (C3334d.m24467c(hVar, d)) {
            d = null;
        }
        if (C3334d.m24467c(qVar, g)) {
            g = null;
        }
        if (d == null && g == null) {
            return eVar;
        }
        C2870h hVar2 = d != null ? d : hVar;
        if (g != null) {
            qVar = g;
        }
        if (g != null) {
            if (eVar.mo12781j(C3603a.INSTANT_SECONDS)) {
                if (hVar2 == null) {
                    hVar2 = C2877m.f19602j;
                }
                return hVar2.mo13140s(C2746e.m21794q(eVar), g);
            }
            C2778q p = g.mo13006p();
            C2780r rVar = (C2780r) eVar.mo12776b(C3621j.m25162d());
            if ((p instanceof C2780r) && rVar != null && !p.equals(rVar)) {
                throw new C2742b("Invalid override zone for temporal: " + g + " " + eVar);
            }
        }
        if (d != null) {
            if (eVar.mo12781j(C3603a.EPOCH_DAY)) {
                bVar2 = hVar2.mo13128d(eVar);
            } else if (!(d == C2877m.f19602j && hVar == null)) {
                C3603a[] values = C3603a.values();
                int length = values.length;
                int i = 0;
                while (i < length) {
                    C3603a aVar = values[i];
                    if (!aVar.mo14729b() || !eVar.mo12781j(aVar)) {
                        i++;
                    } else {
                        throw new C2742b("Invalid override chronology for temporal: " + d + " " + eVar);
                    }
                }
            }
        }
        return new C3276a(bVar2, eVar, hVar2, qVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo14248b() {
        this.f20726d--;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Locale mo14249c() {
        return this.f20724b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C3278h mo14250d() {
        return this.f20725c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C3614e mo14251e() {
        return this.f20723a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Long mo14252f(C3620i iVar) {
        try {
            return Long.valueOf(this.f20723a.mo12777d(iVar));
        } catch (C2742b e) {
            if (this.f20726d > 0) {
                return null;
            }
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public <R> R mo14253g(C3629k<R> kVar) {
        R b = this.f20723a.mo12776b(kVar);
        if (b != null || this.f20726d != 0) {
            return b;
        }
        throw new C2742b("Unable to extract value: " + this.f20723a.getClass());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo14254h() {
        this.f20726d++;
    }

    public String toString() {
        return this.f20723a.toString();
    }
}
