package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.C1099i;
import androidx.lifecycle.C1107k;
import androidx.lifecycle.C1110m;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C3353e;
import kotlin.jvm.internal.C3357i;
import p046g0.C2623c;
import p046g0.C2629e;

public final class Recreator implements C1107k {

    /* renamed from: b */
    public static final C1185a f3179b = new C1185a((C3353e) null);

    /* renamed from: a */
    private final C2629e f3180a;

    /* renamed from: androidx.savedstate.Recreator$a */
    public static final class C1185a {
        private C1185a() {
        }

        public /* synthetic */ C1185a(C3353e eVar) {
            this();
        }
    }

    /* renamed from: androidx.savedstate.Recreator$b */
    public static final class C1186b implements C2623c.C2626c {

        /* renamed from: a */
        private final Set<String> f3181a = new LinkedHashSet();

        public C1186b(C2623c cVar) {
            C3357i.m24508e(cVar, "registry");
            cVar.mo12513h("androidx.savedstate.Restarter", this);
        }

        /* renamed from: a */
        public Bundle mo534a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.f3181a));
            return bundle;
        }

        /* renamed from: b */
        public final void mo4000b(String str) {
            C3357i.m24508e(str, "className");
            this.f3181a.add(str);
        }
    }

    public Recreator(C2629e eVar) {
        C3357i.m24508e(eVar, "owner");
        this.f3180a = eVar;
    }

    /* renamed from: d */
    private final void m4775d(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(C2623c.C2624a.class);
            C3357i.m24507d(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                    C3357i.m24507d(newInstance, "{\n                constr…wInstance()\n            }");
                    ((C2623c.C2624a) newInstance).mo3781a(this.f3180a);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to instantiate " + str, e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Class " + str + " wasn't found", e3);
        }
    }

    /* renamed from: e */
    public void mo527e(C1110m mVar, C1099i.C1101b bVar) {
        C3357i.m24508e(mVar, "source");
        C3357i.m24508e(bVar, "event");
        if (bVar == C1099i.C1101b.ON_CREATE) {
            mVar.mo491a().mo3832c(this);
            Bundle b = this.f3180a.mo496i().mo12508b("androidx.savedstate.Restarter");
            if (b != null) {
                ArrayList<String> stringArrayList = b.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    for (String d : stringArrayList) {
                        m4775d(d);
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
