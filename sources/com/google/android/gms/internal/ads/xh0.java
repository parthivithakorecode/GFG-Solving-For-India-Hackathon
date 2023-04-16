package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.ParametersAreNonnullByDefault;
import p041f2.C2606c;
import p160x1.C4284f;

@ParametersAreNonnullByDefault
public final class xh0 implements zh0 {

    /* renamed from: f */
    private static final Object f17203f = new Object();

    /* renamed from: g */
    static zh0 f17204g;

    /* renamed from: h */
    static zh0 f17205h;

    /* renamed from: a */
    private final Object f17206a = new Object();

    /* renamed from: b */
    private final Context f17207b;

    /* renamed from: c */
    private final WeakHashMap<Thread, Boolean> f17208c = new WeakHashMap<>();

    /* renamed from: d */
    private final ExecutorService f17209d;

    /* renamed from: e */
    private final po0 f17210e;

    protected xh0(Context context, po0 po0) {
        r33.m16037a();
        this.f17209d = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.f17207b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f17210e = po0;
    }

    /* renamed from: c */
    public static zh0 m19512c(Context context) {
        synchronized (f17203f) {
            if (f17204g == null) {
                if (j30.f8971e.mo9928e().booleanValue()) {
                    if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10287G5)).booleanValue()) {
                        f17204g = new xh0(context, po0.m15177c());
                    }
                }
                f17204g = new yh0();
            }
        }
        return f17204g;
    }

    /* renamed from: d */
    public static zh0 m19513d(Context context, po0 po0) {
        synchronized (f17203f) {
            if (f17205h == null) {
                if (j30.f8971e.mo9928e().booleanValue()) {
                    if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10287G5)).booleanValue()) {
                        xh0 xh0 = new xh0(context, po0);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (xh0.f17206a) {
                                xh0.f17208c.put(thread, Boolean.TRUE);
                            }
                            thread.setUncaughtExceptionHandler(new wh0(xh0, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new vh0(xh0, Thread.getDefaultUncaughtExceptionHandler()));
                        f17205h = xh0;
                    }
                }
                f17205h = new yh0();
            }
        }
        return f17205h;
    }

    /* renamed from: a */
    public final void mo11846a(Throwable th, String str) {
        mo11847b(th, str, 1.0f);
    }

    /* renamed from: b */
    public final void mo11847b(Throwable th, String str, float f) {
        boolean z;
        String str2;
        if (bo0.m6985f(th) != null) {
            String name = th.getClass().getName();
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            double d = (double) f;
            double random = Math.random();
            int i = f > 0.0f ? (int) (1.0f / f) : 1;
            if (random < d) {
                ArrayList<String> arrayList = new ArrayList<>();
                try {
                    z = C2606c.m21299a(this.f17207b).mo12497g();
                } catch (Throwable th2) {
                    io0.m11129e("Error fetching instant app info", th2);
                    z = false;
                }
                try {
                    str2 = this.f17207b.getPackageName();
                } catch (Throwable unused) {
                    io0.m11131g("Cannot obtain package name, proceeding.");
                    str2 = "unknown";
                }
                Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
                String str3 = Build.MANUFACTURER;
                String str4 = Build.MODEL;
                if (!str4.startsWith(str3)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + str4.length());
                    sb.append(str3);
                    sb.append(" ");
                    sb.append(str4);
                    str4 = sb.toString();
                }
                arrayList.add(appendQueryParameter.appendQueryParameter("device", str4).appendQueryParameter("js", this.f17210e.f12729f).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", stringWriter2).appendQueryParameter("eids", TextUtils.join(",", m10.m13005a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "428884702").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(j30.f8969c.mo9928e())).appendQueryParameter("gmscv", String.valueOf(C4284f.m26845f().mo15874a(this.f17207b))).appendQueryParameter("lite", true != this.f17210e.f12733j ? "0" : "1").toString());
                for (String uh0 : arrayList) {
                    this.f17209d.execute(new uh0(new oo0((String) null), uh0));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo11848e(Thread thread, Throwable th) {
        if (th != null) {
            boolean z = false;
            boolean z2 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z |= bo0.m6986j(stackTraceElement.getClassName());
                    z2 |= xh0.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (z && !z2) {
                mo11847b(th, "", 1.0f);
            }
        }
    }
}
