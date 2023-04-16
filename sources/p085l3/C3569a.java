package p085l3;

import android.os.Build;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import kotlin.jvm.internal.C3353e;
import kotlin.jvm.internal.C3357i;
import p005a4.C0128c;
import p005a4.C0144j;
import p005a4.C0145k;
import p132s3.C4047a;

/* renamed from: l3.a */
public final class C3569a implements C4047a, C0145k.C0149c {

    /* renamed from: b */
    public static final C3570a f21267b = new C3570a((C3353e) null);

    /* renamed from: a */
    private C0145k f21268a;

    /* renamed from: l3.a$a */
    public static final class C3570a {
        private C3570a() {
        }

        public /* synthetic */ C3570a(C3353e eVar) {
            this();
        }
    }

    /* renamed from: a */
    private final List<String> m24974a() {
        Collection collection;
        if (Build.VERSION.SDK_INT >= 26) {
            Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
            C3357i.m24507d(availableZoneIds, "getAvailableZoneIds()");
            collection = C3593q.m25052w(availableZoneIds, new ArrayList());
        } else {
            String[] availableIDs = TimeZone.getAvailableIDs();
            C3357i.m24507d(availableIDs, "getAvailableIDs()");
            collection = C3579e.m25002n(availableIDs, new ArrayList());
        }
        return (List) collection;
    }

    /* renamed from: b */
    private final String m24975b() {
        String str;
        String str2;
        if (Build.VERSION.SDK_INT >= 26) {
            str2 = ZoneId.systemDefault().getId();
            str = "{\n            ZoneId.systemDefault().id\n        }";
        } else {
            str2 = TimeZone.getDefault().getID();
            str = "{\n            TimeZone.getDefault().id\n        }";
        }
        C3357i.m24507d(str2, str);
        return str2;
    }

    /* renamed from: c */
    private final void m24976c(C0128c cVar) {
        C0145k kVar = new C0145k(cVar, "flutter_native_timezone");
        this.f21268a = kVar;
        kVar.mo337e(this);
    }

    public void onAttachedToEngine(C4047a.C4049b bVar) {
        C3357i.m24508e(bVar, "binding");
        C0128c b = bVar.mo15540b();
        C3357i.m24507d(b, "binding.binaryMessenger");
        m24976c(b);
    }

    public void onDetachedFromEngine(C4047a.C4049b bVar) {
        C3357i.m24508e(bVar, "binding");
        C0145k kVar = this.f21268a;
        if (kVar == null) {
            C3357i.m24518o("channel");
            kVar = null;
        }
        kVar.mo337e((C0145k.C0149c) null);
    }

    public void onMethodCall(C0144j jVar, C0145k.C0150d dVar) {
        Object a;
        C3357i.m24508e(jVar, "call");
        C3357i.m24508e(dVar, "result");
        String str = jVar.f269a;
        if (C3357i.m24504a(str, "getLocalTimezone")) {
            a = m24975b();
        } else if (C3357i.m24504a(str, "getAvailableTimezones")) {
            a = m24974a();
        } else {
            dVar.mo340c();
            return;
        }
        dVar.mo338a(a);
    }
}
