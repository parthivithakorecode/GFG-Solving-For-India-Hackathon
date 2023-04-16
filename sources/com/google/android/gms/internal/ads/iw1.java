package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
import p034e2.C2547d;

public final class iw1 {

    /* renamed from: a */
    private final C2547d f8821a;

    public iw1(C2547d dVar) {
        this.f8821a = dVar;
    }

    /* renamed from: a */
    public final void mo8285a(List<Object> list, String str, String str2, Object... objArr) {
        if (d30.f5631a.mo9928e().booleanValue()) {
            long a = this.f8821a.mo12462a();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(a);
                jsonWriter.name("source").value(str);
                jsonWriter.name("event").value(str2);
                jsonWriter.name("components").beginArray();
                for (Object obj : list) {
                    jsonWriter.value(obj.toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    Object obj2 = objArr[i];
                    jsonWriter.value(obj2 != null ? obj2.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e) {
                io0.m11129e("unable to log", e);
            }
            String valueOf = String.valueOf(stringWriter.toString());
            io0.m11130f(valueOf.length() != 0 ? "AD-DBG ".concat(valueOf) : new String("AD-DBG "));
        }
    }
}
