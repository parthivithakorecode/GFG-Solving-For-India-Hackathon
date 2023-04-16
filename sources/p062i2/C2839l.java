package p062i2;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p003a2.C0092o;
import p034e2.C2550g;
import p131s2.C4028h;
import p131s2.C4029i;
import p142u1.C4129b;
import p142u1.C4130c;

/* renamed from: i2.l */
public final class C2839l implements C4129b {

    /* renamed from: e */
    private static C4129b f19527e;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f19528a;

    /* renamed from: b */
    private boolean f19529b = false;

    /* renamed from: c */
    private final ScheduledExecutorService f19530c;

    /* renamed from: d */
    private final ExecutorService f19531d;

    C2839l(Context context) {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f19530c = newSingleThreadScheduledExecutor;
        this.f19531d = Executors.newSingleThreadExecutor();
        this.f19528a = context;
        if (!this.f19529b) {
            newSingleThreadScheduledExecutor.scheduleAtFixedRate(new C2837j(this, (C2836i) null), 0, 86400, TimeUnit.SECONDS);
            this.f19529b = true;
        }
    }

    /* renamed from: d */
    static synchronized C4129b m22331d(Context context) {
        C4129b bVar;
        synchronized (C2839l.class) {
            C0092o.m314j(context, "Context must not be null");
            if (f19527e == null) {
                f19527e = new C2839l(context.getApplicationContext());
            }
            bVar = f19527e;
        }
        return bVar;
    }

    /* renamed from: f */
    protected static final void m22332f(Context context) {
        if (!m22333g(context).edit().remove("app_set_id").commit()) {
            String valueOf = String.valueOf(context.getPackageName());
            Log.e("AppSet", valueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(valueOf) : new String("Failed to clear app set ID generated for App "));
        }
        if (!m22333g(context).edit().remove("app_set_id_last_used_time").commit()) {
            String valueOf2 = String.valueOf(context.getPackageName());
            Log.e("AppSet", valueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(valueOf2) : new String("Failed to clear app set ID last used time for App "));
        }
    }

    /* renamed from: g */
    private static final SharedPreferences m22333g(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    /* renamed from: h */
    private static final void m22334h(Context context) {
        if (!m22333g(context).edit().putLong("app_set_id_last_used_time", C2550g.m21187d().mo12462a()).commit()) {
            String valueOf = String.valueOf(context.getPackageName());
            Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(valueOf) : new String("Failed to store app set ID last used time for App "));
            throw new C2838k("Failed to store the app set ID last used time.");
        }
    }

    /* renamed from: a */
    public final C4028h<C4130c> mo13097a() {
        C4029i iVar = new C4029i();
        this.f19531d.execute(new C2835h(this, iVar));
        return iVar.mo15524a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final long mo13098b() {
        long j = m22333g(this.f19528a).getLong("app_set_id_last_used_time", -1);
        if (j != -1) {
            return j + 33696000000L;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo13099e(C4029i iVar) {
        String string = m22333g(this.f19528a).getString("app_set_id", (String) null);
        long b = mo13098b();
        if (string == null || C2550g.m21187d().mo12462a() > b) {
            string = UUID.randomUUID().toString();
            try {
                Context context = this.f19528a;
                if (!m22333g(context).edit().putString("app_set_id", string).commit()) {
                    String valueOf = String.valueOf(context.getPackageName());
                    Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(valueOf) : new String("Failed to store app set ID generated for App "));
                    throw new C2838k("Failed to store the app set ID.");
                }
                m22334h(context);
                Context context2 = this.f19528a;
                if (!m22333g(context2).edit().putLong("app_set_id_creation_time", C2550g.m21187d().mo12462a()).commit()) {
                    String valueOf2 = String.valueOf(context2.getPackageName());
                    Log.e("AppSet", valueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(valueOf2) : new String("Failed to store app set ID creation time for App "));
                    throw new C2838k("Failed to store the app set ID creation time.");
                }
            } catch (C2838k e) {
                iVar.mo15525b(e);
                return;
            }
        } else {
            try {
                m22334h(this.f19528a);
            } catch (C2838k e2) {
                iVar.mo15525b(e2);
                return;
            }
        }
        iVar.mo15526c(new C4130c(string, 1));
    }
}
