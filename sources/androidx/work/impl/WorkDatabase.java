package androidx.work.impl;

import android.content.Context;
import androidx.room.C1172g;
import androidx.room.C1173h;
import androidx.work.impl.C1244a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p053h0.C2666b;
import p053h0.C2667c;
import p060i0.C2797c;
import p096n0.C3755h;
import p141u0.C4086b;
import p141u0.C4090e;
import p141u0.C4094h;
import p141u0.C4099k;
import p141u0.C4103n;
import p141u0.C4111q;
import p141u0.C4123t;

public abstract class WorkDatabase extends C1173h {

    /* renamed from: l */
    private static final long f3364l = TimeUnit.DAYS.toMillis(1);

    /* renamed from: androidx.work.impl.WorkDatabase$a */
    class C1241a implements C2667c.C2671c {

        /* renamed from: a */
        final /* synthetic */ Context f3365a;

        C1241a(Context context) {
            this.f3365a = context;
        }

        /* renamed from: a */
        public C2667c mo3996a(C2667c.C2669b bVar) {
            C2667c.C2669b.C2670a a = C2667c.C2669b.m21485a(this.f3365a);
            a.mo12662c(bVar.f19097b).mo12661b(bVar.f19098c).mo12663d(true);
            return new C2797c().mo3996a(a.mo12660a());
        }
    }

    /* renamed from: androidx.work.impl.WorkDatabase$b */
    class C1242b extends C1173h.C1175b {
        C1242b() {
        }

        /* renamed from: c */
        public void mo3975c(C2666b bVar) {
            super.mo3975c(bVar);
            bVar.mo12649f();
            try {
                bVar.mo12651i(WorkDatabase.m4997w());
                bVar.mo12658y();
            } finally {
                bVar.mo12648e();
            }
        }
    }

    /* renamed from: s */
    public static WorkDatabase m4994s(Context context, Executor executor, boolean z) {
        C1173h.C1174a<WorkDatabase> aVar;
        Class<WorkDatabase> cls = WorkDatabase.class;
        if (z) {
            aVar = C1172g.m4717c(context, cls).mo3968c();
        } else {
            aVar = C1172g.m4715a(context, cls, C3755h.m25537d());
            aVar.mo3971f(new C1241a(context));
        }
        return aVar.mo3972g(executor).mo3966a(m4995u()).mo3967b(C1244a.f3374a).mo3967b(new C1244a.C1252h(context, 2, 3)).mo3967b(C1244a.f3375b).mo3967b(C1244a.f3376c).mo3967b(new C1244a.C1252h(context, 5, 6)).mo3967b(C1244a.f3377d).mo3967b(C1244a.f3378e).mo3967b(C1244a.f3379f).mo3967b(new C1244a.C1253i(context)).mo3967b(new C1244a.C1252h(context, 10, 11)).mo3967b(C1244a.f3380g).mo3970e().mo3969d();
    }

    /* renamed from: u */
    static C1173h.C1175b m4995u() {
        return new C1242b();
    }

    /* renamed from: v */
    static long m4996v() {
        return System.currentTimeMillis() - f3364l;
    }

    /* renamed from: w */
    static String m4997w() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + m4996v() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    /* renamed from: A */
    public abstract C4103n mo4513A();

    /* renamed from: B */
    public abstract C4111q mo4514B();

    /* renamed from: C */
    public abstract C4123t mo4515C();

    /* renamed from: t */
    public abstract C4086b mo4516t();

    /* renamed from: x */
    public abstract C4090e mo4517x();

    /* renamed from: y */
    public abstract C4094h mo4518y();

    /* renamed from: z */
    public abstract C4099k mo4519z();
}
