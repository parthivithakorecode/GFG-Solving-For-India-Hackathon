package p069j1;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.C2125qw;
import com.google.android.gms.internal.ads.C2199sw;
import com.google.android.gms.internal.ads.bo0;
import com.google.android.gms.internal.ads.m10;
import p054h1.C2694t;

@TargetApi(24)
/* renamed from: j1.m2 */
public class C3187m2 extends C3183l2 {
    /* renamed from: t */
    static final boolean m23991t(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    /* renamed from: o */
    public final boolean mo14010o(Activity activity, Configuration configuration) {
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10598r3)).booleanValue()) {
            return false;
        }
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10615t3)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        C2125qw.m15897b();
        int s = bo0.m6995s(activity, configuration.screenHeightDp);
        int s2 = bo0.m6995s(activity, configuration.screenWidthDp);
        C2694t.m21608q();
        DisplayMetrics g0 = C3163g2.m23930g0((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i = g0.heightPixels;
        int i2 = g0.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int round = ((int) Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d)) * ((Integer) C2199sw.m17001c().mo8579b(m10.f10580p3)).intValue();
        if (m23991t(i, s + dimensionPixelSize, round)) {
            return !m23991t(i2, s2, round);
        }
        return true;
    }
}
