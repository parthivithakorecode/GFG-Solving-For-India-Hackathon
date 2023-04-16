package p069j1;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.wr2;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: j1.a1 */
public final class C3138a1 {

    /* renamed from: a */
    public static final C3225z0<Map<String, ?>> f20432a = new C3222y0();

    /* renamed from: a */
    public static Bundle m23819a(JSONObject jSONObject) {
        String str;
        String valueOf;
        String str2;
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        Bundle bundle = new Bundle();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt != null) {
                if (opt instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) opt).booleanValue());
                } else if (opt instanceof Double) {
                    bundle.putDouble(next, ((Double) opt).doubleValue());
                } else if (opt instanceof Integer) {
                    bundle.putInt(next, ((Integer) opt).intValue());
                } else if (opt instanceof Long) {
                    bundle.putLong(next, ((Long) opt).longValue());
                } else if (opt instanceof String) {
                    bundle.putString(next, (String) opt);
                } else {
                    if (opt instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) opt;
                        if (jSONArray.length() != 0) {
                            int length = jSONArray.length();
                            int i = 0;
                            Object obj = null;
                            int i2 = 0;
                            while (obj == null && i2 < length) {
                                obj = !jSONArray.isNull(i2) ? jSONArray.opt(i2) : null;
                                i2++;
                            }
                            if (obj == null) {
                                valueOf = String.valueOf(next);
                                str2 = "Expected JSONArray with at least 1 non-null element for key:";
                                if (valueOf.length() == 0) {
                                    str = new String(str2);
                                }
                            } else if (obj instanceof JSONObject) {
                                Bundle[] bundleArr = new Bundle[length];
                                while (i < length) {
                                    bundleArr[i] = !jSONArray.isNull(i) ? m23819a(jSONArray.optJSONObject(i)) : null;
                                    i++;
                                }
                                bundle.putParcelableArray(next, bundleArr);
                            } else if (obj instanceof Number) {
                                double[] dArr = new double[jSONArray.length()];
                                while (i < length) {
                                    dArr[i] = jSONArray.optDouble(i);
                                    i++;
                                }
                                bundle.putDoubleArray(next, dArr);
                            } else if (obj instanceof CharSequence) {
                                String[] strArr = new String[length];
                                while (i < length) {
                                    strArr[i] = !jSONArray.isNull(i) ? jSONArray.optString(i) : null;
                                    i++;
                                }
                                bundle.putStringArray(next, strArr);
                            } else if (obj instanceof Boolean) {
                                boolean[] zArr = new boolean[length];
                                while (i < length) {
                                    zArr[i] = jSONArray.optBoolean(i);
                                    i++;
                                }
                                bundle.putBooleanArray(next, zArr);
                            } else {
                                str = String.format("JSONArray with unsupported type %s for key:%s", new Object[]{obj.getClass().getCanonicalName(), next});
                            }
                            io0.m11131g(str);
                        }
                    } else if (opt instanceof JSONObject) {
                        bundle.putBundle(next, m23819a((JSONObject) opt));
                    } else {
                        valueOf = String.valueOf(next);
                        str2 = "Unsupported type for key:";
                        if (valueOf.length() == 0) {
                            str = new String(str2);
                            io0.m11131g(str);
                        }
                    }
                    str = str2.concat(valueOf);
                    io0.m11131g(str);
                }
            }
        }
        return bundle;
    }

    /* renamed from: b */
    public static String m23820b(String str, JSONObject jSONObject, String... strArr) {
        JSONObject m = m23831m(jSONObject, strArr);
        return m == null ? "" : m.optString(strArr[0], "");
    }

    /* renamed from: c */
    public static List<String> m23821c(JSONArray jSONArray, List<String> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                list.add(jSONArray.getString(i));
            }
        }
        return list;
    }

    /* renamed from: d */
    public static List<String> m23822d(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jsonReader.nextString());
        }
        jsonReader.endArray();
        return arrayList;
    }

    /* renamed from: e */
    public static JSONArray m23823e(JsonReader jsonReader) {
        Object nextString;
        JSONArray jSONArray = new JSONArray();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                nextString = m23823e(jsonReader);
            } else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                nextString = m23826h(jsonReader);
            } else if (JsonToken.BOOLEAN.equals(peek)) {
                jSONArray.put(jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(peek)) {
                jSONArray.put(jsonReader.nextDouble());
            } else if (JsonToken.STRING.equals(peek)) {
                nextString = jsonReader.nextString();
            } else {
                throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(peek)));
            }
            jSONArray.put(nextString);
        }
        jsonReader.endArray();
        return jSONArray;
    }

    /* renamed from: f */
    public static JSONObject m23824f(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException unused) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        }
    }

    /* renamed from: g */
    public static JSONObject m23825g(JSONObject jSONObject, String... strArr) {
        JSONObject m = m23831m(jSONObject, strArr);
        if (m == null) {
            return null;
        }
        return m.optJSONObject(strArr[1]);
    }

    /* renamed from: h */
    public static JSONObject m23826h(JsonReader jsonReader) {
        Object nextString;
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                nextString = m23823e(jsonReader);
            } else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                nextString = m23826h(jsonReader);
            } else if (JsonToken.BOOLEAN.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextDouble());
            } else if (JsonToken.STRING.equals(peek)) {
                nextString = jsonReader.nextString();
            } else {
                throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(peek)));
            }
            jSONObject.put(nextName, nextString);
        }
        jsonReader.endObject();
        return jSONObject;
    }

    /* renamed from: i */
    public static void m23827i(JsonWriter jsonWriter, JSONArray jSONArray) {
        try {
            jsonWriter.beginArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof String) {
                    jsonWriter.value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    m23828j(jsonWriter, (JSONObject) obj);
                } else if (obj instanceof JSONArray) {
                    m23827i(jsonWriter, (JSONArray) obj);
                } else {
                    String valueOf = String.valueOf(obj);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                    sb.append("unable to write field: ");
                    sb.append(valueOf);
                    throw new JSONException(sb.toString());
                }
            }
            jsonWriter.endArray();
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: j */
    public static void m23828j(JsonWriter jsonWriter, JSONObject jSONObject) {
        try {
            jsonWriter.beginObject();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    jsonWriter.name(next).value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.name(next).value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.name(next).value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    m23828j(jsonWriter.name(next), (JSONObject) obj);
                } else if (obj instanceof JSONArray) {
                    m23827i(jsonWriter.name(next), (JSONArray) obj);
                } else {
                    String valueOf = String.valueOf(obj);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                    sb.append("unable to write field: ");
                    sb.append(valueOf);
                    throw new JSONException(sb.toString());
                }
            }
            jsonWriter.endObject();
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: k */
    public static boolean m23829k(boolean z, JSONObject jSONObject, String... strArr) {
        JSONObject m = m23831m(jSONObject, strArr);
        if (m == null) {
            return false;
        }
        return m.optBoolean(strArr[strArr.length - 1], false);
    }

    /* renamed from: l */
    public static String m23830l(wr2 wr2) {
        if (wr2 == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            m23832n(jsonWriter, wr2);
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e) {
            io0.m11129e("Error when writing JSON.", e);
            return null;
        }
    }

    /* renamed from: m */
    private static JSONObject m23831m(JSONObject jSONObject, String[] strArr) {
        for (int i = 0; i < strArr.length - 1; i++) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.optJSONObject(strArr[i]);
        }
        return jSONObject;
    }

    /* renamed from: n */
    private static void m23832n(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            jsonWriter.nullValue();
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
        } else if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
        } else if (obj instanceof String) {
            jsonWriter.value((String) obj);
        } else if (obj instanceof wr2) {
            m23828j(jsonWriter, ((wr2) obj).f16921d);
        } else if (obj instanceof Map) {
            jsonWriter.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (key instanceof String) {
                    m23832n(jsonWriter.name((String) key), entry.getValue());
                }
            }
            jsonWriter.endObject();
        } else if (obj instanceof List) {
            jsonWriter.beginArray();
            for (Object n : (List) obj) {
                m23832n(jsonWriter, n);
            }
            jsonWriter.endArray();
        } else {
            jsonWriter.nullValue();
        }
    }
}
