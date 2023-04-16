package com.google.android.gms.internal.ads;

import android.util.JsonWriter;

public final /* synthetic */ class do0 implements go0 {

    /* renamed from: a */
    public final /* synthetic */ String f5848a;

    public /* synthetic */ do0(String str) {
        this.f5848a = str;
    }

    /* renamed from: a */
    public final void mo6237a(JsonWriter jsonWriter) {
        String str = this.f5848a;
        int i = ho0.f8367g;
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }
}
