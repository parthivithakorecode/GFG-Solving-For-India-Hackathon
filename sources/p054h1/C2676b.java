package p054h1;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.ji0;
import com.google.android.gms.internal.ads.ml0;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import p069j1.C3163g2;

@ParametersAreNonnullByDefault
/* renamed from: h1.b */
public final class C2676b {

    /* renamed from: a */
    private final Context f19110a;

    /* renamed from: b */
    private boolean f19111b;

    /* renamed from: c */
    private final ml0 f19112c;

    /* renamed from: d */
    private final ji0 f19113d = new ji0(false, Collections.emptyList());

    public C2676b(Context context, ml0 ml0, ji0 ji0) {
        this.f19110a = context;
        this.f19112c = ml0;
    }

    /* renamed from: d */
    private final boolean m21500d() {
        ml0 ml0 = this.f19112c;
        return (ml0 != null && ml0.zza().f9178k) || this.f19113d.f9139f;
    }

    /* renamed from: a */
    public final void mo12666a() {
        this.f19111b = true;
    }

    /* renamed from: b */
    public final void mo12667b(String str) {
        List<String> list;
        if (m21500d()) {
            if (str == null) {
                str = "";
            }
            ml0 ml0 = this.f19112c;
            if (ml0 != null) {
                ml0.mo7368a(str, (Map<String, String>) null, 3);
                return;
            }
            ji0 ji0 = this.f19113d;
            if (ji0.f9139f && (list = ji0.f9140g) != null) {
                for (String next : list) {
                    if (!TextUtils.isEmpty(next)) {
                        String replace = next.replace("{NAVIGATION_URL}", Uri.encode(str));
                        C2694t.m21608q();
                        C3163g2.m23939o(this.f19110a, "", replace);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final boolean mo12668c() {
        return !m21500d() || this.f19111b;
    }
}
