package p003a2;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

/* renamed from: a2.a0 */
public abstract class C0047a0 implements DialogInterface.OnClickListener {
    /* renamed from: b */
    public static C0047a0 m154b(Activity activity, Intent intent, int i) {
        return new C0115z(intent, activity, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo137a();

    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo137a();
        } catch (ActivityNotFoundException e) {
            String str = "Failed to start resolution intent.";
            if (true == Build.FINGERPRINT.contains("generic")) {
                str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            Log.e("DialogRedirect", str, e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
