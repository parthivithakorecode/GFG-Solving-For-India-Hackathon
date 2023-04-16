package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p054h1.C2694t;

public final class us0 implements t70<tq0> {
    /* renamed from: b */
    private static final Integer m18033b(Map<String, String> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = map.get(str);
            StringBuilder sb = new StringBuilder(str.length() + 39 + String.valueOf(str2).length());
            sb.append("Precache invalid numeric parameter '");
            sb.append(str);
            sb.append("': ");
            sb.append(str2);
            io0.m11131g(sb.toString());
            return null;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5150a(Object obj, Map map) {
        ts0 ts0;
        ks0 ks0;
        Map map2 = map;
        tq0 tq0 = (tq0) obj;
        if (io0.m11134j(3)) {
            JSONObject jSONObject = new JSONObject(map2);
            jSONObject.remove("google.afma.Notify_dt");
            io0.m11126b("Precache GMSG: ".concat(jSONObject.toString()));
        }
        ls0 z = C2694t.m21617z();
        if (!map2.containsKey("abort")) {
            String str = (String) map2.get("src");
            Integer b = m18033b(map2, "periodicReportIntervalMs");
            Integer b2 = m18033b(map2, "exoPlayerRenderingIntervalMs");
            Integer b3 = m18033b(map2, "exoPlayerIdleIntervalMs");
            sq0 sq0 = new sq0((String) map2.get("flags"));
            boolean z2 = sq0.f14550n;
            if (str != null) {
                String[] strArr = {str};
                String str2 = (String) map2.get("demuxed");
                if (str2 != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(str2);
                        String[] strArr2 = new String[jSONArray.length()];
                        for (int i = 0; i < jSONArray.length(); i++) {
                            strArr2[i] = jSONArray.getString(i);
                        }
                        strArr = strArr2;
                    } catch (JSONException unused) {
                        io0.m11131g(str2.length() != 0 ? "Malformed demuxed URL list for precache: ".concat(str2) : new String("Malformed demuxed URL list for precache: "));
                        strArr = null;
                    }
                }
                if (strArr == null) {
                    strArr = new String[]{str};
                }
                if (z2) {
                    Iterator<ks0> it = z.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            ks0 = null;
                            break;
                        }
                        ks0 next = it.next();
                        if (next.f9632c == tq0 && str.equals(next.mo8783e())) {
                            ks0 = next;
                            break;
                        }
                    }
                } else {
                    ks0 = z.mo9009h(tq0);
                }
                if (ks0 != null) {
                    io0.m11131g("Precache task is already running.");
                    return;
                } else if (tq0.mo7135o() == null) {
                    io0.m11131g("Precache requires a dependency provider.");
                    return;
                } else {
                    Integer b4 = m18033b(map2, "player");
                    if (b4 == null) {
                        b4 = 0;
                    }
                    if (b != null) {
                        tq0.mo11064d0(b.intValue());
                    }
                    if (b2 != null) {
                        tq0.mo11059P0(b2.intValue());
                    }
                    if (b3 != null) {
                        tq0.mo11060R(b3.intValue());
                    }
                    int intValue = b4.intValue();
                    es0 es0 = tq0.mo7135o().f19106c;
                    if (intValue > 0) {
                        int V = jq0.m11779V();
                        ts0 = V < sq0.f14544h ? new ct0(tq0, sq0) : V < sq0.f14538b ? new zs0(tq0, sq0) : new xs0(tq0);
                    } else {
                        ts0 = new ws0(tq0);
                    }
                    new ks0(tq0, ts0, str, strArr).mo8781b();
                }
            } else {
                ks0 h = z.mo9009h(tq0);
                if (h != null) {
                    ts0 = h.f9633d;
                } else {
                    io0.m11131g("Precache must specify a source.");
                    return;
                }
            }
            Integer b5 = m18033b(map2, "minBufferMs");
            if (b5 != null) {
                ts0.mo6292r(b5.intValue());
            }
            Integer b6 = m18033b(map2, "maxBufferMs");
            if (b6 != null) {
                ts0.mo6291q(b6.intValue());
            }
            Integer b7 = m18033b(map2, "bufferForPlaybackMs");
            if (b7 != null) {
                ts0.mo6289n(b7.intValue());
            }
            Integer b8 = m18033b(map2, "bufferForPlaybackAfterRebufferMs");
            if (b8 != null) {
                ts0.mo6290o(b8.intValue());
            }
        } else if (!z.mo9013k(tq0)) {
            io0.m11131g("Precache abort but no precache task running.");
        }
    }
}
