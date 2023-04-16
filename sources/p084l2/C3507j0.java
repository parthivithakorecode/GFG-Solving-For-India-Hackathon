package p084l2;

import android.app.Activity;
import android.app.Application;
import android.content.ContextWrapper;
import android.content.Intent;

/* renamed from: l2.j0 */
public final class C3507j0 extends ContextWrapper {

    /* renamed from: a */
    private Activity f21093a;

    public C3507j0(Application application) {
        super(application);
    }

    /* renamed from: a */
    public final void mo14593a(Activity activity) {
        this.f21093a = activity;
    }

    public final Object getSystemService(String str) {
        Activity activity = this.f21093a;
        return activity != null ? activity.getSystemService(str) : super.getSystemService(str);
    }

    public final void startActivity(Intent intent) {
        Activity activity = this.f21093a;
        if (activity != null) {
            activity.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        super.startActivity(intent);
    }
}
