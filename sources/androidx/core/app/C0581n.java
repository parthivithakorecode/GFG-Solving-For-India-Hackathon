package androidx.core.app;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p010b.C1287a;

/* renamed from: androidx.core.app.n */
public final class C0581n {

    /* renamed from: c */
    private static final Object f1837c = new Object();

    /* renamed from: d */
    private static String f1838d;

    /* renamed from: e */
    private static Set<String> f1839e = new HashSet();

    /* renamed from: f */
    private static final Object f1840f = new Object();

    /* renamed from: g */
    private static C0585d f1841g;

    /* renamed from: a */
    private final Context f1842a;

    /* renamed from: b */
    private final NotificationManager f1843b;

    /* renamed from: androidx.core.app.n$a */
    private static class C0582a implements C0587e {

        /* renamed from: a */
        final String f1844a;

        /* renamed from: b */
        final int f1845b;

        /* renamed from: c */
        final String f1846c;

        /* renamed from: d */
        final boolean f1847d;

        C0582a(String str) {
            this.f1844a = str;
            this.f1845b = 0;
            this.f1846c = null;
            this.f1847d = true;
        }

        C0582a(String str, int i, String str2) {
            this.f1844a = str;
            this.f1845b = i;
            this.f1846c = str2;
            this.f1847d = false;
        }

        /* renamed from: a */
        public void mo2507a(C1287a aVar) {
            if (this.f1847d) {
                aVar.mo4605V2(this.f1844a);
            } else {
                aVar.mo4606o1(this.f1844a, this.f1845b, this.f1846c);
            }
        }

        public String toString() {
            return "CancelTask[" + "packageName:" + this.f1844a + ", id:" + this.f1845b + ", tag:" + this.f1846c + ", all:" + this.f1847d + "]";
        }
    }

    /* renamed from: androidx.core.app.n$b */
    private static class C0583b implements C0587e {

        /* renamed from: a */
        final String f1848a;

        /* renamed from: b */
        final int f1849b;

        /* renamed from: c */
        final String f1850c;

        /* renamed from: d */
        final Notification f1851d;

        C0583b(String str, int i, String str2, Notification notification) {
            this.f1848a = str;
            this.f1849b = i;
            this.f1850c = str2;
            this.f1851d = notification;
        }

        /* renamed from: a */
        public void mo2507a(C1287a aVar) {
            aVar.mo4604L4(this.f1848a, this.f1849b, this.f1850c, this.f1851d);
        }

        public String toString() {
            return "NotifyTask[" + "packageName:" + this.f1848a + ", id:" + this.f1849b + ", tag:" + this.f1850c + "]";
        }
    }

    /* renamed from: androidx.core.app.n$c */
    private static class C0584c {

        /* renamed from: a */
        final ComponentName f1852a;

        /* renamed from: b */
        final IBinder f1853b;

        C0584c(ComponentName componentName, IBinder iBinder) {
            this.f1852a = componentName;
            this.f1853b = iBinder;
        }
    }

    /* renamed from: androidx.core.app.n$d */
    private static class C0585d implements Handler.Callback, ServiceConnection {

        /* renamed from: f */
        private final Context f1854f;

        /* renamed from: g */
        private final HandlerThread f1855g;

        /* renamed from: h */
        private final Handler f1856h;

        /* renamed from: i */
        private final Map<ComponentName, C0586a> f1857i = new HashMap();

        /* renamed from: j */
        private Set<String> f1858j = new HashSet();

        /* renamed from: androidx.core.app.n$d$a */
        private static class C0586a {

            /* renamed from: a */
            final ComponentName f1859a;

            /* renamed from: b */
            boolean f1860b = false;

            /* renamed from: c */
            C1287a f1861c;

            /* renamed from: d */
            ArrayDeque<C0587e> f1862d = new ArrayDeque<>();

            /* renamed from: e */
            int f1863e = 0;

            C0586a(ComponentName componentName) {
                this.f1859a = componentName;
            }
        }

        C0585d(Context context) {
            this.f1854f = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f1855g = handlerThread;
            handlerThread.start();
            this.f1856h = new Handler(handlerThread.getLooper(), this);
        }

        /* renamed from: a */
        private boolean m2403a(C0586a aVar) {
            if (aVar.f1860b) {
                return true;
            }
            boolean bindService = this.f1854f.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f1859a), this, 33);
            aVar.f1860b = bindService;
            if (bindService) {
                aVar.f1863e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f1859a);
                this.f1854f.unbindService(this);
            }
            return aVar.f1860b;
        }

        /* renamed from: b */
        private void m2404b(C0586a aVar) {
            if (aVar.f1860b) {
                this.f1854f.unbindService(this);
                aVar.f1860b = false;
            }
            aVar.f1861c = null;
        }

        /* renamed from: c */
        private void m2405c(C0587e eVar) {
            m2411j();
            for (C0586a next : this.f1857i.values()) {
                next.f1862d.add(eVar);
                m2409g(next);
            }
        }

        /* renamed from: d */
        private void m2406d(ComponentName componentName) {
            C0586a aVar = this.f1857i.get(componentName);
            if (aVar != null) {
                m2409g(aVar);
            }
        }

        /* renamed from: e */
        private void m2407e(ComponentName componentName, IBinder iBinder) {
            C0586a aVar = this.f1857i.get(componentName);
            if (aVar != null) {
                aVar.f1861c = C1287a.C1288a.m5176D(iBinder);
                aVar.f1863e = 0;
                m2409g(aVar);
            }
        }

        /* renamed from: f */
        private void m2408f(ComponentName componentName) {
            C0586a aVar = this.f1857i.get(componentName);
            if (aVar != null) {
                m2404b(aVar);
            }
        }

        /* renamed from: g */
        private void m2409g(C0586a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f1859a + ", " + aVar.f1862d.size() + " queued tasks");
            }
            if (!aVar.f1862d.isEmpty()) {
                if (!m2403a(aVar) || aVar.f1861c == null) {
                    m2410i(aVar);
                    return;
                }
                while (true) {
                    C0587e peek = aVar.f1862d.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + peek);
                        }
                        peek.mo2507a(aVar.f1861c);
                        aVar.f1862d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + aVar.f1859a);
                        }
                    } catch (RemoteException e) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f1859a, e);
                    }
                }
                if (!aVar.f1862d.isEmpty()) {
                    m2410i(aVar);
                }
            }
        }

        /* renamed from: i */
        private void m2410i(C0586a aVar) {
            if (!this.f1856h.hasMessages(3, aVar.f1859a)) {
                int i = aVar.f1863e + 1;
                aVar.f1863e = i;
                if (i > 6) {
                    Log.w("NotifManCompat", "Giving up on delivering " + aVar.f1862d.size() + " tasks to " + aVar.f1859a + " after " + aVar.f1863e + " retries");
                    aVar.f1862d.clear();
                    return;
                }
                int i2 = (1 << (i - 1)) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i2 + " ms");
                }
                this.f1856h.sendMessageDelayed(this.f1856h.obtainMessage(3, aVar.f1859a), (long) i2);
            }
        }

        /* renamed from: j */
        private void m2411j() {
            Set<String> f = C0581n.m2391f(this.f1854f);
            if (!f.equals(this.f1858j)) {
                this.f1858j = f;
                List<ResolveInfo> queryIntentServices = this.f1854f.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet = new HashSet<>();
                for (ResolveInfo next : queryIntentServices) {
                    if (f.contains(next.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = next.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (next.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.f1857i.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f1857i.put(componentName2, new C0586a(componentName2));
                    }
                }
                Iterator<Map.Entry<ComponentName, C0586a>> it = this.f1857i.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry next2 = it.next();
                    if (!hashSet.contains(next2.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + next2.getKey());
                        }
                        m2404b((C0586a) next2.getValue());
                        it.remove();
                    }
                }
            }
        }

        /* renamed from: h */
        public void mo2510h(C0587e eVar) {
            this.f1856h.obtainMessage(0, eVar).sendToTarget();
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                m2405c((C0587e) message.obj);
                return true;
            } else if (i == 1) {
                C0584c cVar = (C0584c) message.obj;
                m2407e(cVar.f1852a, cVar.f1853b);
                return true;
            } else if (i == 2) {
                m2408f((ComponentName) message.obj);
                return true;
            } else if (i != 3) {
                return false;
            } else {
                m2406d((ComponentName) message.obj);
                return true;
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f1856h.obtainMessage(1, new C0584c(componentName, iBinder)).sendToTarget();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f1856h.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* renamed from: androidx.core.app.n$e */
    private interface C0587e {
        /* renamed from: a */
        void mo2507a(C1287a aVar);
    }

    private C0581n(Context context) {
        this.f1842a = context;
        this.f1843b = (NotificationManager) context.getSystemService("notification");
    }

    /* renamed from: e */
    public static C0581n m2390e(Context context) {
        return new C0581n(context);
    }

    /* renamed from: f */
    public static Set<String> m2391f(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f1837c) {
            if (string != null) {
                if (!string.equals(f1838d)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String unflattenFromString : split) {
                        ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                        if (unflattenFromString2 != null) {
                            hashSet.add(unflattenFromString2.getPackageName());
                        }
                    }
                    f1839e = hashSet;
                    f1838d = string;
                }
            }
            set = f1839e;
        }
        return set;
    }

    /* renamed from: j */
    private void m2392j(C0587e eVar) {
        synchronized (f1840f) {
            if (f1841g == null) {
                f1841g = new C0585d(this.f1842a.getApplicationContext());
            }
            f1841g.mo2510h(eVar);
        }
    }

    /* renamed from: k */
    private static boolean m2393k(Notification notification) {
        Bundle a = C0565k.m2232a(notification);
        return a != null && a.getBoolean("android.support.useSideChannel");
    }

    /* renamed from: a */
    public boolean mo2500a() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return this.f1843b.areNotificationsEnabled();
        }
        if (i < 19) {
            return true;
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f1842a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f1842a.getApplicationInfo();
        String packageName = this.f1842a.getApplicationContext().getPackageName();
        int i2 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", new Class[]{cls2, cls2, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i2), packageName})).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    /* renamed from: b */
    public void mo2501b(int i) {
        mo2502c((String) null, i);
    }

    /* renamed from: c */
    public void mo2502c(String str, int i) {
        this.f1843b.cancel(str, i);
        if (Build.VERSION.SDK_INT <= 19) {
            m2392j(new C0582a(this.f1842a.getPackageName(), i, str));
        }
    }

    /* renamed from: d */
    public void mo2503d() {
        this.f1843b.cancelAll();
        if (Build.VERSION.SDK_INT <= 19) {
            m2392j(new C0582a(this.f1842a.getPackageName()));
        }
    }

    /* renamed from: g */
    public List<NotificationChannel> mo2504g() {
        return Build.VERSION.SDK_INT >= 26 ? this.f1843b.getNotificationChannels() : Collections.emptyList();
    }

    /* renamed from: h */
    public void mo2505h(int i, Notification notification) {
        mo2506i((String) null, i, notification);
    }

    /* renamed from: i */
    public void mo2506i(String str, int i, Notification notification) {
        if (m2393k(notification)) {
            m2392j(new C0583b(this.f1842a.getPackageName(), i, str, notification));
            this.f1843b.cancel(str, i);
            return;
        }
        this.f1843b.notify(str, i, notification);
    }
}
