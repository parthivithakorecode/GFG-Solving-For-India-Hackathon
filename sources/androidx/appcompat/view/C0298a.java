package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import p038f.C2582a;
import p038f.C2583b;
import p038f.C2585d;
import p038f.C2591j;

/* renamed from: androidx.appcompat.view.a */
public class C0298a {

    /* renamed from: a */
    private Context f746a;

    private C0298a(Context context) {
        this.f746a = context;
    }

    /* renamed from: b */
    public static C0298a m1057b(Context context) {
        return new C0298a(context);
    }

    /* renamed from: a */
    public boolean mo826a() {
        return this.f746a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: c */
    public int mo827c() {
        return this.f746a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public int mo828d() {
        Configuration configuration = this.f746a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* renamed from: e */
    public int mo829e() {
        return this.f746a.getResources().getDimensionPixelSize(C2585d.abc_action_bar_stacked_tab_max_width);
    }

    /* renamed from: f */
    public int mo830f() {
        TypedArray obtainStyledAttributes = this.f746a.obtainStyledAttributes((AttributeSet) null, C2591j.f18808a, C2582a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C2591j.f18853j, 0);
        Resources resources = this.f746a.getResources();
        if (!mo831g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C2585d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: g */
    public boolean mo831g() {
        return this.f746a.getResources().getBoolean(C2583b.abc_action_bar_embed_tabs);
    }

    /* renamed from: h */
    public boolean mo832h() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f746a).hasPermanentMenuKey();
    }
}
