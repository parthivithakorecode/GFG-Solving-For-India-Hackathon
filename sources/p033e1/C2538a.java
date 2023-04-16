package p033e1;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import p003a2.C0092o;
import p027d2.C2487a;
import p055h2.C2698d;
import p055h2.C2699e;
import p160x1.C4279a;
import p160x1.C4284f;
import p160x1.C4285g;
import p160x1.C4288j;

@ParametersAreNonnullByDefault
/* renamed from: e1.a */
public class C2538a {
    @GuardedBy("this")

    /* renamed from: a */
    private C4279a f18644a;
    @GuardedBy("this")

    /* renamed from: b */
    private C2698d f18645b;
    @GuardedBy("this")

    /* renamed from: c */
    private boolean f18646c;

    /* renamed from: d */
    private final Object f18647d;
    @GuardedBy("mAutoDisconnectTaskLock")

    /* renamed from: e */
    private C2540b f18648e;
    @GuardedBy("this")

    /* renamed from: f */
    private final Context f18649f;

    /* renamed from: g */
    private final boolean f18650g;

    /* renamed from: h */
    private final long f18651h;

    /* renamed from: e1.a$a */
    public static final class C2539a {

        /* renamed from: a */
        private final String f18652a;

        /* renamed from: b */
        private final boolean f18653b;

        public C2539a(String str, boolean z) {
            this.f18652a = str;
            this.f18653b = z;
        }

        /* renamed from: a */
        public final String mo12454a() {
            return this.f18652a;
        }

        /* renamed from: b */
        public final boolean mo12455b() {
            return this.f18653b;
        }

        public final String toString() {
            String str = this.f18652a;
            boolean z = this.f18653b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    /* renamed from: e1.a$b */
    static class C2540b extends Thread {

        /* renamed from: f */
        private WeakReference<C2538a> f18654f;

        /* renamed from: g */
        private long f18655g;

        /* renamed from: h */
        CountDownLatch f18656h = new CountDownLatch(1);

        /* renamed from: i */
        boolean f18657i = false;

        public C2540b(C2538a aVar, long j) {
            this.f18654f = new WeakReference<>(aVar);
            this.f18655g = j;
            start();
        }

        /* renamed from: a */
        private final void m21169a() {
            C2538a aVar = (C2538a) this.f18654f.get();
            if (aVar != null) {
                aVar.mo12450a();
                this.f18657i = true;
            }
        }

        public final void run() {
            try {
                if (!this.f18656h.await(this.f18655g, TimeUnit.MILLISECONDS)) {
                    m21169a();
                }
            } catch (InterruptedException unused) {
                m21169a();
            }
        }
    }

    public C2538a(Context context) {
        this(context, 30000, false, false);
    }

    private C2538a(Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        this.f18647d = new Object();
        C0092o.m313i(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f18649f = context;
        this.f18646c = false;
        this.f18651h = j;
        this.f18650g = z2;
    }

    /* renamed from: b */
    public static C2539a m21156b(Context context) {
        C2542c cVar = new C2542c(context);
        boolean a = cVar.mo12459a("gads:ad_id_app_context:enabled", false);
        float b = cVar.mo12460b("gads:ad_id_app_context:ping_ratio", 0.0f);
        String c = cVar.mo12461c("gads:ad_id_use_shared_preference:experiment_id", "");
        C2538a aVar = new C2538a(context, -1, a, cVar.mo12459a("gads:ad_id_use_persistent_service:enabled", false));
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.m21161i(false);
            C2539a c2 = aVar.mo12451c();
            aVar.m21162j(c2, a, b, SystemClock.elapsedRealtime() - elapsedRealtime, c, (Throwable) null);
            aVar.mo12450a();
            return c2;
        } catch (Throwable th) {
            aVar.mo12450a();
            throw th;
        }
    }

    /* renamed from: d */
    public static boolean m21157d(Context context) {
        C2542c cVar = new C2542c(context);
        C2538a aVar = new C2538a(context, -1, cVar.mo12459a("gads:ad_id_app_context:enabled", false), cVar.mo12459a("com.google.android.gms.ads.identifier.service.PERSISTENT_START", false));
        try {
            aVar.m21161i(false);
            return aVar.m21163k();
        } finally {
            aVar.mo12450a();
        }
    }

    /* renamed from: f */
    private static C2698d m21158f(Context context, C4279a aVar) {
        try {
            return C2699e.m21625D(aVar.mo15838a(10000, TimeUnit.MILLISECONDS));
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* renamed from: g */
    private static C4279a m21159g(Context context, boolean z) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int h = C4284f.m26845f().mo15863h(context, C4288j.f22593a);
            if (h == 0 || h == 2) {
                String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
                C4279a aVar = new C4279a();
                Intent intent = new Intent(str);
                intent.setPackage("com.google.android.gms");
                try {
                    if (C2487a.m20969b().mo12341a(context, intent, aVar, 1)) {
                        return aVar;
                    }
                    throw new IOException("Connection failure");
                } catch (Throwable th) {
                    throw new IOException(th);
                }
            } else {
                throw new IOException("Google Play services not available");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new C4285g(9);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0011 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0019  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m21160h() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f18647d
            monitor-enter(r0)
            e1.a$b r1 = r5.f18648e     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x0011
            java.util.concurrent.CountDownLatch r1 = r1.f18656h     // Catch:{ all -> 0x0024 }
            r1.countDown()     // Catch:{ all -> 0x0024 }
            e1.a$b r1 = r5.f18648e     // Catch:{ InterruptedException -> 0x0011 }
            r1.join()     // Catch:{ InterruptedException -> 0x0011 }
        L_0x0011:
            long r1 = r5.f18651h     // Catch:{ all -> 0x0024 }
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0022
            e1.a$b r1 = new e1.a$b     // Catch:{ all -> 0x0024 }
            long r2 = r5.f18651h     // Catch:{ all -> 0x0024 }
            r1.<init>(r5, r2)     // Catch:{ all -> 0x0024 }
            r5.f18648e = r1     // Catch:{ all -> 0x0024 }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            return
        L_0x0024:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p033e1.C2538a.m21160h():void");
    }

    /* renamed from: i */
    private final void m21161i(boolean z) {
        C0092o.m312h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f18646c) {
                mo12450a();
            }
            C4279a g = m21159g(this.f18649f, this.f18650g);
            this.f18644a = g;
            this.f18645b = m21158f(this.f18649f, g);
            this.f18646c = true;
            if (z) {
                m21160h();
            }
        }
    }

    /* renamed from: j */
    private final boolean m21162j(C2539a aVar, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > ((double) f)) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = "1";
        hashMap.put("app_context", z ? str2 : "0");
        if (aVar != null) {
            if (!aVar.mo12455b()) {
                str2 = "0";
            }
            hashMap.put("limit_ad_tracking", str2);
        }
        if (!(aVar == null || aVar.mo12454a() == null)) {
            hashMap.put("ad_id_size", Integer.toString(aVar.mo12454a().length()));
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new C2541b(this, hashMap).start();
        return true;
    }

    /* renamed from: k */
    private final boolean m21163k() {
        boolean c;
        C0092o.m312h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f18646c) {
                synchronized (this.f18647d) {
                    C2540b bVar = this.f18648e;
                    if (bVar == null || !bVar.f18657i) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    m21161i(false);
                    if (!this.f18646c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                    throw new IOException("Remote exception");
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            C0092o.m313i(this.f18644a);
            C0092o.m313i(this.f18645b);
            c = this.f18645b.mo12702c();
        }
        m21160h();
        return c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12450a() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            p003a2.C0092o.m312h(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.f18649f     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0031
            x1.a r0 = r3.f18644a     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0031
        L_0x000f:
            boolean r0 = r3.f18646c     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0027
            d2.a r0 = p027d2.C2487a.m20969b()     // Catch:{ all -> 0x001f }
            android.content.Context r1 = r3.f18649f     // Catch:{ all -> 0x001f }
            x1.a r2 = r3.f18644a     // Catch:{ all -> 0x001f }
            r0.mo12342c(r1, r2)     // Catch:{ all -> 0x001f }
            goto L_0x0027
        L_0x001f:
            r0 = move-exception
            java.lang.String r1 = "AdvertisingIdClient"
            java.lang.String r2 = "AdvertisingIdClient unbindService failed."
            android.util.Log.i(r1, r2, r0)     // Catch:{ all -> 0x0033 }
        L_0x0027:
            r0 = 0
            r3.f18646c = r0     // Catch:{ all -> 0x0033 }
            r0 = 0
            r3.f18645b = r0     // Catch:{ all -> 0x0033 }
            r3.f18644a = r0     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0031:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p033e1.C2538a.mo12450a():void");
    }

    /* renamed from: c */
    public C2539a mo12451c() {
        C2539a aVar;
        C0092o.m312h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f18646c) {
                synchronized (this.f18647d) {
                    C2540b bVar = this.f18648e;
                    if (bVar == null || !bVar.f18657i) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    m21161i(false);
                    if (!this.f18646c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                    throw new IOException("Remote exception");
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            C0092o.m313i(this.f18644a);
            C0092o.m313i(this.f18645b);
            aVar = new C2539a(this.f18645b.mo12703j3(), this.f18645b.mo12701X(true));
        }
        m21160h();
        return aVar;
    }

    /* renamed from: e */
    public void mo12452e() {
        m21161i(true);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        mo12450a();
        super.finalize();
    }
}
