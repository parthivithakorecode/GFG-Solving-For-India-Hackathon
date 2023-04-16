package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;
import p054h1.C2694t;

public final class lj2<T> {

    /* renamed from: a */
    private final Set<ij2<? extends hj2<T>>> f10069a;

    /* renamed from: b */
    private final Executor f10070b;

    public lj2(Executor executor, Set<ij2<? extends hj2<T>>> set) {
        this.f10070b = executor;
        this.f10069a = set;
    }

    /* renamed from: a */
    public final cc3<T> mo8966a(T t) {
        ArrayList arrayList = new ArrayList(this.f10069a.size());
        for (ij2 next : this.f10069a) {
            cc3 a = next.mo5813a();
            if (d30.f5631a.mo9928e().booleanValue()) {
                a.mo5905b(new jj2(next, C2694t.m21592a().mo12463b()), wo0.f16891f);
            }
            arrayList.add(a);
        }
        return rb3.m16125c(arrayList).mo10266a(new kj2(arrayList, t), this.f10070b);
    }
}
