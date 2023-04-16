package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

public final class c91 implements Parcelable {
    public static final Parcelable.Creator<c91> CREATOR = new a71();

    /* renamed from: f */
    private final b81[] f5340f;

    c91(Parcel parcel) {
        this.f5340f = new b81[parcel.readInt()];
        int i = 0;
        while (true) {
            b81[] b81Arr = this.f5340f;
            if (i < b81Arr.length) {
                b81Arr[i] = (b81) parcel.readParcelable(b81.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }

    public c91(List<? extends b81> list) {
        this.f5340f = (b81[]) list.toArray(new b81[0]);
    }

    public c91(b81... b81Arr) {
        this.f5340f = b81Arr;
    }

    /* renamed from: b */
    public final int mo6086b() {
        return this.f5340f.length;
    }

    /* renamed from: c */
    public final b81 mo6087c(int i) {
        return this.f5340f[i];
    }

    /* renamed from: d */
    public final c91 mo6088d(b81... b81Arr) {
        return b81Arr.length == 0 ? this : new c91((b81[]) n13.m13653z(this.f5340f, b81Arr));
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final c91 mo6090e(c91 c91) {
        return c91 == null ? this : mo6088d(c91.f5340f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c91.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f5340f, ((c91) obj).f5340f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5340f);
    }

    public final String toString() {
        String valueOf = String.valueOf(Arrays.toString(this.f5340f));
        return valueOf.length() != 0 ? "entries=".concat(valueOf) : new String("entries=");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5340f.length);
        for (b81 writeParcelable : this.f5340f) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
