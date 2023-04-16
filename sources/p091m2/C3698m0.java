package p091m2;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: m2.m0 */
public final class C3698m0 extends C3706q0 {

    /* renamed from: f */
    private final AtomicReference<Bundle> f21481f = new AtomicReference<>();

    /* renamed from: g */
    private boolean f21482g;

    /* renamed from: Z2 */
    public static final <T> T m25335Z2(Bundle bundle, Class<T> cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", new Object[]{cls.getCanonicalName(), obj.getClass().getCanonicalName()}), e);
            throw e;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000d */
    /* renamed from: C0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo14872C0(long r3) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<android.os.Bundle> r0 = r2.f21481f
            monitor-enter(r0)
            boolean r1 = r2.f21482g     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0010
            java.util.concurrent.atomic.AtomicReference<android.os.Bundle> r1 = r2.f21481f     // Catch:{ InterruptedException -> 0x000d }
            r1.wait(r3)     // Catch:{ InterruptedException -> 0x000d }
            goto L_0x0010
        L_0x000d:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            r3 = 0
            return r3
        L_0x0010:
            java.util.concurrent.atomic.AtomicReference<android.os.Bundle> r3 = r2.f21481f     // Catch:{ all -> 0x001a }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x001a }
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ all -> 0x001a }
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r3
        L_0x001a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p091m2.C3698m0.mo14872C0(long):android.os.Bundle");
    }

    /* renamed from: a2 */
    public final void mo14873a2(Bundle bundle) {
        synchronized (this.f21481f) {
            try {
                this.f21481f.set(bundle);
                this.f21482g = true;
                this.f21481f.notify();
            } catch (Throwable th) {
                this.f21481f.notify();
                throw th;
            }
        }
    }

    /* renamed from: n0 */
    public final String mo14874n0(long j) {
        return (String) m25335Z2(mo14872C0(j), String.class);
    }
}
