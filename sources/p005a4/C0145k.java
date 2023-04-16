package p005a4;

import java.nio.ByteBuffer;
import p005a4.C0128c;
import p099n3.C3768b;

/* renamed from: a4.k */
public class C0145k {

    /* renamed from: a */
    private final C0128c f271a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f272b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C0151l f273c;

    /* renamed from: d */
    private final C0128c.C0131c f274d;

    /* renamed from: a4.k$a */
    private final class C0146a implements C0128c.C0129a {

        /* renamed from: a */
        private final C0149c f275a;

        /* renamed from: a4.k$a$a */
        class C0147a implements C0150d {

            /* renamed from: a */
            final /* synthetic */ C0128c.C0130b f277a;

            C0147a(C0128c.C0130b bVar) {
                this.f277a = bVar;
            }

            /* renamed from: a */
            public void mo338a(Object obj) {
                this.f277a.mo310a(C0145k.this.f273c.mo325a(obj));
            }

            /* renamed from: b */
            public void mo339b(String str, String str2, Object obj) {
                this.f277a.mo310a(C0145k.this.f273c.mo327c(str, str2, obj));
            }

            /* renamed from: c */
            public void mo340c() {
                this.f277a.mo310a((ByteBuffer) null);
            }
        }

        C0146a(C0149c cVar) {
            this.f275a = cVar;
        }

        /* renamed from: a */
        public void mo308a(ByteBuffer byteBuffer, C0128c.C0130b bVar) {
            try {
                this.f275a.onMethodCall(C0145k.this.f273c.mo328d(byteBuffer), new C0147a(bVar));
            } catch (RuntimeException e) {
                C3768b.m25589c("MethodChannel#" + C0145k.this.f272b, "Failed to handle method call", e);
                bVar.mo310a(C0145k.this.f273c.mo326b("error", e.getMessage(), (Object) null, C3768b.m25590d(e)));
            }
        }
    }

    /* renamed from: a4.k$b */
    private final class C0148b implements C0128c.C0130b {

        /* renamed from: a */
        private final C0150d f279a;

        C0148b(C0150d dVar) {
            this.f279a = dVar;
        }

        /* renamed from: a */
        public void mo310a(ByteBuffer byteBuffer) {
            if (byteBuffer == null) {
                try {
                    this.f279a.mo340c();
                } catch (RuntimeException e) {
                    C3768b.m25589c("MethodChannel#" + C0145k.this.f272b, "Failed to handle method call result", e);
                }
            } else {
                try {
                    this.f279a.mo338a(C0145k.this.f273c.mo329e(byteBuffer));
                } catch (C0139e e2) {
                    this.f279a.mo339b(e2.f265f, e2.getMessage(), e2.f266g);
                }
            }
        }
    }

    /* renamed from: a4.k$c */
    public interface C0149c {
        void onMethodCall(C0144j jVar, C0150d dVar);
    }

    /* renamed from: a4.k$d */
    public interface C0150d {
        /* renamed from: a */
        void mo338a(Object obj);

        /* renamed from: b */
        void mo339b(String str, String str2, Object obj);

        /* renamed from: c */
        void mo340c();
    }

    public C0145k(C0128c cVar, String str) {
        this(cVar, str, C0159s.f284b);
    }

    public C0145k(C0128c cVar, String str, C0151l lVar) {
        this(cVar, str, lVar, (C0128c.C0131c) null);
    }

    public C0145k(C0128c cVar, String str, C0151l lVar, C0128c.C0131c cVar2) {
        this.f271a = cVar;
        this.f272b = str;
        this.f273c = lVar;
        this.f274d = cVar2;
    }

    /* renamed from: c */
    public void mo335c(String str, Object obj) {
        mo336d(str, obj, (C0150d) null);
    }

    /* renamed from: d */
    public void mo336d(String str, Object obj, C0150d dVar) {
        this.f271a.mo315d(this.f272b, this.f273c.mo330f(new C0144j(str, obj)), dVar == null ? null : new C0148b(dVar));
    }

    /* renamed from: e */
    public void mo337e(C0149c cVar) {
        C0146a aVar = null;
        if (this.f274d != null) {
            C0128c cVar2 = this.f271a;
            String str = this.f272b;
            if (cVar != null) {
                aVar = new C0146a(cVar);
            }
            cVar2.mo317h(str, aVar, this.f274d);
            return;
        }
        C0128c cVar3 = this.f271a;
        String str2 = this.f272b;
        if (cVar != null) {
            aVar = new C0146a(cVar);
        }
        cVar3.mo314c(str2, aVar);
    }
}
