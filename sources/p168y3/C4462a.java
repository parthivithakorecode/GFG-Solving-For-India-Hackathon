package p168y3;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import p066io.flutter.embedding.engine.FlutterJNI;
import p066io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import p066io.flutter.view.C3119d;
import p099n3.C3768b;

/* renamed from: y3.a */
public class C4462a implements C3119d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final FlutterJNI f22882a;

    /* renamed from: b */
    private final AtomicLong f22883b = new AtomicLong(0);

    /* renamed from: c */
    private Surface f22884c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f22885d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Handler f22886e = new Handler();

    /* renamed from: f */
    private final Set<WeakReference<C3119d.C3121b>> f22887f = new HashSet();

    /* renamed from: g */
    private final C4472b f22888g;

    /* renamed from: y3.a$a */
    class C4463a implements C4472b {
        C4463a() {
        }

        /* renamed from: c */
        public void mo13233c() {
            boolean unused = C4462a.this.f22885d = false;
        }

        /* renamed from: f */
        public void mo13234f() {
            boolean unused = C4462a.this.f22885d = true;
        }
    }

    /* renamed from: y3.a$b */
    public static final class C4464b {

        /* renamed from: a */
        public final Rect f22890a;

        /* renamed from: b */
        public final C4466d f22891b;

        /* renamed from: c */
        public final C4465c f22892c;

        public C4464b(Rect rect, C4466d dVar) {
            this.f22890a = rect;
            this.f22891b = dVar;
            this.f22892c = C4465c.UNKNOWN;
        }

        public C4464b(Rect rect, C4466d dVar, C4465c cVar) {
            this.f22890a = rect;
            this.f22891b = dVar;
            this.f22892c = cVar;
        }
    }

    /* renamed from: y3.a$c */
    public enum C4465c {
        UNKNOWN(0),
        POSTURE_FLAT(1),
        POSTURE_HALF_OPENED(2);
        

        /* renamed from: f */
        public final int f22897f;

        private C4465c(int i) {
            this.f22897f = i;
        }
    }

    /* renamed from: y3.a$d */
    public enum C4466d {
        UNKNOWN(0),
        FOLD(1),
        HINGE(2),
        CUTOUT(3);
        

        /* renamed from: f */
        public final int f22903f;

        private C4466d(int i) {
            this.f22903f = i;
        }
    }

    /* renamed from: y3.a$e */
    static final class C4467e implements Runnable {

        /* renamed from: f */
        private final long f22904f;

        /* renamed from: g */
        private final FlutterJNI f22905g;

        C4467e(long j, FlutterJNI flutterJNI) {
            this.f22904f = j;
            this.f22905g = flutterJNI;
        }

        public void run() {
            if (this.f22905g.isAttached()) {
                C3768b.m25592f("FlutterRenderer", "Releasing a SurfaceTexture (" + this.f22904f + ").");
                this.f22905g.unregisterTexture(this.f22904f);
            }
        }
    }

    /* renamed from: y3.a$f */
    final class C4468f implements C3119d.C3122c, C3119d.C3121b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final long f22906a;

        /* renamed from: b */
        private final SurfaceTextureWrapper f22907b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f22908c;

        /* renamed from: d */
        private C3119d.C3121b f22909d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C3119d.C3120a f22910e;

        /* renamed from: f */
        private final Runnable f22911f;

        /* renamed from: g */
        private SurfaceTexture.OnFrameAvailableListener f22912g = new C4470b();

        /* renamed from: y3.a$f$a */
        class C4469a implements Runnable {
            C4469a() {
            }

            public void run() {
                if (C4468f.this.f22910e != null) {
                    C4468f.this.f22910e.mo13685a();
                }
            }
        }

        /* renamed from: y3.a$f$b */
        class C4470b implements SurfaceTexture.OnFrameAvailableListener {
            C4470b() {
            }

            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (!C4468f.this.f22908c && C4462a.this.f22882a.isAttached()) {
                    C4468f fVar = C4468f.this;
                    C4462a.this.m27257l(fVar.f22906a);
                }
            }
        }

        C4468f(long j, SurfaceTexture surfaceTexture) {
            C4469a aVar = new C4469a();
            this.f22911f = aVar;
            this.f22906a = j;
            this.f22907b = new SurfaceTextureWrapper(surfaceTexture, aVar);
            if (Build.VERSION.SDK_INT >= 21) {
                mo13956c().setOnFrameAvailableListener(this.f22912g, new Handler());
            } else {
                mo13956c().setOnFrameAvailableListener(this.f22912g);
            }
        }

        /* renamed from: a */
        public void mo13954a(C3119d.C3121b bVar) {
            this.f22909d = bVar;
        }

        /* renamed from: b */
        public void mo13955b(C3119d.C3120a aVar) {
            this.f22910e = aVar;
        }

        /* renamed from: c */
        public SurfaceTexture mo13956c() {
            return this.f22907b.surfaceTexture();
        }

        /* renamed from: d */
        public long mo13957d() {
            return this.f22906a;
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            try {
                if (!this.f22908c) {
                    C4462a.this.f22886e.post(new C4467e(this.f22906a, C4462a.this.f22882a));
                    super.finalize();
                }
            } finally {
                super.finalize();
            }
        }

        /* renamed from: h */
        public SurfaceTextureWrapper mo16117h() {
            return this.f22907b;
        }

        public void onTrimMemory(int i) {
            C3119d.C3121b bVar = this.f22909d;
            if (bVar != null) {
                bVar.onTrimMemory(i);
            }
        }
    }

    /* renamed from: y3.a$g */
    public static final class C4471g {

        /* renamed from: a */
        public float f22916a = 1.0f;

        /* renamed from: b */
        public int f22917b = 0;

        /* renamed from: c */
        public int f22918c = 0;

        /* renamed from: d */
        public int f22919d = 0;

        /* renamed from: e */
        public int f22920e = 0;

        /* renamed from: f */
        public int f22921f = 0;

        /* renamed from: g */
        public int f22922g = 0;

        /* renamed from: h */
        public int f22923h = 0;

        /* renamed from: i */
        public int f22924i = 0;

        /* renamed from: j */
        public int f22925j = 0;

        /* renamed from: k */
        public int f22926k = 0;

        /* renamed from: l */
        public int f22927l = 0;

        /* renamed from: m */
        public int f22928m = 0;

        /* renamed from: n */
        public int f22929n = 0;

        /* renamed from: o */
        public int f22930o = 0;

        /* renamed from: p */
        public int f22931p = -1;

        /* renamed from: q */
        public List<C4464b> f22932q = new ArrayList();

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo16120a() {
            return this.f22917b > 0 && this.f22918c > 0 && this.f22916a > 0.0f;
        }
    }

    public C4462a(FlutterJNI flutterJNI) {
        C4463a aVar = new C4463a();
        this.f22888g = aVar;
        this.f22882a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
    }

    /* renamed from: h */
    private void m27256h() {
        Iterator<WeakReference<C3119d.C3121b>> it = this.f22887f.iterator();
        while (it.hasNext()) {
            if (((C3119d.C3121b) it.next().get()) == null) {
                it.remove();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m27257l(long j) {
        this.f22882a.markTextureFrameAvailable(j);
    }

    /* renamed from: o */
    private void m27258o(long j, SurfaceTextureWrapper surfaceTextureWrapper) {
        this.f22882a.registerTexture(j, surfaceTextureWrapper);
    }

    /* renamed from: a */
    public C3119d.C3122c mo13953a() {
        C3768b.m25592f("FlutterRenderer", "Creating a SurfaceTexture.");
        return mo16107n(new SurfaceTexture(0));
    }

    /* renamed from: f */
    public void mo16101f(C4472b bVar) {
        this.f22882a.addIsDisplayingFlutterUiListener(bVar);
        if (this.f22885d) {
            bVar.mo13234f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo16102g(C3119d.C3121b bVar) {
        m27256h();
        this.f22887f.add(new WeakReference(bVar));
    }

    /* renamed from: i */
    public void mo16103i(ByteBuffer byteBuffer, int i) {
        this.f22882a.dispatchPointerDataPacket(byteBuffer, i);
    }

    /* renamed from: j */
    public boolean mo16104j() {
        return this.f22885d;
    }

    /* renamed from: k */
    public boolean mo16105k() {
        return this.f22882a.getIsSoftwareRenderingEnabled();
    }

    /* renamed from: m */
    public void mo16106m(int i) {
        Iterator<WeakReference<C3119d.C3121b>> it = this.f22887f.iterator();
        while (it.hasNext()) {
            C3119d.C3121b bVar = (C3119d.C3121b) it.next().get();
            if (bVar != null) {
                bVar.onTrimMemory(i);
            } else {
                it.remove();
            }
        }
    }

    /* renamed from: n */
    public C3119d.C3122c mo16107n(SurfaceTexture surfaceTexture) {
        surfaceTexture.detachFromGLContext();
        C4468f fVar = new C4468f(this.f22883b.getAndIncrement(), surfaceTexture);
        C3768b.m25592f("FlutterRenderer", "New SurfaceTexture ID: " + fVar.mo13957d());
        m27258o(fVar.mo13957d(), fVar.mo16117h());
        mo16102g(fVar);
        return fVar;
    }

    /* renamed from: p */
    public void mo16108p(C4472b bVar) {
        this.f22882a.removeIsDisplayingFlutterUiListener(bVar);
    }

    /* renamed from: q */
    public void mo16109q(boolean z) {
        this.f22882a.setSemanticsEnabled(z);
    }

    /* renamed from: r */
    public void mo16110r(C4471g gVar) {
        C4471g gVar2 = gVar;
        if (gVar.mo16120a()) {
            C3768b.m25592f("FlutterRenderer", "Setting viewport metrics\nSize: " + gVar2.f22917b + " x " + gVar2.f22918c + "\nPadding - L: " + gVar2.f22922g + ", T: " + gVar2.f22919d + ", R: " + gVar2.f22920e + ", B: " + gVar2.f22921f + "\nInsets - L: " + gVar2.f22926k + ", T: " + gVar2.f22923h + ", R: " + gVar2.f22924i + ", B: " + gVar2.f22925j + "\nSystem Gesture Insets - L: " + gVar2.f22930o + ", T: " + gVar2.f22927l + ", R: " + gVar2.f22928m + ", B: " + gVar2.f22928m + "\nDisplay Features: " + gVar2.f22932q.size());
            int[] iArr = new int[(gVar2.f22932q.size() * 4)];
            int[] iArr2 = new int[gVar2.f22932q.size()];
            int[] iArr3 = new int[gVar2.f22932q.size()];
            for (int i = 0; i < gVar2.f22932q.size(); i++) {
                C4464b bVar = gVar2.f22932q.get(i);
                int i2 = i * 4;
                Rect rect = bVar.f22890a;
                iArr[i2] = rect.left;
                iArr[i2 + 1] = rect.top;
                iArr[i2 + 2] = rect.right;
                iArr[i2 + 3] = rect.bottom;
                iArr2[i] = bVar.f22891b.f22903f;
                iArr3[i] = bVar.f22892c.f22897f;
            }
            int[] iArr4 = iArr3;
            FlutterJNI flutterJNI = this.f22882a;
            flutterJNI.setViewportMetrics(gVar2.f22916a, gVar2.f22917b, gVar2.f22918c, gVar2.f22919d, gVar2.f22920e, gVar2.f22921f, gVar2.f22922g, gVar2.f22923h, gVar2.f22924i, gVar2.f22925j, gVar2.f22926k, gVar2.f22927l, gVar2.f22928m, gVar2.f22929n, gVar2.f22930o, gVar2.f22931p, iArr, iArr2, iArr4);
        }
    }

    /* renamed from: s */
    public void mo16111s(Surface surface, boolean z) {
        if (this.f22884c != null && !z) {
            mo16112t();
        }
        this.f22884c = surface;
        this.f22882a.onSurfaceCreated(surface);
    }

    /* renamed from: t */
    public void mo16112t() {
        this.f22882a.onSurfaceDestroyed();
        this.f22884c = null;
        if (this.f22885d) {
            this.f22888g.mo13233c();
        }
        this.f22885d = false;
    }

    /* renamed from: u */
    public void mo16113u(int i, int i2) {
        this.f22882a.onSurfaceChanged(i, i2);
    }

    /* renamed from: v */
    public void mo16114v(Surface surface) {
        this.f22884c = surface;
        this.f22882a.onSurfaceWindowChanged(surface);
    }
}
