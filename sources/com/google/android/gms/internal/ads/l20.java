package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import p095n.C3739a;
import p095n.C3740b;
import p095n.C3744d;
import p095n.C3746e;

@ParametersAreNonnullByDefault
public final class l20 {

    /* renamed from: a */
    private C3746e f9842a;

    /* renamed from: b */
    private C3740b f9843b;

    /* renamed from: c */
    private C3744d f9844c;

    /* renamed from: d */
    private j20 f9845d;

    /* renamed from: g */
    public static boolean m12506g(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (!(queryIntentActivities == null || resolveActivity == null)) {
            for (int i = 0; i < queryIntentActivities.size(); i++) {
                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                    return resolveActivity.activityInfo.packageName.equals(zv3.m20854a(context));
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final C3746e mo8849a() {
        C3740b bVar = this.f9843b;
        if (bVar == null) {
            this.f9842a = null;
        } else if (this.f9842a == null) {
            this.f9842a = bVar.mo14948b((C3739a) null);
        }
        return this.f9842a;
    }

    /* renamed from: b */
    public final void mo8850b(Activity activity) {
        String a;
        if (this.f9843b == null && (a = zv3.m20854a(activity)) != null) {
            aw3 aw3 = new aw3(this, (byte[]) null);
            this.f9844c = aw3;
            C3740b.m25484a(activity, a, aw3);
        }
    }

    /* renamed from: c */
    public final void mo8851c(C3740b bVar) {
        this.f9843b = bVar;
        bVar.mo14949c(0);
        j20 j20 = this.f9845d;
        if (j20 != null) {
            j20.zza();
        }
    }

    /* renamed from: d */
    public final void mo8852d() {
        this.f9843b = null;
        this.f9842a = null;
    }

    /* renamed from: e */
    public final void mo8853e(j20 j20) {
        this.f9845d = j20;
    }

    /* renamed from: f */
    public final void mo8854f(Activity activity) {
        C3744d dVar = this.f9844c;
        if (dVar != null) {
            activity.unbindService(dVar);
            this.f9843b = null;
            this.f9842a = null;
            this.f9844c = null;
        }
    }
}
