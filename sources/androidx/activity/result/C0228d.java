package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.C1099i;
import androidx.lifecycle.C1107k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import p031e.C2532a;

/* renamed from: androidx.activity.result.d */
public abstract class C0228d {

    /* renamed from: a */
    private Random f426a = new Random();

    /* renamed from: b */
    private final Map<Integer, String> f427b = new HashMap();

    /* renamed from: c */
    final Map<String, Integer> f428c = new HashMap();

    /* renamed from: d */
    private final Map<String, C0231c> f429d = new HashMap();

    /* renamed from: e */
    ArrayList<String> f430e = new ArrayList<>();

    /* renamed from: f */
    final transient Map<String, C0230b<?>> f431f = new HashMap();

    /* renamed from: g */
    final Map<String, Object> f432g = new HashMap();

    /* renamed from: h */
    final Bundle f433h = new Bundle();

    /* renamed from: androidx.activity.result.d$a */
    class C0229a extends C0227c<I> {

        /* renamed from: a */
        final /* synthetic */ String f434a;

        /* renamed from: b */
        final /* synthetic */ C2532a f435b;

        C0229a(String str, C2532a aVar) {
            this.f434a = str;
            this.f435b = aVar;
        }

        /* renamed from: a */
        public void mo557a() {
            C0228d.this.mo562i(this.f434a);
        }
    }

    /* renamed from: androidx.activity.result.d$b */
    private static class C0230b<O> {

        /* renamed from: a */
        final C0226b<O> f437a;

        /* renamed from: b */
        final C2532a<?, O> f438b;

        C0230b(C0226b<O> bVar, C2532a<?, O> aVar) {
            this.f437a = bVar;
            this.f438b = aVar;
        }
    }

    /* renamed from: androidx.activity.result.d$c */
    private static class C0231c {

        /* renamed from: a */
        final C1099i f439a;

        /* renamed from: b */
        private final ArrayList<C1107k> f440b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo563a() {
            Iterator<C1107k> it = this.f440b.iterator();
            while (it.hasNext()) {
                this.f439a.mo3832c(it.next());
            }
            this.f440b.clear();
        }
    }

    /* renamed from: a */
    private void m702a(int i, String str) {
        this.f427b.put(Integer.valueOf(i), str);
        this.f428c.put(str, Integer.valueOf(i));
    }

    /* renamed from: c */
    private <O> void m703c(String str, int i, Intent intent, C0230b<O> bVar) {
        if (bVar == null || bVar.f437a == null || !this.f430e.contains(str)) {
            this.f432g.remove(str);
            this.f433h.putParcelable(str, new C0224a(i, intent));
            return;
        }
        bVar.f437a.mo556a(bVar.f438b.mo3639a(i, intent));
        this.f430e.remove(str);
    }

    /* renamed from: d */
    private int m704d() {
        int nextInt = this.f426a.nextInt(2147418112);
        while (true) {
            int i = nextInt + 65536;
            if (!this.f427b.containsKey(Integer.valueOf(i))) {
                return i;
            }
            nextInt = this.f426a.nextInt(2147418112);
        }
    }

    /* renamed from: h */
    private void m705h(String str) {
        if (this.f428c.get(str) == null) {
            m702a(m704d(), str);
        }
    }

    /* renamed from: b */
    public final boolean mo558b(int i, int i2, Intent intent) {
        String str = this.f427b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        m703c(str, i2, intent, this.f431f.get(str));
        return true;
    }

    /* renamed from: e */
    public final void mo559e(Bundle bundle) {
        if (bundle != null) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                this.f430e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                this.f426a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                this.f433h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                for (int i = 0; i < stringArrayList.size(); i++) {
                    String str = stringArrayList.get(i);
                    if (this.f428c.containsKey(str)) {
                        Integer remove = this.f428c.remove(str);
                        if (!this.f433h.containsKey(str)) {
                            this.f427b.remove(remove);
                        }
                    }
                    m702a(integerArrayList.get(i).intValue(), stringArrayList.get(i));
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo560f(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(this.f428c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(this.f428c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(this.f430e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f433h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f426a);
    }

    /* renamed from: g */
    public final <I, O> C0227c<I> mo561g(String str, C2532a<I, O> aVar, C0226b<O> bVar) {
        m705h(str);
        this.f431f.put(str, new C0230b(bVar, aVar));
        if (this.f432g.containsKey(str)) {
            Object obj = this.f432g.get(str);
            this.f432g.remove(str);
            bVar.mo556a(obj);
        }
        C0224a aVar2 = (C0224a) this.f433h.getParcelable(str);
        if (aVar2 != null) {
            this.f433h.remove(str);
            bVar.mo556a(aVar.mo3639a(aVar2.mo548c(), aVar2.mo547b()));
        }
        return new C0229a(str, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo562i(String str) {
        Integer remove;
        if (!this.f430e.contains(str) && (remove = this.f428c.remove(str)) != null) {
            this.f427b.remove(remove);
        }
        this.f431f.remove(str);
        if (this.f432g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f432g.get(str));
            this.f432g.remove(str);
        }
        if (this.f433h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f433h.getParcelable(str));
            this.f433h.remove(str);
        }
        C0231c cVar = this.f429d.get(str);
        if (cVar != null) {
            cVar.mo563a();
            this.f429d.remove(str);
        }
    }
}
