package p160x1;

import android.content.Context;
import android.util.Log;
import javax.annotation.CheckReturnValue;

@CheckReturnValue
/* renamed from: x1.z */
final class C4304z {

    /* renamed from: a */
    static final C4302x f22608a = new C4296r(C4300v.m26874C0("0\u0005È0\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010e\bsù/Qí"));

    /* renamed from: b */
    static final C4302x f22609b = new C4297s(C4300v.m26874C0("0\u0006\u00040\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²­×árÊkì"));

    /* renamed from: c */
    static final C4302x f22610c = new C4298t(C4300v.m26874C0("0\u0004C0\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000ÂàFdJ00"));

    /* renamed from: d */
    static final C4302x f22611d = new C4299u(C4300v.m26874C0("0\u0004¨0\u0003 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ¸l}ÓNõ0"));

    /* renamed from: e */
    private static final Object f22612e = new Object();

    /* renamed from: f */
    private static Context f22613f;

    /* renamed from: a */
    static synchronized void m26881a(Context context) {
        synchronized (C4304z.class) {
            if (f22613f != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f22613f = context.getApplicationContext();
            }
        }
    }
}
