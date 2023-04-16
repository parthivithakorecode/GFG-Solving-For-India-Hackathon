package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class mp3 {

    /* renamed from: b */
    private static volatile mp3 f10989b;

    /* renamed from: c */
    private static volatile mp3 f10990c;

    /* renamed from: d */
    static final mp3 f10991d = new mp3(true);

    /* renamed from: a */
    private final Map<lp3, zp3<?, ?>> f10992a;

    mp3() {
        this.f10992a = new HashMap();
    }

    mp3(boolean z) {
        this.f10992a = Collections.emptyMap();
    }

    /* renamed from: a */
    public static mp3 m13445a() {
        mp3 mp3 = f10989b;
        if (mp3 == null) {
            synchronized (mp3.class) {
                mp3 = f10989b;
                if (mp3 == null) {
                    mp3 = f10991d;
                    f10989b = mp3;
                }
            }
        }
        return mp3;
    }

    /* renamed from: b */
    public static mp3 m13446b() {
        Class<mp3> cls = mp3.class;
        mp3 mp3 = f10990c;
        if (mp3 != null) {
            return mp3;
        }
        synchronized (cls) {
            mp3 mp32 = f10990c;
            if (mp32 != null) {
                return mp32;
            }
            mp3 b = vp3.m18619b(cls);
            f10990c = b;
            return b;
        }
    }

    /* renamed from: c */
    public final <ContainingType extends kr3> zp3<ContainingType, ?> mo9348c(ContainingType containingtype, int i) {
        return this.f10992a.get(new lp3(containingtype, i));
    }
}
