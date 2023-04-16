package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.gn */
public final class C1746gn {

    /* renamed from: a */
    public final List<byte[]> f7531a;

    /* renamed from: b */
    public final int f7532b;

    private C1746gn(List<byte[]> list, int i) {
        this.f7531a = list;
        this.f7532b = i;
    }

    /* renamed from: a */
    public static C1746gn m9842a(C2152rm rmVar) {
        try {
            rmVar.mo10553w(21);
            int g = rmVar.mo10537g() & 3;
            int g2 = rmVar.mo10537g();
            int c = rmVar.mo10533c();
            int i = 0;
            for (int i2 = 0; i2 < g2; i2++) {
                rmVar.mo10553w(1);
                int j = rmVar.mo10540j();
                for (int i3 = 0; i3 < j; i3++) {
                    int j2 = rmVar.mo10540j();
                    i += j2 + 4;
                    rmVar.mo10553w(j2);
                }
            }
            rmVar.mo10552v(c);
            byte[] bArr = new byte[i];
            int i4 = 0;
            for (int i5 = 0; i5 < g2; i5++) {
                rmVar.mo10553w(1);
                int j3 = rmVar.mo10540j();
                for (int i6 = 0; i6 < j3; i6++) {
                    int j4 = rmVar.mo10540j();
                    System.arraycopy(C2078pm.f12700a, 0, bArr, i4, 4);
                    int i7 = i4 + 4;
                    System.arraycopy(rmVar.f13709a, rmVar.mo10533c(), bArr, i7, j4);
                    i4 = i7 + j4;
                    rmVar.mo10553w(j4);
                }
            }
            return new C1746gn(i == 0 ? null : Collections.singletonList(bArr), g + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C1515af("Error parsing HEVC config", e);
        }
    }
}
