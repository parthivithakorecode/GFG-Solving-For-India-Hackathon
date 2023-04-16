package p147v0;

import androidx.work.impl.WorkDatabase;
import java.util.LinkedList;
import java.util.UUID;
import p089m0.C3651m;
import p089m0.C3662s;
import p096n0.C3749c;
import p096n0.C3752e;
import p096n0.C3753f;
import p096n0.C3756i;
import p141u0.C4086b;
import p141u0.C4111q;

/* renamed from: v0.a */
public abstract class C4167a implements Runnable {

    /* renamed from: f */
    private final C3749c f22376f = new C3749c();

    /* renamed from: v0.a$a */
    class C4168a extends C4167a {

        /* renamed from: g */
        final /* synthetic */ C3756i f22377g;

        /* renamed from: h */
        final /* synthetic */ UUID f22378h;

        C4168a(C3756i iVar, UUID uuid) {
            this.f22377g = iVar;
            this.f22378h = uuid;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo15681h() {
            WorkDatabase o = this.f22377g.mo14986o();
            o.mo3951c();
            try {
                mo15678a(this.f22377g, this.f22378h.toString());
                o.mo3965r();
                o.mo3955g();
                mo15680g(this.f22377g);
            } catch (Throwable th) {
                o.mo3955g();
                throw th;
            }
        }
    }

    /* renamed from: v0.a$b */
    class C4169b extends C4167a {

        /* renamed from: g */
        final /* synthetic */ C3756i f22379g;

        /* renamed from: h */
        final /* synthetic */ String f22380h;

        C4169b(C3756i iVar, String str) {
            this.f22379g = iVar;
            this.f22380h = str;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo15681h() {
            WorkDatabase o = this.f22379g.mo14986o();
            o.mo3951c();
            try {
                for (String a : o.mo4514B().mo15634m(this.f22380h)) {
                    mo15678a(this.f22379g, a);
                }
                o.mo3965r();
                o.mo3955g();
                mo15680g(this.f22379g);
            } catch (Throwable th) {
                o.mo3955g();
                throw th;
            }
        }
    }

    /* renamed from: v0.a$c */
    class C4170c extends C4167a {

        /* renamed from: g */
        final /* synthetic */ C3756i f22381g;

        /* renamed from: h */
        final /* synthetic */ String f22382h;

        /* renamed from: i */
        final /* synthetic */ boolean f22383i;

        C4170c(C3756i iVar, String str, boolean z) {
            this.f22381g = iVar;
            this.f22382h = str;
            this.f22383i = z;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo15681h() {
            WorkDatabase o = this.f22381g.mo14986o();
            o.mo3951c();
            try {
                for (String a : o.mo4514B().mo15627f(this.f22382h)) {
                    mo15678a(this.f22381g, a);
                }
                o.mo3965r();
                o.mo3955g();
                if (this.f22383i) {
                    mo15680g(this.f22381g);
                }
            } catch (Throwable th) {
                o.mo3955g();
                throw th;
            }
        }
    }

    /* renamed from: b */
    public static C4167a m26602b(UUID uuid, C3756i iVar) {
        return new C4168a(iVar, uuid);
    }

    /* renamed from: c */
    public static C4167a m26603c(String str, C3756i iVar, boolean z) {
        return new C4170c(iVar, str, z);
    }

    /* renamed from: d */
    public static C4167a m26604d(String str, C3756i iVar) {
        return new C4169b(iVar, str);
    }

    /* renamed from: f */
    private void m26605f(WorkDatabase workDatabase, String str) {
        C4111q B = workDatabase.mo4514B();
        C4086b t = workDatabase.mo4516t();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            C3662s i = B.mo15630i(str2);
            if (!(i == C3662s.SUCCEEDED || i == C3662s.FAILED)) {
                B.mo15638q(C3662s.CANCELLED, str2);
            }
            linkedList.addAll(t.mo15591c(str2));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15678a(C3756i iVar, String str) {
        m26605f(iVar.mo14986o(), str);
        iVar.mo14984m().mo14965l(str);
        for (C3752e b : iVar.mo14985n()) {
            b.mo4546b(str);
        }
    }

    /* renamed from: e */
    public C3651m mo15679e() {
        return this.f22376f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo15680g(C3756i iVar) {
        C3753f.m25520b(iVar.mo14982i(), iVar.mo14986o(), iVar.mo14985n());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract void mo15681h();

    public void run() {
        try {
            mo15681h();
            this.f22376f.mo14955a(C3651m.f21400a);
        } catch (Throwable th) {
            this.f22376f.mo14955a(new C3651m.C3653b.C3654a(th));
        }
    }
}
