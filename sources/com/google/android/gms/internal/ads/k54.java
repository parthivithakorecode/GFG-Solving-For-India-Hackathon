package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public final class k54 {

    /* renamed from: d */
    private static final AtomicLong f9401d = new AtomicLong();

    /* renamed from: a */
    public final li1 f9402a;

    /* renamed from: b */
    public final Uri f9403b;

    /* renamed from: c */
    public final Map<String, List<String>> f9404c;

    public k54(long j, li1 li1, Uri uri, Map<String, List<String>> map, long j2, long j3, long j4) {
        this.f9402a = li1;
        this.f9403b = uri;
        this.f9404c = map;
    }

    /* renamed from: a */
    public static long m12025a() {
        return f9401d.getAndIncrement();
    }
}
