package p172z1;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import p131s2.C4029i;
import p166y1.C4376b;

/* renamed from: z1.o */
public class C4517o {
    /* renamed from: a */
    public static <TResult> void m27383a(@RecentlyNonNull Status status, TResult tresult, @RecentlyNonNull C4029i<TResult> iVar) {
        if (status.mo5007g()) {
            iVar.mo15526c(tresult);
        } else {
            iVar.mo15525b(new C4376b(status));
        }
    }
}
