package com.google.android.gms.internal.ads;

import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

public final class ql2 implements kv3<lj2<JSONObject>> {
    /* renamed from: b */
    public static lj2<JSONObject> m15697b(hn0 hn0, jn0 jn0, Object obj, ek2 ek2, dl2 dl2, ev3<yj2> ev3, ev3<hk2> ev32, ev3<nk2> ev33, ev3<rk2> ev34, ev3<zk2> ev35, ev3<gl2> ev36, ev3<yl2> ev37, ev3<tl2> ev38, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        HashSet hashSet = new HashSet();
        hashSet.add((vk2) obj);
        hashSet.add(ek2);
        hashSet.add(dl2);
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10500g4)).booleanValue()) {
            hashSet.add(ev3.mo7166a());
        }
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10509h4)).booleanValue()) {
            hashSet.add(ev32.mo7166a());
        }
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10518i4)).booleanValue()) {
            hashSet.add(ev33.mo7166a());
        }
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10527j4)).booleanValue()) {
            hashSet.add(ev34.mo7166a());
        }
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10563n4)).booleanValue()) {
            hashSet.add(ev36.mo7166a());
        }
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10572o4)).booleanValue()) {
            hashSet.add(ev37.mo7166a());
        }
        return new lj2<>(executor, hashSet);
    }
}
