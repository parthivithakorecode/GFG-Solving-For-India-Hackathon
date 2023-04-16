package p066io.flutter.embedding.engine;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.C1099i;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p005a4.C0152m;
import p005a4.C0153n;
import p005a4.C0155p;
import p005a4.C0156q;
import p064i4.C2851e;
import p066io.flutter.embedding.android.C2903c;
import p066io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import p099n3.C3768b;
import p120q3.C3953d;
import p132s3.C4047a;
import p132s3.C4050b;
import p138t3.C4076a;
import p138t3.C4077b;
import p138t3.C4078c;
import p144u3.C4137a;
import p144u3.C4138b;
import p150v3.C4236a;
import p150v3.C4237b;
import p156w3.C4270a;
import p156w3.C4271b;

/* renamed from: io.flutter.embedding.engine.c */
class C2965c implements C4050b, C4077b {

    /* renamed from: a */
    private final Map<Class<? extends C4047a>, C4047a> f19837a = new HashMap();

    /* renamed from: b */
    private final C2961a f19838b;

    /* renamed from: c */
    private final C4047a.C4049b f19839c;

    /* renamed from: d */
    private final Map<Class<? extends C4047a>, C4076a> f19840d = new HashMap();

    /* renamed from: e */
    private C2903c<Activity> f19841e;

    /* renamed from: f */
    private C2968c f19842f;

    /* renamed from: g */
    private boolean f19843g = false;

    /* renamed from: h */
    private final Map<Class<? extends C4047a>, C4270a> f19844h = new HashMap();

    /* renamed from: i */
    private Service f19845i;

    /* renamed from: j */
    private C2971f f19846j;

    /* renamed from: k */
    private final Map<Class<? extends C4047a>, C4137a> f19847k = new HashMap();

    /* renamed from: l */
    private BroadcastReceiver f19848l;

    /* renamed from: m */
    private C2969d f19849m;

    /* renamed from: n */
    private final Map<Class<? extends C4047a>, C4236a> f19850n = new HashMap();

    /* renamed from: o */
    private ContentProvider f19851o;

    /* renamed from: p */
    private C2970e f19852p;

    /* renamed from: io.flutter.embedding.engine.c$b */
    private static class C2967b implements C4047a.C4048a {

        /* renamed from: a */
        final C3953d f19853a;

        private C2967b(C3953d dVar) {
            this.f19853a = dVar;
        }
    }

    /* renamed from: io.flutter.embedding.engine.c$c */
    private static class C2968c implements C4078c {

        /* renamed from: a */
        private final Activity f19854a;

        /* renamed from: b */
        private final HiddenLifecycleReference f19855b;

        /* renamed from: c */
        private final Set<C0155p> f19856c = new HashSet();

        /* renamed from: d */
        private final Set<C0152m> f19857d = new HashSet();

        /* renamed from: e */
        private final Set<C0153n> f19858e = new HashSet();

        /* renamed from: f */
        private final Set<C0156q> f19859f = new HashSet();

        /* renamed from: g */
        private final Set<C4078c.C4079a> f19860g = new HashSet();

        public C2968c(Activity activity, C1099i iVar) {
            this.f19854a = activity;
            this.f19855b = new HiddenLifecycleReference(iVar);
        }

        /* renamed from: a */
        public void mo13514a(C0155p pVar) {
            this.f19856c.add(pVar);
        }

        /* renamed from: b */
        public void mo13515b(C0152m mVar) {
            this.f19857d.remove(mVar);
        }

        /* renamed from: c */
        public void mo13516c(C0153n nVar) {
            this.f19858e.add(nVar);
        }

        /* renamed from: d */
        public Activity mo13517d() {
            return this.f19854a;
        }

        /* renamed from: e */
        public void mo13518e(C0152m mVar) {
            this.f19857d.add(mVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo13519f(int i, int i2, Intent intent) {
            Iterator it = new HashSet(this.f19857d).iterator();
            while (true) {
                boolean z = false;
                while (true) {
                    if (!it.hasNext()) {
                        return z;
                    }
                    if (((C0152m) it.next()).mo342a(i, i2, intent) || z) {
                        z = true;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo13520g(Intent intent) {
            for (C0153n onNewIntent : this.f19858e) {
                onNewIntent.onNewIntent(intent);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public boolean mo13521h(int i, String[] strArr, int[] iArr) {
            Iterator<C0155p> it = this.f19856c.iterator();
            while (true) {
                boolean z = false;
                while (true) {
                    if (!it.hasNext()) {
                        return z;
                    }
                    if (it.next().onRequestPermissionsResult(i, strArr, iArr) || z) {
                        z = true;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo13522i(Bundle bundle) {
            for (C4078c.C4079a b : this.f19860g) {
                b.mo15579b(bundle);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo13523j(Bundle bundle) {
            for (C4078c.C4079a c : this.f19860g) {
                c.mo15580c(bundle);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo13524k() {
            for (C0156q d : this.f19859f) {
                d.mo350d();
            }
        }
    }

    /* renamed from: io.flutter.embedding.engine.c$d */
    private static class C2969d implements C4138b {
    }

    /* renamed from: io.flutter.embedding.engine.c$e */
    private static class C2970e implements C4237b {
    }

    /* renamed from: io.flutter.embedding.engine.c$f */
    private static class C2971f implements C4271b {
    }

    C2965c(Context context, C2961a aVar, C3953d dVar) {
        this.f19838b = aVar;
        this.f19839c = new C4047a.C4049b(context, aVar, aVar.mo13477h(), aVar.mo13485p(), aVar.mo13483n().mo13708P(), new C2967b(dVar));
    }

    /* renamed from: i */
    private void m23060i(Activity activity, C1099i iVar) {
        this.f19842f = new C2968c(activity, iVar);
        this.f19838b.mo13483n().mo13717h0(activity.getIntent() != null ? activity.getIntent().getBooleanExtra("enable-software-rendering", false) : false);
        this.f19838b.mo13483n().mo13697B(activity, this.f19838b.mo13485p(), this.f19838b.mo13477h());
        for (C4076a next : this.f19840d.values()) {
            if (this.f19843g) {
                next.onReattachedToActivityForConfigChanges(this.f19842f);
            } else {
                next.onAttachedToActivity(this.f19842f);
            }
        }
        this.f19843g = false;
    }

    /* renamed from: k */
    private void m23061k() {
        this.f19838b.mo13483n().mo13705J();
        this.f19841e = null;
        this.f19842f = null;
    }

    /* renamed from: l */
    private void m23062l() {
        if (m23063q()) {
            mo13503h();
        } else if (m23066t()) {
            mo13507o();
        } else if (m23064r()) {
            mo13505m();
        } else if (m23065s()) {
            mo13506n();
        }
    }

    /* renamed from: q */
    private boolean m23063q() {
        return this.f19841e != null;
    }

    /* renamed from: r */
    private boolean m23064r() {
        return this.f19848l != null;
    }

    /* renamed from: s */
    private boolean m23065s() {
        return this.f19851o != null;
    }

    /* renamed from: t */
    private boolean m23066t() {
        return this.f19845i != null;
    }

    /* renamed from: a */
    public boolean mo13496a(int i, int i2, Intent intent) {
        if (m23063q()) {
            C2851e.m22352a("FlutterEngineConnectionRegistry#onActivityResult");
            try {
                return this.f19842f.mo13519f(i, i2, intent);
            } finally {
                C2851e.m22355d();
            }
        } else {
            C3768b.m25588b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
            return false;
        }
    }

    /* renamed from: b */
    public void mo13497b(Bundle bundle) {
        if (m23063q()) {
            C2851e.m22352a("FlutterEngineConnectionRegistry#onRestoreInstanceState");
            try {
                this.f19842f.mo13522i(bundle);
            } finally {
                C2851e.m22355d();
            }
        } else {
            C3768b.m25588b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
        }
    }

    /* renamed from: c */
    public void mo13498c(Bundle bundle) {
        if (m23063q()) {
            C2851e.m22352a("FlutterEngineConnectionRegistry#onSaveInstanceState");
            try {
                this.f19842f.mo13523j(bundle);
            } finally {
                C2851e.m22355d();
            }
        } else {
            C3768b.m25588b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
        }
    }

    /* renamed from: d */
    public void mo13499d() {
        if (m23063q()) {
            C2851e.m22352a("FlutterEngineConnectionRegistry#onUserLeaveHint");
            try {
                this.f19842f.mo13524k();
            } finally {
                C2851e.m22355d();
            }
        } else {
            C3768b.m25588b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
        }
    }

    /* renamed from: e */
    public void mo13500e(C2903c<Activity> cVar, C1099i iVar) {
        C2851e.m22352a("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            C2903c<Activity> cVar2 = this.f19841e;
            if (cVar2 != null) {
                cVar2.mo13249e();
            }
            m23062l();
            this.f19841e = cVar;
            m23060i(cVar.mo13250f(), iVar);
        } finally {
            C2851e.m22355d();
        }
    }

    /* renamed from: f */
    public void mo13501f(C4047a aVar) {
        C2851e.m22352a("FlutterEngineConnectionRegistry#add " + aVar.getClass().getSimpleName());
        try {
            if (mo13510p(aVar.getClass())) {
                C3768b.m25593g("FlutterEngineCxnRegstry", "Attempted to register plugin (" + aVar + ") but it was already registered with this FlutterEngine (" + this.f19838b + ").");
                return;
            }
            C3768b.m25592f("FlutterEngineCxnRegstry", "Adding plugin: " + aVar);
            this.f19837a.put(aVar.getClass(), aVar);
            aVar.onAttachedToEngine(this.f19839c);
            if (aVar instanceof C4076a) {
                C4076a aVar2 = (C4076a) aVar;
                this.f19840d.put(aVar.getClass(), aVar2);
                if (m23063q()) {
                    aVar2.onAttachedToActivity(this.f19842f);
                }
            }
            if (aVar instanceof C4270a) {
                C4270a aVar3 = (C4270a) aVar;
                this.f19844h.put(aVar.getClass(), aVar3);
                if (m23066t()) {
                    aVar3.mo15835a(this.f19846j);
                }
            }
            if (aVar instanceof C4137a) {
                C4137a aVar4 = (C4137a) aVar;
                this.f19847k.put(aVar.getClass(), aVar4);
                if (m23064r()) {
                    aVar4.mo15657a(this.f19849m);
                }
            }
            if (aVar instanceof C4236a) {
                C4236a aVar5 = (C4236a) aVar;
                this.f19850n.put(aVar.getClass(), aVar5);
                if (m23065s()) {
                    aVar5.mo15783b(this.f19852p);
                }
            }
            C2851e.m22355d();
        } finally {
            C2851e.m22355d();
        }
    }

    /* renamed from: g */
    public void mo13502g() {
        if (m23063q()) {
            C2851e.m22352a("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
            try {
                this.f19843g = true;
                for (C4076a onDetachedFromActivityForConfigChanges : this.f19840d.values()) {
                    onDetachedFromActivityForConfigChanges.onDetachedFromActivityForConfigChanges();
                }
                m23061k();
            } finally {
                C2851e.m22355d();
            }
        } else {
            C3768b.m25588b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
        }
    }

    /* renamed from: h */
    public void mo13503h() {
        if (m23063q()) {
            C2851e.m22352a("FlutterEngineConnectionRegistry#detachFromActivity");
            try {
                for (C4076a onDetachedFromActivity : this.f19840d.values()) {
                    onDetachedFromActivity.onDetachedFromActivity();
                }
                m23061k();
            } finally {
                C2851e.m22355d();
            }
        } else {
            C3768b.m25588b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
        }
    }

    /* renamed from: j */
    public void mo13504j() {
        C3768b.m25592f("FlutterEngineCxnRegstry", "Destroying.");
        m23062l();
        mo13513w();
    }

    /* renamed from: m */
    public void mo13505m() {
        if (m23064r()) {
            C2851e.m22352a("FlutterEngineConnectionRegistry#detachFromBroadcastReceiver");
            try {
                for (C4137a b : this.f19847k.values()) {
                    b.mo15658b();
                }
            } finally {
                C2851e.m22355d();
            }
        } else {
            C3768b.m25588b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a BroadcastReceiver when no BroadcastReceiver was attached.");
        }
    }

    /* renamed from: n */
    public void mo13506n() {
        if (m23065s()) {
            C2851e.m22352a("FlutterEngineConnectionRegistry#detachFromContentProvider");
            try {
                for (C4236a a : this.f19850n.values()) {
                    a.mo15782a();
                }
            } finally {
                C2851e.m22355d();
            }
        } else {
            C3768b.m25588b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a ContentProvider when no ContentProvider was attached.");
        }
    }

    /* renamed from: o */
    public void mo13507o() {
        if (m23066t()) {
            C2851e.m22352a("FlutterEngineConnectionRegistry#detachFromService");
            try {
                for (C4270a b : this.f19844h.values()) {
                    b.mo15836b();
                }
                this.f19845i = null;
            } finally {
                C2851e.m22355d();
            }
        } else {
            C3768b.m25588b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a Service when no Service was attached.");
        }
    }

    public void onNewIntent(Intent intent) {
        if (m23063q()) {
            C2851e.m22352a("FlutterEngineConnectionRegistry#onNewIntent");
            try {
                this.f19842f.mo13520g(intent);
            } finally {
                C2851e.m22355d();
            }
        } else {
            C3768b.m25588b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
        }
    }

    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (m23063q()) {
            C2851e.m22352a("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
            try {
                return this.f19842f.mo13521h(i, strArr, iArr);
            } finally {
                C2851e.m22355d();
            }
        } else {
            C3768b.m25588b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
            return false;
        }
    }

    /* renamed from: p */
    public boolean mo13510p(Class<? extends C4047a> cls) {
        return this.f19837a.containsKey(cls);
    }

    /* renamed from: u */
    public void mo13511u(Class<? extends C4047a> cls) {
        C4047a aVar = this.f19837a.get(cls);
        if (aVar != null) {
            C2851e.m22352a("FlutterEngineConnectionRegistry#remove " + cls.getSimpleName());
            try {
                if (aVar instanceof C4076a) {
                    if (m23063q()) {
                        ((C4076a) aVar).onDetachedFromActivity();
                    }
                    this.f19840d.remove(cls);
                }
                if (aVar instanceof C4270a) {
                    if (m23066t()) {
                        ((C4270a) aVar).mo15836b();
                    }
                    this.f19844h.remove(cls);
                }
                if (aVar instanceof C4137a) {
                    if (m23064r()) {
                        ((C4137a) aVar).mo15658b();
                    }
                    this.f19847k.remove(cls);
                }
                if (aVar instanceof C4236a) {
                    if (m23065s()) {
                        ((C4236a) aVar).mo15782a();
                    }
                    this.f19850n.remove(cls);
                }
                aVar.onDetachedFromEngine(this.f19839c);
                this.f19837a.remove(cls);
            } finally {
                C2851e.m22355d();
            }
        }
    }

    /* renamed from: v */
    public void mo13512v(Set<Class<? extends C4047a>> set) {
        for (Class<? extends C4047a> u : set) {
            mo13511u(u);
        }
    }

    /* renamed from: w */
    public void mo13513w() {
        mo13512v(new HashSet(this.f19837a.keySet()));
        this.f19837a.clear();
    }
}
