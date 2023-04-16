package p174z3;

import java.util.HashMap;
import java.util.Map;
import p005a4.C0144j;
import p005a4.C0145k;
import p005a4.C0159s;
import p099n3.C3768b;
import p106o3.C3832a;

/* renamed from: z3.l */
public class C4581l {

    /* renamed from: a */
    public final boolean f23185a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public byte[] f23186b;

    /* renamed from: c */
    private C0145k f23187c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C0145k.C0150d f23188d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f23189e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f23190f;

    /* renamed from: g */
    private final C0145k.C0149c f23191g;

    /* renamed from: z3.l$a */
    class C4582a implements C0145k.C0150d {

        /* renamed from: a */
        final /* synthetic */ byte[] f23192a;

        C4582a(byte[] bArr) {
            this.f23192a = bArr;
        }

        /* renamed from: a */
        public void mo338a(Object obj) {
            byte[] unused = C4581l.this.f23186b = this.f23192a;
        }

        /* renamed from: b */
        public void mo339b(String str, String str2, Object obj) {
            C3768b.m25588b("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
        }

        /* renamed from: c */
        public void mo340c() {
        }
    }

    /* renamed from: z3.l$b */
    class C4583b implements C0145k.C0149c {
        C4583b() {
        }

        public void onMethodCall(C0144j jVar, C0145k.C0150d dVar) {
            Map e;
            String str = jVar.f269a;
            Object obj = jVar.f270b;
            str.hashCode();
            if (str.equals("get")) {
                boolean unused = C4581l.this.f23190f = true;
                if (!C4581l.this.f23189e) {
                    C4581l lVar = C4581l.this;
                    if (lVar.f23185a) {
                        C0145k.C0150d unused2 = lVar.f23188d = dVar;
                        return;
                    }
                }
                C4581l lVar2 = C4581l.this;
                e = lVar2.m27573i(lVar2.f23186b);
            } else if (!str.equals("put")) {
                dVar.mo340c();
                return;
            } else {
                byte[] unused3 = C4581l.this.f23186b = (byte[]) obj;
                e = null;
            }
            dVar.mo338a(e);
        }
    }

    C4581l(C0145k kVar, boolean z) {
        this.f23189e = false;
        this.f23190f = false;
        C4583b bVar = new C4583b();
        this.f23191g = bVar;
        this.f23187c = kVar;
        this.f23185a = z;
        kVar.mo337e(bVar);
    }

    public C4581l(C3832a aVar, boolean z) {
        this(new C0145k(aVar, "flutter/restoration", C0159s.f284b), z);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public Map<String, Object> m27573i(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }

    /* renamed from: g */
    public void mo16240g() {
        this.f23186b = null;
    }

    /* renamed from: h */
    public byte[] mo16241h() {
        return this.f23186b;
    }

    /* renamed from: j */
    public void mo16242j(byte[] bArr) {
        this.f23189e = true;
        C0145k.C0150d dVar = this.f23188d;
        if (dVar != null) {
            dVar.mo338a(m27573i(bArr));
            this.f23188d = null;
        } else if (this.f23190f) {
            this.f23187c.mo336d("push", m27573i(bArr), new C4582a(bArr));
            return;
        }
        this.f23186b = bArr;
    }
}
