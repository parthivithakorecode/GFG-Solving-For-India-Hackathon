package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.e1 */
public final class C1649e1 implements oc4 {

    /* renamed from: E */
    public static final vc4 f6018E = C2427z0.f17960b;

    /* renamed from: F */
    private static final byte[] f6019F = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: G */
    private static final C1574c0 f6020G;

    /* renamed from: A */
    private rc4 f6021A;

    /* renamed from: B */
    private td4[] f6022B;

    /* renamed from: C */
    private td4[] f6023C;

    /* renamed from: D */
    private boolean f6024D;

    /* renamed from: a */
    private final List<C1574c0> f6025a = Collections.unmodifiableList(Collections.emptyList());

    /* renamed from: b */
    private final SparseArray<C1575c1> f6026b;

    /* renamed from: c */
    private final dr2 f6027c = new dr2(th2.f14860a);

    /* renamed from: d */
    private final dr2 f6028d = new dr2(5);

    /* renamed from: e */
    private final dr2 f6029e = new dr2();

    /* renamed from: f */
    private final byte[] f6030f;

    /* renamed from: g */
    private final dr2 f6031g;

    /* renamed from: h */
    private final ye4 f6032h = new ye4();

    /* renamed from: i */
    private final dr2 f6033i = new dr2(16);

    /* renamed from: j */
    private final ArrayDeque<C2019o0> f6034j;

    /* renamed from: k */
    private final ArrayDeque<C1538b1> f6035k;

    /* renamed from: l */
    private int f6036l;

    /* renamed from: m */
    private int f6037m;

    /* renamed from: n */
    private long f6038n;

    /* renamed from: o */
    private int f6039o;

    /* renamed from: p */
    private dr2 f6040p;

    /* renamed from: q */
    private long f6041q;

    /* renamed from: r */
    private int f6042r;

    /* renamed from: s */
    private long f6043s;

    /* renamed from: t */
    private long f6044t;

    /* renamed from: u */
    private long f6045u;

    /* renamed from: v */
    private C1575c1 f6046v;

    /* renamed from: w */
    private int f6047w;

    /* renamed from: x */
    private int f6048x;

    /* renamed from: y */
    private int f6049y;

    /* renamed from: z */
    private boolean f6050z;

    static {
        bf4 bf4 = new bf4();
        bf4.mo5842s("application/x-emsg");
        f6020G = bf4.mo5848y();
    }

    public C1649e1(int i, ky2 ky2) {
        byte[] bArr = new byte[16];
        this.f6030f = bArr;
        this.f6031g = new dr2(bArr);
        this.f6034j = new ArrayDeque<>();
        this.f6035k = new ArrayDeque<>();
        this.f6026b = new SparseArray<>();
        this.f6044t = -9223372036854775807L;
        this.f6043s = -9223372036854775807L;
        this.f6045u = -9223372036854775807L;
        this.f6021A = rc4.f13589d;
        this.f6022B = new td4[0];
        this.f6023C = new td4[0];
    }

    /* renamed from: a */
    private static int m8251a(int i) {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unexpected negative value: ");
        sb.append(i);
        throw C1646dz.m8223a(sb.toString(), (Throwable) null);
    }

    /* renamed from: b */
    private static u74 m8252b(List<C2056p0> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C2056p0 p0Var = list.get(i);
            if (p0Var.f12974a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] h = p0Var.f12391b.mo6582h();
                UUID a = C1909l1.m12497a(h);
                if (a == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new u64(a, (String) null, "video/mp4", h));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new u74((List<u64>) arrayList);
    }

    /* renamed from: d */
    private final void m8253d() {
        this.f6036l = 0;
        this.f6039o = 0;
    }

    /* renamed from: f */
    private static void m8254f(dr2 dr2, int i, C2094q1 q1Var) {
        dr2.mo6580f(i + 8);
        int m = dr2.mo6587m() & 16777215;
        if ((m & 1) == 0) {
            boolean z = (m & 2) != 0;
            int v = dr2.mo6596v();
            if (v == 0) {
                Arrays.fill(q1Var.f13007m, 0, q1Var.f12999e, false);
                return;
            }
            int i2 = q1Var.f12999e;
            if (v == i2) {
                Arrays.fill(q1Var.f13007m, 0, v, z);
                q1Var.mo10229b(dr2.mo6583i());
                dr2.mo6576b(q1Var.f13009o.mo6582h(), 0, q1Var.f13009o.mo6586l());
                q1Var.f13009o.mo6580f(0);
                q1Var.f13010p = false;
                return;
            }
            StringBuilder sb = new StringBuilder(80);
            sb.append("Senc sample count ");
            sb.append(v);
            sb.append(" is different from fragment sample count");
            sb.append(i2);
            throw C1646dz.m8223a(sb.toString(), (Throwable) null);
        }
        throw C1646dz.m8225c("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x032a  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m8255i(long r48) {
        /*
            r47 = this;
            r0 = r47
        L_0x0002:
            java.util.ArrayDeque<com.google.android.gms.internal.ads.o0> r1 = r0.f6034j
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x06fe
            java.util.ArrayDeque<com.google.android.gms.internal.ads.o0> r1 = r0.f6034j
            java.lang.Object r1 = r1.peek()
            com.google.android.gms.internal.ads.o0 r1 = (com.google.android.gms.internal.ads.C2019o0) r1
            long r1 = r1.f11786b
            int r1 = (r1 > r48 ? 1 : (r1 == r48 ? 0 : -1))
            if (r1 != 0) goto L_0x06fe
            java.util.ArrayDeque<com.google.android.gms.internal.ads.o0> r1 = r0.f6034j
            java.lang.Object r1 = r1.pop()
            r2 = r1
            com.google.android.gms.internal.ads.o0 r2 = (com.google.android.gms.internal.ads.C2019o0) r2
            int r1 = r2.f12974a
            r3 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r6 = 12
            r7 = 8
            if (r1 != r3) goto L_0x013d
            java.util.List<com.google.android.gms.internal.ads.p0> r1 = r2.f11787c
            com.google.android.gms.internal.ads.u74 r1 = m8252b(r1)
            r3 = 1836475768(0x6d766578, float:4.7659988E27)
            com.google.android.gms.internal.ads.o0 r3 = r2.mo9618c(r3)
            java.util.Objects.requireNonNull(r3)
            android.util.SparseArray r12 = new android.util.SparseArray
            r12.<init>()
            java.util.List<com.google.android.gms.internal.ads.p0> r8 = r3.f11787c
            int r8 = r8.size()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 0
        L_0x004d:
            if (r9 >= r8) goto L_0x00b8
            java.util.List<com.google.android.gms.internal.ads.p0> r13 = r3.f11787c
            java.lang.Object r13 = r13.get(r9)
            com.google.android.gms.internal.ads.p0 r13 = (com.google.android.gms.internal.ads.C2056p0) r13
            int r14 = r13.f12974a
            r15 = 1953654136(0x74726578, float:7.6818474E31)
            if (r14 != r15) goto L_0x0096
            com.google.android.gms.internal.ads.dr2 r13 = r13.f12391b
            r13.mo6580f(r6)
            int r14 = r13.mo6587m()
            int r15 = r13.mo6587m()
            int r10 = r13.mo6587m()
            int r6 = r13.mo6587m()
            int r13 = r13.mo6587m()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            com.google.android.gms.internal.ads.y0 r11 = new com.google.android.gms.internal.ads.y0
            int r15 = r15 + -1
            r11.<init>(r15, r10, r6, r13)
            android.util.Pair r6 = android.util.Pair.create(r14, r11)
            java.lang.Object r10 = r6.first
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            java.lang.Object r6 = r6.second
            com.google.android.gms.internal.ads.y0 r6 = (com.google.android.gms.internal.ads.C2390y0) r6
            r12.put(r10, r6)
            goto L_0x00b3
        L_0x0096:
            r6 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r14 != r6) goto L_0x00b3
            com.google.android.gms.internal.ads.dr2 r4 = r13.f12391b
            r4.mo6580f(r7)
            int r5 = r4.mo6587m()
            int r5 = com.google.android.gms.internal.ads.C2093q0.m15345a(r5)
            if (r5 != 0) goto L_0x00af
            long r4 = r4.mo6567A()
            goto L_0x00b3
        L_0x00af:
            long r4 = r4.mo6568B()
        L_0x00b3:
            int r9 = r9 + 1
            r6 = 12
            goto L_0x004d
        L_0x00b8:
            com.google.android.gms.internal.ads.fd4 r3 = new com.google.android.gms.internal.ads.fd4
            r3.<init>()
            com.google.android.gms.internal.ads.a1 r9 = new com.google.android.gms.internal.ads.a1
            r9.<init>(r0)
            r7 = 0
            r8 = 0
            r6 = r1
            java.util.List r1 = com.google.android.gms.internal.ads.C2353x0.m19262c(r2, r3, r4, r6, r7, r8, r9)
            int r2 = r1.size()
            android.util.SparseArray<com.google.android.gms.internal.ads.c1> r3 = r0.f6026b
            int r3 = r3.size()
            if (r3 != 0) goto L_0x010e
            r10 = 0
        L_0x00d6:
            if (r10 >= r2) goto L_0x0107
            java.lang.Object r3 = r1.get(r10)
            com.google.android.gms.internal.ads.r1 r3 = (com.google.android.gms.internal.ads.C2131r1) r3
            com.google.android.gms.internal.ads.o1 r4 = r3.f13441a
            com.google.android.gms.internal.ads.c1 r5 = new com.google.android.gms.internal.ads.c1
            com.google.android.gms.internal.ads.rc4 r6 = r0.f6021A
            int r7 = r4.f11802b
            com.google.android.gms.internal.ads.td4 r6 = r6.mo10270r(r10, r7)
            int r7 = r4.f11801a
            com.google.android.gms.internal.ads.y0 r7 = m8256j(r12, r7)
            r5.<init>(r6, r3, r7)
            android.util.SparseArray<com.google.android.gms.internal.ads.c1> r3 = r0.f6026b
            int r6 = r4.f11801a
            r3.put(r6, r5)
            long r5 = r0.f6044t
            long r3 = r4.f11805e
            long r3 = java.lang.Math.max(r5, r3)
            r0.f6044t = r3
            int r10 = r10 + 1
            goto L_0x00d6
        L_0x0107:
            com.google.android.gms.internal.ads.rc4 r1 = r0.f6021A
            r1.mo10268G()
            goto L_0x0002
        L_0x010e:
            android.util.SparseArray<com.google.android.gms.internal.ads.c1> r3 = r0.f6026b
            int r3 = r3.size()
            if (r3 != r2) goto L_0x0118
            r11 = 1
            goto L_0x0119
        L_0x0118:
            r11 = 0
        L_0x0119:
            com.google.android.gms.internal.ads.wu1.m19207f(r11)
            r10 = 0
        L_0x011d:
            if (r10 >= r2) goto L_0x0002
            java.lang.Object r3 = r1.get(r10)
            com.google.android.gms.internal.ads.r1 r3 = (com.google.android.gms.internal.ads.C2131r1) r3
            com.google.android.gms.internal.ads.o1 r4 = r3.f13441a
            android.util.SparseArray<com.google.android.gms.internal.ads.c1> r5 = r0.f6026b
            int r6 = r4.f11801a
            java.lang.Object r5 = r5.get(r6)
            com.google.android.gms.internal.ads.c1 r5 = (com.google.android.gms.internal.ads.C1575c1) r5
            int r4 = r4.f11801a
            com.google.android.gms.internal.ads.y0 r4 = m8256j(r12, r4)
            r5.mo6022h(r3, r4)
            int r10 = r10 + 1
            goto L_0x011d
        L_0x013d:
            r3 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r1 != r3) goto L_0x06e6
            android.util.SparseArray<com.google.android.gms.internal.ads.c1> r1 = r0.f6026b
            byte[] r3 = r0.f6030f
            java.util.List<com.google.android.gms.internal.ads.o0> r6 = r2.f11788d
            int r6 = r6.size()
            r8 = 0
        L_0x014d:
            if (r8 >= r6) goto L_0x064f
            java.util.List<com.google.android.gms.internal.ads.o0> r10 = r2.f11788d
            java.lang.Object r10 = r10.get(r8)
            com.google.android.gms.internal.ads.o0 r10 = (com.google.android.gms.internal.ads.C2019o0) r10
            int r11 = r10.f12974a
            r12 = 1953653094(0x74726166, float:7.6813435E31)
            if (r11 != r12) goto L_0x0632
            r11 = 1952868452(0x74666864, float:7.301914E31)
            com.google.android.gms.internal.ads.p0 r11 = r10.mo9619d(r11)
            java.util.Objects.requireNonNull(r11)
            com.google.android.gms.internal.ads.dr2 r11 = r11.f12391b
            r11.mo6580f(r7)
            int r12 = r11.mo6587m()
            r13 = 16777215(0xffffff, float:2.3509886E-38)
            r12 = r12 & r13
            int r14 = r11.mo6587m()
            java.lang.Object r14 = r1.get(r14)
            com.google.android.gms.internal.ads.c1 r14 = (com.google.android.gms.internal.ads.C1575c1) r14
            if (r14 != 0) goto L_0x0183
            r14 = 0
            goto L_0x01cc
        L_0x0183:
            r15 = r12 & 1
            if (r15 == 0) goto L_0x0191
            long r4 = r11.mo6568B()
            com.google.android.gms.internal.ads.q1 r15 = r14.f5253b
            r15.f12996b = r4
            r15.f12997c = r4
        L_0x0191:
            com.google.android.gms.internal.ads.y0 r4 = r14.f5256e
            r5 = r12 & 2
            if (r5 == 0) goto L_0x019e
            int r5 = r11.mo6587m()
            int r5 = r5 + -1
            goto L_0x01a0
        L_0x019e:
            int r5 = r4.f17527a
        L_0x01a0:
            r15 = r12 & 8
            if (r15 == 0) goto L_0x01a9
            int r15 = r11.mo6587m()
            goto L_0x01ab
        L_0x01a9:
            int r15 = r4.f17528b
        L_0x01ab:
            r16 = r12 & 16
            if (r16 == 0) goto L_0x01b6
            int r16 = r11.mo6587m()
            r9 = r16
            goto L_0x01b8
        L_0x01b6:
            int r9 = r4.f17529c
        L_0x01b8:
            r12 = r12 & 32
            if (r12 == 0) goto L_0x01c1
            int r4 = r11.mo6587m()
            goto L_0x01c3
        L_0x01c1:
            int r4 = r4.f17530d
        L_0x01c3:
            com.google.android.gms.internal.ads.q1 r11 = r14.f5253b
            com.google.android.gms.internal.ads.y0 r12 = new com.google.android.gms.internal.ads.y0
            r12.<init>(r5, r15, r9, r4)
            r11.f12995a = r12
        L_0x01cc:
            if (r14 != 0) goto L_0x01d0
            goto L_0x0632
        L_0x01d0:
            com.google.android.gms.internal.ads.q1 r4 = r14.f5253b
            long r11 = r4.f13011q
            boolean r5 = r4.f13012r
            r14.mo6023i()
            r9 = 1
            r14.f5263l = true
            r15 = 1952867444(0x74666474, float:7.3014264E31)
            com.google.android.gms.internal.ads.p0 r15 = r10.mo9619d(r15)
            if (r15 == 0) goto L_0x0203
            com.google.android.gms.internal.ads.dr2 r5 = r15.f12391b
            r5.mo6580f(r7)
            int r11 = r5.mo6587m()
            int r11 = com.google.android.gms.internal.ads.C2093q0.m15345a(r11)
            if (r11 != r9) goto L_0x01fa
            long r11 = r5.mo6568B()
            goto L_0x01fe
        L_0x01fa:
            long r11 = r5.mo6567A()
        L_0x01fe:
            r4.f13011q = r11
            r4.f13012r = r9
            goto L_0x0207
        L_0x0203:
            r4.f13011q = r11
            r4.f13012r = r5
        L_0x0207:
            java.util.List<com.google.android.gms.internal.ads.p0> r5 = r10.f11787c
            int r9 = r5.size()
            r11 = 0
            r12 = 0
            r15 = 0
        L_0x0210:
            r13 = 1953658222(0x7472756e, float:7.683823E31)
            if (r11 >= r9) goto L_0x023a
            java.lang.Object r18 = r5.get(r11)
            r7 = r18
            com.google.android.gms.internal.ads.p0 r7 = (com.google.android.gms.internal.ads.C2056p0) r7
            r18 = r1
            int r1 = r7.f12974a
            if (r1 != r13) goto L_0x0233
            com.google.android.gms.internal.ads.dr2 r1 = r7.f12391b
            r7 = 12
            r1.mo6580f(r7)
            int r1 = r1.mo6596v()
            if (r1 <= 0) goto L_0x0233
            int r15 = r15 + r1
            int r12 = r12 + 1
        L_0x0233:
            int r11 = r11 + 1
            r1 = r18
            r7 = 8
            goto L_0x0210
        L_0x023a:
            r18 = r1
            r1 = 0
            r14.f5259h = r1
            r14.f5258g = r1
            r14.f5257f = r1
            com.google.android.gms.internal.ads.q1 r1 = r14.f5253b
            r1.f12998d = r12
            r1.f12999e = r15
            int[] r7 = r1.f13001g
            int r7 = r7.length
            if (r7 >= r12) goto L_0x0256
            long[] r7 = new long[r12]
            r1.f13000f = r7
            int[] r7 = new int[r12]
            r1.f13001g = r7
        L_0x0256:
            int[] r7 = r1.f13002h
            int r7 = r7.length
            if (r7 >= r15) goto L_0x0273
            int r15 = r15 * 125
            int r15 = r15 / 100
            int[] r7 = new int[r15]
            r1.f13002h = r7
            int[] r7 = new int[r15]
            r1.f13003i = r7
            long[] r7 = new long[r15]
            r1.f13004j = r7
            boolean[] r7 = new boolean[r15]
            r1.f13005k = r7
            boolean[] r7 = new boolean[r15]
            r1.f13007m = r7
        L_0x0273:
            r1 = 0
            r7 = 0
            r11 = 0
        L_0x0276:
            r19 = 0
            if (r1 >= r9) goto L_0x0400
            java.lang.Object r15 = r5.get(r1)
            com.google.android.gms.internal.ads.p0 r15 = (com.google.android.gms.internal.ads.C2056p0) r15
            int r12 = r15.f12974a
            if (r12 != r13) goto L_0x03cf
            int r12 = r11 + 1
            com.google.android.gms.internal.ads.dr2 r15 = r15.f12391b
            r13 = 8
            r15.mo6580f(r13)
            int r13 = r15.mo6587m()
            r17 = 16777215(0xffffff, float:2.3509886E-38)
            r13 = r13 & r17
            r21 = r5
            com.google.android.gms.internal.ads.r1 r5 = r14.f5255d
            com.google.android.gms.internal.ads.o1 r5 = r5.f13441a
            r22 = r6
            com.google.android.gms.internal.ads.q1 r6 = r14.f5253b
            r23 = r9
            com.google.android.gms.internal.ads.y0 r9 = r6.f12995a
            int r24 = com.google.android.gms.internal.ads.n13.f11236a
            r24 = r12
            int[] r12 = r6.f13001g
            int r25 = r15.mo6596v()
            r12[r11] = r25
            long[] r12 = r6.f13000f
            r25 = r2
            r26 = r3
            long r2 = r6.f12996b
            r12[r11] = r2
            r27 = r13 & 1
            if (r27 == 0) goto L_0x02c9
            int r0 = r15.mo6587m()
            r27 = r1
            long r0 = (long) r0
            long r2 = r2 + r0
            r12[r11] = r2
            goto L_0x02cb
        L_0x02c9:
            r27 = r1
        L_0x02cb:
            r0 = r13 & 4
            int r1 = r9.f17530d
            if (r0 == 0) goto L_0x02d5
            int r1 = r15.mo6587m()
        L_0x02d5:
            r2 = r13 & 256(0x100, float:3.59E-43)
            r3 = r13 & 512(0x200, float:7.175E-43)
            r12 = r13 & 1024(0x400, float:1.435E-42)
            r13 = r13 & 2048(0x800, float:2.87E-42)
            r28 = r1
            long[] r1 = r5.f11808h
            r29 = r8
            if (r1 == 0) goto L_0x030a
            int r8 = r1.length
            r30 = r10
            r10 = 1
            if (r8 != r10) goto L_0x030c
            r8 = 0
            r31 = r1[r8]
            int r1 = (r31 > r19 ? 1 : (r31 == r19 ? 0 : -1))
            if (r1 != 0) goto L_0x030c
            long[] r1 = r5.f11809i
            java.lang.Object r1 = com.google.android.gms.internal.ads.n13.m13626c(r1)
            long[] r1 = (long[]) r1
            r31 = r1[r8]
            r33 = 1000000(0xf4240, double:4.940656E-318)
            r8 = r13
            r1 = r14
            long r13 = r5.f11803c
            r35 = r13
            long r19 = com.google.android.gms.internal.ads.n13.m13621Z(r31, r33, r35)
            goto L_0x030e
        L_0x030a:
            r30 = r10
        L_0x030c:
            r8 = r13
            r1 = r14
        L_0x030e:
            int[] r10 = r6.f13002h
            int[] r13 = r6.f13003i
            long[] r14 = r6.f13004j
            r31 = r4
            boolean[] r4 = r6.f13005k
            r32 = r4
            int[] r4 = r6.f13001g
            r4 = r4[r11]
            int r4 = r4 + r7
            r39 = r10
            long r10 = r5.f11803c
            r5 = r13
            r40 = r14
            long r13 = r6.f13011q
        L_0x0328:
            if (r7 >= r4) goto L_0x03c6
            if (r2 == 0) goto L_0x0335
            int r33 = r15.mo6587m()
            r41 = r2
            r2 = r33
            goto L_0x0339
        L_0x0335:
            r41 = r2
            int r2 = r9.f17528b
        L_0x0339:
            m8251a(r2)
            if (r3 == 0) goto L_0x0347
            int r33 = r15.mo6587m()
            r42 = r3
            r3 = r33
            goto L_0x034b
        L_0x0347:
            r42 = r3
            int r3 = r9.f17529c
        L_0x034b:
            m8251a(r3)
            if (r12 == 0) goto L_0x0359
            int r33 = r15.mo6587m()
            r43 = r0
            r0 = r33
            goto L_0x0366
        L_0x0359:
            r43 = r0
            if (r7 != 0) goto L_0x0364
            if (r0 == 0) goto L_0x0363
            r0 = r28
            r7 = 0
            goto L_0x0366
        L_0x0363:
            r7 = 0
        L_0x0364:
            int r0 = r9.f17530d
        L_0x0366:
            r44 = r4
            if (r8 == 0) goto L_0x037d
            int r4 = r15.mo6587m()
            r46 = r8
            r45 = r9
            long r8 = (long) r4
            r33 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r8 * r33
            long r8 = r8 / r10
            int r4 = (int) r8
            r5[r7] = r4
            goto L_0x0384
        L_0x037d:
            r46 = r8
            r45 = r9
            r4 = 0
            r5[r7] = r4
        L_0x0384:
            r35 = 1000000(0xf4240, double:4.940656E-318)
            r33 = r13
            r37 = r10
            long r8 = com.google.android.gms.internal.ads.n13.m13621Z(r33, r35, r37)
            long r8 = r8 - r19
            r40[r7] = r8
            boolean r4 = r6.f13012r
            if (r4 != 0) goto L_0x03a1
            com.google.android.gms.internal.ads.r1 r4 = r1.f5255d
            r33 = r5
            long r4 = r4.f13448h
            long r8 = r8 + r4
            r40[r7] = r8
            goto L_0x03a3
        L_0x03a1:
            r33 = r5
        L_0x03a3:
            r39[r7] = r3
            r3 = 16
            int r0 = r0 >> r3
            r3 = 1
            r0 = r0 & r3
            r0 = r0 ^ r3
            if (r3 == r0) goto L_0x03af
            r0 = 0
            goto L_0x03b0
        L_0x03af:
            r0 = 1
        L_0x03b0:
            r32[r7] = r0
            long r2 = (long) r2
            long r13 = r13 + r2
            int r7 = r7 + 1
            r5 = r33
            r2 = r41
            r3 = r42
            r0 = r43
            r4 = r44
            r9 = r45
            r8 = r46
            goto L_0x0328
        L_0x03c6:
            r44 = r4
            r6.f13011q = r13
            r11 = r24
            r7 = r44
            goto L_0x03e5
        L_0x03cf:
            r27 = r1
            r25 = r2
            r26 = r3
            r31 = r4
            r21 = r5
            r22 = r6
            r29 = r8
            r23 = r9
            r30 = r10
            r1 = r14
            r17 = 16777215(0xffffff, float:2.3509886E-38)
        L_0x03e5:
            int r0 = r27 + 1
            r14 = r1
            r5 = r21
            r6 = r22
            r9 = r23
            r2 = r25
            r3 = r26
            r8 = r29
            r10 = r30
            r4 = r31
            r13 = 1953658222(0x7472756e, float:7.683823E31)
            r1 = r0
            r0 = r47
            goto L_0x0276
        L_0x0400:
            r25 = r2
            r26 = r3
            r31 = r4
            r22 = r6
            r29 = r8
            r30 = r10
            r1 = r14
            com.google.android.gms.internal.ads.r1 r0 = r1.f5255d
            com.google.android.gms.internal.ads.o1 r0 = r0.f13441a
            r1 = r31
            com.google.android.gms.internal.ads.y0 r2 = r1.f12995a
            java.util.Objects.requireNonNull(r2)
            int r2 = r2.f17527a
            com.google.android.gms.internal.ads.p1 r0 = r0.mo9625a(r2)
            r2 = 1935763834(0x7361697a, float:1.785898E31)
            r10 = r30
            com.google.android.gms.internal.ads.p0 r2 = r10.mo9619d(r2)
            if (r2 == 0) goto L_0x04a0
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.dr2 r2 = r2.f12391b
            int r3 = r0.f12414d
            r4 = 8
            r2.mo6580f(r4)
            int r5 = r2.mo6587m()
            r6 = 1
            r5 = r5 & r6
            if (r5 != r6) goto L_0x0440
            r2.mo6581g(r4)
        L_0x0440:
            int r4 = r2.mo6593s()
            int r5 = r2.mo6596v()
            int r6 = r1.f12999e
            if (r5 > r6) goto L_0x047f
            if (r4 != 0) goto L_0x0465
            boolean[] r4 = r1.f13007m
            r6 = 0
            r7 = 0
        L_0x0452:
            if (r6 >= r5) goto L_0x0463
            int r8 = r2.mo6593s()
            int r7 = r7 + r8
            if (r8 <= r3) goto L_0x045d
            r8 = 1
            goto L_0x045e
        L_0x045d:
            r8 = 0
        L_0x045e:
            r4[r6] = r8
            int r6 = r6 + 1
            goto L_0x0452
        L_0x0463:
            r4 = 0
            goto L_0x0472
        L_0x0465:
            if (r4 <= r3) goto L_0x0469
            r2 = 1
            goto L_0x046a
        L_0x0469:
            r2 = 0
        L_0x046a:
            int r7 = r4 * r5
            boolean[] r3 = r1.f13007m
            r4 = 0
            java.util.Arrays.fill(r3, r4, r5, r2)
        L_0x0472:
            boolean[] r2 = r1.f13007m
            int r3 = r1.f12999e
            java.util.Arrays.fill(r2, r5, r3, r4)
            if (r7 <= 0) goto L_0x04a0
            r1.mo10229b(r7)
            goto L_0x04a0
        L_0x047f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 78
            r0.<init>(r1)
            java.lang.String r1 = "Saiz sample count "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = " is greater than fragment sample count"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r1 = 0
            com.google.android.gms.internal.ads.dz r0 = com.google.android.gms.internal.ads.C1646dz.m8223a(r0, r1)
            throw r0
        L_0x04a0:
            r2 = 1935763823(0x7361696f, float:1.7858967E31)
            com.google.android.gms.internal.ads.p0 r2 = r10.mo9619d(r2)
            if (r2 == 0) goto L_0x04f0
            com.google.android.gms.internal.ads.dr2 r2 = r2.f12391b
            r3 = 8
            r2.mo6580f(r3)
            int r4 = r2.mo6587m()
            r5 = r4 & 1
            r6 = 1
            if (r5 != r6) goto L_0x04bc
            r2.mo6581g(r3)
        L_0x04bc:
            int r3 = r2.mo6596v()
            if (r3 != r6) goto L_0x04d7
            long r5 = r1.f12997c
            int r3 = com.google.android.gms.internal.ads.C2093q0.m15345a(r4)
            if (r3 != 0) goto L_0x04cf
            long r2 = r2.mo6567A()
            goto L_0x04d3
        L_0x04cf:
            long r2 = r2.mo6568B()
        L_0x04d3:
            long r5 = r5 + r2
            r1.f12997c = r5
            goto L_0x04f0
        L_0x04d7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 40
            r0.<init>(r1)
            java.lang.String r1 = "Unexpected saio entry count: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2 = 0
            com.google.android.gms.internal.ads.dz r0 = com.google.android.gms.internal.ads.C1646dz.m8223a(r0, r2)
            throw r0
        L_0x04f0:
            r2 = 0
            r3 = 1936027235(0x73656e63, float:1.8177412E31)
            com.google.android.gms.internal.ads.p0 r3 = r10.mo9619d(r3)
            if (r3 == 0) goto L_0x0500
            com.google.android.gms.internal.ads.dr2 r3 = r3.f12391b
            r4 = 0
            m8254f(r3, r4, r1)
        L_0x0500:
            if (r0 == 0) goto L_0x0507
            java.lang.String r0 = r0.f12412b
            r32 = r0
            goto L_0x0509
        L_0x0507:
            r32 = r2
        L_0x0509:
            r0 = r2
            r3 = r0
            r4 = 0
        L_0x050c:
            java.util.List<com.google.android.gms.internal.ads.p0> r5 = r10.f11787c
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0549
            java.util.List<com.google.android.gms.internal.ads.p0> r5 = r10.f11787c
            java.lang.Object r5 = r5.get(r4)
            com.google.android.gms.internal.ads.p0 r5 = (com.google.android.gms.internal.ads.C2056p0) r5
            com.google.android.gms.internal.ads.dr2 r6 = r5.f12391b
            int r5 = r5.f12974a
            r7 = 1935828848(0x73626770, float:1.7937577E31)
            r8 = 1936025959(0x73656967, float:1.817587E31)
            if (r5 != r7) goto L_0x0535
            r7 = 12
            r6.mo6580f(r7)
            int r5 = r6.mo6587m()
            if (r5 != r8) goto L_0x0546
            r0 = r6
            goto L_0x0546
        L_0x0535:
            r7 = 12
            r9 = 1936158820(0x73677064, float:1.8336489E31)
            if (r5 != r9) goto L_0x0546
            r6.mo6580f(r7)
            int r5 = r6.mo6587m()
            if (r5 != r8) goto L_0x0546
            r3 = r6
        L_0x0546:
            int r4 = r4 + 1
            goto L_0x050c
        L_0x0549:
            r7 = 12
            if (r0 == 0) goto L_0x05ec
            if (r3 != 0) goto L_0x0551
            goto L_0x05ec
        L_0x0551:
            r4 = 8
            r0.mo6580f(r4)
            int r5 = r0.mo6587m()
            r6 = 4
            r0.mo6581g(r6)
            int r5 = com.google.android.gms.internal.ads.C2093q0.m15345a(r5)
            r8 = 1
            if (r5 != r8) goto L_0x0568
            r0.mo6581g(r6)
        L_0x0568:
            int r0 = r0.mo6587m()
            if (r0 != r8) goto L_0x05e5
            r3.mo6580f(r4)
            int r0 = r3.mo6587m()
            int r0 = com.google.android.gms.internal.ads.C2093q0.m15345a(r0)
            r3.mo6581g(r6)
            if (r0 != r8) goto L_0x058e
            long r4 = r3.mo6567A()
            int r0 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x0587
            goto L_0x0594
        L_0x0587:
            java.lang.String r0 = "Variable length description in sgpd found (unsupported)"
            com.google.android.gms.internal.ads.dz r0 = com.google.android.gms.internal.ads.C1646dz.m8225c(r0)
            throw r0
        L_0x058e:
            r4 = 2
            if (r0 < r4) goto L_0x0594
            r3.mo6581g(r6)
        L_0x0594:
            long r4 = r3.mo6567A()
            r8 = 1
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x05de
            r0 = 1
            r3.mo6581g(r0)
            int r4 = r3.mo6593s()
            r5 = r4 & 240(0xf0, float:3.36E-43)
            int r35 = r5 >> 4
            r36 = r4 & 15
            int r4 = r3.mo6593s()
            if (r4 != r0) goto L_0x05ed
            int r33 = r3.mo6593s()
            r4 = 16
            byte[] r5 = new byte[r4]
            r6 = 0
            r3.mo6576b(r5, r6, r4)
            if (r33 != 0) goto L_0x05cc
            int r2 = r3.mo6593s()
            byte[] r9 = new byte[r2]
            r3.mo6576b(r9, r6, r2)
            r37 = r9
            goto L_0x05ce
        L_0x05cc:
            r37 = r2
        L_0x05ce:
            r1.f13006l = r0
            com.google.android.gms.internal.ads.p1 r2 = new com.google.android.gms.internal.ads.p1
            r31 = 1
            r30 = r2
            r34 = r5
            r30.<init>(r31, r32, r33, r34, r35, r36, r37)
            r1.f13008n = r2
            goto L_0x05ed
        L_0x05de:
            java.lang.String r0 = "Entry count in sgpd != 1 (unsupported)."
            com.google.android.gms.internal.ads.dz r0 = com.google.android.gms.internal.ads.C1646dz.m8225c(r0)
            throw r0
        L_0x05e5:
            java.lang.String r0 = "Entry count in sbgp != 1 (unsupported)."
            com.google.android.gms.internal.ads.dz r0 = com.google.android.gms.internal.ads.C1646dz.m8225c(r0)
            throw r0
        L_0x05ec:
            r0 = 1
        L_0x05ed:
            java.util.List<com.google.android.gms.internal.ads.p0> r2 = r10.f11787c
            int r2 = r2.size()
            r3 = 0
        L_0x05f4:
            if (r3 >= r2) goto L_0x062c
            java.util.List<com.google.android.gms.internal.ads.p0> r4 = r10.f11787c
            java.lang.Object r4 = r4.get(r3)
            com.google.android.gms.internal.ads.p0 r4 = (com.google.android.gms.internal.ads.C2056p0) r4
            int r5 = r4.f12974a
            r6 = 1970628964(0x75756964, float:3.1109627E32)
            if (r5 != r6) goto L_0x0620
            com.google.android.gms.internal.ads.dr2 r4 = r4.f12391b
            r5 = 8
            r4.mo6580f(r5)
            r8 = r26
            r6 = 0
            r9 = 16
            r4.mo6576b(r8, r6, r9)
            byte[] r11 = f6019F
            boolean r11 = java.util.Arrays.equals(r8, r11)
            if (r11 == 0) goto L_0x0627
            m8254f(r4, r9, r1)
            goto L_0x0627
        L_0x0620:
            r8 = r26
            r5 = 8
            r6 = 0
            r9 = 16
        L_0x0627:
            int r3 = r3 + 1
            r26 = r8
            goto L_0x05f4
        L_0x062c:
            r8 = r26
            r5 = 8
            r6 = 0
            goto L_0x0640
        L_0x0632:
            r18 = r1
            r25 = r2
            r22 = r6
            r5 = r7
            r29 = r8
            r0 = 1
            r6 = 0
            r7 = 12
            r8 = r3
        L_0x0640:
            int r1 = r29 + 1
            r0 = r47
            r7 = r5
            r3 = r8
            r6 = r22
            r2 = r25
            r8 = r1
            r1 = r18
            goto L_0x014d
        L_0x064f:
            r1 = r2
            r2 = 0
            r6 = 0
            java.util.List<com.google.android.gms.internal.ads.p0> r0 = r1.f11787c
            com.google.android.gms.internal.ads.u74 r0 = m8252b(r0)
            r3 = r47
            if (r0 == 0) goto L_0x06a0
            android.util.SparseArray<com.google.android.gms.internal.ads.c1> r1 = r3.f6026b
            int r1 = r1.size()
            r4 = r6
        L_0x0663:
            if (r4 >= r1) goto L_0x06a0
            android.util.SparseArray<com.google.android.gms.internal.ads.c1> r5 = r3.f6026b
            java.lang.Object r5 = r5.valueAt(r4)
            com.google.android.gms.internal.ads.c1 r5 = (com.google.android.gms.internal.ads.C1575c1) r5
            com.google.android.gms.internal.ads.r1 r7 = r5.f5255d
            com.google.android.gms.internal.ads.o1 r7 = r7.f13441a
            com.google.android.gms.internal.ads.q1 r8 = r5.f5253b
            com.google.android.gms.internal.ads.y0 r8 = r8.f12995a
            int r9 = com.google.android.gms.internal.ads.n13.f11236a
            int r8 = r8.f17527a
            com.google.android.gms.internal.ads.p1 r7 = r7.mo9625a(r8)
            if (r7 == 0) goto L_0x0682
            java.lang.String r7 = r7.f12412b
            goto L_0x0683
        L_0x0682:
            r7 = r2
        L_0x0683:
            com.google.android.gms.internal.ads.u74 r7 = r0.mo11184b(r7)
            com.google.android.gms.internal.ads.r1 r8 = r5.f5255d
            com.google.android.gms.internal.ads.o1 r8 = r8.f13441a
            com.google.android.gms.internal.ads.c0 r8 = r8.f11806f
            com.google.android.gms.internal.ads.bf4 r8 = r8.mo6004b()
            r8.mo5819b(r7)
            com.google.android.gms.internal.ads.c0 r7 = r8.mo5848y()
            com.google.android.gms.internal.ads.td4 r5 = r5.f5252a
            r5.mo7873b(r7)
            int r4 = r4 + 1
            goto L_0x0663
        L_0x06a0:
            long r0 = r3.f6043s
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x06fb
            android.util.SparseArray<com.google.android.gms.internal.ads.c1> r0 = r3.f6026b
            int r0 = r0.size()
            r10 = r6
        L_0x06b2:
            if (r10 >= r0) goto L_0x06de
            android.util.SparseArray<com.google.android.gms.internal.ads.c1> r1 = r3.f6026b
            java.lang.Object r1 = r1.valueAt(r10)
            com.google.android.gms.internal.ads.c1 r1 = (com.google.android.gms.internal.ads.C1575c1) r1
            long r4 = r3.f6043s
            int r2 = r1.f5257f
        L_0x06c0:
            com.google.android.gms.internal.ads.q1 r6 = r1.f5253b
            int r7 = r6.f12999e
            if (r2 >= r7) goto L_0x06db
            long r6 = r6.mo10228a(r2)
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x06db
            com.google.android.gms.internal.ads.q1 r6 = r1.f5253b
            boolean[] r6 = r6.f13005k
            boolean r6 = r6[r2]
            if (r6 == 0) goto L_0x06d8
            r1.f5260i = r2
        L_0x06d8:
            int r2 = r2 + 1
            goto L_0x06c0
        L_0x06db:
            int r10 = r10 + 1
            goto L_0x06b2
        L_0x06de:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.f6043s = r1
            goto L_0x06fb
        L_0x06e6:
            r3 = r0
            r1 = r2
            java.util.ArrayDeque<com.google.android.gms.internal.ads.o0> r0 = r3.f6034j
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x06fb
            java.util.ArrayDeque<com.google.android.gms.internal.ads.o0> r0 = r3.f6034j
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.o0 r0 = (com.google.android.gms.internal.ads.C2019o0) r0
            r0.mo9620e(r1)
        L_0x06fb:
            r0 = r3
            goto L_0x0002
        L_0x06fe:
            r3 = r0
            r47.m8253d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1649e1.m8255i(long):void");
    }

    /* renamed from: j */
    private static final C2390y0 m8256j(SparseArray<C2390y0> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        C2390y0 y0Var = sparseArray.get(i);
        Objects.requireNonNull(y0Var);
        return y0Var;
    }

    /* renamed from: c */
    public final boolean mo5040c(pc4 pc4) {
        return C1983n1.m13588a(pc4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0715, code lost:
        if (r0.f6038n == ((long) r0.f6039o)) goto L_0x051c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x05ac  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0719 A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo5042e(com.google.android.gms.internal.ads.pc4 r34, com.google.android.gms.internal.ads.md4 r35) {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
        L_0x0004:
            int r2 = r0.f6036l
            r3 = 1701671783(0x656d7367, float:7.0083103E22)
            r4 = 1936286840(0x73696478, float:1.8491255E31)
            r5 = 2
            r7 = 0
            r8 = 1
            r9 = 0
            if (r2 == 0) goto L_0x0521
            java.lang.String r10 = "FragmentedMp4Extractor"
            if (r2 == r8) goto L_0x02f9
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = 3
            if (r2 == r5) goto L_0x0297
            com.google.android.gms.internal.ads.c1 r2 = r0.f6046v
            if (r2 != 0) goto L_0x0099
            android.util.SparseArray<com.google.android.gms.internal.ads.c1> r2 = r0.f6026b
            int r13 = r2.size()
            r14 = r3
            r3 = r7
            r4 = r9
        L_0x002b:
            if (r4 >= r13) goto L_0x0061
            java.lang.Object r16 = r2.valueAt(r4)
            r5 = r16
            com.google.android.gms.internal.ads.c1 r5 = (com.google.android.gms.internal.ads.C1575c1) r5
            boolean r16 = r5.f5263l
            if (r16 != 0) goto L_0x0043
            int r11 = r5.f5257f
            com.google.android.gms.internal.ads.r1 r6 = r5.f5255d
            int r6 = r6.f13442b
            if (r11 == r6) goto L_0x005d
        L_0x0043:
            boolean r6 = r5.f5263l
            if (r6 == 0) goto L_0x0052
            int r6 = r5.f5259h
            com.google.android.gms.internal.ads.q1 r11 = r5.f5253b
            int r11 = r11.f12998d
            if (r6 != r11) goto L_0x0052
            goto L_0x005d
        L_0x0052:
            long r18 = r5.mo6019d()
            int r6 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r6 >= 0) goto L_0x005d
            r3 = r5
            r14 = r18
        L_0x005d:
            int r4 = r4 + 1
            r5 = 2
            goto L_0x002b
        L_0x0061:
            if (r3 != 0) goto L_0x007e
            long r2 = r0.f6041q
            long r4 = r34.mo6908b()
            long r2 = r2 - r4
            int r2 = (int) r2
            if (r2 < 0) goto L_0x0077
            r3 = r1
            com.google.android.gms.internal.ads.jc4 r3 = (com.google.android.gms.internal.ads.jc4) r3
            r3.mo8447p(r2, r9)
        L_0x0073:
            r33.m8253d()
            goto L_0x0004
        L_0x0077:
            java.lang.String r1 = "Offset to end of mdat was negative."
            com.google.android.gms.internal.ads.dz r1 = com.google.android.gms.internal.ads.C1646dz.m8223a(r1, r7)
            throw r1
        L_0x007e:
            long r4 = r3.mo6019d()
            long r13 = r34.mo6908b()
            long r4 = r4 - r13
            int r2 = (int) r4
            if (r2 >= 0) goto L_0x0090
            java.lang.String r2 = "Ignoring negative offset to sample data."
            android.util.Log.w(r10, r2)
            r2 = r9
        L_0x0090:
            r4 = r1
            com.google.android.gms.internal.ads.jc4 r4 = (com.google.android.gms.internal.ads.jc4) r4
            r4.mo8447p(r2, r9)
            r0.f6046v = r3
            r2 = r3
        L_0x0099:
            int r3 = r0.f6036l
            r4 = 6
            if (r3 != r12) goto L_0x0131
            int r3 = r2.mo6017b()
            r0.f6047w = r3
            int r5 = r2.f5257f
            int r6 = r2.f5260i
            if (r5 >= r6) goto L_0x00e0
            com.google.android.gms.internal.ads.jc4 r1 = (com.google.android.gms.internal.ads.jc4) r1
            r1.mo8447p(r3, r9)
            com.google.android.gms.internal.ads.p1 r1 = r2.mo6021f()
            if (r1 != 0) goto L_0x00b6
            goto L_0x00d3
        L_0x00b6:
            com.google.android.gms.internal.ads.q1 r3 = r2.f5253b
            com.google.android.gms.internal.ads.dr2 r3 = r3.f13009o
            int r1 = r1.f12414d
            if (r1 == 0) goto L_0x00c1
            r3.mo6581g(r1)
        L_0x00c1:
            com.google.android.gms.internal.ads.q1 r1 = r2.f5253b
            int r5 = r2.f5257f
            boolean r1 = r1.mo10230c(r5)
            if (r1 == 0) goto L_0x00d3
            int r1 = r3.mo6597w()
            int r1 = r1 * r4
            r3.mo6581g(r1)
        L_0x00d3:
            boolean r1 = r2.mo6024k()
            if (r1 != 0) goto L_0x00db
            r0.f6046v = r7
        L_0x00db:
            r0.f6036l = r12
            r1 = r9
            goto L_0x0296
        L_0x00e0:
            com.google.android.gms.internal.ads.r1 r5 = r2.f5255d
            com.google.android.gms.internal.ads.o1 r5 = r5.f13441a
            int r5 = r5.f11807g
            if (r5 != r8) goto L_0x00f4
            int r3 = r3 + -8
            r0.f6047w = r3
            r3 = r1
            com.google.android.gms.internal.ads.jc4 r3 = (com.google.android.gms.internal.ads.jc4) r3
            r5 = 8
            r3.mo8447p(r5, r9)
        L_0x00f4:
            com.google.android.gms.internal.ads.r1 r3 = r2.f5255d
            com.google.android.gms.internal.ads.o1 r3 = r3.f13441a
            com.google.android.gms.internal.ads.c0 r3 = r3.f11806f
            java.lang.String r3 = r3.f5234l
            java.lang.String r5 = "audio/ac4"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x011f
            int r3 = r0.f6047w
            r5 = 7
            int r3 = r2.mo6018c(r3, r5)
            r0.f6048x = r3
            int r3 = r0.f6047w
            com.google.android.gms.internal.ads.dr2 r6 = r0.f6031g
            com.google.android.gms.internal.ads.wb4.m18954b(r3, r6)
            com.google.android.gms.internal.ads.td4 r3 = r2.f5252a
            com.google.android.gms.internal.ads.dr2 r6 = r0.f6031g
            com.google.android.gms.internal.ads.rd4.m16162b(r3, r6, r5)
            int r3 = r0.f6048x
            int r3 = r3 + r5
            goto L_0x0125
        L_0x011f:
            int r3 = r0.f6047w
            int r3 = r2.mo6018c(r3, r9)
        L_0x0125:
            r0.f6048x = r3
            int r5 = r0.f6047w
            int r5 = r5 + r3
            r0.f6047w = r5
            r3 = 4
            r0.f6036l = r3
            r0.f6049y = r9
        L_0x0131:
            com.google.android.gms.internal.ads.r1 r3 = r2.f5255d
            com.google.android.gms.internal.ads.o1 r3 = r3.f13441a
            com.google.android.gms.internal.ads.td4 r5 = r2.f5252a
            long r10 = r2.mo6020e()
            int r6 = r3.f11810j
            if (r6 != 0) goto L_0x0150
        L_0x013f:
            int r3 = r0.f6048x
            int r4 = r0.f6047w
            if (r3 >= r4) goto L_0x0238
            int r4 = r4 - r3
            int r3 = com.google.android.gms.internal.ads.rd4.m16161a(r5, r1, r4, r9)
            int r4 = r0.f6048x
            int r4 = r4 + r3
            r0.f6048x = r4
            goto L_0x013f
        L_0x0150:
            com.google.android.gms.internal.ads.dr2 r6 = r0.f6028d
            byte[] r6 = r6.mo6582h()
            r6[r9] = r9
            r6[r8] = r9
            r13 = 2
            r6[r13] = r9
            int r13 = r3.f11810j
            int r14 = r13 + 1
            r15 = 4
            int r13 = 4 - r13
        L_0x0164:
            int r15 = r0.f6048x
            int r12 = r0.f6047w
            if (r15 >= r12) goto L_0x0238
            int r12 = r0.f6049y
            java.lang.String r15 = "video/hevc"
            if (r12 != 0) goto L_0x01d7
            r12 = r1
            com.google.android.gms.internal.ads.jc4 r12 = (com.google.android.gms.internal.ads.jc4) r12
            r12.mo6916m(r6, r13, r14, r9)
            com.google.android.gms.internal.ads.dr2 r12 = r0.f6028d
            r12.mo6580f(r9)
            com.google.android.gms.internal.ads.dr2 r12 = r0.f6028d
            int r12 = r12.mo6587m()
            if (r12 <= 0) goto L_0x01d0
            int r12 = r12 + -1
            r0.f6049y = r12
            com.google.android.gms.internal.ads.dr2 r12 = r0.f6027c
            r12.mo6580f(r9)
            com.google.android.gms.internal.ads.dr2 r12 = r0.f6027c
            r9 = 4
            com.google.android.gms.internal.ads.rd4.m16162b(r5, r12, r9)
            com.google.android.gms.internal.ads.dr2 r12 = r0.f6028d
            com.google.android.gms.internal.ads.rd4.m16162b(r5, r12, r8)
            com.google.android.gms.internal.ads.td4[] r12 = r0.f6023C
            int r12 = r12.length
            if (r12 <= 0) goto L_0x01c1
            com.google.android.gms.internal.ads.c0 r12 = r3.f11806f
            java.lang.String r12 = r12.f5234l
            byte r17 = r6[r9]
            byte[] r9 = com.google.android.gms.internal.ads.th2.f14860a
            java.lang.String r9 = "video/avc"
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x01b3
            r9 = r17 & 31
            if (r9 == r4) goto L_0x01b1
            goto L_0x01b3
        L_0x01b1:
            r9 = r8
            goto L_0x01c2
        L_0x01b3:
            boolean r9 = r15.equals(r12)
            if (r9 == 0) goto L_0x01c1
            r9 = r17 & 126(0x7e, float:1.77E-43)
            int r9 = r9 >> r8
            r12 = 39
            if (r9 != r12) goto L_0x01c1
            goto L_0x01b1
        L_0x01c1:
            r9 = 0
        L_0x01c2:
            r0.f6050z = r9
            int r9 = r0.f6048x
            int r9 = r9 + 5
            r0.f6048x = r9
            int r9 = r0.f6047w
            int r9 = r9 + r13
            r0.f6047w = r9
            goto L_0x0234
        L_0x01d0:
            java.lang.String r1 = "Invalid NAL length"
            com.google.android.gms.internal.ads.dz r1 = com.google.android.gms.internal.ads.C1646dz.m8223a(r1, r7)
            throw r1
        L_0x01d7:
            boolean r9 = r0.f6050z
            if (r9 == 0) goto L_0x0222
            com.google.android.gms.internal.ads.dr2 r9 = r0.f6029e
            r9.mo6577c(r12)
            com.google.android.gms.internal.ads.dr2 r9 = r0.f6029e
            byte[] r9 = r9.mo6582h()
            int r12 = r0.f6049y
            r4 = r1
            com.google.android.gms.internal.ads.jc4 r4 = (com.google.android.gms.internal.ads.jc4) r4
            r8 = 0
            r4.mo6916m(r9, r8, r12, r8)
            com.google.android.gms.internal.ads.dr2 r4 = r0.f6029e
            int r8 = r0.f6049y
            com.google.android.gms.internal.ads.rd4.m16162b(r5, r4, r8)
            int r4 = r0.f6049y
            com.google.android.gms.internal.ads.dr2 r8 = r0.f6029e
            byte[] r8 = r8.mo6582h()
            com.google.android.gms.internal.ads.dr2 r9 = r0.f6029e
            int r9 = r9.mo6586l()
            int r8 = com.google.android.gms.internal.ads.th2.m17269b(r8, r9)
            com.google.android.gms.internal.ads.dr2 r9 = r0.f6029e
            com.google.android.gms.internal.ads.c0 r12 = r3.f11806f
            java.lang.String r12 = r12.f5234l
            boolean r12 = r15.equals(r12)
            r9.mo6580f(r12)
            com.google.android.gms.internal.ads.dr2 r9 = r0.f6029e
            r9.mo6579e(r8)
            com.google.android.gms.internal.ads.dr2 r8 = r0.f6029e
            com.google.android.gms.internal.ads.td4[] r9 = r0.f6023C
            com.google.android.gms.internal.ads.gc4.m9653a(r10, r8, r9)
            goto L_0x0228
        L_0x0222:
            r4 = 0
            int r8 = com.google.android.gms.internal.ads.rd4.m16161a(r5, r1, r12, r4)
            r4 = r8
        L_0x0228:
            int r8 = r0.f6048x
            int r8 = r8 + r4
            r0.f6048x = r8
            int r8 = r0.f6049y
            int r8 = r8 - r4
            r0.f6049y = r8
            r4 = 6
            r8 = 1
        L_0x0234:
            r9 = 0
            r12 = 3
            goto L_0x0164
        L_0x0238:
            int r20 = r2.mo6016a()
            com.google.android.gms.internal.ads.p1 r1 = r2.mo6021f()
            if (r1 == 0) goto L_0x0247
            com.google.android.gms.internal.ads.sd4 r1 = r1.f12413c
            r23 = r1
            goto L_0x0249
        L_0x0247:
            r23 = r7
        L_0x0249:
            int r1 = r0.f6047w
            r22 = 0
            r17 = r5
            r18 = r10
            r21 = r1
            r17.mo7872a(r18, r20, r21, r22, r23)
        L_0x0256:
            java.util.ArrayDeque<com.google.android.gms.internal.ads.b1> r1 = r0.f6035k
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x028a
            java.util.ArrayDeque<com.google.android.gms.internal.ads.b1> r1 = r0.f6035k
            java.lang.Object r1 = r1.removeFirst()
            com.google.android.gms.internal.ads.b1 r1 = (com.google.android.gms.internal.ads.C1538b1) r1
            int r3 = r0.f6042r
            int r4 = r1.f4630b
            int r3 = r3 - r4
            r0.f6042r = r3
            long r3 = r1.f4629a
            long r3 = r3 + r10
            com.google.android.gms.internal.ads.td4[] r5 = r0.f6022B
            int r6 = r5.length
            r8 = 0
        L_0x0274:
            if (r8 >= r6) goto L_0x0256
            r12 = r5[r8]
            r15 = 1
            int r9 = r1.f4630b
            int r13 = r0.f6042r
            r18 = 0
            r17 = r13
            r13 = r3
            r16 = r9
            r12.mo7872a(r13, r15, r16, r17, r18)
            int r8 = r8 + 1
            goto L_0x0274
        L_0x028a:
            boolean r1 = r2.mo6024k()
            if (r1 != 0) goto L_0x0292
            r0.f6046v = r7
        L_0x0292:
            r1 = 3
            r0.f6036l = r1
            r1 = 0
        L_0x0296:
            return r1
        L_0x0297:
            android.util.SparseArray<com.google.android.gms.internal.ads.c1> r2 = r0.f6026b
            int r2 = r2.size()
            r6 = r7
            r5 = 0
        L_0x029f:
            if (r5 >= r2) goto L_0x02c2
            android.util.SparseArray<com.google.android.gms.internal.ads.c1> r8 = r0.f6026b
            java.lang.Object r8 = r8.valueAt(r5)
            com.google.android.gms.internal.ads.c1 r8 = (com.google.android.gms.internal.ads.C1575c1) r8
            com.google.android.gms.internal.ads.q1 r8 = r8.f5253b
            boolean r9 = r8.f13010p
            if (r9 == 0) goto L_0x02bf
            long r8 = r8.f12997c
            int r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r10 >= 0) goto L_0x02bf
            android.util.SparseArray<com.google.android.gms.internal.ads.c1> r3 = r0.f6026b
            java.lang.Object r3 = r3.valueAt(r5)
            r6 = r3
            com.google.android.gms.internal.ads.c1 r6 = (com.google.android.gms.internal.ads.C1575c1) r6
            r3 = r8
        L_0x02bf:
            int r5 = r5 + 1
            goto L_0x029f
        L_0x02c2:
            if (r6 != 0) goto L_0x02c9
            r2 = 3
        L_0x02c5:
            r0.f6036l = r2
            goto L_0x0004
        L_0x02c9:
            long r8 = r34.mo6908b()
            long r3 = r3 - r8
            int r2 = (int) r3
            if (r2 < 0) goto L_0x02f2
            r3 = r1
            com.google.android.gms.internal.ads.jc4 r3 = (com.google.android.gms.internal.ads.jc4) r3
            r4 = 0
            r3.mo8447p(r2, r4)
            com.google.android.gms.internal.ads.q1 r2 = r6.f5253b
            com.google.android.gms.internal.ads.dr2 r5 = r2.f13009o
            byte[] r5 = r5.mo6582h()
            com.google.android.gms.internal.ads.dr2 r6 = r2.f13009o
            int r6 = r6.mo6586l()
            r3.mo6916m(r5, r4, r6, r4)
            com.google.android.gms.internal.ads.dr2 r3 = r2.f13009o
            r3.mo6580f(r4)
            r2.f13010p = r4
            goto L_0x0004
        L_0x02f2:
            java.lang.String r1 = "Offset to encryption data was negative."
            com.google.android.gms.internal.ads.dz r1 = com.google.android.gms.internal.ads.C1646dz.m8223a(r1, r7)
            throw r1
        L_0x02f9:
            long r5 = r0.f6038n
            int r2 = (int) r5
            int r5 = r0.f6039o
            int r2 = r2 - r5
            com.google.android.gms.internal.ads.dr2 r5 = r0.f6040p
            if (r5 == 0) goto L_0x0511
            byte[] r6 = r5.mo6582h()
            r8 = r1
            com.google.android.gms.internal.ads.jc4 r8 = (com.google.android.gms.internal.ads.jc4) r8
            r9 = 8
            r11 = 0
            r8.mo6916m(r6, r9, r2, r11)
            com.google.android.gms.internal.ads.p0 r2 = new com.google.android.gms.internal.ads.p0
            int r6 = r0.f6037m
            r2.<init>(r6, r5)
            long r5 = r34.mo6908b()
            java.util.ArrayDeque<com.google.android.gms.internal.ads.o0> r8 = r0.f6034j
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x0330
            java.util.ArrayDeque<com.google.android.gms.internal.ads.o0> r3 = r0.f6034j
            java.lang.Object r3 = r3.peek()
            com.google.android.gms.internal.ads.o0 r3 = (com.google.android.gms.internal.ads.C2019o0) r3
            r3.mo9621f(r2)
            goto L_0x0518
        L_0x0330:
            int r8 = r2.f12974a
            if (r8 != r4) goto L_0x03fa
            com.google.android.gms.internal.ads.dr2 r2 = r2.f12391b
            r3 = 8
            r2.mo6580f(r3)
            int r3 = r2.mo6587m()
            r4 = 4
            r2.mo6581g(r4)
            long r14 = r2.mo6567A()
            int r3 = com.google.android.gms.internal.ads.C2093q0.m15345a(r3)
            if (r3 != 0) goto L_0x0356
            long r3 = r2.mo6567A()
            long r8 = r2.mo6567A()
            goto L_0x035e
        L_0x0356:
            long r3 = r2.mo6568B()
            long r8 = r2.mo6568B()
        L_0x035e:
            long r5 = r5 + r8
            r10 = 1000000(0xf4240, double:4.940656E-318)
            r8 = r3
            r12 = r14
            long r19 = com.google.android.gms.internal.ads.n13.m13621Z(r8, r10, r12)
            r8 = 2
            r2.mo6581g(r8)
            int r12 = r2.mo6597w()
            int[] r13 = new int[r12]
            long[] r10 = new long[r12]
            long[] r11 = new long[r12]
            long[] r8 = new long[r12]
            r21 = r19
            r9 = 0
        L_0x037b:
            if (r9 >= r12) goto L_0x03d1
            int r17 = r2.mo6587m()
            r23 = -2147483648(0xffffffff80000000, float:-0.0)
            r23 = r17 & r23
            if (r23 != 0) goto L_0x03c9
            long r23 = r2.mo6567A()
            r25 = 2147483647(0x7fffffff, float:NaN)
            r17 = r17 & r25
            r13[r9] = r17
            r10[r9] = r5
            r8[r9] = r21
            long r3 = r3 + r23
            r21 = 1000000(0xf4240, double:4.940656E-318)
            r7 = r8
            r24 = r9
            r8 = r3
            r25 = r3
            r3 = r10
            r4 = r11
            r10 = r21
            r17 = r12
            r1 = r13
            r12 = r14
            long r21 = com.google.android.gms.internal.ads.n13.m13621Z(r8, r10, r12)
            r8 = r7[r24]
            long r8 = r21 - r8
            r4[r24] = r8
            r8 = 4
            r2.mo6581g(r8)
            r9 = r1[r24]
            long r9 = (long) r9
            long r5 = r5 + r9
            int r9 = r24 + 1
            r13 = r1
            r10 = r3
            r11 = r4
            r8 = r7
            r12 = r17
            r3 = r25
            r7 = 0
            r1 = r34
            goto L_0x037b
        L_0x03c9:
            java.lang.String r1 = "Unhandled indirect reference"
            r2 = 0
            com.google.android.gms.internal.ads.dz r1 = com.google.android.gms.internal.ads.C1646dz.m8223a(r1, r2)
            throw r1
        L_0x03d1:
            r7 = r8
            r3 = r10
            r4 = r11
            r1 = r13
            java.lang.Long r2 = java.lang.Long.valueOf(r19)
            com.google.android.gms.internal.ads.hc4 r5 = new com.google.android.gms.internal.ads.hc4
            r5.<init>(r1, r3, r4, r7)
            android.util.Pair r1 = android.util.Pair.create(r2, r5)
            java.lang.Object r2 = r1.first
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r0.f6045u = r2
            com.google.android.gms.internal.ads.rc4 r2 = r0.f6021A
            java.lang.Object r1 = r1.second
            com.google.android.gms.internal.ads.pd4 r1 = (com.google.android.gms.internal.ads.pd4) r1
            r2.mo10269p(r1)
            r1 = 1
            r0.f6024D = r1
            goto L_0x050e
        L_0x03fa:
            if (r8 != r3) goto L_0x050e
            com.google.android.gms.internal.ads.dr2 r1 = r2.f12391b
            com.google.android.gms.internal.ads.td4[] r2 = r0.f6022B
            int r2 = r2.length
            if (r2 == 0) goto L_0x050e
            r2 = 8
            r1.mo6580f(r2)
            int r2 = r1.mo6587m()
            int r2 = com.google.android.gms.internal.ads.C2093q0.m15345a(r2)
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x046b
            r5 = 1
            if (r2 == r5) goto L_0x0432
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 46
            r1.<init>(r3)
            java.lang.String r3 = "Skipping unsupported emsg version: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r10, r1)
            goto L_0x050e
        L_0x0432:
            long r5 = r1.mo6567A()
            long r11 = r1.mo6568B()
            r13 = 1000000(0xf4240, double:4.940656E-318)
            r15 = r5
            long r7 = com.google.android.gms.internal.ads.n13.m13621Z(r11, r13, r15)
            long r11 = r1.mo6567A()
            r13 = 1000(0x3e8, double:4.94E-321)
            long r5 = com.google.android.gms.internal.ads.n13.m13621Z(r11, r13, r15)
            long r9 = r1.mo6567A()
            r2 = 0
            java.lang.String r11 = r1.mo6570D(r2)
            java.util.Objects.requireNonNull(r11)
            java.lang.String r12 = r1.mo6570D(r2)
            java.util.Objects.requireNonNull(r12)
            r28 = r5
            r17 = r7
            r30 = r9
            r26 = r11
            r27 = r12
            r5 = r3
            goto L_0x04ae
        L_0x046b:
            r2 = 0
            java.lang.String r11 = r1.mo6570D(r2)
            java.util.Objects.requireNonNull(r11)
            java.lang.String r12 = r1.mo6570D(r2)
            java.util.Objects.requireNonNull(r12)
            long r13 = r1.mo6567A()
            long r5 = r1.mo6567A()
            r7 = 1000000(0xf4240, double:4.940656E-318)
            r9 = r13
            long r15 = com.google.android.gms.internal.ads.n13.m13621Z(r5, r7, r9)
            long r5 = r0.f6045u
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0494
            long r5 = r5 + r15
            r17 = r5
            goto L_0x0496
        L_0x0494:
            r17 = r3
        L_0x0496:
            long r5 = r1.mo6567A()
            r7 = 1000(0x3e8, double:4.94E-321)
            r9 = r13
            long r5 = com.google.android.gms.internal.ads.n13.m13621Z(r5, r7, r9)
            long r9 = r1.mo6567A()
            r28 = r5
            r30 = r9
            r26 = r11
            r27 = r12
            r5 = r15
        L_0x04ae:
            int r2 = r1.mo6583i()
            byte[] r2 = new byte[r2]
            int r7 = r1.mo6583i()
            r8 = 0
            r1.mo6576b(r2, r8, r7)
            com.google.android.gms.internal.ads.xe4 r1 = new com.google.android.gms.internal.ads.xe4
            r25 = r1
            r32 = r2
            r25.<init>(r26, r27, r28, r30, r32)
            com.google.android.gms.internal.ads.dr2 r2 = new com.google.android.gms.internal.ads.dr2
            com.google.android.gms.internal.ads.ye4 r7 = r0.f6032h
            byte[] r1 = r7.mo11995a(r1)
            r2.<init>((byte[]) r1)
            int r1 = r2.mo6583i()
            com.google.android.gms.internal.ads.td4[] r7 = r0.f6022B
            int r8 = r7.length
            r9 = 0
        L_0x04d8:
            if (r9 >= r8) goto L_0x04e6
            r10 = r7[r9]
            r11 = 0
            r2.mo6580f(r11)
            r10.mo7876e(r2, r1)
            int r9 = r9 + 1
            goto L_0x04d8
        L_0x04e6:
            int r2 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x04fa
            java.util.ArrayDeque<com.google.android.gms.internal.ads.b1> r2 = r0.f6035k
            com.google.android.gms.internal.ads.b1 r3 = new com.google.android.gms.internal.ads.b1
            r3.<init>(r5, r1)
            r2.addLast(r3)
            int r2 = r0.f6042r
            int r2 = r2 + r1
            r0.f6042r = r2
            goto L_0x050e
        L_0x04fa:
            com.google.android.gms.internal.ads.td4[] r2 = r0.f6022B
            int r3 = r2.length
            r4 = 0
        L_0x04fe:
            if (r4 >= r3) goto L_0x050e
            r5 = r2[r4]
            r8 = 1
            r10 = 0
            r11 = 0
            r6 = r17
            r9 = r1
            r5.mo7872a(r6, r8, r9, r10, r11)
            int r4 = r4 + 1
            goto L_0x04fe
        L_0x050e:
            r1 = r34
            goto L_0x0518
        L_0x0511:
            r3 = r1
            com.google.android.gms.internal.ads.jc4 r3 = (com.google.android.gms.internal.ads.jc4) r3
            r5 = 0
            r3.mo8447p(r2, r5)
        L_0x0518:
            long r2 = r34.mo6908b()
        L_0x051c:
            r0.m8255i(r2)
            goto L_0x0004
        L_0x0521:
            r5 = r9
            int r2 = r0.f6039o
            if (r2 != 0) goto L_0x054e
            com.google.android.gms.internal.ads.dr2 r2 = r0.f6033i
            byte[] r2 = r2.mo6582h()
            r6 = 8
            r7 = 1
            boolean r2 = r1.mo6916m(r2, r5, r6, r7)
            if (r2 != 0) goto L_0x0537
            r1 = -1
            return r1
        L_0x0537:
            r0.f6039o = r6
            com.google.android.gms.internal.ads.dr2 r2 = r0.f6033i
            r2.mo6580f(r5)
            com.google.android.gms.internal.ads.dr2 r2 = r0.f6033i
            long r5 = r2.mo6567A()
            r0.f6038n = r5
            com.google.android.gms.internal.ads.dr2 r2 = r0.f6033i
            int r2 = r2.mo6587m()
            r0.f6037m = r2
        L_0x054e:
            long r5 = r0.f6038n
            r7 = 1
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x0573
            com.google.android.gms.internal.ads.dr2 r2 = r0.f6033i
            byte[] r2 = r2.mo6582h()
            r5 = r1
            com.google.android.gms.internal.ads.jc4 r5 = (com.google.android.gms.internal.ads.jc4) r5
            r6 = 8
            r7 = 0
            r5.mo6916m(r2, r6, r6, r7)
            int r2 = r0.f6039o
            int r2 = r2 + r6
            r0.f6039o = r2
            com.google.android.gms.internal.ads.dr2 r2 = r0.f6033i
            long r5 = r2.mo6568B()
        L_0x0570:
            r0.f6038n = r5
            goto L_0x05a3
        L_0x0573:
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x05a3
            long r5 = r34.mo6909c()
            r7 = -1
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x0595
            java.util.ArrayDeque<com.google.android.gms.internal.ads.o0> r2 = r0.f6034j
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0595
            java.util.ArrayDeque<com.google.android.gms.internal.ads.o0> r2 = r0.f6034j
            java.lang.Object r2 = r2.peek()
            com.google.android.gms.internal.ads.o0 r2 = (com.google.android.gms.internal.ads.C2019o0) r2
            long r5 = r2.f11786b
        L_0x0595:
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x05a3
            long r7 = r34.mo6908b()
            long r5 = r5 - r7
            int r2 = r0.f6039o
            long r7 = (long) r2
            long r5 = r5 + r7
            goto L_0x0570
        L_0x05a3:
            long r5 = r0.f6038n
            int r2 = r0.f6039o
            long r7 = (long) r2
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0719
            long r5 = r34.mo6908b()
            int r2 = r0.f6039o
            long r7 = (long) r2
            long r5 = r5 - r7
            int r2 = r0.f6037m
            r7 = 1835295092(0x6d646174, float:4.4175247E27)
            r8 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r2 == r8) goto L_0x05c0
            if (r2 != r7) goto L_0x05d3
        L_0x05c0:
            boolean r2 = r0.f6024D
            if (r2 != 0) goto L_0x05d3
            com.google.android.gms.internal.ads.rc4 r2 = r0.f6021A
            com.google.android.gms.internal.ads.od4 r9 = new com.google.android.gms.internal.ads.od4
            long r10 = r0.f6044t
            r9.<init>(r10, r5)
            r2.mo10269p(r9)
            r2 = 1
            r0.f6024D = r2
        L_0x05d3:
            int r2 = r0.f6037m
            if (r2 != r8) goto L_0x05f1
            android.util.SparseArray<com.google.android.gms.internal.ads.c1> r2 = r0.f6026b
            int r2 = r2.size()
            r9 = 0
        L_0x05de:
            if (r9 >= r2) goto L_0x05f1
            android.util.SparseArray<com.google.android.gms.internal.ads.c1> r10 = r0.f6026b
            java.lang.Object r10 = r10.valueAt(r9)
            com.google.android.gms.internal.ads.c1 r10 = (com.google.android.gms.internal.ads.C1575c1) r10
            com.google.android.gms.internal.ads.q1 r10 = r10.f5253b
            r10.f12997c = r5
            r10.f12996b = r5
            int r9 = r9 + 1
            goto L_0x05de
        L_0x05f1:
            int r2 = r0.f6037m
            if (r2 != r7) goto L_0x0600
            r7 = 0
            r0.f6046v = r7
            long r2 = r0.f6038n
            long r5 = r5 + r2
            r0.f6041q = r5
            r2 = 2
            goto L_0x02c5
        L_0x0600:
            r5 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r2 == r5) goto L_0x06f8
            r5 = 1953653099(0x7472616b, float:7.681346E31)
            if (r2 == r5) goto L_0x06f8
            r5 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r2 == r5) goto L_0x06f8
            r5 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r2 == r5) goto L_0x06f8
            r5 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r2 == r5) goto L_0x06f8
            if (r2 == r8) goto L_0x06f8
            r5 = 1953653094(0x74726166, float:7.6813435E31)
            if (r2 == r5) goto L_0x06f8
            r5 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r2 == r5) goto L_0x06f8
            r5 = 1701082227(0x65647473, float:6.742798E22)
            if (r2 != r5) goto L_0x062c
            goto L_0x06f8
        L_0x062c:
            r5 = 1751411826(0x68646c72, float:4.3148E24)
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r2 == r5) goto L_0x06c5
            r5 = 1835296868(0x6d646864, float:4.418049E27)
            if (r2 == r5) goto L_0x06c5
            r5 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r2 == r5) goto L_0x06c5
            if (r2 == r4) goto L_0x06c5
            r4 = 1937011556(0x73747364, float:1.9367383E31)
            if (r2 == r4) goto L_0x06c5
            r4 = 1937011827(0x73747473, float:1.9367711E31)
            if (r2 == r4) goto L_0x06c5
            r4 = 1668576371(0x63747473, float:4.5093966E21)
            if (r2 == r4) goto L_0x06c5
            r4 = 1937011555(0x73747363, float:1.9367382E31)
            if (r2 == r4) goto L_0x06c5
            r4 = 1937011578(0x7374737a, float:1.936741E31)
            if (r2 == r4) goto L_0x06c5
            r4 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r2 == r4) goto L_0x06c5
            r4 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r2 == r4) goto L_0x06c5
            r4 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r2 == r4) goto L_0x06c5
            r4 = 1937011571(0x73747373, float:1.9367401E31)
            if (r2 == r4) goto L_0x06c5
            r4 = 1952867444(0x74666474, float:7.3014264E31)
            if (r2 == r4) goto L_0x06c5
            r4 = 1952868452(0x74666864, float:7.301914E31)
            if (r2 == r4) goto L_0x06c5
            r4 = 1953196132(0x746b6864, float:7.46037E31)
            if (r2 == r4) goto L_0x06c5
            r4 = 1953654136(0x74726578, float:7.6818474E31)
            if (r2 == r4) goto L_0x06c5
            r4 = 1953658222(0x7472756e, float:7.683823E31)
            if (r2 == r4) goto L_0x06c5
            r4 = 1886614376(0x70737368, float:3.013775E29)
            if (r2 == r4) goto L_0x06c5
            r4 = 1935763834(0x7361697a, float:1.785898E31)
            if (r2 == r4) goto L_0x06c5
            r4 = 1935763823(0x7361696f, float:1.7858967E31)
            if (r2 == r4) goto L_0x06c5
            r4 = 1936027235(0x73656e63, float:1.8177412E31)
            if (r2 == r4) goto L_0x06c5
            r4 = 1970628964(0x75756964, float:3.1109627E32)
            if (r2 == r4) goto L_0x06c5
            r4 = 1935828848(0x73626770, float:1.7937577E31)
            if (r2 == r4) goto L_0x06c5
            r4 = 1936158820(0x73677064, float:1.8336489E31)
            if (r2 == r4) goto L_0x06c5
            r4 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r2 == r4) goto L_0x06c5
            r4 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r2 == r4) goto L_0x06c5
            if (r2 != r3) goto L_0x06b6
            goto L_0x06c5
        L_0x06b6:
            long r2 = r0.f6038n
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x06be
            r2 = 0
            goto L_0x06e5
        L_0x06be:
            java.lang.String r1 = "Skipping atom with length > 2147483647 (unsupported)."
            com.google.android.gms.internal.ads.dz r1 = com.google.android.gms.internal.ads.C1646dz.m8225c(r1)
            throw r1
        L_0x06c5:
            int r2 = r0.f6039o
            r3 = 8
            if (r2 != r3) goto L_0x06f1
            long r4 = r0.f6038n
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x06ea
            com.google.android.gms.internal.ads.dr2 r2 = new com.google.android.gms.internal.ads.dr2
            int r4 = (int) r4
            r2.<init>((int) r4)
            com.google.android.gms.internal.ads.dr2 r4 = r0.f6033i
            byte[] r4 = r4.mo6582h()
            byte[] r5 = r2.mo6582h()
            r6 = 0
            java.lang.System.arraycopy(r4, r6, r5, r6, r3)
        L_0x06e5:
            r0.f6040p = r2
            r2 = 1
            goto L_0x02c5
        L_0x06ea:
            java.lang.String r1 = "Leaf atom with length > 2147483647 (unsupported)."
            com.google.android.gms.internal.ads.dz r1 = com.google.android.gms.internal.ads.C1646dz.m8225c(r1)
            throw r1
        L_0x06f1:
            java.lang.String r1 = "Leaf atom defines extended atom size (unsupported)."
            com.google.android.gms.internal.ads.dz r1 = com.google.android.gms.internal.ads.C1646dz.m8225c(r1)
            throw r1
        L_0x06f8:
            long r2 = r34.mo6908b()
            long r4 = r0.f6038n
            long r2 = r2 + r4
            r4 = -8
            long r2 = r2 + r4
            java.util.ArrayDeque<com.google.android.gms.internal.ads.o0> r4 = r0.f6034j
            com.google.android.gms.internal.ads.o0 r5 = new com.google.android.gms.internal.ads.o0
            int r6 = r0.f6037m
            r5.<init>(r6, r2)
            r4.push(r5)
            long r4 = r0.f6038n
            int r6 = r0.f6039o
            long r6 = (long) r6
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0073
            goto L_0x051c
        L_0x0719:
            java.lang.String r1 = "Atom size less than header length (unsupported)."
            com.google.android.gms.internal.ads.dz r1 = com.google.android.gms.internal.ads.C1646dz.m8225c(r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1649e1.mo5042e(com.google.android.gms.internal.ads.pc4, com.google.android.gms.internal.ads.md4):int");
    }

    /* renamed from: g */
    public final void mo5044g(rc4 rc4) {
        this.f6021A = rc4;
        m8253d();
        td4[] td4Arr = new td4[2];
        this.f6022B = td4Arr;
        int i = 0;
        td4[] td4Arr2 = (td4[]) n13.m13597B(td4Arr, 0);
        this.f6022B = td4Arr2;
        for (td4 b : td4Arr2) {
            b.mo7873b(f6020G);
        }
        this.f6023C = new td4[this.f6025a.size()];
        int i2 = 100;
        while (i < this.f6023C.length) {
            int i3 = i2 + 1;
            td4 r = this.f6021A.mo10270r(i2, 3);
            r.mo7873b(this.f6025a.get(i));
            this.f6023C[i] = r;
            i++;
            i2 = i3;
        }
    }

    /* renamed from: h */
    public final void mo5045h(long j, long j2) {
        int size = this.f6026b.size();
        for (int i = 0; i < size; i++) {
            this.f6026b.valueAt(i).mo6023i();
        }
        this.f6035k.clear();
        this.f6042r = 0;
        this.f6043s = j2;
        this.f6034j.clear();
        m8253d();
    }
}
