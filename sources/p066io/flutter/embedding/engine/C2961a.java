package p066io.flutter.embedding.engine;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import java.util.HashSet;
import java.util.Set;
import p015b4.C1312a;
import p066io.flutter.plugin.platform.C3021q;
import p099n3.C3764a;
import p099n3.C3768b;
import p106o3.C3832a;
import p113p3.C3925a;
import p120q3.C3953d;
import p132s3.C4050b;
import p138t3.C4077b;
import p162x3.C4349a;
import p168y3.C4462a;
import p174z3.C4540a;
import p174z3.C4543b;
import p174z3.C4549e;
import p174z3.C4550f;
import p174z3.C4553g;
import p174z3.C4556h;
import p174z3.C4558i;
import p174z3.C4581l;
import p174z3.C4584m;
import p174z3.C4587n;
import p174z3.C4590o;
import p174z3.C4591p;

/* renamed from: io.flutter.embedding.engine.a */
public class C2961a {

    /* renamed from: a */
    private final FlutterJNI f19814a;

    /* renamed from: b */
    private final C4462a f19815b;

    /* renamed from: c */
    private final C3832a f19816c;

    /* renamed from: d */
    private final C2965c f19817d;

    /* renamed from: e */
    private final C1312a f19818e;

    /* renamed from: f */
    private final C4540a f19819f;

    /* renamed from: g */
    private final C4543b f19820g;

    /* renamed from: h */
    private final C4549e f19821h;

    /* renamed from: i */
    private final C4550f f19822i;

    /* renamed from: j */
    private final C4553g f19823j;

    /* renamed from: k */
    private final C4556h f19824k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C4581l f19825l;

    /* renamed from: m */
    private final C4558i f19826m;

    /* renamed from: n */
    private final C4584m f19827n;

    /* renamed from: o */
    private final C4587n f19828o;

    /* renamed from: p */
    private final C4590o f19829p;

    /* renamed from: q */
    private final C4591p f19830q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final C3021q f19831r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final Set<C2963b> f19832s;

    /* renamed from: t */
    private final C2963b f19833t;

    /* renamed from: io.flutter.embedding.engine.a$a */
    class C2962a implements C2963b {
        C2962a() {
        }

        /* renamed from: a */
        public void mo13491a() {
        }

        /* renamed from: b */
        public void mo13492b() {
            C3768b.m25592f("FlutterEngine", "onPreEngineRestart()");
            for (C2963b b : C2961a.this.f19832s) {
                b.mo13492b();
            }
            C2961a.this.f19831r.mo13716b0();
            C2961a.this.f19825l.mo16240g();
        }
    }

    /* renamed from: io.flutter.embedding.engine.a$b */
    public interface C2963b {
        /* renamed from: a */
        void mo13491a();

        /* renamed from: b */
        void mo13492b();
    }

    public C2961a(Context context, C3953d dVar, FlutterJNI flutterJNI, C3021q qVar, String[] strArr, boolean z, boolean z2) {
        AssetManager assetManager;
        this.f19832s = new HashSet();
        this.f19833t = new C2962a();
        try {
            assetManager = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assetManager = context.getAssets();
        }
        C3764a e = C3764a.m25580e();
        flutterJNI = flutterJNI == null ? e.mo15008d().mo13471a() : flutterJNI;
        this.f19814a = flutterJNI;
        C3832a aVar = new C3832a(flutterJNI, assetManager);
        this.f19816c = aVar;
        aVar.mo15276n();
        C3925a a = C3764a.m25580e().mo15005a();
        this.f19819f = new C4540a(aVar, flutterJNI);
        C4543b bVar = new C4543b(aVar);
        this.f19820g = bVar;
        this.f19821h = new C4549e(aVar);
        C4550f fVar = new C4550f(aVar);
        this.f19822i = fVar;
        this.f19823j = new C4553g(aVar);
        this.f19824k = new C4556h(aVar);
        this.f19826m = new C4558i(aVar);
        this.f19825l = new C4581l(aVar, z2);
        this.f19827n = new C4584m(aVar);
        this.f19828o = new C4587n(aVar);
        this.f19829p = new C4590o(aVar);
        this.f19830q = new C4591p(aVar);
        if (a != null) {
            a.mo15376b(bVar);
        }
        C1312a aVar2 = new C1312a(context, fVar);
        this.f19818e = aVar2;
        dVar = dVar == null ? e.mo15007c() : dVar;
        if (!flutterJNI.isAttached()) {
            dVar.mo15418k(context.getApplicationContext());
            dVar.mo15415e(context, strArr);
        }
        flutterJNI.addEngineLifecycleListener(this.f19833t);
        flutterJNI.setPlatformViewsController(qVar);
        flutterJNI.setLocalizationPlugin(aVar2);
        flutterJNI.setDeferredComponentManager(e.mo15005a());
        if (!flutterJNI.isAttached()) {
            m23033d();
        }
        this.f19815b = new C4462a(flutterJNI);
        this.f19831r = qVar;
        qVar.mo13710V();
        this.f19817d = new C2965c(context.getApplicationContext(), this, dVar);
        aVar2.mo4637d(context.getResources().getConfiguration());
        if (z && dVar.mo15414d()) {
            C4349a.m26974a(this);
        }
    }

    public C2961a(Context context, String[] strArr, boolean z, boolean z2) {
        this(context, (C3953d) null, (FlutterJNI) null, new C3021q(), strArr, z, z2);
    }

    /* renamed from: d */
    private void m23033d() {
        C3768b.m25592f("FlutterEngine", "Attaching to JNI.");
        this.f19814a.attachToNative();
        if (!m23034v()) {
            throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
        }
    }

    /* renamed from: v */
    private boolean m23034v() {
        return this.f19814a.isAttached();
    }

    /* renamed from: e */
    public void mo13474e() {
        C3768b.m25592f("FlutterEngine", "Destroying.");
        for (C2963b a : this.f19832s) {
            a.mo13491a();
        }
        this.f19817d.mo13504j();
        this.f19831r.mo13712X();
        this.f19816c.mo15277o();
        this.f19814a.removeEngineLifecycleListener(this.f19833t);
        this.f19814a.setDeferredComponentManager((C3925a) null);
        this.f19814a.detachFromNativeAndReleaseResources();
        if (C3764a.m25580e().mo15005a() != null) {
            C3764a.m25580e().mo15005a().destroy();
            this.f19820g.mo16223c((C3925a) null);
        }
    }

    /* renamed from: f */
    public C4540a mo13475f() {
        return this.f19819f;
    }

    /* renamed from: g */
    public C4077b mo13476g() {
        return this.f19817d;
    }

    /* renamed from: h */
    public C3832a mo13477h() {
        return this.f19816c;
    }

    /* renamed from: i */
    public C4549e mo13478i() {
        return this.f19821h;
    }

    /* renamed from: j */
    public C1312a mo13479j() {
        return this.f19818e;
    }

    /* renamed from: k */
    public C4553g mo13480k() {
        return this.f19823j;
    }

    /* renamed from: l */
    public C4556h mo13481l() {
        return this.f19824k;
    }

    /* renamed from: m */
    public C4558i mo13482m() {
        return this.f19826m;
    }

    /* renamed from: n */
    public C3021q mo13483n() {
        return this.f19831r;
    }

    /* renamed from: o */
    public C4050b mo13484o() {
        return this.f19817d;
    }

    /* renamed from: p */
    public C4462a mo13485p() {
        return this.f19815b;
    }

    /* renamed from: q */
    public C4581l mo13486q() {
        return this.f19825l;
    }

    /* renamed from: r */
    public C4584m mo13487r() {
        return this.f19827n;
    }

    /* renamed from: s */
    public C4587n mo13488s() {
        return this.f19828o;
    }

    /* renamed from: t */
    public C4590o mo13489t() {
        return this.f19829p;
    }

    /* renamed from: u */
    public C4591p mo13490u() {
        return this.f19830q;
    }
}
