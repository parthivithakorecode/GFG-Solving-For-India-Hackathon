package p084l2;

import android.util.Log;
import p137t2.C4070e;

/* renamed from: l2.e2 */
public final class C3489e2 extends Exception {

    /* renamed from: f */
    private final int f21054f;

    public C3489e2(int i, String str) {
        super(str);
        this.f21054f = i;
    }

    public C3489e2(int i, String str, Throwable th) {
        super(str, th);
        this.f21054f = i;
    }

    /* renamed from: a */
    public final C4070e mo14578a() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", getMessage());
        } else {
            Log.w("UserMessagingPlatform", getMessage(), getCause());
        }
        return new C4070e(this.f21054f, getMessage());
    }

    public final String getMessage() {
        return super.getMessage();
    }
}
