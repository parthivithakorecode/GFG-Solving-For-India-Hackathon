package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

public final class yb4 {

    /* renamed from: a */
    private final SparseBooleanArray f17659a;

    /* synthetic */ yb4(SparseBooleanArray sparseBooleanArray, xa4 xa4) {
        this.f17659a = sparseBooleanArray;
    }

    /* renamed from: a */
    public final int mo11986a(int i) {
        wu1.m19202a(i, 0, this.f17659a.size());
        return this.f17659a.keyAt(i);
    }

    /* renamed from: b */
    public final int mo11987b() {
        return this.f17659a.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yb4)) {
            return false;
        }
        yb4 yb4 = (yb4) obj;
        if (n13.f11236a >= 24) {
            return this.f17659a.equals(yb4.f17659a);
        }
        if (this.f17659a.size() != yb4.f17659a.size()) {
            return false;
        }
        for (int i = 0; i < this.f17659a.size(); i++) {
            if (mo11986a(i) != yb4.mo11986a(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (n13.f11236a >= 24) {
            return this.f17659a.hashCode();
        }
        int size = this.f17659a.size();
        for (int i = 0; i < this.f17659a.size(); i++) {
            size = (size * 31) + mo11986a(i);
        }
        return size;
    }
}
