package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p034e2.C2547d;

public final class aw1 implements ow2 {

    /* renamed from: f */
    private final Map<gw2, Long> f4371f = new HashMap();

    /* renamed from: g */
    private final sv1 f4372g;

    /* renamed from: h */
    private final C2547d f4373h;

    /* renamed from: i */
    private final Map<gw2, zv1> f4374i = new HashMap();

    public aw1(sv1 sv1, Set<zv1> set, C2547d dVar) {
        this.f4372g = sv1;
        for (zv1 next : set) {
            this.f4374i.put(next.f18373c, next);
        }
        this.f4373h = dVar;
    }

    /* renamed from: c */
    private final void m6363c(gw2 gw2, boolean z) {
        gw2 b = this.f4374i.get(gw2).f18372b;
        String str = true != z ? "f." : "s.";
        if (this.f4371f.containsKey(b)) {
            long b2 = this.f4373h.mo12463b() - this.f4371f.get(b).longValue();
            Map<String, String> a = this.f4372g.mo10883a();
            String c = this.f4374i.get(gw2).f18371a;
            String concat = c.length() != 0 ? "label.".concat(c) : new String("label.");
            String valueOf = String.valueOf(Long.toString(b2));
            a.put(concat, valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    /* renamed from: a */
    public final void mo5536a(gw2 gw2, String str) {
        if (this.f4371f.containsKey(gw2)) {
            long b = this.f4373h.mo12463b() - this.f4371f.get(gw2).longValue();
            Map<String, String> a = this.f4372g.mo10883a();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(b));
            a.put(concat, valueOf2.length() != 0 ? "s.".concat(valueOf2) : new String("s."));
        }
        if (this.f4374i.containsKey(gw2)) {
            m6363c(gw2, true);
        }
    }

    /* renamed from: b */
    public final void mo5537b(gw2 gw2, String str) {
    }

    /* renamed from: s */
    public final void mo5538s(gw2 gw2, String str) {
        this.f4371f.put(gw2, Long.valueOf(this.f4373h.mo12463b()));
    }

    /* renamed from: z */
    public final void mo5539z(gw2 gw2, String str, Throwable th) {
        if (this.f4371f.containsKey(gw2)) {
            long b = this.f4373h.mo12463b() - this.f4371f.get(gw2).longValue();
            Map<String, String> a = this.f4372g.mo10883a();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(b));
            a.put(concat, valueOf2.length() != 0 ? "f.".concat(valueOf2) : new String("f."));
        }
        if (this.f4374i.containsKey(gw2)) {
            m6363c(gw2, false);
        }
    }
}
