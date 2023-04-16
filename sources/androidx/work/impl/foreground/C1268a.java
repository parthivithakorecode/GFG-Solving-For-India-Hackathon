package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import p089m0.C3640e;
import p089m0.C3646j;
import p096n0.C3748b;
import p096n0.C3756i;
import p117q0.C3938c;
import p117q0.C3939d;
import p141u0.C4108p;
import p153w0.C4260a;

/* renamed from: androidx.work.impl.foreground.a */
public class C1268a implements C3938c, C3748b {

    /* renamed from: p */
    static final String f3450p = C3646j.m25231f("SystemFgDispatcher");

    /* renamed from: f */
    private Context f3451f;

    /* renamed from: g */
    private C3756i f3452g;

    /* renamed from: h */
    private final C4260a f3453h;

    /* renamed from: i */
    final Object f3454i = new Object();

    /* renamed from: j */
    String f3455j;

    /* renamed from: k */
    final Map<String, C3640e> f3456k;

    /* renamed from: l */
    final Map<String, C4108p> f3457l;

    /* renamed from: m */
    final Set<C4108p> f3458m;

    /* renamed from: n */
    final C3939d f3459n;

    /* renamed from: o */
    private C1270b f3460o;

    /* renamed from: androidx.work.impl.foreground.a$a */
    class C1269a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ WorkDatabase f3461f;

        /* renamed from: g */
        final /* synthetic */ String f3462g;

        C1269a(WorkDatabase workDatabase, String str) {
            this.f3461f = workDatabase;
            this.f3462g = str;
        }

        public void run() {
            C4108p k = this.f3461f.mo4514B().mo15632k(this.f3462g);
            if (k != null && k.mo15614b()) {
                synchronized (C1268a.this.f3454i) {
                    C1268a.this.f3457l.put(this.f3462g, k);
                    C1268a.this.f3458m.add(k);
                    C1268a aVar = C1268a.this;
                    aVar.f3459n.mo15403d(aVar.f3458m);
                }
            }
        }
    }

    /* renamed from: androidx.work.impl.foreground.a$b */
    interface C1270b {
        /* renamed from: c */
        void mo4554c(int i);

        /* renamed from: d */
        void mo4555d(int i, int i2, Notification notification);

        /* renamed from: e */
        void mo4556e(int i, Notification notification);

        void stop();
    }

    C1268a(Context context) {
        this.f3451f = context;
        C3756i k = C3756i.m25542k(context);
        this.f3452g = k;
        C4260a p = k.mo14987p();
        this.f3453h = p;
        this.f3455j = null;
        this.f3456k = new LinkedHashMap();
        this.f3458m = new HashSet();
        this.f3457l = new HashMap();
        this.f3459n = new C3939d(this.f3451f, p, this);
        this.f3452g.mo14984m().mo14958d(this);
    }

    /* renamed from: b */
    public static Intent m5099b(Context context, String str, C3640e eVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", eVar.mo14798c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", eVar.mo14796a());
        intent.putExtra("KEY_NOTIFICATION", eVar.mo14797b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: c */
    public static Intent m5100c(Context context, String str, C3640e eVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", eVar.mo14798c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", eVar.mo14796a());
        intent.putExtra("KEY_NOTIFICATION", eVar.mo14797b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: f */
    public static Intent m5101f(Context context) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    /* renamed from: g */
    private void m5102g(Intent intent) {
        C3646j.m25229c().mo14808d(f3450p, String.format("Stopping foreground work for %s", new Object[]{intent}), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
            this.f3452g.mo14979f(UUID.fromString(stringExtra));
        }
    }

    /* renamed from: h */
    private void m5103h(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        C3646j.m25229c().mo14806a(f3450p, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", new Object[]{Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)}), new Throwable[0]);
        if (notification != null && this.f3460o != null) {
            this.f3456k.put(stringExtra, new C3640e(intExtra, notification, intExtra2));
            if (TextUtils.isEmpty(this.f3455j)) {
                this.f3455j = stringExtra;
                this.f3460o.mo4555d(intExtra, intExtra2, notification);
                return;
            }
            this.f3460o.mo4556e(intExtra, notification);
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                for (Map.Entry<String, C3640e> value : this.f3456k.entrySet()) {
                    i |= ((C3640e) value.getValue()).mo14796a();
                }
                C3640e eVar = this.f3456k.get(this.f3455j);
                if (eVar != null) {
                    this.f3460o.mo4555d(eVar.mo14798c(), i, eVar.mo14797b());
                }
            }
        }
    }

    /* renamed from: i */
    private void m5104i(Intent intent) {
        C3646j.m25229c().mo14808d(f3450p, String.format("Started foreground service %s", new Object[]{intent}), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        this.f3453h.mo15823b(new C1269a(this.f3452g.mo14986o(), stringExtra));
    }

    /* renamed from: a */
    public void mo4526a(String str, boolean z) {
        Map.Entry next;
        synchronized (this.f3454i) {
            C4108p remove = this.f3457l.remove(str);
            if (remove != null ? this.f3458m.remove(remove) : false) {
                this.f3459n.mo15403d(this.f3458m);
            }
        }
        C3640e remove2 = this.f3456k.remove(str);
        if (str.equals(this.f3455j) && this.f3456k.size() > 0) {
            Iterator<Map.Entry<String, C3640e>> it = this.f3456k.entrySet().iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            this.f3455j = (String) next.getKey();
            if (this.f3460o != null) {
                C3640e eVar = (C3640e) next.getValue();
                this.f3460o.mo4555d(eVar.mo14798c(), eVar.mo14796a(), eVar.mo14797b());
                this.f3460o.mo4554c(eVar.mo14798c());
            }
        }
        C1270b bVar = this.f3460o;
        if (remove2 != null && bVar != null) {
            C3646j.m25229c().mo14806a(f3450p, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", new Object[]{Integer.valueOf(remove2.mo14798c()), str, Integer.valueOf(remove2.mo14796a())}), new Throwable[0]);
            bVar.mo4554c(remove2.mo14798c());
        }
    }

    /* renamed from: d */
    public void mo4531d(List<String> list) {
        if (!list.isEmpty()) {
            for (String next : list) {
                C3646j.m25229c().mo14806a(f3450p, String.format("Constraints unmet for WorkSpec %s", new Object[]{next}), new Throwable[0]);
                this.f3452g.mo14993w(next);
            }
        }
    }

    /* renamed from: e */
    public void mo4532e(List<String> list) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo4561j(Intent intent) {
        C3646j.m25229c().mo14808d(f3450p, "Stopping foreground service", new Throwable[0]);
        C1270b bVar = this.f3460o;
        if (bVar != null) {
            bVar.stop();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo4562k() {
        this.f3460o = null;
        synchronized (this.f3454i) {
            this.f3459n.mo15404e();
        }
        this.f3452g.mo14984m().mo14962i(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo4563l(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            m5104i(intent);
        } else if (!"ACTION_NOTIFY".equals(action)) {
            if ("ACTION_CANCEL_WORK".equals(action)) {
                m5102g(intent);
                return;
            } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
                mo4561j(intent);
                return;
            } else {
                return;
            }
        }
        m5103h(intent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo4564m(C1270b bVar) {
        if (this.f3460o != null) {
            C3646j.m25229c().mo14807b(f3450p, "A callback already exists.", new Throwable[0]);
        } else {
            this.f3460o = bVar;
        }
    }
}
