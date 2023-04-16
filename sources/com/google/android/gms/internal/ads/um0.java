package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class um0 {

    /* renamed from: a */
    private final Map<String, tm0> f15633a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final List<sm0> f15634b = new ArrayList();

    /* renamed from: c */
    private final Context f15635c;

    /* renamed from: d */
    private final rl0 f15636d;

    um0(Context context, rl0 rl0) {
        this.f15635c = context;
        this.f15636d = rl0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo11246b(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.f15636d.mo10529e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo11247c(String str) {
        if (!this.f15633a.containsKey(str)) {
            SharedPreferences defaultSharedPreferences = "__default__".equals(str) ? PreferenceManager.getDefaultSharedPreferences(this.f15635c) : this.f15635c.getSharedPreferences(str, 0);
            tm0 tm0 = new tm0(this, str);
            this.f15633a.put(str, tm0);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(tm0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo11248d(sm0 sm0) {
        this.f15634b.add(sm0);
    }
}
