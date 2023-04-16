package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;
import p041f2.C2606c;
import p160x1.C4288j;

@ParametersAreNonnullByDefault
public final class k10 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    private final Object f9334a = new Object();

    /* renamed from: b */
    private final ConditionVariable f9335b = new ConditionVariable();

    /* renamed from: c */
    private volatile boolean f9336c = false;

    /* renamed from: d */
    volatile boolean f9337d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public SharedPreferences f9338e = null;

    /* renamed from: f */
    private Bundle f9339f = new Bundle();

    /* renamed from: g */
    private Context f9340g;

    /* renamed from: h */
    private JSONObject f9341h = new JSONObject();

    /* renamed from: f */
    private final void m11957f() {
        if (this.f9338e != null) {
            try {
                this.f9341h = new JSONObject((String) o10.m14207a(new h10(this)));
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: b */
    public final <T> T mo8579b(e10<T> e10) {
        if (!this.f9335b.block(5000)) {
            synchronized (this.f9334a) {
                if (!this.f9337d) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.f9336c || this.f9338e == null) {
            synchronized (this.f9334a) {
                if (this.f9336c) {
                    if (this.f9338e == null) {
                    }
                }
                T l = e10.mo6772l();
                return l;
            }
        }
        if (e10.mo6771e() != 2) {
            return (e10.mo6771e() != 1 || !this.f9341h.has(e10.mo6773m())) ? o10.m14207a(new i10(this, e10)) : e10.mo5055a(this.f9341h);
        }
        Bundle bundle = this.f9339f;
        return bundle == null ? e10.mo6772l() : e10.mo5056b(bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Object mo8580c(e10 e10) {
        return e10.mo5057c(this.f9338e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ String mo8581d() {
        return this.f9338e.getString("flag_configuration", "{}");
    }

    /* renamed from: e */
    public final void mo8582e(Context context) {
        if (!this.f9336c) {
            synchronized (this.f9334a) {
                if (!this.f9336c) {
                    if (!this.f9337d) {
                        this.f9337d = true;
                    }
                    Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
                    this.f9340g = applicationContext;
                    try {
                        this.f9339f = C2606c.m21299a(applicationContext).mo12493c(this.f9340g.getPackageName(), 128).metaData;
                    } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                    }
                    try {
                        Context c = C4288j.m26857c(context);
                        if (!(c == null && (c = context.getApplicationContext()) == null)) {
                            context = c;
                        }
                        if (context != null) {
                            C2199sw.m17000b();
                            SharedPreferences a = g10.m9497a(context);
                            this.f9338e = a;
                            if (a != null) {
                                a.registerOnSharedPreferenceChangeListener(this);
                            }
                            s30.m16608c(new j10(this));
                            m11957f();
                            this.f9336c = true;
                            this.f9337d = false;
                            this.f9335b.open();
                        }
                    } finally {
                        this.f9337d = false;
                        this.f9335b.open();
                    }
                }
            }
        }
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            m11957f();
        }
    }
}
