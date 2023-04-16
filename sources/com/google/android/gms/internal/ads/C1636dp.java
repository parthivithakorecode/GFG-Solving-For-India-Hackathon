package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.dp */
final class C1636dp {

    /* renamed from: a */
    ByteArrayOutputStream f5857a = new ByteArrayOutputStream(4096);

    /* renamed from: b */
    Base64OutputStream f5858b = new Base64OutputStream(this.f5857a, 10);

    public final String toString() {
        String str;
        try {
            this.f5858b.close();
        } catch (IOException e) {
            io0.m11129e("HashManager: Unable to convert to Base64.", e);
        }
        try {
            this.f5857a.close();
            str = this.f5857a.toString();
        } catch (IOException e2) {
            io0.m11129e("HashManager: Unable to convert to Base64.", e2);
            str = "";
        } catch (Throwable th) {
            this.f5857a = null;
            this.f5858b = null;
            throw th;
        }
        this.f5857a = null;
        this.f5858b = null;
        return str;
    }
}
