package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

public final class uv0 extends MutableContextWrapper {

    /* renamed from: a */
    private Activity f15777a;

    /* renamed from: b */
    private Context f15778b;

    /* renamed from: c */
    private Context f15779c;

    public uv0(Context context) {
        super(context);
        setBaseContext(context);
    }

    /* renamed from: a */
    public final Activity mo11309a() {
        return this.f15777a;
    }

    /* renamed from: b */
    public final Context mo11310b() {
        return this.f15779c;
    }

    public final Object getSystemService(String str) {
        return this.f15779c.getSystemService(str);
    }

    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f15778b = applicationContext;
        this.f15777a = context instanceof Activity ? (Activity) context : null;
        this.f15779c = context;
        super.setBaseContext(applicationContext);
    }

    public final void startActivity(Intent intent) {
        Activity activity = this.f15777a;
        if (activity != null) {
            activity.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        this.f15778b.startActivity(intent);
    }
}
