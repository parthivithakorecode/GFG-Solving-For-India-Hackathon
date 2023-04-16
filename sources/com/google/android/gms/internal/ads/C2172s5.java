package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.s5 */
public final class C2172s5 {

    /* renamed from: a */
    private final String f14264a;

    /* renamed from: b */
    private final String f14265b;

    public C2172s5(String str, String str2) {
        this.f14264a = str;
        this.f14265b = str2;
    }

    /* renamed from: a */
    public final String mo10727a() {
        return this.f14264a;
    }

    /* renamed from: b */
    public final String mo10728b() {
        return this.f14265b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2172s5.class == obj.getClass()) {
            C2172s5 s5Var = (C2172s5) obj;
            return TextUtils.equals(this.f14264a, s5Var.f14264a) && TextUtils.equals(this.f14265b, s5Var.f14265b);
        }
    }

    public final int hashCode() {
        return (this.f14264a.hashCode() * 31) + this.f14265b.hashCode();
    }

    public final String toString() {
        String str = this.f14264a;
        String str2 = this.f14265b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length());
        sb.append("Header[name=");
        sb.append(str);
        sb.append(",value=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
