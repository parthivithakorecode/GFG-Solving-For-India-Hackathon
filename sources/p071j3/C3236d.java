package p071j3;

import p005a4.C0144j;
import p005a4.C0145k;

/* renamed from: j3.d */
public class C3236d extends C3232a {

    /* renamed from: a */
    public final C3237a f20615a;

    /* renamed from: b */
    final C0144j f20616b;

    /* renamed from: j3.d$a */
    class C3237a implements C3239f {

        /* renamed from: a */
        final C0145k.C0150d f20617a;

        C3237a(C0145k.C0150d dVar) {
            this.f20617a = dVar;
        }

        /* renamed from: a */
        public void mo14144a(Object obj) {
            this.f20617a.mo338a(obj);
        }

        /* renamed from: b */
        public void mo14145b(String str, String str2, Object obj) {
            this.f20617a.mo339b(str, str2, obj);
        }
    }

    public C3236d(C0144j jVar, C0145k.C0150d dVar) {
        this.f20616b = jVar;
        this.f20615a = new C3237a(dVar);
    }

    /* renamed from: c */
    public <T> T mo14154c(String str) {
        return this.f20616b.mo332a(str);
    }

    /* renamed from: i */
    public String mo14155i() {
        return this.f20616b.f269a;
    }

    /* renamed from: j */
    public boolean mo14156j(String str) {
        return this.f20616b.mo334c(str);
    }

    /* renamed from: o */
    public C3239f mo14146o() {
        return this.f20615a;
    }
}
