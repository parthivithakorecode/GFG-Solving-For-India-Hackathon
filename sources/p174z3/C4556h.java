package p174z3;

import p005a4.C0141g;
import p005a4.C0144j;
import p005a4.C0145k;
import p099n3.C3768b;
import p106o3.C3832a;

/* renamed from: z3.h */
public class C4556h {

    /* renamed from: a */
    public final C0145k f23093a;

    /* renamed from: b */
    private final C0145k.C0149c f23094b;

    /* renamed from: z3.h$a */
    class C4557a implements C0145k.C0149c {
        C4557a() {
        }

        public void onMethodCall(C0144j jVar, C0145k.C0150d dVar) {
            dVar.mo338a((Object) null);
        }
    }

    public C4556h(C3832a aVar) {
        C4557a aVar2 = new C4557a();
        this.f23094b = aVar2;
        C0145k kVar = new C0145k(aVar, "flutter/navigation", C0141g.f268a);
        this.f23093a = kVar;
        kVar.mo337e(aVar2);
    }

    /* renamed from: a */
    public void mo16232a() {
        C3768b.m25592f("NavigationChannel", "Sending message to pop route.");
        this.f23093a.mo335c("popRoute", (Object) null);
    }

    /* renamed from: b */
    public void mo16233b(String str) {
        C3768b.m25592f("NavigationChannel", "Sending message to push route '" + str + "'");
        this.f23093a.mo335c("pushRoute", str);
    }

    /* renamed from: c */
    public void mo16234c(String str) {
        C3768b.m25592f("NavigationChannel", "Sending message to set initial route to '" + str + "'");
        this.f23093a.mo335c("setInitialRoute", str);
    }
}
