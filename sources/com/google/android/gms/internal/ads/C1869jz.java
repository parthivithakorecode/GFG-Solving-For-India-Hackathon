package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p118q1.C3940a;

/* renamed from: com.google.android.gms.internal.ads.jz */
public final class C1869jz {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final HashSet<String> f9301a = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Bundle f9302b = new Bundle();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final HashMap<Class<Object>, Object> f9303c = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final HashSet<String> f9304d = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Bundle f9305e = new Bundle();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final HashSet<String> f9306f = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Date f9307g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f9308h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final List<String> f9309i = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f9310j = -1;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Location f9311k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public String f9312l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public String f9313m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f9314n = -1;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f9315o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C3940a f9316p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public String f9317q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public int f9318r = 60000;

    /* renamed from: C */
    public final void mo8555C(String str, String str2) {
        this.f9305e.putString(str, str2);
    }

    /* renamed from: D */
    public final void mo8556D(String str) {
        this.f9301a.add(str);
    }

    /* renamed from: E */
    public final void mo8557E(Class<Object> cls, Bundle bundle) {
        this.f9302b.putBundle(cls.getName(), bundle);
    }

    /* renamed from: F */
    public final void mo8558F(String str) {
        this.f9304d.add(str);
    }

    /* renamed from: G */
    public final void mo8559G(String str) {
        this.f9304d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    @Deprecated
    /* renamed from: a */
    public final void mo8560a(Date date) {
        this.f9307g = date;
    }

    /* renamed from: b */
    public final void mo8561b(String str) {
        this.f9308h = str;
    }

    @Deprecated
    /* renamed from: c */
    public final void mo8562c(int i) {
        this.f9310j = i;
    }

    /* renamed from: d */
    public final void mo8563d(int i) {
        this.f9318r = i;
    }

    @Deprecated
    /* renamed from: e */
    public final void mo8564e(boolean z) {
        this.f9315o = z;
    }

    /* renamed from: f */
    public final void mo8565f(Location location) {
        this.f9311k = location;
    }

    /* renamed from: g */
    public final void mo8566g(List<String> list) {
        this.f9309i.clear();
        for (String next : list) {
            if (TextUtils.isEmpty(next)) {
                io0.m11131g("neighboring content URL should not be null or empty");
            } else {
                this.f9309i.add(next);
            }
        }
    }

    /* renamed from: h */
    public final void mo8567h(String str) {
        this.f9312l = str;
    }

    /* renamed from: i */
    public final void mo8568i(String str) {
        this.f9313m = str;
    }

    @Deprecated
    /* renamed from: j */
    public final void mo8569j(boolean z) {
        this.f9314n = z ? 1 : 0;
    }
}
