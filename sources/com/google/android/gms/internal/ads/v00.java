package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import p003a2.C0092o;
import p041f2.C2606c;
import p069j1.C3170i1;

public final class v00 {

    /* renamed from: a */
    private final Context f15842a;

    public v00(Context context) {
        C0092o.m314j(context, "Context can not be null");
        this.f15842a = context;
    }

    /* renamed from: a */
    public final boolean mo11357a(Intent intent) {
        C0092o.m314j(intent, "Intent can not be null");
        return !this.f15842a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    @TargetApi(14)
    /* renamed from: b */
    public final boolean mo11358b() {
        return mo11357a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    /* renamed from: c */
    public final boolean mo11359c() {
        return ((Boolean) C3170i1.m23966a(this.f15842a, new u00())).booleanValue() && C2606c.m21299a(this.f15842a).mo12491a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }
}
