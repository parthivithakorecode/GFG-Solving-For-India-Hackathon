package p065i5;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;
import p058h5.C2742b;
import p058h5.C2746e;
import p058h5.C2755h;
import p058h5.C2778q;
import p080k5.C3334d;
import p087l5.C3603a;
import p087l5.C3613d;
import p087l5.C3614e;
import p087l5.C3620i;
import p087l5.C3621j;
import p087l5.C3629k;

/* renamed from: i5.h */
public abstract class C2870h implements Comparable<C2870h> {

    /* renamed from: f */
    public static final C3629k<C2870h> f19559f = new C2871a();

    /* renamed from: g */
    private static final ConcurrentHashMap<String, C2870h> f19560g = new ConcurrentHashMap<>();

    /* renamed from: h */
    private static final ConcurrentHashMap<String, C2870h> f19561h = new ConcurrentHashMap<>();

    /* renamed from: i */
    private static final Method f19562i;

    /* renamed from: i5.h$a */
    class C2871a implements C3629k<C2870h> {
        C2871a() {
        }

        /* renamed from: b */
        public C2870h mo12783a(C3614e eVar) {
            return C2870h.m22476i(eVar);
        }
    }

    static {
        Method method;
        try {
            method = Locale.class.getMethod("getUnicodeLocaleType", new Class[]{String.class});
        } catch (Throwable unused) {
            method = null;
        }
        f19562i = method;
    }

    protected C2870h() {
    }

    /* renamed from: i */
    public static C2870h m22476i(C3614e eVar) {
        C3334d.m24473i(eVar, "temporal");
        C2870h hVar = (C2870h) eVar.mo12776b(C3621j.m25159a());
        return hVar != null ? hVar : C2877m.f19602j;
    }

    /* renamed from: l */
    private static void m22477l() {
        ConcurrentHashMap<String, C2870h> concurrentHashMap = f19560g;
        if (concurrentHashMap.isEmpty()) {
            m22480p(C2877m.f19602j);
            m22480p(C2890v.f19634j);
            m22480p(C2884r.f19625j);
            m22480p(C2879o.f19607k);
            C2873j jVar = C2873j.f19563j;
            m22480p(jVar);
            concurrentHashMap.putIfAbsent("Hijrah", jVar);
            f19561h.putIfAbsent("islamic", jVar);
            Iterator<S> it = ServiceLoader.load(C2870h.class, C2870h.class.getClassLoader()).iterator();
            while (it.hasNext()) {
                C2870h hVar = (C2870h) it.next();
                f19560g.putIfAbsent(hVar.mo13136k(), hVar);
                String j = hVar.mo13135j();
                if (j != null) {
                    f19561h.putIfAbsent(j, hVar);
                }
            }
        }
    }

    /* renamed from: n */
    public static C2870h m22478n(String str) {
        m22477l();
        C2870h hVar = f19560g.get(str);
        if (hVar != null) {
            return hVar;
        }
        C2870h hVar2 = f19561h.get(str);
        if (hVar2 != null) {
            return hVar2;
        }
        throw new C2742b("Unknown chronology: " + str);
    }

    /* renamed from: o */
    static C2870h m22479o(DataInput dataInput) {
        return m22478n(dataInput.readUTF());
    }

    /* renamed from: p */
    private static void m22480p(C2870h hVar) {
        f19560g.putIfAbsent(hVar.mo13136k(), hVar);
        String j = hVar.mo13135j();
        if (j != null) {
            f19561h.putIfAbsent(j, hVar);
        }
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C2889u((byte) 11, this);
    }

    /* renamed from: b */
    public int compareTo(C2870h hVar) {
        return mo13136k().compareTo(hVar.mo13136k());
    }

    /* renamed from: d */
    public abstract C2858b mo13128d(C3614e eVar);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public <D extends C2858b> D mo13129e(C3613d dVar) {
        D d = (C2858b) dVar;
        if (equals(d.mo12847r())) {
            return d;
        }
        throw new ClassCastException("Chrono mismatch, expected: " + mo13136k() + ", actual: " + d.mo12847r().mo13136k());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2870h) {
            return compareTo((C2870h) obj) == 0;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public <D extends C2858b> C2862d<D> mo13131f(C3613d dVar) {
        C2862d<D> dVar2 = (C2862d) dVar;
        if (equals(dVar2.mo12892y().mo12847r())) {
            return dVar2;
        }
        throw new ClassCastException("Chrono mismatch, required: " + mo13136k() + ", supplied: " + dVar2.mo12892y().mo12847r().mo13136k());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public <D extends C2858b> C2868g<D> mo13132g(C3613d dVar) {
        C2868g<D> gVar = (C2868g) dVar;
        if (equals(gVar.mo13043x().mo12847r())) {
            return gVar;
        }
        throw new ClassCastException("Chrono mismatch, required: " + mo13136k() + ", supplied: " + gVar.mo13043x().mo12847r().mo13136k());
    }

    /* renamed from: h */
    public abstract C2872i mo13133h(int i);

    public int hashCode() {
        return getClass().hashCode() ^ mo13136k().hashCode();
    }

    /* renamed from: j */
    public abstract String mo13135j();

    /* renamed from: k */
    public abstract String mo13136k();

    /* renamed from: m */
    public C2860c<?> mo13137m(C3614e eVar) {
        try {
            return mo13128d(eVar).mo12845p(C2755h.m21944r(eVar));
        } catch (C2742b e) {
            throw new C2742b("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + eVar.getClass(), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo13138q(Map<C3620i, Long> map, C3603a aVar, long j) {
        Long l = map.get(aVar);
        if (l == null || l.longValue() == j) {
            map.put(aVar, Long.valueOf(j));
            return;
        }
        throw new C2742b("Invalid state, field: " + aVar + " " + l + " conflicts with " + aVar + " " + j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo13139r(DataOutput dataOutput) {
        dataOutput.writeUTF(mo13136k());
    }

    /* renamed from: s */
    public C2865f<?> mo13140s(C2746e eVar, C2778q qVar) {
        return C2868g.m22465F(this, eVar, qVar);
    }

    public String toString() {
        return mo13136k();
    }
}
