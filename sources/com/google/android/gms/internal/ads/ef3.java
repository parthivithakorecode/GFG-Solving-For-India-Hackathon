package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;

public final class ef3 {

    /* renamed from: c */
    public static final ef3 f6200c = new ef3(0, 0, 1, 1, (zn2) null);

    /* renamed from: d */
    public static final my3<ef3> f6201d = yw1.f17914a;

    /* renamed from: a */
    public final int f6202a = 1;

    /* renamed from: b */
    private AudioAttributes f6203b;

    /* synthetic */ ef3(int i, int i2, int i3, int i4, zn2 zn2) {
    }

    /* renamed from: a */
    public final AudioAttributes mo6942a() {
        if (this.f6203b == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
            if (n13.f11236a >= 29) {
                usage.setAllowedCapturePolicy(1);
            }
            this.f6203b = usage.build();
        }
        return this.f6203b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ef3.class != obj.getClass()) {
            return false;
        }
        ef3 ef3 = (ef3) obj;
        return true;
    }

    public final int hashCode() {
        return 15699889;
    }
}
