package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* renamed from: com.google.android.gms.internal.ads.s7 */
public final class C2174s7 extends tu3 {

    /* renamed from: q */
    private Date f14284q;

    /* renamed from: r */
    private Date f14285r;

    /* renamed from: s */
    private long f14286s;

    /* renamed from: t */
    private long f14287t;

    /* renamed from: u */
    private double f14288u = 1.0d;

    /* renamed from: v */
    private float f14289v = 1.0f;

    /* renamed from: w */
    private dv3 f14290w = dv3.f5937j;

    /* renamed from: x */
    private long f14291x;

    public C2174s7() {
        super("mvhd");
    }

    /* renamed from: b */
    public final void mo10398b(ByteBuffer byteBuffer) {
        long j;
        mo11120f(byteBuffer);
        if (mo11119e() == 1) {
            this.f14284q = yu3.m20324a(C2026o7.m14346f(byteBuffer));
            this.f14285r = yu3.m20324a(C2026o7.m14346f(byteBuffer));
            this.f14286s = C2026o7.m14345e(byteBuffer);
            j = C2026o7.m14346f(byteBuffer);
        } else {
            this.f14284q = yu3.m20324a(C2026o7.m14345e(byteBuffer));
            this.f14285r = yu3.m20324a(C2026o7.m14345e(byteBuffer));
            this.f14286s = C2026o7.m14345e(byteBuffer);
            j = C2026o7.m14345e(byteBuffer);
        }
        this.f14287t = j;
        this.f14288u = C2026o7.m14342b(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.f14289v = ((float) ((short) ((bArr[1] & 255) | ((short) ((bArr[0] << 8) & 65280))))) / 256.0f;
        C2026o7.m14344d(byteBuffer);
        C2026o7.m14345e(byteBuffer);
        C2026o7.m14345e(byteBuffer);
        double b = C2026o7.m14342b(byteBuffer);
        double b2 = C2026o7.m14342b(byteBuffer);
        double a = C2026o7.m14341a(byteBuffer);
        this.f14290w = new dv3(b, b2, C2026o7.m14342b(byteBuffer), C2026o7.m14342b(byteBuffer), a, C2026o7.m14341a(byteBuffer), C2026o7.m14341a(byteBuffer), C2026o7.m14342b(byteBuffer), C2026o7.m14342b(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.f14291x = C2026o7.m14345e(byteBuffer);
    }

    /* renamed from: g */
    public final long mo10739g() {
        return this.f14287t;
    }

    /* renamed from: i */
    public final long mo10740i() {
        return this.f14286s;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.f14284q + ";modificationTime=" + this.f14285r + ";timescale=" + this.f14286s + ";duration=" + this.f14287t + ";rate=" + this.f14288u + ";volume=" + this.f14289v + ";matrix=" + this.f14290w + ";nextTrackId=" + this.f14291x + "]";
    }
}
