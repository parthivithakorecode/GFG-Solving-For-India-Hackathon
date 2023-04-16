package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.util.ArrayList;
import java.util.List;

public final class sr2 {

    /* renamed from: a */
    public final int f14564a;

    /* renamed from: b */
    public final int f14565b;

    /* renamed from: c */
    public final boolean f14566c;

    public sr2(int i, int i2, boolean z) {
        this.f14564a = i;
        this.f14565b = i2;
        this.f14566c = z;
    }

    /* renamed from: a */
    static List<sr2> m16951a(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int i = 0;
            int i2 = 0;
            boolean z = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if ("width".equals(nextName)) {
                    i = jsonReader.nextInt();
                } else if ("height".equals(nextName)) {
                    i2 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(nextName)) {
                    z = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new sr2(i, i2, z));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
