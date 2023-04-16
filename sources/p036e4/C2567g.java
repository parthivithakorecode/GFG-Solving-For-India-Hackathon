package p036e4;

import java.util.ArrayList;
import java.util.HashMap;
import p005a4.C0120a;
import p005a4.C0128c;
import p005a4.C0143i;
import p036e4.C2568h;

/* renamed from: e4.g */
public final /* synthetic */ class C2567g {
    /* renamed from: g */
    public static C0143i<Object> m21235g() {
        return C2568h.C2570b.f18676d;
    }

    /* renamed from: h */
    public static /* synthetic */ void m21236h(C2568h.C2569a aVar, Object obj, C0120a.C0126e eVar) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", aVar.mo12465a());
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C2568h.m21244b(e));
        }
        eVar.mo309a(hashMap);
    }

    /* renamed from: i */
    public static /* synthetic */ void m21237i(C2568h.C2569a aVar, Object obj, C0120a.C0126e eVar) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", aVar.mo12468d());
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C2568h.m21244b(e));
        }
        eVar.mo309a(hashMap);
    }

    /* renamed from: j */
    public static /* synthetic */ void m21238j(C2568h.C2569a aVar, Object obj, C0120a.C0126e eVar) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", aVar.mo12466b());
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C2568h.m21244b(e));
        }
        eVar.mo309a(hashMap);
    }

    /* renamed from: k */
    public static /* synthetic */ void m21239k(C2568h.C2569a aVar, Object obj, C0120a.C0126e eVar) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", aVar.mo12470f());
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C2568h.m21244b(e));
        }
        eVar.mo309a(hashMap);
    }

    /* renamed from: l */
    public static /* synthetic */ void m21240l(C2568h.C2569a aVar, Object obj, C0120a.C0126e eVar) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", aVar.mo12467c());
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C2568h.m21244b(e));
        }
        eVar.mo309a(hashMap);
    }

    /* renamed from: m */
    public static /* synthetic */ void m21241m(C2568h.C2569a aVar, Object obj, C0120a.C0126e eVar) {
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            C2568h.C2571c cVar = arrayList.get(0) == null ? null : C2568h.C2571c.values()[((Integer) arrayList.get(0)).intValue()];
            if (cVar != null) {
                hashMap.put("result", aVar.mo12469e(cVar));
                eVar.mo309a(hashMap);
                return;
            }
            throw new NullPointerException("directoryArg unexpectedly null.");
        } catch (Error | RuntimeException e) {
            hashMap.put("error", C2568h.m21244b(e));
        }
    }

    /* renamed from: n */
    public static void m21242n(C0128c cVar, C2568h.C2569a aVar) {
        C0120a aVar2 = new C0120a(cVar, "dev.flutter.pigeon.PathProviderApi.getTemporaryPath", m21235g(), cVar.mo313b());
        if (aVar != null) {
            aVar2.mo307e(new C2563c(aVar));
        } else {
            aVar2.mo307e((C0120a.C0125d) null);
        }
        C0120a aVar3 = new C0120a(cVar, "dev.flutter.pigeon.PathProviderApi.getApplicationSupportPath", m21235g(), cVar.mo313b());
        if (aVar != null) {
            aVar3.mo307e(new C2566f(aVar));
        } else {
            aVar3.mo307e((C0120a.C0125d) null);
        }
        C0120a aVar4 = new C0120a(cVar, "dev.flutter.pigeon.PathProviderApi.getApplicationDocumentsPath", m21235g(), cVar.mo313b());
        if (aVar != null) {
            aVar4.mo307e(new C2564d(aVar));
        } else {
            aVar4.mo307e((C0120a.C0125d) null);
        }
        C0120a aVar5 = new C0120a(cVar, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePath", m21235g(), cVar.mo313b());
        if (aVar != null) {
            aVar5.mo307e(new C2561a(aVar));
        } else {
            aVar5.mo307e((C0120a.C0125d) null);
        }
        C0120a aVar6 = new C0120a(cVar, "dev.flutter.pigeon.PathProviderApi.getExternalCachePaths", m21235g(), cVar.mo313b());
        if (aVar != null) {
            aVar6.mo307e(new C2565e(aVar));
        } else {
            aVar6.mo307e((C0120a.C0125d) null);
        }
        C0120a aVar7 = new C0120a(cVar, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePaths", m21235g(), cVar.mo313b());
        if (aVar != null) {
            aVar7.mo307e(new C2562b(aVar));
        } else {
            aVar7.mo307e((C0120a.C0125d) null);
        }
    }
}
