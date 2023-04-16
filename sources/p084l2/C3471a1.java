package p084l2;

import android.util.JsonReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: l2.a1 */
public final class C3471a1 {

    /* renamed from: a */
    public int f21019a = C3558w0.f21241i;

    /* renamed from: b */
    public String f21020b;

    /* renamed from: c */
    public String f21021c;

    /* renamed from: d */
    public String f21022d;

    /* renamed from: e */
    public List<String> f21023e = Collections.emptyList();

    /* renamed from: f */
    public List<C3567z0> f21024f = Collections.emptyList();

    /* renamed from: a */
    public static C3471a1 m24857a(JsonReader jsonReader) {
        C3471a1 a1Var = new C3471a1();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -2001388947:
                    if (nextName.equals("consent_signal")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1938755376:
                    if (nextName.equals("error_message")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1851537225:
                    if (nextName.equals("consent_form_base_url")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1161803523:
                    if (nextName.equals("actions")) {
                        c = 3;
                        break;
                    }
                    break;
                case -986806987:
                    if (nextName.equals("request_info_keys")) {
                        c = 4;
                        break;
                    }
                    break;
                case -790907624:
                    if (nextName.equals("consent_form_payload")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a1Var.f21019a = C3558w0.m24962d(jsonReader);
                    continue;
                case 1:
                    a1Var.f21022d = jsonReader.nextString();
                    continue;
                case 2:
                    a1Var.f21021c = jsonReader.nextString();
                    continue;
                case 3:
                    a1Var.f21024f = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        C3567z0 z0Var = new C3567z0();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            nextName2.hashCode();
                            if (nextName2.equals("args_json")) {
                                z0Var.f21263b = jsonReader.nextString();
                            } else if (!nextName2.equals("action_type")) {
                                jsonReader.skipValue();
                            } else {
                                z0Var.f21262a = C3558w0.m24959a(jsonReader);
                            }
                        }
                        jsonReader.endObject();
                        a1Var.f21024f.add(z0Var);
                    }
                    break;
                case 4:
                    a1Var.f21023e = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        a1Var.f21023e.add(jsonReader.nextString());
                    }
                    break;
                case 5:
                    a1Var.f21020b = jsonReader.nextString();
                    continue;
                default:
                    jsonReader.skipValue();
                    continue;
            }
            jsonReader.endArray();
        }
        jsonReader.endObject();
        return a1Var;
    }
}
