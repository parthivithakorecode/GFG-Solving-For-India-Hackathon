package p065i5;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p038f.C2591j;
import p058h5.C2742b;
import p058h5.C2743c;
import p058h5.C2755h;
import p080k5.C3334d;
import p087l5.C3603a;
import p087l5.C3615f;
import p087l5.C3619h;
import p087l5.C3620i;
import p087l5.C3630l;
import p087l5.C3631m;
import p087l5.C3632n;

/* renamed from: i5.k */
public final class C2874k extends C2856a<C2874k> {

    /* renamed from: A */
    private static final HashMap<Integer, Integer[]> f19567A = new HashMap<>();

    /* renamed from: B */
    private static final HashMap<Integer, Integer[]> f19568B = new HashMap<>();

    /* renamed from: C */
    private static final Long[] f19569C = new Long[334];

    /* renamed from: D */
    private static final Integer[] f19570D = new Integer[f19582s.length];

    /* renamed from: E */
    private static final Integer[] f19571E = new Integer[f19583t.length];

    /* renamed from: F */
    private static final Integer[] f19572F = new Integer[f19584u.length];

    /* renamed from: G */
    private static final Integer[] f19573G;

    /* renamed from: H */
    private static final Integer[] f19574H = new Integer[f19579p.length];

    /* renamed from: I */
    private static final Integer[] f19575I = new Integer[f19580q.length];

    /* renamed from: J */
    private static final Integer[] f19576J = new Integer[f19581r.length];

    /* renamed from: K */
    private static final Integer[] f19577K = new Integer[f19585v.length];

    /* renamed from: o */
    private static final int[] f19578o;

    /* renamed from: p */
    private static final int[] f19579p = {0, 30, 59, 89, C2591j.f18719E0, 148, 177, 207, 236, 266, 295, 325};

    /* renamed from: q */
    private static final int[] f19580q = {30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29};

    /* renamed from: r */
    private static final int[] f19581r = {30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 30};

    /* renamed from: s */
    private static final int[] f19582s = {0, 1, 0, 1, 0, 1, 1};

    /* renamed from: t */
    private static final int[] f19583t = {1, 9999, 11, 51, 5, 29, 354};

    /* renamed from: u */
    private static final int[] f19584u = {1, 9999, 11, 52, 6, 30, 355};

    /* renamed from: v */
    private static final int[] f19585v = {0, 354, 709, 1063, 1417, 1772, 2126, 2481, 2835, 3189, 3544, 3898, 4252, 4607, 4961, 5315, 5670, 6024, 6379, 6733, 7087, 7442, 7796, 8150, 8505, 8859, 9214, 9568, 9922, 10277};

    /* renamed from: w */
    private static final char f19586w;

    /* renamed from: x */
    private static final String f19587x = File.pathSeparator;

    /* renamed from: y */
    private static final String f19588y;

    /* renamed from: z */
    private static final HashMap<Integer, Integer[]> f19589z = new HashMap<>();

    /* renamed from: g */
    private final transient C2876l f19590g;

    /* renamed from: h */
    private final transient int f19591h;

    /* renamed from: i */
    private final transient int f19592i;

    /* renamed from: j */
    private final transient int f19593j;

    /* renamed from: k */
    private final transient int f19594k;

    /* renamed from: l */
    private final transient C2743c f19595l;

    /* renamed from: m */
    private final long f19596m;

    /* renamed from: n */
    private final transient boolean f19597n;

    /* renamed from: i5.k$a */
    static /* synthetic */ class C2875a {

        /* renamed from: a */
        static final /* synthetic */ int[] f19598a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                l5.a[] r0 = p087l5.C3603a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19598a = r0
                l5.a r1 = p087l5.C3603a.DAY_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19598a     // Catch:{ NoSuchFieldError -> 0x001d }
                l5.a r1 = p087l5.C3603a.DAY_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f19598a     // Catch:{ NoSuchFieldError -> 0x0028 }
                l5.a r1 = p087l5.C3603a.ALIGNED_WEEK_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f19598a     // Catch:{ NoSuchFieldError -> 0x0033 }
                l5.a r1 = p087l5.C3603a.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f19598a     // Catch:{ NoSuchFieldError -> 0x003e }
                l5.a r1 = p087l5.C3603a.DAY_OF_WEEK     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f19598a     // Catch:{ NoSuchFieldError -> 0x0049 }
                l5.a r1 = p087l5.C3603a.ALIGNED_DAY_OF_WEEK_IN_MONTH     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f19598a     // Catch:{ NoSuchFieldError -> 0x0054 }
                l5.a r1 = p087l5.C3603a.ALIGNED_DAY_OF_WEEK_IN_YEAR     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f19598a     // Catch:{ NoSuchFieldError -> 0x0060 }
                l5.a r1 = p087l5.C3603a.EPOCH_DAY     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f19598a     // Catch:{ NoSuchFieldError -> 0x006c }
                l5.a r1 = p087l5.C3603a.ALIGNED_WEEK_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f19598a     // Catch:{ NoSuchFieldError -> 0x0078 }
                l5.a r1 = p087l5.C3603a.MONTH_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f19598a     // Catch:{ NoSuchFieldError -> 0x0084 }
                l5.a r1 = p087l5.C3603a.YEAR     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f19598a     // Catch:{ NoSuchFieldError -> 0x0090 }
                l5.a r1 = p087l5.C3603a.ERA     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p065i5.C2874k.C2875a.<clinit>():void");
        }
    }

    static {
        int[] iArr = {0, 30, 59, 89, C2591j.f18719E0, 148, 177, 207, 236, 266, 295, 325};
        f19578o = iArr;
        char c = File.separatorChar;
        f19586w = c;
        f19588y = "org" + c + "threeten" + c + "bp" + c + "chrono";
        f19573G = new Integer[iArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr2 = f19578o;
            if (i2 >= iArr2.length) {
                break;
            }
            f19573G[i2] = Integer.valueOf(iArr2[i2]);
            i2++;
        }
        int i3 = 0;
        while (true) {
            int[] iArr3 = f19579p;
            if (i3 >= iArr3.length) {
                break;
            }
            f19574H[i3] = Integer.valueOf(iArr3[i3]);
            i3++;
        }
        int i4 = 0;
        while (true) {
            int[] iArr4 = f19580q;
            if (i4 >= iArr4.length) {
                break;
            }
            f19575I[i4] = Integer.valueOf(iArr4[i4]);
            i4++;
        }
        int i5 = 0;
        while (true) {
            int[] iArr5 = f19581r;
            if (i5 >= iArr5.length) {
                break;
            }
            f19576J[i5] = Integer.valueOf(iArr5[i5]);
            i5++;
        }
        int i6 = 0;
        while (true) {
            int[] iArr6 = f19585v;
            if (i6 >= iArr6.length) {
                break;
            }
            f19577K[i6] = Integer.valueOf(iArr6[i6]);
            i6++;
        }
        int i7 = 0;
        while (true) {
            Long[] lArr = f19569C;
            if (i7 >= lArr.length) {
                break;
            }
            lArr[i7] = Long.valueOf((long) (i7 * 10631));
            i7++;
        }
        int i8 = 0;
        while (true) {
            int[] iArr7 = f19582s;
            if (i8 >= iArr7.length) {
                break;
            }
            f19570D[i8] = Integer.valueOf(iArr7[i8]);
            i8++;
        }
        int i9 = 0;
        while (true) {
            int[] iArr8 = f19583t;
            if (i9 >= iArr8.length) {
                break;
            }
            f19571E[i9] = Integer.valueOf(iArr8[i9]);
            i9++;
        }
        while (true) {
            int[] iArr9 = f19584u;
            if (i < iArr9.length) {
                f19572F[i] = Integer.valueOf(iArr9[i]);
                i++;
            } else {
                try {
                    m22532p0();
                    return;
                } catch (IOException | ParseException unused) {
                    return;
                }
            }
        }
    }

    private C2874k(long j) {
        int[] U = m22519U(j);
        m22509I(U[1]);
        m22508H(U[2]);
        m22506F(U[3]);
        m22507G(U[4]);
        this.f19590g = C2876l.m22568i(U[0]);
        int i = U[1];
        this.f19591h = i;
        this.f19592i = U[2];
        this.f19593j = U[3];
        this.f19594k = U[4];
        this.f19595l = C2743c.m21774k(U[5]);
        this.f19596m = j;
        this.f19597n = m22527c0((long) i);
    }

    /* renamed from: E */
    private static void m22505E(int i, int i2, int i3, int i4, int i5) {
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        int i9 = i4;
        int i10 = i5;
        if (i6 < 1) {
            throw new IllegalArgumentException("startYear < 1");
        } else if (i8 < 1) {
            throw new IllegalArgumentException("endYear < 1");
        } else if (i7 < 0 || i7 > 11) {
            throw new IllegalArgumentException("startMonth < 0 || startMonth > 11");
        } else if (i9 < 0 || i9 > 11) {
            throw new IllegalArgumentException("endMonth < 0 || endMonth > 11");
        } else if (i8 > 9999) {
            throw new IllegalArgumentException("endYear > 9999");
        } else if (i8 < i6) {
            throw new IllegalArgumentException("startYear > endYear");
        } else if (i8 != i6 || i9 >= i7) {
            boolean c0 = m22527c0((long) i6);
            Integer[] numArr = f19589z.get(Integer.valueOf(i));
            if (numArr == null) {
                if (!c0) {
                    numArr = new Integer[f19578o.length];
                    int i11 = 0;
                    while (true) {
                        int[] iArr = f19578o;
                        if (i11 >= iArr.length) {
                            break;
                        }
                        numArr[i11] = Integer.valueOf(iArr[i11]);
                        i11++;
                    }
                } else {
                    numArr = new Integer[f19579p.length];
                    int i12 = 0;
                    while (true) {
                        int[] iArr2 = f19579p;
                        if (i12 >= iArr2.length) {
                            break;
                        }
                        numArr[i12] = Integer.valueOf(iArr2[i12]);
                        i12++;
                    }
                }
            }
            Integer[] numArr2 = new Integer[numArr.length];
            for (int i13 = 0; i13 < 12; i13++) {
                if (i13 > i7) {
                    numArr2[i13] = Integer.valueOf(numArr[i13].intValue() - i10);
                } else {
                    numArr2[i13] = Integer.valueOf(numArr[i13].intValue());
                }
            }
            f19589z.put(Integer.valueOf(i), numArr2);
            Integer[] numArr3 = f19567A.get(Integer.valueOf(i));
            if (numArr3 == null) {
                if (!c0) {
                    numArr3 = new Integer[f19580q.length];
                    int i14 = 0;
                    while (true) {
                        int[] iArr3 = f19580q;
                        if (i14 >= iArr3.length) {
                            break;
                        }
                        numArr3[i14] = Integer.valueOf(iArr3[i14]);
                        i14++;
                    }
                } else {
                    numArr3 = new Integer[f19581r.length];
                    int i15 = 0;
                    while (true) {
                        int[] iArr4 = f19581r;
                        if (i15 >= iArr4.length) {
                            break;
                        }
                        numArr3[i15] = Integer.valueOf(iArr4[i15]);
                        i15++;
                    }
                }
            }
            Integer[] numArr4 = new Integer[numArr3.length];
            for (int i16 = 0; i16 < 12; i16++) {
                if (i16 == i7) {
                    numArr4[i16] = Integer.valueOf(numArr3[i16].intValue() - i10);
                } else {
                    numArr4[i16] = Integer.valueOf(numArr3[i16].intValue());
                }
            }
            f19567A.put(Integer.valueOf(i), numArr4);
            if (i6 != i8) {
                int i17 = i6 - 1;
                int i18 = i17 / 30;
                int i19 = i17 % 30;
                Integer[] numArr5 = f19568B.get(Integer.valueOf(i18));
                if (numArr5 == null) {
                    int length = f19585v.length;
                    Integer[] numArr6 = new Integer[length];
                    for (int i20 = 0; i20 < length; i20++) {
                        numArr6[i20] = Integer.valueOf(f19585v[i20]);
                    }
                    numArr5 = numArr6;
                }
                for (int i21 = i19 + 1; i21 < f19585v.length; i21++) {
                    numArr5[i21] = Integer.valueOf(numArr5[i21].intValue() - i10);
                }
                f19568B.put(Integer.valueOf(i18), numArr5);
                int i22 = i8 - 1;
                int i23 = i22 / 30;
                if (i18 != i23) {
                    int i24 = i18 + 1;
                    while (true) {
                        Long[] lArr = f19569C;
                        if (i24 >= lArr.length) {
                            break;
                        }
                        lArr[i24] = Long.valueOf(lArr[i24].longValue() - ((long) i10));
                        i24++;
                    }
                    int i25 = i23 + 1;
                    while (true) {
                        Long[] lArr2 = f19569C;
                        if (i25 >= lArr2.length) {
                            break;
                        }
                        lArr2[i25] = Long.valueOf(lArr2[i25].longValue() + ((long) i10));
                        i25++;
                        i23 = i23;
                    }
                }
                int i26 = i23;
                int i27 = i22 % 30;
                Integer[] numArr7 = f19568B.get(Integer.valueOf(i26));
                if (numArr7 == null) {
                    int length2 = f19585v.length;
                    Integer[] numArr8 = new Integer[length2];
                    for (int i28 = 0; i28 < length2; i28++) {
                        numArr8[i28] = Integer.valueOf(f19585v[i28]);
                    }
                    numArr7 = numArr8;
                }
                for (int i29 = i27 + 1; i29 < f19585v.length; i29++) {
                    numArr7[i29] = Integer.valueOf(numArr7[i29].intValue() + i10);
                }
                f19568B.put(Integer.valueOf(i26), numArr7);
            }
            boolean c02 = m22527c0((long) i8);
            Integer[] numArr9 = f19589z.get(Integer.valueOf(i3));
            if (numArr9 == null) {
                if (!c02) {
                    numArr9 = new Integer[f19578o.length];
                    int i30 = 0;
                    while (true) {
                        int[] iArr5 = f19578o;
                        if (i30 >= iArr5.length) {
                            break;
                        }
                        numArr9[i30] = Integer.valueOf(iArr5[i30]);
                        i30++;
                    }
                } else {
                    numArr9 = new Integer[f19579p.length];
                    int i31 = 0;
                    while (true) {
                        int[] iArr6 = f19579p;
                        if (i31 >= iArr6.length) {
                            break;
                        }
                        numArr9[i31] = Integer.valueOf(iArr6[i31]);
                        i31++;
                    }
                }
            }
            Integer[] numArr10 = new Integer[numArr9.length];
            for (int i32 = 0; i32 < 12; i32++) {
                if (i32 > i9) {
                    numArr10[i32] = Integer.valueOf(numArr9[i32].intValue() + i10);
                } else {
                    numArr10[i32] = Integer.valueOf(numArr9[i32].intValue());
                }
            }
            f19589z.put(Integer.valueOf(i3), numArr10);
            Integer[] numArr11 = f19567A.get(Integer.valueOf(i3));
            if (numArr11 == null) {
                if (!c02) {
                    numArr11 = new Integer[f19580q.length];
                    int i33 = 0;
                    while (true) {
                        int[] iArr7 = f19580q;
                        if (i33 >= iArr7.length) {
                            break;
                        }
                        numArr11[i33] = Integer.valueOf(iArr7[i33]);
                        i33++;
                    }
                } else {
                    numArr11 = new Integer[f19581r.length];
                    int i34 = 0;
                    while (true) {
                        int[] iArr8 = f19581r;
                        if (i34 >= iArr8.length) {
                            break;
                        }
                        numArr11[i34] = Integer.valueOf(iArr8[i34]);
                        i34++;
                    }
                }
            }
            Integer[] numArr12 = new Integer[numArr11.length];
            for (int i35 = 0; i35 < 12; i35++) {
                if (i35 == i9) {
                    numArr12[i35] = Integer.valueOf(numArr11[i35].intValue() + i10);
                } else {
                    numArr12[i35] = Integer.valueOf(numArr11[i35].intValue());
                }
            }
            HashMap<Integer, Integer[]> hashMap = f19567A;
            hashMap.put(Integer.valueOf(i3), numArr12);
            Integer[] numArr13 = hashMap.get(Integer.valueOf(i));
            Integer[] numArr14 = hashMap.get(Integer.valueOf(i3));
            HashMap<Integer, Integer[]> hashMap2 = f19589z;
            int intValue = numArr13[i7].intValue();
            int intValue2 = numArr14[i9].intValue();
            int intValue3 = hashMap2.get(Integer.valueOf(i))[11].intValue() + numArr13[11].intValue();
            int intValue4 = hashMap2.get(Integer.valueOf(i3))[11].intValue() + numArr14[11].intValue();
            Integer[] numArr15 = f19572F;
            int intValue5 = numArr15[5].intValue();
            Integer[] numArr16 = f19571E;
            int intValue6 = numArr16[5].intValue();
            if (intValue5 < intValue) {
                intValue5 = intValue;
            }
            if (intValue5 < intValue2) {
                intValue5 = intValue2;
            }
            numArr15[5] = Integer.valueOf(intValue5);
            if (intValue6 <= intValue) {
                intValue = intValue6;
            }
            if (intValue <= intValue2) {
                intValue2 = intValue;
            }
            numArr16[5] = Integer.valueOf(intValue2);
            int intValue7 = numArr15[6].intValue();
            int intValue8 = numArr16[6].intValue();
            if (intValue7 < intValue3) {
                intValue7 = intValue3;
            }
            if (intValue7 < intValue4) {
                intValue7 = intValue4;
            }
            numArr15[6] = Integer.valueOf(intValue7);
            if (intValue8 <= intValue3) {
                intValue3 = intValue8;
            }
            if (intValue3 <= intValue4) {
                intValue4 = intValue3;
            }
            numArr16[6] = Integer.valueOf(intValue4);
        } else {
            throw new IllegalArgumentException("startYear == endYear && endMonth < startMonth");
        }
    }

    /* renamed from: F */
    private static void m22506F(int i) {
        if (i < 1 || i > m22520V()) {
            throw new C2742b("Invalid day of month of Hijrah date, day " + i + " greater than " + m22520V() + " or less than 1");
        }
    }

    /* renamed from: G */
    private static void m22507G(int i) {
        if (i < 1 || i > m22521W()) {
            throw new C2742b("Invalid day of year of Hijrah date");
        }
    }

    /* renamed from: H */
    private static void m22508H(int i) {
        if (i < 1 || i > 12) {
            throw new C2742b("Invalid month of Hijrah date");
        }
    }

    /* renamed from: I */
    private static void m22509I(int i) {
        if (i < 1 || i > 9999) {
            throw new C2742b("Invalid year of Hijrah Era");
        }
    }

    /* renamed from: J */
    private static Integer[] m22510J(int i) {
        Integer[] numArr;
        try {
            numArr = f19568B.get(Integer.valueOf(i));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        return numArr == null ? f19577K : numArr;
    }

    /* renamed from: K */
    private static Integer[] m22511K(int i) {
        Integer[] numArr;
        try {
            numArr = f19589z.get(Integer.valueOf(i));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        return numArr == null ? m22527c0((long) i) ? f19574H : f19573G : numArr;
    }

    /* renamed from: L */
    private static Integer[] m22512L(int i) {
        Integer[] numArr;
        try {
            numArr = f19567A.get(Integer.valueOf(i));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        return numArr == null ? m22527c0((long) i) ? f19576J : f19575I : numArr;
    }

    /* renamed from: N */
    private static InputStream m22513N() {
        ZipFile zipFile;
        String property = System.getProperty("org.threeten.bp.i18n.HijrahDate.deviationConfigFile");
        if (property == null) {
            property = "hijrah_deviation.cfg";
        }
        String property2 = System.getProperty("org.threeten.bp.i18n.HijrahDate.deviationConfigDir");
        if (property2 != null) {
            if (property2.length() != 0 || !property2.endsWith(System.getProperty("file.separator"))) {
                property2 = property2 + System.getProperty("file.separator");
            }
            File file = new File(property2 + f19586w + property);
            if (!file.exists()) {
                return null;
            }
            try {
                return new FileInputStream(file);
            } catch (IOException e) {
                throw e;
            }
        } else {
            StringTokenizer stringTokenizer = new StringTokenizer(System.getProperty("java.class.path"), f19587x);
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                File file2 = new File(nextToken);
                if (file2.exists()) {
                    if (file2.isDirectory()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(nextToken);
                        char c = f19586w;
                        sb.append(c);
                        String str = f19588y;
                        sb.append(str);
                        if (new File(sb.toString(), property).exists()) {
                            try {
                                return new FileInputStream(nextToken + c + str + c + property);
                            } catch (IOException e2) {
                                throw e2;
                            }
                        }
                    } else {
                        try {
                            zipFile = new ZipFile(file2);
                        } catch (IOException unused) {
                            zipFile = null;
                        }
                        if (zipFile != null) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(f19588y);
                            char c2 = f19586w;
                            sb2.append(c2);
                            sb2.append(property);
                            String sb3 = sb2.toString();
                            ZipEntry entry = zipFile.getEntry(sb3);
                            if (entry == null) {
                                if (c2 == '/') {
                                    sb3 = sb3.replace('/', '\\');
                                } else if (c2 == '\\') {
                                    sb3 = sb3.replace('\\', '/');
                                }
                                entry = zipFile.getEntry(sb3);
                            }
                            if (entry != null) {
                                try {
                                    return zipFile.getInputStream(entry);
                                } catch (IOException e3) {
                                    throw e3;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: O */
    private static int m22514O(long j) {
        Long[] lArr = f19569C;
        int i = 0;
        while (i < lArr.length) {
            try {
                if (j < lArr[i].longValue()) {
                    return i - 1;
                }
                i++;
            } catch (ArrayIndexOutOfBoundsException unused) {
                return ((int) j) / 10631;
            }
        }
        return ((int) j) / 10631;
    }

    /* renamed from: P */
    private static int m22515P(long j, int i) {
        Long l;
        try {
            l = f19569C[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            l = null;
        }
        if (l == null) {
            l = Long.valueOf((long) (i * 10631));
        }
        return (int) (j - l.longValue());
    }

    /* renamed from: Q */
    private static int m22516Q(int i, int i2, int i3) {
        Integer num;
        Integer[] K = m22511K(i3);
        if (i < 0) {
            i = m22527c0((long) i3) ? i + 355 : i + 354;
            if (i2 <= 0) {
                return i;
            }
            num = K[i2];
        } else if (i2 <= 0) {
            return i;
        } else {
            num = K[i2];
        }
        return i - num.intValue();
    }

    /* renamed from: R */
    private static int m22517R(int i, int i2, int i3) {
        Integer[] J = m22510J(i);
        return i2 > 0 ? i2 - J[i3].intValue() : J[i3].intValue() + i2;
    }

    /* renamed from: T */
    private static long m22518T(int i, int i2, int i3) {
        return m22535v0(i) + ((long) m22522X(i2 - 1, i)) + ((long) i3);
    }

    /* renamed from: U */
    private static int[] m22519U(long j) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j2 = j - -492148;
        if (j2 >= 0) {
            int O = m22514O(j2);
            int P = m22515P(j2, O);
            int a0 = m22525a0(O, (long) P);
            i4 = m22517R(O, P, a0);
            i5 = (O * 30) + a0 + 1;
            i3 = m22524Z(i4, i5);
            i2 = m22516Q(i4, i3, i5) + 1;
            i = C2876l.AH.getValue();
        } else {
            int i6 = (int) j2;
            int i7 = i6 / 10631;
            int i8 = i6 % 10631;
            if (i8 == 0) {
                i8 = -10631;
                i7++;
            }
            int a02 = m22525a0(i7, (long) i8);
            int R = m22517R(i7, i8, a02);
            int i9 = 1 - ((i7 * 30) - a02);
            int i10 = m22527c0((long) i9) ? R + 355 : R + 354;
            i3 = m22524Z(i10, i9);
            i2 = m22516Q(i10, i3, i9) + 1;
            i = C2876l.BEFORE_AH.getValue();
            int i11 = i9;
            i4 = i10;
            i5 = i11;
        }
        int i12 = (int) ((j2 + 5) % 7);
        return new int[]{i, i5, i3 + 1, i2, i4 + 1, i12 + (i12 <= 0 ? 7 : 0)};
    }

    /* renamed from: V */
    static int m22520V() {
        return f19572F[5].intValue();
    }

    /* renamed from: W */
    static int m22521W() {
        return f19572F[6].intValue();
    }

    /* renamed from: X */
    private static int m22522X(int i, int i2) {
        return m22511K(i2)[i].intValue();
    }

    /* renamed from: Y */
    static int m22523Y(int i, int i2) {
        return m22512L(i2)[i].intValue();
    }

    /* renamed from: Z */
    private static int m22524Z(int i, int i2) {
        Integer[] K = m22511K(i2);
        int i3 = 0;
        if (i >= 0) {
            while (i3 < K.length) {
                if (i < K[i3].intValue()) {
                    return i3 - 1;
                }
                i3++;
            }
            return 11;
        }
        int i4 = m22527c0((long) i2) ? i + 355 : i + 354;
        while (i3 < K.length) {
            if (i4 < K[i3].intValue()) {
                return i3 - 1;
            }
            i3++;
        }
        return 11;
    }

    /* renamed from: a0 */
    private static int m22525a0(int i, long j) {
        Integer[] J = m22510J(i);
        int i2 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (i2 > 0) {
            while (i3 < J.length) {
                if (j < ((long) J[i3].intValue())) {
                    return i3 - 1;
                }
                i3++;
            }
            return 29;
        }
        long j2 = -j;
        while (i3 < J.length) {
            if (j2 <= ((long) J[i3].intValue())) {
                return i3 - 1;
            }
            i3++;
        }
        return 29;
    }

    /* renamed from: b0 */
    static int m22526b0(int i) {
        Integer[] numArr;
        int i2 = i - 1;
        int i3 = i2 / 30;
        try {
            numArr = f19568B.get(Integer.valueOf(i3));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        if (numArr == null) {
            return m22527c0((long) i) ? 355 : 354;
        }
        int i4 = i2 % 30;
        if (i4 != 29) {
            return numArr[i4 + 1].intValue() - numArr[i4].intValue();
        }
        Long[] lArr = f19569C;
        return (lArr[i3 + 1].intValue() - lArr[i3].intValue()) - numArr[i4].intValue();
    }

    /* renamed from: c0 */
    static boolean m22527c0(long j) {
        if (j <= 0) {
            j = -j;
        }
        return ((j * 11) + 14) % 30 < 11;
    }

    /* renamed from: g0 */
    public static C2874k m22528g0(int i, int i2, int i3) {
        return i >= 1 ? m22529h0(C2876l.AH, i, i2, i3) : m22529h0(C2876l.BEFORE_AH, 1 - i, i2, i3);
    }

    /* renamed from: h0 */
    static C2874k m22529h0(C2876l lVar, int i, int i2, int i3) {
        C3334d.m24473i(lVar, "era");
        m22509I(i);
        m22508H(i2);
        m22506F(i3);
        return new C2874k(m22518T(lVar.mo13161k(i), i2, i3));
    }

    /* renamed from: i0 */
    static C2874k m22530i0(long j) {
        return new C2874k(j);
    }

    /* renamed from: j0 */
    private static void m22531j0(String str, int i) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf(58);
            if (indexOf != -1) {
                try {
                    int parseInt = Integer.parseInt(nextToken.substring(indexOf + 1, nextToken.length()));
                    int indexOf2 = nextToken.indexOf(45);
                    if (indexOf2 != -1) {
                        String substring = nextToken.substring(0, indexOf2);
                        String substring2 = nextToken.substring(indexOf2 + 1, indexOf);
                        int indexOf3 = substring.indexOf(47);
                        int indexOf4 = substring2.indexOf(47);
                        if (indexOf3 != -1) {
                            String substring3 = substring.substring(0, indexOf3);
                            String substring4 = substring.substring(indexOf3 + 1, substring.length());
                            try {
                                int parseInt2 = Integer.parseInt(substring3);
                                try {
                                    int parseInt3 = Integer.parseInt(substring4);
                                    if (indexOf4 != -1) {
                                        String substring5 = substring2.substring(0, indexOf4);
                                        String substring6 = substring2.substring(indexOf4 + 1, substring2.length());
                                        try {
                                            int parseInt4 = Integer.parseInt(substring5);
                                            try {
                                                int parseInt5 = Integer.parseInt(substring6);
                                                if (parseInt2 == -1 || parseInt3 == -1 || parseInt4 == -1 || parseInt5 == -1) {
                                                    throw new ParseException("Unknown error at line " + i + ".", i);
                                                }
                                                m22505E(parseInt2, parseInt3, parseInt4, parseInt5, parseInt);
                                            } catch (NumberFormatException unused) {
                                                throw new ParseException("End month is not properly set at line " + i + ".", i);
                                            }
                                        } catch (NumberFormatException unused2) {
                                            throw new ParseException("End year is not properly set at line " + i + ".", i);
                                        }
                                    } else {
                                        throw new ParseException("End year/month has incorrect format at line " + i + ".", i);
                                    }
                                } catch (NumberFormatException unused3) {
                                    throw new ParseException("Start month is not properly set at line " + i + ".", i);
                                }
                            } catch (NumberFormatException unused4) {
                                throw new ParseException("Start year is not properly set at line " + i + ".", i);
                            }
                        } else {
                            throw new ParseException("Start year/month has incorrect format at line " + i + ".", i);
                        }
                    } else {
                        throw new ParseException("Start and end year/month has incorrect format at line " + i + ".", i);
                    }
                } catch (NumberFormatException unused5) {
                    throw new ParseException("Offset is not properly set at line " + i + ".", i);
                }
            } else {
                throw new ParseException("Offset has incorrect format at line " + i + ".", i);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c  */
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m22532p0() {
        /*
            java.io.InputStream r0 = m22513N()
            if (r0 == 0) goto L_0x0030
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0029 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x0029 }
            r3.<init>(r0)     // Catch:{ all -> 0x0029 }
            r2.<init>(r3)     // Catch:{ all -> 0x0029 }
            r0 = 0
        L_0x0012:
            java.lang.String r1 = r2.readLine()     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0022
            int r0 = r0 + 1
            java.lang.String r1 = r1.trim()     // Catch:{ all -> 0x0026 }
            m22531j0(r1, r0)     // Catch:{ all -> 0x0026 }
            goto L_0x0012
        L_0x0022:
            r2.close()
            goto L_0x0030
        L_0x0026:
            r0 = move-exception
            r1 = r2
            goto L_0x002a
        L_0x0029:
            r0 = move-exception
        L_0x002a:
            if (r1 == 0) goto L_0x002f
            r1.close()
        L_0x002f:
            throw r0
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p065i5.C2874k.m22532p0():void");
    }

    /* renamed from: q0 */
    static C2858b m22533q0(DataInput dataInput) {
        return C2873j.f19563j.mo13144t(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    /* renamed from: r0 */
    private static C2874k m22534r0(int i, int i2, int i3) {
        int X = m22522X(i2 - 1, i);
        if (i3 > X) {
            i3 = X;
        }
        return m22528g0(i, i2, i3);
    }

    private Object readResolve() {
        return new C2874k(this.f19596m);
    }

    /* renamed from: v0 */
    private static long m22535v0(int i) {
        Long l;
        int i2 = i - 1;
        int i3 = i2 / 30;
        int i4 = i2 % 30;
        int intValue = m22510J(i3)[Math.abs(i4)].intValue();
        if (i4 < 0) {
            intValue = -intValue;
        }
        try {
            l = f19569C[i3];
        } catch (ArrayIndexOutOfBoundsException unused) {
            l = null;
        }
        if (l == null) {
            l = Long.valueOf((long) (i3 * 10631));
        }
        return ((l.longValue() + ((long) intValue)) - 492148) - 1;
    }

    private Object writeReplace() {
        return new C2889u((byte) 3, this);
    }

    /* renamed from: M */
    public C2873j mo12847r() {
        return C2873j.f19563j;
    }

    /* renamed from: S */
    public C2876l mo12848s() {
        return this.f19590g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        r4 = (r4 - 1) / 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        r4 = (r4 - 1) % 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        return (long) r4;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo12777d(p087l5.C3620i r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof p087l5.C3603a
            if (r0 == 0) goto L_0x005f
            int[] r0 = p065i5.C2874k.C2875a.f19598a
            r1 = r4
            l5.a r1 = (p087l5.C3603a) r1
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L_0x005c;
                case 2: goto L_0x0059;
                case 3: goto L_0x0056;
                case 4: goto L_0x0031;
                case 5: goto L_0x004f;
                case 6: goto L_0x004c;
                case 7: goto L_0x0045;
                case 8: goto L_0x0040;
                case 9: goto L_0x0037;
                case 10: goto L_0x0034;
                case 11: goto L_0x0031;
                case 12: goto L_0x0029;
                default: goto L_0x0012;
            }
        L_0x0012:
            l5.m r0 = new l5.m
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported field: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L_0x0029:
            i5.l r4 = r3.f19590g
            int r4 = r4.getValue()
        L_0x002f:
            long r0 = (long) r4
            return r0
        L_0x0031:
            int r4 = r3.f19591h
            goto L_0x002f
        L_0x0034:
            int r4 = r3.f19592i
            goto L_0x002f
        L_0x0037:
            int r4 = r3.f19594k
        L_0x0039:
            int r4 = r4 + -1
            int r4 = r4 / 7
        L_0x003d:
            int r4 = r4 + 1
            goto L_0x002f
        L_0x0040:
            long r0 = r3.mo12854x()
            return r0
        L_0x0045:
            int r4 = r3.f19594k
        L_0x0047:
            int r4 = r4 + -1
            int r4 = r4 % 7
            goto L_0x003d
        L_0x004c:
            int r4 = r3.f19593j
            goto L_0x0047
        L_0x004f:
            h5.c r4 = r3.f19595l
            int r4 = r4.getValue()
            goto L_0x002f
        L_0x0056:
            int r4 = r3.f19593j
            goto L_0x0039
        L_0x0059:
            int r4 = r3.f19594k
            goto L_0x002f
        L_0x005c:
            int r4 = r3.f19593j
            goto L_0x002f
        L_0x005f:
            long r0 = r4.mo14736j(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p065i5.C2874k.mo12777d(l5.i):long");
    }

    /* renamed from: d0 */
    public int mo13150d0() {
        return m22523Y(this.f19592i - 1, this.f19591h);
    }

    /* renamed from: e0 */
    public int mo13151e0() {
        return m22526b0(this.f19591h);
    }

    /* renamed from: f0 */
    public C2874k mo12851u(long j, C3630l lVar) {
        return (C2874k) super.mo12802f(j, lVar);
    }

    /* renamed from: k0 */
    public C2874k mo12852v(long j, C3630l lVar) {
        return (C2874k) super.mo12852v(j, lVar);
    }

    /* renamed from: l0 */
    public C2874k mo12853w(C3619h hVar) {
        return (C2874k) super.mo12853w(hVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public C2874k mo13103B(long j) {
        return new C2874k(this.f19596m + j);
    }

    /* renamed from: n */
    public C3632n mo12782n(C3620i iVar) {
        if (!(iVar instanceof C3603a)) {
            return iVar.mo14730d(this);
        }
        if (mo12781j(iVar)) {
            C3603a aVar = (C3603a) iVar;
            int i = C2875a.f19598a[aVar.ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? mo12847r().mo13147w(aVar) : C3632n.m25183i(1, 1000) : C3632n.m25183i(1, 5) : C3632n.m25183i(1, (long) mo13151e0()) : C3632n.m25183i(1, (long) mo13150d0());
        }
        throw new C3631m("Unsupported field: " + iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public C2874k mo13104C(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.f19592i - 1) + ((int) j);
        int i2 = i / 12;
        int i3 = i % 12;
        while (i3 < 0) {
            i3 += 12;
            i2 = C3334d.m24478n(i2, 1);
        }
        return m22529h0(this.f19590g, C3334d.m24474j(this.f19591h, i2), i3 + 1, this.f19593j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public C2874k mo13105D(long j) {
        if (j == 0) {
            return this;
        }
        return m22529h0(this.f19590g, C3334d.m24474j(this.f19591h, (int) j), this.f19592i, this.f19593j);
    }

    /* renamed from: p */
    public final C2860c<C2874k> mo12845p(C2755h hVar) {
        return super.mo12845p(hVar);
    }

    /* renamed from: s0 */
    public C2874k mo12855y(C3615f fVar) {
        return (C2874k) super.mo12805m(fVar);
    }

    /* renamed from: t0 */
    public C2874k mo12856z(C3620i iVar, long j) {
        if (!(iVar instanceof C3603a)) {
            return (C2874k) iVar.mo14735i(this, j);
        }
        C3603a aVar = (C3603a) iVar;
        aVar.mo14738l(j);
        int i = (int) j;
        switch (C2875a.f19598a[aVar.ordinal()]) {
            case 1:
                return m22534r0(this.f19591h, this.f19592i, i);
            case 2:
                int i2 = i - 1;
                return m22534r0(this.f19591h, (i2 / 30) + 1, (i2 % 30) + 1);
            case 3:
                return mo13103B((j - mo12777d(C3603a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                if (this.f19591h < 1) {
                    i = 1 - i;
                }
                return m22534r0(i, this.f19592i, this.f19593j);
            case 5:
                return mo13103B(j - ((long) this.f19595l.getValue()));
            case 6:
                return mo13103B(j - mo12777d(C3603a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return mo13103B(j - mo12777d(C3603a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return new C2874k((long) i);
            case 9:
                return mo13103B((j - mo12777d(C3603a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 10:
                return m22534r0(this.f19591h, i, this.f19593j);
            case 11:
                return m22534r0(i, this.f19592i, this.f19593j);
            case 12:
                return m22534r0(1 - this.f19591h, this.f19592i, this.f19593j);
            default:
                throw new C3631m("Unsupported field: " + iVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public void mo13160u0(DataOutput dataOutput) {
        dataOutput.writeInt(mo12778g(C3603a.YEAR));
        dataOutput.writeByte(mo12778g(C3603a.MONTH_OF_YEAR));
        dataOutput.writeByte(mo12778g(C3603a.DAY_OF_MONTH));
    }

    /* renamed from: x */
    public long mo12854x() {
        return m22518T(this.f19591h, this.f19592i, this.f19593j);
    }
}
