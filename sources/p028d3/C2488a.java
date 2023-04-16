package p028d3;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import p161x2.C4328f;
import p167y2.C4405f;

/* renamed from: d3.a */
public class C2488a implements Closeable {

    /* renamed from: f */
    private final Reader f18546f;

    /* renamed from: g */
    private boolean f18547g = false;

    /* renamed from: h */
    private final char[] f18548h = new char[1024];

    /* renamed from: i */
    private int f18549i = 0;

    /* renamed from: j */
    private int f18550j = 0;

    /* renamed from: k */
    private int f18551k = 0;

    /* renamed from: l */
    private int f18552l = 0;

    /* renamed from: m */
    int f18553m = 0;

    /* renamed from: n */
    private long f18554n;

    /* renamed from: o */
    private int f18555o;

    /* renamed from: p */
    private String f18556p;

    /* renamed from: q */
    private int[] f18557q;

    /* renamed from: r */
    private int f18558r;

    /* renamed from: s */
    private String[] f18559s;

    /* renamed from: t */
    private int[] f18560t;

    /* renamed from: d3.a$a */
    class C2489a extends C4328f {
        C2489a() {
        }

        /* renamed from: a */
        public void mo12365a(C2488a aVar) {
            int i;
            if (aVar instanceof C4405f) {
                ((C4405f) aVar).mo16024l0();
                return;
            }
            int i2 = aVar.f18553m;
            if (i2 == 0) {
                i2 = aVar.mo12362u();
            }
            if (i2 == 13) {
                i = 9;
            } else if (i2 == 12) {
                i = 8;
            } else if (i2 == 14) {
                i = 10;
            } else {
                throw new IllegalStateException("Expected a name but was " + aVar.mo12354V() + aVar.mo12346G());
            }
            aVar.f18553m = i;
        }
    }

    static {
        C4328f.f22660a = new C2489a();
    }

    public C2488a(Reader reader) {
        int[] iArr = new int[32];
        this.f18557q = iArr;
        this.f18558r = 0;
        this.f18558r = 0 + 1;
        iArr[0] = 6;
        this.f18559s = new String[32];
        this.f18560t = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f18546f = reader;
    }

    /* renamed from: F */
    private boolean m20976F(char c) {
        if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (!(c == '/' || c == '=')) {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m20989m();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r1 != '/') goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        r7.f18549i = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        if (r4 != r2) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        r7.f18549i = r4 - 1;
        r2 = m20991z(2);
        r7.f18549i++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0067, code lost:
        if (r2 != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006a, code lost:
        m20989m();
        r2 = r7.f18549i;
        r3 = r0[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0073, code lost:
        if (r3 == '*') goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0075, code lost:
        if (r3 == '/') goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0077, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0078, code lost:
        r7.f18549i = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
        r7.f18549i = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008a, code lost:
        if (m20985c0("*/") == false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0097, code lost:
        throw m20988g0("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0098, code lost:
        r7.f18549i = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009c, code lost:
        if (r1 != '#') goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009e, code lost:
        m20989m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a2, code lost:
        return r1;
     */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m20977Q(boolean r8) {
        /*
            r7 = this;
            char[] r0 = r7.f18548h
        L_0x0002:
            int r1 = r7.f18549i
        L_0x0004:
            int r2 = r7.f18550j
        L_0x0006:
            r3 = 1
            if (r1 != r2) goto L_0x0034
            r7.f18549i = r1
            boolean r1 = r7.m20991z(r3)
            if (r1 != 0) goto L_0x0030
            if (r8 != 0) goto L_0x0015
            r8 = -1
            return r8
        L_0x0015:
            java.io.EOFException r8 = new java.io.EOFException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "End of input"
            r0.append(r1)
            java.lang.String r1 = r7.mo12346G()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L_0x0030:
            int r1 = r7.f18549i
            int r2 = r7.f18550j
        L_0x0034:
            int r4 = r1 + 1
            char r1 = r0[r1]
            r5 = 10
            if (r1 != r5) goto L_0x0044
            int r1 = r7.f18551k
            int r1 = r1 + r3
            r7.f18551k = r1
            r7.f18552l = r4
            goto L_0x00a3
        L_0x0044:
            r5 = 32
            if (r1 == r5) goto L_0x00a3
            r5 = 13
            if (r1 == r5) goto L_0x00a3
            r5 = 9
            if (r1 != r5) goto L_0x0051
            goto L_0x00a3
        L_0x0051:
            r5 = 47
            if (r1 != r5) goto L_0x0098
            r7.f18549i = r4
            r6 = 2
            if (r4 != r2) goto L_0x006a
            int r4 = r4 + -1
            r7.f18549i = r4
            boolean r2 = r7.m20991z(r6)
            int r4 = r7.f18549i
            int r4 = r4 + r3
            r7.f18549i = r4
            if (r2 != 0) goto L_0x006a
            return r1
        L_0x006a:
            r7.m20989m()
            int r2 = r7.f18549i
            char r3 = r0[r2]
            r4 = 42
            if (r3 == r4) goto L_0x0080
            if (r3 == r5) goto L_0x0078
            return r1
        L_0x0078:
            int r2 = r2 + 1
            r7.f18549i = r2
        L_0x007c:
            r7.m20986d0()
            goto L_0x0002
        L_0x0080:
            int r2 = r2 + 1
            r7.f18549i = r2
            java.lang.String r1 = "*/"
            boolean r1 = r7.m20985c0(r1)
            if (r1 == 0) goto L_0x0091
            int r1 = r7.f18549i
            int r1 = r1 + r6
            goto L_0x0004
        L_0x0091:
            java.lang.String r8 = "Unterminated comment"
            java.io.IOException r8 = r7.m20988g0(r8)
            throw r8
        L_0x0098:
            r2 = 35
            r7.f18549i = r4
            if (r1 != r2) goto L_0x00a2
            r7.m20989m()
            goto L_0x007c
        L_0x00a2:
            return r1
        L_0x00a3:
            r1 = r4
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: p028d3.C2488a.m20977Q(boolean):int");
    }

    /* renamed from: S */
    private String m20978S(char c) {
        char[] cArr = this.f18548h;
        StringBuilder sb = null;
        while (true) {
            int i = this.f18549i;
            int i2 = this.f18550j;
            int i3 = i;
            while (true) {
                if (i < i2) {
                    int i4 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.f18549i = i4;
                        int i5 = (i4 - i3) - 1;
                        if (sb == null) {
                            return new String(cArr, i3, i5);
                        }
                        sb.append(cArr, i3, i5);
                        return sb.toString();
                    } else if (c2 == '\\') {
                        this.f18549i = i4;
                        int i6 = (i4 - i3) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i6 + 1) * 2, 16));
                        }
                        sb.append(cArr, i3, i6);
                        sb.append(m20983Z());
                    } else {
                        if (c2 == 10) {
                            this.f18551k++;
                            this.f18552l = i4;
                        }
                        i = i4;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i - i3) * 2, 16));
                    }
                    sb.append(cArr, i3, i - i3);
                    this.f18549i = i;
                    if (!m20991z(1)) {
                        throw m20988g0("Unterminated string");
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        m20989m();
     */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m20979U() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = r0
        L_0x0003:
            int r3 = r6.f18549i
            int r4 = r3 + r2
            int r5 = r6.f18550j
            if (r4 >= r5) goto L_0x004e
            char[] r4 = r6.f18548h
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005c
            r4 = 10
            if (r3 == r4) goto L_0x005c
            r4 = 12
            if (r3 == r4) goto L_0x005c
            r4 = 13
            if (r3 == r4) goto L_0x005c
            r4 = 32
            if (r3 == r4) goto L_0x005c
            r4 = 35
            if (r3 == r4) goto L_0x004a
            r4 = 44
            if (r3 == r4) goto L_0x005c
            r4 = 47
            if (r3 == r4) goto L_0x004a
            r4 = 61
            if (r3 == r4) goto L_0x004a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 58
            if (r3 == r4) goto L_0x005c
            r4 = 59
            if (r3 == r4) goto L_0x004a
            switch(r3) {
                case 91: goto L_0x005c;
                case 92: goto L_0x004a;
                case 93: goto L_0x005c;
                default: goto L_0x0047;
            }
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x004a:
            r6.m20989m()
            goto L_0x005c
        L_0x004e:
            char[] r3 = r6.f18548h
            int r3 = r3.length
            if (r2 >= r3) goto L_0x005e
            int r3 = r2 + 1
            boolean r3 = r6.m20991z(r3)
            if (r3 == 0) goto L_0x005c
            goto L_0x0003
        L_0x005c:
            r0 = r2
            goto L_0x007e
        L_0x005e:
            if (r1 != 0) goto L_0x006b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L_0x006b:
            char[] r3 = r6.f18548h
            int r4 = r6.f18549i
            r1.append(r3, r4, r2)
            int r3 = r6.f18549i
            int r3 = r3 + r2
            r6.f18549i = r3
            r2 = 1
            boolean r2 = r6.m20991z(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007e:
            if (r1 != 0) goto L_0x008a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f18548h
            int r3 = r6.f18549i
            r1.<init>(r2, r3, r0)
            goto L_0x0095
        L_0x008a:
            char[] r2 = r6.f18548h
            int r3 = r6.f18549i
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L_0x0095:
            int r2 = r6.f18549i
            int r2 = r2 + r0
            r6.f18549i = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p028d3.C2488a.m20979U():java.lang.String");
    }

    /* renamed from: W */
    private int m20980W() {
        String str;
        String str2;
        int i;
        char c = this.f18548h[this.f18549i];
        if (c == 't' || c == 'T') {
            i = 5;
            str2 = "true";
            str = "TRUE";
        } else if (c == 'f' || c == 'F') {
            i = 6;
            str2 = "false";
            str = "FALSE";
        } else if (c != 'n' && c != 'N') {
            return 0;
        } else {
            i = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.f18549i + i2 >= this.f18550j && !m20991z(i2 + 1)) {
                return 0;
            }
            char c2 = this.f18548h[this.f18549i + i2];
            if (c2 != str2.charAt(i2) && c2 != str.charAt(i2)) {
                return 0;
            }
        }
        if ((this.f18549i + length < this.f18550j || m20991z(length + 1)) && m20976F(this.f18548h[this.f18549i + length])) {
            return 0;
        }
        this.f18549i += length;
        this.f18553m = i;
        return i;
    }

    /* renamed from: X */
    private int m20981X() {
        int i;
        char c;
        char[] cArr = this.f18548h;
        int i2 = this.f18549i;
        int i3 = this.f18550j;
        int i4 = 0;
        boolean z = true;
        int i5 = 0;
        char c2 = 0;
        boolean z2 = false;
        long j = 0;
        while (true) {
            if (i2 + i5 == i3) {
                if (i5 == cArr.length) {
                    return i4;
                }
                if (!m20991z(i5 + 1)) {
                    break;
                }
                i2 = this.f18549i;
                i3 = this.f18550j;
            }
            c = cArr[i2 + i5];
            char c3 = 3;
            if (c == '+') {
                c3 = 6;
                i4 = 0;
                if (c2 != 5) {
                    return 0;
                }
            } else if (c == 'E' || c == 'e') {
                i4 = 0;
                if (c2 != 2 && c2 != 4) {
                    return 0;
                }
                c2 = 5;
                i5++;
            } else if (c == '-') {
                c3 = 6;
                i4 = 0;
                if (c2 == 0) {
                    c2 = 1;
                    z2 = true;
                    i5++;
                } else if (c2 != 5) {
                    return 0;
                }
            } else if (c == '.') {
                i4 = 0;
                if (c2 != 2) {
                    return 0;
                }
            } else if (c >= '0' && c <= '9') {
                if (c2 == 1 || c2 == 0) {
                    j = (long) (-(c - '0'));
                    c2 = 2;
                } else if (c2 != 2) {
                    if (c2 == 3) {
                        i4 = 0;
                        c2 = 4;
                    } else if (c2 == 5 || c2 == 6) {
                        i4 = 0;
                        c2 = 7;
                    }
                    i5++;
                } else if (j == 0) {
                    return 0;
                } else {
                    long j2 = (10 * j) - ((long) (c - '0'));
                    int i6 = (j > -922337203685477580L ? 1 : (j == -922337203685477580L ? 0 : -1));
                    z &= i6 > 0 || (i6 == 0 && j2 < j);
                    j = j2;
                }
                i4 = 0;
                i5++;
            }
            c2 = c3;
            i5++;
        }
        if (m20976F(c)) {
            return 0;
        }
        if (c2 == 2 && z && ((j != Long.MIN_VALUE || z2) && (j != 0 || !z2))) {
            if (!z2) {
                j = -j;
            }
            this.f18554n = j;
            this.f18549i += i5;
            i = 15;
        } else if (c2 != 2 && c2 != 4 && c2 != 7) {
            return 0;
        } else {
            this.f18555o = i5;
            i = 16;
        }
        this.f18553m = i;
        return i;
    }

    /* renamed from: Y */
    private void m20982Y(int i) {
        int i2 = this.f18558r;
        int[] iArr = this.f18557q;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.f18557q = Arrays.copyOf(iArr, i3);
            this.f18560t = Arrays.copyOf(this.f18560t, i3);
            this.f18559s = (String[]) Arrays.copyOf(this.f18559s, i3);
        }
        int[] iArr2 = this.f18557q;
        int i4 = this.f18558r;
        this.f18558r = i4 + 1;
        iArr2[i4] = i;
    }

    /* renamed from: Z */
    private char m20983Z() {
        int i;
        int i2;
        if (this.f18549i != this.f18550j || m20991z(1)) {
            char[] cArr = this.f18548h;
            int i3 = this.f18549i;
            int i4 = i3 + 1;
            this.f18549i = i4;
            char c = cArr[i3];
            if (c == 10) {
                this.f18551k++;
                this.f18552l = i4;
            } else if (!(c == '\"' || c == '\'' || c == '/' || c == '\\')) {
                if (c == 'b') {
                    return 8;
                }
                if (c == 'f') {
                    return 12;
                }
                if (c == 'n') {
                    return 10;
                }
                if (c == 'r') {
                    return 13;
                }
                if (c == 't') {
                    return 9;
                }
                if (c != 'u') {
                    throw m20988g0("Invalid escape sequence");
                } else if (i4 + 4 <= this.f18550j || m20991z(4)) {
                    char c2 = 0;
                    int i5 = this.f18549i;
                    int i6 = i5 + 4;
                    while (i5 < i6) {
                        char c3 = this.f18548h[i5];
                        char c4 = (char) (c2 << 4);
                        if (c3 < '0' || c3 > '9') {
                            if (c3 >= 'a' && c3 <= 'f') {
                                i = c3 - 'a';
                            } else if (c3 < 'A' || c3 > 'F') {
                                throw new NumberFormatException("\\u" + new String(this.f18548h, this.f18549i, 4));
                            } else {
                                i = c3 - 'A';
                            }
                            i2 = i + 10;
                        } else {
                            i2 = c3 - '0';
                        }
                        c2 = (char) (c4 + i2);
                        i5++;
                    }
                    this.f18549i += 4;
                    return c2;
                } else {
                    throw m20988g0("Unterminated escape sequence");
                }
            }
            return c;
        }
        throw m20988g0("Unterminated escape sequence");
    }

    /* renamed from: b0 */
    private void m20984b0(char c) {
        char[] cArr = this.f18548h;
        while (true) {
            int i = this.f18549i;
            int i2 = this.f18550j;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.f18549i = i3;
                        return;
                    } else if (c2 == '\\') {
                        this.f18549i = i3;
                        m20983Z();
                        break;
                    } else {
                        if (c2 == 10) {
                            this.f18551k++;
                            this.f18552l = i3;
                        }
                        i = i3;
                    }
                } else {
                    this.f18549i = i;
                    if (!m20991z(1)) {
                        throw m20988g0("Unterminated string");
                    }
                }
            }
        }
    }

    /* renamed from: c0 */
    private boolean m20985c0(String str) {
        int length = str.length();
        while (true) {
            int i = 0;
            if (this.f18549i + length > this.f18550j && !m20991z(length)) {
                return false;
            }
            char[] cArr = this.f18548h;
            int i2 = this.f18549i;
            if (cArr[i2] == 10) {
                this.f18551k++;
                this.f18552l = i2 + 1;
            } else {
                while (i < length) {
                    if (this.f18548h[this.f18549i + i] == str.charAt(i)) {
                        i++;
                    }
                }
                return true;
            }
            this.f18549i++;
        }
    }

    /* renamed from: d0 */
    private void m20986d0() {
        char c;
        do {
            if (this.f18549i < this.f18550j || m20991z(1)) {
                char[] cArr = this.f18548h;
                int i = this.f18549i;
                int i2 = i + 1;
                this.f18549i = i2;
                c = cArr[i];
                if (c == 10) {
                    this.f18551k++;
                    this.f18552l = i2;
                    return;
                }
            } else {
                return;
            }
        } while (c != 13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        m20989m();
     */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m20987e0() {
        /*
            r4 = this;
        L_0x0000:
            r0 = 0
        L_0x0001:
            int r1 = r4.f18549i
            int r2 = r1 + r0
            int r3 = r4.f18550j
            if (r2 >= r3) goto L_0x0051
            char[] r2 = r4.f18548h
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L_0x004b
            r2 = 10
            if (r1 == r2) goto L_0x004b
            r2 = 12
            if (r1 == r2) goto L_0x004b
            r2 = 13
            if (r1 == r2) goto L_0x004b
            r2 = 32
            if (r1 == r2) goto L_0x004b
            r2 = 35
            if (r1 == r2) goto L_0x0048
            r2 = 44
            if (r1 == r2) goto L_0x004b
            r2 = 47
            if (r1 == r2) goto L_0x0048
            r2 = 61
            if (r1 == r2) goto L_0x0048
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 58
            if (r1 == r2) goto L_0x004b
            r2 = 59
            if (r1 == r2) goto L_0x0048
            switch(r1) {
                case 91: goto L_0x004b;
                case 92: goto L_0x0048;
                case 93: goto L_0x004b;
                default: goto L_0x0045;
            }
        L_0x0045:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0048:
            r4.m20989m()
        L_0x004b:
            int r1 = r4.f18549i
            int r1 = r1 + r0
            r4.f18549i = r1
            return
        L_0x0051:
            int r1 = r1 + r0
            r4.f18549i = r1
            r0 = 1
            boolean r0 = r4.m20991z(r0)
            if (r0 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p028d3.C2488a.m20987e0():void");
    }

    /* renamed from: g0 */
    private IOException m20988g0(String str) {
        throw new C2492d(str + mo12346G());
    }

    /* renamed from: m */
    private void m20989m() {
        if (!this.f18547g) {
            throw m20988g0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: n */
    private void m20990n() {
        m20977Q(true);
        int i = this.f18549i - 1;
        this.f18549i = i;
        if (i + 5 <= this.f18550j || m20991z(5)) {
            char[] cArr = this.f18548h;
            if (cArr[i] == ')' && cArr[i + 1] == ']' && cArr[i + 2] == '}' && cArr[i + 3] == '\'' && cArr[i + 4] == 10) {
                this.f18549i += 5;
            }
        }
    }

    /* renamed from: z */
    private boolean m20991z(int i) {
        int i2;
        int i3;
        char[] cArr = this.f18548h;
        int i4 = this.f18552l;
        int i5 = this.f18549i;
        this.f18552l = i4 - i5;
        int i6 = this.f18550j;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f18550j = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f18550j = 0;
        }
        this.f18549i = 0;
        do {
            Reader reader = this.f18546f;
            int i8 = this.f18550j;
            int read = reader.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.f18550j + read;
            this.f18550j = i2;
            if (this.f18551k == 0 && (i3 = this.f18552l) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f18549i++;
                this.f18552l = i3 + 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    /* renamed from: B */
    public boolean mo12344B() {
        int i = this.f18553m;
        if (i == 0) {
            i = mo12362u();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    /* renamed from: C */
    public final boolean mo12345C() {
        return this.f18547g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public String mo12346G() {
        return " at line " + (this.f18551k + 1) + " column " + ((this.f18549i - this.f18552l) + 1) + " path " + mo12360r();
    }

    /* renamed from: H */
    public boolean mo12347H() {
        int i = this.f18553m;
        if (i == 0) {
            i = mo12362u();
        }
        if (i == 5) {
            this.f18553m = 0;
            int[] iArr = this.f18560t;
            int i2 = this.f18558r - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f18553m = 0;
            int[] iArr2 = this.f18560t;
            int i3 = this.f18558r - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + mo12354V() + mo12346G());
        }
    }

    /* renamed from: I */
    public double mo12348I() {
        String str;
        int i = this.f18553m;
        if (i == 0) {
            i = mo12362u();
        }
        if (i == 15) {
            this.f18553m = 0;
            int[] iArr = this.f18560t;
            int i2 = this.f18558r - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f18554n;
        }
        if (i == 16) {
            this.f18556p = new String(this.f18548h, this.f18549i, this.f18555o);
            this.f18549i += this.f18555o;
        } else {
            if (i == 8 || i == 9) {
                str = m20978S(i == 8 ? '\'' : '\"');
            } else if (i == 10) {
                str = m20979U();
            } else if (i != 11) {
                throw new IllegalStateException("Expected a double but was " + mo12354V() + mo12346G());
            }
            this.f18556p = str;
        }
        this.f18553m = 11;
        double parseDouble = Double.parseDouble(this.f18556p);
        if (this.f18547g || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f18556p = null;
            this.f18553m = 0;
            int[] iArr2 = this.f18560t;
            int i3 = this.f18558r - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        }
        throw new C2492d("JSON forbids NaN and infinities: " + parseDouble + mo12346G());
    }

    /* renamed from: N */
    public int mo12349N() {
        String S;
        int i = this.f18553m;
        if (i == 0) {
            i = mo12362u();
        }
        if (i == 15) {
            long j = this.f18554n;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f18553m = 0;
                int[] iArr = this.f18560t;
                int i3 = this.f18558r - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.f18554n + mo12346G());
        }
        if (i == 16) {
            this.f18556p = new String(this.f18548h, this.f18549i, this.f18555o);
            this.f18549i += this.f18555o;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                S = m20979U();
            } else {
                S = m20978S(i == 8 ? '\'' : '\"');
            }
            this.f18556p = S;
            try {
                int parseInt = Integer.parseInt(this.f18556p);
                this.f18553m = 0;
                int[] iArr2 = this.f18560t;
                int i4 = this.f18558r - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected an int but was " + mo12354V() + mo12346G());
        }
        this.f18553m = 11;
        double parseDouble = Double.parseDouble(this.f18556p);
        int i5 = (int) parseDouble;
        if (((double) i5) == parseDouble) {
            this.f18556p = null;
            this.f18553m = 0;
            int[] iArr3 = this.f18560t;
            int i6 = this.f18558r - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new NumberFormatException("Expected an int but was " + this.f18556p + mo12346G());
    }

    /* renamed from: O */
    public long mo12350O() {
        String S;
        int i = this.f18553m;
        if (i == 0) {
            i = mo12362u();
        }
        if (i == 15) {
            this.f18553m = 0;
            int[] iArr = this.f18560t;
            int i2 = this.f18558r - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f18554n;
        }
        if (i == 16) {
            this.f18556p = new String(this.f18548h, this.f18549i, this.f18555o);
            this.f18549i += this.f18555o;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                S = m20979U();
            } else {
                S = m20978S(i == 8 ? '\'' : '\"');
            }
            this.f18556p = S;
            try {
                long parseLong = Long.parseLong(this.f18556p);
                this.f18553m = 0;
                int[] iArr2 = this.f18560t;
                int i3 = this.f18558r - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected a long but was " + mo12354V() + mo12346G());
        }
        this.f18553m = 11;
        double parseDouble = Double.parseDouble(this.f18556p);
        long j = (long) parseDouble;
        if (((double) j) == parseDouble) {
            this.f18556p = null;
            this.f18553m = 0;
            int[] iArr3 = this.f18560t;
            int i4 = this.f18558r - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        throw new NumberFormatException("Expected a long but was " + this.f18556p + mo12346G());
    }

    /* renamed from: P */
    public String mo12351P() {
        String str;
        char c;
        int i = this.f18553m;
        if (i == 0) {
            i = mo12362u();
        }
        if (i == 14) {
            str = m20979U();
        } else {
            if (i == 12) {
                c = '\'';
            } else if (i == 13) {
                c = '\"';
            } else {
                throw new IllegalStateException("Expected a name but was " + mo12354V() + mo12346G());
            }
            str = m20978S(c);
        }
        this.f18553m = 0;
        this.f18559s[this.f18558r - 1] = str;
        return str;
    }

    /* renamed from: R */
    public void mo12352R() {
        int i = this.f18553m;
        if (i == 0) {
            i = mo12362u();
        }
        if (i == 7) {
            this.f18553m = 0;
            int[] iArr = this.f18560t;
            int i2 = this.f18558r - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + mo12354V() + mo12346G());
    }

    /* renamed from: T */
    public String mo12353T() {
        String str;
        char c;
        int i = this.f18553m;
        if (i == 0) {
            i = mo12362u();
        }
        if (i == 10) {
            str = m20979U();
        } else {
            if (i == 8) {
                c = '\'';
            } else if (i == 9) {
                c = '\"';
            } else if (i == 11) {
                str = this.f18556p;
                this.f18556p = null;
            } else if (i == 15) {
                str = Long.toString(this.f18554n);
            } else if (i == 16) {
                str = new String(this.f18548h, this.f18549i, this.f18555o);
                this.f18549i += this.f18555o;
            } else {
                throw new IllegalStateException("Expected a string but was " + mo12354V() + mo12346G());
            }
            str = m20978S(c);
        }
        this.f18553m = 0;
        int[] iArr = this.f18560t;
        int i2 = this.f18558r - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: V */
    public C2490b mo12354V() {
        int i = this.f18553m;
        if (i == 0) {
            i = mo12362u();
        }
        switch (i) {
            case 1:
                return C2490b.BEGIN_OBJECT;
            case 2:
                return C2490b.END_OBJECT;
            case 3:
                return C2490b.BEGIN_ARRAY;
            case 4:
                return C2490b.END_ARRAY;
            case 5:
            case 6:
                return C2490b.BOOLEAN;
            case 7:
                return C2490b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return C2490b.STRING;
            case 12:
            case 13:
            case 14:
                return C2490b.NAME;
            case 15:
            case 16:
                return C2490b.NUMBER;
            case 17:
                return C2490b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: a0 */
    public final void mo12355a0(boolean z) {
        this.f18547g = z;
    }

    public void close() {
        this.f18553m = 0;
        this.f18557q[0] = 8;
        this.f18558r = 1;
        this.f18546f.close();
    }

    /* renamed from: d */
    public void mo12357d() {
        int i = this.f18553m;
        if (i == 0) {
            i = mo12362u();
        }
        if (i == 3) {
            m20982Y(1);
            this.f18560t[this.f18558r - 1] = 0;
            this.f18553m = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + mo12354V() + mo12346G());
    }

    /* renamed from: f0 */
    public void mo12358f0() {
        char c;
        int i = 0;
        do {
            int i2 = this.f18553m;
            if (i2 == 0) {
                i2 = mo12362u();
            }
            if (i2 == 3) {
                m20982Y(1);
            } else if (i2 == 1) {
                m20982Y(3);
            } else if (i2 == 4 || i2 == 2) {
                this.f18558r--;
                i--;
                this.f18553m = 0;
            } else if (i2 == 14 || i2 == 10) {
                m20987e0();
                this.f18553m = 0;
            } else {
                if (i2 == 8 || i2 == 12) {
                    c = '\'';
                } else if (i2 == 9 || i2 == 13) {
                    c = '\"';
                } else {
                    if (i2 == 16) {
                        this.f18549i += this.f18555o;
                    }
                    this.f18553m = 0;
                }
                m20984b0(c);
                this.f18553m = 0;
            }
            i++;
            this.f18553m = 0;
        } while (i != 0);
        int[] iArr = this.f18560t;
        int i3 = this.f18558r;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.f18559s[i3 - 1] = "null";
    }

    /* renamed from: h */
    public void mo12359h() {
        int i = this.f18553m;
        if (i == 0) {
            i = mo12362u();
        }
        if (i == 1) {
            m20982Y(3);
            this.f18553m = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + mo12354V() + mo12346G());
    }

    /* renamed from: r */
    public String mo12360r() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = this.f18558r;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f18557q[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.f18560t[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String[] strArr = this.f18559s;
                if (strArr[i2] != null) {
                    sb.append(strArr[i2]);
                }
            }
        }
        return sb.toString();
    }

    public String toString() {
        return getClass().getSimpleName() + mo12346G();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x010c  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo12362u() {
        /*
            r15 = this;
            int[] r0 = r15.f18557q
            int r1 = r15.f18558r
            int r2 = r1 + -1
            r2 = r0[r2]
            r3 = 8
            r4 = 39
            r5 = 34
            r6 = 93
            r7 = 3
            r8 = 7
            r9 = 59
            r10 = 44
            r11 = 4
            r12 = 2
            r13 = 1
            if (r2 != r13) goto L_0x0020
            int r1 = r1 - r13
            r0[r1] = r12
            goto L_0x00a2
        L_0x0020:
            if (r2 != r12) goto L_0x003a
            int r0 = r15.m20977Q(r13)
            if (r0 == r10) goto L_0x00a2
            if (r0 == r9) goto L_0x0036
            if (r0 != r6) goto L_0x002f
            r15.f18553m = r11
            return r11
        L_0x002f:
            java.lang.String r0 = "Unterminated array"
            java.io.IOException r0 = r15.m20988g0(r0)
            throw r0
        L_0x0036:
            r15.m20989m()
            goto L_0x00a2
        L_0x003a:
            r14 = 5
            if (r2 == r7) goto L_0x0117
            if (r2 != r14) goto L_0x0041
            goto L_0x0117
        L_0x0041:
            if (r2 != r11) goto L_0x0076
            int r1 = r1 - r13
            r0[r1] = r14
            int r0 = r15.m20977Q(r13)
            r1 = 58
            if (r0 == r1) goto L_0x00a2
            r1 = 61
            if (r0 != r1) goto L_0x006f
            r15.m20989m()
            int r0 = r15.f18549i
            int r1 = r15.f18550j
            if (r0 < r1) goto L_0x0061
            boolean r0 = r15.m20991z(r13)
            if (r0 == 0) goto L_0x00a2
        L_0x0061:
            char[] r0 = r15.f18548h
            int r1 = r15.f18549i
            char r0 = r0[r1]
            r14 = 62
            if (r0 != r14) goto L_0x00a2
            int r1 = r1 + r13
            r15.f18549i = r1
            goto L_0x00a2
        L_0x006f:
            java.lang.String r0 = "Expected ':'"
            java.io.IOException r0 = r15.m20988g0(r0)
            throw r0
        L_0x0076:
            r0 = 6
            if (r2 != r0) goto L_0x0088
            boolean r0 = r15.f18547g
            if (r0 == 0) goto L_0x0080
            r15.m20990n()
        L_0x0080:
            int[] r0 = r15.f18557q
            int r1 = r15.f18558r
            int r1 = r1 - r13
            r0[r1] = r8
            goto L_0x00a2
        L_0x0088:
            if (r2 != r8) goto L_0x00a0
            r0 = 0
            int r0 = r15.m20977Q(r0)
            r1 = -1
            if (r0 != r1) goto L_0x0097
            r0 = 17
        L_0x0094:
            r15.f18553m = r0
            return r0
        L_0x0097:
            r15.m20989m()
            int r0 = r15.f18549i
            int r0 = r0 - r13
            r15.f18549i = r0
            goto L_0x00a2
        L_0x00a0:
            if (r2 == r3) goto L_0x010f
        L_0x00a2:
            int r0 = r15.m20977Q(r13)
            if (r0 == r5) goto L_0x010c
            if (r0 == r4) goto L_0x0106
            if (r0 == r10) goto L_0x00ef
            if (r0 == r9) goto L_0x00ef
            r1 = 91
            if (r0 == r1) goto L_0x00ec
            if (r0 == r6) goto L_0x00e7
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 == r1) goto L_0x00e4
            int r0 = r15.f18549i
            int r0 = r0 - r13
            r15.f18549i = r0
            int r0 = r15.m20980W()
            if (r0 == 0) goto L_0x00c4
            return r0
        L_0x00c4:
            int r0 = r15.m20981X()
            if (r0 == 0) goto L_0x00cb
            return r0
        L_0x00cb:
            char[] r0 = r15.f18548h
            int r1 = r15.f18549i
            char r0 = r0[r1]
            boolean r0 = r15.m20976F(r0)
            if (r0 == 0) goto L_0x00dd
            r15.m20989m()
            r0 = 10
            goto L_0x0094
        L_0x00dd:
            java.lang.String r0 = "Expected value"
            java.io.IOException r0 = r15.m20988g0(r0)
            throw r0
        L_0x00e4:
            r15.f18553m = r13
            return r13
        L_0x00e7:
            if (r2 != r13) goto L_0x00ef
            r15.f18553m = r11
            return r11
        L_0x00ec:
            r15.f18553m = r7
            return r7
        L_0x00ef:
            if (r2 == r13) goto L_0x00fb
            if (r2 != r12) goto L_0x00f4
            goto L_0x00fb
        L_0x00f4:
            java.lang.String r0 = "Unexpected value"
            java.io.IOException r0 = r15.m20988g0(r0)
            throw r0
        L_0x00fb:
            r15.m20989m()
            int r0 = r15.f18549i
            int r0 = r0 - r13
            r15.f18549i = r0
            r15.f18553m = r8
            return r8
        L_0x0106:
            r15.m20989m()
            r15.f18553m = r3
            return r3
        L_0x010c:
            r0 = 9
            goto L_0x0094
        L_0x010f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "JsonReader is closed"
            r0.<init>(r1)
            throw r0
        L_0x0117:
            int r1 = r1 - r13
            r0[r1] = r11
            r0 = 125(0x7d, float:1.75E-43)
            if (r2 != r14) goto L_0x0135
            int r1 = r15.m20977Q(r13)
            if (r1 == r10) goto L_0x0135
            if (r1 == r9) goto L_0x0132
            if (r1 != r0) goto L_0x012b
            r15.f18553m = r12
            return r12
        L_0x012b:
            java.lang.String r0 = "Unterminated object"
            java.io.IOException r0 = r15.m20988g0(r0)
            throw r0
        L_0x0132:
            r15.m20989m()
        L_0x0135:
            int r1 = r15.m20977Q(r13)
            if (r1 == r5) goto L_0x016a
            if (r1 == r4) goto L_0x0163
            java.lang.String r3 = "Expected name"
            if (r1 == r0) goto L_0x0159
            r15.m20989m()
            int r0 = r15.f18549i
            int r0 = r0 - r13
            r15.f18549i = r0
            char r0 = (char) r1
            boolean r0 = r15.m20976F(r0)
            if (r0 == 0) goto L_0x0154
            r0 = 14
            goto L_0x0094
        L_0x0154:
            java.io.IOException r0 = r15.m20988g0(r3)
            throw r0
        L_0x0159:
            if (r2 == r14) goto L_0x015e
            r15.f18553m = r12
            return r12
        L_0x015e:
            java.io.IOException r0 = r15.m20988g0(r3)
            throw r0
        L_0x0163:
            r15.m20989m()
            r0 = 12
            goto L_0x0094
        L_0x016a:
            r0 = 13
            goto L_0x0094
        */
        throw new UnsupportedOperationException("Method not decompiled: p028d3.C2488a.mo12362u():int");
    }

    /* renamed from: v */
    public void mo12363v() {
        int i = this.f18553m;
        if (i == 0) {
            i = mo12362u();
        }
        if (i == 4) {
            int i2 = this.f18558r - 1;
            this.f18558r = i2;
            int[] iArr = this.f18560t;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f18553m = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + mo12354V() + mo12346G());
    }

    /* renamed from: w */
    public void mo12364w() {
        int i = this.f18553m;
        if (i == 0) {
            i = mo12362u();
        }
        if (i == 2) {
            int i2 = this.f18558r - 1;
            this.f18558r = i2;
            this.f18559s[i2] = null;
            int[] iArr = this.f18560t;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f18553m = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + mo12354V() + mo12346G());
    }
}
