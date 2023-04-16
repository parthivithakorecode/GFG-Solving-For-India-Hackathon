package p069j1;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.C2199sw;
import com.google.android.gms.internal.ads.m10;
import java.util.Locale;
import javax.annotation.ParametersAreNonnullByDefault;
import p054h1.C2694t;

@TargetApi(28)
@ParametersAreNonnullByDefault
/* renamed from: j1.d */
public final class C3148d extends C3140b {
    /* renamed from: u */
    static final /* synthetic */ WindowInsets m23857u(Activity activity, View view, WindowInsets windowInsets) {
        if (C2694t.m21607p().mo11025h().mo14090k() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String str = "";
            if (displayCutout != null) {
                C3208t1 h = C2694t.m21607p().mo11025h();
                for (Rect next : displayCutout.getBoundingRects()) {
                    String format = String.format(Locale.US, "%d,%d,%d,%d", new Object[]{Integer.valueOf(next.left), Integer.valueOf(next.top), Integer.valueOf(next.right), Integer.valueOf(next.bottom)});
                    if (!TextUtils.isEmpty(str)) {
                        str = String.valueOf(str).concat("|");
                    }
                    String valueOf = String.valueOf(str);
                    String valueOf2 = String.valueOf(format);
                    str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                }
                h.mo14095p(str);
            } else {
                C2694t.m21607p().mo11025h().mo14095p(str);
            }
        }
        m23858v(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    /* renamed from: v */
    private static final void m23858v(boolean z, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i = attributes.layoutInDisplayCutoutMode;
        int i2 = 1;
        if (true != z) {
            i2 = 2;
        }
        if (i2 != i) {
            attributes.layoutInDisplayCutoutMode = i2;
            window.setAttributes(attributes);
        }
    }

    /* renamed from: q */
    public final void mo13992q(Activity activity) {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10386T0)).booleanValue() && C2694t.m21607p().mo11025h().mo14090k() == null && !activity.isInMultiWindowMode()) {
            m23858v(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new C3144c(this, activity));
        }
    }
}
