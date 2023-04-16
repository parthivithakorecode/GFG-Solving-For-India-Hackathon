package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.j1 */
public final class C1835j1 implements oc4, pd4 {

    /* renamed from: x */
    public static final vc4 f8917x = C1724g1.f7225b;

    /* renamed from: a */
    private final dr2 f8918a = new dr2(th2.f14860a);

    /* renamed from: b */
    private final dr2 f8919b = new dr2(4);

    /* renamed from: c */
    private final dr2 f8920c = new dr2();

    /* renamed from: d */
    private final dr2 f8921d = new dr2(16);

    /* renamed from: e */
    private final ArrayDeque<C2019o0> f8922e = new ArrayDeque<>();

    /* renamed from: f */
    private final C1946m1 f8923f = new C1946m1();

    /* renamed from: g */
    private final List<b81> f8924g = new ArrayList();

    /* renamed from: h */
    private int f8925h = 0;

    /* renamed from: i */
    private int f8926i;

    /* renamed from: j */
    private long f8927j;

    /* renamed from: k */
    private int f8928k;

    /* renamed from: l */
    private dr2 f8929l;

    /* renamed from: m */
    private int f8930m = -1;

    /* renamed from: n */
    private int f8931n;

    /* renamed from: o */
    private int f8932o;

    /* renamed from: p */
    private int f8933p;

    /* renamed from: q */
    private rc4 f8934q;

    /* renamed from: r */
    private C1798i1[] f8935r;

    /* renamed from: s */
    private long[][] f8936s;

    /* renamed from: t */
    private int f8937t;

    /* renamed from: u */
    private long f8938u;

    /* renamed from: v */
    private int f8939v;

    /* renamed from: w */
    private C1944m f8940w;

    public C1835j1(int i) {
    }

    /* renamed from: j */
    private static int m11388j(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    /* renamed from: k */
    private static int m11389k(C2131r1 r1Var, long j) {
        int a = r1Var.mo10447a(j);
        return a == -1 ? r1Var.mo10448b(j) : a;
    }

    /* renamed from: l */
    private static long m11390l(C2131r1 r1Var, long j, long j2) {
        int k = m11389k(r1Var, j);
        return k == -1 ? j2 : Math.min(r1Var.f13443c[k], j2);
    }

    /* renamed from: m */
    private final void m11391m() {
        this.f8925h = 0;
        this.f8928k = 0;
    }

    /* renamed from: n */
    private final void m11392n(long j) {
        C1835j1 j1Var;
        c91 c91;
        c91 c912;
        long j2;
        int i;
        List<C2131r1> list;
        C1835j1 j1Var2;
        c91 c913;
        char c;
        int i2;
        C1835j1 j1Var3 = this;
        while (!j1Var3.f8922e.isEmpty() && j1Var3.f8922e.peek().f11786b == j) {
            C2019o0 pop = j1Var3.f8922e.pop();
            if (pop.f12974a == 1836019574) {
                ArrayList arrayList = new ArrayList();
                boolean z = j1Var3.f8939v == 1;
                fd4 fd4 = new fd4();
                C2056p0 d = pop.mo9619d(1969517665);
                if (d != null) {
                    Pair<c91, c91> a = C2353x0.m19260a(d);
                    c91 c914 = (c91) a.first;
                    c91 c915 = (c91) a.second;
                    if (c914 != null) {
                        fd4.mo7302b(c914);
                    }
                    c912 = c915;
                    c91 = c914;
                } else {
                    c912 = null;
                    c91 = null;
                }
                C2019o0 c2 = pop.mo9618c(1835365473);
                c91 b = c2 != null ? C2353x0.m19261b(c2) : null;
                List<C2131r1> c3 = C2353x0.m19262c(pop, fd4, -9223372036854775807L, (u74) null, false, z, C1761h1.f7946a);
                rc4 rc4 = j1Var3.f8934q;
                Objects.requireNonNull(rc4);
                int size = c3.size();
                long j3 = -9223372036854775807L;
                long j4 = -9223372036854775807L;
                int i3 = 0;
                int i4 = -1;
                while (true) {
                    j2 = 0;
                    if (i3 >= size) {
                        break;
                    }
                    C2131r1 r1Var = c3.get(i3);
                    if (r1Var.f13442b == 0) {
                        j1Var2 = j1Var3;
                        list = c3;
                        i = size;
                    } else {
                        C2020o1 o1Var = r1Var.f13441a;
                        ArrayList arrayList2 = arrayList;
                        long j5 = o1Var.f11805e;
                        if (j5 == j3) {
                            j5 = r1Var.f13448h;
                        }
                        long max = Math.max(j4, j5);
                        C1798i1 i1Var = new C1798i1(o1Var, r1Var, rc4.mo10270r(i3, o1Var.f11802b));
                        int i5 = r1Var.f13445e;
                        list = c3;
                        bf4 b2 = o1Var.f11806f.mo6004b();
                        b2.mo5835l(i5 + 30);
                        i = size;
                        if (o1Var.f11802b == 2 && j5 > 0 && (i2 = r1Var.f13442b) > 1) {
                            b2.mo5824e(((float) i2) / (((float) j5) / 1000000.0f));
                        }
                        int i6 = o1Var.f11802b;
                        int i7 = C1687f1.f6650b;
                        if (i6 == 1 && fd4.mo7301a()) {
                            b2.mo5820c(fd4.f6805a);
                            b2.mo5822d(fd4.f6806b);
                        }
                        int i8 = o1Var.f11802b;
                        c91[] c91Arr = new c91[2];
                        c91Arr[0] = c912;
                        j1Var2 = this;
                        if (j1Var2.f8924g.isEmpty()) {
                            c = 1;
                            c913 = null;
                        } else {
                            c913 = new c91((List<? extends b81>) j1Var2.f8924g);
                            c = 1;
                        }
                        c91Arr[c] = c913;
                        long j6 = max;
                        c91 c916 = new c91(new b81[0]);
                        if (i8 == 1) {
                            if (c91 != null) {
                                c916 = c91;
                            }
                        } else if (i8 == 2 && b != null) {
                            int i9 = 0;
                            while (true) {
                                if (i9 >= b.mo6086b()) {
                                    break;
                                }
                                b81 c4 = b.mo6087c(i9);
                                if (c4 instanceof C1833j) {
                                    C1833j jVar = (C1833j) c4;
                                    if ("com.android.capture.fps".equals(jVar.f8885f)) {
                                        c916 = new c91(jVar);
                                        break;
                                    }
                                }
                                i9++;
                            }
                        }
                        for (int i10 = 0; i10 < 2; i10++) {
                            c916 = c916.mo6090e(c91Arr[i10]);
                        }
                        if (c916.mo6086b() > 0) {
                            b2.mo5836m(c916);
                        }
                        i1Var.f8485c.mo7873b(b2.mo5848y());
                        if (o1Var.f11802b == 2) {
                            if (i4 == -1) {
                                i4 = arrayList2.size();
                            }
                        }
                        arrayList = arrayList2;
                        arrayList.add(i1Var);
                        j4 = j6;
                    }
                    i3++;
                    j1Var3 = j1Var2;
                    c3 = list;
                    size = i;
                    j3 = -9223372036854775807L;
                }
                j1Var = j1Var3;
                j1Var.f8937t = i4;
                j1Var.f8938u = j4;
                C1798i1[] i1VarArr = (C1798i1[]) arrayList.toArray(new C1798i1[0]);
                j1Var.f8935r = i1VarArr;
                int length = i1VarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i11 = 0; i11 < i1VarArr.length; i11++) {
                    jArr[i11] = new long[i1VarArr[i11].f8484b.f13442b];
                    jArr2[i11] = i1VarArr[i11].f8484b.f13446f[0];
                }
                int i12 = 0;
                while (i12 < i1VarArr.length) {
                    long j7 = Long.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = 0; i14 < i1VarArr.length; i14++) {
                        if (!zArr[i14]) {
                            long j8 = jArr2[i14];
                            if (j8 <= j7) {
                                i13 = i14;
                                j7 = j8;
                            }
                        }
                    }
                    int i15 = iArr[i13];
                    long[] jArr3 = jArr[i13];
                    jArr3[i15] = j2;
                    C2131r1 r1Var2 = i1VarArr[i13].f8484b;
                    j2 += (long) r1Var2.f13444d[i15];
                    int i16 = i15 + 1;
                    iArr[i13] = i16;
                    if (i16 < jArr3.length) {
                        jArr2[i13] = r1Var2.f13446f[i16];
                    } else {
                        zArr[i13] = true;
                        i12++;
                    }
                }
                j1Var.f8936s = jArr;
                rc4.mo10268G();
                rc4.mo10269p(j1Var);
                j1Var.f8922e.clear();
                j1Var.f8925h = 2;
            } else {
                j1Var = j1Var3;
                if (!j1Var.f8922e.isEmpty()) {
                    j1Var.f8922e.peek().mo9620e(pop);
                }
            }
            j1Var3 = j1Var;
        }
        if (j1Var3.f8925h != 2) {
            m11391m();
        }
    }

    /* renamed from: b */
    public final long mo5810b() {
        return this.f8938u;
    }

    /* renamed from: c */
    public final boolean mo5040c(pc4 pc4) {
        return C1983n1.m13589b(pc4, false);
    }

    /* renamed from: d */
    public final nd4 mo5811d(long j) {
        long j2;
        long j3;
        int b;
        C1798i1[] i1VarArr = this.f8935r;
        Objects.requireNonNull(i1VarArr);
        if (i1VarArr.length == 0) {
            qd4 qd4 = qd4.f13140c;
            return new nd4(qd4, qd4);
        }
        int i = this.f8937t;
        long j4 = -1;
        if (i != -1) {
            C2131r1 r1Var = i1VarArr[i].f8484b;
            int k = m11389k(r1Var, j);
            if (k == -1) {
                qd4 qd42 = qd4.f13140c;
                return new nd4(qd42, qd42);
            }
            long j5 = r1Var.f13446f[k];
            j2 = r1Var.f13443c[k];
            if (j5 >= j || k >= r1Var.f13442b - 1 || (b = r1Var.mo10448b(j)) == -1 || b == k) {
                j3 = -9223372036854775807L;
            } else {
                j3 = r1Var.f13446f[b];
                j4 = r1Var.f13443c[b];
            }
            j = j5;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            C1798i1[] i1VarArr2 = this.f8935r;
            if (i2 >= i1VarArr2.length) {
                break;
            }
            if (i2 != this.f8937t) {
                C2131r1 r1Var2 = i1VarArr2[i2].f8484b;
                long l = m11390l(r1Var2, j, j2);
                if (j3 != -9223372036854775807L) {
                    j4 = m11390l(r1Var2, j3, j4);
                }
                j2 = l;
            }
            i2++;
        }
        qd4 qd43 = new qd4(j, j2);
        return j3 == -9223372036854775807L ? new nd4(qd43, qd43) : new nd4(qd43, new qd4(j3, j4));
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03d9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0089 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0084  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo5042e(com.google.android.gms.internal.ads.pc4 r33, com.google.android.gms.internal.ads.md4 r34) {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            r2 = r34
        L_0x0006:
            int r3 = r0.f8925h
            r5 = 1718909296(0x66747970, float:2.8862439E23)
            r6 = 0
            r8 = -1
            r9 = 8
            r10 = 1
            if (r3 == 0) goto L_0x0234
            r13 = 262144(0x40000, double:1.295163E-318)
            if (r3 == r10) goto L_0x01b8
            long r16 = r33.mo6908b()
            int r3 = r0.f8930m
            if (r3 != r8) goto L_0x00a4
            r18 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5 = r8
            r27 = r5
            r9 = r10
            r24 = r9
            r20 = r18
            r22 = r20
            r25 = r22
            r3 = 0
        L_0x0032:
            com.google.android.gms.internal.ads.i1[] r4 = r0.f8935r
            java.lang.Object r4 = com.google.android.gms.internal.ads.n13.m13626c(r4)
            com.google.android.gms.internal.ads.i1[] r4 = (com.google.android.gms.internal.ads.C1798i1[]) r4
            int r4 = r4.length
            if (r3 >= r4) goto L_0x008c
            com.google.android.gms.internal.ads.i1[] r4 = r0.f8935r
            r4 = r4[r3]
            int r15 = r4.f8486d
            com.google.android.gms.internal.ads.r1 r4 = r4.f8484b
            int r12 = r4.f13442b
            if (r15 != r12) goto L_0x004a
            goto L_0x0089
        L_0x004a:
            long[] r4 = r4.f13443c
            r28 = r4[r15]
            long[][] r4 = r0.f8936s
            java.lang.Object r4 = com.google.android.gms.internal.ads.n13.m13626c(r4)
            long[][] r4 = (long[][]) r4
            r4 = r4[r3]
            r30 = r4[r15]
            long r28 = r28 - r16
            int r4 = (r28 > r6 ? 1 : (r28 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x0067
            int r4 = (r28 > r13 ? 1 : (r28 == r13 ? 0 : -1))
            if (r4 < 0) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r4 = 0
            goto L_0x0068
        L_0x0067:
            r4 = r10
        L_0x0068:
            if (r4 != 0) goto L_0x006e
            if (r24 != 0) goto L_0x0076
            r12 = 0
            goto L_0x0070
        L_0x006e:
            r12 = r24
        L_0x0070:
            if (r4 != r12) goto L_0x007e
            int r15 = (r28 > r22 ? 1 : (r28 == r22 ? 0 : -1))
            if (r15 >= 0) goto L_0x007e
        L_0x0076:
            r5 = r3
            r24 = r4
            r22 = r28
            r25 = r30
            goto L_0x0080
        L_0x007e:
            r24 = r12
        L_0x0080:
            int r12 = (r30 > r20 ? 1 : (r30 == r20 ? 0 : -1))
            if (r12 >= 0) goto L_0x0089
            r27 = r3
            r9 = r4
            r20 = r30
        L_0x0089:
            int r3 = r3 + 1
            goto L_0x0032
        L_0x008c:
            int r3 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r3 == 0) goto L_0x009e
            if (r9 == 0) goto L_0x009e
            r3 = 10485760(0xa00000, double:5.180654E-317)
            long r20 = r20 + r3
            int r3 = (r25 > r20 ? 1 : (r25 == r20 ? 0 : -1))
            if (r3 >= 0) goto L_0x009c
            goto L_0x009e
        L_0x009c:
            r5 = r27
        L_0x009e:
            r0.f8930m = r5
            if (r5 != r8) goto L_0x00a4
            goto L_0x01b7
        L_0x00a4:
            com.google.android.gms.internal.ads.i1[] r3 = r0.f8935r
            java.lang.Object r3 = com.google.android.gms.internal.ads.n13.m13626c(r3)
            com.google.android.gms.internal.ads.i1[] r3 = (com.google.android.gms.internal.ads.C1798i1[]) r3
            int r4 = r0.f8930m
            r3 = r3[r4]
            com.google.android.gms.internal.ads.td4 r4 = r3.f8485c
            int r5 = r3.f8486d
            com.google.android.gms.internal.ads.r1 r9 = r3.f8484b
            long[] r12 = r9.f13443c
            r11 = r12[r5]
            int[] r9 = r9.f13444d
            r9 = r9[r5]
            long r16 = r11 - r16
            int r15 = r0.f8931n
            r19 = r9
            long r8 = (long) r15
            long r16 = r16 + r8
            int r6 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x01b4
            int r6 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r6 < 0) goto L_0x00d1
            goto L_0x01b4
        L_0x00d1:
            com.google.android.gms.internal.ads.o1 r2 = r3.f8483a
            int r2 = r2.f11807g
            if (r2 != r10) goto L_0x00e0
            r6 = 8
            long r16 = r16 + r6
            int r9 = r19 + -8
            r6 = r16
            goto L_0x00e4
        L_0x00e0:
            r6 = r16
            r9 = r19
        L_0x00e4:
            int r2 = (int) r6
            r1.mo6915l(r2)
            com.google.android.gms.internal.ads.o1 r2 = r3.f8483a
            int r6 = r2.f11810j
            if (r6 == 0) goto L_0x0151
            com.google.android.gms.internal.ads.dr2 r2 = r0.f8919b
            byte[] r2 = r2.mo6582h()
            r6 = 0
            r2[r6] = r6
            r2[r10] = r6
            r7 = 2
            r2[r7] = r6
            com.google.android.gms.internal.ads.o1 r6 = r3.f8483a
            int r6 = r6.f11810j
            int r7 = 4 - r6
        L_0x0102:
            int r8 = r0.f8932o
            if (r8 >= r9) goto L_0x018e
            int r8 = r0.f8933p
            if (r8 != 0) goto L_0x013c
            r1.mo6911e(r2, r7, r6)
            int r8 = r0.f8931n
            int r8 = r8 + r6
            r0.f8931n = r8
            com.google.android.gms.internal.ads.dr2 r8 = r0.f8919b
            r11 = 0
            r8.mo6580f(r11)
            com.google.android.gms.internal.ads.dr2 r8 = r0.f8919b
            int r8 = r8.mo6587m()
            if (r8 < 0) goto L_0x0134
            r0.f8933p = r8
            com.google.android.gms.internal.ads.dr2 r8 = r0.f8918a
            r8.mo6580f(r11)
            com.google.android.gms.internal.ads.dr2 r8 = r0.f8918a
            r12 = 4
            com.google.android.gms.internal.ads.rd4.m16162b(r4, r8, r12)
            int r8 = r0.f8932o
            int r8 = r8 + r12
            r0.f8932o = r8
            int r9 = r9 + r7
            goto L_0x0102
        L_0x0134:
            java.lang.String r1 = "Invalid NAL length"
            r2 = 0
            com.google.android.gms.internal.ads.dz r1 = com.google.android.gms.internal.ads.C1646dz.m8223a(r1, r2)
            throw r1
        L_0x013c:
            r11 = 0
            int r8 = com.google.android.gms.internal.ads.rd4.m16161a(r4, r1, r8, r11)
            int r11 = r0.f8931n
            int r11 = r11 + r8
            r0.f8931n = r11
            int r11 = r0.f8932o
            int r11 = r11 + r8
            r0.f8932o = r11
            int r11 = r0.f8933p
            int r11 = r11 - r8
            r0.f8933p = r11
            goto L_0x0102
        L_0x0151:
            com.google.android.gms.internal.ads.c0 r2 = r2.f11806f
            java.lang.String r2 = r2.f5234l
            java.lang.String r6 = "audio/ac4"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x0173
            int r2 = r0.f8932o
            if (r2 != 0) goto L_0x0171
            com.google.android.gms.internal.ads.dr2 r2 = r0.f8920c
            com.google.android.gms.internal.ads.wb4.m18954b(r9, r2)
            com.google.android.gms.internal.ads.dr2 r2 = r0.f8920c
            r6 = 7
            com.google.android.gms.internal.ads.rd4.m16162b(r4, r2, r6)
            int r2 = r0.f8932o
            int r2 = r2 + r6
            r0.f8932o = r2
        L_0x0171:
            int r9 = r9 + 7
        L_0x0173:
            int r2 = r0.f8932o
            if (r2 >= r9) goto L_0x018e
            int r2 = r9 - r2
            r6 = 0
            int r2 = com.google.android.gms.internal.ads.rd4.m16161a(r4, r1, r2, r6)
            int r6 = r0.f8931n
            int r6 = r6 + r2
            r0.f8931n = r6
            int r6 = r0.f8932o
            int r6 = r6 + r2
            r0.f8932o = r6
            int r6 = r0.f8933p
            int r6 = r6 - r2
            r0.f8933p = r6
            goto L_0x0173
        L_0x018e:
            r22 = r9
            com.google.android.gms.internal.ads.r1 r1 = r3.f8484b
            long[] r2 = r1.f13446f
            r19 = r2[r5]
            int[] r1 = r1.f13447g
            r21 = r1[r5]
            r23 = 0
            r24 = 0
            r18 = r4
            r18.mo7872a(r19, r21, r22, r23, r24)
            int r1 = r3.f8486d
            int r1 = r1 + r10
            r3.f8486d = r1
            r1 = -1
            r0.f8930m = r1
            r1 = 0
            r0.f8931n = r1
            r0.f8932o = r1
            r0.f8933p = r1
            r8 = 0
            goto L_0x01b7
        L_0x01b4:
            r2.f10817a = r11
            r8 = r10
        L_0x01b7:
            return r8
        L_0x01b8:
            long r3 = r0.f8927j
            int r6 = r0.f8928k
            long r6 = (long) r6
            long r3 = r3 - r6
            long r6 = r33.mo6908b()
            long r6 = r6 + r3
            com.google.android.gms.internal.ads.dr2 r8 = r0.f8929l
            if (r8 == 0) goto L_0x0217
            byte[] r11 = r8.mo6582h()
            int r12 = r0.f8928k
            int r3 = (int) r3
            r1.mo6911e(r11, r12, r3)
            int r3 = r0.f8926i
            if (r3 != r5) goto L_0x01fc
            r8.mo6580f(r9)
            int r3 = r8.mo6587m()
            int r3 = m11388j(r3)
            if (r3 == 0) goto L_0x01e3
            goto L_0x01f9
        L_0x01e3:
            r3 = 4
            r8.mo6581g(r3)
        L_0x01e7:
            int r3 = r8.mo6583i()
            if (r3 <= 0) goto L_0x01f8
            int r3 = r8.mo6587m()
            int r3 = m11388j(r3)
            if (r3 == 0) goto L_0x01e7
            goto L_0x01f9
        L_0x01f8:
            r3 = 0
        L_0x01f9:
            r0.f8939v = r3
            goto L_0x021f
        L_0x01fc:
            java.util.ArrayDeque<com.google.android.gms.internal.ads.o0> r3 = r0.f8922e
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x021f
            java.util.ArrayDeque<com.google.android.gms.internal.ads.o0> r3 = r0.f8922e
            java.lang.Object r3 = r3.peek()
            com.google.android.gms.internal.ads.o0 r3 = (com.google.android.gms.internal.ads.C2019o0) r3
            com.google.android.gms.internal.ads.p0 r4 = new com.google.android.gms.internal.ads.p0
            int r5 = r0.f8926i
            r4.<init>(r5, r8)
            r3.mo9621f(r4)
            goto L_0x021f
        L_0x0217:
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x0221
            int r3 = (int) r3
            r1.mo6915l(r3)
        L_0x021f:
            r11 = 0
            goto L_0x0229
        L_0x0221:
            long r8 = r33.mo6908b()
            long r8 = r8 + r3
            r2.f10817a = r8
            r11 = r10
        L_0x0229:
            r0.m11392n(r6)
            if (r11 == 0) goto L_0x0006
            int r3 = r0.f8925h
            r4 = 2
            if (r3 == r4) goto L_0x0006
            return r10
        L_0x0234:
            int r3 = r0.f8928k
            if (r3 != 0) goto L_0x025e
            com.google.android.gms.internal.ads.dr2 r3 = r0.f8921d
            byte[] r3 = r3.mo6582h()
            r4 = 0
            boolean r3 = r1.mo6916m(r3, r4, r9, r10)
            if (r3 != 0) goto L_0x0247
            r3 = -1
            return r3
        L_0x0247:
            r0.f8928k = r9
            com.google.android.gms.internal.ads.dr2 r3 = r0.f8921d
            r3.mo6580f(r4)
            com.google.android.gms.internal.ads.dr2 r3 = r0.f8921d
            long r3 = r3.mo6567A()
            r0.f8927j = r3
            com.google.android.gms.internal.ads.dr2 r3 = r0.f8921d
            int r3 = r3.mo6587m()
            r0.f8926i = r3
        L_0x025e:
            long r3 = r0.f8927j
            r11 = 1
            int r8 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r8 != 0) goto L_0x027d
            com.google.android.gms.internal.ads.dr2 r3 = r0.f8921d
            byte[] r3 = r3.mo6582h()
            r1.mo6911e(r3, r9, r9)
            int r3 = r0.f8928k
            int r3 = r3 + r9
            r0.f8928k = r3
            com.google.android.gms.internal.ads.dr2 r3 = r0.f8921d
            long r3 = r3.mo6568B()
        L_0x027a:
            r0.f8927j = r3
            goto L_0x02a5
        L_0x027d:
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x02a5
            long r3 = r33.mo6909c()
            r6 = -1
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0297
            java.util.ArrayDeque<com.google.android.gms.internal.ads.o0> r8 = r0.f8922e
            java.lang.Object r8 = r8.peek()
            com.google.android.gms.internal.ads.o0 r8 = (com.google.android.gms.internal.ads.C2019o0) r8
            if (r8 == 0) goto L_0x0297
            long r3 = r8.f11786b
        L_0x0297:
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x02a5
            long r6 = r33.mo6908b()
            long r3 = r3 - r6
            int r6 = r0.f8928k
            long r6 = (long) r6
            long r3 = r3 + r6
            goto L_0x027a
        L_0x02a5:
            long r3 = r0.f8927j
            int r6 = r0.f8928k
            long r7 = (long) r6
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x03d9
            int r3 = r0.f8926i
            r4 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r7 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r3 == r4) goto L_0x0387
            r4 = 1953653099(0x7472616b, float:7.681346E31)
            if (r3 == r4) goto L_0x0387
            r4 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r3 == r4) goto L_0x0387
            r4 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r3 == r4) goto L_0x0387
            r4 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r3 == r4) goto L_0x0387
            r4 = 1701082227(0x65647473, float:6.742798E22)
            if (r3 == r4) goto L_0x0387
            if (r3 != r7) goto L_0x02d5
            goto L_0x0387
        L_0x02d5:
            r4 = 1835296868(0x6d646864, float:4.418049E27)
            if (r3 == r4) goto L_0x0354
            r4 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r3 == r4) goto L_0x0354
            r4 = 1751411826(0x68646c72, float:4.3148E24)
            if (r3 == r4) goto L_0x0354
            r4 = 1937011556(0x73747364, float:1.9367383E31)
            if (r3 == r4) goto L_0x0354
            r4 = 1937011827(0x73747473, float:1.9367711E31)
            if (r3 == r4) goto L_0x0354
            r4 = 1937011571(0x73747373, float:1.9367401E31)
            if (r3 == r4) goto L_0x0354
            r4 = 1668576371(0x63747473, float:4.5093966E21)
            if (r3 == r4) goto L_0x0354
            r4 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r3 == r4) goto L_0x0354
            r4 = 1937011555(0x73747363, float:1.9367382E31)
            if (r3 == r4) goto L_0x0354
            r4 = 1937011578(0x7374737a, float:1.936741E31)
            if (r3 == r4) goto L_0x0354
            r4 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r3 == r4) goto L_0x0354
            r4 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r3 == r4) goto L_0x0354
            r4 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r3 == r4) goto L_0x0354
            r4 = 1953196132(0x746b6864, float:7.46037E31)
            if (r3 == r4) goto L_0x0354
            if (r3 == r5) goto L_0x0354
            r4 = 1969517665(0x75647461, float:2.8960062E32)
            if (r3 == r4) goto L_0x0354
            r4 = 1801812339(0x6b657973, float:2.7741754E26)
            if (r3 == r4) goto L_0x0354
            r4 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r3 != r4) goto L_0x032d
            goto L_0x0354
        L_0x032d:
            long r3 = r33.mo6908b()
            int r5 = r0.f8928k
            long r5 = (long) r5
            long r14 = r3 - r5
            int r3 = r0.f8926i
            r4 = 1836086884(0x6d707664, float:4.6512205E27)
            if (r3 != r4) goto L_0x0352
            com.google.android.gms.internal.ads.m r3 = new com.google.android.gms.internal.ads.m
            r12 = 0
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r18 = r14 + r5
            long r7 = r0.f8927j
            long r20 = r7 - r5
            r11 = r3
            r11.<init>(r12, r14, r16, r18, r20)
            r0.f8940w = r3
        L_0x0352:
            r3 = 0
            goto L_0x0381
        L_0x0354:
            if (r6 != r9) goto L_0x0358
            r3 = r10
            goto L_0x0359
        L_0x0358:
            r3 = 0
        L_0x0359:
            com.google.android.gms.internal.ads.wu1.m19207f(r3)
            long r3 = r0.f8927j
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x0367
            r3 = r10
            goto L_0x0368
        L_0x0367:
            r3 = 0
        L_0x0368:
            com.google.android.gms.internal.ads.wu1.m19207f(r3)
            com.google.android.gms.internal.ads.dr2 r3 = new com.google.android.gms.internal.ads.dr2
            long r4 = r0.f8927j
            int r4 = (int) r4
            r3.<init>((int) r4)
            com.google.android.gms.internal.ads.dr2 r4 = r0.f8921d
            byte[] r4 = r4.mo6582h()
            byte[] r5 = r3.mo6582h()
            r6 = 0
            java.lang.System.arraycopy(r4, r6, r5, r6, r9)
        L_0x0381:
            r0.f8929l = r3
            r0.f8925h = r10
            goto L_0x0006
        L_0x0387:
            long r3 = r33.mo6908b()
            long r5 = r0.f8927j
            int r8 = r0.f8928k
            long r10 = (long) r8
            long r3 = r3 + r5
            long r3 = r3 - r10
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x03ba
            int r5 = r0.f8926i
            if (r5 != r7) goto L_0x03ba
            com.google.android.gms.internal.ads.dr2 r5 = r0.f8920c
            r5.mo6577c(r9)
            com.google.android.gms.internal.ads.dr2 r5 = r0.f8920c
            byte[] r5 = r5.mo6582h()
            r6 = 0
            r1.mo6912f(r5, r6, r9)
            com.google.android.gms.internal.ads.dr2 r5 = r0.f8920c
            com.google.android.gms.internal.ads.C2353x0.m19263d(r5)
            com.google.android.gms.internal.ads.dr2 r5 = r0.f8920c
            int r5 = r5.mo6585k()
            r1.mo6915l(r5)
            r33.mo6914i()
        L_0x03ba:
            java.util.ArrayDeque<com.google.android.gms.internal.ads.o0> r5 = r0.f8922e
            com.google.android.gms.internal.ads.o0 r6 = new com.google.android.gms.internal.ads.o0
            int r7 = r0.f8926i
            r6.<init>(r7, r3)
            r5.push(r6)
            long r5 = r0.f8927j
            int r7 = r0.f8928k
            long r7 = (long) r7
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x03d4
            r0.m11392n(r3)
            goto L_0x0006
        L_0x03d4:
            r32.m11391m()
            goto L_0x0006
        L_0x03d9:
            java.lang.String r1 = "Atom size less than header length (unsupported)."
            com.google.android.gms.internal.ads.dz r1 = com.google.android.gms.internal.ads.C1646dz.m8225c(r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1835j1.mo5042e(com.google.android.gms.internal.ads.pc4, com.google.android.gms.internal.ads.md4):int");
    }

    /* renamed from: f */
    public final boolean mo5812f() {
        return true;
    }

    /* renamed from: g */
    public final void mo5044g(rc4 rc4) {
        this.f8934q = rc4;
    }

    /* renamed from: h */
    public final void mo5045h(long j, long j2) {
        this.f8922e.clear();
        this.f8928k = 0;
        this.f8930m = -1;
        this.f8931n = 0;
        this.f8932o = 0;
        this.f8933p = 0;
        if (j == 0) {
            m11391m();
            return;
        }
        C1798i1[] i1VarArr = this.f8935r;
        if (i1VarArr != null) {
            for (C1798i1 i1Var : i1VarArr) {
                C2131r1 r1Var = i1Var.f8484b;
                int a = r1Var.mo10447a(j2);
                if (a == -1) {
                    a = r1Var.mo10448b(j2);
                }
                i1Var.f8486d = a;
            }
        }
    }
}
