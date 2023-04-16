package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p013b2.C1298a;
import p013b2.C1301c;

public final class f23 extends C1298a {
    public static final Parcelable.Creator<f23> CREATOR = new g23();

    /* renamed from: f */
    public final int f6666f;

    /* renamed from: g */
    private C1509a9 f6667g = null;

    /* renamed from: h */
    private byte[] f6668h;

    f23(int i, byte[] bArr) {
        this.f6666f = i;
        this.f6668h = bArr;
        m8946d();
    }

    /* renamed from: d */
    private final void m8946d() {
        C1509a9 a9Var = this.f6667g;
        if (a9Var == null && this.f6668h != null) {
            return;
        }
        if (a9Var != null && this.f6668h == null) {
            return;
        }
        if (a9Var != null && this.f6668h != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (a9Var == null && this.f6668h == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }

    /* renamed from: c */
    public final C1509a9 mo7218c() {
        if (this.f6667g == null) {
            try {
                this.f6667g = C1509a9.m5958v0(this.f6668h, mp3.m13445a());
                this.f6668h = null;
            } catch (mq3 | NullPointerException e) {
                throw new IllegalStateException(e);
            }
        }
        m8946d();
        return this.f6667g;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1301c.m5213a(parcel);
        C1301c.m5220h(parcel, 1, this.f6666f);
        byte[] bArr = this.f6668h;
        if (bArr == null) {
            bArr = this.f6667g.mo5901b();
        }
        C1301c.m5217e(parcel, 2, bArr, false);
        C1301c.m5214b(parcel, a);
    }
}
