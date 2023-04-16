package p160x1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import p070j2.C3231e;

@SuppressLint({"HandlerLeak"})
/* renamed from: x1.o */
final class C4293o extends C3231e {

    /* renamed from: a */
    private final Context f22601a;

    /* renamed from: b */
    final /* synthetic */ C4283e f22602b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4293o(C4283e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f22602b = eVar;
        this.f22601a = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int g = this.f22602b.mo15862g(this.f22601a);
        if (this.f22602b.mo15864i(g)) {
            this.f22602b.mo15868n(this.f22601a, g);
        }
    }
}
