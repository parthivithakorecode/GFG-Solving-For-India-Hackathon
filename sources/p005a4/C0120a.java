package p005a4;

import java.nio.ByteBuffer;
import p005a4.C0128c;
import p099n3.C3768b;

/* renamed from: a4.a */
public final class C0120a<T> {

    /* renamed from: a */
    private final C0128c f245a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f246b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C0143i<T> f247c;

    /* renamed from: d */
    private final C0128c.C0131c f248d;

    /* renamed from: a4.a$b */
    private final class C0122b implements C0128c.C0129a {

        /* renamed from: a */
        private final C0125d<T> f249a;

        /* renamed from: a4.a$b$a */
        class C0123a implements C0126e<T> {

            /* renamed from: a */
            final /* synthetic */ C0128c.C0130b f251a;

            C0123a(C0128c.C0130b bVar) {
                this.f251a = bVar;
            }

            /* renamed from: a */
            public void mo309a(T t) {
                this.f251a.mo310a(C0120a.this.f247c.mo323a(t));
            }
        }

        private C0122b(C0125d<T> dVar) {
            this.f249a = dVar;
        }

        /* renamed from: a */
        public void mo308a(ByteBuffer byteBuffer, C0128c.C0130b bVar) {
            try {
                this.f249a.mo311a(C0120a.this.f247c.mo324b(byteBuffer), new C0123a(bVar));
            } catch (RuntimeException e) {
                C3768b.m25589c("BasicMessageChannel#" + C0120a.this.f246b, "Failed to handle message", e);
                bVar.mo310a((ByteBuffer) null);
            }
        }
    }

    /* renamed from: a4.a$c */
    private final class C0124c implements C0128c.C0130b {

        /* renamed from: a */
        private final C0126e<T> f253a;

        private C0124c(C0126e<T> eVar) {
            this.f253a = eVar;
        }

        /* renamed from: a */
        public void mo310a(ByteBuffer byteBuffer) {
            try {
                this.f253a.mo309a(C0120a.this.f247c.mo324b(byteBuffer));
            } catch (RuntimeException e) {
                C3768b.m25589c("BasicMessageChannel#" + C0120a.this.f246b, "Failed to handle message reply", e);
            }
        }
    }

    /* renamed from: a4.a$d */
    public interface C0125d<T> {
        /* renamed from: a */
        void mo311a(T t, C0126e<T> eVar);
    }

    /* renamed from: a4.a$e */
    public interface C0126e<T> {
        /* renamed from: a */
        void mo309a(T t);
    }

    public C0120a(C0128c cVar, String str, C0143i<T> iVar) {
        this(cVar, str, iVar, (C0128c.C0131c) null);
    }

    public C0120a(C0128c cVar, String str, C0143i<T> iVar, C0128c.C0131c cVar2) {
        this.f245a = cVar;
        this.f246b = str;
        this.f247c = iVar;
        this.f248d = cVar2;
    }

    /* renamed from: c */
    public void mo305c(T t) {
        mo306d(t, (C0126e) null);
    }

    /* renamed from: d */
    public void mo306d(T t, C0126e<T> eVar) {
        C0128c cVar = this.f245a;
        String str = this.f246b;
        ByteBuffer a = this.f247c.mo323a(t);
        C0124c cVar2 = null;
        if (eVar != null) {
            cVar2 = new C0124c(eVar);
        }
        cVar.mo315d(str, a, cVar2);
    }

    /* renamed from: e */
    public void mo307e(C0125d<T> dVar) {
        C0122b bVar = null;
        if (this.f248d != null) {
            C0128c cVar = this.f245a;
            String str = this.f246b;
            if (dVar != null) {
                bVar = new C0122b(dVar);
            }
            cVar.mo317h(str, bVar, this.f248d);
            return;
        }
        C0128c cVar2 = this.f245a;
        String str2 = this.f246b;
        if (dVar != null) {
            bVar = new C0122b(dVar);
        }
        cVar2.mo314c(str2, bVar);
    }
}
