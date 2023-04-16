package p084l2;

/* renamed from: l2.b */
final class C3473b {

    /* renamed from: a */
    private final C3550t2 f21028a;

    /* renamed from: b */
    private final C3471a1 f21029b;

    /* renamed from: c */
    private int f21030c = 0;

    /* renamed from: d */
    private int f21031d = 0;

    C3473b(C3550t2 t2Var, C3471a1 a1Var) {
        this.f21028a = t2Var;
        this.f21029b = a1Var;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0096 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p084l2.C3546s2 mo14563a() {
        /*
            r12 = this;
            int[] r0 = p084l2.C3542r2.f21193a
            l2.a1 r1 = r12.f21029b
            int r2 = r1.f21019a
            r3 = 1
            int r2 = r2 - r3
            r0 = r0[r2]
            r2 = 2
            r4 = 0
            r5 = 3
            switch(r0) {
                case 1: goto L_0x006a;
                case 2: goto L_0x0067;
                case 3: goto L_0x0062;
                case 4: goto L_0x005d;
                case 5: goto L_0x005a;
                case 6: goto L_0x0039;
                case 7: goto L_0x0018;
                default: goto L_0x0010;
            }
        L_0x0010:
            l2.e2 r0 = new l2.e2
            java.lang.String r1 = "Invalid response from server."
            r0.<init>(r3, r1)
            throw r0
        L_0x0018:
            l2.e2 r0 = new l2.e2
            java.lang.String r1 = "Publisher misconfiguration: "
            l2.a1 r2 = r12.f21029b
            java.lang.String r2 = r2.f21022d
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x002f
            java.lang.String r1 = r1.concat(r2)
            goto L_0x0035
        L_0x002f:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r1 = r2
        L_0x0035:
            r0.<init>(r5, r1)
            throw r0
        L_0x0039:
            l2.e2 r0 = new l2.e2
            java.lang.String r1 = "Invalid response from server: "
            l2.a1 r2 = r12.f21029b
            java.lang.String r2 = r2.f21022d
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r4 = r2.length()
            if (r4 == 0) goto L_0x0050
            java.lang.String r1 = r1.concat(r2)
            goto L_0x0056
        L_0x0050:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r1 = r2
        L_0x0056:
            r0.<init>(r3, r1)
            throw r0
        L_0x005a:
            r12.f21030c = r5
            goto L_0x006c
        L_0x005d:
            r12.f21030c = r5
            r12.f21031d = r3
            goto L_0x006e
        L_0x0062:
            r12.f21030c = r5
            r12.f21031d = r2
            goto L_0x006e
        L_0x0067:
            r12.f21030c = r2
            goto L_0x006c
        L_0x006a:
            r12.f21030c = r3
        L_0x006c:
            r12.f21031d = r4
        L_0x006e:
            java.lang.String r0 = r1.f21020b
            r6 = 0
            if (r0 != 0) goto L_0x0075
            r7 = r6
            goto L_0x007c
        L_0x0075:
            l2.d0 r7 = new l2.d0
            java.lang.String r1 = r1.f21021c
            r7.<init>(r1, r0)
        L_0x007c:
            l2.t2 r0 = r12.f21028a
            l2.m r0 = r0.f21209c
            java.util.HashSet r1 = new java.util.HashSet
            l2.a1 r8 = r12.f21029b
            java.util.List<java.lang.String> r8 = r8.f21023e
            r1.<init>(r8)
            r0.mo14609c(r1)
            l2.a1 r0 = r12.f21029b
            java.util.List<l2.z0> r0 = r0.f21024f
            java.util.Iterator r0 = r0.iterator()
        L_0x0096:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00cf
            java.lang.Object r1 = r0.next()
            l2.z0 r1 = (p084l2.C3567z0) r1
            int[] r8 = p084l2.C3542r2.f21194b
            int r9 = r1.f21262a
            int r9 = r9 - r3
            r8 = r8[r9]
            if (r8 == r3) goto L_0x00b6
            if (r8 == r2) goto L_0x00b3
            if (r8 == r5) goto L_0x00b0
            goto L_0x00b6
        L_0x00b0:
            java.lang.String r8 = "clear"
            goto L_0x00b7
        L_0x00b3:
            java.lang.String r8 = "write"
            goto L_0x00b7
        L_0x00b6:
            r8 = r6
        L_0x00b7:
            if (r8 == 0) goto L_0x0096
            l2.t2 r9 = r12.f21028a
            l2.y1 r9 = r9.f21207a
            java.lang.String r1 = r1.f21263b
            l2.c2[] r10 = new p084l2.C3481c2[r3]
            l2.t2 r11 = r12.f21028a
            l2.k r11 = r11.f21208b
            r10[r4] = r11
            r9.mo14635b(r8, r1, r10)
            goto L_0x0096
        L_0x00cf:
            l2.s2 r0 = new l2.s2
            int r1 = r12.f21030c
            int r2 = r12.f21031d
            r0.<init>(r1, r2, r7, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p084l2.C3473b.mo14563a():l2.s2");
    }
}
