package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import android.util.JsonToken;
import java.util.Collections;
import java.util.List;
import p069j1.C3138a1;

public final class ur2 {

    /* renamed from: a */
    public final List<String> f15728a;

    /* renamed from: b */
    public final String f15729b;

    /* renamed from: c */
    public final int f15730c;

    /* renamed from: d */
    public final String f15731d;

    /* renamed from: e */
    public final int f15732e;

    /* renamed from: f */
    public final long f15733f;

    /* renamed from: g */
    public final boolean f15734g;

    /* renamed from: h */
    public final String f15735h;

    /* renamed from: i */
    public final tr2 f15736i;

    ur2(JsonReader jsonReader) {
        List<String> emptyList = Collections.emptyList();
        jsonReader.beginObject();
        int i = 0;
        String str = "";
        long j = 0;
        tr2 tr2 = null;
        int i2 = 0;
        boolean z = false;
        String str2 = str;
        String str3 = str2;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("nofill_urls".equals(nextName)) {
                emptyList = C3138a1.m23822d(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str2 = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str3 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i2 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j = jsonReader.nextLong();
            } else {
                if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10466c6)).booleanValue() && "public_error".equals(nextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    tr2 = new tr2(jsonReader);
                } else if ("bidding_data".equals(nextName)) {
                    str = jsonReader.nextString();
                } else {
                    jsonReader.skipValue();
                }
            }
        }
        jsonReader.endObject();
        this.f15728a = emptyList;
        this.f15730c = i;
        this.f15729b = str2;
        this.f15731d = str3;
        this.f15732e = i2;
        this.f15733f = j;
        this.f15736i = tr2;
        this.f15734g = z;
        this.f15735h = str;
    }
}
