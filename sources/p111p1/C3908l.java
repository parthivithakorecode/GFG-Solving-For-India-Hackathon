package p111p1;

import android.util.Pair;
import com.google.android.gms.internal.ads.C2199sw;
import com.google.android.gms.internal.ads.m10;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import p054h1.C2694t;

/* renamed from: p1.l */
public final class C3908l {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final int f22043a = ((Integer) C2199sw.m17001c().mo8579b(m10.f10591q5)).intValue();

    /* renamed from: b */
    private final long f22044b = ((Long) C2199sw.m17001c().mo8579b(m10.f10600r5)).longValue();

    /* renamed from: c */
    private final Map<String, Pair<Long, String>> f22045c = Collections.synchronizedMap(new C3889b(this));

    /* renamed from: e */
    private final void m26057e() {
        long a = C2694t.m21592a().mo12462a();
        try {
            Iterator<Map.Entry<String, Pair<Long, String>>> it = this.f22045c.entrySet().iterator();
            while (it.hasNext() && a - ((Long) ((Pair) it.next().getValue()).first).longValue() > this.f22044b) {
                it.remove();
            }
        } catch (ConcurrentModificationException e) {
            C2694t.m21607p().mo11034s(e, "QueryJsonMap.removeExpiredEntries");
        }
    }

    /* renamed from: b */
    public final synchronized String mo15370b(String str) {
        Pair pair = this.f22045c.get(str);
        if (pair == null) {
            return null;
        }
        String str2 = (String) pair.second;
        this.f22045c.remove(str);
        return str2;
    }

    /* renamed from: c */
    public final synchronized void mo15371c(String str, String str2) {
        this.f22045c.put(str, new Pair(Long.valueOf(C2694t.m21592a().mo12462a()), str2));
        m26057e();
    }

    /* renamed from: d */
    public final synchronized void mo15372d(String str) {
        this.f22045c.remove(str);
    }
}
