package p069j1;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.C2125qw;
import com.google.android.gms.internal.ads.C2199sw;
import com.google.android.gms.internal.ads.bo0;
import com.google.android.gms.internal.ads.cc3;
import com.google.android.gms.internal.ads.cv0;
import com.google.android.gms.internal.ads.e10;
import com.google.android.gms.internal.ads.ho0;
import com.google.android.gms.internal.ads.ht1;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.j30;
import com.google.android.gms.internal.ads.kj0;
import com.google.android.gms.internal.ads.l20;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.rb3;
import com.google.android.gms.internal.ads.rr2;
import com.google.android.gms.internal.ads.s33;
import com.google.android.gms.internal.ads.ur2;
import com.google.android.gms.internal.ads.vt0;
import com.google.android.gms.internal.ads.wo0;
import com.google.android.gms.internal.ads.zv3;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p026d1.C2486n;
import p034e2.C2549f;
import p034e2.C2555l;
import p040f1.C2603b;
import p041f2.C2606c;
import p054h1.C2694t;
import p095n.C3742c;
import p104o1.C3827e;

/* renamed from: j1.g2 */
public final class C3163g2 {

    /* renamed from: i */
    public static final s33 f20465i = new C3205s1(Looper.getMainLooper());
    /* access modifiers changed from: private */
    @GuardedBy("AdUtil.class")

    /* renamed from: j */
    public static boolean f20466j = false;

    /* renamed from: a */
    private final AtomicReference<Pattern> f20467a = new AtomicReference<>((Object) null);

    /* renamed from: b */
    private final AtomicReference<Pattern> f20468b = new AtomicReference<>((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f20469c = true;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Object f20470d = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("userAgentLock")

    /* renamed from: e */
    public String f20471e;

    /* renamed from: f */
    private boolean f20472f = false;

    /* renamed from: g */
    private boolean f20473g = false;

    /* renamed from: h */
    private final Executor f20474h = Executors.newSingleThreadExecutor();

    /* renamed from: A */
    public static int m23904A(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i <= 0) {
            return 60000;
        }
        StringBuilder sb = new StringBuilder(97);
        sb.append("HTTP timeout too low: ");
        sb.append(i);
        sb.append(" milliseconds. Reverting to default timeout: 60000 milliseconds.");
        io0.m11131g(sb.toString());
        return 60000;
    }

    /* renamed from: B */
    public static final boolean m23905B(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return m23948x(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, m23906C(context));
    }

    /* renamed from: C */
    private static KeyguardManager m23906C(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    /* renamed from: D */
    private static Bundle m23907D(Context context) {
        try {
            return C2606c.m21299a(context).mo12493c(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            C3202r1.m24016l("Error getting metadata", e);
            return null;
        }
    }

    /* renamed from: E */
    private static String m23908E(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return TextUtils.isEmpty(string) ? "" : (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "";
    }

    /* renamed from: F */
    private final JSONArray m23909F(Collection<?> collection) {
        JSONArray jSONArray = new JSONArray();
        for (Object G : collection) {
            m23910G(jSONArray, G);
        }
        return jSONArray;
    }

    /* renamed from: G */
    private final void m23910G(JSONArray jSONArray, Object obj) {
        Object F;
        if (obj instanceof Bundle) {
            F = mo14023M((Bundle) obj);
        } else if (obj instanceof Map) {
            F = mo14024N((Map) obj);
        } else if (obj instanceof Collection) {
            F = m23909F((Collection) obj);
        } else if (obj instanceof Object[]) {
            JSONArray jSONArray2 = new JSONArray();
            for (Object G : (Object[]) obj) {
                m23910G(jSONArray2, G);
            }
            jSONArray.put(jSONArray2);
            return;
        } else {
            jSONArray.put(obj);
            return;
        }
        jSONArray.put(F);
    }

    /* renamed from: H */
    private final void m23911H(JSONObject jSONObject, String str, Object obj) {
        Collection asList;
        Object F;
        if (obj instanceof Bundle) {
            F = mo14023M((Bundle) obj);
        } else if (obj instanceof Map) {
            F = mo14024N((Map) obj);
        } else {
            if (obj instanceof Collection) {
                if (str == null) {
                    str = "null";
                }
                asList = (Collection) obj;
            } else if (obj instanceof Object[]) {
                asList = Arrays.asList((Object[]) obj);
            } else {
                jSONObject.put(str, obj);
                return;
            }
            F = m23909F(asList);
        }
        jSONObject.put(str, F);
    }

    /* renamed from: I */
    private static boolean m23912I(String str, AtomicReference<Pattern> atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    /* renamed from: U */
    public static void m23917U(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            wo0.f16886a.execute(runnable);
        }
    }

    /* renamed from: a */
    public static final long m23918a(View view) {
        float f;
        int i;
        float f2 = Float.MAX_VALUE;
        Object obj = view;
        do {
            f = 0.0f;
            if (!(obj instanceof View)) {
                break;
            }
            View view2 = (View) obj;
            f2 = Math.min(f2, view2.getAlpha());
            i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            obj = view2.getParent();
        } while (i > 0);
        if (f2 >= 0.0f) {
            f = f2;
        }
        return (long) Math.round(f * 100.0f);
    }

    /* renamed from: b */
    public static final WebResourceResponse m23919b(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", C2694t.m21608q().mo14022L(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = new C3210u0(context).mo14109b(0, str2, hashMap, (byte[]) null).get(60, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            io0.m11132h("Could not fetch MRAID JS.", e);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* renamed from: b0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m23920b0(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L_0x0009
        L_0x0007:
            r2 = r0
            goto L_0x0013
        L_0x0009:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0007
            android.app.Activity r2 = (android.app.Activity) r2
        L_0x0013:
            r1 = 0
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L_0x001e
            goto L_0x0022
        L_0x001e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L_0x0022:
            if (r0 == 0) goto L_0x002d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x002d
            r2 = 1
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p069j1.C3163g2.m23920b0(android.view.View):boolean");
    }

    /* renamed from: c */
    public static final int m23921c(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (C2555l.m21217k()) {
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10547l6)).booleanValue()) {
                return 0;
            }
        }
        return telephonyManager.getNetworkType();
    }

    @TargetApi(18)
    /* renamed from: c0 */
    public static final void m23922c0(Context context, Intent intent) {
        if (intent != null && C2555l.m21210d()) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            extras.putBinder("android.support.customtabs.extra.SESSION", (IBinder) null);
            extras.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(extras);
        }
    }

    /* renamed from: d */
    public static final String m23923d() {
        Resources d = C2694t.m21607p().mo11022d();
        return d != null ? d.getString(C2603b.s7) : "Test Ad";
    }

    /* renamed from: d0 */
    public static final String m23924d0(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return m23908E(m23907D(context));
    }

    /* renamed from: e */
    public static final C3219x0 m23925e(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                io0.m11128d("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return queryLocalInterface instanceof C3219x0 ? (C3219x0) queryLocalInterface : new C3213v0(iBinder);
        } catch (Exception e) {
            C2694t.m21607p().mo11034s(e, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    /* renamed from: e0 */
    static final String m23926e0() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    /* renamed from: f */
    public static final boolean m23927f(Context context, String str) {
        Context a = kj0.m12224a(context);
        return C2606c.m21299a(a).mo12492b(str, a.getPackageName()) == 0;
    }

    /* renamed from: f0 */
    public static final String m23928f0() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + str2.length());
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: g */
    public static final boolean m23929g(String str) {
        if (!ho0.m10681l()) {
            return false;
        }
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10647x3)).booleanValue()) {
            return false;
        }
        String str2 = (String) C2199sw.m17001c().mo8579b(m10.f10663z3);
        if (!str2.isEmpty()) {
            for (String equals : str2.split(";")) {
                if (equals.equals(str)) {
                    return false;
                }
            }
        }
        String str3 = (String) C2199sw.m17001c().mo8579b(m10.f10655y3);
        if (str3.isEmpty()) {
            return true;
        }
        for (String equals2 : str3.split(";")) {
            if (equals2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g0 */
    public static final DisplayMetrics m23930g0(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r2 = m23906C(r2);
     */
    @android.annotation.TargetApi(16)
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m23931h(android.content.Context r2) {
        /*
            r0 = 0
            if (r2 == 0) goto L_0x0018
            boolean r1 = p034e2.C2555l.m21208b()
            if (r1 != 0) goto L_0x000a
            goto L_0x0018
        L_0x000a:
            android.app.KeyguardManager r2 = m23906C(r2)
            if (r2 == 0) goto L_0x0018
            boolean r2 = r2.isKeyguardLocked()
            if (r2 == 0) goto L_0x0018
            r2 = 1
            return r2
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p069j1.C3163g2.m23931h(android.content.Context):boolean");
    }

    /* renamed from: h0 */
    protected static final int[] m23932h0() {
        return new int[]{0, 0};
    }

    /* renamed from: i */
    public static final boolean m23933i(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            io0.m11129e("Error loading class.", th);
            C2694t.m21607p().mo11034s(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    /* renamed from: j */
    public static final boolean m23934j(Context context) {
        boolean z;
        if (C2555l.m21216j()) {
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10529j6)).booleanValue()) {
                synchronized (C3163g2.class) {
                    z = f20466j;
                }
                return z;
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: k */
    public static final boolean m23935k(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager != null) {
                if (keyguardManager != null) {
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses == null) {
                        return false;
                    }
                    for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                        if (Process.myPid() == next.pid) {
                            if (next.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                                return true;
                            }
                            PowerManager powerManager = (PowerManager) context.getSystemService("power");
                            if (powerManager == null) {
                                return true;
                            }
                            return !powerManager.isScreenOn();
                        }
                    }
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: l */
    public static final boolean m23936l(Context context) {
        Bundle D = m23907D(context);
        return TextUtils.isEmpty(m23908E(D)) && !TextUtils.isEmpty(D.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
    }

    /* renamed from: m */
    public static final boolean m23937m(Context context) {
        Window window;
        if (!(!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || window.getDecorView() == null)) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, (Point) null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            return (rect.bottom == 0 || rect2.bottom == 0 || rect.top != rect2.top) ? false : true;
        }
    }

    /* renamed from: n */
    public static final void m23938n(View view, int i, MotionEvent motionEvent) {
        int i2;
        String str;
        int i3;
        int i4;
        String str2;
        rr2 A;
        View view2 = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view.getContext().getPackageName();
            if (view2 instanceof ht1) {
                view2 = ((ht1) view2).getChildAt(0);
            }
            if ((view2 instanceof C2486n) || (view2 instanceof C3827e)) {
                str = "NATIVE";
                i2 = 1;
            } else {
                str = "UNKNOWN";
                i2 = 0;
            }
            if (view2.getLocalVisibleRect(rect)) {
                i3 = rect.width();
                i4 = rect.height();
            } else {
                i4 = 0;
                i3 = 0;
            }
            C2694t.m21608q();
            long a = m23918a(view2);
            view2.getLocationOnScreen(iArr);
            int i5 = iArr[0];
            int i6 = iArr[1];
            String str3 = "none";
            if (view2 instanceof cv0) {
                ur2 F = ((cv0) view2).mo6308F();
                if (F != null) {
                    str2 = F.f15729b;
                    int hashCode = view2.hashCode();
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 12);
                    sb.append(str2);
                    sb.append(":");
                    sb.append(hashCode);
                    view2.setContentDescription(sb.toString());
                    if ((view2 instanceof vt0) && (A = ((vt0) view2).mo7073A()) != null) {
                        str = rr2.m16425a(A.f13886b);
                        i2 = A.f13894f;
                        str3 = A.f13863F;
                    }
                    io0.m11130f(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", new Object[]{Integer.valueOf(view2.hashCode()), packageName, str3, str2, str, Integer.valueOf(i2), view2.getClass().getName(), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()), Integer.valueOf(i3), Integer.valueOf(i4), Long.valueOf(a), Integer.toString(i, 2)}));
                }
            }
            str2 = str3;
            str = rr2.m16425a(A.f13886b);
            i2 = A.f13894f;
            str3 = A.f13863F;
            io0.m11130f(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", new Object[]{Integer.valueOf(view2.hashCode()), packageName, str3, str2, str, Integer.valueOf(i2), view2.getClass().getName(), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()), Integer.valueOf(i3), Integer.valueOf(i4), Long.valueOf(a), Integer.toString(i, 2)}));
        } catch (Exception e) {
            io0.m11129e("Failure getting view location.", e);
        }
    }

    /* renamed from: o */
    public static final void m23939o(Context context, String str, String str2) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(str2);
        for (String f1Var : arrayList) {
            new C3158f1(context, str, f1Var).mo8781b();
        }
    }

    /* renamed from: p */
    public static final void m23940p(Context context, Throwable th) {
        if (context != null) {
            try {
                if (j30.f8968b.mo9928e().booleanValue()) {
                    C2549f.m21186a(context, th);
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    /* renamed from: q */
    public static final void m23941q(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    /* renamed from: r */
    public static final int m23942r(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            io0.m11131g("Could not parse value:".concat(e.toString()));
            return 0;
        }
    }

    /* renamed from: s */
    public static final Map<String, String> m23943s(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String next : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(next)) {
                hashMap.put(next, uri.getQueryParameter(next));
            }
        }
        return hashMap;
    }

    /* renamed from: t */
    public static final WebResourceResponse m23944t(HttpURLConnection httpURLConnection) {
        C2694t.m21608q();
        String contentType = httpURLConnection.getContentType();
        String str = "";
        String trim = TextUtils.isEmpty(contentType) ? str : contentType.split(";")[0].trim();
        C2694t.m21608q();
        String contentType2 = httpURLConnection.getContentType();
        if (!TextUtils.isEmpty(contentType2)) {
            String[] split = contentType2.split(";");
            if (split.length != 1) {
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    if (split[i].trim().startsWith("charset")) {
                        String[] split2 = split[i].trim().split("=");
                        if (split2.length > 1) {
                            str = split2[1].trim();
                            break;
                        }
                    }
                    i++;
                }
            }
        }
        String str2 = str;
        Map headerFields = httpURLConnection.getHeaderFields();
        HashMap hashMap = new HashMap(headerFields.size());
        for (Map.Entry entry : headerFields.entrySet()) {
            if (!(entry.getKey() == null || entry.getValue() == null || ((List) entry.getValue()).size() <= 0)) {
                hashMap.put((String) entry.getKey(), (String) ((List) entry.getValue()).get(0));
            }
        }
        return C2694t.m21609r().mo14008m(trim, str2, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
    }

    /* renamed from: u */
    public static final int[] m23945u(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        if (window == null || (findViewById = window.findViewById(16908290)) == null) {
            return m23932h0();
        }
        return new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    /* renamed from: v */
    protected static final String m23946v(Context context) {
        try {
            return new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return m23926e0();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = r0.findViewById(16908290);
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int[] m23947w(android.app.Activity r6) {
        /*
            android.view.Window r0 = r6.getWindow()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0021
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r4)
            if (r0 == 0) goto L_0x0021
            int[] r4 = new int[r1]
            int r5 = r0.getTop()
            r4[r3] = r5
            int r0 = r0.getBottom()
            r4[r2] = r0
            goto L_0x0025
        L_0x0021:
            int[] r4 = m23932h0()
        L_0x0025:
            int[] r0 = new int[r1]
            com.google.android.gms.internal.ads.bo0 r1 = com.google.android.gms.internal.ads.C2125qw.m15897b()
            r5 = r4[r3]
            int r1 = r1.mo5896b(r6, r5)
            r0[r3] = r1
            com.google.android.gms.internal.ads.bo0 r1 = com.google.android.gms.internal.ads.C2125qw.m15897b()
            r3 = r4[r2]
            int r6 = r1.mo5896b(r6, r3)
            r0[r2] = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p069j1.C3163g2.m23947w(android.app.Activity):int[]");
    }

    /* renamed from: x */
    public static final boolean m23948x(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z = C2694t.m21608q().f20469c || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || m23920b0(view);
        long a = m23918a(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z)) {
            if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10410W0)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10467c7)).booleanValue()) {
                    return true;
                }
                if (a >= ((long) ((Integer) C2199sw.m17001c().mo8579b(m10.f10485e7)).intValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @TargetApi(18)
    /* renamed from: y */
    public static final void m23949y(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            m23922c0(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(uri2).length() + 26);
            sb.append("Opening ");
            sb.append(uri2);
            sb.append(" in a new browser.");
            io0.m11126b(sb.toString());
        } catch (ActivityNotFoundException e) {
            io0.m11129e("No browser is found.", e);
        }
    }

    /* renamed from: z */
    public static final int[] m23950z(Activity activity) {
        int[] u = m23945u(activity);
        return new int[]{C2125qw.m15897b().mo5896b(activity, u[0]), C2125qw.m15897b().mo5896b(activity, u[1])};
    }

    /* renamed from: J */
    public final cc3<Map<String, String>> mo14021J(Uri uri) {
        return rb3.m16133k(new C3220x1(uri), this.f20474h);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0039, code lost:
        continue;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0043 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0023 A[Catch:{ Exception -> 0x00a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0055 A[Catch:{ Exception -> 0x00a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a A[Catch:{ Exception -> 0x00a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009a A[Catch:{ Exception -> 0x00a9 }] */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo14022L(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f20470d
            monitor-enter(r0)
            java.lang.String r1 = r4.f20471e     // Catch:{ all -> 0x00c3 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x00c3 }
            return r1
        L_0x0009:
            if (r6 != 0) goto L_0x0011
            java.lang.String r5 = m23926e0()     // Catch:{ all -> 0x00c3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c3 }
            return r5
        L_0x0011:
            j1.f r1 = p054h1.C2694t.m21609r()     // Catch:{ Exception -> 0x001b }
            java.lang.String r1 = r1.mo13999d(r5)     // Catch:{ Exception -> 0x001b }
            r4.f20471e = r1     // Catch:{ Exception -> 0x001b }
        L_0x001b:
            java.lang.String r1 = r4.f20471e     // Catch:{ all -> 0x00c3 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00c3 }
            if (r1 == 0) goto L_0x0069
            com.google.android.gms.internal.ads.C2125qw.m15897b()     // Catch:{ all -> 0x00c3 }
            boolean r1 = com.google.android.gms.internal.ads.bo0.m6992p()     // Catch:{ all -> 0x00c3 }
            if (r1 != 0) goto L_0x0063
            r1 = 0
            r4.f20471e = r1     // Catch:{ all -> 0x00c3 }
            com.google.android.gms.internal.ads.s33 r1 = f20465i     // Catch:{ all -> 0x00c3 }
            j1.z1 r2 = new j1.z1     // Catch:{ all -> 0x00c3 }
            r2.<init>(r4, r5)     // Catch:{ all -> 0x00c3 }
            r1.post(r2)     // Catch:{ all -> 0x00c3 }
        L_0x0039:
            java.lang.String r1 = r4.f20471e     // Catch:{ all -> 0x00c3 }
            if (r1 != 0) goto L_0x0069
            java.lang.Object r1 = r4.f20470d     // Catch:{ InterruptedException -> 0x0043 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0043 }
            goto L_0x0039
        L_0x0043:
            java.lang.String r1 = m23926e0()     // Catch:{ all -> 0x00c3 }
            r4.f20471e = r1     // Catch:{ all -> 0x00c3 }
            java.lang.String r2 = "Interrupted, use default user agent: "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00c3 }
            int r3 = r1.length()     // Catch:{ all -> 0x00c3 }
            if (r3 == 0) goto L_0x005a
            java.lang.String r1 = r2.concat(r1)     // Catch:{ all -> 0x00c3 }
            goto L_0x005f
        L_0x005a:
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x00c3 }
            r1.<init>(r2)     // Catch:{ all -> 0x00c3 }
        L_0x005f:
            com.google.android.gms.internal.ads.io0.m11131g(r1)     // Catch:{ all -> 0x00c3 }
            goto L_0x0039
        L_0x0063:
            java.lang.String r1 = m23946v(r5)     // Catch:{ all -> 0x00c3 }
            r4.f20471e = r1     // Catch:{ all -> 0x00c3 }
        L_0x0069:
            java.lang.String r1 = r4.f20471e     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00c3 }
            int r2 = r1.length()     // Catch:{ all -> 0x00c3 }
            int r2 = r2 + 10
            int r3 = r6.length()     // Catch:{ all -> 0x00c3 }
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c3 }
            r3.<init>(r2)     // Catch:{ all -> 0x00c3 }
            r3.append(r1)     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = " (Mobile; "
            r3.append(r1)     // Catch:{ all -> 0x00c3 }
            r3.append(r6)     // Catch:{ all -> 0x00c3 }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x00c3 }
            r4.f20471e = r6     // Catch:{ all -> 0x00c3 }
            f2.b r5 = p041f2.C2606c.m21299a(r5)     // Catch:{ Exception -> 0x00a9 }
            boolean r5 = r5.mo12497g()     // Catch:{ Exception -> 0x00a9 }
            if (r5 == 0) goto L_0x00b3
            java.lang.String r5 = r4.f20471e     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r6 = ";aia"
            java.lang.String r5 = r5.concat(r6)     // Catch:{ Exception -> 0x00a9 }
            r4.f20471e = r5     // Catch:{ Exception -> 0x00a9 }
            goto L_0x00b3
        L_0x00a9:
            r5 = move-exception
            com.google.android.gms.internal.ads.tn0 r6 = p054h1.C2694t.m21607p()     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = "AdUtil.getUserAgent"
            r6.mo11034s(r5, r1)     // Catch:{ all -> 0x00c3 }
        L_0x00b3:
            java.lang.String r5 = r4.f20471e     // Catch:{ all -> 0x00c3 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00c3 }
            java.lang.String r6 = ")"
            java.lang.String r5 = r5.concat(r6)     // Catch:{ all -> 0x00c3 }
            r4.f20471e = r5     // Catch:{ all -> 0x00c3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c3 }
            return r5
        L_0x00c3:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c3 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p069j1.C3163g2.mo14022L(android.content.Context, java.lang.String):java.lang.String");
    }

    /* renamed from: M */
    public final JSONObject mo14023M(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            m23911H(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    /* renamed from: N */
    public final JSONObject mo14024N(Map<String, ?> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String next : map.keySet()) {
                m23911H(jSONObject, next, map.get(next));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(e.getMessage());
            throw new JSONException(valueOf.length() != 0 ? "Could not convert map to JSON: ".concat(valueOf) : new String("Could not convert map to JSON: "));
        }
    }

    /* renamed from: O */
    public final JSONObject mo14025O(Bundle bundle, JSONObject jSONObject) {
        if (bundle == null) {
            return null;
        }
        try {
            return mo14023M(bundle);
        } catch (JSONException e) {
            io0.m11129e("Error converting Bundle to JSON", e);
            return null;
        }
    }

    /* renamed from: S */
    public final void mo14026S(Context context, String str, boolean z, HttpURLConnection httpURLConnection, boolean z2, int i) {
        int A = m23904A(i);
        StringBuilder sb = new StringBuilder(39);
        sb.append("HTTP timeout: ");
        sb.append(A);
        sb.append(" milliseconds.");
        io0.m11130f(sb.toString());
        httpURLConnection.setConnectTimeout(A);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(A);
        httpURLConnection.setRequestProperty("User-Agent", mo14022L(context, str));
        httpURLConnection.setUseCaches(false);
    }

    @TargetApi(26)
    /* renamed from: T */
    public final void mo14027T(Context context) {
        if (C2555l.m21216j()) {
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10529j6)).booleanValue()) {
                ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new C3143b2(this));
            }
        }
    }

    /* renamed from: V */
    public final void mo14028V(Context context, String str, String str2, Bundle bundle, boolean z) {
        C2694t.m21608q();
        bundle.putString("device", m23928f0());
        bundle.putString("eids", TextUtils.join(",", m10.m13005a()));
        C2125qw.m15897b();
        bo0.m6994r(context, str, "gmob-apps", bundle, true, new C3139a2(this, context, str));
    }

    /* renamed from: W */
    public final boolean mo14029W(String str) {
        return m23912I(str, this.f20467a, (String) C2199sw.m17001c().mo8579b(m10.f10409W));
    }

    /* renamed from: X */
    public final boolean mo14030X(String str) {
        return m23912I(str, this.f20468b, (String) C2199sw.m17001c().mo8579b(m10.f10417X));
    }

    /* renamed from: Y */
    public final boolean mo14031Y(Context context) {
        if (this.f20473g) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        context.getApplicationContext().registerReceiver(new C3151d2(this, (C3147c2) null), intentFilter);
        this.f20473g = true;
        return true;
    }

    /* renamed from: Z */
    public final boolean mo14032Z(Context context) {
        if (this.f20472f) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.getApplicationContext().registerReceiver(new C3159f2(this, (C3155e2) null), intentFilter);
        this.f20472f = true;
        return true;
    }

    @TargetApi(18)
    /* renamed from: a0 */
    public final int mo14033a0(Context context, Uri uri) {
        int i;
        if (context == null) {
            C3202r1.m24015k("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!C2555l.m21210d()) {
            C3202r1.m24015k("Chrome Custom Tabs can only work with version Jellybean onwards.");
            i = 1;
        } else if (!(context instanceof Activity)) {
            C3202r1.m24015k("Chrome Custom Tabs can only work with Activity context.");
            i = 2;
        } else {
            i = 0;
        }
        e10 e10 = m10.f10472d3;
        e10 e102 = m10.f10481e3;
        if (true == ((Boolean) C2199sw.m17001c().mo8579b(e10)).equals(C2199sw.m17001c().mo8579b(e102))) {
            i = 9;
        }
        if (i != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return i;
        }
        if (((Boolean) C2199sw.m17001c().mo8579b(e10)).booleanValue()) {
            l20 l20 = new l20();
            l20.mo8853e(new C3223y1(this, l20, context, uri));
            l20.mo8850b((Activity) context);
        }
        if (!((Boolean) C2199sw.m17001c().mo8579b(e102)).booleanValue()) {
            return 5;
        }
        C3742c a = new C3742c.C3743a().mo14951a();
        a.f21577a.setPackage(zv3.m20854a(context));
        a.mo14950a(context, uri);
        return 5;
    }
}
