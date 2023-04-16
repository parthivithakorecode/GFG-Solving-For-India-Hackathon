package p036e4;

import android.util.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p005a4.C0157r;

/* renamed from: e4.h */
public class C2568h {

    /* renamed from: e4.h$a */
    public interface C2569a {
        /* renamed from: a */
        String mo12465a();

        /* renamed from: b */
        String mo12466b();

        /* renamed from: c */
        List<String> mo12467c();

        /* renamed from: d */
        String mo12468d();

        /* renamed from: e */
        List<String> mo12469e(C2571c cVar);

        /* renamed from: f */
        String mo12470f();
    }

    /* renamed from: e4.h$b */
    private static class C2570b extends C0157r {

        /* renamed from: d */
        public static final C2570b f18676d = new C2570b();

        private C2570b() {
        }
    }

    /* renamed from: e4.h$c */
    public enum C2571c {
        root(0),
        music(1),
        podcasts(2),
        ringtones(3),
        alarms(4),
        notifications(5),
        pictures(6),
        movies(7),
        downloads(8),
        dcim(9),
        documents(10);
        

        /* renamed from: f */
        private int f18689f;

        private C2571c(int i) {
            this.f18689f = i;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Map<String, Object> m21244b(Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put("message", th.toString());
        hashMap.put("code", th.getClass().getSimpleName());
        hashMap.put("details", "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return hashMap;
    }
}
