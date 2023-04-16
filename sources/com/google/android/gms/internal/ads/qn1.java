package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

final class qn1 implements a40 {

    /* renamed from: a */
    final /* synthetic */ mo1 f13241a;

    /* renamed from: b */
    final /* synthetic */ ViewGroup f13242b;

    qn1(mo1 mo1, ViewGroup viewGroup) {
        this.f13241a = mo1;
        this.f13242b = viewGroup;
    }

    /* renamed from: a */
    public final JSONObject mo5081a() {
        return this.f13241a.mo8709l();
    }

    /* renamed from: b */
    public final void mo5082b(MotionEvent motionEvent) {
        this.f13241a.onTouch((View) null, motionEvent);
    }

    /* renamed from: c */
    public final void mo5083c() {
        mo1 mo1 = this.f13241a;
        e73<String> e73 = mn1.f10962s;
        Map<String, WeakReference<View>> o = mo1.mo8713o();
        if (o != null) {
            int size = e73.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (o.get(e73.get(i)) == null) {
                    i = i2;
                } else {
                    this.f13241a.onClick(this.f13242b);
                    return;
                }
            }
        }
    }

    public final JSONObject zza() {
        return this.f13241a.mo8711n();
    }
}
