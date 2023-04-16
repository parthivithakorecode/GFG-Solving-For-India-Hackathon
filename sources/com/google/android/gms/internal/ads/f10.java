package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

public final class f10 {

    /* renamed from: a */
    private final Collection<e10<?>> f6651a = new ArrayList();

    /* renamed from: b */
    private final Collection<e10<String>> f6652b = new ArrayList();

    /* renamed from: c */
    private final Collection<e10<String>> f6653c = new ArrayList();

    /* renamed from: a */
    public final List<String> mo7210a() {
        ArrayList arrayList = new ArrayList();
        for (e10<String> b : this.f6652b) {
            String str = (String) C2199sw.m17001c().mo8579b(b);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(n10.m13591a());
        return arrayList;
    }

    /* renamed from: b */
    public final List<String> mo7211b() {
        List<String> a = mo7210a();
        for (e10<String> b : this.f6653c) {
            String str = (String) C2199sw.m17001c().mo8579b(b);
            if (!TextUtils.isEmpty(str)) {
                a.add(str);
            }
        }
        a.addAll(n10.m13592b());
        return a;
    }

    /* renamed from: c */
    public final void mo7212c(e10<String> e10) {
        this.f6652b.add(e10);
    }

    /* renamed from: d */
    public final void mo7213d(e10 e10) {
        this.f6651a.add(e10);
    }

    /* renamed from: e */
    public final void mo7214e(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (e10 next : this.f6651a) {
            if (next.mo6771e() == 1) {
                next.mo5058d(editor, next.mo5055a(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            io0.m11128d("Flag Json is null.");
        }
    }
}
