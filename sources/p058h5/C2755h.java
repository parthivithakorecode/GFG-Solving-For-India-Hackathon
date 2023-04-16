package p058h5;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import p080k5.C3333c;
import p080k5.C3334d;
import p087l5.C3603a;
import p087l5.C3604b;
import p087l5.C3613d;
import p087l5.C3614e;
import p087l5.C3615f;
import p087l5.C3620i;
import p087l5.C3621j;
import p087l5.C3629k;
import p087l5.C3630l;
import p087l5.C3631m;
import p087l5.C3632n;

/* renamed from: h5.h */
public final class C2755h extends C3333c implements C3613d, C3615f, Comparable<C2755h>, Serializable {

    /* renamed from: j */
    public static final C2755h f19349j;

    /* renamed from: k */
    public static final C2755h f19350k = new C2755h(23, 59, 59, 999999999);

    /* renamed from: l */
    public static final C2755h f19351l;

    /* renamed from: m */
    public static final C2755h f19352m;

    /* renamed from: n */
    public static final C3629k<C2755h> f19353n = new C2756a();

    /* renamed from: o */
    private static final C2755h[] f19354o = new C2755h[24];

    /* renamed from: f */
    private final byte f19355f;

    /* renamed from: g */
    private final byte f19356g;

    /* renamed from: h */
    private final byte f19357h;

    /* renamed from: i */
    private final int f19358i;

    /* renamed from: h5.h$a */
    class C2756a implements C3629k<C2755h> {
        C2756a() {
        }

        /* renamed from: b */
        public C2755h mo12783a(C3614e eVar) {
            return C2755h.m21944r(eVar);
        }
    }

    /* renamed from: h5.h$b */
    static /* synthetic */ class C2757b {

        /* renamed from: a */
        static final /* synthetic */ int[] f19359a;

        /* renamed from: b */
        static final /* synthetic */ int[] f19360b;

        /* JADX WARNING: Can't wrap try/catch for region: R(46:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|(3:57|58|60)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(50:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Can't wrap try/catch for region: R(52:0|1|2|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Can't wrap try/catch for region: R(53:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x006f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0079 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x008d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0097 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00a1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00ad */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00d1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00dd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00f5 */
        static {
            /*
                l5.b[] r0 = p087l5.C3604b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19360b = r0
                r1 = 1
                l5.b r2 = p087l5.C3604b.NANOS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f19360b     // Catch:{ NoSuchFieldError -> 0x001d }
                l5.b r3 = p087l5.C3604b.MICROS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f19360b     // Catch:{ NoSuchFieldError -> 0x0028 }
                l5.b r4 = p087l5.C3604b.MILLIS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f19360b     // Catch:{ NoSuchFieldError -> 0x0033 }
                l5.b r5 = p087l5.C3604b.SECONDS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f19360b     // Catch:{ NoSuchFieldError -> 0x003e }
                l5.b r6 = p087l5.C3604b.MINUTES     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f19360b     // Catch:{ NoSuchFieldError -> 0x0049 }
                l5.b r7 = p087l5.C3604b.HOURS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f19360b     // Catch:{ NoSuchFieldError -> 0x0054 }
                l5.b r8 = p087l5.C3604b.HALF_DAYS     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                l5.a[] r7 = p087l5.C3603a.values()
                int r7 = r7.length
                int[] r7 = new int[r7]
                f19359a = r7
                l5.a r8 = p087l5.C3603a.NANO_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x0065 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0065 }
                r7[r8] = r1     // Catch:{ NoSuchFieldError -> 0x0065 }
            L_0x0065:
                int[] r1 = f19359a     // Catch:{ NoSuchFieldError -> 0x006f }
                l5.a r7 = p087l5.C3603a.NANO_OF_DAY     // Catch:{ NoSuchFieldError -> 0x006f }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
                r1[r7] = r0     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                int[] r0 = f19359a     // Catch:{ NoSuchFieldError -> 0x0079 }
                l5.a r1 = p087l5.C3603a.MICRO_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x0079 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0079 }
            L_0x0079:
                int[] r0 = f19359a     // Catch:{ NoSuchFieldError -> 0x0083 }
                l5.a r1 = p087l5.C3603a.MICRO_OF_DAY     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f19359a     // Catch:{ NoSuchFieldError -> 0x008d }
                l5.a r1 = p087l5.C3603a.MILLI_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x008d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                int[] r0 = f19359a     // Catch:{ NoSuchFieldError -> 0x0097 }
                l5.a r1 = p087l5.C3603a.MILLI_OF_DAY     // Catch:{ NoSuchFieldError -> 0x0097 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0097 }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x0097 }
            L_0x0097:
                int[] r0 = f19359a     // Catch:{ NoSuchFieldError -> 0x00a1 }
                l5.a r1 = p087l5.C3603a.SECOND_OF_MINUTE     // Catch:{ NoSuchFieldError -> 0x00a1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a1 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x00a1 }
            L_0x00a1:
                int[] r0 = f19359a     // Catch:{ NoSuchFieldError -> 0x00ad }
                l5.a r1 = p087l5.C3603a.SECOND_OF_DAY     // Catch:{ NoSuchFieldError -> 0x00ad }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ad }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00ad }
            L_0x00ad:
                int[] r0 = f19359a     // Catch:{ NoSuchFieldError -> 0x00b9 }
                l5.a r1 = p087l5.C3603a.MINUTE_OF_HOUR     // Catch:{ NoSuchFieldError -> 0x00b9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b9 }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b9 }
            L_0x00b9:
                int[] r0 = f19359a     // Catch:{ NoSuchFieldError -> 0x00c5 }
                l5.a r1 = p087l5.C3603a.MINUTE_OF_DAY     // Catch:{ NoSuchFieldError -> 0x00c5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c5 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c5 }
            L_0x00c5:
                int[] r0 = f19359a     // Catch:{ NoSuchFieldError -> 0x00d1 }
                l5.a r1 = p087l5.C3603a.HOUR_OF_AMPM     // Catch:{ NoSuchFieldError -> 0x00d1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d1 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d1 }
            L_0x00d1:
                int[] r0 = f19359a     // Catch:{ NoSuchFieldError -> 0x00dd }
                l5.a r1 = p087l5.C3603a.CLOCK_HOUR_OF_AMPM     // Catch:{ NoSuchFieldError -> 0x00dd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00dd }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00dd }
            L_0x00dd:
                int[] r0 = f19359a     // Catch:{ NoSuchFieldError -> 0x00e9 }
                l5.a r1 = p087l5.C3603a.HOUR_OF_DAY     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r0 = f19359a     // Catch:{ NoSuchFieldError -> 0x00f5 }
                l5.a r1 = p087l5.C3603a.CLOCK_HOUR_OF_DAY     // Catch:{ NoSuchFieldError -> 0x00f5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f5 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f5 }
            L_0x00f5:
                int[] r0 = f19359a     // Catch:{ NoSuchFieldError -> 0x0101 }
                l5.a r1 = p087l5.C3603a.AMPM_OF_DAY     // Catch:{ NoSuchFieldError -> 0x0101 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0101 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0101 }
            L_0x0101:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p058h5.C2755h.C2757b.<clinit>():void");
        }
    }

    static {
        int i = 0;
        while (true) {
            C2755h[] hVarArr = f19354o;
            if (i < hVarArr.length) {
                hVarArr[i] = new C2755h(i, 0, 0, 0);
                i++;
            } else {
                f19351l = hVarArr[0];
                f19352m = hVarArr[12];
                f19349j = hVarArr[0];
                return;
            }
        }
    }

    private C2755h(int i, int i2, int i3, int i4) {
        this.f19355f = (byte) i;
        this.f19356g = (byte) i2;
        this.f19357h = (byte) i3;
        this.f19358i = i4;
    }

    /* renamed from: A */
    public static C2755h m21938A(int i, int i2, int i3, int i4) {
        C3603a.HOUR_OF_DAY.mo14738l((long) i);
        C3603a.MINUTE_OF_HOUR.mo14738l((long) i2);
        C3603a.SECOND_OF_MINUTE.mo14738l((long) i3);
        C3603a.NANO_OF_SECOND.mo14738l((long) i4);
        return m21943q(i, i2, i3, i4);
    }

    /* renamed from: B */
    public static C2755h m21939B(long j) {
        C3603a.NANO_OF_DAY.mo14738l(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (((long) i) * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (((long) i2) * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return m21943q(i, i2, i3, (int) (j3 - (((long) i3) * 1000000000)));
    }

    /* renamed from: C */
    public static C2755h m21940C(long j) {
        C3603a.SECOND_OF_DAY.mo14738l(j);
        int i = (int) (j / 3600);
        long j2 = j - ((long) (i * 3600));
        int i2 = (int) (j2 / 60);
        return m21943q(i, i2, (int) (j2 - ((long) (i2 * 60))), 0);
    }

    /* renamed from: D */
    static C2755h m21941D(long j, int i) {
        C3603a.SECOND_OF_DAY.mo14738l(j);
        C3603a.NANO_OF_SECOND.mo14738l((long) i);
        int i2 = (int) (j / 3600);
        long j2 = j - ((long) (i2 * 3600));
        int i3 = (int) (j2 / 60);
        return m21943q(i2, i3, (int) (j2 - ((long) (i3 * 60))), i);
    }

    /* renamed from: J */
    static C2755h m21942J(DataInput dataInput) {
        int i;
        int i2;
        int readByte = dataInput.readByte();
        int i3 = 0;
        if (readByte < 0) {
            readByte = ~readByte;
            i = 0;
            i2 = 0;
        } else {
            byte readByte2 = dataInput.readByte();
            if (readByte2 < 0) {
                int i4 = ~readByte2;
                i2 = 0;
                i3 = i4;
                i = 0;
            } else {
                byte readByte3 = dataInput.readByte();
                if (readByte3 < 0) {
                    i = ~readByte3;
                } else {
                    i3 = dataInput.readInt();
                    i = readByte3;
                }
                byte b = readByte2;
                i2 = i3;
                i3 = b;
            }
        }
        return m21938A(readByte, i3, i, i2);
    }

    /* renamed from: q */
    private static C2755h m21943q(int i, int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? f19354o[i] : new C2755h(i, i2, i3, i4);
    }

    /* renamed from: r */
    public static C2755h m21944r(C3614e eVar) {
        C2755h hVar = (C2755h) eVar.mo12776b(C3621j.m25161c());
        if (hVar != null) {
            return hVar;
        }
        throw new C2742b("Unable to obtain LocalTime from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* renamed from: s */
    private int m21945s(C3620i iVar) {
        switch (C2757b.f19359a[((C3603a) iVar).ordinal()]) {
            case 1:
                return this.f19358i;
            case 2:
                throw new C2742b("Field too large for an int: " + iVar);
            case 3:
                return this.f19358i / 1000;
            case 4:
                throw new C2742b("Field too large for an int: " + iVar);
            case 5:
                return this.f19358i / 1000000;
            case 6:
                return (int) (mo12900K() / 1000000);
            case 7:
                return this.f19357h;
            case 8:
                return mo12901L();
            case 9:
                return this.f19356g;
            case 10:
                return (this.f19355f * 60) + this.f19356g;
            case 11:
                return this.f19355f % 12;
            case 12:
                int i = this.f19355f % 12;
                if (i % 12 == 0) {
                    return 12;
                }
                return i;
            case 13:
                return this.f19355f;
            case 14:
                byte b = this.f19355f;
                if (b == 0) {
                    return 24;
                }
                return b;
            case 15:
                return this.f19355f / 12;
            default:
                throw new C3631m("Unsupported field: " + iVar);
        }
    }

    private Object writeReplace() {
        return new C2771n((byte) 5, this);
    }

    /* renamed from: y */
    public static C2755h m21946y(int i, int i2) {
        C3603a.HOUR_OF_DAY.mo14738l((long) i);
        if (i2 == 0) {
            return f19354o[i];
        }
        C3603a.MINUTE_OF_HOUR.mo14738l((long) i2);
        return new C2755h(i, i2, 0, 0);
    }

    /* renamed from: z */
    public static C2755h m21947z(int i, int i2, int i3) {
        C3603a.HOUR_OF_DAY.mo14738l((long) i);
        if ((i2 | i3) == 0) {
            return f19354o[i];
        }
        C3603a.MINUTE_OF_HOUR.mo14738l((long) i2);
        C3603a.SECOND_OF_MINUTE.mo14738l((long) i3);
        return new C2755h(i, i2, i3, 0);
    }

    /* renamed from: E */
    public C2755h mo12800e(long j, C3630l lVar) {
        if (!(lVar instanceof C3604b)) {
            return (C2755h) lVar.mo14741d(this, j);
        }
        switch (C2757b.f19360b[((C3604b) lVar).ordinal()]) {
            case 1:
                return mo12898H(j);
            case 2:
                return mo12898H((j % 86400000000L) * 1000);
            case 3:
                return mo12898H((j % 86400000) * 1000000);
            case 4:
                return mo12899I(j);
            case 5:
                return mo12897G(j);
            case 6:
                return mo12896F(j);
            case 7:
                return mo12896F((j % 2) * 12);
            default:
                throw new C3631m("Unsupported unit: " + lVar);
        }
    }

    /* renamed from: F */
    public C2755h mo12896F(long j) {
        return j == 0 ? this : m21943q(((((int) (j % 24)) + this.f19355f) + 24) % 24, this.f19356g, this.f19357h, this.f19358i);
    }

    /* renamed from: G */
    public C2755h mo12897G(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.f19355f * 60) + this.f19356g;
        int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
        return i == i2 ? this : m21943q(i2 / 60, i2 % 60, this.f19357h, this.f19358i);
    }

    /* renamed from: H */
    public C2755h mo12898H(long j) {
        if (j == 0) {
            return this;
        }
        long K = mo12900K();
        long j2 = (((j % 86400000000000L) + K) + 86400000000000L) % 86400000000000L;
        return K == j2 ? this : m21943q((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
    }

    /* renamed from: I */
    public C2755h mo12899I(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.f19355f * 3600) + (this.f19356g * 60) + this.f19357h;
        int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
        return i == i2 ? this : m21943q(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.f19358i);
    }

    /* renamed from: K */
    public long mo12900K() {
        return (((long) this.f19355f) * 3600000000000L) + (((long) this.f19356g) * 60000000000L) + (((long) this.f19357h) * 1000000000) + ((long) this.f19358i);
    }

    /* renamed from: L */
    public int mo12901L() {
        return (this.f19355f * 3600) + (this.f19356g * 60) + this.f19357h;
    }

    /* renamed from: M */
    public C2755h mo12805m(C3615f fVar) {
        return fVar instanceof C2755h ? (C2755h) fVar : (C2755h) fVar.mo12780h(this);
    }

    /* renamed from: N */
    public C2755h mo12804l(C3620i iVar, long j) {
        if (!(iVar instanceof C3603a)) {
            return (C2755h) iVar.mo14735i(this, j);
        }
        C3603a aVar = (C3603a) iVar;
        aVar.mo14738l(j);
        switch (C2757b.f19359a[aVar.ordinal()]) {
            case 1:
                return mo12906Q((int) j);
            case 2:
                return m21939B(j);
            case 3:
                return mo12906Q(((int) j) * 1000);
            case 4:
                return m21939B(j * 1000);
            case 5:
                return mo12906Q(((int) j) * 1000000);
            case 6:
                return m21939B(j * 1000000);
            case 7:
                return mo12907R((int) j);
            case 8:
                return mo12899I(j - ((long) mo12901L()));
            case 9:
                return mo12905P((int) j);
            case 10:
                return mo12897G(j - ((long) ((this.f19355f * 60) + this.f19356g)));
            case 11:
                return mo12896F(j - ((long) (this.f19355f % 12)));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return mo12896F(j - ((long) (this.f19355f % 12)));
            case 13:
                return mo12904O((int) j);
            case 14:
                if (j == 24) {
                    j = 0;
                }
                return mo12904O((int) j);
            case 15:
                return mo12896F((j - ((long) (this.f19355f / 12))) * 12);
            default:
                throw new C3631m("Unsupported field: " + iVar);
        }
    }

    /* renamed from: O */
    public C2755h mo12904O(int i) {
        if (this.f19355f == i) {
            return this;
        }
        C3603a.HOUR_OF_DAY.mo14738l((long) i);
        return m21943q(i, this.f19356g, this.f19357h, this.f19358i);
    }

    /* renamed from: P */
    public C2755h mo12905P(int i) {
        if (this.f19356g == i) {
            return this;
        }
        C3603a.MINUTE_OF_HOUR.mo14738l((long) i);
        return m21943q(this.f19355f, i, this.f19357h, this.f19358i);
    }

    /* renamed from: Q */
    public C2755h mo12906Q(int i) {
        if (this.f19358i == i) {
            return this;
        }
        C3603a.NANO_OF_SECOND.mo14738l((long) i);
        return m21943q(this.f19355f, this.f19356g, this.f19357h, i);
    }

    /* renamed from: R */
    public C2755h mo12907R(int i) {
        if (this.f19357h == i) {
            return this;
        }
        C3603a.SECOND_OF_MINUTE.mo14738l((long) i);
        return m21943q(this.f19355f, this.f19356g, i, this.f19358i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo12908S(DataOutput dataOutput) {
        byte b;
        if (this.f19358i == 0) {
            if (this.f19357h != 0) {
                dataOutput.writeByte(this.f19355f);
                dataOutput.writeByte(this.f19356g);
                b = this.f19357h;
            } else if (this.f19356g == 0) {
                b = this.f19355f;
            } else {
                dataOutput.writeByte(this.f19355f);
                b = this.f19356g;
            }
            dataOutput.writeByte(~b);
            return;
        }
        dataOutput.writeByte(this.f19355f);
        dataOutput.writeByte(this.f19356g);
        dataOutput.writeByte(this.f19357h);
        dataOutput.writeInt(this.f19358i);
    }

    /* renamed from: b */
    public <R> R mo12776b(C3629k<R> kVar) {
        if (kVar == C3621j.m25163e()) {
            return C3604b.NANOS;
        }
        if (kVar == C3621j.m25161c()) {
            return this;
        }
        if (kVar == C3621j.m25159a() || kVar == C3621j.m25165g() || kVar == C3621j.m25164f() || kVar == C3621j.m25162d() || kVar == C3621j.m25160b()) {
            return null;
        }
        return kVar.mo12783a(this);
    }

    /* renamed from: d */
    public long mo12777d(C3620i iVar) {
        return iVar instanceof C3603a ? iVar == C3603a.NANO_OF_DAY ? mo12900K() : iVar == C3603a.MICRO_OF_DAY ? mo12900K() / 1000 : (long) m21945s(iVar) : iVar.mo14736j(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2755h)) {
            return false;
        }
        C2755h hVar = (C2755h) obj;
        return this.f19355f == hVar.f19355f && this.f19356g == hVar.f19356g && this.f19357h == hVar.f19357h && this.f19358i == hVar.f19358i;
    }

    /* renamed from: g */
    public int mo12778g(C3620i iVar) {
        return iVar instanceof C3603a ? m21945s(iVar) : super.mo12778g(iVar);
    }

    /* renamed from: h */
    public C3613d mo12780h(C3613d dVar) {
        return dVar.mo12804l(C3603a.NANO_OF_DAY, mo12900K());
    }

    public int hashCode() {
        long K = mo12900K();
        return (int) (K ^ (K >>> 32));
    }

    /* renamed from: j */
    public boolean mo12781j(C3620i iVar) {
        return iVar instanceof C3603a ? iVar.mo14732f() : iVar != null && iVar.mo14733g(this);
    }

    /* renamed from: n */
    public C3632n mo12782n(C3620i iVar) {
        return super.mo12782n(iVar);
    }

    /* renamed from: o */
    public C2768l mo12912o(C2780r rVar) {
        return C2768l.m22042s(this, rVar);
    }

    /* renamed from: p */
    public int compareTo(C2755h hVar) {
        int a = C3334d.m24465a(this.f19355f, hVar.f19355f);
        if (a != 0) {
            return a;
        }
        int a2 = C3334d.m24465a(this.f19356g, hVar.f19356g);
        if (a2 != 0) {
            return a2;
        }
        int a3 = C3334d.m24465a(this.f19357h, hVar.f19357h);
        return a3 == 0 ? C3334d.m24465a(this.f19358i, hVar.f19358i) : a3;
    }

    /* renamed from: t */
    public int mo12914t() {
        return this.f19355f;
    }

    public String toString() {
        int i;
        StringBuilder sb = new StringBuilder(18);
        byte b = this.f19355f;
        byte b2 = this.f19356g;
        byte b3 = this.f19357h;
        int i2 = this.f19358i;
        sb.append(b < 10 ? "0" : "");
        sb.append(b);
        String str = ":0";
        sb.append(b2 < 10 ? str : ":");
        sb.append(b2);
        if (b3 > 0 || i2 > 0) {
            if (b3 >= 10) {
                str = ":";
            }
            sb.append(str);
            sb.append(b3);
            if (i2 > 0) {
                sb.append('.');
                int i3 = 1000000;
                if (i2 % 1000000 == 0) {
                    i = (i2 / 1000000) + 1000;
                } else {
                    if (i2 % 1000 == 0) {
                        i2 /= 1000;
                    } else {
                        i3 = 1000000000;
                    }
                    i = i2 + i3;
                }
                sb.append(Integer.toString(i).substring(1));
            }
        }
        return sb.toString();
    }

    /* renamed from: u */
    public int mo12916u() {
        return this.f19356g;
    }

    /* renamed from: v */
    public int mo12917v() {
        return this.f19358i;
    }

    /* renamed from: w */
    public int mo12918w() {
        return this.f19357h;
    }

    /* renamed from: x */
    public C2755h mo12802f(long j, C3630l lVar) {
        return j == Long.MIN_VALUE ? mo12800e(Long.MAX_VALUE, lVar).mo12800e(1, lVar) : mo12800e(-j, lVar);
    }
}
