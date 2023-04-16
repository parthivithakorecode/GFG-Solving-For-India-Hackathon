package p094m5;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p080k5.C3334d;

/* renamed from: m5.i */
public abstract class C3738i {

    /* renamed from: a */
    private static final CopyOnWriteArrayList<C3738i> f21571a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    private static final ConcurrentMap<String, C3738i> f21572b = new ConcurrentHashMap(512, 0.75f, 2);

    static {
        C3735h.m25472a();
    }

    protected C3738i() {
    }

    /* renamed from: a */
    public static Set<String> m25477a() {
        return Collections.unmodifiableSet(f21572b.keySet());
    }

    /* renamed from: b */
    private static C3738i m25478b(String str) {
        ConcurrentMap<String, C3738i> concurrentMap = f21572b;
        C3738i iVar = (C3738i) concurrentMap.get(str);
        if (iVar != null) {
            return iVar;
        }
        if (concurrentMap.isEmpty()) {
            throw new C3734g("No time-zone data files registered");
        }
        throw new C3734g("Unknown time-zone ID: " + str);
    }

    /* renamed from: c */
    public static C3732f m25479c(String str, boolean z) {
        C3334d.m24473i(str, "zoneId");
        return m25478b(str).mo14918d(str, z);
    }

    /* renamed from: f */
    public static void m25480f(C3738i iVar) {
        C3334d.m24473i(iVar, "provider");
        m25481g(iVar);
        f21571a.add(iVar);
    }

    /* renamed from: g */
    private static void m25481g(C3738i iVar) {
        for (String next : iVar.mo14919e()) {
            C3334d.m24473i(next, "zoneId");
            if (f21572b.putIfAbsent(next, iVar) != null) {
                throw new C3734g("Unable to register zone as one already registered with that ID: " + next + ", currently loading from provider: " + iVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract C3732f mo14918d(String str, boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract Set<String> mo14919e();
}
