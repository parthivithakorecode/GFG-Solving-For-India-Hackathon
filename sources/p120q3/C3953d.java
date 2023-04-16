package p120q3;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.WindowManager;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import p064i4.C2848b;
import p064i4.C2851e;
import p066io.flutter.embedding.engine.FlutterJNI;
import p066io.flutter.view.C3123e;
import p099n3.C3764a;

/* renamed from: q3.d */
public class C3953d {

    /* renamed from: a */
    private boolean f22109a;

    /* renamed from: b */
    private C3956c f22110b;

    /* renamed from: c */
    private long f22111c;

    /* renamed from: d */
    private C3951b f22112d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public FlutterJNI f22113e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ExecutorService f22114f;

    /* renamed from: g */
    Future<C3955b> f22115g;

    /* renamed from: q3.d$a */
    class C3954a implements Callable<C3955b> {

        /* renamed from: a */
        final /* synthetic */ Context f22116a;

        C3954a(Context context) {
            this.f22116a = context;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m26145c() {
            C3953d.this.f22113e.prefetchDefaultFontManager();
        }

        /* renamed from: b */
        public C3955b call() {
            C2851e.m22352a("FlutterLoader initTask");
            try {
                C3957e unused = C3953d.this.m26136i(this.f22116a);
                C3953d.this.f22113e.loadLibrary();
                C3953d.this.f22113e.updateRefreshRate();
                C3953d.this.f22114f.execute(new C3952c(this));
                return new C3955b(C2848b.m22349d(this.f22116a), C2848b.m22346a(this.f22116a), C2848b.m22348c(this.f22116a), (C3954a) null);
            } finally {
                C2851e.m22355d();
            }
        }
    }

    /* renamed from: q3.d$b */
    private static class C3955b {

        /* renamed from: a */
        final String f22118a;

        /* renamed from: b */
        final String f22119b;

        /* renamed from: c */
        final String f22120c;

        private C3955b(String str, String str2, String str3) {
            this.f22118a = str;
            this.f22119b = str2;
            this.f22120c = str3;
        }

        /* synthetic */ C3955b(String str, String str2, String str3, C3954a aVar) {
            this(str, str2, str3);
        }
    }

    /* renamed from: q3.d$c */
    public static class C3956c {

        /* renamed from: a */
        private String f22121a;

        /* renamed from: a */
        public String mo15422a() {
            return this.f22121a;
        }
    }

    public C3953d() {
        this(C3764a.m25580e().mo15008d().mo13471a());
    }

    public C3953d(FlutterJNI flutterJNI) {
        this(flutterJNI, C3764a.m25580e().mo15006b());
    }

    public C3953d(FlutterJNI flutterJNI, ExecutorService executorService) {
        this.f22109a = false;
        this.f22113e = flutterJNI;
        this.f22114f = executorService;
    }

    /* renamed from: g */
    private String m26135g(String str) {
        return this.f22112d.f22104d + File.separator + str;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public C3957e m26136i(Context context) {
        return null;
    }

    /* renamed from: j */
    private static boolean m26137j(Bundle bundle) {
        if (bundle == null) {
            return true;
        }
        return bundle.getBoolean("io.flutter.embedding.android.LeakVM", true);
    }

    /* renamed from: d */
    public boolean mo15414d() {
        return this.f22112d.f22107g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0190 A[Catch:{ Exception -> 0x01cd, all -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0193 A[Catch:{ Exception -> 0x01cd, all -> 0x01cb }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15415e(android.content.Context r10, java.lang.String[] r11) {
        /*
            r9 = this;
            java.lang.String r0 = "--aot-shared-library-name="
            boolean r1 = r9.f22109a
            if (r1 == 0) goto L_0x0007
            return
        L_0x0007:
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            if (r1 != r2) goto L_0x01e7
            q3.d$c r1 = r9.f22110b
            if (r1 == 0) goto L_0x01df
            java.lang.String r1 = "FlutterLoader#ensureInitializationComplete"
            p064i4.C2851e.m22352a(r1)
            java.util.concurrent.Future<q3.d$b> r1 = r9.f22115g     // Catch:{ Exception -> 0x01cd }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x01cd }
            q3.d$b r1 = (p120q3.C3953d.C3955b) r1     // Catch:{ Exception -> 0x01cd }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x01cd }
            r2.<init>()     // Catch:{ Exception -> 0x01cd }
            java.lang.String r3 = "--icu-symbol-prefix=_binary_icudtl_dat"
            r2.add(r3)     // Catch:{ Exception -> 0x01cd }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01cd }
            r3.<init>()     // Catch:{ Exception -> 0x01cd }
            java.lang.String r4 = "--icu-native-lib-path="
            r3.append(r4)     // Catch:{ Exception -> 0x01cd }
            q3.b r4 = r9.f22112d     // Catch:{ Exception -> 0x01cd }
            java.lang.String r4 = r4.f22106f     // Catch:{ Exception -> 0x01cd }
            r3.append(r4)     // Catch:{ Exception -> 0x01cd }
            java.lang.String r4 = java.io.File.separator     // Catch:{ Exception -> 0x01cd }
            r3.append(r4)     // Catch:{ Exception -> 0x01cd }
            java.lang.String r5 = "libflutter.so"
            r3.append(r5)     // Catch:{ Exception -> 0x01cd }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01cd }
            r2.add(r3)     // Catch:{ Exception -> 0x01cd }
            if (r11 == 0) goto L_0x0053
            java.util.Collections.addAll(r2, r11)     // Catch:{ Exception -> 0x01cd }
        L_0x0053:
            r3 = 0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01cd }
            r11.<init>()     // Catch:{ Exception -> 0x01cd }
            r11.append(r0)     // Catch:{ Exception -> 0x01cd }
            q3.b r5 = r9.f22112d     // Catch:{ Exception -> 0x01cd }
            java.lang.String r5 = r5.f22101a     // Catch:{ Exception -> 0x01cd }
            r11.append(r5)     // Catch:{ Exception -> 0x01cd }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x01cd }
            r2.add(r11)     // Catch:{ Exception -> 0x01cd }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01cd }
            r11.<init>()     // Catch:{ Exception -> 0x01cd }
            r11.append(r0)     // Catch:{ Exception -> 0x01cd }
            q3.b r0 = r9.f22112d     // Catch:{ Exception -> 0x01cd }
            java.lang.String r0 = r0.f22106f     // Catch:{ Exception -> 0x01cd }
            r11.append(r0)     // Catch:{ Exception -> 0x01cd }
            r11.append(r4)     // Catch:{ Exception -> 0x01cd }
            q3.b r0 = r9.f22112d     // Catch:{ Exception -> 0x01cd }
            java.lang.String r0 = r0.f22101a     // Catch:{ Exception -> 0x01cd }
            r11.append(r0)     // Catch:{ Exception -> 0x01cd }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x01cd }
            r2.add(r11)     // Catch:{ Exception -> 0x01cd }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01cd }
            r11.<init>()     // Catch:{ Exception -> 0x01cd }
            java.lang.String r0 = "--cache-dir-path="
            r11.append(r0)     // Catch:{ Exception -> 0x01cd }
            java.lang.String r0 = r1.f22119b     // Catch:{ Exception -> 0x01cd }
            r11.append(r0)     // Catch:{ Exception -> 0x01cd }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x01cd }
            r2.add(r11)     // Catch:{ Exception -> 0x01cd }
            q3.b r11 = r9.f22112d     // Catch:{ Exception -> 0x01cd }
            java.lang.String r11 = r11.f22105e     // Catch:{ Exception -> 0x01cd }
            if (r11 == 0) goto L_0x00be
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01cd }
            r11.<init>()     // Catch:{ Exception -> 0x01cd }
            java.lang.String r0 = "--domain-network-policy="
            r11.append(r0)     // Catch:{ Exception -> 0x01cd }
            q3.b r0 = r9.f22112d     // Catch:{ Exception -> 0x01cd }
            java.lang.String r0 = r0.f22105e     // Catch:{ Exception -> 0x01cd }
            r11.append(r0)     // Catch:{ Exception -> 0x01cd }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x01cd }
            r2.add(r11)     // Catch:{ Exception -> 0x01cd }
        L_0x00be:
            q3.d$c r11 = r9.f22110b     // Catch:{ Exception -> 0x01cd }
            java.lang.String r11 = r11.mo15422a()     // Catch:{ Exception -> 0x01cd }
            if (r11 == 0) goto L_0x00e0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01cd }
            r11.<init>()     // Catch:{ Exception -> 0x01cd }
            java.lang.String r0 = "--log-tag="
            r11.append(r0)     // Catch:{ Exception -> 0x01cd }
            q3.d$c r0 = r9.f22110b     // Catch:{ Exception -> 0x01cd }
            java.lang.String r0 = r0.mo15422a()     // Catch:{ Exception -> 0x01cd }
            r11.append(r0)     // Catch:{ Exception -> 0x01cd }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x01cd }
            r2.add(r11)     // Catch:{ Exception -> 0x01cd }
        L_0x00e0:
            android.content.pm.PackageManager r11 = r10.getPackageManager()     // Catch:{ Exception -> 0x01cd }
            java.lang.String r0 = r10.getPackageName()     // Catch:{ Exception -> 0x01cd }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r11 = r11.getApplicationInfo(r0, r4)     // Catch:{ Exception -> 0x01cd }
            android.os.Bundle r11 = r11.metaData     // Catch:{ Exception -> 0x01cd }
            r0 = 0
            if (r11 == 0) goto L_0x00fa
            java.lang.String r4 = "io.flutter.embedding.android.OldGenHeapSize"
            int r4 = r11.getInt(r4)     // Catch:{ Exception -> 0x01cd }
            goto L_0x00fb
        L_0x00fa:
            r4 = r0
        L_0x00fb:
            if (r4 != 0) goto L_0x011a
            java.lang.String r4 = "activity"
            java.lang.Object r4 = r10.getSystemService(r4)     // Catch:{ Exception -> 0x01cd }
            android.app.ActivityManager r4 = (android.app.ActivityManager) r4     // Catch:{ Exception -> 0x01cd }
            android.app.ActivityManager$MemoryInfo r5 = new android.app.ActivityManager$MemoryInfo     // Catch:{ Exception -> 0x01cd }
            r5.<init>()     // Catch:{ Exception -> 0x01cd }
            r4.getMemoryInfo(r5)     // Catch:{ Exception -> 0x01cd }
            long r4 = r5.totalMem     // Catch:{ Exception -> 0x01cd }
            double r4 = (double) r4     // Catch:{ Exception -> 0x01cd }
            r6 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r4 = r4 / r6
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = r4 / r6
            int r4 = (int) r4     // Catch:{ Exception -> 0x01cd }
        L_0x011a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01cd }
            r5.<init>()     // Catch:{ Exception -> 0x01cd }
            java.lang.String r6 = "--old-gen-heap-size="
            r5.append(r6)     // Catch:{ Exception -> 0x01cd }
            r5.append(r4)     // Catch:{ Exception -> 0x01cd }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x01cd }
            r2.add(r4)     // Catch:{ Exception -> 0x01cd }
            android.content.res.Resources r4 = r10.getResources()     // Catch:{ Exception -> 0x01cd }
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()     // Catch:{ Exception -> 0x01cd }
            int r5 = r4.widthPixels     // Catch:{ Exception -> 0x01cd }
            int r4 = r4.heightPixels     // Catch:{ Exception -> 0x01cd }
            int r5 = r5 * r4
            int r5 = r5 * 12
            int r5 = r5 * 4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01cd }
            r4.<init>()     // Catch:{ Exception -> 0x01cd }
            java.lang.String r6 = "--resource-cache-max-bytes-threshold="
            r4.append(r6)     // Catch:{ Exception -> 0x01cd }
            r4.append(r5)     // Catch:{ Exception -> 0x01cd }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x01cd }
            r2.add(r4)     // Catch:{ Exception -> 0x01cd }
            java.lang.String r4 = "--prefetched-default-font-manager"
            r2.add(r4)     // Catch:{ Exception -> 0x01cd }
            r8 = 1
            if (r11 == 0) goto L_0x0166
            java.lang.String r4 = "io.flutter.embedding.android.EnableSkParagraph"
            boolean r4 = r11.getBoolean(r4, r8)     // Catch:{ Exception -> 0x01cd }
            if (r4 == 0) goto L_0x0164
            goto L_0x0166
        L_0x0164:
            r4 = r0
            goto L_0x0167
        L_0x0166:
            r4 = r8
        L_0x0167:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01cd }
            r5.<init>()     // Catch:{ Exception -> 0x01cd }
            java.lang.String r6 = "--enable-skparagraph="
            r5.append(r6)     // Catch:{ Exception -> 0x01cd }
            r5.append(r4)     // Catch:{ Exception -> 0x01cd }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x01cd }
            r2.add(r4)     // Catch:{ Exception -> 0x01cd }
            if (r11 == 0) goto L_0x018a
            java.lang.String r4 = "io.flutter.embedding.android.EnableImpeller"
            boolean r4 = r11.getBoolean(r4, r0)     // Catch:{ Exception -> 0x01cd }
            if (r4 == 0) goto L_0x018a
            java.lang.String r4 = "--enable-impeller"
            r2.add(r4)     // Catch:{ Exception -> 0x01cd }
        L_0x018a:
            boolean r11 = m26137j(r11)     // Catch:{ Exception -> 0x01cd }
            if (r11 == 0) goto L_0x0193
            java.lang.String r11 = "true"
            goto L_0x0195
        L_0x0193:
            java.lang.String r11 = "false"
        L_0x0195:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01cd }
            r4.<init>()     // Catch:{ Exception -> 0x01cd }
            java.lang.String r5 = "--leak-vm="
            r4.append(r5)     // Catch:{ Exception -> 0x01cd }
            r4.append(r11)     // Catch:{ Exception -> 0x01cd }
            java.lang.String r11 = r4.toString()     // Catch:{ Exception -> 0x01cd }
            r2.add(r11)     // Catch:{ Exception -> 0x01cd }
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x01cd }
            long r6 = r9.f22111c     // Catch:{ Exception -> 0x01cd }
            long r6 = r4 - r6
            io.flutter.embedding.engine.FlutterJNI r11 = r9.f22113e     // Catch:{ Exception -> 0x01cd }
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ Exception -> 0x01cd }
            java.lang.Object[] r0 = r2.toArray(r0)     // Catch:{ Exception -> 0x01cd }
            r2 = r0
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch:{ Exception -> 0x01cd }
            java.lang.String r4 = r1.f22118a     // Catch:{ Exception -> 0x01cd }
            java.lang.String r5 = r1.f22119b     // Catch:{ Exception -> 0x01cd }
            r0 = r11
            r1 = r10
            r0.init(r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x01cd }
            r9.f22109a = r8     // Catch:{ Exception -> 0x01cd }
            p064i4.C2851e.m22355d()
            return
        L_0x01cb:
            r10 = move-exception
            goto L_0x01db
        L_0x01cd:
            r10 = move-exception
            java.lang.String r11 = "FlutterLoader"
            java.lang.String r0 = "Flutter initialization failed."
            p099n3.C3768b.m25589c(r11, r0, r10)     // Catch:{ all -> 0x01cb }
            java.lang.RuntimeException r11 = new java.lang.RuntimeException     // Catch:{ all -> 0x01cb }
            r11.<init>(r10)     // Catch:{ all -> 0x01cb }
            throw r11     // Catch:{ all -> 0x01cb }
        L_0x01db:
            p064i4.C2851e.m22355d()
            throw r10
        L_0x01df:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "ensureInitializationComplete must be called after startInitialization"
            r10.<init>(r11)
            throw r10
        L_0x01e7:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "ensureInitializationComplete must be called on the main thread"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p120q3.C3953d.mo15415e(android.content.Context, java.lang.String[]):void");
    }

    /* renamed from: f */
    public String mo15416f() {
        return this.f22112d.f22104d;
    }

    /* renamed from: h */
    public String mo15417h(String str) {
        return m26135g(str);
    }

    /* renamed from: k */
    public void mo15418k(Context context) {
        mo15419l(context, new C3956c());
    }

    /* renamed from: l */
    public void mo15419l(Context context, C3956c cVar) {
        if (this.f22110b == null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                C2851e.m22352a("FlutterLoader#startInitialization");
                try {
                    Context applicationContext = context.getApplicationContext();
                    this.f22110b = cVar;
                    this.f22111c = SystemClock.uptimeMillis();
                    this.f22112d = C3950a.m26128e(applicationContext);
                    (Build.VERSION.SDK_INT >= 17 ? C3123e.m23799g((DisplayManager) applicationContext.getSystemService("display"), this.f22113e) : C3123e.m23798f(((WindowManager) applicationContext.getSystemService("window")).getDefaultDisplay().getRefreshRate(), this.f22113e)).mo13958h();
                    this.f22115g = this.f22114f.submit(new C3954a(applicationContext));
                } finally {
                    C2851e.m22355d();
                }
            } else {
                throw new IllegalStateException("startInitialization must be called on the main thread");
            }
        }
    }
}
