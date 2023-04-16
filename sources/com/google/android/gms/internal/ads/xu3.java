package com.google.android.gms.internal.ads;

import android.util.Log;

public final class xu3 extends cv3 {

    /* renamed from: a */
    final String f17357a;

    public xu3(String str) {
        this.f17357a = str;
    }

    /* renamed from: a */
    public final void mo6309a(String str) {
        String str2 = this.f17357a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }
}
