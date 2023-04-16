package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.lv */
public final class C1939lv {

    /* renamed from: a */
    private Bundle f10175a = new Bundle();

    /* renamed from: b */
    private List<String> f10176b = new ArrayList();

    /* renamed from: c */
    private boolean f10177c = false;

    /* renamed from: d */
    private int f10178d = -1;

    /* renamed from: e */
    private final Bundle f10179e = new Bundle();

    /* renamed from: f */
    private final Bundle f10180f = new Bundle();

    /* renamed from: g */
    private final List<String> f10181g = new ArrayList();

    /* renamed from: h */
    private int f10182h = -1;

    /* renamed from: i */
    private String f10183i = null;

    /* renamed from: j */
    private final List<String> f10184j = new ArrayList();

    /* renamed from: k */
    private int f10185k = 60000;

    /* renamed from: a */
    public final C1902kv mo9078a() {
        return new C1902kv(8, -1, this.f10175a, -1, this.f10176b, this.f10177c, this.f10178d, false, (String) null, (p00) null, (Location) null, (String) null, this.f10179e, this.f10180f, this.f10181g, (String) null, (String) null, false, (C1531av) null, this.f10182h, this.f10183i, this.f10184j, this.f10185k, (String) null);
    }

    /* renamed from: b */
    public final C1939lv mo9079b(Bundle bundle) {
        this.f10175a = bundle;
        return this;
    }

    /* renamed from: c */
    public final C1939lv mo9080c(int i) {
        this.f10185k = i;
        return this;
    }

    /* renamed from: d */
    public final C1939lv mo9081d(boolean z) {
        this.f10177c = z;
        return this;
    }

    /* renamed from: e */
    public final C1939lv mo9082e(List<String> list) {
        this.f10176b = list;
        return this;
    }

    /* renamed from: f */
    public final C1939lv mo9083f(String str) {
        this.f10183i = str;
        return this;
    }

    /* renamed from: g */
    public final C1939lv mo9084g(int i) {
        this.f10178d = i;
        return this;
    }

    /* renamed from: h */
    public final C1939lv mo9085h(int i) {
        this.f10182h = i;
        return this;
    }
}
