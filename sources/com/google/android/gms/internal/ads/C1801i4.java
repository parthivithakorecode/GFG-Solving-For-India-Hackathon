package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.i4 */
public final class C1801i4 {

    /* renamed from: a */
    public final int f8530a;

    /* renamed from: b */
    public final String f8531b;

    /* renamed from: c */
    public final List<C1764h4> f8532c;

    /* renamed from: d */
    public final byte[] f8533d;

    public C1801i4(int i, String str, List<C1764h4> list, byte[] bArr) {
        this.f8530a = i;
        this.f8531b = str;
        this.f8532c = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f8533d = bArr;
    }
}
