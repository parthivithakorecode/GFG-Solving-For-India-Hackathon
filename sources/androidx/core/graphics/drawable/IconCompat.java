package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.res.C0624h;
import androidx.core.util.C0740c;
import androidx.core.util.C0743e;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k */
    static final PorterDuff.Mode f1957k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f1958a = -1;

    /* renamed from: b */
    Object f1959b;

    /* renamed from: c */
    public byte[] f1960c = null;

    /* renamed from: d */
    public Parcelable f1961d = null;

    /* renamed from: e */
    public int f1962e = 0;

    /* renamed from: f */
    public int f1963f = 0;

    /* renamed from: g */
    public ColorStateList f1964g = null;

    /* renamed from: h */
    PorterDuff.Mode f1965h = f1957k;

    /* renamed from: i */
    public String f1966i = null;

    /* renamed from: j */
    public String f1967j;

    /* renamed from: androidx.core.graphics.drawable.IconCompat$a */
    static class C0646a {
        /* renamed from: a */
        static IconCompat m2670a(Object obj) {
            C0743e.m2958f(obj);
            int d = m2673d(obj);
            if (d == 2) {
                return IconCompat.m2654l((Resources) null, m2672c(obj), m2671b(obj));
            }
            if (d == 4) {
                return IconCompat.m2650h(m2674e(obj));
            }
            if (d == 6) {
                return IconCompat.m2647e(m2674e(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f1959b = obj;
            return iconCompat;
        }

        /* renamed from: b */
        static int m2671b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0648c.m2679a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon resource", e);
                return 0;
            } catch (InvocationTargetException e2) {
                Log.e("IconCompat", "Unable to get icon resource", e2);
                return 0;
            } catch (NoSuchMethodException e3) {
                Log.e("IconCompat", "Unable to get icon resource", e3);
                return 0;
            }
        }

        /* renamed from: c */
        static String m2672c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0648c.m2680b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon package", e);
                return null;
            } catch (InvocationTargetException e2) {
                Log.e("IconCompat", "Unable to get icon package", e2);
                return null;
            } catch (NoSuchMethodException e3) {
                Log.e("IconCompat", "Unable to get icon package", e3);
                return null;
            }
        }

        /* renamed from: d */
        static int m2673d(Object obj) {
            StringBuilder sb;
            if (Build.VERSION.SDK_INT >= 28) {
                return C0648c.m2681c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e) {
                e = e;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            } catch (InvocationTargetException e2) {
                e = e2;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            } catch (NoSuchMethodException e3) {
                e = e3;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            }
        }

        /* renamed from: e */
        static Uri m2674e(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0648c.m2682d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon uri", e);
                return null;
            } catch (InvocationTargetException e2) {
                Log.e("IconCompat", "Unable to get icon uri", e2);
                return null;
            } catch (NoSuchMethodException e3) {
                Log.e("IconCompat", "Unable to get icon uri", e3);
                return null;
            }
        }

        /* renamed from: f */
        static Drawable m2675f(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
            if (r0 >= 26) goto L_0x006d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x006d, code lost:
            r5 = androidx.core.graphics.drawable.IconCompat.C0647b.m2678b(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
            r5 = androidx.core.graphics.drawable.IconCompat.m2646d(r5, false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a0, code lost:
            r5 = android.graphics.drawable.Icon.createWithBitmap(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a4, code lost:
            r0 = r4.f1964g;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a6, code lost:
            if (r0 == null) goto L_0x00ab;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a8, code lost:
            r5.setTintList(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ab, code lost:
            r4 = r4.f1965h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00af, code lost:
            if (r4 == androidx.core.graphics.drawable.IconCompat.f1957k) goto L_0x00b4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b1, code lost:
            r5.setTintMode(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b4, code lost:
            return r5;
         */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static android.graphics.drawable.Icon m2676g(androidx.core.graphics.drawable.IconCompat r4, android.content.Context r5) {
            /*
                int r0 = r4.f1958a
                r1 = 0
                r2 = 26
                switch(r0) {
                    case -1: goto L_0x00b5;
                    case 0: goto L_0x0008;
                    case 1: goto L_0x009c;
                    case 2: goto L_0x0091;
                    case 3: goto L_0x0084;
                    case 4: goto L_0x007b;
                    case 5: goto L_0x0065;
                    case 6: goto L_0x0010;
                    default: goto L_0x0008;
                }
            L_0x0008:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "Unknown type"
                r4.<init>(r5)
                throw r4
            L_0x0010:
                int r0 = android.os.Build.VERSION.SDK_INT
                r3 = 30
                if (r0 < r3) goto L_0x0020
                android.net.Uri r5 = r4.mo2600r()
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.IconCompat.C0649d.m2683a(r5)
                goto L_0x00a4
            L_0x0020:
                if (r5 == 0) goto L_0x004a
                java.io.InputStream r5 = r4.mo2601s(r5)
                if (r5 == 0) goto L_0x002f
                android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r5)
                if (r0 < r2) goto L_0x0076
                goto L_0x006d
            L_0x002f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot load adaptive icon from uri: "
                r0.append(r1)
                android.net.Uri r4 = r4.mo2600r()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
            L_0x004a:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Context is required to resolve the file uri of the icon: "
                r0.append(r1)
                android.net.Uri r4 = r4.mo2600r()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
            L_0x0065:
                int r5 = android.os.Build.VERSION.SDK_INT
                if (r5 < r2) goto L_0x0072
                java.lang.Object r5 = r4.f1959b
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            L_0x006d:
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.IconCompat.C0647b.m2678b(r5)
                goto L_0x00a4
            L_0x0072:
                java.lang.Object r5 = r4.f1959b
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            L_0x0076:
                android.graphics.Bitmap r5 = androidx.core.graphics.drawable.IconCompat.m2646d(r5, r1)
                goto L_0x00a0
            L_0x007b:
                java.lang.Object r5 = r4.f1959b
                java.lang.String r5 = (java.lang.String) r5
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithContentUri(r5)
                goto L_0x00a4
            L_0x0084:
                java.lang.Object r5 = r4.f1959b
                byte[] r5 = (byte[]) r5
                int r0 = r4.f1962e
                int r1 = r4.f1963f
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithData(r5, r0, r1)
                goto L_0x00a4
            L_0x0091:
                java.lang.String r5 = r4.mo2598o()
                int r0 = r4.f1962e
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithResource(r5, r0)
                goto L_0x00a4
            L_0x009c:
                java.lang.Object r5 = r4.f1959b
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            L_0x00a0:
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithBitmap(r5)
            L_0x00a4:
                android.content.res.ColorStateList r0 = r4.f1964g
                if (r0 == 0) goto L_0x00ab
                r5.setTintList(r0)
            L_0x00ab:
                android.graphics.PorterDuff$Mode r4 = r4.f1965h
                android.graphics.PorterDuff$Mode r0 = androidx.core.graphics.drawable.IconCompat.f1957k
                if (r4 == r0) goto L_0x00b4
                r5.setTintMode(r4)
            L_0x00b4:
                return r5
            L_0x00b5:
                java.lang.Object r4 = r4.f1959b
                android.graphics.drawable.Icon r4 = (android.graphics.drawable.Icon) r4
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.C0646a.m2676g(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
        }
    }

    /* renamed from: androidx.core.graphics.drawable.IconCompat$b */
    static class C0647b {
        /* renamed from: a */
        static Drawable m2677a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        /* renamed from: b */
        static Icon m2678b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    /* renamed from: androidx.core.graphics.drawable.IconCompat$c */
    static class C0648c {
        /* renamed from: a */
        static int m2679a(Object obj) {
            return ((Icon) obj).getResId();
        }

        /* renamed from: b */
        static String m2680b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        /* renamed from: c */
        static int m2681c(Object obj) {
            return ((Icon) obj).getType();
        }

        /* renamed from: d */
        static Uri m2682d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    /* renamed from: androidx.core.graphics.drawable.IconCompat$d */
    static class C0649d {
        /* renamed from: a */
        static Icon m2683a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
    }

    IconCompat(int i) {
        this.f1958a = i;
    }

    /* renamed from: A */
    private static String m2643A(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: b */
    public static IconCompat m2644b(Bundle bundle) {
        Object obj;
        int i = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i);
        iconCompat.f1962e = bundle.getInt("int1");
        iconCompat.f1963f = bundle.getInt("int2");
        iconCompat.f1967j = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.f1964g = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.f1965h = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i) {
            case -1:
            case 1:
            case 5:
                obj = bundle.getParcelable("obj");
                break;
            case 2:
            case 4:
            case 6:
                obj = bundle.getString("obj");
                break;
            case 3:
                iconCompat.f1959b = bundle.getByteArray("obj");
                break;
            default:
                Log.w("IconCompat", "Unknown type " + i);
                return null;
        }
        iconCompat.f1959b = obj;
        return iconCompat;
    }

    /* renamed from: c */
    public static IconCompat m2645c(Icon icon) {
        return C0646a.m2670a(icon);
    }

    /* renamed from: d */
    static Bitmap m2646d(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = (float) min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate(((float) (-(bitmap.getWidth() - min))) / 2.0f, ((float) (-(bitmap.getHeight() - min))) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    /* renamed from: e */
    public static IconCompat m2647e(Uri uri) {
        C0740c.m2948c(uri);
        return m2648f(uri.toString());
    }

    /* renamed from: f */
    public static IconCompat m2648f(String str) {
        C0740c.m2948c(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f1959b = str;
        return iconCompat;
    }

    /* renamed from: g */
    public static IconCompat m2649g(Bitmap bitmap) {
        C0740c.m2948c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f1959b = bitmap;
        return iconCompat;
    }

    /* renamed from: h */
    public static IconCompat m2650h(Uri uri) {
        C0740c.m2948c(uri);
        return m2651i(uri.toString());
    }

    /* renamed from: i */
    public static IconCompat m2651i(String str) {
        C0740c.m2948c(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f1959b = str;
        return iconCompat;
    }

    /* renamed from: j */
    public static IconCompat m2652j(byte[] bArr, int i, int i2) {
        C0740c.m2948c(bArr);
        IconCompat iconCompat = new IconCompat(3);
        iconCompat.f1959b = bArr;
        iconCompat.f1962e = i;
        iconCompat.f1963f = i2;
        return iconCompat;
    }

    /* renamed from: k */
    public static IconCompat m2653k(Context context, int i) {
        C0740c.m2948c(context);
        return m2654l(context.getResources(), context.getPackageName(), i);
    }

    /* renamed from: l */
    public static IconCompat m2654l(Resources resources, String str, int i) {
        C0740c.m2948c(str);
        if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f1962e = i;
            if (resources != null) {
                try {
                    iconCompat.f1959b = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f1959b = str;
            }
            iconCompat.f1967j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    /* renamed from: p */
    static Resources m2655p(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", new Object[]{str}), e);
            return null;
        }
    }

    /* renamed from: u */
    private Drawable m2656u(Context context) {
        switch (this.f1958a) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.f1959b);
            case 2:
                String o = mo2598o();
                if (TextUtils.isEmpty(o)) {
                    o = context.getPackageName();
                }
                try {
                    return C0624h.m2565d(m2655p(context, o), this.f1962e, context.getTheme());
                } catch (RuntimeException e) {
                    Log.e("IconCompat", String.format("Unable to load resource 0x%08x from pkg=%s", new Object[]{Integer.valueOf(this.f1962e), this.f1959b}), e);
                    break;
                }
            case 3:
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.f1959b, this.f1962e, this.f1963f));
            case 4:
                InputStream s = mo2601s(context);
                if (s != null) {
                    return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(s));
                }
                break;
            case 5:
                return new BitmapDrawable(context.getResources(), m2646d((Bitmap) this.f1959b, false));
            case 6:
                InputStream s2 = mo2601s(context);
                if (s2 != null) {
                    return Build.VERSION.SDK_INT >= 26 ? C0647b.m2677a((Drawable) null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(s2))) : new BitmapDrawable(context.getResources(), m2646d(BitmapFactory.decodeStream(s2), false));
                }
                break;
        }
        return null;
    }

    /* renamed from: a */
    public void mo2595a(Context context) {
        Object obj;
        if (this.f1958a == 2 && (obj = this.f1959b) != null) {
            String str = (String) obj;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(":", -1)[0];
                if ("0_resource_name_obfuscated".equals(str4)) {
                    Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                    return;
                }
                String o = mo2598o();
                int identifier = m2655p(context, o).getIdentifier(str4, str3, str5);
                if (this.f1962e != identifier) {
                    Log.i("IconCompat", "Id has changed for " + o + " " + str);
                    this.f1962e = identifier;
                }
            }
        }
    }

    /* renamed from: m */
    public Bitmap mo2596m() {
        int i = this.f1958a;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.f1959b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        } else if (i == 1) {
            return (Bitmap) this.f1959b;
        } else {
            if (i == 5) {
                return m2646d((Bitmap) this.f1959b, true);
            }
            throw new IllegalStateException("called getBitmap() on " + this);
        }
    }

    /* renamed from: n */
    public int mo2597n() {
        int i = this.f1958a;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return C0646a.m2671b(this.f1959b);
        }
        if (i == 2) {
            return this.f1962e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* renamed from: o */
    public String mo2598o() {
        int i = this.f1958a;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return C0646a.m2672c(this.f1959b);
        }
        if (i == 2) {
            String str = this.f1967j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f1959b).split(":", -1)[0] : this.f1967j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* renamed from: q */
    public int mo2599q() {
        int i = this.f1958a;
        return (i != -1 || Build.VERSION.SDK_INT < 23) ? i : C0646a.m2673d(this.f1959b);
    }

    /* renamed from: r */
    public Uri mo2600r() {
        int i = this.f1958a;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return C0646a.m2674e(this.f1959b);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f1959b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    /* renamed from: s */
    public InputStream mo2601s(Context context) {
        String str;
        StringBuilder sb;
        Uri r = mo2600r();
        String scheme = r.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(r);
            } catch (Exception e) {
                e = e;
                sb = new StringBuilder();
                str = "Unable to load image from URI: ";
                sb.append(str);
                sb.append(r);
                Log.w("IconCompat", sb.toString(), e);
                return null;
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f1959b));
            } catch (FileNotFoundException e2) {
                e = e2;
                sb = new StringBuilder();
                str = "Unable to load image from path: ";
                sb.append(str);
                sb.append(r);
                Log.w("IconCompat", sb.toString(), e);
                return null;
            }
        }
    }

    /* renamed from: t */
    public Drawable mo2602t(Context context) {
        mo2595a(context);
        if (Build.VERSION.SDK_INT >= 23) {
            return C0646a.m2675f(mo2608z(context), context);
        }
        Drawable u = m2656u(context);
        if (!(u == null || (this.f1964g == null && this.f1965h == f1957k))) {
            u.mutate();
            C0650a.m2697n(u, this.f1964g);
            C0650a.m2698o(u, this.f1965h);
        }
        return u;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r4 = this;
            int r0 = r4.f1958a
            r1 = -1
            if (r0 != r1) goto L_0x000c
            java.lang.Object r0 = r4.f1959b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x000c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r4.f1958a
            java.lang.String r1 = m2643A(r1)
            r0.append(r1)
            int r1 = r4.f1958a
            switch(r1) {
                case 1: goto L_0x006a;
                case 2: goto L_0x0043;
                case 3: goto L_0x002d;
                case 4: goto L_0x0022;
                case 5: goto L_0x006a;
                case 6: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x008a
        L_0x0022:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r4.f1959b
            r0.append(r1)
            goto L_0x008a
        L_0x002d:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r4.f1962e
            r0.append(r1)
            int r1 = r4.f1963f
            if (r1 == 0) goto L_0x008a
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r4.f1963f
            goto L_0x0087
        L_0x0043:
            java.lang.String r1 = " pkg="
            r0.append(r1)
            java.lang.String r1 = r4.f1967j
            r0.append(r1)
            java.lang.String r1 = " id="
            r0.append(r1)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.mo2597n()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto L_0x008a
        L_0x006a:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r4.f1959b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r4.f1959b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
        L_0x0087:
            r0.append(r1)
        L_0x008a:
            android.content.res.ColorStateList r1 = r4.f1964g
            if (r1 == 0) goto L_0x0098
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r4.f1964g
            r0.append(r1)
        L_0x0098:
            android.graphics.PorterDuff$Mode r1 = r4.f1965h
            android.graphics.PorterDuff$Mode r2 = f1957k
            if (r1 == r2) goto L_0x00a8
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r4.f1965h
            r0.append(r1)
        L_0x00a8:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }

    /* renamed from: v */
    public void mo2604v() {
        Parcelable parcelable;
        this.f1965h = PorterDuff.Mode.valueOf(this.f1966i);
        switch (this.f1958a) {
            case -1:
                parcelable = this.f1961d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 1:
            case 5:
                parcelable = this.f1961d;
                if (parcelable == null) {
                    byte[] bArr = this.f1960c;
                    this.f1959b = bArr;
                    this.f1958a = 3;
                    this.f1962e = 0;
                    this.f1963f = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f1960c, Charset.forName("UTF-16"));
                this.f1959b = str;
                if (this.f1958a == 2 && this.f1967j == null) {
                    this.f1967j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f1959b = this.f1960c;
                return;
            default:
                return;
        }
        this.f1959b = parcelable;
    }

    /* renamed from: w */
    public void mo2605w(boolean z) {
        this.f1966i = this.f1965h.name();
        switch (this.f1958a) {
            case -1:
                if (z) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 1:
            case 5:
                if (z) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f1959b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f1960c = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.f1960c = ((String) this.f1959b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f1960c = (byte[]) this.f1959b;
                return;
            case 4:
            case 6:
                this.f1960c = this.f1959b.toString().getBytes(Charset.forName("UTF-16"));
                return;
            default:
                return;
        }
        this.f1961d = (Parcelable) this.f1959b;
    }

    /* renamed from: x */
    public Bundle mo2606x() {
        Parcelable parcelable;
        Bundle bundle = new Bundle();
        switch (this.f1958a) {
            case -1:
                parcelable = (Parcelable) this.f1959b;
                break;
            case 1:
            case 5:
                parcelable = (Bitmap) this.f1959b;
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.f1959b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f1959b);
                break;
            default:
                throw new IllegalArgumentException("Invalid icon");
        }
        bundle.putParcelable("obj", parcelable);
        bundle.putInt("type", this.f1958a);
        bundle.putInt("int1", this.f1962e);
        bundle.putInt("int2", this.f1963f);
        bundle.putString("string1", this.f1967j);
        ColorStateList colorStateList = this.f1964g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f1965h;
        if (mode != f1957k) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    @Deprecated
    /* renamed from: y */
    public Icon mo2607y() {
        return mo2608z((Context) null);
    }

    /* renamed from: z */
    public Icon mo2608z(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C0646a.m2676g(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }
}
