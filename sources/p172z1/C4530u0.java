package p172z1;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: z1.u0 */
public abstract class C4530u0 {

    /* renamed from: a */
    public final int f23043a;

    public C4530u0(int i) {
        this.f23043a = i;
    }

    /* renamed from: e */
    static /* synthetic */ Status m27417e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    /* renamed from: a */
    public abstract void mo16188a(Status status);

    /* renamed from: b */
    public abstract void mo16189b(Exception exc);

    /* renamed from: c */
    public abstract void mo16192c(C4519p pVar, boolean z);

    /* renamed from: d */
    public abstract void mo16190d(C4538z<?> zVar);
}
