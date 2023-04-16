package p028d3;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: d3.c */
public class C2491c implements Closeable, Flushable {

    /* renamed from: o */
    private static final String[] f18572o = new String[128];

    /* renamed from: p */
    private static final String[] f18573p;

    /* renamed from: f */
    private final Writer f18574f;

    /* renamed from: g */
    private int[] f18575g = new int[32];

    /* renamed from: h */
    private int f18576h = 0;

    /* renamed from: i */
    private String f18577i;

    /* renamed from: j */
    private String f18578j;

    /* renamed from: k */
    private boolean f18579k;

    /* renamed from: l */
    private boolean f18580l;

    /* renamed from: m */
    private String f18581m;

    /* renamed from: n */
    private boolean f18582n;

    static {
        for (int i = 0; i <= 31; i++) {
            f18572o[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f18572o;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f18573p = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C2491c(Writer writer) {
        m21015O(6);
        this.f18578j = ":";
        this.f18582n = true;
        Objects.requireNonNull(writer, "out == null");
        this.f18574f = writer;
    }

    /* renamed from: G */
    private void m21012G() {
        if (this.f18577i != null) {
            this.f18574f.write(10);
            int i = this.f18576h;
            for (int i2 = 1; i2 < i; i2++) {
                this.f18574f.write(this.f18577i);
            }
        }
    }

    /* renamed from: I */
    private C2491c m21013I(int i, char c) {
        m21020h();
        m21015O(i);
        this.f18574f.write(c);
        return this;
    }

    /* renamed from: N */
    private int m21014N() {
        int i = this.f18576h;
        if (i != 0) {
            return this.f18575g[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: O */
    private void m21015O(int i) {
        int i2 = this.f18576h;
        int[] iArr = this.f18575g;
        if (i2 == iArr.length) {
            this.f18575g = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.f18575g;
        int i3 = this.f18576h;
        this.f18576h = i3 + 1;
        iArr2[i3] = i;
    }

    /* renamed from: P */
    private void m21016P(int i) {
        this.f18575g[this.f18576h - 1] = i;
    }

    /* renamed from: U */
    private void m21017U(String str) {
        String str2;
        String[] strArr = this.f18580l ? f18573p : f18572o;
        this.f18574f.write(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                this.f18574f.write(str, i, i2 - i);
            }
            this.f18574f.write(str2);
            i = i2 + 1;
        }
        if (i < length) {
            this.f18574f.write(str, i, length - i);
        }
        this.f18574f.write(34);
    }

    /* renamed from: a0 */
    private void m21018a0() {
        if (this.f18581m != null) {
            m21019d();
            m21017U(this.f18581m);
            this.f18581m = null;
        }
    }

    /* renamed from: d */
    private void m21019d() {
        int N = m21014N();
        if (N == 5) {
            this.f18574f.write(44);
        } else if (N != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m21012G();
        m21016P(4);
    }

    /* renamed from: h */
    private void m21020h() {
        int N = m21014N();
        if (N == 1) {
            m21016P(2);
        } else if (N == 2) {
            this.f18574f.append(',');
        } else if (N != 4) {
            if (N != 6) {
                if (N != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f18579k) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            m21016P(7);
            return;
        } else {
            this.f18574f.append(this.f18578j);
            m21016P(5);
            return;
        }
        m21012G();
    }

    /* renamed from: u */
    private C2491c m21021u(int i, int i2, char c) {
        int N = m21014N();
        if (N != i2 && N != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f18581m == null) {
            this.f18576h--;
            if (N == i2) {
                m21012G();
            }
            this.f18574f.write(c);
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.f18581m);
        }
    }

    /* renamed from: B */
    public final boolean mo12366B() {
        return this.f18580l;
    }

    /* renamed from: C */
    public boolean mo12367C() {
        return this.f18579k;
    }

    /* renamed from: F */
    public C2491c mo12368F(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f18581m != null) {
            throw new IllegalStateException();
        } else if (this.f18576h != 0) {
            this.f18581m = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: H */
    public C2491c mo12369H() {
        if (this.f18581m != null) {
            if (this.f18582n) {
                m21018a0();
            } else {
                this.f18581m = null;
                return this;
            }
        }
        m21020h();
        this.f18574f.write("null");
        return this;
    }

    /* renamed from: Q */
    public final void mo12370Q(boolean z) {
        this.f18580l = z;
    }

    /* renamed from: R */
    public final void mo12371R(String str) {
        String str2;
        if (str.length() == 0) {
            this.f18577i = null;
            str2 = ":";
        } else {
            this.f18577i = str;
            str2 = ": ";
        }
        this.f18578j = str2;
    }

    /* renamed from: S */
    public final void mo12372S(boolean z) {
        this.f18579k = z;
    }

    /* renamed from: T */
    public final void mo12373T(boolean z) {
        this.f18582n = z;
    }

    /* renamed from: V */
    public C2491c mo12374V(long j) {
        m21018a0();
        m21020h();
        this.f18574f.write(Long.toString(j));
        return this;
    }

    /* renamed from: W */
    public C2491c mo12375W(Boolean bool) {
        if (bool == null) {
            return mo12369H();
        }
        m21018a0();
        m21020h();
        this.f18574f.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    /* renamed from: X */
    public C2491c mo12376X(Number number) {
        if (number == null) {
            return mo12369H();
        }
        m21018a0();
        String obj = number.toString();
        if (this.f18579k || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            m21020h();
            this.f18574f.append(obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    /* renamed from: Y */
    public C2491c mo12377Y(String str) {
        if (str == null) {
            return mo12369H();
        }
        m21018a0();
        m21020h();
        m21017U(str);
        return this;
    }

    /* renamed from: Z */
    public C2491c mo12378Z(boolean z) {
        m21018a0();
        m21020h();
        this.f18574f.write(z ? "true" : "false");
        return this;
    }

    public void close() {
        this.f18574f.close();
        int i = this.f18576h;
        if (i > 1 || (i == 1 && this.f18575g[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f18576h = 0;
    }

    public void flush() {
        if (this.f18576h != 0) {
            this.f18574f.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: m */
    public C2491c mo12381m() {
        m21018a0();
        return m21013I(1, '[');
    }

    /* renamed from: n */
    public C2491c mo12382n() {
        m21018a0();
        return m21013I(3, '{');
    }

    /* renamed from: v */
    public C2491c mo12383v() {
        return m21021u(1, 2, ']');
    }

    /* renamed from: w */
    public C2491c mo12384w() {
        return m21021u(3, 5, '}');
    }

    /* renamed from: z */
    public final boolean mo12385z() {
        return this.f18582n;
    }
}
