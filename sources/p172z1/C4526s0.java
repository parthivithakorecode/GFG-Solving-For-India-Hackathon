package p172z1;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p131s2.C4029i;
import p160x1.C4282d;
import p166y1.C4365a;

/* renamed from: z1.s0 */
public final class C4526s0<ResultT> extends C4503h0 {

    /* renamed from: b */
    private final C4514n<C4365a.C4367b, ResultT> f23037b;

    /* renamed from: c */
    private final C4029i<ResultT> f23038c;

    /* renamed from: d */
    private final C4512m f23039d;

    public C4526s0(int i, C4514n<C4365a.C4367b, ResultT> nVar, C4029i<ResultT> iVar, C4512m mVar) {
        super(i);
        this.f23038c = iVar;
        this.f23037b = nVar;
        this.f23039d = mVar;
        if (i == 2 && nVar.mo16172c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    /* renamed from: a */
    public final void mo16188a(Status status) {
        this.f23038c.mo15527d(this.f23039d.mo16121a(status));
    }

    /* renamed from: b */
    public final void mo16189b(Exception exc) {
        this.f23038c.mo15527d(exc);
    }

    /* renamed from: c */
    public final void mo16192c(C4519p pVar, boolean z) {
        pVar.mo16182a(this.f23038c, z);
    }

    /* renamed from: d */
    public final void mo16190d(C4538z<?> zVar) {
        try {
            this.f23037b.mo16171b(zVar.mo16209s(), this.f23038c);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo16188a(C4530u0.m27417e(e2));
        } catch (RuntimeException e3) {
            this.f23038c.mo15527d(e3);
        }
    }

    /* renamed from: f */
    public final C4282d[] mo16160f(C4538z<?> zVar) {
        return this.f23037b.mo16173d();
    }

    /* renamed from: g */
    public final boolean mo16161g(C4538z<?> zVar) {
        return this.f23037b.mo16172c();
    }
}
