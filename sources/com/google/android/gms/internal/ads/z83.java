package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.CheckForNull;

final class z83<E> extends p73<E> {

    /* renamed from: m */
    private static final Object[] f18108m;

    /* renamed from: n */
    static final z83<Object> f18109n;

    /* renamed from: h */
    final transient Object[] f18110h;

    /* renamed from: i */
    private final transient int f18111i;

    /* renamed from: j */
    final transient Object[] f18112j;

    /* renamed from: k */
    private final transient int f18113k;

    /* renamed from: l */
    private final transient int f18114l;

    static {
        Object[] objArr = new Object[0];
        f18108m = objArr;
        f18109n = new z83(objArr, 0, objArr, 0, 0);
    }

    z83(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f18110h = objArr;
        this.f18111i = i;
        this.f18112j = objArr2;
        this.f18113k = i2;
        this.f18114l = i3;
    }

    public final boolean contains(@CheckForNull Object obj) {
        Object[] objArr = this.f18112j;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int b = w63.m18896b(obj);
        while (true) {
            int i = b & this.f18113k;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            b = i + 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo6858h(Object[] objArr, int i) {
        System.arraycopy(this.f18110h, 0, objArr, i, this.f18114l);
        return i + this.f18114l;
    }

    public final int hashCode() {
        return this.f18111i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final int mo6404i() {
        return this.f18114l;
    }

    public final /* synthetic */ Iterator iterator() {
        return mo6862k().listIterator(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final int mo6405j() {
        return 0;
    }

    /* renamed from: l */
    public final h93<E> mo6863l() {
        return mo6862k().listIterator(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final Object[] mo6407n() {
        return this.f18110h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final e73<E> mo9992p() {
        return e73.m8343r(this.f18110h, this.f18114l);
    }

    public final int size() {
        return this.f18114l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final boolean mo9993v() {
        return true;
    }
}
