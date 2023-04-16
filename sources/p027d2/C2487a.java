package p027d2;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.Nullable;
import p003a2.C0066e1;
import p003a2.C0092o;
import p041f2.C2606c;

/* renamed from: d2.a */
public class C2487a {

    /* renamed from: b */
    private static final Object f18543b = new Object();
    @Nullable

    /* renamed from: c */
    private static volatile C2487a f18544c;
    @RecentlyNonNull

    /* renamed from: a */
    public ConcurrentHashMap<ServiceConnection, ServiceConnection> f18545a = new ConcurrentHashMap<>();

    private C2487a() {
    }

    @RecentlyNonNull
    /* renamed from: b */
    public static C2487a m20969b() {
        if (f18544c == null) {
            synchronized (f18543b) {
                if (f18544c == null) {
                    f18544c = new C2487a();
                }
            }
        }
        C2487a aVar = f18544c;
        C0092o.m313i(aVar);
        return aVar;
    }

    @SuppressLint({"UntrackedBindService"})
    /* renamed from: e */
    private final boolean m20970e(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, boolean z) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C2606c.m21299a(context).mo12493c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!m20971f(serviceConnection)) {
            return context.bindService(intent, serviceConnection, i);
        }
        ServiceConnection putIfAbsent = this.f18545a.putIfAbsent(serviceConnection, serviceConnection);
        if (!(putIfAbsent == null || serviceConnection == putIfAbsent)) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[]{serviceConnection, str, intent.getAction()}));
        }
        try {
            boolean bindService = context.bindService(intent, serviceConnection, i);
            if (bindService) {
                return bindService;
            }
            return false;
        } finally {
            this.f18545a.remove(serviceConnection, serviceConnection);
        }
    }

    /* renamed from: f */
    private static boolean m20971f(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof C0066e1);
    }

    @SuppressLint({"UntrackedBindService"})
    /* renamed from: g */
    private static void m20972g(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    /* renamed from: a */
    public boolean mo12341a(@RecentlyNonNull Context context, @RecentlyNonNull Intent intent, @RecentlyNonNull ServiceConnection serviceConnection, int i) {
        return m20970e(context, context.getClass().getName(), intent, serviceConnection, i, true);
    }

    @SuppressLint({"UntrackedBindService"})
    /* renamed from: c */
    public void mo12342c(@RecentlyNonNull Context context, @RecentlyNonNull ServiceConnection serviceConnection) {
        if (!m20971f(serviceConnection) || !this.f18545a.containsKey(serviceConnection)) {
            m20972g(context, serviceConnection);
            return;
        }
        try {
            m20972g(context, this.f18545a.get(serviceConnection));
        } finally {
            this.f18545a.remove(serviceConnection);
        }
    }

    /* renamed from: d */
    public final boolean mo12343d(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull Intent intent, @RecentlyNonNull ServiceConnection serviceConnection, int i) {
        return m20970e(context, str, intent, serviceConnection, i, true);
    }
}
