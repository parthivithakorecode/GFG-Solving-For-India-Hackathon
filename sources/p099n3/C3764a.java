package p099n3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p066io.flutter.embedding.engine.FlutterJNI;
import p113p3.C3925a;
import p120q3.C3953d;

/* renamed from: n3.a */
public final class C3764a {

    /* renamed from: e */
    private static C3764a f21672e;

    /* renamed from: f */
    private static boolean f21673f;

    /* renamed from: a */
    private C3953d f21674a;

    /* renamed from: b */
    private C3925a f21675b;

    /* renamed from: c */
    private FlutterJNI.C2960c f21676c;

    /* renamed from: d */
    private ExecutorService f21677d;

    /* renamed from: n3.a$b */
    public static final class C3766b {

        /* renamed from: a */
        private C3953d f21678a;

        /* renamed from: b */
        private C3925a f21679b;

        /* renamed from: c */
        private FlutterJNI.C2960c f21680c;

        /* renamed from: d */
        private ExecutorService f21681d;

        /* renamed from: n3.a$b$a */
        private class C3767a implements ThreadFactory {

            /* renamed from: a */
            private int f21682a;

            private C3767a() {
                this.f21682a = 0;
            }

            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                StringBuilder sb = new StringBuilder();
                sb.append("flutter-worker-");
                int i = this.f21682a;
                this.f21682a = i + 1;
                sb.append(i);
                thread.setName(sb.toString());
                return thread;
            }
        }

        /* renamed from: b */
        private void m25585b() {
            if (this.f21680c == null) {
                this.f21680c = new FlutterJNI.C2960c();
            }
            if (this.f21681d == null) {
                this.f21681d = Executors.newCachedThreadPool(new C3767a());
            }
            if (this.f21678a == null) {
                this.f21678a = new C3953d(this.f21680c.mo13471a(), this.f21681d);
            }
        }

        /* renamed from: a */
        public C3764a mo15009a() {
            m25585b();
            return new C3764a(this.f21678a, this.f21679b, this.f21680c, this.f21681d);
        }
    }

    private C3764a(C3953d dVar, C3925a aVar, FlutterJNI.C2960c cVar, ExecutorService executorService) {
        this.f21674a = dVar;
        this.f21675b = aVar;
        this.f21676c = cVar;
        this.f21677d = executorService;
    }

    /* renamed from: e */
    public static C3764a m25580e() {
        f21673f = true;
        if (f21672e == null) {
            f21672e = new C3766b().mo15009a();
        }
        return f21672e;
    }

    /* renamed from: a */
    public C3925a mo15005a() {
        return this.f21675b;
    }

    /* renamed from: b */
    public ExecutorService mo15006b() {
        return this.f21677d;
    }

    /* renamed from: c */
    public C3953d mo15007c() {
        return this.f21674a;
    }

    /* renamed from: d */
    public FlutterJNI.C2960c mo15008d() {
        return this.f21676c;
    }
}
