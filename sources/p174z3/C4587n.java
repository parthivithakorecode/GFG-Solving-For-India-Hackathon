package p174z3;

import java.util.ArrayList;
import p005a4.C0144j;
import p005a4.C0145k;
import p005a4.C0159s;
import p099n3.C3768b;
import p106o3.C3832a;

/* renamed from: z3.n */
public class C4587n {

    /* renamed from: a */
    public final C0145k f23202a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4589b f23203b;

    /* renamed from: c */
    public final C0145k.C0149c f23204c;

    /* renamed from: z3.n$a */
    class C4588a implements C0145k.C0149c {
        C4588a() {
        }

        public void onMethodCall(C0144j jVar, C0145k.C0150d dVar) {
            if (C4587n.this.f23203b == null) {
                C3768b.m25592f("SpellCheckChannel", "No SpellCheckeMethodHandler registered, call not forwarded to spell check API.");
                return;
            }
            String str = jVar.f269a;
            Object obj = jVar.f270b;
            C3768b.m25592f("SpellCheckChannel", "Received '" + str + "' message.");
            str.hashCode();
            if (!str.equals("SpellCheck.initiateSpellCheck")) {
                dVar.mo340c();
                return;
            }
            try {
                ArrayList arrayList = (ArrayList) obj;
                C4587n.this.f23203b.mo13595a((String) arrayList.get(0), (String) arrayList.get(1), dVar);
            } catch (IllegalStateException e) {
                dVar.mo339b("error", e.getMessage(), (Object) null);
            }
        }
    }

    /* renamed from: z3.n$b */
    public interface C4589b {
        /* renamed from: a */
        void mo13595a(String str, String str2, C0145k.C0150d dVar);
    }

    public C4587n(C3832a aVar) {
        C4588a aVar2 = new C4588a();
        this.f23204c = aVar2;
        C0145k kVar = new C0145k(aVar, "flutter/spellcheck", C0159s.f284b);
        this.f23202a = kVar;
        kVar.mo337e(aVar2);
    }

    /* renamed from: b */
    public void mo16250b(C4589b bVar) {
        this.f23203b = bVar;
    }
}
