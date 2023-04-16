package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

public final class ld2 implements ij2<md2> {

    /* renamed from: a */
    private final dc3 f10008a;

    /* renamed from: b */
    private final Context f10009b;

    /* renamed from: c */
    private final ks2 f10010c;

    /* renamed from: d */
    private final View f10011d;

    public ld2(dc3 dc3, Context context, ks2 ks2, ViewGroup viewGroup) {
        this.f10008a = dc3;
        this.f10009b = context;
        this.f10010c = ks2;
        this.f10011d = viewGroup;
    }

    /* renamed from: a */
    public final cc3<md2> mo5813a() {
        return this.f10008a.mo6445C(new kd2(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ md2 mo8929b() {
        Context context = this.f10009b;
        C2087pv pvVar = this.f10010c.f9640e;
        ArrayList arrayList = new ArrayList();
        View view = this.f10011d;
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                break;
            }
            int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", indexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new md2(context, pvVar, arrayList);
    }
}
