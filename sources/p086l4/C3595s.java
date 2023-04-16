package p086l4;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.C3352d;
import kotlin.jvm.internal.C3357i;

/* renamed from: l4.s */
public final class C3595s implements List, Serializable, RandomAccess {

    /* renamed from: f */
    public static final C3595s f21270f = new C3595s();

    private C3595s() {
    }

    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection collection) {
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
        return mo14664h((Void) obj);
    }

    public boolean containsAll(Collection collection) {
        C3357i.m24508e(collection, "elements");
        return collection.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    /* renamed from: h */
    public boolean mo14664h(Void voidR) {
        C3357i.m24508e(voidR, "element");
        return false;
    }

    public int hashCode() {
        return 1;
    }

    /* renamed from: i */
    public Void get(int i) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i + '.');
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return mo14671k((Void) obj);
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C3594r.f21269f;
    }

    /* renamed from: j */
    public int mo14670j() {
        return 0;
    }

    /* renamed from: k */
    public int mo14671k(Void voidR) {
        C3357i.m24508e(voidR, "element");
        return -1;
    }

    /* renamed from: l */
    public int mo14672l(Void voidR) {
        C3357i.m24508e(voidR, "element");
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return mo14672l((Void) obj);
    }

    public ListIterator listIterator() {
        return C3594r.f21269f;
    }

    public ListIterator listIterator(int i) {
        if (i == 0) {
            return C3594r.f21269f;
        }
        throw new IndexOutOfBoundsException("Index: " + i);
    }

    public /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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

    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo14670j();
    }

    public List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2);
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
