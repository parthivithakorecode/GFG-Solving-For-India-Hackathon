package com.google.android.gms.internal.ads;

import android.text.TextUtils;

final class i44 {

    /* renamed from: a */
    public final String f8538a;

    /* renamed from: b */
    public final boolean f8539b;

    /* renamed from: c */
    public final boolean f8540c;

    public i44(String str, boolean z, boolean z2) {
        this.f8538a = str;
        this.f8539b = z;
        this.f8540c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == i44.class) {
            i44 i44 = (i44) obj;
            return TextUtils.equals(this.f8538a, i44.f8538a) && this.f8539b == i44.f8539b && this.f8540c == i44.f8540c;
        }
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((this.f8538a.hashCode() + 31) * 31) + (true != this.f8539b ? 1237 : 1231)) * 31;
        if (true == this.f8540c) {
            i = 1231;
        }
        return hashCode + i;
    }
}
