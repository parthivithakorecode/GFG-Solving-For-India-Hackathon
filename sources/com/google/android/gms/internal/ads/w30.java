package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

public final class w30 extends e40 {

    /* renamed from: n */
    private static final int f16668n;

    /* renamed from: o */
    private static final int f16669o;

    /* renamed from: p */
    static final int f16670p;

    /* renamed from: q */
    static final int f16671q;

    /* renamed from: f */
    private final String f16672f;

    /* renamed from: g */
    private final List<z30> f16673g = new ArrayList();

    /* renamed from: h */
    private final List<n40> f16674h = new ArrayList();

    /* renamed from: i */
    private final int f16675i;

    /* renamed from: j */
    private final int f16676j;

    /* renamed from: k */
    private final int f16677k;

    /* renamed from: l */
    private final int f16678l;

    /* renamed from: m */
    private final int f16679m;

    static {
        int rgb = Color.rgb(12, 174, 206);
        f16668n = rgb;
        int rgb2 = Color.rgb(204, 204, 204);
        f16669o = rgb2;
        f16670p = rgb2;
        f16671q = rgb;
    }

    public w30(String str, List<z30> list, Integer num, Integer num2, Integer num3, int i, int i2, boolean z) {
        this.f16672f = str;
        for (int i3 = 0; i3 < list.size(); i3++) {
            z30 z30 = list.get(i3);
            this.f16673g.add(z30);
            this.f16674h.add(z30);
        }
        this.f16675i = num != null ? num.intValue() : f16670p;
        this.f16676j = num2 != null ? num2.intValue() : f16671q;
        this.f16677k = num3 != null ? num3.intValue() : 12;
        this.f16678l = i;
        this.f16679m = i2;
    }

    /* renamed from: A5 */
    public final int mo11563A5() {
        return this.f16677k;
    }

    /* renamed from: B5 */
    public final List<z30> mo11564B5() {
        return this.f16673g;
    }

    /* renamed from: a */
    public final int mo11565a() {
        return this.f16678l;
    }

    /* renamed from: b */
    public final int mo11566b() {
        return this.f16676j;
    }

    /* renamed from: c */
    public final int mo11567c() {
        return this.f16679m;
    }

    /* renamed from: e */
    public final String mo6381e() {
        return this.f16672f;
    }

    /* renamed from: f */
    public final List<n40> mo6382f() {
        return this.f16674h;
    }

    /* renamed from: g */
    public final int mo11568g() {
        return this.f16675i;
    }
}
