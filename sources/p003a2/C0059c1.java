package p003a2;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* renamed from: a2.c1 */
final class C0059c1 implements Handler.Callback {

    /* renamed from: f */
    final /* synthetic */ C0063d1 f118f;

    /* synthetic */ C0059c1(C0063d1 d1Var, C0048a1 a1Var) {
        this.f118f = d1Var;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f118f.f136d) {
                C0116z0 z0Var = (C0116z0) message.obj;
                C0051b1 b1Var = (C0051b1) this.f118f.f136d.get(z0Var);
                if (b1Var != null && b1Var.mo148h()) {
                    if (b1Var.mo145e()) {
                        b1Var.mo142b("GmsClientSupervisor");
                    }
                    this.f118f.f136d.remove(z0Var);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.f118f.f136d) {
                C0116z0 z0Var2 = (C0116z0) message.obj;
                C0051b1 b1Var2 = (C0051b1) this.f118f.f136d.get(z0Var2);
                if (b1Var2 != null && b1Var2.mo146f() == 3) {
                    String valueOf = String.valueOf(z0Var2);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName j = b1Var2.mo150j();
                    if (j == null) {
                        j = z0Var2.mo297b();
                    }
                    if (j == null) {
                        String a = z0Var2.mo296a();
                        C0092o.m313i(a);
                        j = new ComponentName(a, "unknown");
                    }
                    b1Var2.onServiceDisconnected(j);
                }
            }
            return true;
        }
    }
}
