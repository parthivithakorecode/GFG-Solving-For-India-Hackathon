package p003a2;

import android.util.Log;

/* renamed from: a2.q0 */
public abstract class C0097q0<TListener> {

    /* renamed from: a */
    private TListener f210a;

    /* renamed from: b */
    private boolean f211b = false;

    /* renamed from: c */
    final /* synthetic */ C0052c f212c;

    public C0097q0(C0052c cVar, TListener tlistener) {
        this.f212c = cVar;
        this.f210a = tlistener;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo248a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo249b(TListener tlistener);

    /* renamed from: c */
    public final void mo273c() {
        TListener tlistener;
        synchronized (this) {
            tlistener = this.f210a;
            if (this.f211b) {
                String valueOf = String.valueOf(this);
                StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                sb.append("Callback proxy ");
                sb.append(valueOf);
                sb.append(" being reused. This is not safe.");
                Log.w("GmsClient", sb.toString());
            }
        }
        if (tlistener != null) {
            try {
                mo249b(tlistener);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        synchronized (this) {
            this.f211b = true;
        }
        mo274d();
    }

    /* renamed from: d */
    public final void mo274d() {
        mo275e();
        synchronized (this.f212c.f112w) {
            this.f212c.f112w.remove(this);
        }
    }

    /* renamed from: e */
    public final void mo275e() {
        synchronized (this) {
            this.f210a = null;
        }
    }
}
