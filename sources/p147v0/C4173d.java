package p147v0;

import android.content.ComponentName;
import android.content.Context;
import p089m0.C3646j;

/* renamed from: v0.d */
public class C4173d {

    /* renamed from: a */
    private static final String f22388a = C3646j.m25231f("PackageManagerHelper");

    /* renamed from: a */
    public static void m26626a(Context context, Class<?> cls, boolean z) {
        String str = "enabled";
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            C3646j c = C3646j.m25229c();
            String str2 = f22388a;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z ? str : "disabled";
            c.mo14806a(str2, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e) {
            C3646j c2 = C3646j.m25229c();
            String str3 = f22388a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (!z) {
                str = "disabled";
            }
            objArr2[1] = str;
            c2.mo14806a(str3, String.format("%s could not be %s", objArr2), e);
        }
    }
}
