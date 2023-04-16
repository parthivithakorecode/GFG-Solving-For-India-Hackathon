package p071j3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p005a4.C0145k;

/* renamed from: j3.c */
public class C3234c extends C3232a {

    /* renamed from: a */
    final Map<String, Object> f20607a;

    /* renamed from: b */
    final C3235a f20608b = new C3235a();

    /* renamed from: c */
    final boolean f20609c;

    /* renamed from: j3.c$a */
    public class C3235a implements C3239f {

        /* renamed from: a */
        Object f20610a;

        /* renamed from: b */
        String f20611b;

        /* renamed from: c */
        String f20612c;

        /* renamed from: d */
        Object f20613d;

        public C3235a() {
        }

        /* renamed from: a */
        public void mo14144a(Object obj) {
            this.f20610a = obj;
        }

        /* renamed from: b */
        public void mo14145b(String str, String str2, Object obj) {
            this.f20611b = str;
            this.f20612c = str2;
            this.f20613d = obj;
        }
    }

    public C3234c(Map<String, Object> map, boolean z) {
        this.f20607a = map;
        this.f20609c = z;
    }

    /* renamed from: c */
    public <T> T mo14154c(String str) {
        return this.f20607a.get(str);
    }

    /* renamed from: e */
    public boolean mo14148e() {
        return this.f20609c;
    }

    /* renamed from: i */
    public String mo14155i() {
        return (String) this.f20607a.get("method");
    }

    /* renamed from: j */
    public boolean mo14156j(String str) {
        return this.f20607a.containsKey(str);
    }

    /* renamed from: o */
    public C3239f mo14146o() {
        return this.f20608b;
    }

    /* renamed from: p */
    public Map<String, Object> mo14157p() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("code", this.f20608b.f20611b);
        hashMap2.put("message", this.f20608b.f20612c);
        hashMap2.put("data", this.f20608b.f20613d);
        hashMap.put("error", hashMap2);
        return hashMap;
    }

    /* renamed from: q */
    public Map<String, Object> mo14158q() {
        HashMap hashMap = new HashMap();
        hashMap.put("result", this.f20608b.f20610a);
        return hashMap;
    }

    /* renamed from: r */
    public void mo14159r(C0145k.C0150d dVar) {
        C3235a aVar = this.f20608b;
        dVar.mo339b(aVar.f20611b, aVar.f20612c, aVar.f20613d);
    }

    /* renamed from: s */
    public void mo14160s(List<Map<String, Object>> list) {
        if (!mo14148e()) {
            list.add(mo14157p());
        }
    }

    /* renamed from: t */
    public void mo14161t(List<Map<String, Object>> list) {
        if (!mo14148e()) {
            list.add(mo14158q());
        }
    }
}
