package com.google.android.gms.internal.ads;

import java.util.Map;

public final class x61<AdT> implements y61<AdT> {

    /* renamed from: a */
    private final Map<String, a52<AdT>> f17045a;

    x61(Map<String, a52<AdT>> map) {
        this.f17045a = map;
    }

    /* renamed from: a */
    public final a52<AdT> mo11666a(int i, String str) {
        return this.f17045a.get(str);
    }
}
