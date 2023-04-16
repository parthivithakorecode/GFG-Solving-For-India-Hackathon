package p172z1;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p131s2.C4029i;
import p166y1.C4376b;

/* renamed from: z1.r0 */
abstract class C4524r0<T> extends C4503h0 {

    /* renamed from: b */
    protected final C4029i<T> f23035b;

    public C4524r0(int i, C4029i<T> iVar) {
        super(i);
        this.f23035b = iVar;
    }

    /* renamed from: a */
    public final void mo16188a(Status status) {
        this.f23035b.mo15527d(new C4376b(status));
    }

    /* renamed from: b */
    public final void mo16189b(Exception exc) {
        this.f23035b.mo15527d(exc);
    }

    /* renamed from: d */
    public final void mo16190d(C4538z<?> zVar) {
        try {
            mo16191h(zVar);
        } catch (DeadObjectException e) {
            mo16188a(C4530u0.m27417e(e));
            throw e;
        } catch (RemoteException e2) {
            mo16188a(C4530u0.m27417e(e2));
        } catch (RuntimeException e3) {
            this.f23035b.mo15527d(e3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo16191h(C4538z<?> zVar);
}
