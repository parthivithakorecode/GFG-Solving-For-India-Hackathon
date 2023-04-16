package p086l4;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C3357i;

/* renamed from: l4.t */
final class C3596t implements Map, Serializable {

    /* renamed from: f */
    public static final C3596t f21271f = new C3596t();

    private C3596t() {
    }

    /* renamed from: a */
    public boolean mo14686a(Void voidR) {
        C3357i.m24508e(voidR, "value");
        return false;
    }

    /* renamed from: b */
    public Void get(Object obj) {
        return null;
    }

    /* renamed from: c */
    public Set<Map.Entry> mo14688c() {
        return C3597u.f21272f;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return mo14686a((Void) obj);
    }

    /* renamed from: d */
    public Set<Object> mo14692d() {
        return C3597u.f21272f;
    }

    /* renamed from: e */
    public int mo14693e() {
        return 0;
    }

    public final /* bridge */ Set<Map.Entry> entrySet() {
        return mo14688c();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    /* renamed from: f */
    public Collection mo14696f() {
        return C3595s.f21270f;
    }

    /* renamed from: g */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public final /* bridge */ Set<Object> keySet() {
        return mo14692d();
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo14693e();
    }

    public String toString() {
        return "{}";
    }

    public final /* bridge */ Collection values() {
        return mo14696f();
    }
}
