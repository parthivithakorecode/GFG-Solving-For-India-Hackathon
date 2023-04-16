package p132s3;

import android.content.Context;
import p005a4.C0128c;
import p066io.flutter.embedding.engine.C2961a;
import p066io.flutter.plugin.platform.C3009h;
import p066io.flutter.view.C3119d;

/* renamed from: s3.a */
public interface C4047a {

    /* renamed from: s3.a$a */
    public interface C4048a {
    }

    /* renamed from: s3.a$b */
    public static class C4049b {

        /* renamed from: a */
        private final Context f22240a;

        /* renamed from: b */
        private final C2961a f22241b;

        /* renamed from: c */
        private final C0128c f22242c;

        /* renamed from: d */
        private final C3119d f22243d;

        /* renamed from: e */
        private final C3009h f22244e;

        /* renamed from: f */
        private final C4048a f22245f;

        public C4049b(Context context, C2961a aVar, C0128c cVar, C3119d dVar, C3009h hVar, C4048a aVar2) {
            this.f22240a = context;
            this.f22241b = aVar;
            this.f22242c = cVar;
            this.f22243d = dVar;
            this.f22244e = hVar;
            this.f22245f = aVar2;
        }

        /* renamed from: a */
        public Context mo15539a() {
            return this.f22240a;
        }

        /* renamed from: b */
        public C0128c mo15540b() {
            return this.f22242c;
        }

        /* renamed from: c */
        public C3009h mo15541c() {
            return this.f22244e;
        }
    }

    void onAttachedToEngine(C4049b bVar);

    void onDetachedFromEngine(C4049b bVar);
}
