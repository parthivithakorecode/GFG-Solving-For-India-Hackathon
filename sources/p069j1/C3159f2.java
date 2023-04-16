package p069j1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: j1.f2 */
final class C3159f2 extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C3163g2 f20459a;

    /* synthetic */ C3159f2(C3163g2 g2Var, C3155e2 e2Var) {
        this.f20459a = g2Var;
    }

    public final void onReceive(Context context, Intent intent) {
        C3163g2 g2Var;
        boolean z;
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            g2Var = this.f20459a;
            z = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            g2Var = this.f20459a;
            z = false;
        } else {
            return;
        }
        g2Var.f20469c = z;
    }
}
