package com.google.android.gms.internal.ads;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import org.json.JSONObject;

public final class mz2 implements jz2 {

    /* renamed from: a */
    private final jz2 f11207a;

    public mz2(jz2 jz2) {
        this.f11207a = jz2;
    }

    /* renamed from: b */
    public final JSONObject mo8573b(View view) {
        throw null;
    }

    /* renamed from: c */
    public final void mo8574c(View view, JSONObject jSONObject, iz2 iz2, boolean z) {
        ArrayList arrayList = new ArrayList();
        az2 a = az2.m6457a();
        if (a != null) {
            Collection<py2> b = a.mo5586b();
            int size = b.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            for (py2 f : b) {
                View f2 = f.mo10202f();
                if (f2 != null && ((Build.VERSION.SDK_INT < 19 || f2.isAttachedToWindow()) && f2.isShown())) {
                    View view2 = f2;
                    while (true) {
                        if (view2 != null) {
                            if (view2.getAlpha() == 0.0f) {
                                break;
                            }
                            ViewParent parent = view2.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        } else {
                            View rootView = f2.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float a2 = vz2.m18790a(rootView);
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i = size2 - 1;
                                    if (vz2.m18790a((View) arrayList.get(i)) <= a2) {
                                        break;
                                    }
                                    size2 = i;
                                }
                                arrayList.add(size2, rootView);
                            }
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            iz2.mo6767a((View) arrayList.get(i2), this.f11207a, jSONObject);
        }
    }
}
