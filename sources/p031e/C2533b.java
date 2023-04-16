package p031e;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.C3353e;

/* renamed from: e.b */
public final class C2533b extends C2532a<String[], Map<String, Boolean>> {

    /* renamed from: a */
    public static final C2534a f18640a = new C2534a((C3353e) null);

    /* renamed from: e.b$a */
    public static final class C2534a {
        private C2534a() {
        }

        public /* synthetic */ C2534a(C3353e eVar) {
            this();
        }
    }

    /* renamed from: b */
    public Map<String, Boolean> mo3639a(int i, Intent intent) {
        if (i != -1) {
            return C3602z.m25080d();
        }
        if (intent == null) {
            return C3602z.m25080d();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return C3602z.m25080d();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        int length = intArrayExtra.length;
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(Boolean.valueOf(intArrayExtra[i2] == 0));
        }
        return C3602z.m25083g(C3593q.m25038B(C3579e.m24995g(stringArrayExtra), arrayList));
    }
}
