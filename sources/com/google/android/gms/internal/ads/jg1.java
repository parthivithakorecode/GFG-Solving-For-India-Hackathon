package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

public final class jg1 {

    /* renamed from: a */
    private Uri f9132a;

    /* renamed from: b */
    private final int f9133b = 1;

    /* renamed from: c */
    private Map<String, String> f9134c = Collections.emptyMap();

    /* renamed from: d */
    private long f9135d;

    /* renamed from: e */
    private int f9136e;

    /* renamed from: a */
    public final jg1 mo8456a(int i) {
        this.f9136e = 6;
        return this;
    }

    /* renamed from: b */
    public final jg1 mo8457b(Map<String, String> map) {
        this.f9134c = map;
        return this;
    }

    /* renamed from: c */
    public final jg1 mo8458c(long j) {
        this.f9135d = j;
        return this;
    }

    /* renamed from: d */
    public final jg1 mo8459d(Uri uri) {
        this.f9132a = uri;
        return this;
    }

    /* renamed from: e */
    public final li1 mo8460e() {
        Uri uri = this.f9132a;
        if (uri != null) {
            return new li1(uri, 0, 1, (byte[]) null, this.f9134c, this.f9135d, -1, (String) null, this.f9136e, (Object) null, (kh1) null);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}
