package p174z3;

import java.util.HashMap;
import p005a4.C0120a;
import p005a4.C0140f;
import p099n3.C3768b;
import p106o3.C3832a;

/* renamed from: z3.o */
public class C4590o {

    /* renamed from: a */
    public final C0120a<Object> f23206a;

    public C4590o(C3832a aVar) {
        this.f23206a = new C0120a<>(aVar, "flutter/system", C0140f.f267a);
    }

    /* renamed from: a */
    public void mo16251a() {
        C3768b.m25592f("SystemChannel", "Sending memory pressure warning to Flutter.");
        HashMap hashMap = new HashMap(1);
        hashMap.put("type", "memoryPressure");
        this.f23206a.mo305c(hashMap);
    }
}
