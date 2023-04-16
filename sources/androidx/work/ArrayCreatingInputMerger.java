package androidx.work;

import androidx.work.C1239b;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p089m0.C3643h;

public final class ArrayCreatingInputMerger extends C3643h {
    /* renamed from: c */
    private Object m4936c(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        Object newInstance = Array.newInstance(obj2.getClass(), length + 1);
        System.arraycopy(obj, 0, newInstance, 0, length);
        Array.set(newInstance, length, obj2);
        return newInstance;
    }

    /* renamed from: d */
    private Object m4937d(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        int length2 = Array.getLength(obj2);
        Object newInstance = Array.newInstance(obj.getClass().getComponentType(), length + length2);
        System.arraycopy(obj, 0, newInstance, 0, length);
        System.arraycopy(obj2, 0, newInstance, length, length2);
        return newInstance;
    }

    /* renamed from: e */
    private Object m4938e(Object obj, Object obj2) {
        Object newInstance = Array.newInstance(obj.getClass(), 2);
        Array.set(newInstance, 0, obj);
        Array.set(newInstance, 1, obj2);
        return newInstance;
    }

    /* renamed from: f */
    private Object m4939f(Object obj) {
        Object newInstance = Array.newInstance(obj.getClass(), 1);
        Array.set(newInstance, 0, obj);
        return newInstance;
    }

    /* renamed from: b */
    public C1239b mo4439b(List<C1239b> list) {
        C1239b.C1240a aVar = new C1239b.C1240a();
        HashMap hashMap = new HashMap();
        loop0:
        for (C1239b h : list) {
            Iterator<Map.Entry<String, Object>> it = h.mo4503h().entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Map.Entry next = it.next();
                    String str = (String) next.getKey();
                    Object value = next.getValue();
                    Class<?> cls = value.getClass();
                    Object obj = hashMap.get(str);
                    if (obj != null) {
                        Class<?> cls2 = obj.getClass();
                        if (cls2.equals(cls)) {
                            value = cls2.isArray() ? m4937d(obj, value) : m4938e(obj, value);
                        } else if (cls2.isArray() && cls2.getComponentType().equals(cls)) {
                            value = m4936c(obj, value);
                        } else if (cls.isArray() && cls.getComponentType().equals(cls2)) {
                            value = m4936c(value, obj);
                        }
                    } else if (!cls.isArray()) {
                        value = m4939f(value);
                    }
                    hashMap.put(str, value);
                }
            }
            throw new IllegalArgumentException();
        }
        aVar.mo4511d(hashMap);
        return aVar.mo4508a();
    }
}
