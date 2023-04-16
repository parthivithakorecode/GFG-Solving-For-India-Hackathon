package p147v0;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C1268a;
import androidx.work.impl.utils.futures.C1284d;
import java.util.UUID;
import p089m0.C3640e;
import p089m0.C3641f;
import p089m0.C3646j;
import p089m0.C3662s;
import p135t0.C4058a;
import p141u0.C4111q;
import p143u2.C4136a;
import p153w0.C4260a;

/* renamed from: v0.l */
public class C4184l implements C3641f {

    /* renamed from: d */
    private static final String f22417d = C3646j.m25231f("WMFgUpdater");

    /* renamed from: a */
    private final C4260a f22418a;

    /* renamed from: b */
    final C4058a f22419b;

    /* renamed from: c */
    final C4111q f22420c;

    /* renamed from: v0.l$a */
    class C4185a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C1284d f22421f;

        /* renamed from: g */
        final /* synthetic */ UUID f22422g;

        /* renamed from: h */
        final /* synthetic */ C3640e f22423h;

        /* renamed from: i */
        final /* synthetic */ Context f22424i;

        C4185a(C1284d dVar, UUID uuid, C3640e eVar, Context context) {
            this.f22421f = dVar;
            this.f22422g = uuid;
            this.f22423h = eVar;
            this.f22424i = context;
        }

        public void run() {
            try {
                if (!this.f22421f.isCancelled()) {
                    String uuid = this.f22422g.toString();
                    C3662s i = C4184l.this.f22420c.mo15630i(uuid);
                    if (i == null || i.mo14822b()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    C4184l.this.f22419b.mo14957c(uuid, this.f22423h);
                    this.f22424i.startService(C1268a.m5099b(this.f22424i, uuid, this.f22423h));
                }
                this.f22421f.mo4583q(null);
            } catch (Throwable th) {
                this.f22421f.mo4584r(th);
            }
        }
    }

    public C4184l(WorkDatabase workDatabase, C4058a aVar, C4260a aVar2) {
        this.f22419b = aVar;
        this.f22418a = aVar2;
        this.f22420c = workDatabase.mo4514B();
    }

    /* renamed from: a */
    public C4136a<Void> mo14802a(Context context, UUID uuid, C3640e eVar) {
        C1284d u = C1284d.m5161u();
        this.f22418a.mo15823b(new C4185a(u, uuid, eVar, context));
        return u;
    }
}
