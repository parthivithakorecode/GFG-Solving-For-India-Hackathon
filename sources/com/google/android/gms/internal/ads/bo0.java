package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import p002a1.C0020f;
import p002a1.C0024h;
import p002a1.C0026j;
import p012b1.C1293b;
import p012b1.C1294c;
import p076k1.C3296a;
import p136t1.C4060b;
import p160x1.C4284f;
import p160x1.C4288j;

public final class bo0 {

    /* renamed from: b */
    public static final Handler f4987b = new s33(Looper.getMainLooper());

    /* renamed from: c */
    private static final String f4988c = C0026j.class.getName();

    /* renamed from: d */
    private static final String f4989d = C3296a.class.getName();

    /* renamed from: e */
    private static final String f4990e = C1293b.class.getName();

    /* renamed from: f */
    private static final String f4991f = C1294c.class.getName();

    /* renamed from: g */
    private static final String f4992g = C4060b.class.getName();

    /* renamed from: h */
    private static final String f4993h = C0020f.class.getName();

    /* renamed from: a */
    private float f4994a = -1.0f;

    /* renamed from: a */
    public static int m6981a(Context context, int i) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context == null) {
            return -1;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null || (configuration = resources.getConfiguration()) == null) {
            return -1;
        }
        int i2 = configuration.orientation;
        if (i == 0) {
            i = i2;
        }
        return Math.round(((float) (i == i2 ? displayMetrics.heightPixels : displayMetrics.widthPixels)) / displayMetrics.density);
    }

    /* renamed from: c */
    public static C0024h m6982c(Context context, int i, int i2, int i3) {
        int i4;
        float f;
        float f2;
        int a = m6981a(context, i3);
        if (a == -1) {
            return C0024h.f33q;
        }
        int min = Math.min(90, Math.round(((float) a) * 0.15f));
        if (i > 655) {
            f = ((float) i) / 728.0f;
            f2 = 90.0f;
        } else {
            if (i > 632) {
                i4 = 81;
            } else if (i > 526) {
                f = ((float) i) / 468.0f;
                f2 = 60.0f;
            } else if (i > 432) {
                i4 = 68;
            } else {
                f = ((float) i) / 320.0f;
                f2 = 50.0f;
            }
            return new C0024h(i, Math.max(Math.min(i4, min), 50));
        }
        i4 = Math.round(f * f2);
        return new C0024h(i, Math.max(Math.min(i4, min), 50));
    }

    /* renamed from: d */
    public static String m6983d() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(byteArray);
                instance.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(instance.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    /* renamed from: e */
    public static String m6984e(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(str.getBytes());
                return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, instance.digest())});
            } catch (NoSuchAlgorithmException unused) {
                i++;
            } catch (ArithmeticException unused2) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static Throwable m6985f(Throwable th) {
        if (j30.f8972f.mo9928e().booleanValue()) {
            return th;
        }
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        Throwable th2 = null;
        while (!linkedList.isEmpty()) {
            Throwable th3 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th3.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
            boolean z = false;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (m6986j(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                    z = true;
                } else {
                    String className = stackTraceElement.getClassName();
                    if (TextUtils.isEmpty(className) || (!className.startsWith("android.") && !className.startsWith("java."))) {
                        stackTraceElement = new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1);
                    }
                    arrayList.add(stackTraceElement);
                }
            }
            if (z) {
                th2 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
        return th2;
    }

    /* renamed from: j */
    public static boolean m6986j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(j30.f8970d.mo9928e());
    }

    /* renamed from: k */
    public static final int m6987k(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, displayMetrics);
    }

    /* renamed from: l */
    public static final String m6988l(StackTraceElement[] stackTraceElementArr, String str) {
        int i;
        String str2;
        int i2 = 0;
        while (true) {
            i = i2 + 1;
            if (i >= stackTraceElementArr.length) {
                str2 = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            String className = stackTraceElement.getClassName();
            if (!"loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) || (!f4988c.equalsIgnoreCase(className) && !f4989d.equalsIgnoreCase(className) && !f4990e.equalsIgnoreCase(className) && !f4991f.equalsIgnoreCase(className) && !f4992g.equalsIgnoreCase(className) && !f4993h.equalsIgnoreCase(className))) {
                i2 = i;
            }
        }
        str2 = stackTraceElementArr[i].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                int i3 = 2;
                while (true) {
                    int i4 = i3 - 1;
                    if (i3 <= 0 || !stringTokenizer.hasMoreElements()) {
                        str = sb.toString();
                    } else {
                        sb.append(".");
                        sb.append(stringTokenizer.nextToken());
                        i3 = i4;
                    }
                }
                str = sb.toString();
            }
            if (str2 == null || str2.contains(str)) {
                return null;
            }
            return str2;
        }
        return null;
    }

    /* renamed from: m */
    public static final boolean m6989m() {
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        return str.contains("generic") || str.contains("emulator");
    }

    /* renamed from: n */
    public static final boolean m6990n(Context context, int i) {
        return C4284f.m26845f().mo15863h(context, i) == 0;
    }

    /* renamed from: o */
    public static final boolean m6991o(Context context) {
        int h = C4284f.m26845f().mo15863h(context, C4288j.f22593a);
        return h == 0 || h == 2;
    }

    /* renamed from: p */
    public static final boolean m6992p() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: q */
    public static final int m6993q(DisplayMetrics displayMetrics, int i) {
        return Math.round(((float) i) / displayMetrics.density);
    }

    /* renamed from: r */
    public static final void m6994r(Context context, String str, String str2, Bundle bundle, boolean z, ao0 ao0) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            int a = C4284f.m26845f().mo15874a(context);
            StringBuilder sb = new StringBuilder(23);
            sb.append(a);
            sb.append(".214106000");
            str = sb.toString();
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        ao0.mo5345b(appendQueryParameter.toString());
    }

    /* renamed from: s */
    public static final int m6995s(Context context, int i) {
        return m6987k(context.getResources().getDisplayMetrics(), i);
    }

    /* renamed from: t */
    public static final String m6996t(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || m6989m()) {
            string = "emulator";
        }
        return m6984e(string);
    }

    /* renamed from: u */
    private static final void m6997u(ViewGroup viewGroup, C2087pv pvVar, String str, int i, int i2) {
        if (viewGroup.getChildCount() == 0) {
            Context context = viewGroup.getContext();
            TextView textView = new TextView(context);
            textView.setGravity(17);
            textView.setText(str);
            textView.setTextColor(i);
            textView.setBackgroundColor(i2);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(i);
            int s = m6995s(context, 3);
            frameLayout.addView(textView, new FrameLayout.LayoutParams(pvVar.f12809k - s, pvVar.f12806h - s, 17));
            viewGroup.addView(frameLayout, pvVar.f12809k, pvVar.f12806h);
        }
    }

    /* renamed from: b */
    public final int mo5896b(Context context, int i) {
        if (this.f4994a < 0.0f) {
            synchronized (this) {
                if (this.f4994a < 0.0f) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager == null) {
                        return 0;
                    }
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    this.f4994a = displayMetrics.density;
                }
            }
        }
        return Math.round(((float) i) / this.f4994a);
    }

    /* renamed from: g */
    public final void mo5897g(ViewGroup viewGroup, C2087pv pvVar, String str, String str2) {
        if (str2 != null) {
            io0.m11131g(str2);
        }
        m6997u(viewGroup, pvVar, str, -65536, -16777216);
    }

    /* renamed from: h */
    public final void mo5898h(ViewGroup viewGroup, C2087pv pvVar, String str) {
        m6997u(viewGroup, pvVar, "Ads by Google", -16777216, -1);
    }

    /* renamed from: i */
    public final void mo5899i(Context context, String str, String str2, Bundle bundle, boolean z) {
        m6994r(context, str, "gmob-apps", bundle, true, new zn0(this));
    }
}
