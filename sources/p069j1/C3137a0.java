package p069j1;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* renamed from: j1.a0 */
final class C3137a0 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ Context f20428f;

    /* renamed from: g */
    final /* synthetic */ String f20429g;

    /* renamed from: h */
    final /* synthetic */ boolean f20430h;

    /* renamed from: i */
    final /* synthetic */ boolean f20431i;

    C3137a0(C3145c0 c0Var, Context context, String str, boolean z, boolean z2) {
        this.f20428f = context;
        this.f20429g = str;
        this.f20430h = z;
        this.f20431i = z2;
    }

    public final void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f20428f);
        builder.setMessage(this.f20429g);
        builder.setTitle(this.f20430h ? "Error" : "Info");
        if (this.f20431i) {
            builder.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builder.setPositiveButton("Learn More", new C3224z(this));
            builder.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builder.create().show();
    }
}
