package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Set;

public final class og2 implements ij2<pg2> {

    /* renamed from: a */
    private final dc3 f12038a;

    /* renamed from: b */
    private final ViewGroup f12039b;

    /* renamed from: c */
    private final Context f12040c;

    /* renamed from: d */
    private final Set<String> f12041d;

    public og2(dc3 dc3, ViewGroup viewGroup, Context context, Set<String> set) {
        this.f12038a = dc3;
        this.f12041d = set;
        this.f12039b = viewGroup;
        this.f12040c = context;
    }

    /* renamed from: a */
    public final cc3<pg2> mo5813a() {
        return this.f12038a.mo6445C(new ng2(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ pg2 mo9783b() {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10581p4)).booleanValue() && this.f12039b != null && this.f12041d.contains("banner")) {
            return new pg2(Boolean.valueOf(this.f12039b.isHardwareAccelerated()));
        }
        Boolean bool = null;
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10590q4)).booleanValue() && this.f12041d.contains("native")) {
            Context context = this.f12040c;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                    try {
                        boolean z = false;
                        if ((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0) {
                            z = true;
                        }
                        bool = Boolean.valueOf(z);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    bool = Boolean.TRUE;
                }
                return new pg2(bool);
            }
        }
        return new pg2((Boolean) null);
    }
}
