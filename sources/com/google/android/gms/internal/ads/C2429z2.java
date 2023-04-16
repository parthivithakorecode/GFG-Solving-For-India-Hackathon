package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.z2 */
final class C2429z2 {

    /* renamed from: f */
    private static final byte[] f17975f = {0, 0, 1};

    /* renamed from: a */
    private boolean f17976a;

    /* renamed from: b */
    private int f17977b;

    /* renamed from: c */
    public int f17978c;

    /* renamed from: d */
    public int f17979d;

    /* renamed from: e */
    public byte[] f17980e = new byte[128];

    public C2429z2(int i) {
    }

    /* renamed from: a */
    public final void mo12131a(byte[] bArr, int i, int i2) {
        if (this.f17976a) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f17980e;
            int length = bArr2.length;
            int i4 = this.f17978c + i3;
            if (length < i4) {
                this.f17980e = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.f17980e, this.f17978c, i3);
            this.f17978c += i3;
        }
    }

    /* renamed from: b */
    public final void mo12132b() {
        this.f17976a = false;
        this.f17978c = 0;
        this.f17977b = 0;
    }

    /* renamed from: c */
    public final boolean mo12133c(int i, int i2) {
        int i3 = this.f17977b;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i == 179 || i == 181) {
                            this.f17978c -= i2;
                            this.f17976a = false;
                            return true;
                        }
                    } else if ((i & 240) == 32) {
                        this.f17979d = this.f17978c;
                        this.f17977b = 4;
                    }
                } else if (i <= 31) {
                    this.f17977b = 3;
                }
            } else if (i == 181) {
                this.f17977b = 2;
            }
            Log.w("H263Reader", "Unexpected start code value");
            mo12132b();
        } else if (i == 176) {
            this.f17977b = 1;
            this.f17976a = true;
        }
        mo12131a(f17975f, 0, 3);
        return false;
    }
}
