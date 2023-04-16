package p041f2;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;

/* renamed from: f2.c */
public class C2606c {

    /* renamed from: b */
    private static C2606c f18970b = new C2606c();

    /* renamed from: a */
    private C2605b f18971a = null;

    @RecentlyNonNull
    /* renamed from: a */
    public static C2605b m21299a(@RecentlyNonNull Context context) {
        return f18970b.mo12498b(context);
    }

    @RecentlyNonNull
    /* renamed from: b */
    public final synchronized C2605b mo12498b(@RecentlyNonNull Context context) {
        if (this.f18971a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f18971a = new C2605b(context);
        }
        return this.f18971a;
    }
}
