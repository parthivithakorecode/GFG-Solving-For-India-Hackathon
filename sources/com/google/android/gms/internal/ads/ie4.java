package com.google.android.gms.internal.ads;

import java.util.Collections;

final class ie4 extends ne4 {

    /* renamed from: e */
    private static final int[] f8633e = {5512, 11025, 22050, 44100};

    /* renamed from: b */
    private boolean f8634b;

    /* renamed from: c */
    private boolean f8635c;

    /* renamed from: d */
    private int f8636d;

    public ie4(td4 td4) {
        super(td4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo8133a(dr2 dr2) {
        bf4 bf4;
        int i;
        if (!this.f8634b) {
            int s = dr2.mo6593s();
            int i2 = s >> 4;
            this.f8636d = i2;
            if (i2 == 2) {
                i = f8633e[(s >> 2) & 3];
                bf4 = new bf4();
                bf4.mo5842s("audio/mpeg");
                bf4.mo5825e0(1);
            } else if (i2 == 7 || i2 == 8) {
                String str = i2 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                bf4 = new bf4();
                bf4.mo5842s(str);
                bf4.mo5825e0(1);
                i = 8000;
            } else {
                if (i2 != 10) {
                    StringBuilder sb = new StringBuilder(39);
                    sb.append("Audio format not supported: ");
                    sb.append(i2);
                    throw new me4(sb.toString());
                }
                this.f8634b = true;
            }
            bf4.mo5843t(i);
            this.f11434a.mo7873b(bf4.mo5848y());
            this.f8635c = true;
            this.f8634b = true;
        } else {
            dr2.mo6581g(1);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo8134b(dr2 dr2, long j) {
        if (this.f8636d == 2) {
            int i = dr2.mo6583i();
            this.f11434a.mo7876e(dr2, i);
            this.f11434a.mo7872a(j, 1, i, 0, (sd4) null);
            return true;
        }
        int s = dr2.mo6593s();
        if (s == 0 && !this.f8635c) {
            int i2 = dr2.mo6583i();
            byte[] bArr = new byte[i2];
            dr2.mo6576b(bArr, 0, i2);
            pb4 a = qb4.m15554a(bArr);
            bf4 bf4 = new bf4();
            bf4.mo5842s("audio/mp4a-latm");
            bf4.mo5827f0(a.f12599c);
            bf4.mo5825e0(a.f12598b);
            bf4.mo5843t(a.f12597a);
            bf4.mo5832i(Collections.singletonList(bArr));
            this.f11434a.mo7873b(bf4.mo5848y());
            this.f8635c = true;
            return false;
        } else if (this.f8636d == 10 && s != 1) {
            return false;
        } else {
            int i3 = dr2.mo6583i();
            this.f11434a.mo7876e(dr2, i3);
            this.f11434a.mo7872a(j, 1, i3, 0, (sd4) null);
            return true;
        }
    }
}
