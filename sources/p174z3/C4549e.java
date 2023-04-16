package p174z3;

import p005a4.C0120a;
import p005a4.C0160t;
import p099n3.C3768b;
import p106o3.C3832a;

/* renamed from: z3.e */
public class C4549e {

    /* renamed from: a */
    public final C0120a<String> f23084a;

    public C4549e(C3832a aVar) {
        this.f23084a = new C0120a<>(aVar, "flutter/lifecycle", C0160t.f287b);
    }

    /* renamed from: a */
    public void mo16225a() {
        C3768b.m25592f("LifecycleChannel", "Sending AppLifecycleState.detached message.");
        this.f23084a.mo305c("AppLifecycleState.detached");
    }

    /* renamed from: b */
    public void mo16226b() {
        C3768b.m25592f("LifecycleChannel", "Sending AppLifecycleState.inactive message.");
        this.f23084a.mo305c("AppLifecycleState.inactive");
    }

    /* renamed from: c */
    public void mo16227c() {
        C3768b.m25592f("LifecycleChannel", "Sending AppLifecycleState.paused message.");
        this.f23084a.mo305c("AppLifecycleState.paused");
    }

    /* renamed from: d */
    public void mo16228d() {
        C3768b.m25592f("LifecycleChannel", "Sending AppLifecycleState.resumed message.");
        this.f23084a.mo305c("AppLifecycleState.resumed");
    }
}
