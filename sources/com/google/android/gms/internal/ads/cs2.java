package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p034e2.C2553j;
import p069j1.C3138a1;

public final class cs2 {

    /* renamed from: a */
    public final List<rr2> f5508a;

    /* renamed from: b */
    public final ur2 f5509b;

    /* renamed from: c */
    public final List<bs2> f5510c;

    cs2(JsonReader jsonReader) {
        List<rr2> emptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        ur2 ur2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("responses".equals(nextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(nextName2)) {
                        emptyList = new ArrayList<>();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            emptyList.add(new rr2(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (nextName2.equals("common")) {
                        ur2 = new ur2(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
            } else if (nextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String str = null;
                    JSONObject jSONObject = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        if ("name".equals(nextName3)) {
                            str = jsonReader.nextString();
                        } else if ("info".equals(nextName3)) {
                            jSONObject = C3138a1.m23826h(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (str != null) {
                        arrayList.add(new bs2(str, jSONObject));
                    }
                    jsonReader.endObject();
                }
            }
            jsonReader.endArray();
        }
        this.f5510c = arrayList;
        this.f5508a = emptyList;
        this.f5509b = ur2 == null ? new ur2(new JsonReader(new StringReader("{}"))) : ur2;
    }

    /* renamed from: a */
    public static cs2 m7548a(Reader reader) {
        try {
            cs2 cs2 = new cs2(new JsonReader(reader));
            C2553j.m21202a(reader);
            return cs2;
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e) {
            throw new vr2("unable to parse ServerResponse", e);
        } catch (Throwable th) {
            C2553j.m21202a(reader);
            throw th;
        }
    }
}
