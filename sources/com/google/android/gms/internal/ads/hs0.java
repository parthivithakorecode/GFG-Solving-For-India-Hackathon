package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import p054h1.C2694t;

public final class hs0 implements t70<tq0> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5150a(Object obj, Map map) {
        tq0 tq0 = (tq0) obj;
        bv0 p = tq0.mo7139p();
        if (p == null) {
            try {
                bv0 bv0 = new bv0(tq0, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                tq0.mo7075C(bv0);
                p = bv0;
            } catch (NullPointerException e) {
                e = e;
                io0.m11129e("Unable to parse videoMeta message.", e);
                C2694t.m21607p().mo11034s(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e2) {
                e = e2;
                io0.m11129e("Unable to parse videoMeta message.", e);
                C2694t.m21607p().mo11034s(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat = Float.parseFloat((String) map.get("duration"));
        boolean equals = "1".equals(map.get("muted"));
        float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        int i = 0;
        if (parseInt >= 0) {
            if (parseInt <= 3) {
                i = parseInt;
            }
        }
        String str = (String) map.get("aspectRatio");
        float parseFloat3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (io0.m11134j(3)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 140);
            sb.append("Video Meta GMSG: currentTime : ");
            sb.append(parseFloat2);
            sb.append(" , duration : ");
            sb.append(parseFloat);
            sb.append(" , isMuted : ");
            sb.append(equals);
            sb.append(" , playbackState : ");
            sb.append(i);
            sb.append(" , aspectRatio : ");
            sb.append(str);
            io0.m11126b(sb.toString());
        }
        p.mo5959A5(parseFloat2, parseFloat, i, equals, parseFloat3);
    }
}
