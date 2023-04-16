package p086l4;

import java.util.Iterator;

/* renamed from: l4.v */
public abstract class C3598v implements Iterator<Integer> {
    /* renamed from: a */
    public abstract int mo14726a();

    public /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(mo14726a());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
