package p141u0;

import androidx.work.C1239b;
import java.util.List;
import p081l.C3441a;
import p089m0.C3634a;
import p089m0.C3635b;
import p089m0.C3646j;
import p089m0.C3657n;
import p089m0.C3662s;

/* renamed from: u0.p */
public final class C4108p {

    /* renamed from: s */
    private static final String f22312s = C3646j.m25231f("WorkSpec");

    /* renamed from: t */
    public static final C3441a<List<Object>, List<Object>> f22313t = new C4109a();

    /* renamed from: a */
    public String f22314a;

    /* renamed from: b */
    public C3662s f22315b = C3662s.ENQUEUED;

    /* renamed from: c */
    public String f22316c;

    /* renamed from: d */
    public String f22317d;

    /* renamed from: e */
    public C1239b f22318e;

    /* renamed from: f */
    public C1239b f22319f;

    /* renamed from: g */
    public long f22320g;

    /* renamed from: h */
    public long f22321h;

    /* renamed from: i */
    public long f22322i;

    /* renamed from: j */
    public C3635b f22323j;

    /* renamed from: k */
    public int f22324k;

    /* renamed from: l */
    public C3634a f22325l;

    /* renamed from: m */
    public long f22326m;

    /* renamed from: n */
    public long f22327n;

    /* renamed from: o */
    public long f22328o;

    /* renamed from: p */
    public long f22329p;

    /* renamed from: q */
    public boolean f22330q;

    /* renamed from: r */
    public C3657n f22331r;

    /* renamed from: u0.p$a */
    class C4109a implements C3441a<List<Object>, List<Object>> {
        C4109a() {
        }
    }

    /* renamed from: u0.p$b */
    public static class C4110b {

        /* renamed from: a */
        public String f22332a;

        /* renamed from: b */
        public C3662s f22333b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4110b)) {
                return false;
            }
            C4110b bVar = (C4110b) obj;
            if (this.f22333b != bVar.f22333b) {
                return false;
            }
            return this.f22332a.equals(bVar.f22332a);
        }

        public int hashCode() {
            return (this.f22332a.hashCode() * 31) + this.f22333b.hashCode();
        }
    }

    public C4108p(String str, String str2) {
        C1239b bVar = C1239b.f3361c;
        this.f22318e = bVar;
        this.f22319f = bVar;
        this.f22323j = C3635b.f21361i;
        this.f22325l = C3634a.EXPONENTIAL;
        this.f22326m = 30000;
        this.f22329p = -1;
        this.f22331r = C3657n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f22314a = str;
        this.f22316c = str2;
    }

    public C4108p(C4108p pVar) {
        C1239b bVar = C1239b.f3361c;
        this.f22318e = bVar;
        this.f22319f = bVar;
        this.f22323j = C3635b.f21361i;
        this.f22325l = C3634a.EXPONENTIAL;
        this.f22326m = 30000;
        this.f22329p = -1;
        this.f22331r = C3657n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f22314a = pVar.f22314a;
        this.f22316c = pVar.f22316c;
        this.f22315b = pVar.f22315b;
        this.f22317d = pVar.f22317d;
        this.f22318e = new C1239b(pVar.f22318e);
        this.f22319f = new C1239b(pVar.f22319f);
        this.f22320g = pVar.f22320g;
        this.f22321h = pVar.f22321h;
        this.f22322i = pVar.f22322i;
        this.f22323j = new C3635b(pVar.f22323j);
        this.f22324k = pVar.f22324k;
        this.f22325l = pVar.f22325l;
        this.f22326m = pVar.f22326m;
        this.f22327n = pVar.f22327n;
        this.f22328o = pVar.f22328o;
        this.f22329p = pVar.f22329p;
        this.f22330q = pVar.f22330q;
        this.f22331r = pVar.f22331r;
    }

    /* renamed from: a */
    public long mo15613a() {
        boolean z = false;
        if (mo15615c()) {
            if (this.f22325l == C3634a.LINEAR) {
                z = true;
            }
            return this.f22327n + Math.min(18000000, z ? this.f22326m * ((long) this.f22324k) : (long) Math.scalb((float) this.f22326m, this.f22324k - 1));
        }
        long j = 0;
        if (mo15616d()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = this.f22327n;
            long j3 = j2 == 0 ? currentTimeMillis + this.f22320g : j2;
            long j4 = this.f22322i;
            long j5 = this.f22321h;
            if (j4 != j5) {
                z = true;
            }
            int i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
            if (z) {
                if (i == 0) {
                    j = j4 * -1;
                }
                return j3 + j5 + j;
            }
            if (i != 0) {
                j = j5;
            }
            return j3 + j;
        }
        long j6 = this.f22327n;
        if (j6 == 0) {
            j6 = System.currentTimeMillis();
        }
        return j6 + this.f22320g;
    }

    /* renamed from: b */
    public boolean mo15614b() {
        return !C3635b.f21361i.equals(this.f22323j);
    }

    /* renamed from: c */
    public boolean mo15615c() {
        return this.f22315b == C3662s.ENQUEUED && this.f22324k > 0;
    }

    /* renamed from: d */
    public boolean mo15616d() {
        return this.f22321h != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4108p.class != obj.getClass()) {
            return false;
        }
        C4108p pVar = (C4108p) obj;
        if (this.f22320g != pVar.f22320g || this.f22321h != pVar.f22321h || this.f22322i != pVar.f22322i || this.f22324k != pVar.f22324k || this.f22326m != pVar.f22326m || this.f22327n != pVar.f22327n || this.f22328o != pVar.f22328o || this.f22329p != pVar.f22329p || this.f22330q != pVar.f22330q || !this.f22314a.equals(pVar.f22314a) || this.f22315b != pVar.f22315b || !this.f22316c.equals(pVar.f22316c)) {
            return false;
        }
        String str = this.f22317d;
        if (str == null ? pVar.f22317d != null : !str.equals(pVar.f22317d)) {
            return false;
        }
        if (this.f22318e.equals(pVar.f22318e) && this.f22319f.equals(pVar.f22319f) && this.f22323j.equals(pVar.f22323j) && this.f22325l == pVar.f22325l) {
            return this.f22331r == pVar.f22331r;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f22314a.hashCode() * 31) + this.f22315b.hashCode()) * 31) + this.f22316c.hashCode()) * 31;
        String str = this.f22317d;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long j = this.f22320g;
        long j2 = this.f22321h;
        long j3 = this.f22322i;
        long j4 = this.f22326m;
        long j5 = this.f22327n;
        long j6 = this.f22328o;
        long j7 = this.f22329p;
        return ((((((((((((((((((((((((((((hashCode + hashCode2) * 31) + this.f22318e.hashCode()) * 31) + this.f22319f.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f22323j.hashCode()) * 31) + this.f22324k) * 31) + this.f22325l.hashCode()) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.f22330q ? 1 : 0)) * 31) + this.f22331r.hashCode();
    }

    public String toString() {
        return "{WorkSpec: " + this.f22314a + "}";
    }
}
