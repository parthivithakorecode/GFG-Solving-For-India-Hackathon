package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import p069j1.C3202r1;

public final class pb0 implements fa0, ob0 {

    /* renamed from: f */
    private final ob0 f12589f;

    /* renamed from: g */
    private final HashSet<AbstractMap.SimpleEntry<String, t70<? super ob0>>> f12590g = new HashSet<>();

    public pb0(ob0 ob0) {
        this.f12589f = ob0;
    }

    /* renamed from: U */
    public final void mo9716U(String str, t70<? super ob0> t70) {
        this.f12589f.mo9716U(str, t70);
        this.f12590g.add(new AbstractMap.SimpleEntry(str, t70));
    }

    /* renamed from: V0 */
    public final void mo9717V0(String str, t70<? super ob0> t70) {
        this.f12589f.mo9717V0(str, t70);
        this.f12590g.remove(new AbstractMap.SimpleEntry(str, t70));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo7272a(String str, String str2) {
        ea0.m8397c(this, str, str2);
    }

    /* renamed from: b */
    public final void mo7273b(String str) {
        this.f12589f.mo7273b(str);
    }

    /* renamed from: c */
    public final void mo10014c() {
        Iterator<AbstractMap.SimpleEntry<String, t70<? super ob0>>> it = this.f12590g.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry next = it.next();
            String valueOf = String.valueOf(((t70) next.getValue()).toString());
            C3202r1.m24015k(valueOf.length() != 0 ? "Unregistering eventhandler: ".concat(valueOf) : new String("Unregistering eventhandler: "));
            this.f12589f.mo9717V0((String) next.getKey(), (t70) next.getValue());
        }
        this.f12590g.clear();
    }

    /* renamed from: c1 */
    public final /* synthetic */ void mo9998c1(String str, JSONObject jSONObject) {
        ea0.m8398d(this, str, jSONObject);
    }

    /* renamed from: s */
    public final /* synthetic */ void mo6423s(String str, JSONObject jSONObject) {
        ea0.m8396b(this, str, jSONObject);
    }

    /* renamed from: t */
    public final /* synthetic */ void mo6424t(String str, Map map) {
        ea0.m8395a(this, str, map);
    }
}
