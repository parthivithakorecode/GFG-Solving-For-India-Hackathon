package p058h5;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p087l5.C3603a;
import p087l5.C3613d;
import p087l5.C3614e;
import p087l5.C3615f;
import p087l5.C3620i;
import p087l5.C3621j;
import p087l5.C3629k;
import p087l5.C3631m;
import p087l5.C3632n;
import p094m5.C3732f;

/* renamed from: h5.r */
public final class C2780r extends C2778q implements C3614e, C3615f, Comparable<C2780r> {

    /* renamed from: j */
    public static final C3629k<C2780r> f19414j = new C2781a();

    /* renamed from: k */
    private static final ConcurrentMap<Integer, C2780r> f19415k = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: l */
    private static final ConcurrentMap<String, C2780r> f19416l = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: m */
    public static final C2780r f19417m = m22141z(0);

    /* renamed from: n */
    public static final C2780r f19418n = m22141z(-64800);

    /* renamed from: o */
    public static final C2780r f19419o = m22141z(64800);

    /* renamed from: h */
    private final int f19420h;

    /* renamed from: i */
    private final transient String f19421i;

    /* renamed from: h5.r$a */
    class C2781a implements C3629k<C2780r> {
        C2781a() {
        }

        /* renamed from: b */
        public C2780r mo12783a(C3614e eVar) {
            return C2780r.m22138v(eVar);
        }
    }

    private C2780r(int i) {
        this.f19420h = i;
        this.f19421i = m22137t(i);
    }

    /* renamed from: A */
    private static int m22133A(CharSequence charSequence, int i, boolean z) {
        if (!z || charSequence.charAt(i - 1) == ':') {
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence.charAt(i + 1);
            if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
                return ((charAt - '0') * 10) + (charAt2 - '0');
            }
            throw new C2742b("Invalid ID for ZoneOffset, non numeric characters found: " + charSequence);
        }
        throw new C2742b("Invalid ID for ZoneOffset, colon not found when expected: " + charSequence);
    }

    /* renamed from: B */
    static C2780r m22134B(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? m22141z(dataInput.readInt()) : m22141z(readByte * 900);
    }

    /* renamed from: C */
    private static int m22135C(int i, int i2, int i3) {
        return (i * 3600) + (i2 * 60) + i3;
    }

    /* renamed from: D */
    private static void m22136D(int i, int i2, int i3) {
        if (i < -18 || i > 18) {
            throw new C2742b("Zone offset hours not in valid range: value " + i + " is not in the range -18 to 18");
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                throw new C2742b("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                throw new C2742b("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            throw new C2742b("Zone offset minutes and seconds must have the same sign");
        }
        if (Math.abs(i2) > 59) {
            throw new C2742b("Zone offset minutes not in valid range: abs(value) " + Math.abs(i2) + " is not in the range 0 to 59");
        } else if (Math.abs(i3) > 59) {
            throw new C2742b("Zone offset seconds not in valid range: abs(value) " + Math.abs(i3) + " is not in the range 0 to 59");
        } else if (Math.abs(i) != 18) {
        } else {
            if (Math.abs(i2) > 0 || Math.abs(i3) > 0) {
                throw new C2742b("Zone offset not in valid range: -18:00 to +18:00");
            }
        }
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* renamed from: t */
    private static String m22137t(int i) {
        if (i == 0) {
            return "Z";
        }
        int abs = Math.abs(i);
        StringBuilder sb = new StringBuilder();
        int i2 = abs / 3600;
        int i3 = (abs / 60) % 60;
        sb.append(i < 0 ? "-" : "+");
        sb.append(i2 < 10 ? "0" : "");
        sb.append(i2);
        String str = ":0";
        sb.append(i3 < 10 ? str : ":");
        sb.append(i3);
        int i4 = abs % 60;
        if (i4 != 0) {
            if (i4 >= 10) {
                str = ":";
            }
            sb.append(str);
            sb.append(i4);
        }
        return sb.toString();
    }

    /* renamed from: v */
    public static C2780r m22138v(C3614e eVar) {
        C2780r rVar = (C2780r) eVar.mo12776b(C3621j.m25162d());
        if (rVar != null) {
            return rVar;
        }
        throw new C2742b("Unable to obtain ZoneOffset from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
    }

    private Object writeReplace() {
        return new C2771n((byte) 8, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x009a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00be  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p058h5.C2780r m22139x(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            p080k5.C3334d.m24473i(r7, r0)
            java.util.concurrent.ConcurrentMap<java.lang.String, h5.r> r0 = f19416l
            java.lang.Object r0 = r0.get(r7)
            h5.r r0 = (p058h5.C2780r) r0
            if (r0 == 0) goto L_0x0010
            return r0
        L_0x0010:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x006e
            r1 = 3
            if (r0 == r1) goto L_0x008a
            r4 = 5
            if (r0 == r4) goto L_0x0064
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L_0x005b
            r5 = 7
            if (r0 == r5) goto L_0x004e
            r1 = 9
            if (r0 != r1) goto L_0x0037
            int r0 = m22133A(r7, r2, r3)
            int r1 = m22133A(r7, r6, r2)
            int r2 = m22133A(r7, r5, r2)
            goto L_0x0090
        L_0x0037:
            h5.b r0 = new h5.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid ID for ZoneOffset, invalid format: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L_0x004e:
            int r0 = m22133A(r7, r2, r3)
            int r1 = m22133A(r7, r1, r3)
            int r2 = m22133A(r7, r4, r3)
            goto L_0x0090
        L_0x005b:
            int r0 = m22133A(r7, r2, r3)
            int r1 = m22133A(r7, r6, r2)
            goto L_0x006c
        L_0x0064:
            int r0 = m22133A(r7, r2, r3)
            int r1 = m22133A(r7, r1, r3)
        L_0x006c:
            r2 = r3
            goto L_0x0090
        L_0x006e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r1 = r7.charAt(r3)
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            char r7 = r7.charAt(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
        L_0x008a:
            int r0 = m22133A(r7, r2, r3)
            r1 = r3
            r2 = r1
        L_0x0090:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto L_0x00b4
            if (r3 != r5) goto L_0x009d
            goto L_0x00b4
        L_0x009d:
            h5.b r0 = new h5.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L_0x00b4:
            if (r3 != r5) goto L_0x00be
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            h5.r r7 = m22140y(r7, r0, r1)
            return r7
        L_0x00be:
            h5.r r7 = m22140y(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p058h5.C2780r.m22139x(java.lang.String):h5.r");
    }

    /* renamed from: y */
    public static C2780r m22140y(int i, int i2, int i3) {
        m22136D(i, i2, i3);
        return m22141z(m22135C(i, i2, i3));
    }

    /* renamed from: z */
    public static C2780r m22141z(int i) {
        if (Math.abs(i) > 64800) {
            throw new C2742b("Zone offset not in valid range: -18:00 to +18:00");
        } else if (i % 900 != 0) {
            return new C2780r(i);
        } else {
            Integer valueOf = Integer.valueOf(i);
            ConcurrentMap<Integer, C2780r> concurrentMap = f19415k;
            C2780r rVar = (C2780r) concurrentMap.get(valueOf);
            if (rVar != null) {
                return rVar;
            }
            concurrentMap.putIfAbsent(valueOf, new C2780r(i));
            C2780r rVar2 = (C2780r) concurrentMap.get(valueOf);
            f19416l.putIfAbsent(rVar2.mo13004k(), rVar2);
            return rVar2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo13010E(DataOutput dataOutput) {
        int i = this.f19420h;
        int i2 = i % 900 == 0 ? i / 900 : 127;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(i);
        }
    }

    /* renamed from: b */
    public <R> R mo12776b(C3629k<R> kVar) {
        if (kVar == C3621j.m25162d() || kVar == C3621j.m25164f()) {
            return this;
        }
        if (kVar == C3621j.m25160b() || kVar == C3621j.m25161c() || kVar == C3621j.m25163e() || kVar == C3621j.m25159a() || kVar == C3621j.m25165g()) {
            return null;
        }
        return kVar.mo12783a(this);
    }

    /* renamed from: d */
    public long mo12777d(C3620i iVar) {
        if (iVar == C3603a.OFFSET_SECONDS) {
            return (long) this.f19420h;
        }
        if (!(iVar instanceof C3603a)) {
            return iVar.mo14736j(this);
        }
        throw new C2742b("Unsupported field: " + iVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2780r) {
            return this.f19420h == ((C2780r) obj).f19420h;
        }
        return false;
    }

    /* renamed from: g */
    public int mo12778g(C3620i iVar) {
        if (iVar == C3603a.OFFSET_SECONDS) {
            return this.f19420h;
        }
        if (!(iVar instanceof C3603a)) {
            return mo12782n(iVar).mo14755a(mo12777d(iVar), iVar);
        }
        throw new C3631m("Unsupported field: " + iVar);
    }

    /* renamed from: h */
    public C3613d mo12780h(C3613d dVar) {
        return dVar.mo12804l(C3603a.OFFSET_SECONDS, (long) this.f19420h);
    }

    public int hashCode() {
        return this.f19420h;
    }

    /* renamed from: j */
    public boolean mo12781j(C3620i iVar) {
        return iVar instanceof C3603a ? iVar == C3603a.OFFSET_SECONDS : iVar != null && iVar.mo14733g(this);
    }

    /* renamed from: k */
    public String mo13004k() {
        return this.f19421i;
    }

    /* renamed from: n */
    public C3632n mo12782n(C3620i iVar) {
        if (iVar == C3603a.OFFSET_SECONDS) {
            return iVar.mo14734h();
        }
        if (!(iVar instanceof C3603a)) {
            return iVar.mo14730d(this);
        }
        throw new C3631m("Unsupported field: " + iVar);
    }

    /* renamed from: o */
    public C3732f mo13005o() {
        return C3732f.m25461f(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo13007s(DataOutput dataOutput) {
        dataOutput.writeByte(8);
        mo13010E(dataOutput);
    }

    public String toString() {
        return this.f19421i;
    }

    /* renamed from: u */
    public int compareTo(C2780r rVar) {
        return rVar.f19420h - this.f19420h;
    }

    /* renamed from: w */
    public int mo13013w() {
        return this.f19420h;
    }
}
