package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;
import p054h1.C2694t;
import p069j1.C3202r1;

@ParametersAreNonnullByDefault
public final class i80 implements t70<Object> {

    /* renamed from: a */
    private final Object f8565a = new Object();
    @GuardedBy("lock")

    /* renamed from: b */
    private final Map<String, h80> f8566b = new HashMap();

    /* renamed from: a */
    public final void mo5150a(Object obj, Map<String, String> map) {
        String str;
        String str2 = map.get("id");
        String str3 = map.get("fail");
        String str4 = map.get("fail_reason");
        String str5 = map.get("fail_stack");
        String str6 = map.get("result");
        if (true == TextUtils.isEmpty(str5)) {
            str4 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str5)) {
            str = "";
        } else {
            String valueOf = String.valueOf(str5);
            str = valueOf.length() != 0 ? "\n".concat(valueOf) : new String("\n");
        }
        synchronized (this.f8565a) {
            h80 remove = this.f8566b.remove(str2);
            if (remove == null) {
                String valueOf2 = String.valueOf(str2);
                io0.m11131g(valueOf2.length() != 0 ? "Received result for unexpected method invocation: ".concat(valueOf2) : new String("Received result for unexpected method invocation: "));
            } else if (!TextUtils.isEmpty(str3)) {
                String valueOf3 = String.valueOf(str4);
                String valueOf4 = String.valueOf(str);
                remove.mo7287b(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3));
            } else if (str6 == null) {
                remove.mo7286a((JSONObject) null);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str6);
                    if (C3202r1.m24017m()) {
                        String valueOf5 = String.valueOf(jSONObject.toString(2));
                        C3202r1.m24015k(valueOf5.length() != 0 ? "Result GMSG: ".concat(valueOf5) : new String("Result GMSG: "));
                    }
                    remove.mo7286a(jSONObject);
                } catch (JSONException e) {
                    remove.mo7287b(e.getMessage());
                }
            }
        }
    }

    /* renamed from: b */
    public final <EngineT extends qa0> cc3<JSONObject> mo8114b(EngineT enginet, String str, JSONObject jSONObject) {
        bp0 bp0 = new bp0();
        C2694t.m21608q();
        String uuid = UUID.randomUUID().toString();
        mo8115c(uuid, new g80(this, bp0));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", uuid);
            jSONObject2.put("args", jSONObject);
            enginet.mo9998c1(str, jSONObject2);
        } catch (Exception e) {
            bp0.mo5908f(e);
        }
        return bp0;
    }

    /* renamed from: c */
    public final void mo8115c(String str, h80 h80) {
        synchronized (this.f8565a) {
            this.f8566b.put(str, h80);
        }
    }
}
