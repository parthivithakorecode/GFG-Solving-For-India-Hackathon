package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.interfaces.ECPublicKey;

public final class wm3 implements bd3 {

    /* renamed from: f */
    private static final byte[] f16860f = new byte[0];

    /* renamed from: a */
    private final zm3 f16861a;

    /* renamed from: b */
    private final String f16862b;

    /* renamed from: c */
    private final byte[] f16863c;

    /* renamed from: d */
    private final um3 f16864d;

    /* renamed from: e */
    private final int f16865e;

    public wm3(ECPublicKey eCPublicKey, byte[] bArr, String str, int i, um3 um3) {
        an3.m6135c(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f16861a = new zm3(eCPublicKey);
        this.f16863c = bArr;
        this.f16862b = str;
        this.f16865e = i;
        this.f16864d = um3;
    }

    /* renamed from: a */
    public final byte[] mo5809a(byte[] bArr, byte[] bArr2) {
        ym3 a = this.f16861a.mo12247a(this.f16862b, this.f16863c, bArr2, this.f16864d.zza(), this.f16865e);
        byte[] a2 = this.f16864d.mo8949a(a.mo12052b()).mo9253a(bArr, f16860f);
        byte[] a3 = a.mo12051a();
        return ByteBuffer.allocate(a3.length + a2.length).put(a3).put(a2).array();
    }
}
