package p161x2;

import java.io.Writer;
import p028d3.C2491c;
import p149v2.C4215k;
import p167y2.C4425n;

/* renamed from: x2.l */
public final class C4341l {

    /* renamed from: x2.l$a */
    private static final class C4342a extends Writer {

        /* renamed from: f */
        private final Appendable f22686f;

        /* renamed from: g */
        private final C4343a f22687g = new C4343a();

        /* renamed from: x2.l$a$a */
        static class C4343a implements CharSequence {

            /* renamed from: f */
            char[] f22688f;

            C4343a() {
            }

            public char charAt(int i) {
                return this.f22688f[i];
            }

            public int length() {
                return this.f22688f.length;
            }

            public CharSequence subSequence(int i, int i2) {
                return new String(this.f22688f, i, i2 - i);
            }
        }

        C4342a(Appendable appendable) {
            this.f22686f = appendable;
        }

        public void close() {
        }

        public void flush() {
        }

        public void write(int i) {
            this.f22686f.append((char) i);
        }

        public void write(char[] cArr, int i, int i2) {
            C4343a aVar = this.f22687g;
            aVar.f22688f = cArr;
            this.f22686f.append(aVar, i, i2 + i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        throw new p149v2.C4216l((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        throw new p149v2.C4223s((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        return p149v2.C4217m.f22503a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0030, code lost:
        throw new p149v2.C4223s((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        throw new p149v2.C4223s((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016 A[ExcHandler: IOException (r2v5 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[ExcHandler: d (r2v4 'e' d3.d A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f A[ExcHandler: NumberFormatException (r2v6 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p149v2.C4215k m26964a(p028d3.C2488a r2) {
        /*
            r2.mo12354V()     // Catch:{ EOFException -> 0x0024, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            r0 = 0
            v2.w<v2.k> r1 = p167y2.C4425n.f22836U     // Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            java.lang.Object r2 = r1.mo4624c(r2)     // Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            v2.k r2 = (p149v2.C4215k) r2     // Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            return r2
        L_0x000d:
            r2 = move-exception
            goto L_0x0026
        L_0x000f:
            r2 = move-exception
            v2.s r0 = new v2.s
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0016:
            r2 = move-exception
            v2.l r0 = new v2.l
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x001d:
            r2 = move-exception
            v2.s r0 = new v2.s
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0024:
            r2 = move-exception
            r0 = 1
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            v2.m r2 = p149v2.C4217m.f22503a
            return r2
        L_0x002b:
            v2.s r0 = new v2.s
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p161x2.C4341l.m26964a(d3.a):v2.k");
    }

    /* renamed from: b */
    public static void m26965b(C4215k kVar, C2491c cVar) {
        C4425n.f22836U.mo4625e(cVar, kVar);
    }

    /* renamed from: c */
    public static Writer m26966c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new C4342a(appendable);
    }
}
