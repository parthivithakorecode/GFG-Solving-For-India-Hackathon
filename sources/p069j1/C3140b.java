package p069j1;

import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.TelephonyManager;
import p054h1.C2694t;

@TargetApi(26)
/* renamed from: j1.b */
public class C3140b extends C3187m2 {
    /* renamed from: p */
    public final int mo13972p(Context context, TelephonyManager telephonyManager) {
        C2694t.m21608q();
        return (!C3163g2.m23927f(context, "android.permission.ACCESS_NETWORK_STATE") || !telephonyManager.isDataEnabled()) ? 1 : 2;
    }
}
