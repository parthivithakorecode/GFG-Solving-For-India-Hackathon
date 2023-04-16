package p073j5;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p058h5.C2742b;
import p058h5.C2752g;
import p058h5.C2778q;
import p058h5.C2780r;
import p065i5.C2870h;
import p073j5.C3281k;
import p080k5.C3334d;
import p087l5.C3603a;
import p087l5.C3605c;
import p087l5.C3614e;
import p087l5.C3620i;
import p087l5.C3621j;
import p087l5.C3629k;
import p087l5.C3632n;
import p094m5.C3738i;

/* renamed from: j5.c */
public final class C3253c {

    /* renamed from: h */
    private static final C3629k<C2778q> f20658h = new C3254a();

    /* renamed from: i */
    private static final Map<Character, C3620i> f20659i;

    /* renamed from: j */
    static final Comparator<String> f20660j = new C3256c();

    /* renamed from: a */
    private C3253c f20661a;

    /* renamed from: b */
    private final C3253c f20662b;

    /* renamed from: c */
    private final List<C3260g> f20663c;

    /* renamed from: d */
    private final boolean f20664d;

    /* renamed from: e */
    private int f20665e;

    /* renamed from: f */
    private char f20666f;

    /* renamed from: g */
    private int f20667g;

    /* renamed from: j5.c$a */
    class C3254a implements C3629k<C2778q> {
        C3254a() {
        }

        /* renamed from: b */
        public C2778q mo12783a(C3614e eVar) {
            C2778q qVar = (C2778q) eVar.mo12776b(C3621j.m25165g());
            if (qVar == null || (qVar instanceof C2780r)) {
                return null;
            }
            return qVar;
        }
    }

    /* renamed from: j5.c$b */
    class C3255b extends C3277g {

        /* renamed from: b */
        final /* synthetic */ C3281k.C3283b f20668b;

        C3255b(C3281k.C3283b bVar) {
            this.f20668b = bVar;
        }

        /* renamed from: a */
        public String mo14204a(C3620i iVar, long j, C3284l lVar, Locale locale) {
            return this.f20668b.mo14268a(j, lVar);
        }

        /* renamed from: b */
        public Iterator<Map.Entry<String, Long>> mo14205b(C3620i iVar, C3284l lVar, Locale locale) {
            return this.f20668b.mo14269b(lVar);
        }
    }

    /* renamed from: j5.c$c */
    class C3256c implements Comparator<String> {
        C3256c() {
        }

        /* renamed from: a */
        public int compare(String str, String str2) {
            return str.length() == str2.length() ? str.compareTo(str2) : str.length() - str2.length();
        }
    }

    /* renamed from: j5.c$d */
    static /* synthetic */ class C3257d {

        /* renamed from: a */
        static final /* synthetic */ int[] f20670a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                j5.j[] r0 = p073j5.C3280j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20670a = r0
                j5.j r1 = p073j5.C3280j.EXCEEDS_PAD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20670a     // Catch:{ NoSuchFieldError -> 0x001d }
                j5.j r1 = p073j5.C3280j.ALWAYS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f20670a     // Catch:{ NoSuchFieldError -> 0x0028 }
                j5.j r1 = p073j5.C3280j.NORMAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f20670a     // Catch:{ NoSuchFieldError -> 0x0033 }
                j5.j r1 = p073j5.C3280j.NOT_NEGATIVE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p073j5.C3253c.C3257d.<clinit>():void");
        }
    }

    /* renamed from: j5.c$e */
    static final class C3258e implements C3260g {

        /* renamed from: f */
        private final char f20671f;

        C3258e(char c) {
            this.f20671f = c;
        }

        /* renamed from: b */
        public int mo14208b(C3271d dVar, CharSequence charSequence, int i) {
            if (i == charSequence.length()) {
                return ~i;
            }
            return !dVar.mo14227b(this.f20671f, charSequence.charAt(i)) ? ~i : i + 1;
        }

        /* renamed from: d */
        public boolean mo14209d(C3275f fVar, StringBuilder sb) {
            sb.append(this.f20671f);
            return true;
        }

        public String toString() {
            if (this.f20671f == '\'') {
                return "''";
            }
            return "'" + this.f20671f + "'";
        }
    }

    /* renamed from: j5.c$f */
    static final class C3259f implements C3260g {

        /* renamed from: f */
        private final C3260g[] f20672f;

        /* renamed from: g */
        private final boolean f20673g;

        C3259f(List<C3260g> list, boolean z) {
            this((C3260g[]) list.toArray(new C3260g[list.size()]), z);
        }

        C3259f(C3260g[] gVarArr, boolean z) {
            this.f20672f = gVarArr;
            this.f20673g = z;
        }

        /* renamed from: a */
        public C3259f mo14211a(boolean z) {
            return z == this.f20673g ? this : new C3259f(this.f20672f, z);
        }

        /* renamed from: b */
        public int mo14208b(C3271d dVar, CharSequence charSequence, int i) {
            if (this.f20673g) {
                dVar.mo14241r();
                int i2 = i;
                for (C3260g b : this.f20672f) {
                    i2 = b.mo14208b(dVar, charSequence, i2);
                    if (i2 < 0) {
                        dVar.mo14229f(false);
                        return i;
                    }
                }
                dVar.mo14229f(true);
                return i2;
            }
            for (C3260g b2 : this.f20672f) {
                i = b2.mo14208b(dVar, charSequence, i);
                if (i < 0) {
                    break;
                }
            }
            return i;
        }

        /* renamed from: d */
        public boolean mo14209d(C3275f fVar, StringBuilder sb) {
            int length = sb.length();
            if (this.f20673g) {
                fVar.mo14254h();
            }
            try {
                for (C3260g d : this.f20672f) {
                    if (!d.mo14209d(fVar, sb)) {
                        sb.setLength(length);
                        return true;
                    }
                }
                if (this.f20673g) {
                    fVar.mo14248b();
                }
                return true;
            } finally {
                if (this.f20673g) {
                    fVar.mo14248b();
                }
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.f20672f != null) {
                sb.append(this.f20673g ? "[" : "(");
                for (C3260g append : this.f20672f) {
                    sb.append(append);
                }
                sb.append(this.f20673g ? "]" : ")");
            }
            return sb.toString();
        }
    }

    /* renamed from: j5.c$g */
    interface C3260g {
        /* renamed from: b */
        int mo14208b(C3271d dVar, CharSequence charSequence, int i);

        /* renamed from: d */
        boolean mo14209d(C3275f fVar, StringBuilder sb);
    }

    /* renamed from: j5.c$h */
    static final class C3261h implements C3260g {

        /* renamed from: f */
        private final C3620i f20674f;

        /* renamed from: g */
        private final int f20675g;

        /* renamed from: h */
        private final int f20676h;

        /* renamed from: i */
        private final boolean f20677i;

        C3261h(C3620i iVar, int i, int i2, boolean z) {
            C3334d.m24473i(iVar, "field");
            if (!iVar.mo14734h().mo14759e()) {
                throw new IllegalArgumentException("Field must have a fixed set of values: " + iVar);
            } else if (i < 0 || i > 9) {
                throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i);
            } else if (i2 < 1 || i2 > 9) {
                throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i2);
            } else if (i2 >= i) {
                this.f20674f = iVar;
                this.f20675g = i;
                this.f20676h = i2;
                this.f20677i = z;
            } else {
                throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
            }
        }

        /* renamed from: a */
        private long m24251a(BigDecimal bigDecimal) {
            C3632n h = this.f20674f.mo14734h();
            BigDecimal valueOf = BigDecimal.valueOf(h.mo14758d());
            return bigDecimal.multiply(BigDecimal.valueOf(h.mo14757c()).subtract(valueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(valueOf).longValueExact();
        }

        /* renamed from: c */
        private BigDecimal m24252c(long j) {
            C3632n h = this.f20674f.mo14734h();
            h.mo14756b(j, this.f20674f);
            BigDecimal valueOf = BigDecimal.valueOf(h.mo14758d());
            BigDecimal divide = BigDecimal.valueOf(j).subtract(valueOf).divide(BigDecimal.valueOf(h.mo14757c()).subtract(valueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
            return divide.compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : divide.stripTrailingZeros();
        }

        /* renamed from: b */
        public int mo14208b(C3271d dVar, CharSequence charSequence, int i) {
            int i2;
            int i3 = 0;
            int i4 = dVar.mo14235l() ? this.f20675g : 0;
            int i5 = dVar.mo14235l() ? this.f20676h : 9;
            int length = charSequence.length();
            if (i == length) {
                return i4 > 0 ? ~i : i;
            }
            if (this.f20677i) {
                if (charSequence.charAt(i) != dVar.mo14233j().mo14258c()) {
                    return i4 > 0 ? ~i : i;
                }
                i++;
            }
            int i6 = i;
            int i7 = i4 + i6;
            if (i7 > length) {
                return ~i6;
            }
            int min = Math.min(i5 + i6, length);
            int i8 = i6;
            while (true) {
                if (i8 >= min) {
                    i2 = i8;
                    break;
                }
                int i9 = i8 + 1;
                int b = dVar.mo14233j().mo14257b(charSequence.charAt(i8));
                if (b >= 0) {
                    i3 = (i3 * 10) + b;
                    i8 = i9;
                } else if (i9 < i7) {
                    return ~i6;
                } else {
                    i2 = i9 - 1;
                }
            }
            return dVar.mo14238o(this.f20674f, m24251a(new BigDecimal(i3).movePointLeft(i2 - i6)), i6, i2);
        }

        /* renamed from: d */
        public boolean mo14209d(C3275f fVar, StringBuilder sb) {
            Long f = fVar.mo14252f(this.f20674f);
            if (f == null) {
                return false;
            }
            C3278h d = fVar.mo14250d();
            BigDecimal c = m24252c(f.longValue());
            if (c.scale() != 0) {
                String a = d.mo14256a(c.setScale(Math.min(Math.max(c.scale(), this.f20675g), this.f20676h), RoundingMode.FLOOR).toPlainString().substring(2));
                if (this.f20677i) {
                    sb.append(d.mo14258c());
                }
                sb.append(a);
                return true;
            } else if (this.f20675g <= 0) {
                return true;
            } else {
                if (this.f20677i) {
                    sb.append(d.mo14258c());
                }
                for (int i = 0; i < this.f20675g; i++) {
                    sb.append(d.mo14262f());
                }
                return true;
            }
        }

        public String toString() {
            String str = this.f20677i ? ",DecimalPoint" : "";
            return "Fraction(" + this.f20674f + "," + this.f20675g + "," + this.f20676h + str + ")";
        }
    }

    /* renamed from: j5.c$i */
    static final class C3262i implements C3260g {

        /* renamed from: f */
        private final int f20678f;

        C3262i(int i) {
            this.f20678f = i;
        }

        /* renamed from: b */
        public int mo14208b(C3271d dVar, CharSequence charSequence, int i) {
            int i2;
            int i3;
            int i4;
            int i5 = i;
            C3271d d = dVar.mo14228d();
            int i6 = this.f20678f;
            int i7 = i6 < 0 ? 0 : i6;
            if (i6 < 0) {
                i6 = 9;
            }
            C3253c e = new C3253c().mo14184a(C3250b.f20634h).mo14187e('T');
            C3603a aVar = C3603a.HOUR_OF_DAY;
            C3253c e2 = e.mo14192k(aVar, 2).mo14187e(':');
            C3603a aVar2 = C3603a.MINUTE_OF_HOUR;
            C3253c e3 = e2.mo14192k(aVar2, 2).mo14187e(':');
            C3603a aVar3 = C3603a.SECOND_OF_MINUTE;
            C3253c k = e3.mo14192k(aVar3, 2);
            C3603a aVar4 = C3603a.NANO_OF_SECOND;
            int b = k.mo14185b(aVar4, i7, i6, true).mo14187e('Z').mo14200s().mo14178k(false).mo14208b(d, charSequence, i5);
            if (b < 0) {
                return b;
            }
            long longValue = d.mo14232i(C3603a.YEAR).longValue();
            int intValue = d.mo14232i(C3603a.MONTH_OF_YEAR).intValue();
            int intValue2 = d.mo14232i(C3603a.DAY_OF_MONTH).intValue();
            int intValue3 = d.mo14232i(aVar).intValue();
            int intValue4 = d.mo14232i(aVar2).intValue();
            Long i8 = d.mo14232i(aVar3);
            Long i9 = d.mo14232i(aVar4);
            int intValue5 = i8 != null ? i8.intValue() : 0;
            int intValue6 = i9 != null ? i9.intValue() : 0;
            int i10 = ((int) longValue) % 10000;
            if (intValue3 == 24 && intValue4 == 0 && intValue5 == 0 && intValue6 == 0) {
                i2 = intValue5;
                i4 = 1;
                i3 = 0;
            } else {
                if (intValue3 == 23 && intValue4 == 59 && intValue5 == 60) {
                    dVar.mo14239p();
                    i3 = intValue3;
                    i2 = 59;
                } else {
                    i3 = intValue3;
                    i2 = intValue5;
                }
                i4 = 0;
            }
            try {
                C3271d dVar2 = dVar;
                int i11 = i;
                return dVar2.mo14238o(aVar4, (long) intValue6, i11, dVar2.mo14238o(C3603a.INSTANT_SECONDS, C3334d.m24477m(longValue / 10000, 315569520000L) + C2752g.m21886P(i10, intValue, intValue2, i3, intValue4, i2, 0).mo12872V((long) i4).mo13109w(C2780r.f19417m), i11, b));
            } catch (RuntimeException unused) {
                return ~i5;
            }
        }

        /* renamed from: d */
        public boolean mo14209d(C3275f fVar, StringBuilder sb) {
            int i;
            StringBuilder sb2 = sb;
            Long f = fVar.mo14252f(C3603a.INSTANT_SECONDS);
            Long l = 0L;
            C3614e e = fVar.mo14251e();
            C3603a aVar = C3603a.NANO_OF_SECOND;
            if (e.mo12781j(aVar)) {
                l = Long.valueOf(fVar.mo14251e().mo12777d(aVar));
            }
            int i2 = 0;
            if (f == null) {
                return false;
            }
            long longValue = f.longValue();
            int k = aVar.mo14737k(l.longValue());
            if (longValue >= -62167219200L) {
                long j = (longValue - 315569520000L) + 62167219200L;
                long e2 = 1 + C3334d.m24469e(j, 315569520000L);
                C2752g R = C2752g.m21888R(C3334d.m24472h(j, 315569520000L) - 62167219200L, 0, C2780r.f19417m);
                if (e2 > 0) {
                    sb2.append('+');
                    sb2.append(e2);
                }
                sb2.append(R);
                if (R.mo12868M() == 0) {
                    sb2.append(":00");
                }
            } else {
                long j2 = longValue + 62167219200L;
                long j3 = j2 / 315569520000L;
                long j4 = j2 % 315569520000L;
                C2752g R2 = C2752g.m21888R(j4 - 62167219200L, 0, C2780r.f19417m);
                int length = sb.length();
                sb2.append(R2);
                if (R2.mo12868M() == 0) {
                    sb2.append(":00");
                }
                if (j3 < 0) {
                    if (R2.mo12869N() == -10000) {
                        sb2.replace(length, length + 2, Long.toString(j3 - 1));
                    } else if (j4 == 0) {
                        sb2.insert(length, j3);
                    } else {
                        sb2.insert(length + 1, Math.abs(j3));
                    }
                }
            }
            int i3 = this.f20678f;
            if (i3 == -2) {
                if (k != 0) {
                    sb2.append('.');
                    int i4 = 1000000;
                    if (k % 1000000 == 0) {
                        i = (k / 1000000) + 1000;
                    } else {
                        if (k % 1000 == 0) {
                            k /= 1000;
                        } else {
                            i4 = 1000000000;
                        }
                        i = k + i4;
                    }
                    sb2.append(Integer.toString(i).substring(1));
                }
            } else if (i3 > 0 || (i3 == -1 && k > 0)) {
                sb2.append('.');
                int i5 = 100000000;
                while (true) {
                    int i6 = this.f20678f;
                    if ((i6 != -1 || k <= 0) && i2 >= i6) {
                        break;
                    }
                    int i7 = k / i5;
                    sb2.append((char) (i7 + 48));
                    k -= i7 * i5;
                    i5 /= 10;
                    i2++;
                }
            }
            sb2.append('Z');
            return true;
        }

        public String toString() {
            return "Instant()";
        }
    }

    /* renamed from: j5.c$j */
    static class C3263j implements C3260g {

        /* renamed from: k */
        static final int[] f20679k = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

        /* renamed from: f */
        final C3620i f20680f;

        /* renamed from: g */
        final int f20681g;

        /* renamed from: h */
        final int f20682h;

        /* renamed from: i */
        final C3280j f20683i;

        /* renamed from: j */
        final int f20684j;

        C3263j(C3620i iVar, int i, int i2, C3280j jVar) {
            this.f20680f = iVar;
            this.f20681g = i;
            this.f20682h = i2;
            this.f20683i = jVar;
            this.f20684j = 0;
        }

        private C3263j(C3620i iVar, int i, int i2, C3280j jVar, int i3) {
            this.f20680f = iVar;
            this.f20681g = i;
            this.f20682h = i2;
            this.f20683i = jVar;
            this.f20684j = i3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public long mo14215a(C3275f fVar, long j) {
            return j;
        }

        /* JADX WARNING: Removed duplicated region for block: B:104:0x015c  */
        /* JADX WARNING: Removed duplicated region for block: B:109:0x017a  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo14208b(p073j5.C3271d r20, java.lang.CharSequence r21, int r22) {
            /*
                r19 = this;
                r6 = r19
                r0 = r22
                int r1 = r21.length()
                if (r0 != r1) goto L_0x000c
                int r0 = ~r0
                return r0
            L_0x000c:
                char r2 = r21.charAt(r22)
                j5.h r3 = r20.mo14233j()
                char r3 = r3.mo14260e()
                r4 = 0
                r5 = 1
                if (r2 != r3) goto L_0x0039
                j5.j r2 = r6.f20683i
                boolean r3 = r20.mo14235l()
                int r7 = r6.f20681g
                int r8 = r6.f20682h
                if (r7 != r8) goto L_0x002a
                r7 = r5
                goto L_0x002b
            L_0x002a:
                r7 = r4
            L_0x002b:
                boolean r2 = r2.mo14265b(r5, r3, r7)
                if (r2 != 0) goto L_0x0033
                int r0 = ~r0
                return r0
            L_0x0033:
                int r0 = r0 + 1
                r7 = r0
                r0 = r4
                r2 = r5
                goto L_0x0071
            L_0x0039:
                j5.h r3 = r20.mo14233j()
                char r3 = r3.mo14259d()
                if (r2 != r3) goto L_0x0060
                j5.j r2 = r6.f20683i
                boolean r3 = r20.mo14235l()
                int r7 = r6.f20681g
                int r8 = r6.f20682h
                if (r7 != r8) goto L_0x0051
                r7 = r5
                goto L_0x0052
            L_0x0051:
                r7 = r4
            L_0x0052:
                boolean r2 = r2.mo14265b(r4, r3, r7)
                if (r2 != 0) goto L_0x005a
                int r0 = ~r0
                return r0
            L_0x005a:
                int r0 = r0 + 1
                r7 = r0
                r2 = r4
                r0 = r5
                goto L_0x0071
            L_0x0060:
                j5.j r2 = r6.f20683i
                j5.j r3 = p073j5.C3280j.ALWAYS
                if (r2 != r3) goto L_0x006e
                boolean r2 = r20.mo14235l()
                if (r2 == 0) goto L_0x006e
                int r0 = ~r0
                return r0
            L_0x006e:
                r7 = r0
                r0 = r4
                r2 = r0
            L_0x0071:
                boolean r3 = r20.mo14235l()
                if (r3 != 0) goto L_0x0080
                boolean r3 = r19.mo14216c(r20)
                if (r3 == 0) goto L_0x007e
                goto L_0x0080
            L_0x007e:
                r3 = r5
                goto L_0x0082
            L_0x0080:
                int r3 = r6.f20681g
            L_0x0082:
                int r8 = r7 + r3
                if (r8 <= r1) goto L_0x0088
                int r0 = ~r7
                return r0
            L_0x0088:
                boolean r9 = r20.mo14235l()
                if (r9 != 0) goto L_0x0098
                boolean r9 = r19.mo14216c(r20)
                if (r9 == 0) goto L_0x0095
                goto L_0x0098
            L_0x0095:
                r9 = 9
                goto L_0x009a
            L_0x0098:
                int r9 = r6.f20682h
            L_0x009a:
                int r10 = r6.f20684j
                int r10 = java.lang.Math.max(r10, r4)
                int r9 = r9 + r10
            L_0x00a1:
                r10 = 0
                r11 = 2
                if (r4 >= r11) goto L_0x010c
                int r9 = r9 + r7
                int r9 = java.lang.Math.min(r9, r1)
                r11 = r7
                r14 = 0
            L_0x00ad:
                if (r11 >= r9) goto L_0x00f6
                int r16 = r11 + 1
                r12 = r21
                char r11 = r12.charAt(r11)
                j5.h r13 = r20.mo14233j()
                int r11 = r13.mo14257b(r11)
                if (r11 >= 0) goto L_0x00c7
                int r11 = r16 + -1
                if (r11 >= r8) goto L_0x00f8
                int r0 = ~r7
                return r0
            L_0x00c7:
                int r13 = r16 - r7
                r5 = 18
                if (r13 <= r5) goto L_0x00e6
                if (r10 != 0) goto L_0x00d3
                java.math.BigInteger r10 = java.math.BigInteger.valueOf(r14)
            L_0x00d3:
                java.math.BigInteger r5 = java.math.BigInteger.TEN
                java.math.BigInteger r5 = r10.multiply(r5)
                long r10 = (long) r11
                java.math.BigInteger r10 = java.math.BigInteger.valueOf(r10)
                java.math.BigInteger r10 = r5.add(r10)
                r5 = r8
                r22 = r9
                goto L_0x00ef
            L_0x00e6:
                r17 = 10
                long r14 = r14 * r17
                r5 = r8
                r22 = r9
                long r8 = (long) r11
                long r14 = r14 + r8
            L_0x00ef:
                r9 = r22
                r8 = r5
                r11 = r16
                r5 = 1
                goto L_0x00ad
            L_0x00f6:
                r12 = r21
            L_0x00f8:
                r5 = r8
                int r8 = r6.f20684j
                if (r8 <= 0) goto L_0x010a
                if (r4 != 0) goto L_0x010a
                int r11 = r11 - r7
                int r11 = r11 - r8
                int r9 = java.lang.Math.max(r3, r11)
                int r4 = r4 + 1
                r8 = r5
                r5 = 1
                goto L_0x00a1
            L_0x010a:
                r5 = r11
                goto L_0x010f
            L_0x010c:
                r5 = r7
                r14 = 0
            L_0x010f:
                if (r0 == 0) goto L_0x013d
                if (r10 == 0) goto L_0x012a
                java.math.BigInteger r0 = java.math.BigInteger.ZERO
                boolean r0 = r10.equals(r0)
                if (r0 == 0) goto L_0x0125
                boolean r0 = r20.mo14235l()
                if (r0 == 0) goto L_0x0125
                r0 = 1
                int r7 = r7 - r0
                int r0 = ~r7
                return r0
            L_0x0125:
                java.math.BigInteger r10 = r10.negate()
                goto L_0x0159
            L_0x012a:
                r0 = 1
                r1 = 0
                int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
                if (r1 != 0) goto L_0x013a
                boolean r1 = r20.mo14235l()
                if (r1 == 0) goto L_0x013a
                int r7 = r7 - r0
                int r0 = ~r7
                return r0
            L_0x013a:
                long r0 = -r14
                r2 = r0
                goto L_0x015a
            L_0x013d:
                j5.j r0 = r6.f20683i
                j5.j r1 = p073j5.C3280j.EXCEEDS_PAD
                if (r0 != r1) goto L_0x0159
                boolean r0 = r20.mo14235l()
                if (r0 == 0) goto L_0x0159
                int r0 = r5 - r7
                int r1 = r6.f20681g
                if (r2 == 0) goto L_0x0155
                if (r0 > r1) goto L_0x0159
                r0 = 1
                int r7 = r7 - r0
                int r0 = ~r7
                return r0
            L_0x0155:
                if (r0 <= r1) goto L_0x0159
                int r0 = ~r7
                return r0
            L_0x0159:
                r2 = r14
            L_0x015a:
                if (r10 == 0) goto L_0x017a
                int r0 = r10.bitLength()
                r1 = 63
                if (r0 <= r1) goto L_0x016c
                java.math.BigInteger r0 = java.math.BigInteger.TEN
                java.math.BigInteger r10 = r10.divide(r0)
                int r5 = r5 + -1
            L_0x016c:
                long r2 = r10.longValue()
                r0 = r19
                r1 = r20
                r4 = r7
                int r0 = r0.mo14217e(r1, r2, r4, r5)
                return r0
            L_0x017a:
                r0 = r19
                r1 = r20
                r4 = r7
                int r0 = r0.mo14217e(r1, r2, r4, r5)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p073j5.C3253c.C3263j.mo14208b(j5.d, java.lang.CharSequence, int):int");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo14216c(C3271d dVar) {
            int i = this.f20684j;
            return i == -1 || (i > 0 && this.f20681g == this.f20682h && this.f20683i == C3280j.NOT_NEGATIVE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x00ab A[LOOP:0: B:30:0x00a2->B:32:0x00ab, LOOP_END] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo14209d(p073j5.C3275f r11, java.lang.StringBuilder r12) {
            /*
                r10 = this;
                l5.i r0 = r10.f20680f
                java.lang.Long r0 = r11.mo14252f(r0)
                r1 = 0
                if (r0 != 0) goto L_0x000a
                return r1
            L_0x000a:
                long r2 = r0.longValue()
                long r2 = r10.mo14215a(r11, r2)
                j5.h r11 = r11.mo14250d()
                r4 = -9223372036854775808
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L_0x001f
                java.lang.String r0 = "9223372036854775808"
                goto L_0x0027
            L_0x001f:
                long r4 = java.lang.Math.abs(r2)
                java.lang.String r0 = java.lang.Long.toString(r4)
            L_0x0027:
                int r4 = r0.length()
                int r5 = r10.f20682h
                java.lang.String r6 = " cannot be printed as the value "
                java.lang.String r7 = "Field "
                if (r4 > r5) goto L_0x00b9
                java.lang.String r0 = r11.mo14256a(r0)
                r4 = 0
                int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                r5 = 2
                r8 = 1
                if (r4 < 0) goto L_0x0066
                int[] r4 = p073j5.C3253c.C3257d.f20670a
                j5.j r6 = r10.f20683i
                int r6 = r6.ordinal()
                r4 = r4[r6]
                if (r4 == r8) goto L_0x0056
                if (r4 == r5) goto L_0x004e
                goto L_0x00a2
            L_0x004e:
                char r2 = r11.mo14260e()
            L_0x0052:
                r12.append(r2)
                goto L_0x00a2
            L_0x0056:
                int r4 = r10.f20681g
                r5 = 19
                if (r4 >= r5) goto L_0x00a2
                int[] r5 = f20679k
                r4 = r5[r4]
                long r4 = (long) r4
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L_0x00a2
                goto L_0x004e
            L_0x0066:
                int[] r4 = p073j5.C3253c.C3257d.f20670a
                j5.j r9 = r10.f20683i
                int r9 = r9.ordinal()
                r4 = r4[r9]
                if (r4 == r8) goto L_0x009d
                if (r4 == r5) goto L_0x009d
                r5 = 3
                if (r4 == r5) goto L_0x009d
                r5 = 4
                if (r4 == r5) goto L_0x007b
                goto L_0x00a2
            L_0x007b:
                h5.b r11 = new h5.b
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r7)
                l5.i r0 = r10.f20680f
                r12.append(r0)
                r12.append(r6)
                r12.append(r2)
                java.lang.String r0 = " cannot be negative according to the SignStyle"
                r12.append(r0)
                java.lang.String r12 = r12.toString()
                r11.<init>(r12)
                throw r11
            L_0x009d:
                char r2 = r11.mo14259d()
                goto L_0x0052
            L_0x00a2:
                int r2 = r10.f20681g
                int r3 = r0.length()
                int r2 = r2 - r3
                if (r1 >= r2) goto L_0x00b5
                char r2 = r11.mo14262f()
                r12.append(r2)
                int r1 = r1 + 1
                goto L_0x00a2
            L_0x00b5:
                r12.append(r0)
                return r8
            L_0x00b9:
                h5.b r11 = new h5.b
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r7)
                l5.i r0 = r10.f20680f
                r12.append(r0)
                r12.append(r6)
                r12.append(r2)
                java.lang.String r0 = " exceeds the maximum print width of "
                r12.append(r0)
                int r0 = r10.f20682h
                r12.append(r0)
                java.lang.String r12 = r12.toString()
                r11.<init>(r12)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p073j5.C3253c.C3263j.mo14209d(j5.f, java.lang.StringBuilder):boolean");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo14217e(C3271d dVar, long j, int i, int i2) {
            return dVar.mo14238o(this.f20680f, j, i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C3263j mo14218f() {
            return this.f20684j == -1 ? this : new C3263j(this.f20680f, this.f20681g, this.f20682h, this.f20683i, -1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C3263j mo14219g(int i) {
            return new C3263j(this.f20680f, this.f20681g, this.f20682h, this.f20683i, this.f20684j + i);
        }

        public String toString() {
            StringBuilder sb;
            Object obj;
            int i = this.f20681g;
            if (i == 1 && this.f20682h == 19 && this.f20683i == C3280j.NORMAL) {
                sb = new StringBuilder();
                sb.append("Value(");
                obj = this.f20680f;
            } else if (i == this.f20682h && this.f20683i == C3280j.NOT_NEGATIVE) {
                sb = new StringBuilder();
                sb.append("Value(");
                sb.append(this.f20680f);
                sb.append(",");
                sb.append(this.f20681g);
                sb.append(")");
                return sb.toString();
            } else {
                sb = new StringBuilder();
                sb.append("Value(");
                sb.append(this.f20680f);
                sb.append(",");
                sb.append(this.f20681g);
                sb.append(",");
                sb.append(this.f20682h);
                sb.append(",");
                obj = this.f20683i;
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: j5.c$k */
    static final class C3264k implements C3260g {

        /* renamed from: h */
        static final String[] f20685h = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};

        /* renamed from: i */
        static final C3264k f20686i = new C3264k("Z", "+HH:MM:ss");

        /* renamed from: f */
        private final String f20687f;

        /* renamed from: g */
        private final int f20688g;

        C3264k(String str, String str2) {
            C3334d.m24473i(str, "noOffsetText");
            C3334d.m24473i(str2, "pattern");
            this.f20687f = str;
            this.f20688g = m24264a(str2);
        }

        /* renamed from: a */
        private int m24264a(String str) {
            int i = 0;
            while (true) {
                String[] strArr = f20685h;
                if (i >= strArr.length) {
                    throw new IllegalArgumentException("Invalid zone offset pattern: " + str);
                } else if (strArr[i].equals(str)) {
                    return i;
                } else {
                    i++;
                }
            }
        }

        /* renamed from: c */
        private boolean m24265c(int[] iArr, int i, CharSequence charSequence, boolean z) {
            int i2;
            int i3 = this.f20688g;
            if ((i3 + 3) / 2 < i) {
                return false;
            }
            int i4 = iArr[0];
            if (i3 % 2 == 0 && i > 1) {
                int i5 = i4 + 1;
                if (i5 > charSequence.length() || charSequence.charAt(i4) != ':') {
                    return z;
                }
                i4 = i5;
            }
            if (i4 + 2 > charSequence.length()) {
                return z;
            }
            int i6 = i4 + 1;
            char charAt = charSequence.charAt(i4);
            int i7 = i6 + 1;
            char charAt2 = charSequence.charAt(i6);
            if (charAt < '0' || charAt > '9' || charAt2 < '0' || charAt2 > '9' || (i2 = ((charAt - '0') * 10) + (charAt2 - '0')) < 0 || i2 > 59) {
                return z;
            }
            iArr[i] = i2;
            iArr[0] = i7;
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
            if (r16.mo14242s(r17, r18, r0.f20687f, 0, r9) != false) goto L_0x0036;
         */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x007c  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo14208b(p073j5.C3271d r16, java.lang.CharSequence r17, int r18) {
            /*
                r15 = this;
                r0 = r15
                r7 = r17
                r8 = r18
                int r1 = r17.length()
                java.lang.String r2 = r0.f20687f
                int r9 = r2.length()
                if (r9 != 0) goto L_0x0022
                if (r8 != r1) goto L_0x0041
                l5.a r2 = p087l5.C3603a.OFFSET_SECONDS
                r3 = 0
                r1 = r16
                r5 = r18
                r6 = r18
            L_0x001d:
                int r1 = r1.mo14238o(r2, r3, r5, r6)
                return r1
            L_0x0022:
                if (r8 != r1) goto L_0x0026
                int r1 = ~r8
                return r1
            L_0x0026:
                java.lang.String r4 = r0.f20687f
                r5 = 0
                r1 = r16
                r2 = r17
                r3 = r18
                r6 = r9
                boolean r1 = r1.mo14242s(r2, r3, r4, r5, r6)
                if (r1 == 0) goto L_0x0041
            L_0x0036:
                l5.a r2 = p087l5.C3603a.OFFSET_SECONDS
                r3 = 0
                int r6 = r8 + r9
                r1 = r16
                r5 = r18
                goto L_0x001d
            L_0x0041:
                char r1 = r17.charAt(r18)
                r2 = 43
                r3 = 45
                if (r1 == r2) goto L_0x004d
                if (r1 != r3) goto L_0x009b
            L_0x004d:
                r2 = 1
                if (r1 != r3) goto L_0x0052
                r1 = -1
                goto L_0x0053
            L_0x0052:
                r1 = r2
            L_0x0053:
                r3 = 4
                int[] r3 = new int[r3]
                int r4 = r8 + 1
                r5 = 0
                r3[r5] = r4
                boolean r4 = r15.m24265c(r3, r2, r7, r2)
                r6 = 2
                r10 = 3
                if (r4 != 0) goto L_0x0079
                int r4 = r0.f20688g
                if (r4 < r10) goto L_0x0069
                r4 = r2
                goto L_0x006a
            L_0x0069:
                r4 = r5
            L_0x006a:
                boolean r4 = r15.m24265c(r3, r6, r7, r4)
                if (r4 != 0) goto L_0x0079
                boolean r4 = r15.m24265c(r3, r10, r7, r5)
                if (r4 == 0) goto L_0x0077
                goto L_0x0079
            L_0x0077:
                r4 = r5
                goto L_0x007a
            L_0x0079:
                r4 = r2
            L_0x007a:
                if (r4 != 0) goto L_0x009b
                long r11 = (long) r1
                r1 = r3[r2]
                long r1 = (long) r1
                r13 = 3600(0xe10, double:1.7786E-320)
                long r1 = r1 * r13
                r4 = r3[r6]
                long r6 = (long) r4
                r13 = 60
                long r6 = r6 * r13
                long r1 = r1 + r6
                r4 = r3[r10]
                long r6 = (long) r4
                long r1 = r1 + r6
                long r6 = r11 * r1
                l5.a r2 = p087l5.C3603a.OFFSET_SECONDS
                r9 = r3[r5]
                r1 = r16
                r3 = r6
                r5 = r18
                r6 = r9
                goto L_0x001d
            L_0x009b:
                if (r9 != 0) goto L_0x009e
                goto L_0x0036
            L_0x009e:
                int r1 = ~r8
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p073j5.C3253c.C3264k.mo14208b(j5.d, java.lang.CharSequence, int):int");
        }

        /* renamed from: d */
        public boolean mo14209d(C3275f fVar, StringBuilder sb) {
            Long f = fVar.mo14252f(C3603a.OFFSET_SECONDS);
            if (f == null) {
                return false;
            }
            int p = C3334d.m24480p(f.longValue());
            if (p != 0) {
                int abs = Math.abs((p / 3600) % 100);
                int abs2 = Math.abs((p / 60) % 60);
                int abs3 = Math.abs(p % 60);
                int length = sb.length();
                sb.append(p < 0 ? "-" : "+");
                sb.append((char) ((abs / 10) + 48));
                sb.append((char) ((abs % 10) + 48));
                int i = this.f20688g;
                if (i >= 3 || (i >= 1 && abs2 > 0)) {
                    String str = ":";
                    sb.append(i % 2 == 0 ? str : "");
                    sb.append((char) ((abs2 / 10) + 48));
                    sb.append((char) ((abs2 % 10) + 48));
                    abs += abs2;
                    int i2 = this.f20688g;
                    if (i2 >= 7 || (i2 >= 5 && abs3 > 0)) {
                        if (i2 % 2 != 0) {
                            str = "";
                        }
                        sb.append(str);
                        sb.append((char) ((abs3 / 10) + 48));
                        sb.append((char) ((abs3 % 10) + 48));
                        abs += abs3;
                    }
                }
                if (abs == 0) {
                    sb.setLength(length);
                }
                return true;
            }
            sb.append(this.f20687f);
            return true;
        }

        public String toString() {
            String replace = this.f20687f.replace("'", "''");
            return "Offset(" + f20685h[this.f20688g] + ",'" + replace + "')";
        }
    }

    /* renamed from: j5.c$l */
    static final class C3265l implements C3260g {

        /* renamed from: f */
        private final C3260g f20689f;

        /* renamed from: g */
        private final int f20690g;

        /* renamed from: h */
        private final char f20691h;

        C3265l(C3260g gVar, int i, char c) {
            this.f20689f = gVar;
            this.f20690g = i;
            this.f20691h = c;
        }

        /* renamed from: b */
        public int mo14208b(C3271d dVar, CharSequence charSequence, int i) {
            boolean l = dVar.mo14235l();
            boolean k = dVar.mo14234k();
            if (i > charSequence.length()) {
                throw new IndexOutOfBoundsException();
            } else if (i == charSequence.length()) {
                return ~i;
            } else {
                int i2 = this.f20690g + i;
                if (i2 > charSequence.length()) {
                    if (l) {
                        return ~i;
                    }
                    i2 = charSequence.length();
                }
                int i3 = i;
                while (i3 < i2) {
                    char charAt = charSequence.charAt(i3);
                    char c = this.f20691h;
                    if (!k) {
                        if (!dVar.mo14227b(charAt, c)) {
                            break;
                        }
                    } else if (charAt != c) {
                        break;
                    }
                    i3++;
                }
                int b = this.f20689f.mo14208b(dVar, charSequence.subSequence(0, i2), i3);
                return (b == i2 || !l) ? b : ~(i + i3);
            }
        }

        /* renamed from: d */
        public boolean mo14209d(C3275f fVar, StringBuilder sb) {
            int length = sb.length();
            if (!this.f20689f.mo14209d(fVar, sb)) {
                return false;
            }
            int length2 = sb.length() - length;
            if (length2 <= this.f20690g) {
                for (int i = 0; i < this.f20690g - length2; i++) {
                    sb.insert(length, this.f20691h);
                }
                return true;
            }
            throw new C2742b("Cannot print as output of " + length2 + " characters exceeds pad width of " + this.f20690g);
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("Pad(");
            sb.append(this.f20689f);
            sb.append(",");
            sb.append(this.f20690g);
            if (this.f20691h == ' ') {
                str = ")";
            } else {
                str = ",'" + this.f20691h + "')";
            }
            sb.append(str);
            return sb.toString();
        }
    }

    /* renamed from: j5.c$m */
    enum C3266m implements C3260g {
        SENSITIVE,
        INSENSITIVE,
        STRICT,
        LENIENT;

        /* renamed from: b */
        public int mo14208b(C3271d dVar, CharSequence charSequence, int i) {
            int ordinal = ordinal();
            if (ordinal == 0) {
                dVar.mo14236m(true);
            } else if (ordinal == 1) {
                dVar.mo14236m(false);
            } else if (ordinal == 2) {
                dVar.mo14240q(true);
            } else if (ordinal == 3) {
                dVar.mo14240q(false);
            }
            return i;
        }

        /* renamed from: d */
        public boolean mo14209d(C3275f fVar, StringBuilder sb) {
            return true;
        }

        public String toString() {
            int ordinal = ordinal();
            if (ordinal == 0) {
                return "ParseCaseSensitive(true)";
            }
            if (ordinal == 1) {
                return "ParseCaseSensitive(false)";
            }
            if (ordinal == 2) {
                return "ParseStrict(true)";
            }
            if (ordinal == 3) {
                return "ParseStrict(false)";
            }
            throw new IllegalStateException("Unreachable");
        }
    }

    /* renamed from: j5.c$n */
    static final class C3267n implements C3260g {

        /* renamed from: f */
        private final String f20697f;

        C3267n(String str) {
            this.f20697f = str;
        }

        /* renamed from: b */
        public int mo14208b(C3271d dVar, CharSequence charSequence, int i) {
            if (i > charSequence.length() || i < 0) {
                throw new IndexOutOfBoundsException();
            }
            String str = this.f20697f;
            return !dVar.mo14242s(charSequence, i, str, 0, str.length()) ? ~i : i + this.f20697f.length();
        }

        /* renamed from: d */
        public boolean mo14209d(C3275f fVar, StringBuilder sb) {
            sb.append(this.f20697f);
            return true;
        }

        public String toString() {
            String replace = this.f20697f.replace("'", "''");
            return "'" + replace + "'";
        }
    }

    /* renamed from: j5.c$o */
    static final class C3268o implements C3260g {

        /* renamed from: f */
        private final C3620i f20698f;

        /* renamed from: g */
        private final C3284l f20699g;

        /* renamed from: h */
        private final C3277g f20700h;

        /* renamed from: i */
        private volatile C3263j f20701i;

        C3268o(C3620i iVar, C3284l lVar, C3277g gVar) {
            this.f20698f = iVar;
            this.f20699g = lVar;
            this.f20700h = gVar;
        }

        /* renamed from: a */
        private C3263j m24274a() {
            if (this.f20701i == null) {
                this.f20701i = new C3263j(this.f20698f, 1, 19, C3280j.NORMAL);
            }
            return this.f20701i;
        }

        /* renamed from: b */
        public int mo14208b(C3271d dVar, CharSequence charSequence, int i) {
            int length = charSequence.length();
            if (i < 0 || i > length) {
                throw new IndexOutOfBoundsException();
            }
            Iterator<Map.Entry<String, Long>> b = this.f20700h.mo14205b(this.f20698f, dVar.mo14235l() ? this.f20699g : null, dVar.mo14231h());
            if (b != null) {
                while (b.hasNext()) {
                    Map.Entry next = b.next();
                    String str = (String) next.getKey();
                    if (dVar.mo14242s(str, 0, charSequence, i, str.length())) {
                        return dVar.mo14238o(this.f20698f, ((Long) next.getValue()).longValue(), i, i + str.length());
                    }
                }
                if (dVar.mo14235l()) {
                    return ~i;
                }
            }
            return m24274a().mo14208b(dVar, charSequence, i);
        }

        /* renamed from: d */
        public boolean mo14209d(C3275f fVar, StringBuilder sb) {
            Long f = fVar.mo14252f(this.f20698f);
            if (f == null) {
                return false;
            }
            String a = this.f20700h.mo14204a(this.f20698f, f.longValue(), this.f20699g, fVar.mo14249c());
            if (a == null) {
                return m24274a().mo14209d(fVar, sb);
            }
            sb.append(a);
            return true;
        }

        public String toString() {
            StringBuilder sb;
            Object obj;
            if (this.f20699g == C3284l.FULL) {
                sb = new StringBuilder();
                sb.append("Text(");
                obj = this.f20698f;
            } else {
                sb = new StringBuilder();
                sb.append("Text(");
                sb.append(this.f20698f);
                sb.append(",");
                obj = this.f20699g;
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: j5.c$p */
    static final class C3269p implements C3260g {

        /* renamed from: h */
        private static volatile Map.Entry<Integer, C3270a> f20702h;

        /* renamed from: f */
        private final C3629k<C2778q> f20703f;

        /* renamed from: g */
        private final String f20704g;

        /* renamed from: j5.c$p$a */
        private static final class C3270a {

            /* renamed from: a */
            final int f20705a;

            /* renamed from: b */
            private final Map<CharSequence, C3270a> f20706b;

            /* renamed from: c */
            private final Map<String, C3270a> f20707c;

            private C3270a(int i) {
                this.f20706b = new HashMap();
                this.f20707c = new HashMap();
                this.f20705a = i;
            }

            /* synthetic */ C3270a(int i, C3254a aVar) {
                this(i);
            }

            /* access modifiers changed from: private */
            /* renamed from: c */
            public void m24284c(String str) {
                int length = str.length();
                int i = this.f20705a;
                if (length == i) {
                    this.f20706b.put(str, (Object) null);
                    this.f20707c.put(str.toLowerCase(Locale.ENGLISH), (Object) null);
                } else if (length > i) {
                    String substring = str.substring(0, i);
                    C3270a aVar = this.f20706b.get(substring);
                    if (aVar == null) {
                        aVar = new C3270a(length);
                        this.f20706b.put(substring, aVar);
                        this.f20707c.put(substring.toLowerCase(Locale.ENGLISH), aVar);
                    }
                    aVar.m24284c(str);
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: d */
            public C3270a m24285d(CharSequence charSequence, boolean z) {
                Map map;
                if (z) {
                    map = this.f20706b;
                } else {
                    map = this.f20707c;
                    charSequence = charSequence.toString().toLowerCase(Locale.ENGLISH);
                }
                return (C3270a) map.get(charSequence);
            }
        }

        C3269p(C3629k<C2778q> kVar, String str) {
            this.f20703f = kVar;
            this.f20704g = str;
        }

        /* renamed from: a */
        private C2778q m24277a(Set<String> set, String str, boolean z) {
            if (str == null) {
                return null;
            }
            if (!z) {
                for (String next : set) {
                    if (next.equalsIgnoreCase(str)) {
                        return C2778q.m22125q(next);
                    }
                }
                return null;
            } else if (set.contains(str)) {
                return C2778q.m22125q(str);
            } else {
                return null;
            }
        }

        /* renamed from: c */
        private int m24278c(C3271d dVar, CharSequence charSequence, int i, int i2) {
            int b;
            String upperCase = charSequence.subSequence(i, i2).toString().toUpperCase();
            C3271d d = dVar.mo14228d();
            if ((i2 >= charSequence.length() || !dVar.mo14227b(charSequence.charAt(i2), 'Z')) && (b = C3264k.f20686i.mo14208b(d, charSequence, i2)) >= 0) {
                dVar.mo14237n(C2778q.m22126r(upperCase, C2780r.m22141z((int) d.mo14232i(C3603a.OFFSET_SECONDS).longValue())));
                return b;
            }
            dVar.mo14237n(C2778q.m22126r(upperCase, C2780r.f19417m));
            return i2;
        }

        /* renamed from: e */
        private static C3270a m24279e(Set<String> set) {
            ArrayList<String> arrayList = new ArrayList<>(set);
            Collections.sort(arrayList, C3253c.f20660j);
            C3270a aVar = new C3270a(((String) arrayList.get(0)).length(), (C3254a) null);
            for (String b : arrayList) {
                aVar.m24284c(b);
            }
            return aVar;
        }

        /* renamed from: b */
        public int mo14208b(C3271d dVar, CharSequence charSequence, int i) {
            int i2;
            int length = charSequence.length();
            if (i > length) {
                throw new IndexOutOfBoundsException();
            } else if (i == length) {
                return ~i;
            } else {
                char charAt = charSequence.charAt(i);
                if (charAt == '+' || charAt == '-') {
                    C3271d d = dVar.mo14228d();
                    int b = C3264k.f20686i.mo14208b(d, charSequence, i);
                    if (b < 0) {
                        return b;
                    }
                    dVar.mo14237n(C2780r.m22141z((int) d.mo14232i(C3603a.OFFSET_SECONDS).longValue()));
                    return b;
                }
                int i3 = i + 2;
                if (length >= i3) {
                    char charAt2 = charSequence.charAt(i + 1);
                    if (dVar.mo14227b(charAt, 'U') && dVar.mo14227b(charAt2, 'T')) {
                        int i4 = i + 3;
                        return (length < i4 || !dVar.mo14227b(charSequence.charAt(i3), 'C')) ? m24278c(dVar, charSequence, i, i3) : m24278c(dVar, charSequence, i, i4);
                    } else if (dVar.mo14227b(charAt, 'G') && length >= (i2 = i + 3) && dVar.mo14227b(charAt2, 'M') && dVar.mo14227b(charSequence.charAt(i3), 'T')) {
                        return m24278c(dVar, charSequence, i, i2);
                    }
                }
                Set<String> a = C3738i.m25477a();
                int size = a.size();
                Map.Entry<Integer, C3270a> entry = f20702h;
                if (entry == null || entry.getKey().intValue() != size) {
                    synchronized (this) {
                        entry = f20702h;
                        if (entry == null || entry.getKey().intValue() != size) {
                            entry = new AbstractMap.SimpleImmutableEntry<>(Integer.valueOf(size), m24279e(a));
                            f20702h = entry;
                        }
                    }
                }
                C3270a value = entry.getValue();
                String str = null;
                String str2 = null;
                while (value != null) {
                    int i5 = value.f20705a + i;
                    if (i5 > length) {
                        break;
                    }
                    String charSequence2 = charSequence.subSequence(i, i5).toString();
                    value = value.m24285d(charSequence2, dVar.mo14234k());
                    String str3 = charSequence2;
                    str2 = str;
                    str = str3;
                }
                C2778q a2 = m24277a(a, str, dVar.mo14234k());
                if (a2 == null) {
                    a2 = m24277a(a, str2, dVar.mo14234k());
                    if (a2 != null) {
                        str = str2;
                    } else if (!dVar.mo14227b(charAt, 'Z')) {
                        return ~i;
                    } else {
                        dVar.mo14237n(C2780r.f19417m);
                        return i + 1;
                    }
                }
                dVar.mo14237n(a2);
                return i + str.length();
            }
        }

        /* renamed from: d */
        public boolean mo14209d(C3275f fVar, StringBuilder sb) {
            C2778q qVar = (C2778q) fVar.mo14253g(this.f20703f);
            if (qVar == null) {
                return false;
            }
            sb.append(qVar.mo13004k());
            return true;
        }

        public String toString() {
            return this.f20704g;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f20659i = hashMap;
        hashMap.put('G', C3603a.ERA);
        hashMap.put('y', C3603a.YEAR_OF_ERA);
        hashMap.put('u', C3603a.YEAR);
        C3620i iVar = C3605c.f21328b;
        hashMap.put('Q', iVar);
        hashMap.put('q', iVar);
        C3603a aVar = C3603a.MONTH_OF_YEAR;
        hashMap.put('M', aVar);
        hashMap.put('L', aVar);
        hashMap.put('D', C3603a.DAY_OF_YEAR);
        hashMap.put('d', C3603a.DAY_OF_MONTH);
        hashMap.put('F', C3603a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        C3603a aVar2 = C3603a.DAY_OF_WEEK;
        hashMap.put('E', aVar2);
        hashMap.put('c', aVar2);
        hashMap.put('e', aVar2);
        hashMap.put('a', C3603a.AMPM_OF_DAY);
        hashMap.put('H', C3603a.HOUR_OF_DAY);
        hashMap.put('k', C3603a.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', C3603a.HOUR_OF_AMPM);
        hashMap.put('h', C3603a.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', C3603a.MINUTE_OF_HOUR);
        hashMap.put('s', C3603a.SECOND_OF_MINUTE);
        C3603a aVar3 = C3603a.NANO_OF_SECOND;
        hashMap.put('S', aVar3);
        hashMap.put('A', C3603a.MILLI_OF_DAY);
        hashMap.put('n', aVar3);
        hashMap.put('N', C3603a.NANO_OF_DAY);
    }

    public C3253c() {
        this.f20661a = this;
        this.f20663c = new ArrayList();
        this.f20667g = -1;
        this.f20662b = null;
        this.f20664d = false;
    }

    private C3253c(C3253c cVar, boolean z) {
        this.f20661a = this;
        this.f20663c = new ArrayList();
        this.f20667g = -1;
        this.f20662b = cVar;
        this.f20664d = z;
    }

    /* renamed from: d */
    private int m24218d(C3260g gVar) {
        C3334d.m24473i(gVar, "pp");
        C3253c cVar = this.f20661a;
        int i = cVar.f20665e;
        if (i > 0) {
            if (gVar != null) {
                gVar = new C3265l(gVar, i, cVar.f20666f);
            }
            C3253c cVar2 = this.f20661a;
            cVar2.f20665e = 0;
            cVar2.f20666f = 0;
        }
        this.f20661a.f20663c.add(gVar);
        C3253c cVar3 = this.f20661a;
        cVar3.f20667g = -1;
        return cVar3.f20663c.size() - 1;
    }

    /* renamed from: j */
    private C3253c m24219j(C3263j jVar) {
        C3263j jVar2;
        C3253c cVar = this.f20661a;
        int i = cVar.f20667g;
        if (i < 0 || !(cVar.f20663c.get(i) instanceof C3263j)) {
            this.f20661a.f20667g = m24218d(jVar);
        } else {
            C3253c cVar2 = this.f20661a;
            int i2 = cVar2.f20667g;
            C3263j jVar3 = (C3263j) cVar2.f20663c.get(i2);
            int i3 = jVar.f20681g;
            int i4 = jVar.f20682h;
            if (i3 == i4 && jVar.f20683i == C3280j.NOT_NEGATIVE) {
                jVar2 = jVar3.mo14219g(i4);
                m24218d(jVar.mo14218f());
                this.f20661a.f20667g = i2;
            } else {
                jVar2 = jVar3.mo14218f();
                this.f20661a.f20667g = m24218d(jVar);
            }
            this.f20661a.f20663c.set(i2, jVar2);
        }
        return this;
    }

    /* renamed from: a */
    public C3253c mo14184a(C3250b bVar) {
        C3334d.m24473i(bVar, "formatter");
        m24218d(bVar.mo14178k(false));
        return this;
    }

    /* renamed from: b */
    public C3253c mo14185b(C3620i iVar, int i, int i2, boolean z) {
        m24218d(new C3261h(iVar, i, i2, z));
        return this;
    }

    /* renamed from: c */
    public C3253c mo14186c() {
        m24218d(new C3262i(-2));
        return this;
    }

    /* renamed from: e */
    public C3253c mo14187e(char c) {
        m24218d(new C3258e(c));
        return this;
    }

    /* renamed from: f */
    public C3253c mo14188f(String str) {
        C3334d.m24473i(str, "literal");
        if (str.length() > 0) {
            m24218d(str.length() == 1 ? new C3258e(str.charAt(0)) : new C3267n(str));
        }
        return this;
    }

    /* renamed from: g */
    public C3253c mo14189g(String str, String str2) {
        m24218d(new C3264k(str2, str));
        return this;
    }

    /* renamed from: h */
    public C3253c mo14190h() {
        m24218d(C3264k.f20686i);
        return this;
    }

    /* renamed from: i */
    public C3253c mo14191i(C3620i iVar, Map<Long, String> map) {
        C3334d.m24473i(iVar, "field");
        C3334d.m24473i(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        C3284l lVar = C3284l.FULL;
        m24218d(new C3268o(iVar, lVar, new C3255b(new C3281k.C3283b(Collections.singletonMap(lVar, linkedHashMap)))));
        return this;
    }

    /* renamed from: k */
    public C3253c mo14192k(C3620i iVar, int i) {
        C3334d.m24473i(iVar, "field");
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i);
        }
        m24219j(new C3263j(iVar, i, i, C3280j.NOT_NEGATIVE));
        return this;
    }

    /* renamed from: l */
    public C3253c mo14193l(C3620i iVar, int i, int i2, C3280j jVar) {
        if (i == i2 && jVar == C3280j.NOT_NEGATIVE) {
            return mo14192k(iVar, i2);
        }
        C3334d.m24473i(iVar, "field");
        C3334d.m24473i(jVar, "signStyle");
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i);
        } else if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i2);
        } else if (i2 >= i) {
            m24219j(new C3263j(iVar, i, i2, jVar));
            return this;
        } else {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
        }
    }

    /* renamed from: m */
    public C3253c mo14194m() {
        m24218d(new C3269p(f20658h, "ZoneRegionId()"));
        return this;
    }

    /* renamed from: n */
    public C3253c mo14195n() {
        C3253c cVar = this.f20661a;
        if (cVar.f20662b != null) {
            if (cVar.f20663c.size() > 0) {
                C3253c cVar2 = this.f20661a;
                C3259f fVar = new C3259f(cVar2.f20663c, cVar2.f20664d);
                this.f20661a = this.f20661a.f20662b;
                m24218d(fVar);
            } else {
                this.f20661a = this.f20661a.f20662b;
            }
            return this;
        }
        throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
    }

    /* renamed from: o */
    public C3253c mo14196o() {
        C3253c cVar = this.f20661a;
        cVar.f20667g = -1;
        this.f20661a = new C3253c(cVar, true);
        return this;
    }

    /* renamed from: p */
    public C3253c mo14197p() {
        m24218d(C3266m.INSENSITIVE);
        return this;
    }

    /* renamed from: q */
    public C3253c mo14198q() {
        m24218d(C3266m.SENSITIVE);
        return this;
    }

    /* renamed from: r */
    public C3253c mo14199r() {
        m24218d(C3266m.LENIENT);
        return this;
    }

    /* renamed from: s */
    public C3250b mo14200s() {
        return mo14202u(Locale.getDefault());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public C3250b mo14201t(C3279i iVar) {
        return mo14200s().mo14180m(iVar);
    }

    /* renamed from: u */
    public C3250b mo14202u(Locale locale) {
        C3334d.m24473i(locale, "locale");
        while (this.f20661a.f20662b != null) {
            mo14195n();
        }
        return new C3250b(new C3259f(this.f20663c, false), locale, C3278h.f20732e, C3279i.SMART, (Set<C3620i>) null, (C2870h) null, (C2778q) null);
    }
}
