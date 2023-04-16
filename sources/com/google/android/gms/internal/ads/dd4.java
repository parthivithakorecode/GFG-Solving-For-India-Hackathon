package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class dd4 {

    /* renamed from: a */
    public final int f5762a;

    /* renamed from: b */
    public final int f5763b;

    /* renamed from: c */
    public final int f5764c;

    /* renamed from: d */
    public final int f5765d;

    /* renamed from: e */
    public final int f5766e;

    /* renamed from: f */
    public final int f5767f;

    /* renamed from: g */
    public final int f5768g;

    /* renamed from: h */
    public final int f5769h;

    /* renamed from: i */
    public final int f5770i;

    /* renamed from: j */
    public final long f5771j;

    /* renamed from: k */
    public final cd4 f5772k;

    /* renamed from: l */
    private final c91 f5773l;

    private dd4(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, cd4 cd4, c91 c91) {
        this.f5762a = i;
        this.f5763b = i2;
        this.f5764c = i3;
        this.f5765d = i4;
        this.f5766e = i5;
        this.f5767f = m7841i(i5);
        this.f5768g = i6;
        this.f5769h = i7;
        this.f5770i = m7840h(i7);
        this.f5771j = j;
        this.f5772k = cd4;
        this.f5773l = c91;
    }

    public dd4(byte[] bArr, int i) {
        cq2 cq2 = new cq2(bArr, bArr.length);
        cq2.mo6267h(i * 8);
        this.f5762a = cq2.mo6262c(16);
        this.f5763b = cq2.mo6262c(16);
        this.f5764c = cq2.mo6262c(24);
        this.f5765d = cq2.mo6262c(24);
        int c = cq2.mo6262c(20);
        this.f5766e = c;
        this.f5767f = m7841i(c);
        this.f5768g = cq2.mo6262c(3) + 1;
        int c2 = cq2.mo6262c(5) + 1;
        this.f5769h = c2;
        this.f5770i = m7840h(c2);
        this.f5771j = n13.m13625b0(cq2.mo6262c(4), cq2.mo6262c(32));
        this.f5772k = null;
        this.f5773l = null;
    }

    /* renamed from: h */
    private static int m7840h(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    /* renamed from: i */
    private static int m7841i(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* renamed from: j */
    private static c91 m7842j(List<String> list, List<af4> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String[] E = n13.m13600E(str, "=");
            if (E.length != 2) {
                String valueOf = String.valueOf(str);
                Log.w("FlacStreamMetadata", valueOf.length() != 0 ? "Failed to parse Vorbis comment: ".concat(valueOf) : new String("Failed to parse Vorbis comment: "));
            } else {
                arrayList.add(new df4(E[0], E[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c91((List<? extends b81>) arrayList);
    }

    /* renamed from: a */
    public final long mo6453a() {
        long j = this.f5771j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.f5766e);
    }

    /* renamed from: b */
    public final long mo6454b(long j) {
        return n13.m13616U((j * ((long) this.f5766e)) / 1000000, 0, this.f5771j - 1);
    }

    /* renamed from: c */
    public final C1574c0 mo6455c(byte[] bArr, c91 c91) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.f5765d;
        if (i <= 0) {
            i = -1;
        }
        c91 d = mo6456d(c91);
        bf4 bf4 = new bf4();
        bf4.mo5842s("audio/flac");
        bf4.mo5835l(i);
        bf4.mo5825e0(this.f5768g);
        bf4.mo5843t(this.f5766e);
        bf4.mo5832i(Collections.singletonList(bArr));
        bf4.mo5836m(d);
        return bf4.mo5848y();
    }

    /* renamed from: d */
    public final c91 mo6456d(c91 c91) {
        c91 c912 = this.f5773l;
        return c912 == null ? c91 : c912.mo6090e(c91);
    }

    /* renamed from: e */
    public final dd4 mo6457e(List<af4> list) {
        return new dd4(this.f5762a, this.f5763b, this.f5764c, this.f5765d, this.f5766e, this.f5768g, this.f5769h, this.f5771j, this.f5772k, mo6456d(m7842j(Collections.emptyList(), list)));
    }

    /* renamed from: f */
    public final dd4 mo6458f(cd4 cd4) {
        return new dd4(this.f5762a, this.f5763b, this.f5764c, this.f5765d, this.f5766e, this.f5768g, this.f5769h, this.f5771j, cd4, this.f5773l);
    }

    /* renamed from: g */
    public final dd4 mo6459g(List<String> list) {
        return new dd4(this.f5762a, this.f5763b, this.f5764c, this.f5765d, this.f5766e, this.f5768g, this.f5769h, this.f5771j, this.f5772k, mo6456d(m7842j(list, Collections.emptyList())));
    }
}
