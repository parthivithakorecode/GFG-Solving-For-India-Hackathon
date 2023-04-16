package p102o;

/* renamed from: o.h */
public class C3815h<E> implements Cloneable {

    /* renamed from: j */
    private static final Object f21785j = new Object();

    /* renamed from: f */
    private boolean f21786f;

    /* renamed from: g */
    private int[] f21787g;

    /* renamed from: h */
    private Object[] f21788h;

    /* renamed from: i */
    private int f21789i;

    public C3815h() {
        this(10);
    }

    public C3815h(int i) {
        this.f21786f = false;
        if (i == 0) {
            this.f21787g = C3805c.f21747a;
            this.f21788h = C3805c.f21749c;
            return;
        }
        int e = C3805c.m25691e(i);
        this.f21787g = new int[e];
        this.f21788h = new Object[e];
    }

    /* renamed from: d */
    private void m25744d() {
        int i = this.f21789i;
        int[] iArr = this.f21787g;
        Object[] objArr = this.f21788h;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f21785j) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f21786f = false;
        this.f21789i = i2;
    }

    /* renamed from: a */
    public void mo15188a(int i, E e) {
        int i2 = this.f21789i;
        if (i2 == 0 || i > this.f21787g[i2 - 1]) {
            if (this.f21786f && i2 >= this.f21787g.length) {
                m25744d();
            }
            int i3 = this.f21789i;
            if (i3 >= this.f21787g.length) {
                int e2 = C3805c.m25691e(i3 + 1);
                int[] iArr = new int[e2];
                Object[] objArr = new Object[e2];
                int[] iArr2 = this.f21787g;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f21788h;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f21787g = iArr;
                this.f21788h = objArr;
            }
            this.f21787g[i3] = i;
            this.f21788h[i3] = e;
            this.f21789i = i3 + 1;
            return;
        }
        mo15195h(i, e);
    }

    /* renamed from: b */
    public void mo15189b() {
        int i = this.f21789i;
        Object[] objArr = this.f21788h;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f21789i = 0;
        this.f21786f = false;
    }

    /* renamed from: c */
    public C3815h<E> clone() {
        try {
            C3815h<E> hVar = (C3815h) super.clone();
            hVar.f21787g = (int[]) this.f21787g.clone();
            hVar.f21788h = (Object[]) this.f21788h.clone();
            return hVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: e */
    public E mo15192e(int i) {
        return mo15193f(i, (Object) null);
    }

    /* renamed from: f */
    public E mo15193f(int i, E e) {
        int a = C3805c.m25687a(this.f21787g, this.f21789i, i);
        if (a >= 0) {
            E[] eArr = this.f21788h;
            if (eArr[a] != f21785j) {
                return eArr[a];
            }
        }
        return e;
    }

    /* renamed from: g */
    public int mo15194g(int i) {
        if (this.f21786f) {
            m25744d();
        }
        return this.f21787g[i];
    }

    /* renamed from: h */
    public void mo15195h(int i, E e) {
        int a = C3805c.m25687a(this.f21787g, this.f21789i, i);
        if (a >= 0) {
            this.f21788h[a] = e;
            return;
        }
        int i2 = ~a;
        int i3 = this.f21789i;
        if (i2 < i3) {
            Object[] objArr = this.f21788h;
            if (objArr[i2] == f21785j) {
                this.f21787g[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f21786f && i3 >= this.f21787g.length) {
            m25744d();
            i2 = ~C3805c.m25687a(this.f21787g, this.f21789i, i);
        }
        int i4 = this.f21789i;
        if (i4 >= this.f21787g.length) {
            int e2 = C3805c.m25691e(i4 + 1);
            int[] iArr = new int[e2];
            Object[] objArr2 = new Object[e2];
            int[] iArr2 = this.f21787g;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f21788h;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f21787g = iArr;
            this.f21788h = objArr2;
        }
        int i5 = this.f21789i;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.f21787g;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.f21788h;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f21789i - i2);
        }
        this.f21787g[i2] = i;
        this.f21788h[i2] = e;
        this.f21789i++;
    }

    /* renamed from: j */
    public int mo15196j() {
        if (this.f21786f) {
            m25744d();
        }
        return this.f21789i;
    }

    /* renamed from: l */
    public E mo15197l(int i) {
        if (this.f21786f) {
            m25744d();
        }
        return this.f21788h[i];
    }

    public String toString() {
        if (mo15196j() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f21789i * 28);
        sb.append('{');
        for (int i = 0; i < this.f21789i; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo15194g(i));
            sb.append('=');
            Object l = mo15197l(i);
            if (l != this) {
                sb.append(l);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
