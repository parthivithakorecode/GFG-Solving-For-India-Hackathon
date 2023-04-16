package p102o;

/* renamed from: o.d */
public class C3806d<E> implements Cloneable {

    /* renamed from: j */
    private static final Object f21750j = new Object();

    /* renamed from: f */
    private boolean f21751f;

    /* renamed from: g */
    private long[] f21752g;

    /* renamed from: h */
    private Object[] f21753h;

    /* renamed from: i */
    private int f21754i;

    public C3806d() {
        this(10);
    }

    public C3806d(int i) {
        this.f21751f = false;
        if (i == 0) {
            this.f21752g = C3805c.f21748b;
            this.f21753h = C3805c.f21749c;
            return;
        }
        int f = C3805c.m25692f(i);
        this.f21752g = new long[f];
        this.f21753h = new Object[f];
    }

    /* renamed from: d */
    private void m25693d() {
        int i = this.f21754i;
        long[] jArr = this.f21752g;
        Object[] objArr = this.f21753h;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f21750j) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f21751f = false;
        this.f21754i = i2;
    }

    /* renamed from: a */
    public void mo15081a(long j, E e) {
        int i = this.f21754i;
        if (i == 0 || j > this.f21752g[i - 1]) {
            if (this.f21751f && i >= this.f21752g.length) {
                m25693d();
            }
            int i2 = this.f21754i;
            if (i2 >= this.f21752g.length) {
                int f = C3805c.m25692f(i2 + 1);
                long[] jArr = new long[f];
                Object[] objArr = new Object[f];
                long[] jArr2 = this.f21752g;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f21753h;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f21752g = jArr;
                this.f21753h = objArr;
            }
            this.f21752g[i2] = j;
            this.f21753h[i2] = e;
            this.f21754i = i2 + 1;
            return;
        }
        mo15088h(j, e);
    }

    /* renamed from: b */
    public void mo15082b() {
        int i = this.f21754i;
        Object[] objArr = this.f21753h;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f21754i = 0;
        this.f21751f = false;
    }

    /* renamed from: c */
    public C3806d<E> clone() {
        try {
            C3806d<E> dVar = (C3806d) super.clone();
            dVar.f21752g = (long[]) this.f21752g.clone();
            dVar.f21753h = (Object[]) this.f21753h.clone();
            return dVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: e */
    public E mo15085e(long j) {
        return mo15086f(j, (Object) null);
    }

    /* renamed from: f */
    public E mo15086f(long j, E e) {
        int b = C3805c.m25688b(this.f21752g, this.f21754i, j);
        if (b >= 0) {
            E[] eArr = this.f21753h;
            if (eArr[b] != f21750j) {
                return eArr[b];
            }
        }
        return e;
    }

    /* renamed from: g */
    public long mo15087g(int i) {
        if (this.f21751f) {
            m25693d();
        }
        return this.f21752g[i];
    }

    /* renamed from: h */
    public void mo15088h(long j, E e) {
        int b = C3805c.m25688b(this.f21752g, this.f21754i, j);
        if (b >= 0) {
            this.f21753h[b] = e;
            return;
        }
        int i = ~b;
        int i2 = this.f21754i;
        if (i < i2) {
            Object[] objArr = this.f21753h;
            if (objArr[i] == f21750j) {
                this.f21752g[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f21751f && i2 >= this.f21752g.length) {
            m25693d();
            i = ~C3805c.m25688b(this.f21752g, this.f21754i, j);
        }
        int i3 = this.f21754i;
        if (i3 >= this.f21752g.length) {
            int f = C3805c.m25692f(i3 + 1);
            long[] jArr = new long[f];
            Object[] objArr2 = new Object[f];
            long[] jArr2 = this.f21752g;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f21753h;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f21752g = jArr;
            this.f21753h = objArr2;
        }
        int i4 = this.f21754i;
        if (i4 - i != 0) {
            long[] jArr3 = this.f21752g;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f21753h;
            System.arraycopy(objArr4, i, objArr4, i5, this.f21754i - i);
        }
        this.f21752g[i] = j;
        this.f21753h[i] = e;
        this.f21754i++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.f21753h;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15089j(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.f21752g
            int r1 = r2.f21754i
            int r3 = p102o.C3805c.m25688b(r0, r1, r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.f21753h
            r0 = r4[r3]
            java.lang.Object r1 = f21750j
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.f21751f = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p102o.C3806d.mo15089j(long):void");
    }

    /* renamed from: l */
    public int mo15090l() {
        if (this.f21751f) {
            m25693d();
        }
        return this.f21754i;
    }

    /* renamed from: m */
    public E mo15091m(int i) {
        if (this.f21751f) {
            m25693d();
        }
        return this.f21753h[i];
    }

    public String toString() {
        if (mo15090l() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f21754i * 28);
        sb.append('{');
        for (int i = 0; i < this.f21754i; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo15087g(i));
            sb.append('=');
            Object m = mo15091m(i);
            if (m != this) {
                sb.append(m);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
