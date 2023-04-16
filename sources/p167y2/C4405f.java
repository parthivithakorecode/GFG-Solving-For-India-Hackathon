package p167y2;

import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import p028d3.C2488a;
import p028d3.C2490b;
import p149v2.C4212h;
import p149v2.C4215k;
import p149v2.C4217m;
import p149v2.C4218n;
import p149v2.C4220p;

/* renamed from: y2.f */
public final class C4405f extends C2488a {

    /* renamed from: y */
    private static final Reader f22762y = new C4406a();

    /* renamed from: z */
    private static final Object f22763z = new Object();

    /* renamed from: u */
    private Object[] f22764u = new Object[32];

    /* renamed from: v */
    private int f22765v = 0;

    /* renamed from: w */
    private String[] f22766w = new String[32];

    /* renamed from: x */
    private int[] f22767x = new int[32];

    /* renamed from: y2.f$a */
    class C4406a extends Reader {
        C4406a() {
        }

        public void close() {
            throw new AssertionError();
        }

        public int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public C4405f(C4215k kVar) {
        super(f22762y);
        m27066m0(kVar);
    }

    /* renamed from: G */
    private String m27062G() {
        return " at path " + mo12360r();
    }

    /* renamed from: h0 */
    private void m27063h0(C2490b bVar) {
        if (mo12354V() != bVar) {
            throw new IllegalStateException("Expected " + bVar + " but was " + mo12354V() + m27062G());
        }
    }

    /* renamed from: j0 */
    private Object m27064j0() {
        return this.f22764u[this.f22765v - 1];
    }

    /* renamed from: k0 */
    private Object m27065k0() {
        Object[] objArr = this.f22764u;
        int i = this.f22765v - 1;
        this.f22765v = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    /* renamed from: m0 */
    private void m27066m0(Object obj) {
        int i = this.f22765v;
        Object[] objArr = this.f22764u;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.f22764u = Arrays.copyOf(objArr, i2);
            this.f22767x = Arrays.copyOf(this.f22767x, i2);
            this.f22766w = (String[]) Arrays.copyOf(this.f22766w, i2);
        }
        Object[] objArr2 = this.f22764u;
        int i3 = this.f22765v;
        this.f22765v = i3 + 1;
        objArr2[i3] = obj;
    }

    /* renamed from: B */
    public boolean mo12344B() {
        C2490b V = mo12354V();
        return (V == C2490b.END_OBJECT || V == C2490b.END_ARRAY) ? false : true;
    }

    /* renamed from: H */
    public boolean mo12347H() {
        m27063h0(C2490b.BOOLEAN);
        boolean p = ((C4220p) m27065k0()).mo15767p();
        int i = this.f22765v;
        if (i > 0) {
            int[] iArr = this.f22767x;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return p;
    }

    /* renamed from: I */
    public double mo12348I() {
        C2490b V = mo12354V();
        C2490b bVar = C2490b.NUMBER;
        if (V == bVar || V == C2490b.STRING) {
            double q = ((C4220p) m27064j0()).mo15768q();
            if (mo12345C() || (!Double.isNaN(q) && !Double.isInfinite(q))) {
                m27065k0();
                int i = this.f22765v;
                if (i > 0) {
                    int[] iArr = this.f22767x;
                    int i2 = i - 1;
                    iArr[i2] = iArr[i2] + 1;
                }
                return q;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + q);
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + V + m27062G());
    }

    /* renamed from: N */
    public int mo12349N() {
        C2490b V = mo12354V();
        C2490b bVar = C2490b.NUMBER;
        if (V == bVar || V == C2490b.STRING) {
            int r = ((C4220p) m27064j0()).mo15769r();
            m27065k0();
            int i = this.f22765v;
            if (i > 0) {
                int[] iArr = this.f22767x;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return r;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + V + m27062G());
    }

    /* renamed from: O */
    public long mo12350O() {
        C2490b V = mo12354V();
        C2490b bVar = C2490b.NUMBER;
        if (V == bVar || V == C2490b.STRING) {
            long s = ((C4220p) m27064j0()).mo15770s();
            m27065k0();
            int i = this.f22765v;
            if (i > 0) {
                int[] iArr = this.f22767x;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return s;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + V + m27062G());
    }

    /* renamed from: P */
    public String mo12351P() {
        m27063h0(C2490b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m27064j0()).next();
        String str = (String) entry.getKey();
        this.f22766w[this.f22765v - 1] = str;
        m27066m0(entry.getValue());
        return str;
    }

    /* renamed from: R */
    public void mo12352R() {
        m27063h0(C2490b.NULL);
        m27065k0();
        int i = this.f22765v;
        if (i > 0) {
            int[] iArr = this.f22767x;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: T */
    public String mo12353T() {
        C2490b V = mo12354V();
        C2490b bVar = C2490b.STRING;
        if (V == bVar || V == C2490b.NUMBER) {
            String k = ((C4220p) m27065k0()).mo15746k();
            int i = this.f22765v;
            if (i > 0) {
                int[] iArr = this.f22767x;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return k;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + V + m27062G());
    }

    /* renamed from: V */
    public C2490b mo12354V() {
        if (this.f22765v == 0) {
            return C2490b.END_DOCUMENT;
        }
        Object j0 = m27064j0();
        if (j0 instanceof Iterator) {
            boolean z = this.f22764u[this.f22765v - 2] instanceof C4218n;
            Iterator it = (Iterator) j0;
            if (!it.hasNext()) {
                return z ? C2490b.END_OBJECT : C2490b.END_ARRAY;
            }
            if (z) {
                return C2490b.NAME;
            }
            m27066m0(it.next());
            return mo12354V();
        } else if (j0 instanceof C4218n) {
            return C2490b.BEGIN_OBJECT;
        } else {
            if (j0 instanceof C4212h) {
                return C2490b.BEGIN_ARRAY;
            }
            if (j0 instanceof C4220p) {
                C4220p pVar = (C4220p) j0;
                if (pVar.mo15774x()) {
                    return C2490b.STRING;
                }
                if (pVar.mo15772u()) {
                    return C2490b.BOOLEAN;
                }
                if (pVar.mo15773w()) {
                    return C2490b.NUMBER;
                }
                throw new AssertionError();
            } else if (j0 instanceof C4217m) {
                return C2490b.NULL;
            } else {
                if (j0 == f22763z) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    public void close() {
        this.f22764u = new Object[]{f22763z};
        this.f22765v = 1;
    }

    /* renamed from: d */
    public void mo12357d() {
        m27063h0(C2490b.BEGIN_ARRAY);
        m27066m0(((C4212h) m27064j0()).iterator());
        this.f22767x[this.f22765v - 1] = 0;
    }

    /* renamed from: f0 */
    public void mo12358f0() {
        if (mo12354V() == C2490b.NAME) {
            mo12351P();
            this.f22766w[this.f22765v - 2] = "null";
        } else {
            m27065k0();
            int i = this.f22765v;
            if (i > 0) {
                this.f22766w[i - 1] = "null";
            }
        }
        int i2 = this.f22765v;
        if (i2 > 0) {
            int[] iArr = this.f22767x;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    /* renamed from: h */
    public void mo12359h() {
        m27063h0(C2490b.BEGIN_OBJECT);
        m27066m0(((C4218n) m27064j0()).mo15762q().iterator());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public C4215k mo16023i0() {
        C2490b V = mo12354V();
        if (V == C2490b.NAME || V == C2490b.END_ARRAY || V == C2490b.END_OBJECT || V == C2490b.END_DOCUMENT) {
            throw new IllegalStateException("Unexpected " + V + " when reading a JsonElement.");
        }
        C4215k kVar = (C4215k) m27064j0();
        mo12358f0();
        return kVar;
    }

    /* renamed from: l0 */
    public void mo16024l0() {
        m27063h0(C2490b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m27064j0()).next();
        m27066m0(entry.getValue());
        m27066m0(new C4220p((String) entry.getKey()));
    }

    /* renamed from: r */
    public String mo12360r() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (true) {
            int i2 = this.f22765v;
            if (i >= i2) {
                return sb.toString();
            }
            Object[] objArr = this.f22764u;
            if (objArr[i] instanceof C4212h) {
                i++;
                if (i < i2 && (objArr[i] instanceof Iterator)) {
                    sb.append('[');
                    sb.append(this.f22767x[i]);
                    sb.append(']');
                }
            } else if ((objArr[i] instanceof C4218n) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
                sb.append('.');
                String[] strArr = this.f22766w;
                if (strArr[i] != null) {
                    sb.append(strArr[i]);
                }
            }
            i++;
        }
    }

    public String toString() {
        return C4405f.class.getSimpleName() + m27062G();
    }

    /* renamed from: v */
    public void mo12363v() {
        m27063h0(C2490b.END_ARRAY);
        m27065k0();
        m27065k0();
        int i = this.f22765v;
        if (i > 0) {
            int[] iArr = this.f22767x;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: w */
    public void mo12364w() {
        m27063h0(C2490b.END_OBJECT);
        m27065k0();
        m27065k0();
        int i = this.f22765v;
        if (i > 0) {
            int[] iArr = this.f22767x;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }
}
