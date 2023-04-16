package p160x1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import p003a2.C0092o;

@CheckReturnValue
/* renamed from: x1.k */
public class C4289k {
    @Nullable

    /* renamed from: b */
    private static C4289k f22596b;

    /* renamed from: a */
    private final Context f22597a;

    public C4289k(@RecentlyNonNull Context context) {
        this.f22597a = context.getApplicationContext();
    }

    @RecentlyNonNull
    /* renamed from: a */
    public static C4289k m26864a(@RecentlyNonNull Context context) {
        C0092o.m313i(context);
        synchronized (C4289k.class) {
            if (f22596b == null) {
                C4304z.m26881a(context);
                f22596b = new C4289k(context);
            }
        }
        return f22596b;
    }

    @Nullable
    /* renamed from: b */
    static final C4300v m26865b(PackageInfo packageInfo, C4300v... vVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        C4301w wVar = new C4301w(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < vVarArr.length; i++) {
            if (vVarArr[i].equals(wVar)) {
                return vVarArr[i];
            }
        }
        return null;
    }

    /* renamed from: c */
    public static final boolean m26866c(@RecentlyNonNull PackageInfo packageInfo, boolean z) {
        C4300v vVar;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                vVar = m26865b(packageInfo, C4303y.f22607a);
            } else {
                vVar = m26865b(packageInfo, C4303y.f22607a[0]);
            }
            if (vVar != null) {
                return true;
            }
        }
        return false;
    }
}
