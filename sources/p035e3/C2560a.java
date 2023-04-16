package p035e3;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.widget.Toast;
import java.util.Iterator;
import p005a4.C0128c;
import p005a4.C0144j;
import p005a4.C0145k;
import p132s3.C4047a;
import p138t3.C4076a;
import p138t3.C4078c;

/* renamed from: e3.a */
public class C2560a implements C0145k.C0149c, C4047a, C4076a {

    /* renamed from: a */
    Activity f18669a;

    /* renamed from: a */
    private static C2560a m21222a(C2560a aVar, C0128c cVar, Activity activity) {
        C0145k kVar = new C0145k(cVar, "launch_review");
        aVar.f18669a = activity;
        kVar.mo337e(aVar);
        return aVar;
    }

    public void onAttachedToActivity(C4078c cVar) {
        this.f18669a = cVar.mo13517d();
    }

    public void onAttachedToEngine(C4047a.C4049b bVar) {
        m21222a(this, bVar.mo15540b(), (Activity) null);
    }

    public void onDetachedFromActivity() {
    }

    public void onDetachedFromActivityForConfigChanges() {
    }

    public void onDetachedFromEngine(C4047a.C4049b bVar) {
    }

    public void onMethodCall(C0144j jVar, C0145k.C0150d dVar) {
        if (jVar.f269a.equals("launch")) {
            String str = (String) jVar.mo332a("android_id");
            if (str == null) {
                str = this.f18669a.getPackageName();
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str));
            boolean z = false;
            Iterator<ResolveInfo> it = this.f18669a.getPackageManager().queryIntentActivities(intent, 0).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ResolveInfo next = it.next();
                if (next.activityInfo.applicationInfo.packageName.equals("com.android.vending")) {
                    ActivityInfo activityInfo = next.activityInfo;
                    ComponentName componentName = new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name);
                    intent.addFlags(268435456);
                    intent.addFlags(2097152);
                    intent.addFlags(67108864);
                    intent.setComponent(componentName);
                    Toast.makeText(this.f18669a, "Please Rate Application", 0).show();
                    this.f18669a.startActivity(intent);
                    z = true;
                    break;
                }
            }
            if (!z) {
                try {
                    Activity activity = this.f18669a;
                    activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)));
                } catch (ActivityNotFoundException unused) {
                    Activity activity2 = this.f18669a;
                    activity2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + str)));
                }
            }
            dVar.mo338a((Object) null);
            return;
        }
        dVar.mo340c();
    }

    public void onReattachedToActivityForConfigChanges(C4078c cVar) {
    }
}
