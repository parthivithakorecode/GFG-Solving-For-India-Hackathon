package p147v0;

import android.content.Context;
import androidx.work.C1239b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.futures.C1284d;
import java.util.UUID;
import p089m0.C3646j;
import p089m0.C3658o;
import p089m0.C3662s;
import p141u0.C4102m;
import p141u0.C4108p;
import p143u2.C4136a;
import p153w0.C4260a;

/* renamed from: v0.m */
public class C4186m implements C3658o {

    /* renamed from: c */
    static final String f22426c = C3646j.m25231f("WorkProgressUpdater");

    /* renamed from: a */
    final WorkDatabase f22427a;

    /* renamed from: b */
    final C4260a f22428b;

    /* renamed from: v0.m$a */
    class C4187a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ UUID f22429f;

        /* renamed from: g */
        final /* synthetic */ C1239b f22430g;

        /* renamed from: h */
        final /* synthetic */ C1284d f22431h;

        C4187a(UUID uuid, C1239b bVar, C1284d dVar) {
            this.f22429f = uuid;
            this.f22430g = bVar;
            this.f22431h = dVar;
        }

        public void run() {
            String uuid = this.f22429f.toString();
            C3646j c = C3646j.m25229c();
            String str = C4186m.f22426c;
            c.mo14806a(str, String.format("Updating progress for %s (%s)", new Object[]{this.f22429f, this.f22430g}), new Throwable[0]);
            C4186m.this.f22427a.mo3951c();
            try {
                C4108p k = C4186m.this.f22427a.mo4514B().mo15632k(uuid);
                if (k != null) {
                    if (k.f22315b == C3662s.RUNNING) {
                        C4186m.this.f22427a.mo4513A().mo15610b(new C4102m(uuid, this.f22430g));
                    } else {
                        C3646j.m25229c().mo14810h(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", new Object[]{uuid}), new Throwable[0]);
                    }
                    this.f22431h.mo4583q(null);
                    C4186m.this.f22427a.mo3965r();
                    C4186m.this.f22427a.mo3955g();
                    return;
                }
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            } catch (Throwable th) {
                C4186m.this.f22427a.mo3955g();
                throw th;
            }
        }
    }

    public C4186m(WorkDatabase workDatabase, C4260a aVar) {
        this.f22427a = workDatabase;
        this.f22428b = aVar;
    }

    /* renamed from: a */
    public C4136a<Void> mo14819a(Context context, UUID uuid, C1239b bVar) {
        C1284d u = C1284d.m5161u();
        this.f22428b.mo15823b(new C4187a(uuid, bVar, u));
        return u;
    }
}
