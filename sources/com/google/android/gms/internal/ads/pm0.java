package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import p069j1.C3202r1;
import p160x1.C4288j;

@ParametersAreNonnullByDefault
public final class pm0 {

    /* renamed from: a */
    private final AtomicReference<ExecutorService> f12703a = new AtomicReference<>((Object) null);

    /* renamed from: b */
    private final Object f12704b = new Object();
    @GuardedBy("gmpAppIdLock")

    /* renamed from: c */
    private String f12705c = null;
    @GuardedBy("gmpAppIdLock")

    /* renamed from: d */
    private String f12706d = null;

    /* renamed from: e */
    final AtomicBoolean f12707e = new AtomicBoolean(false);

    /* renamed from: f */
    private final AtomicInteger f12708f = new AtomicInteger(-1);

    /* renamed from: g */
    private final AtomicReference<Object> f12709g = new AtomicReference<>((Object) null);

    /* renamed from: h */
    private final AtomicReference<Object> f12710h = new AtomicReference<>((Object) null);

    /* renamed from: i */
    private final ConcurrentMap<String, Method> f12711i = new ConcurrentHashMap(9);

    /* renamed from: j */
    private final AtomicReference<xv0> f12712j = new AtomicReference<>((Object) null);
    @GuardedBy("proxyReference")

    /* renamed from: k */
    private final BlockingQueue<FutureTask<?>> f12713k = new ArrayBlockingQueue(20);

    /* renamed from: l */
    private final Object f12714l = new Object();

    /* renamed from: A */
    static final boolean m15134A(Context context) {
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10460c0)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.m5725a(context, ModuleDescriptor.MODULE_ID) < ((Integer) C2199sw.m17001c().mo8579b(m10.f10469d0)).intValue()) {
            return false;
        }
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10478e0)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    /* renamed from: B */
    private final <T> T m15135B(String str, T t, nm0<T> nm0) {
        synchronized (this.f12712j) {
            if (this.f12712j.get() != null) {
                try {
                    T a = nm0.mo6505a(this.f12712j.get());
                    return a;
                } catch (Exception unused) {
                    m15141c(str, false);
                    return t;
                }
            }
        }
    }

    /* renamed from: C */
    private final Object m15136C(String str, Context context) {
        if (!m15143e(context, "com.google.android.gms.measurement.AppMeasurement", this.f12709g, true)) {
            return null;
        }
        try {
            return m15137D(context, str).invoke(this.f12709g.get(), new Object[0]);
        } catch (Exception unused) {
            m15141c(str, true);
            return null;
        }
    }

    /* renamed from: D */
    private final Method m15137D(Context context, String str) {
        Method method = (Method) this.f12711i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.f12711i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            m15141c(str, false);
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.concurrent.ExecutorService m15138E() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ExecutorService> r0 = r9.f12703a
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L_0x0065
            boolean r0 = p034e2.C2546c.m21176a()
            if (r0 == 0) goto L_0x002d
            com.google.android.gms.internal.ads.o33 r0 = com.google.android.gms.internal.ads.r33.m16037a()
            com.google.android.gms.internal.ads.e10<java.lang.Integer> r1 = com.google.android.gms.internal.ads.m10.f10451b0
            com.google.android.gms.internal.ads.k10 r2 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r1 = r2.mo8579b(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            com.google.android.gms.internal.ads.mm0 r2 = new com.google.android.gms.internal.ads.mm0
            r2.<init>(r9)
            r3 = 2
            java.util.concurrent.ExecutorService r0 = r0.mo9639b(r1, r2, r3)
            goto L_0x005f
        L_0x002d:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            com.google.android.gms.internal.ads.e10<java.lang.Integer> r1 = com.google.android.gms.internal.ads.m10.f10451b0
            com.google.android.gms.internal.ads.k10 r2 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r2 = r2.mo8579b(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            com.google.android.gms.internal.ads.k10 r3 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r1 = r3.mo8579b(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r3 = r1.intValue()
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MINUTES
            java.util.concurrent.LinkedBlockingQueue r7 = new java.util.concurrent.LinkedBlockingQueue
            r7.<init>()
            com.google.android.gms.internal.ads.mm0 r8 = new com.google.android.gms.internal.ads.mm0
            r8.<init>(r9)
            r4 = 1
            r1 = r0
            r1.<init>(r2, r3, r4, r6, r7, r8)
        L_0x005f:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ExecutorService> r1 = r9.f12703a
            r2 = 0
            r1.compareAndSet(r2, r0)
        L_0x0065:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ExecutorService> r0 = r9.f12703a
            java.lang.Object r0 = r0.get()
            java.util.concurrent.ExecutorService r0 = (java.util.concurrent.ExecutorService) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pm0.m15138E():java.util.concurrent.ExecutorService");
    }

    /* renamed from: a */
    private final void m15139a(Context context, String str, String str2) {
        if (m15143e(context, "com.google.android.gms.measurement.AppMeasurement", this.f12709g, true)) {
            Method method = (Method) this.f12711i.get(str2);
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, new Class[]{String.class});
                    this.f12711i.put(str2, method);
                } catch (Exception unused) {
                    m15141c(str2, false);
                    method = null;
                }
            }
            try {
                method.invoke(this.f12709g.get(), new Object[]{str});
                StringBuilder sb = new StringBuilder(str2.length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                C3202r1.m24015k(sb.toString());
            } catch (Exception unused2) {
                m15141c(str2, false);
            }
        }
    }

    /* renamed from: b */
    private final void m15140b(Context context, String str, String str2, Bundle bundle) {
        Class<String> cls = String.class;
        if (mo10109z(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e) {
                String valueOf = String.valueOf(str2);
                io0.m11129e(valueOf.length() != 0 ? "Invalid event ID: ".concat(valueOf) : new String("Invalid event ID: "), e);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (m15134A(context)) {
                m15142d("logEventInternal", new zl0(str, bundle2));
            } else if (m15143e(context, "com.google.android.gms.measurement.AppMeasurement", this.f12709g, true)) {
                Method method = (Method) this.f12711i.get("logEventInternal");
                if (method == null) {
                    try {
                        method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", new Class[]{cls, cls, Bundle.class});
                        this.f12711i.put("logEventInternal", method);
                    } catch (Exception unused) {
                        m15141c("logEventInternal", true);
                        method = null;
                    }
                }
                try {
                    method.invoke(this.f12709g.get(), new Object[]{"am", str, bundle2});
                } catch (Exception unused2) {
                    m15141c("logEventInternal", true);
                }
            }
        }
    }

    /* renamed from: c */
    private final void m15141c(String str, boolean z) {
        if (!this.f12707e.get()) {
            StringBuilder sb = new StringBuilder(str.length() + 30);
            sb.append("Invoke Firebase method ");
            sb.append(str);
            sb.append(" error.");
            io0.m11131g(sb.toString());
            if (z) {
                io0.m11131g("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                this.f12707e.set(true);
            }
        }
    }

    /* renamed from: d */
    private final void m15142d(String str, om0 om0) {
        synchronized (this.f12712j) {
            FutureTask futureTask = new FutureTask(new am0(this, om0, str), (Object) null);
            if (this.f12712j.get() != null) {
                futureTask.run();
            } else {
                this.f12713k.offer(futureTask);
            }
        }
    }

    /* renamed from: e */
    private final boolean m15143e(Context context, String str, AtomicReference<Object> atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                atomicReference.compareAndSet((Object) null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context}));
            } catch (Exception unused) {
                m15141c("getInstance", z);
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final String mo10089f(Context context) {
        if (!mo10109z(context)) {
            return null;
        }
        if (m15134A(context)) {
            Long l = (Long) m15135B("getAdEventId", (Object) null, dm0.f5836a);
            if (l != null) {
                return Long.toString(l.longValue());
            }
            return null;
        }
        Object C = m15136C("generateEventId", context);
        if (C != null) {
            return C.toString();
        }
        return null;
    }

    /* renamed from: g */
    public final String mo10090g(Context context) {
        if (!mo10109z(context)) {
            return null;
        }
        synchronized (this.f12704b) {
            String str = this.f12706d;
            if (str != null) {
                return str;
            }
            this.f12706d = m15134A(context) ? (String) m15135B("getAppIdOrigin", this.f12706d, em0.f6284a) : "fa";
            String str2 = this.f12706d;
            return str2;
        }
    }

    /* renamed from: h */
    public final String mo10091h(Context context) {
        if (!mo10109z(context)) {
            return null;
        }
        long longValue = ((Long) C2199sw.m17001c().mo8579b(m10.f10442a0)).longValue();
        if (m15134A(context)) {
            if (longValue >= 0) {
                return (String) m15138E().submit(new bm0(this)).get(longValue, TimeUnit.MILLISECONDS);
            }
            try {
                return (String) m15135B("getAppInstanceId", (Object) null, fm0.f6866a);
            } catch (TimeoutException unused) {
                return "TIME_OUT";
            } catch (Exception unused2) {
                return null;
            }
        } else if (longValue < 0) {
            return (String) m15136C("getAppInstanceId", context);
        } else {
            try {
                return (String) m15138E().submit(new cm0(this, context)).get(longValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused3) {
                return "TIME_OUT";
            } catch (Exception unused4) {
                return null;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo10092i(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.String r0 = "getCurrentScreenName"
            boolean r1 = r6.mo10109z(r7)
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x000b
            return r2
        L_0x000b:
            boolean r1 = m15134A(r7)
            if (r1 == 0) goto L_0x001c
            com.google.android.gms.internal.ads.yl0 r7 = com.google.android.gms.internal.ads.yl0.f17795a
            java.lang.String r0 = "getCurrentScreenNameOrScreenClass"
            java.lang.Object r7 = r6.m15135B(r0, r2, r7)
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L_0x001c:
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r1 = r6.f12709g
            r3 = 1
            java.lang.String r4 = "com.google.android.gms.measurement.AppMeasurement"
            boolean r1 = r6.m15143e(r7, r4, r1, r3)
            if (r1 != 0) goto L_0x0028
            return r2
        L_0x0028:
            r1 = 0
            java.lang.reflect.Method r3 = r6.m15137D(r7, r0)     // Catch:{ Exception -> 0x0056 }
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r4 = r6.f12709g     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r4 = r4.get()     // Catch:{ Exception -> 0x0056 }
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r3 = r3.invoke(r4, r5)     // Catch:{ Exception -> 0x0056 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0056 }
            if (r3 != 0) goto L_0x0052
            java.lang.String r3 = "getCurrentScreenClass"
            java.lang.reflect.Method r7 = r6.m15137D(r7, r3)     // Catch:{ Exception -> 0x0056 }
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r3 = r6.f12709g     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x0056 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r7 = r7.invoke(r3, r4)     // Catch:{ Exception -> 0x0056 }
            r3 = r7
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0056 }
        L_0x0052:
            if (r3 == 0) goto L_0x0055
            return r3
        L_0x0055:
            return r2
        L_0x0056:
            r6.m15141c(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pm0.mo10092i(android.content.Context):java.lang.String");
    }

    /* renamed from: j */
    public final String mo10093j(Context context) {
        if (!mo10109z(context)) {
            return null;
        }
        synchronized (this.f12704b) {
            String str = this.f12705c;
            if (str != null) {
                return str;
            }
            this.f12705c = m15134A(context) ? (String) m15135B("getGmpAppId", this.f12705c, gm0.f7524a) : (String) m15136C("getGmpAppId", context);
            String str2 = this.f12705c;
            return str2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ String mo10094k() {
        return (String) m15135B("getAppInstanceId", (Object) null, fm0.f6866a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ String mo10095l(Context context) {
        return (String) m15136C("getAppInstanceId", context);
    }

    /* renamed from: m */
    public final void mo10096m(Context context, String str) {
        if (mo10109z(context)) {
            if (m15134A(context)) {
                m15142d("beginAdUnitExposure", new km0(str));
            } else {
                m15139a(context, str, "beginAdUnitExposure");
            }
        }
    }

    /* renamed from: n */
    public final void mo10097n(Context context, String str) {
        if (mo10109z(context)) {
            if (m15134A(context)) {
                m15142d("endAdUnitExposure", new lm0(str));
            } else {
                m15139a(context, str, "endAdUnitExposure");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo10098o(om0 om0, String str) {
        if (this.f12712j.get() != null) {
            try {
                om0.mo8156a(this.f12712j.get());
            } catch (Exception unused) {
                m15141c(str, false);
            }
        }
    }

    /* renamed from: p */
    public final void mo10099p(Context context, String str) {
        m15140b(context, "_aa", str, (Bundle) null);
    }

    /* renamed from: q */
    public final void mo10100q(Context context, String str) {
        m15140b(context, "_aq", str, (Bundle) null);
    }

    /* renamed from: r */
    public final void mo10101r(Context context, String str) {
        m15140b(context, "_ac", str, (Bundle) null);
    }

    /* renamed from: s */
    public final void mo10102s(Context context, String str) {
        m15140b(context, "_ai", str, (Bundle) null);
    }

    /* renamed from: t */
    public final void mo10103t(Context context, String str, String str2, String str3, int i) {
        if (mo10109z(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i);
            m15140b(context, "_ar", str, bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 75);
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(i);
            C3202r1.m24015k(sb.toString());
        }
    }

    /* renamed from: u */
    public final void mo10104u(Context context, C1902kv kvVar) {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10505h0)).booleanValue() && mo10109z(context) && m15134A(context)) {
            synchronized (this.f12714l) {
            }
        }
    }

    /* renamed from: v */
    public final void mo10105v(Context context, n00 n00) {
        qm0.m15707d(context).mo10325b().mo10528d(n00);
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10505h0)).booleanValue() && mo10109z(context) && m15134A(context)) {
            synchronized (this.f12714l) {
            }
        }
    }

    /* renamed from: w */
    public final void mo10106w(Bundle bundle) {
        m15142d("setConsent", new jm0(bundle));
    }

    @Deprecated
    /* renamed from: x */
    public final void mo10107x(Context context, String str) {
        Class<String> cls = String.class;
        if (!mo10109z(context) || !(context instanceof Activity)) {
            return;
        }
        if (m15134A(context)) {
            m15142d("setScreenName", new im0(context, str));
        } else if (m15143e(context, "com.google.firebase.analytics.FirebaseAnalytics", this.f12710h, false)) {
            Method method = (Method) this.f12711i.get("setCurrentScreen");
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", new Class[]{Activity.class, cls, cls});
                    this.f12711i.put("setCurrentScreen", method);
                } catch (Exception unused) {
                    m15141c("setCurrentScreen", false);
                    method = null;
                }
            }
            try {
                method.invoke(this.f12710h.get(), new Object[]{(Activity) context, str, context.getPackageName()});
            } catch (Exception unused2) {
                m15141c("setCurrentScreen", false);
            }
        }
    }

    /* renamed from: y */
    public final boolean mo10108y() {
        synchronized (this.f12714l) {
        }
        return false;
    }

    /* renamed from: z */
    public final boolean mo10109z(Context context) {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10401V)).booleanValue() && !this.f12707e.get()) {
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10487f0)).booleanValue()) {
                return true;
            }
            if (this.f12708f.get() == -1) {
                C2125qw.m15897b();
                if (!bo0.m6990n(context, C4288j.f22593a)) {
                    C2125qw.m15897b();
                    if (bo0.m6991o(context)) {
                        io0.m11131g("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.f12708f.set(0);
                    }
                }
                this.f12708f.set(1);
            }
            if (this.f12708f.get() == 1) {
                return true;
            }
        }
        return false;
    }
}
