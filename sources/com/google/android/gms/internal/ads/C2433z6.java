package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.z6 */
public final class C2433z6 {

    /* renamed from: a */
    private final int f18048a;

    /* renamed from: b */
    private final List<C2172s5> f18049b;

    /* renamed from: c */
    private final int f18050c;

    /* renamed from: d */
    private final InputStream f18051d;

    public C2433z6(int i, List<C2172s5> list, int i2, InputStream inputStream) {
        this.f18048a = i;
        this.f18049b = list;
        this.f18050c = i2;
        this.f18051d = inputStream;
    }

    /* renamed from: a */
    public final int mo12156a() {
        return this.f18050c;
    }

    /* renamed from: b */
    public final int mo12157b() {
        return this.f18048a;
    }

    /* renamed from: c */
    public final InputStream mo12158c() {
        InputStream inputStream = this.f18051d;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }

    /* renamed from: d */
    public final List<C2172s5> mo12159d() {
        return Collections.unmodifiableList(this.f18049b);
    }
}
