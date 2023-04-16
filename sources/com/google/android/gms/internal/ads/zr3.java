package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

final class zr3 {

    /* renamed from: a */
    private final ArrayDeque<uo3> f18342a = new ArrayDeque<>();

    /* synthetic */ zr3(yr3 yr3) {
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ uo3 m20816a(zr3 zr3, uo3 uo3, uo3 uo32) {
        zr3.m20817b(uo3);
        zr3.m20817b(uo32);
        uo3 pop = zr3.f18342a.pop();
        while (!zr3.f18342a.isEmpty()) {
            pop = new ds3(zr3.f18342a.pop(), pop);
        }
        return pop;
    }

    /* renamed from: b */
    private final void m20817b(uo3 uo3) {
        if (uo3.mo6630s()) {
            int c = m20818c(uo3.mo6627p());
            int R = ds3.m8068R(c + 1);
            if (this.f18342a.isEmpty() || this.f18342a.peek().mo6627p() >= R) {
                this.f18342a.push(uo3);
                return;
            }
            int R2 = ds3.m8068R(c);
            uo3 pop = this.f18342a.pop();
            while (!this.f18342a.isEmpty() && this.f18342a.peek().mo6627p() < R2) {
                pop = new ds3(this.f18342a.pop(), pop);
            }
            ds3 ds3 = new ds3(pop, uo3);
            while (!this.f18342a.isEmpty() && this.f18342a.peek().mo6627p() < ds3.m8068R(m20818c(ds3.mo6627p()) + 1)) {
                ds3 = new ds3(this.f18342a.pop(), ds3);
            }
            this.f18342a.push(ds3);
        } else if (uo3 instanceof ds3) {
            ds3 ds32 = (ds3) uo3;
            m20817b(ds32.f5907k);
            m20817b(ds32.f5908l);
        } else {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(uo3.getClass())));
        }
    }

    /* renamed from: c */
    private static final int m20818c(int i) {
        int binarySearch = Arrays.binarySearch(ds3.f5905o, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }
}
