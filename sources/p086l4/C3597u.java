package p086l4;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.C3352d;
import kotlin.jvm.internal.C3357i;

/* renamed from: l4.u */
public final class C3597u implements Set, Serializable {

    /* renamed from: f */
    public static final C3597u f21272f = new C3597u();

    private C3597u() {
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return mo14714h((Void) obj);
    }

    public boolean containsAll(Collection collection) {
        C3357i.m24508e(collection, "elements");
        return collection.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    /* renamed from: h */
    public boolean mo14714h(Void voidR) {
        C3357i.m24508e(voidR, "element");
        return false;
    }

    public int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public int mo14716i() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C3594r.f21269f;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo14716i();
    }

    public Object[] toArray() {
        return C3352d.m24502a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        C3357i.m24508e(tArr, "array");
        return C3352d.m24503b(this, tArr);
    }

    public String toString() {
        return "[]";
    }
}
