package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

public abstract class qu3 implements C2063p7 {

    /* renamed from: o */
    private static final cv3 f13314o = cv3.m7583b(qu3.class);

    /* renamed from: f */
    protected final String f13315f;

    /* renamed from: g */
    private C2100q7 f13316g;

    /* renamed from: h */
    boolean f13317h;

    /* renamed from: i */
    boolean f13318i;

    /* renamed from: j */
    private ByteBuffer f13319j;

    /* renamed from: k */
    long f13320k;

    /* renamed from: l */
    long f13321l = -1;

    /* renamed from: m */
    wu3 f13322m;

    /* renamed from: n */
    private ByteBuffer f13323n = null;

    protected qu3(String str) {
        this.f13315f = str;
        this.f13318i = true;
        this.f13317h = true;
    }

    /* renamed from: a */
    private final synchronized void m15888a() {
        if (!this.f13318i) {
            try {
                cv3 cv3 = f13314o;
                String str = this.f13315f;
                cv3.mo6309a(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                this.f13319j = this.f13322m.mo6277K(this.f13320k, this.f13321l);
                this.f13318i = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo10398b(ByteBuffer byteBuffer);

    /* renamed from: c */
    public final synchronized void mo10399c() {
        m15888a();
        cv3 cv3 = f13314o;
        String str = this.f13315f;
        cv3.mo6309a(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
        ByteBuffer byteBuffer = this.f13319j;
        if (byteBuffer != null) {
            this.f13317h = true;
            byteBuffer.rewind();
            mo10398b(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.f13323n = byteBuffer.slice();
            }
            this.f13319j = null;
        }
    }

    /* renamed from: d */
    public final void mo9986d(C2100q7 q7Var) {
        this.f13316g = q7Var;
    }

    /* renamed from: h */
    public final void mo9987h(wu3 wu3, ByteBuffer byteBuffer, long j, C1952m7 m7Var) {
        this.f13320k = wu3.mo6278a();
        byteBuffer.remaining();
        this.f13321l = j;
        this.f13322m = wu3;
        wu3.mo6279b(wu3.mo6278a() + j);
        this.f13318i = false;
        this.f13317h = false;
        mo10399c();
    }

    public final String zza() {
        return this.f13315f;
    }
}
