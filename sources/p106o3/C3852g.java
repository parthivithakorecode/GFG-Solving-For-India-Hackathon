package p106o3;

import android.os.Handler;
import android.os.Looper;
import p064i4.C2847a;
import p106o3.C3838c;

/* renamed from: o3.g */
public class C3852g implements C3838c.C3842d {

    /* renamed from: a */
    private final Handler f21872a = C2847a.m22345a(Looper.getMainLooper());

    /* renamed from: a */
    public void mo15285a(Runnable runnable) {
        this.f21872a.post(runnable);
    }
}
