package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.l7 */
public abstract class C1915l7 implements C1952m7 {

    /* renamed from: b */
    private static final Logger f9922b = Logger.getLogger(C1915l7.class.getName());

    /* renamed from: a */
    final ThreadLocal<ByteBuffer> f9923a = new C1878k7(this);

    /* renamed from: a */
    public final C2063p7 mo8890a(wu3 wu3, C2100q7 q7Var) {
        int E;
        long j;
        long a = wu3.mo6278a();
        this.f9923a.get().rewind().limit(8);
        do {
            E = wu3.mo6276E(this.f9923a.get());
            if (E == 8) {
                this.f9923a.get().rewind();
                long e = C2026o7.m14345e(this.f9923a.get());
                byte[] bArr = null;
                if (e >= 8 || e <= 1) {
                    byte[] bArr2 = new byte[4];
                    this.f9923a.get().get(bArr2);
                    try {
                        String str = new String(bArr2, "ISO-8859-1");
                        if (e == 1) {
                            this.f9923a.get().limit(16);
                            wu3.mo6276E(this.f9923a.get());
                            this.f9923a.get().position(8);
                            j = C2026o7.m14346f(this.f9923a.get()) - 16;
                        } else {
                            j = e == 0 ? wu3.mo6280c() - wu3.mo6278a() : e - 8;
                        }
                        if ("uuid".equals(str)) {
                            this.f9923a.get().limit(this.f9923a.get().limit() + 16);
                            wu3.mo6276E(this.f9923a.get());
                            bArr = new byte[16];
                            for (int position = this.f9923a.get().position() - 16; position < this.f9923a.get().position(); position++) {
                                bArr[position - (this.f9923a.get().position() - 16)] = this.f9923a.get().get(position);
                            }
                            j -= 16;
                        }
                        long j2 = j;
                        C2063p7 b = mo7383b(str, bArr, q7Var instanceof C2063p7 ? ((C2063p7) q7Var).zza() : "");
                        b.mo9986d(q7Var);
                        this.f9923a.get().rewind();
                        b.mo9987h(wu3, this.f9923a.get(), j2, this);
                        return b;
                    } catch (UnsupportedEncodingException e2) {
                        throw new RuntimeException(e2);
                    }
                } else {
                    Logger logger = f9922b;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(e);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
            }
        } while (E >= 0);
        wu3.mo6279b(a);
        throw new EOFException();
    }

    /* renamed from: b */
    public abstract C2063p7 mo7383b(String str, byte[] bArr, String str2);
}
