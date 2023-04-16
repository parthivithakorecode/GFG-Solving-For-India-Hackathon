package p129s0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p089m0.C3646j;
import p153w0.C4260a;

/* renamed from: s0.c */
public abstract class C4007c<T> extends C4009d<T> {

    /* renamed from: h */
    private static final String f22173h = C3646j.m25231f("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g */
    private final BroadcastReceiver f22174g = new C4008a();

    /* renamed from: s0.c$a */
    class C4008a extends BroadcastReceiver {
        C4008a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                C4007c.this.mo15481h(context, intent);
            }
        }
    }

    public C4007c(Context context, C4260a aVar) {
        super(context, aVar);
    }

    /* renamed from: e */
    public void mo15484e() {
        C3646j.m25229c().mo14806a(f22173h, String.format("%s: registering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.f22178b.registerReceiver(this.f22174g, mo15480g());
    }

    /* renamed from: f */
    public void mo15485f() {
        C3646j.m25229c().mo14806a(f22173h, String.format("%s: unregistering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.f22178b.unregisterReceiver(this.f22174g);
    }

    /* renamed from: g */
    public abstract IntentFilter mo15480g();

    /* renamed from: h */
    public abstract void mo15481h(Context context, Intent intent);
}
