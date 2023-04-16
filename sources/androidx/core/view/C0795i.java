package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.core.view.i */
public class C0795i {

    /* renamed from: a */
    private final Runnable f2214a;

    /* renamed from: b */
    private final CopyOnWriteArrayList<C0819k> f2215b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    private final Map<C0819k, Object> f2216c = new HashMap();

    public C0795i(Runnable runnable) {
        this.f2214a = runnable;
    }

    /* renamed from: a */
    public void mo2866a(Menu menu, MenuInflater menuInflater) {
        Iterator<C0819k> it = this.f2215b.iterator();
        while (it.hasNext()) {
            it.next().mo2935c(menu, menuInflater);
        }
    }

    /* renamed from: b */
    public void mo2867b(Menu menu) {
        Iterator<C0819k> it = this.f2215b.iterator();
        while (it.hasNext()) {
            it.next().mo2934b(menu);
        }
    }

    /* renamed from: c */
    public boolean mo2868c(MenuItem menuItem) {
        Iterator<C0819k> it = this.f2215b.iterator();
        while (it.hasNext()) {
            if (it.next().mo2933a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public void mo2869d(Menu menu) {
        Iterator<C0819k> it = this.f2215b.iterator();
        while (it.hasNext()) {
            it.next().mo2936d(menu);
        }
    }
}
