package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import java.lang.ref.WeakReference;
import p095n.C3740b;
import p095n.C3744d;

public final class aw3 extends C3744d {

    /* renamed from: f */
    private final WeakReference<l20> f4377f;

    public aw3(l20 l20, byte[] bArr) {
        this.f4377f = new WeakReference<>(l20);
    }

    /* renamed from: a */
    public final void mo5541a(ComponentName componentName, C3740b bVar) {
        l20 l20 = (l20) this.f4377f.get();
        if (l20 != null) {
            l20.mo8851c(bVar);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        l20 l20 = (l20) this.f4377f.get();
        if (l20 != null) {
            l20.mo8852d();
        }
    }
}
