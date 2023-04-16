package p073j5;

import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;
import p058h5.C2742b;
import p058h5.C2770m;
import p058h5.C2778q;
import p065i5.C2870h;
import p065i5.C2877m;
import p073j5.C3253c;
import p073j5.C3271d;
import p080k5.C3334d;
import p087l5.C3603a;
import p087l5.C3605c;
import p087l5.C3614e;
import p087l5.C3620i;
import p087l5.C3629k;

/* renamed from: j5.b */
public final class C3250b {

    /* renamed from: h */
    public static final C3250b f20634h;

    /* renamed from: i */
    public static final C3250b f20635i;

    /* renamed from: j */
    public static final C3250b f20636j;

    /* renamed from: k */
    public static final C3250b f20637k;

    /* renamed from: l */
    public static final C3250b f20638l;

    /* renamed from: m */
    public static final C3250b f20639m;

    /* renamed from: n */
    public static final C3250b f20640n;

    /* renamed from: o */
    public static final C3250b f20641o;

    /* renamed from: p */
    public static final C3250b f20642p;

    /* renamed from: q */
    public static final C3250b f20643q;

    /* renamed from: r */
    public static final C3250b f20644r;

    /* renamed from: s */
    public static final C3250b f20645s;

    /* renamed from: t */
    public static final C3250b f20646t;

    /* renamed from: u */
    public static final C3250b f20647u;

    /* renamed from: v */
    public static final C3250b f20648v;

    /* renamed from: w */
    private static final C3629k<C2770m> f20649w = new C3251a();

    /* renamed from: x */
    private static final C3629k<Boolean> f20650x = new C3252b();

    /* renamed from: a */
    private final C3253c.C3259f f20651a;

    /* renamed from: b */
    private final Locale f20652b;

    /* renamed from: c */
    private final C3278h f20653c;

    /* renamed from: d */
    private final C3279i f20654d;

    /* renamed from: e */
    private final Set<C3620i> f20655e;

    /* renamed from: f */
    private final C2870h f20656f;

    /* renamed from: g */
    private final C2778q f20657g;

    /* renamed from: j5.b$a */
    class C3251a implements C3629k<C2770m> {
        C3251a() {
        }

        /* renamed from: b */
        public C2770m mo12783a(C3614e eVar) {
            return eVar instanceof C3249a ? ((C3249a) eVar).f20633l : C2770m.f19394i;
        }
    }

    /* renamed from: j5.b$b */
    class C3252b implements C3629k<Boolean> {
        C3252b() {
        }

        /* renamed from: b */
        public Boolean mo12783a(C3614e eVar) {
            return eVar instanceof C3249a ? Boolean.valueOf(((C3249a) eVar).f20632k) : Boolean.FALSE;
        }
    }

    static {
        C3253c cVar = new C3253c();
        C3603a aVar = C3603a.YEAR;
        C3280j jVar = C3280j.EXCEEDS_PAD;
        C3253c e = cVar.mo14193l(aVar, 4, 10, jVar).mo14187e('-');
        C3603a aVar2 = C3603a.MONTH_OF_YEAR;
        C3253c e2 = e.mo14192k(aVar2, 2).mo14187e('-');
        C3603a aVar3 = C3603a.DAY_OF_MONTH;
        C3253c k = e2.mo14192k(aVar3, 2);
        C3279i iVar = C3279i.STRICT;
        C3250b t = k.mo14201t(iVar);
        C2877m mVar = C2877m.f19602j;
        C3250b l = t.mo14179l(mVar);
        f20634h = l;
        f20635i = new C3253c().mo14197p().mo14184a(l).mo14190h().mo14201t(iVar).mo14179l(mVar);
        f20636j = new C3253c().mo14197p().mo14184a(l).mo14196o().mo14190h().mo14201t(iVar).mo14179l(mVar);
        C3253c cVar2 = new C3253c();
        C3603a aVar4 = C3603a.HOUR_OF_DAY;
        C3253c e3 = cVar2.mo14192k(aVar4, 2).mo14187e(':');
        C3603a aVar5 = C3603a.MINUTE_OF_HOUR;
        C3253c e4 = e3.mo14192k(aVar5, 2).mo14196o().mo14187e(':');
        C3603a aVar6 = C3603a.SECOND_OF_MINUTE;
        C3250b t2 = e4.mo14192k(aVar6, 2).mo14196o().mo14185b(C3603a.NANO_OF_SECOND, 0, 9, true).mo14201t(iVar);
        f20637k = t2;
        f20638l = new C3253c().mo14197p().mo14184a(t2).mo14190h().mo14201t(iVar);
        f20639m = new C3253c().mo14197p().mo14184a(t2).mo14196o().mo14190h().mo14201t(iVar);
        C3250b l2 = new C3253c().mo14197p().mo14184a(l).mo14187e('T').mo14184a(t2).mo14201t(iVar).mo14179l(mVar);
        f20640n = l2;
        C3250b l3 = new C3253c().mo14197p().mo14184a(l2).mo14190h().mo14201t(iVar).mo14179l(mVar);
        f20641o = l3;
        f20642p = new C3253c().mo14184a(l3).mo14196o().mo14187e('[').mo14198q().mo14194m().mo14187e(']').mo14201t(iVar).mo14179l(mVar);
        f20643q = new C3253c().mo14184a(l2).mo14196o().mo14190h().mo14196o().mo14187e('[').mo14198q().mo14194m().mo14187e(']').mo14201t(iVar).mo14179l(mVar);
        f20644r = new C3253c().mo14197p().mo14193l(aVar, 4, 10, jVar).mo14187e('-').mo14192k(C3603a.DAY_OF_YEAR, 3).mo14196o().mo14190h().mo14201t(iVar).mo14179l(mVar);
        C3253c e5 = new C3253c().mo14197p().mo14193l(C3605c.f21330d, 4, 10, jVar).mo14188f("-W").mo14192k(C3605c.f21329c, 2).mo14187e('-');
        C3603a aVar7 = C3603a.DAY_OF_WEEK;
        f20645s = e5.mo14192k(aVar7, 1).mo14196o().mo14190h().mo14201t(iVar).mo14179l(mVar);
        f20646t = new C3253c().mo14197p().mo14186c().mo14201t(iVar);
        f20647u = new C3253c().mo14197p().mo14192k(aVar, 4).mo14192k(aVar2, 2).mo14192k(aVar3, 2).mo14196o().mo14189g("+HHMMss", "Z").mo14201t(iVar).mo14179l(mVar);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        C2877m mVar2 = mVar;
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        f20648v = new C3253c().mo14197p().mo14199r().mo14196o().mo14191i(aVar7, hashMap).mo14188f(", ").mo14195n().mo14193l(aVar3, 1, 2, C3280j.NOT_NEGATIVE).mo14187e(' ').mo14191i(aVar2, hashMap2).mo14187e(' ').mo14192k(aVar, 4).mo14187e(' ').mo14192k(aVar4, 2).mo14187e(':').mo14192k(aVar5, 2).mo14196o().mo14187e(':').mo14192k(aVar6, 2).mo14195n().mo14187e(' ').mo14189g("+HHMM", "GMT").mo14201t(C3279i.SMART).mo14179l(mVar2);
    }

    C3250b(C3253c.C3259f fVar, Locale locale, C3278h hVar, C3279i iVar, Set<C3620i> set, C2870h hVar2, C2778q qVar) {
        this.f20651a = (C3253c.C3259f) C3334d.m24473i(fVar, "printerParser");
        this.f20652b = (Locale) C3334d.m24473i(locale, "locale");
        this.f20653c = (C3278h) C3334d.m24473i(hVar, "decimalStyle");
        this.f20654d = (C3279i) C3334d.m24473i(iVar, "resolverStyle");
        this.f20655e = set;
        this.f20656f = hVar2;
        this.f20657g = qVar;
    }

    /* renamed from: a */
    private C3274e m24201a(CharSequence charSequence, RuntimeException runtimeException) {
        String str;
        if (charSequence.length() > 64) {
            str = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            str = charSequence.toString();
        }
        return new C3274e("Text '" + str + "' could not be parsed: " + runtimeException.getMessage(), charSequence, 0, runtimeException);
    }

    /* renamed from: i */
    private C3249a m24202i(CharSequence charSequence, ParsePosition parsePosition) {
        String str;
        ParsePosition parsePosition2 = parsePosition != null ? parsePosition : new ParsePosition(0);
        C3271d.C3273b j = m24203j(charSequence, parsePosition2);
        if (j != null && parsePosition2.getErrorIndex() < 0 && (parsePosition != null || parsePosition2.getIndex() >= charSequence.length())) {
            return j.mo14246p();
        }
        if (charSequence.length() > 64) {
            str = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            str = charSequence.toString();
        }
        if (parsePosition2.getErrorIndex() >= 0) {
            throw new C3274e("Text '" + str + "' could not be parsed at index " + parsePosition2.getErrorIndex(), charSequence, parsePosition2.getErrorIndex());
        }
        throw new C3274e("Text '" + str + "' could not be parsed, unparsed text found at index " + parsePosition2.getIndex(), charSequence, parsePosition2.getIndex());
    }

    /* renamed from: j */
    private C3271d.C3273b m24203j(CharSequence charSequence, ParsePosition parsePosition) {
        C3334d.m24473i(charSequence, "text");
        C3334d.m24473i(parsePosition, "position");
        C3271d dVar = new C3271d(this);
        int b = this.f20651a.mo14208b(dVar, charSequence, parsePosition.getIndex());
        if (b < 0) {
            parsePosition.setErrorIndex(~b);
            return null;
        }
        parsePosition.setIndex(b);
        return dVar.mo14243t();
    }

    /* renamed from: b */
    public String mo14171b(C3614e eVar) {
        StringBuilder sb = new StringBuilder(32);
        mo14172c(eVar, sb);
        return sb.toString();
    }

    /* renamed from: c */
    public void mo14172c(C3614e eVar, Appendable appendable) {
        C3334d.m24473i(eVar, "temporal");
        C3334d.m24473i(appendable, "appendable");
        try {
            C3275f fVar = new C3275f(eVar, this);
            if (appendable instanceof StringBuilder) {
                this.f20651a.mo14209d(fVar, (StringBuilder) appendable);
                return;
            }
            StringBuilder sb = new StringBuilder(32);
            this.f20651a.mo14209d(fVar, sb);
            appendable.append(sb);
        } catch (IOException e) {
            throw new C2742b(e.getMessage(), e);
        }
    }

    /* renamed from: d */
    public C2870h mo14173d() {
        return this.f20656f;
    }

    /* renamed from: e */
    public C3278h mo14174e() {
        return this.f20653c;
    }

    /* renamed from: f */
    public Locale mo14175f() {
        return this.f20652b;
    }

    /* renamed from: g */
    public C2778q mo14176g() {
        return this.f20657g;
    }

    /* renamed from: h */
    public <T> T mo14177h(CharSequence charSequence, C3629k<T> kVar) {
        C3334d.m24473i(charSequence, "text");
        C3334d.m24473i(kVar, "type");
        try {
            return m24202i(charSequence, (ParsePosition) null).mo14165B(this.f20654d, this.f20655e).mo14169r(kVar);
        } catch (C3274e e) {
            throw e;
        } catch (RuntimeException e2) {
            throw m24201a(charSequence, e2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C3253c.C3259f mo14178k(boolean z) {
        return this.f20651a.mo14211a(z);
    }

    /* renamed from: l */
    public C3250b mo14179l(C2870h hVar) {
        if (C3334d.m24467c(this.f20656f, hVar)) {
            return this;
        }
        return new C3250b(this.f20651a, this.f20652b, this.f20653c, this.f20654d, this.f20655e, hVar, this.f20657g);
    }

    /* renamed from: m */
    public C3250b mo14180m(C3279i iVar) {
        C3334d.m24473i(iVar, "resolverStyle");
        if (C3334d.m24467c(this.f20654d, iVar)) {
            return this;
        }
        return new C3250b(this.f20651a, this.f20652b, this.f20653c, iVar, this.f20655e, this.f20656f, this.f20657g);
    }

    public String toString() {
        String fVar = this.f20651a.toString();
        return fVar.startsWith("[") ? fVar : fVar.substring(1, fVar.length() - 1);
    }
}
