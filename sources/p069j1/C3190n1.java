package p069j1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.internal.ads.C2199sw;
import com.google.android.gms.internal.ads.m10;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: j1.n1 */
public final class C3190n1 {
    @GuardedBy("this")

    /* renamed from: a */
    private final BroadcastReceiver f20508a = new C3186m1(this);
    @GuardedBy("this")

    /* renamed from: b */
    private final Map<BroadcastReceiver, IntentFilter> f20509b = new WeakHashMap();

    /* renamed from: c */
    private boolean f20510c = false;

    /* renamed from: d */
    private boolean f20511d;

    /* renamed from: e */
    private Context f20512e;

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final synchronized void m23995e(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : this.f20509b.entrySet()) {
            if (((IntentFilter) next.getValue()).hasAction(intent.getAction())) {
                arrayList.add((BroadcastReceiver) next.getKey());
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((BroadcastReceiver) arrayList.get(i)).onReceive(context, intent);
        }
    }

    /* renamed from: b */
    public final synchronized void mo14054b(Context context) {
        if (!this.f20510c) {
            Context applicationContext = context.getApplicationContext();
            this.f20512e = applicationContext;
            if (applicationContext == null) {
                this.f20512e = context;
            }
            m10.m13007c(this.f20512e);
            this.f20511d = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10622u2)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f20512e.registerReceiver(this.f20508a, intentFilter);
            this.f20510c = true;
        }
    }

    /* renamed from: c */
    public final synchronized void mo14055c(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f20511d) {
            this.f20509b.put(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    /* renamed from: d */
    public final synchronized void mo14056d(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f20511d) {
            this.f20509b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}
