package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.lifecycle.d0 */
public abstract class C1081d0 {

    /* renamed from: a */
    private final Map<String, Object> f2965a = new HashMap();

    /* renamed from: b */
    private final Set<Closeable> f2966b = new LinkedHashSet();

    /* renamed from: c */
    private volatile boolean f2967c = false;

    /* renamed from: b */
    private static void m4540b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3820a() {
        this.f2967c = true;
        Map<String, Object> map = this.f2965a;
        if (map != null) {
            synchronized (map) {
                for (Object b : this.f2965a.values()) {
                    m4540b(b);
                }
            }
        }
        Set<Closeable> set = this.f2966b;
        if (set != null) {
            synchronized (set) {
                for (Closeable b2 : this.f2966b) {
                    m4540b(b2);
                }
            }
        }
        mo3657d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public <T> T mo3821c(String str) {
        T t;
        Map<String, Object> map = this.f2965a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = this.f2965a.get(str);
        }
        return t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo3657d() {
    }
}
