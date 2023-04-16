package p073j5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p058h5.C2770m;
import p058h5.C2778q;
import p065i5.C2870h;
import p065i5.C2877m;
import p080k5.C3333c;
import p080k5.C3334d;
import p087l5.C3620i;
import p087l5.C3621j;
import p087l5.C3629k;
import p087l5.C3631m;

/* renamed from: j5.d */
final class C3271d {

    /* renamed from: a */
    private Locale f20708a;

    /* renamed from: b */
    private C3278h f20709b;

    /* renamed from: c */
    private C2870h f20710c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C2778q f20711d;

    /* renamed from: e */
    private boolean f20712e = true;

    /* renamed from: f */
    private boolean f20713f = true;

    /* renamed from: g */
    private final ArrayList<C3273b> f20714g;

    /* renamed from: j5.d$b */
    final class C3273b extends C3333c {

        /* renamed from: f */
        C2870h f20715f;

        /* renamed from: g */
        C2778q f20716g;

        /* renamed from: h */
        final Map<C3620i, Long> f20717h;

        /* renamed from: i */
        boolean f20718i;

        /* renamed from: j */
        C2770m f20719j;

        private C3273b() {
            this.f20715f = null;
            this.f20716g = null;
            this.f20717h = new HashMap();
            this.f20719j = C2770m.f19394i;
        }

        /* renamed from: b */
        public <R> R mo12776b(C3629k<R> kVar) {
            return kVar == C3621j.m25159a() ? this.f20715f : (kVar == C3621j.m25165g() || kVar == C3621j.m25164f()) ? this.f20716g : super.mo12776b(kVar);
        }

        /* renamed from: d */
        public long mo12777d(C3620i iVar) {
            if (this.f20717h.containsKey(iVar)) {
                return this.f20717h.get(iVar).longValue();
            }
            throw new C3631m("Unsupported field: " + iVar);
        }

        /* renamed from: g */
        public int mo12778g(C3620i iVar) {
            if (this.f20717h.containsKey(iVar)) {
                return C3334d.m24480p(this.f20717h.get(iVar).longValue());
            }
            throw new C3631m("Unsupported field: " + iVar);
        }

        /* renamed from: j */
        public boolean mo12781j(C3620i iVar) {
            return this.f20717h.containsKey(iVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public C3273b mo14245o() {
            C3273b bVar = new C3273b();
            bVar.f20715f = this.f20715f;
            bVar.f20716g = this.f20716g;
            bVar.f20717h.putAll(this.f20717h);
            bVar.f20718i = this.f20718i;
            return bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public C3249a mo14246p() {
            C3249a aVar = new C3249a();
            aVar.f20627f.putAll(this.f20717h);
            aVar.f20628g = C3271d.this.mo14230g();
            C2778q qVar = this.f20716g;
            if (qVar == null) {
                qVar = C3271d.this.f20711d;
            }
            aVar.f20629h = qVar;
            aVar.f20632k = this.f20718i;
            aVar.f20633l = this.f20719j;
            return aVar;
        }

        public String toString() {
            return this.f20717h.toString() + "," + this.f20715f + "," + this.f20716g;
        }
    }

    C3271d(C3250b bVar) {
        ArrayList<C3273b> arrayList = new ArrayList<>();
        this.f20714g = arrayList;
        this.f20708a = bVar.mo14175f();
        this.f20709b = bVar.mo14174e();
        this.f20710c = bVar.mo14173d();
        this.f20711d = bVar.mo14176g();
        arrayList.add(new C3273b());
    }

    C3271d(C3271d dVar) {
        ArrayList<C3273b> arrayList = new ArrayList<>();
        this.f20714g = arrayList;
        this.f20708a = dVar.f20708a;
        this.f20709b = dVar.f20709b;
        this.f20710c = dVar.f20710c;
        this.f20711d = dVar.f20711d;
        this.f20712e = dVar.f20712e;
        this.f20713f = dVar.f20713f;
        arrayList.add(new C3273b());
    }

    /* renamed from: c */
    static boolean m24287c(char c, char c2) {
        return c == c2 || Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
    }

    /* renamed from: e */
    private C3273b m24288e() {
        ArrayList<C3273b> arrayList = this.f20714g;
        return arrayList.get(arrayList.size() - 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo14227b(char c, char c2) {
        return mo14234k() ? c == c2 : m24287c(c, c2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C3271d mo14228d() {
        return new C3271d(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo14229f(boolean z) {
        ArrayList<C3273b> arrayList;
        int i;
        if (z) {
            arrayList = this.f20714g;
            i = arrayList.size() - 2;
        } else {
            arrayList = this.f20714g;
            i = arrayList.size() - 1;
        }
        arrayList.remove(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C2870h mo14230g() {
        C2870h hVar = m24288e().f20715f;
        if (hVar != null) {
            return hVar;
        }
        C2870h hVar2 = this.f20710c;
        return hVar2 == null ? C2877m.f19602j : hVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Locale mo14231h() {
        return this.f20708a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Long mo14232i(C3620i iVar) {
        return m24288e().f20717h.get(iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C3278h mo14233j() {
        return this.f20709b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo14234k() {
        return this.f20712e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo14235l() {
        return this.f20713f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo14236m(boolean z) {
        this.f20712e = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo14237n(C2778q qVar) {
        C3334d.m24473i(qVar, "zone");
        m24288e().f20716g = qVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public int mo14238o(C3620i iVar, long j, int i, int i2) {
        C3334d.m24473i(iVar, "field");
        Long put = m24288e().f20717h.put(iVar, Long.valueOf(j));
        return (put == null || put.longValue() == j) ? i2 : ~i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo14239p() {
        m24288e().f20718i = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo14240q(boolean z) {
        this.f20713f = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo14241r() {
        this.f20714g.add(m24288e().mo14245o());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo14242s(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3) {
        if (i + i3 > charSequence.length() || i2 + i3 > charSequence2.length()) {
            return false;
        }
        if (mo14234k()) {
            for (int i4 = 0; i4 < i3; i4++) {
                if (charSequence.charAt(i + i4) != charSequence2.charAt(i2 + i4)) {
                    return false;
                }
            }
            return true;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            char charAt = charSequence.charAt(i + i5);
            char charAt2 = charSequence2.charAt(i2 + i5);
            if (charAt != charAt2 && Character.toUpperCase(charAt) != Character.toUpperCase(charAt2) && Character.toLowerCase(charAt) != Character.toLowerCase(charAt2)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public C3273b mo14243t() {
        return m24288e();
    }

    public String toString() {
        return m24288e().toString();
    }
}
