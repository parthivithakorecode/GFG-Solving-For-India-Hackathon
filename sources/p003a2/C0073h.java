package p003a2;

import android.content.Context;
import android.content.ServiceConnection;
import androidx.annotation.RecentlyNonNull;

/* renamed from: a2.h */
public abstract class C0073h {

    /* renamed from: a */
    private static int f175a = 4225;

    /* renamed from: b */
    private static final Object f176b = new Object();

    /* renamed from: c */
    private static C0073h f177c;

    /* renamed from: a */
    public static int m276a() {
        return f175a;
    }

    @RecentlyNonNull
    /* renamed from: b */
    public static C0073h m277b(@RecentlyNonNull Context context) {
        synchronized (f176b) {
            if (f177c == null) {
                f177c = new C0063d1(context.getApplicationContext());
            }
        }
        return f177c;
    }

    /* renamed from: c */
    public final void mo239c(@RecentlyNonNull String str, @RecentlyNonNull String str2, int i, @RecentlyNonNull ServiceConnection serviceConnection, @RecentlyNonNull String str3, boolean z) {
        mo218e(new C0116z0(str, str2, i, z), serviceConnection, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo217d(C0116z0 z0Var, ServiceConnection serviceConnection, String str);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo218e(C0116z0 z0Var, ServiceConnection serviceConnection, String str);
}
