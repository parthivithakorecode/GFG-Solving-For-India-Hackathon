package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import p038f.C2590i;

/* renamed from: androidx.appcompat.view.d */
public class C0302d extends ContextWrapper {

    /* renamed from: f */
    private static Configuration f749f;

    /* renamed from: a */
    private int f750a;

    /* renamed from: b */
    private Resources.Theme f751b;

    /* renamed from: c */
    private LayoutInflater f752c;

    /* renamed from: d */
    private Configuration f753d;

    /* renamed from: e */
    private Resources f754e;

    /* renamed from: androidx.appcompat.view.d$a */
    static class C0303a {
        /* renamed from: a */
        static Context m1094a(C0302d dVar, Configuration configuration) {
            return dVar.createConfigurationContext(configuration);
        }
    }

    public C0302d() {
        super((Context) null);
    }

    public C0302d(Context context, int i) {
        super(context);
        this.f750a = i;
    }

    public C0302d(Context context, Resources.Theme theme) {
        super(context);
        this.f751b = theme;
    }

    /* renamed from: b */
    private Resources m1088b() {
        Resources resources;
        int i;
        if (this.f754e == null) {
            Configuration configuration = this.f753d;
            if (configuration == null || ((i = Build.VERSION.SDK_INT) >= 26 && m1090e(configuration))) {
                resources = super.getResources();
            } else if (i >= 17) {
                resources = C0303a.m1094a(this, this.f753d).getResources();
            } else {
                Resources resources2 = super.getResources();
                Configuration configuration2 = new Configuration(resources2.getConfiguration());
                configuration2.updateFrom(this.f753d);
                this.f754e = new Resources(resources2.getAssets(), resources2.getDisplayMetrics(), configuration2);
            }
            this.f754e = resources;
        }
        return this.f754e;
    }

    /* renamed from: d */
    private void m1089d() {
        boolean z = this.f751b == null;
        if (z) {
            this.f751b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f751b.setTo(theme);
            }
        }
        mo841f(this.f751b, this.f750a, z);
    }

    /* renamed from: e */
    private static boolean m1090e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f749f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f749f = configuration2;
        }
        return configuration.equals(f749f);
    }

    /* renamed from: a */
    public void mo838a(Configuration configuration) {
        if (this.f754e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f753d == null) {
            this.f753d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: c */
    public int mo840c() {
        return this.f750a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo841f(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return m1088b();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f752c == null) {
            this.f752c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f752c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f751b;
        if (theme != null) {
            return theme;
        }
        if (this.f750a == 0) {
            this.f750a = C2590i.Theme_AppCompat_Light;
        }
        m1089d();
        return this.f751b;
    }

    public void setTheme(int i) {
        if (this.f750a != i) {
            this.f750a = i;
            m1089d();
        }
    }
}
