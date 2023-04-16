package p174z3;

import java.util.HashMap;
import p005a4.C0144j;
import p005a4.C0145k;
import p005a4.C0159s;
import p099n3.C3768b;
import p106o3.C3832a;

/* renamed from: z3.g */
public class C4553g {

    /* renamed from: a */
    public final C0145k f23089a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4555b f23090b;

    /* renamed from: c */
    private final C0145k.C0149c f23091c;

    /* renamed from: z3.g$a */
    class C4554a implements C0145k.C0149c {
        C4554a() {
        }

        public void onMethodCall(C0144j jVar, C0145k.C0150d dVar) {
            if (C4553g.this.f23090b != null) {
                String str = jVar.f269a;
                C3768b.m25592f("MouseCursorChannel", "Received '" + str + "' message.");
                char c = 65535;
                try {
                    if (str.hashCode() == -1307105544) {
                        if (str.equals("activateSystemCursor")) {
                            c = 0;
                        }
                    }
                    if (c == 0) {
                        try {
                            C4553g.this.f23090b.mo4854a((String) ((HashMap) jVar.f270b).get("kind"));
                            dVar.mo338a(Boolean.TRUE);
                        } catch (Exception e) {
                            dVar.mo339b("error", "Error when setting cursors: " + e.getMessage(), (Object) null);
                        }
                    }
                } catch (Exception e2) {
                    dVar.mo339b("error", "Unhandled error: " + e2.getMessage(), (Object) null);
                }
            }
        }
    }

    /* renamed from: z3.g$b */
    public interface C4555b {
        /* renamed from: a */
        void mo4854a(String str);
    }

    public C4553g(C3832a aVar) {
        C4554a aVar2 = new C4554a();
        this.f23091c = aVar2;
        C0145k kVar = new C0145k(aVar, "flutter/mousecursor", C0159s.f284b);
        this.f23089a = kVar;
        kVar.mo337e(aVar2);
    }

    /* renamed from: b */
    public void mo16231b(C4555b bVar) {
        this.f23090b = bVar;
    }
}
