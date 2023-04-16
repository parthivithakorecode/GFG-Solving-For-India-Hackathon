package p005a4;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p005a4.C0128c;
import p099n3.C3768b;

/* renamed from: a4.d */
public final class C0133d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C0128c f256a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f257b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C0151l f258c;

    /* renamed from: d */
    private final C0128c.C0131c f259d;

    /* renamed from: a4.d$b */
    public interface C0135b {
        /* renamed from: a */
        void mo320a(Object obj);
    }

    /* renamed from: a4.d$c */
    private final class C0136c implements C0128c.C0129a {

        /* renamed from: a */
        private final C0138d f260a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final AtomicReference<C0135b> f261b = new AtomicReference<>((Object) null);

        /* renamed from: a4.d$c$a */
        private final class C0137a implements C0135b {

            /* renamed from: a */
            final AtomicBoolean f263a;

            private C0137a() {
                this.f263a = new AtomicBoolean(false);
            }

            /* renamed from: a */
            public void mo320a(Object obj) {
                if (!this.f263a.get() && C0136c.this.f261b.get() == this) {
                    C0133d.this.f256a.mo316e(C0133d.this.f257b, C0133d.this.f258c.mo325a(obj));
                }
            }
        }

        C0136c(C0138d dVar) {
            this.f260a = dVar;
        }

        /* renamed from: c */
        private void m396c(Object obj, C0128c.C0130b bVar) {
            ByteBuffer byteBuffer;
            if (this.f261b.getAndSet((Object) null) != null) {
                try {
                    this.f260a.mo322h(obj);
                    bVar.mo310a(C0133d.this.f258c.mo325a((Object) null));
                } catch (RuntimeException e) {
                    C3768b.m25589c("EventChannel#" + C0133d.this.f257b, "Failed to close event stream", e);
                    byteBuffer = C0133d.this.f258c.mo327c("error", e.getMessage(), (Object) null);
                }
            } else {
                byteBuffer = C0133d.this.f258c.mo327c("error", "No active stream to cancel", (Object) null);
                bVar.mo310a(byteBuffer);
            }
        }

        /* renamed from: d */
        private void m397d(Object obj, C0128c.C0130b bVar) {
            C0137a aVar = new C0137a();
            if (this.f261b.getAndSet(aVar) != null) {
                try {
                    this.f260a.mo322h((Object) null);
                } catch (RuntimeException e) {
                    C3768b.m25589c("EventChannel#" + C0133d.this.f257b, "Failed to close existing event stream", e);
                }
            }
            try {
                this.f260a.mo321d(obj, aVar);
                bVar.mo310a(C0133d.this.f258c.mo325a((Object) null));
            } catch (RuntimeException e2) {
                this.f261b.set((Object) null);
                C3768b.m25589c("EventChannel#" + C0133d.this.f257b, "Failed to open event stream", e2);
                bVar.mo310a(C0133d.this.f258c.mo327c("error", e2.getMessage(), (Object) null));
            }
        }

        /* renamed from: a */
        public void mo308a(ByteBuffer byteBuffer, C0128c.C0130b bVar) {
            C0144j d = C0133d.this.f258c.mo328d(byteBuffer);
            if (d.f269a.equals("listen")) {
                m397d(d.f270b, bVar);
            } else if (d.f269a.equals("cancel")) {
                m396c(d.f270b, bVar);
            } else {
                bVar.mo310a((ByteBuffer) null);
            }
        }
    }

    /* renamed from: a4.d$d */
    public interface C0138d {
        /* renamed from: d */
        void mo321d(Object obj, C0135b bVar);

        /* renamed from: h */
        void mo322h(Object obj);
    }

    public C0133d(C0128c cVar, String str) {
        this(cVar, str, C0159s.f284b);
    }

    public C0133d(C0128c cVar, String str, C0151l lVar) {
        this(cVar, str, lVar, (C0128c.C0131c) null);
    }

    public C0133d(C0128c cVar, String str, C0151l lVar, C0128c.C0131c cVar2) {
        this.f256a = cVar;
        this.f257b = str;
        this.f258c = lVar;
        this.f259d = cVar2;
    }

    /* renamed from: d */
    public void mo319d(C0138d dVar) {
        C0136c cVar = null;
        if (this.f259d != null) {
            C0128c cVar2 = this.f256a;
            String str = this.f257b;
            if (dVar != null) {
                cVar = new C0136c(dVar);
            }
            cVar2.mo317h(str, cVar, this.f259d);
            return;
        }
        C0128c cVar3 = this.f256a;
        String str2 = this.f257b;
        if (dVar != null) {
            cVar = new C0136c(dVar);
        }
        cVar3.mo314c(str2, cVar);
    }
}
