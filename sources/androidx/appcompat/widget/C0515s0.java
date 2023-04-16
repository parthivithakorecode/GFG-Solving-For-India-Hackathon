package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.s0 */
class C0515s0 {

    /* renamed from: a */
    private int f1618a = 0;

    /* renamed from: b */
    private int f1619b = 0;

    /* renamed from: c */
    private int f1620c = Integer.MIN_VALUE;

    /* renamed from: d */
    private int f1621d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f1622e = 0;

    /* renamed from: f */
    private int f1623f = 0;

    /* renamed from: g */
    private boolean f1624g = false;

    /* renamed from: h */
    private boolean f1625h = false;

    C0515s0() {
    }

    /* renamed from: a */
    public int mo2300a() {
        return this.f1624g ? this.f1618a : this.f1619b;
    }

    /* renamed from: b */
    public int mo2301b() {
        return this.f1618a;
    }

    /* renamed from: c */
    public int mo2302c() {
        return this.f1619b;
    }

    /* renamed from: d */
    public int mo2303d() {
        return this.f1624g ? this.f1619b : this.f1618a;
    }

    /* renamed from: e */
    public void mo2304e(int i, int i2) {
        this.f1625h = false;
        if (i != Integer.MIN_VALUE) {
            this.f1622e = i;
            this.f1618a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1623f = i2;
            this.f1619b = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r2 != Integer.MIN_VALUE) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if (r2 != Integer.MIN_VALUE) goto L_0x0031;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2305f(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f1624g
            if (r2 != r0) goto L_0x0005
            return
        L_0x0005:
            r1.f1624g = r2
            boolean r0 = r1.f1625h
            if (r0 == 0) goto L_0x002b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L_0x001d
            int r2 = r1.f1621d
            if (r2 == r0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            int r2 = r1.f1622e
        L_0x0016:
            r1.f1618a = r2
            int r2 = r1.f1620c
            if (r2 == r0) goto L_0x002f
            goto L_0x0031
        L_0x001d:
            int r2 = r1.f1620c
            if (r2 == r0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            int r2 = r1.f1622e
        L_0x0024:
            r1.f1618a = r2
            int r2 = r1.f1621d
            if (r2 == r0) goto L_0x002f
            goto L_0x0031
        L_0x002b:
            int r2 = r1.f1622e
            r1.f1618a = r2
        L_0x002f:
            int r2 = r1.f1623f
        L_0x0031:
            r1.f1619b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0515s0.mo2305f(boolean):void");
    }

    /* renamed from: g */
    public void mo2306g(int i, int i2) {
        this.f1620c = i;
        this.f1621d = i2;
        this.f1625h = true;
        if (this.f1624g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f1618a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f1619b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1618a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1619b = i2;
        }
    }
}
