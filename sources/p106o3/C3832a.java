package p106o3;

import android.content.res.AssetManager;
import java.nio.ByteBuffer;
import java.util.List;
import p005a4.C0127b;
import p005a4.C0128c;
import p005a4.C0160t;
import p064i4.C2851e;
import p066io.flutter.embedding.engine.FlutterJNI;
import p099n3.C3768b;

/* renamed from: o3.a */
public class C3832a implements C0128c {

    /* renamed from: a */
    private final FlutterJNI f21828a;

    /* renamed from: b */
    private final AssetManager f21829b;

    /* renamed from: c */
    private final C3838c f21830c;

    /* renamed from: d */
    private final C0128c f21831d;

    /* renamed from: e */
    private boolean f21832e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f21833f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C3836d f21834g;

    /* renamed from: h */
    private final C0128c.C0129a f21835h;

    /* renamed from: o3.a$a */
    class C3833a implements C0128c.C0129a {
        C3833a() {
        }

        /* renamed from: a */
        public void mo308a(ByteBuffer byteBuffer, C0128c.C0130b bVar) {
            String unused = C3832a.this.f21833f = C0160t.f287b.mo324b(byteBuffer);
            if (C3832a.this.f21834g != null) {
                C3832a.this.f21834g.mo15281a(C3832a.this.f21833f);
            }
        }
    }

    /* renamed from: o3.a$b */
    public static class C3834b {

        /* renamed from: a */
        public final String f21837a;

        /* renamed from: b */
        public final String f21838b;

        /* renamed from: c */
        public final String f21839c;

        public C3834b(String str, String str2) {
            this.f21837a = str;
            this.f21838b = null;
            this.f21839c = str2;
        }

        public C3834b(String str, String str2, String str3) {
            this.f21837a = str;
            this.f21838b = str2;
            this.f21839c = str3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C3834b bVar = (C3834b) obj;
            if (!this.f21837a.equals(bVar.f21837a)) {
                return false;
            }
            return this.f21839c.equals(bVar.f21839c);
        }

        public int hashCode() {
            return (this.f21837a.hashCode() * 31) + this.f21839c.hashCode();
        }

        public String toString() {
            return "DartEntrypoint( bundle path: " + this.f21837a + ", function: " + this.f21839c + " )";
        }
    }

    /* renamed from: o3.a$c */
    private static class C3835c implements C0128c {

        /* renamed from: a */
        private final C3838c f21840a;

        private C3835c(C3838c cVar) {
            this.f21840a = cVar;
        }

        /* synthetic */ C3835c(C3838c cVar, C3833a aVar) {
            this(cVar);
        }

        /* renamed from: a */
        public C0128c.C0131c mo312a(C0128c.C0132d dVar) {
            return this.f21840a.mo312a(dVar);
        }

        /* renamed from: b */
        public /* synthetic */ C0128c.C0131c mo313b() {
            return C0127b.m380a(this);
        }

        /* renamed from: c */
        public void mo314c(String str, C0128c.C0129a aVar) {
            this.f21840a.mo314c(str, aVar);
        }

        /* renamed from: d */
        public void mo315d(String str, ByteBuffer byteBuffer, C0128c.C0130b bVar) {
            this.f21840a.mo315d(str, byteBuffer, bVar);
        }

        /* renamed from: e */
        public void mo316e(String str, ByteBuffer byteBuffer) {
            this.f21840a.mo315d(str, byteBuffer, (C0128c.C0130b) null);
        }

        /* renamed from: h */
        public void mo317h(String str, C0128c.C0129a aVar, C0128c.C0131c cVar) {
            this.f21840a.mo317h(str, aVar, cVar);
        }
    }

    /* renamed from: o3.a$d */
    public interface C3836d {
        /* renamed from: a */
        void mo15281a(String str);
    }

    public C3832a(FlutterJNI flutterJNI, AssetManager assetManager) {
        C3833a aVar = new C3833a();
        this.f21835h = aVar;
        this.f21828a = flutterJNI;
        this.f21829b = assetManager;
        C3838c cVar = new C3838c(flutterJNI);
        this.f21830c = cVar;
        cVar.mo314c("flutter/isolate", aVar);
        this.f21831d = new C3835c(cVar, (C3833a) null);
        if (flutterJNI.isAttached()) {
            this.f21832e = true;
        }
    }

    @Deprecated
    /* renamed from: a */
    public C0128c.C0131c mo312a(C0128c.C0132d dVar) {
        return this.f21831d.mo312a(dVar);
    }

    /* renamed from: b */
    public /* synthetic */ C0128c.C0131c mo313b() {
        return C0127b.m380a(this);
    }

    @Deprecated
    /* renamed from: c */
    public void mo314c(String str, C0128c.C0129a aVar) {
        this.f21831d.mo314c(str, aVar);
    }

    @Deprecated
    /* renamed from: d */
    public void mo315d(String str, ByteBuffer byteBuffer, C0128c.C0130b bVar) {
        this.f21831d.mo315d(str, byteBuffer, bVar);
    }

    @Deprecated
    /* renamed from: e */
    public void mo316e(String str, ByteBuffer byteBuffer) {
        this.f21831d.mo316e(str, byteBuffer);
    }

    @Deprecated
    /* renamed from: h */
    public void mo317h(String str, C0128c.C0129a aVar, C0128c.C0131c cVar) {
        this.f21831d.mo317h(str, aVar, cVar);
    }

    /* renamed from: j */
    public void mo15272j(C3834b bVar, List<String> list) {
        if (this.f21832e) {
            C3768b.m25593g("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        C2851e.m22352a("DartExecutor#executeDartEntrypoint");
        try {
            C3768b.m25592f("DartExecutor", "Executing Dart entrypoint: " + bVar);
            this.f21828a.runBundleAndSnapshotFromLibrary(bVar.f21837a, bVar.f21839c, bVar.f21838b, this.f21829b, list);
            this.f21832e = true;
        } finally {
            C2851e.m22355d();
        }
    }

    /* renamed from: k */
    public String mo15273k() {
        return this.f21833f;
    }

    /* renamed from: l */
    public boolean mo15274l() {
        return this.f21832e;
    }

    /* renamed from: m */
    public void mo15275m() {
        if (this.f21828a.isAttached()) {
            this.f21828a.notifyLowMemoryWarning();
        }
    }

    /* renamed from: n */
    public void mo15276n() {
        C3768b.m25592f("DartExecutor", "Attached to JNI. Registering the platform message handler for this Dart execution context.");
        this.f21828a.setPlatformMessageHandler(this.f21830c);
    }

    /* renamed from: o */
    public void mo15277o() {
        C3768b.m25592f("DartExecutor", "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.f21828a.setPlatformMessageHandler((C3851f) null);
    }
}
