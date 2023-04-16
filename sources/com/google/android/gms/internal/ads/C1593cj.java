package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.cj */
final class C1593cj {

    /* renamed from: a */
    public final String f5424a;

    /* renamed from: b */
    public final boolean f5425b;

    public C1593cj(String str, boolean z) {
        this.f5424a = str;
        this.f5425b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == C1593cj.class) {
            C1593cj cjVar = (C1593cj) obj;
            return TextUtils.equals(this.f5424a, cjVar.f5424a) && this.f5425b == cjVar.f5425b;
        }
    }

    public final int hashCode() {
        String str = this.f5424a;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (true != this.f5425b ? 1237 : 1231);
    }
}
