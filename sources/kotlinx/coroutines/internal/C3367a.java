package kotlinx.coroutines.internal;

import java.util.Objects;

/* renamed from: kotlinx.coroutines.internal.a */
public class C3367a<T> {

    /* renamed from: a */
    private Object[] f20851a = new Object[16];

    /* renamed from: b */
    private int f20852b;

    /* renamed from: c */
    private int f20853c;

    /* renamed from: b */
    private final void m24540b() {
        Object[] objArr = this.f20851a;
        int length = objArr.length;
        Object[] objArr2 = new Object[(length << 1)];
        Object[] objArr3 = objArr2;
        Object[] unused = C3577d.m24990c(objArr, objArr3, 0, this.f20852b, 0, 10, (Object) null);
        Object[] objArr4 = this.f20851a;
        int length2 = objArr4.length;
        int i = this.f20852b;
        Object[] unused2 = C3577d.m24990c(objArr4, objArr2, length2 - i, 0, i, 4, (Object) null);
        this.f20851a = objArr3;
        this.f20852b = 0;
        this.f20853c = length;
    }

    /* renamed from: a */
    public final void mo14396a(T t) {
        Object[] objArr = this.f20851a;
        int i = this.f20853c;
        objArr[i] = t;
        int length = (objArr.length - 1) & (i + 1);
        this.f20853c = length;
        if (length == this.f20852b) {
            m24540b();
        }
    }

    /* renamed from: c */
    public final boolean mo14397c() {
        return this.f20852b == this.f20853c;
    }

    /* renamed from: d */
    public final T mo14398d() {
        int i = this.f20852b;
        if (i == this.f20853c) {
            return null;
        }
        T[] tArr = this.f20851a;
        T t = tArr[i];
        tArr[i] = null;
        this.f20852b = (i + 1) & (tArr.length - 1);
        Objects.requireNonNull(t, "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
        return t;
    }
}
