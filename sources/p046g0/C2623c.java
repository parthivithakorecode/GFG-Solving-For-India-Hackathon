package p046g0;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.C1099i;
import androidx.lifecycle.C1110m;
import androidx.savedstate.Recreator;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C3353e;
import kotlin.jvm.internal.C3357i;
import p074k.C3286b;

@SuppressLint({"RestrictedApi"})
/* renamed from: g0.c */
public final class C2623c {

    /* renamed from: g */
    private static final C2625b f18995g = new C2625b((C3353e) null);

    /* renamed from: a */
    private final C3286b<String, C2626c> f18996a = new C3286b<>();

    /* renamed from: b */
    private boolean f18997b;

    /* renamed from: c */
    private Bundle f18998c;

    /* renamed from: d */
    private boolean f18999d;

    /* renamed from: e */
    private Recreator.C1186b f19000e;

    /* renamed from: f */
    private boolean f19001f = true;

    /* renamed from: g0.c$a */
    public interface C2624a {
        /* renamed from: a */
        void mo3781a(C2629e eVar);
    }

    /* renamed from: g0.c$b */
    private static final class C2625b {
        private C2625b() {
        }

        public /* synthetic */ C2625b(C3353e eVar) {
            this();
        }
    }

    /* renamed from: g0.c$c */
    public interface C2626c {
        /* renamed from: a */
        Bundle mo534a();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m21333d(C2623c cVar, C1110m mVar, C1099i.C1101b bVar) {
        boolean z;
        C3357i.m24508e(cVar, "this$0");
        C3357i.m24508e(mVar, "<anonymous parameter 0>");
        C3357i.m24508e(bVar, "event");
        if (bVar == C1099i.C1101b.ON_START) {
            z = true;
        } else if (bVar == C1099i.C1101b.ON_STOP) {
            z = false;
        } else {
            return;
        }
        cVar.f19001f = z;
    }

    /* renamed from: b */
    public final Bundle mo12508b(String str) {
        C3357i.m24508e(str, "key");
        if (this.f18999d) {
            Bundle bundle = this.f18998c;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
            Bundle bundle3 = this.f18998c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.f18998c;
            boolean z = false;
            if (bundle4 != null && !bundle4.isEmpty()) {
                z = true;
            }
            if (!z) {
                this.f18998c = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    /* renamed from: c */
    public final C2626c mo12509c(String str) {
        C3357i.m24508e(str, "key");
        Iterator<Map.Entry<String, C2626c>> it = this.f18996a.iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            C3357i.m24507d(next, "components");
            C2626c cVar = (C2626c) next.getValue();
            if (C3357i.m24504a((String) next.getKey(), str)) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void mo12510e(C1099i iVar) {
        C3357i.m24508e(iVar, "lifecycle");
        if (!this.f18997b) {
            iVar.mo3830a(new C2622b(this));
            this.f18997b = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
    }

    /* renamed from: f */
    public final void mo12511f(Bundle bundle) {
        if (!this.f18997b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        } else if (!this.f18999d) {
            this.f18998c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
            this.f18999d = true;
        } else {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
    }

    /* renamed from: g */
    public final void mo12512g(Bundle bundle) {
        C3357i.m24508e(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f18998c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C3286b<K, V>.d j = this.f18996a.mo14280j();
        C3357i.m24507d(j, "this.components.iteratorWithAdditions()");
        while (j.hasNext()) {
            Map.Entry entry = (Map.Entry) j.next();
            bundle2.putBundle((String) entry.getKey(), ((C2626c) entry.getValue()).mo534a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    /* renamed from: h */
    public final void mo12513h(String str, C2626c cVar) {
        C3357i.m24508e(str, "key");
        C3357i.m24508e(cVar, "provider");
        if (!(this.f18996a.mo14272m(str, cVar) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    /* renamed from: i */
    public final void mo12514i(Class<? extends C2624a> cls) {
        C3357i.m24508e(cls, "clazz");
        if (this.f19001f) {
            Recreator.C1186b bVar = this.f19000e;
            if (bVar == null) {
                bVar = new Recreator.C1186b(this);
            }
            this.f19000e = bVar;
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.C1186b bVar2 = this.f19000e;
                if (bVar2 != null) {
                    String name = cls.getName();
                    C3357i.m24507d(name, "clazz.name");
                    bVar2.mo4000b(name);
                }
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
    }
}
