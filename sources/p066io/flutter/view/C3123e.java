package p066io.flutter.view;

import android.annotation.TargetApi;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import java.util.Objects;
import p066io.flutter.embedding.engine.FlutterJNI;

/* renamed from: io.flutter.view.e */
public class C3123e {

    /* renamed from: e */
    private static C3123e f20406e;

    /* renamed from: f */
    private static C3125b f20407f;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public long f20408a = -1;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public FlutterJNI f20409b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C3126c f20410c = new C3126c(0);

    /* renamed from: d */
    private final FlutterJNI.C2959b f20411d = new C3124a();

    /* renamed from: io.flutter.view.e$a */
    class C3124a implements FlutterJNI.C2959b {
        C3124a() {
        }

        /* renamed from: b */
        private Choreographer.FrameCallback m23801b(long j) {
            if (C3123e.this.f20410c == null) {
                return new C3126c(j);
            }
            long unused = C3123e.this.f20410c.f20415f = j;
            C3126c d = C3123e.this.f20410c;
            C3126c unused2 = C3123e.this.f20410c = null;
            return d;
        }

        /* renamed from: a */
        public void mo13470a(long j) {
            Choreographer.getInstance().postFrameCallback(m23801b(j));
        }
    }

    @TargetApi(17)
    /* renamed from: io.flutter.view.e$b */
    class C3125b implements DisplayManager.DisplayListener {

        /* renamed from: a */
        private DisplayManager f20413a;

        C3125b(DisplayManager displayManager) {
            this.f20413a = displayManager;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo13959a() {
            this.f20413a.registerDisplayListener(this, (Handler) null);
        }

        public void onDisplayAdded(int i) {
        }

        public void onDisplayChanged(int i) {
            if (i == 0) {
                float refreshRate = this.f20413a.getDisplay(0).getRefreshRate();
                long unused = C3123e.this.f20408a = (long) (1.0E9d / ((double) refreshRate));
                C3123e.this.f20409b.setRefreshRateFPS(refreshRate);
            }
        }

        public void onDisplayRemoved(int i) {
        }
    }

    /* renamed from: io.flutter.view.e$c */
    private class C3126c implements Choreographer.FrameCallback {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public long f20415f;

        C3126c(long j) {
            this.f20415f = j;
        }

        public void doFrame(long j) {
            long nanoTime = System.nanoTime() - j;
            C3123e.this.f20409b.onVsync(nanoTime < 0 ? 0 : nanoTime, C3123e.this.f20408a, this.f20415f);
            C3126c unused = C3123e.this.f20410c = this;
        }
    }

    private C3123e(FlutterJNI flutterJNI) {
        this.f20409b = flutterJNI;
    }

    /* renamed from: f */
    public static C3123e m23798f(float f, FlutterJNI flutterJNI) {
        if (f20406e == null) {
            f20406e = new C3123e(flutterJNI);
        }
        flutterJNI.setRefreshRateFPS(f);
        C3123e eVar = f20406e;
        eVar.f20408a = (long) (1.0E9d / ((double) f));
        return eVar;
    }

    @TargetApi(17)
    /* renamed from: g */
    public static C3123e m23799g(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f20406e == null) {
            f20406e = new C3123e(flutterJNI);
        }
        if (f20407f == null) {
            C3123e eVar = f20406e;
            Objects.requireNonNull(eVar);
            C3125b bVar = new C3125b(displayManager);
            f20407f = bVar;
            bVar.mo13959a();
        }
        if (f20406e.f20408a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f20406e.f20408a = (long) (1.0E9d / ((double) refreshRate));
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f20406e;
    }

    /* renamed from: h */
    public void mo13958h() {
        this.f20409b.setAsyncWaitForVsyncDelegate(this.f20411d);
    }
}
