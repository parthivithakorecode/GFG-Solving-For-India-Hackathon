package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p146v.C4163b;

/* renamed from: androidx.emoji2.text.l */
class C0932l {

    /* renamed from: androidx.emoji2.text.l$a */
    private static class C0933a implements C0935c {

        /* renamed from: a */
        private final ByteBuffer f2446a;

        C0933a(ByteBuffer byteBuffer) {
            this.f2446a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public void mo3163a(int i) {
            ByteBuffer byteBuffer = this.f2446a;
            byteBuffer.position(byteBuffer.position() + i);
        }

        /* renamed from: b */
        public int mo3164b() {
            return C0932l.m3808d(this.f2446a.getShort());
        }

        /* renamed from: c */
        public long mo3165c() {
            return C0932l.m3807c(this.f2446a.getInt());
        }

        /* renamed from: d */
        public int mo3166d() {
            return this.f2446a.getInt();
        }

        /* renamed from: e */
        public long mo3167e() {
            return (long) this.f2446a.position();
        }
    }

    /* renamed from: androidx.emoji2.text.l$b */
    private static class C0934b {

        /* renamed from: a */
        private final long f2447a;

        /* renamed from: b */
        private final long f2448b;

        C0934b(long j, long j2) {
            this.f2447a = j;
            this.f2448b = j2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public long mo3168a() {
            return this.f2447a;
        }
    }

    /* renamed from: androidx.emoji2.text.l$c */
    private interface C0935c {
        /* renamed from: a */
        void mo3163a(int i);

        /* renamed from: b */
        int mo3164b();

        /* renamed from: c */
        long mo3165c();

        /* renamed from: d */
        int mo3166d();

        /* renamed from: e */
        long mo3167e();
    }

    /* renamed from: a */
    private static C0934b m3805a(C0935c cVar) {
        long j;
        cVar.mo3163a(4);
        int b = cVar.mo3164b();
        if (b <= 100) {
            cVar.mo3163a(6);
            int i = 0;
            while (true) {
                if (i >= b) {
                    j = -1;
                    break;
                }
                int d = cVar.mo3166d();
                cVar.mo3163a(4);
                j = cVar.mo3165c();
                cVar.mo3163a(4);
                if (1835365473 == d) {
                    break;
                }
                i++;
            }
            if (j != -1) {
                cVar.mo3163a((int) (j - cVar.mo3167e()));
                cVar.mo3163a(12);
                long c = cVar.mo3165c();
                for (int i2 = 0; ((long) i2) < c; i2++) {
                    int d2 = cVar.mo3166d();
                    long c2 = cVar.mo3165c();
                    long c3 = cVar.mo3165c();
                    if (1164798569 == d2 || 1701669481 == d2) {
                        return new C0934b(c2 + j, c3);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    /* renamed from: b */
    static C4163b m3806b(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) m3805a(new C0933a(duplicate)).mo3168a());
        return C4163b.m26589h(duplicate);
    }

    /* renamed from: c */
    static long m3807c(int i) {
        return ((long) i) & 4294967295L;
    }

    /* renamed from: d */
    static int m3808d(short s) {
        return s & 65535;
    }
}
