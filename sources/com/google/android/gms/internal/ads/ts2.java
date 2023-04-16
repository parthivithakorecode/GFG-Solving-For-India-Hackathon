package com.google.android.gms.internal.ads;

import java.util.List;
import p054h1.C2694t;

public final class ts2 {

    /* renamed from: a */
    private final rr2 f15040a;

    /* renamed from: b */
    private final ur2 f15041b;

    /* renamed from: c */
    private final o42 f15042c;

    /* renamed from: d */
    private final cy2 f15043d;

    public ts2(o42 o42, cy2 cy2, rr2 rr2, ur2 ur2) {
        this.f15040a = rr2;
        this.f15041b = ur2;
        this.f15042c = o42;
        this.f15043d = cy2;
    }

    /* renamed from: a */
    public final void mo11108a(List<String> list) {
        for (String b : list) {
            mo11109b(b, 2);
        }
    }

    /* renamed from: b */
    public final void mo11109b(String str, int i) {
        if (!this.f15040a.f13897g0) {
            this.f15043d.mo6339b(str);
            return;
        }
        this.f15042c.mo9649n(new q42(C2694t.m21592a().mo12462a(), this.f15041b.f15729b, str, i));
    }

    /* renamed from: c */
    public final void mo11110c(List<String> list, int i) {
        for (String b : list) {
            mo11109b(b, i);
        }
    }
}
