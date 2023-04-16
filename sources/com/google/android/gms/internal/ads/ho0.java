package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import p034e2.C2545b;
import p034e2.C2547d;
import p034e2.C2550g;

public final class ho0 {

    /* renamed from: b */
    private static final Object f8362b = new Object();

    /* renamed from: c */
    private static boolean f8363c = false;

    /* renamed from: d */
    private static boolean f8364d = false;

    /* renamed from: e */
    private static final C2547d f8365e = C2550g.m21187d();

    /* renamed from: f */
    private static final Set<String> f8366f = new HashSet(Arrays.asList(new String[0]));

    /* renamed from: g */
    public static final /* synthetic */ int f8367g = 0;

    /* renamed from: a */
    private final List<String> f8368a;

    public ho0(String str) {
        List<String> list;
        if (!m10681l()) {
            list = new ArrayList<>();
        } else {
            String[] strArr = new String[1];
            String valueOf = String.valueOf(UUID.randomUUID().toString());
            strArr[0] = valueOf.length() != 0 ? "network_request_".concat(valueOf) : new String("network_request_");
            list = Arrays.asList(strArr);
        }
        this.f8368a = list;
    }

    /* renamed from: a */
    static /* synthetic */ void m10676a(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        m10688s(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(C2545b.m21175a(bArr));
        }
        jsonWriter.endObject();
    }

    /* renamed from: b */
    static /* synthetic */ void m10677b(int i, Map map, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value((long) i);
        jsonWriter.endObject();
        m10688s(jsonWriter, map);
        jsonWriter.endObject();
    }

    /* renamed from: i */
    public static void m10678i() {
        synchronized (f8362b) {
            f8363c = false;
            f8364d = false;
            io0.m11131g("Ad debug logging enablement is out of date.");
        }
    }

    /* renamed from: j */
    public static void m10679j(boolean z) {
        synchronized (f8362b) {
            f8363c = true;
            f8364d = z;
        }
    }

    /* renamed from: k */
    public static boolean m10680k(Context context) {
        if (Build.VERSION.SDK_INT < 17 || !y20.f17566a.mo9928e().booleanValue()) {
            return false;
        }
        try {
            return Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
        } catch (Exception e) {
            io0.m11132h("Fail to determine debug setting.", e);
            return false;
        }
    }

    /* renamed from: l */
    public static boolean m10681l() {
        boolean z;
        synchronized (f8362b) {
            z = false;
            if (f8363c && f8364d) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: m */
    public static boolean m10682m() {
        boolean z;
        synchronized (f8362b) {
            z = f8363c;
        }
        return z;
    }

    /* renamed from: n */
    private static synchronized void m10683n(String str) {
        synchronized (ho0.class) {
            io0.m11130f("GMA Debug BEGIN");
            int i = 0;
            while (i < str.length()) {
                int i2 = i + 4000;
                String valueOf = String.valueOf(str.substring(i, Math.min(i2, str.length())));
                io0.m11130f(valueOf.length() != 0 ? "GMA Debug CONTENT ".concat(valueOf) : new String("GMA Debug CONTENT "));
                i = i2;
            }
            io0.m11130f("GMA Debug FINISH");
        }
    }

    /* renamed from: o */
    private final void m10684o(String str, go0 go0) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(f8365e.mo12462a());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            for (String value : this.f8368a) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
            go0.mo6237a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            io0.m11129e("unable to log", e);
        }
        m10683n(stringWriter.toString());
    }

    /* renamed from: p */
    private final void m10685p(String str) {
        m10684o("onNetworkRequestError", new do0(str));
    }

    /* renamed from: q */
    private final void m10686q(String str, String str2, Map<String, ?> map, byte[] bArr) {
        m10684o("onNetworkRequest", new eo0(str, str2, map, bArr));
    }

    /* renamed from: r */
    private final void m10687r(Map<String, ?> map, int i) {
        m10684o("onNetworkResponse", new co0(i, map));
    }

    /* renamed from: s */
    private static void m10688s(JsonWriter jsonWriter, Map<String, ?> map) {
        if (map != null) {
            jsonWriter.name("headers").beginArray();
            Iterator<Map.Entry<String, ?>> it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                String str = (String) next.getKey();
                if (!f8366f.contains(str)) {
                    if (!(next.getValue() instanceof List)) {
                        if (!(next.getValue() instanceof String)) {
                            io0.m11128d("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                            break;
                        }
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value((String) next.getValue());
                        jsonWriter.endObject();
                    } else {
                        for (String value : (List) next.getValue()) {
                            jsonWriter.beginObject();
                            jsonWriter.name("name").value(str);
                            jsonWriter.name("value").value(value);
                            jsonWriter.endObject();
                        }
                    }
                }
            }
            jsonWriter.endArray();
        }
    }

    /* renamed from: c */
    public final void mo7974c(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (m10681l()) {
            m10686q(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    /* renamed from: d */
    public final void mo7975d(String str, String str2, Map<String, ?> map, byte[] bArr) {
        if (m10681l()) {
            m10686q(str, "GET", map, bArr);
        }
    }

    /* renamed from: e */
    public final void mo7976e(HttpURLConnection httpURLConnection, int i) {
        if (m10681l()) {
            String str = null;
            m10687r(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i);
            if (i < 200 || i >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e) {
                    String valueOf = String.valueOf(e.getMessage());
                    io0.m11131g(valueOf.length() != 0 ? "Can not get error message from error HttpURLConnection\n".concat(valueOf) : new String("Can not get error message from error HttpURLConnection\n"));
                }
                m10685p(str);
            }
        }
    }

    /* renamed from: f */
    public final void mo7977f(Map<String, ?> map, int i) {
        if (m10681l()) {
            m10687r(map, i);
            if (i < 200 || i >= 300) {
                m10685p((String) null);
            }
        }
    }

    /* renamed from: g */
    public final void mo7978g(String str) {
        if (m10681l() && str != null) {
            mo7979h(str.getBytes());
        }
    }

    /* renamed from: h */
    public final void mo7979h(byte[] bArr) {
        m10684o("onNetworkResponseBody", new fo0(bArr));
    }
}
