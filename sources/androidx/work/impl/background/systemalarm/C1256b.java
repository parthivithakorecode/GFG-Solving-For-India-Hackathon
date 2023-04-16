package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.C1259e;
import java.util.HashMap;
import java.util.Map;
import p089m0.C3646j;
import p096n0.C3748b;
import p141u0.C4108p;

/* renamed from: androidx.work.impl.background.systemalarm.b */
public class C1256b implements C3748b {

    /* renamed from: i */
    private static final String f3394i = C3646j.m25231f("CommandHandler");

    /* renamed from: f */
    private final Context f3395f;

    /* renamed from: g */
    private final Map<String, C3748b> f3396g = new HashMap();

    /* renamed from: h */
    private final Object f3397h = new Object();

    C1256b(Context context) {
        this.f3395f = context;
    }

    /* renamed from: b */
    static Intent m5051b(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    /* renamed from: c */
    static Intent m5052c(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: d */
    static Intent m5053d(Context context, String str, boolean z) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        return intent;
    }

    /* renamed from: e */
    static Intent m5054e(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    /* renamed from: f */
    static Intent m5055f(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: g */
    static Intent m5056g(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: h */
    private void m5057h(Intent intent, int i, C1259e eVar) {
        C3646j.m25229c().mo14806a(f3394i, String.format("Handling constraints changed %s", new Object[]{intent}), new Throwable[0]);
        new C1257c(this.f3395f, i, eVar).mo4529a();
    }

    /* renamed from: i */
    private void m5058i(Intent intent, int i, C1259e eVar) {
        Bundle extras = intent.getExtras();
        synchronized (this.f3397h) {
            String string = extras.getString("KEY_WORKSPEC_ID");
            C3646j c = C3646j.m25229c();
            String str = f3394i;
            c.mo14806a(str, String.format("Handing delay met for %s", new Object[]{string}), new Throwable[0]);
            if (!this.f3396g.containsKey(string)) {
                C1258d dVar = new C1258d(this.f3395f, i, string, eVar);
                this.f3396g.put(string, dVar);
                dVar.mo4533f();
            } else {
                C3646j.m25229c().mo14806a(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", new Object[]{string}), new Throwable[0]);
            }
        }
    }

    /* renamed from: j */
    private void m5059j(Intent intent, int i) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        C3646j.m25229c().mo14806a(f3394i, String.format("Handling onExecutionCompleted %s, %s", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        mo4526a(string, z);
    }

    /* renamed from: k */
    private void m5060k(Intent intent, int i, C1259e eVar) {
        C3646j.m25229c().mo14806a(f3394i, String.format("Handling reschedule %s, %s", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        eVar.mo4538g().mo14989s();
    }

    /* renamed from: l */
    private void m5061l(Intent intent, int i, C1259e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        C3646j c = C3646j.m25229c();
        String str = f3394i;
        c.mo14806a(str, String.format("Handling schedule work for %s", new Object[]{string}), new Throwable[0]);
        WorkDatabase o = eVar.mo4538g().mo14986o();
        o.mo3951c();
        try {
            C4108p k = o.mo4514B().mo15632k(string);
            if (k == null) {
                C3646j c2 = C3646j.m25229c();
                c2.mo14810h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
            } else if (k.f22315b.mo14822b()) {
                C3646j c3 = C3646j.m25229c();
                c3.mo14810h(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                o.mo3955g();
            } else {
                long a = k.mo15613a();
                if (!k.mo15614b()) {
                    C3646j.m25229c().mo14806a(str, String.format("Setting up Alarms for %s at %s", new Object[]{string, Long.valueOf(a)}), new Throwable[0]);
                    C1255a.m5049c(this.f3395f, eVar.mo4538g(), string, a);
                } else {
                    C3646j.m25229c().mo14806a(str, String.format("Opportunistically setting an alarm for %s at %s", new Object[]{string, Long.valueOf(a)}), new Throwable[0]);
                    C1255a.m5049c(this.f3395f, eVar.mo4538g(), string, a);
                    eVar.mo4541k(new C1259e.C1261b(eVar, m5051b(this.f3395f), i));
                }
                o.mo3965r();
                o.mo3955g();
            }
        } finally {
            o.mo3955g();
        }
    }

    /* renamed from: m */
    private void m5062m(Intent intent, C1259e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        C3646j.m25229c().mo14806a(f3394i, String.format("Handing stopWork work for %s", new Object[]{string}), new Throwable[0]);
        eVar.mo4538g().mo14994x(string);
        C1255a.m5047a(this.f3395f, eVar.mo4538g(), string);
        eVar.mo4526a(string, false);
    }

    /* renamed from: n */
    private static boolean m5063n(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public void mo4526a(String str, boolean z) {
        synchronized (this.f3397h) {
            C3748b remove = this.f3396g.remove(str);
            if (remove != null) {
                remove.mo4526a(str, z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo4527o() {
        boolean z;
        synchronized (this.f3397h) {
            z = !this.f3396g.isEmpty();
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo4528p(Intent intent, int i, C1259e eVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            m5057h(intent, i, eVar);
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            m5060k(intent, i, eVar);
        } else if (!m5063n(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            C3646j.m25229c().mo14807b(f3394i, String.format("Invalid request for %s, requires %s.", new Object[]{action, "KEY_WORKSPEC_ID"}), new Throwable[0]);
        } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
            m5061l(intent, i, eVar);
        } else if ("ACTION_DELAY_MET".equals(action)) {
            m5058i(intent, i, eVar);
        } else if ("ACTION_STOP_WORK".equals(action)) {
            m5062m(intent, eVar);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            m5059j(intent, i);
        } else {
            C3646j.m25229c().mo14810h(f3394i, String.format("Ignoring intent %s", new Object[]{intent}), new Throwable[0]);
        }
    }
}
