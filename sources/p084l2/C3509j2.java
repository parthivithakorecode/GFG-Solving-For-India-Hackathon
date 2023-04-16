package p084l2;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.Executor;
import p137t2.C4061a;
import p137t2.C4065c;
import p137t2.C4068d;

/* renamed from: l2.j2 */
final class C3509j2 {

    /* renamed from: a */
    private final Application f21097a;

    /* renamed from: b */
    private final C3477c f21098b;

    /* renamed from: c */
    private final Handler f21099c;

    /* renamed from: d */
    private final Executor f21100d;

    /* renamed from: e */
    private final C3518m f21101e;

    /* renamed from: f */
    private final C3470a0 f21102f;

    /* renamed from: g */
    private final C3501h2 f21103g;

    /* renamed from: h */
    private final C3550t2 f21104h;

    /* renamed from: i */
    private final C3565y1 f21105i;

    C3509j2(Application application, C3477c cVar, Handler handler, Executor executor, C3518m mVar, C3470a0 a0Var, C3501h2 h2Var, C3550t2 t2Var, C3565y1 y1Var) {
        this.f21097a = application;
        this.f21098b = cVar;
        this.f21099c = handler;
        this.f21100d = executor;
        this.f21101e = mVar;
        this.f21102f = a0Var;
        this.f21103g = h2Var;
        this.f21104h = t2Var;
        this.f21105i = y1Var;
    }

    /* renamed from: a */
    private final C3471a1 m24909a(C3532p0 p0Var) {
        try {
            return m24910d(p0Var);
        } catch (SocketTimeoutException e) {
            throw new C3489e2(4, "The server timed out.", e);
        } catch (IOException e2) {
            throw new C3489e2(2, "Error making request.", e2);
        }
    }

    /* renamed from: d */
    private final C3471a1 m24910d(C3532p0 p0Var) {
        JsonWriter jsonWriter;
        JsonReader jsonReader;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
        Application application = this.f21097a;
        httpURLConnection.setRequestProperty("User-Agent", Build.VERSION.SDK_INT >= 17 ? WebSettings.getDefaultUserAgent(application) : new WebView(application).getSettings().getUserAgentString());
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(30000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
        try {
            jsonWriter = new JsonWriter(outputStreamWriter);
            jsonWriter.beginObject();
            String str = p0Var.f21155a;
            if (str != null) {
                jsonWriter.name("admob_app_id");
                jsonWriter.value(str);
            }
            String str2 = p0Var.f21156b;
            if (str2 != null) {
                jsonWriter.name("adid");
                jsonWriter.value(str2);
            }
            C3548t0 t0Var = p0Var.f21157c;
            if (t0Var != null) {
                jsonWriter.name("device_info");
                jsonWriter.beginObject();
                int i = t0Var.f21201a;
                if (i != C3558w0.f21233a) {
                    jsonWriter.name("os_type");
                    C3558w0.m24960b(i, jsonWriter);
                }
                String str3 = t0Var.f21202b;
                if (str3 != null) {
                    jsonWriter.name("model");
                    jsonWriter.value(str3);
                }
                Integer num = t0Var.f21203c;
                if (num != null) {
                    jsonWriter.name("android_api_level");
                    jsonWriter.value(num);
                }
                jsonWriter.endObject();
            }
            String str4 = p0Var.f21158d;
            if (str4 != null) {
                jsonWriter.name("publisher_privacy_policy_url");
                jsonWriter.value(str4);
            }
            String str5 = p0Var.f21159e;
            if (str5 != null) {
                jsonWriter.name("language_code");
                jsonWriter.value(str5);
            }
            String str6 = p0Var.f21160f;
            if (str6 != null) {
                jsonWriter.name("country_code_if_unknown_region");
                jsonWriter.value(str6);
            }
            Boolean bool = p0Var.f21161g;
            if (bool != null) {
                jsonWriter.name("opt_out_if_unknown_region");
                jsonWriter.value(bool.booleanValue());
            }
            Boolean bool2 = p0Var.f21162h;
            if (bool2 != null) {
                jsonWriter.name("tag_for_under_age_of_consent");
                jsonWriter.value(bool2.booleanValue());
            }
            Boolean bool3 = p0Var.f21163i;
            if (bool3 != null) {
                jsonWriter.name("is_lat");
                jsonWriter.value(bool3.booleanValue());
            }
            Map<String, String> map = p0Var.f21164j;
            if (!map.isEmpty()) {
                jsonWriter.name("stored_infos_map");
                jsonWriter.beginObject();
                for (Map.Entry next : map.entrySet()) {
                    jsonWriter.name((String) next.getKey());
                    jsonWriter.value((String) next.getValue());
                }
                jsonWriter.endObject();
            }
            C3555v0 v0Var = p0Var.f21165k;
            if (v0Var != null) {
                jsonWriter.name("screen_info");
                jsonWriter.beginObject();
                Integer num2 = v0Var.f21229a;
                if (num2 != null) {
                    jsonWriter.name("width");
                    jsonWriter.value(num2);
                }
                Integer num3 = v0Var.f21230b;
                if (num3 != null) {
                    jsonWriter.name("height");
                    jsonWriter.value(num3);
                }
                Double d = v0Var.f21231c;
                if (d != null) {
                    jsonWriter.name("density");
                    jsonWriter.value(d);
                }
                List<C3564y0> list = v0Var.f21232d;
                if (!list.isEmpty()) {
                    jsonWriter.name("screen_insets");
                    jsonWriter.beginArray();
                    for (C3564y0 next2 : list) {
                        jsonWriter.beginObject();
                        Integer num4 = next2.f21255a;
                        if (num4 != null) {
                            jsonWriter.name("top");
                            jsonWriter.value(num4);
                        }
                        Integer num5 = next2.f21256b;
                        if (num5 != null) {
                            jsonWriter.name("left");
                            jsonWriter.value(num5);
                        }
                        Integer num6 = next2.f21257c;
                        if (num6 != null) {
                            jsonWriter.name("right");
                            jsonWriter.value(num6);
                        }
                        Integer num7 = next2.f21258d;
                        if (num7 != null) {
                            jsonWriter.name("bottom");
                            jsonWriter.value(num7);
                        }
                        jsonWriter.endObject();
                    }
                    jsonWriter.endArray();
                }
                jsonWriter.endObject();
            }
            C3540r0 r0Var = p0Var.f21166l;
            if (r0Var != null) {
                jsonWriter.name("app_info");
                jsonWriter.beginObject();
                String str7 = r0Var.f21190a;
                if (str7 != null) {
                    jsonWriter.name("package_name");
                    jsonWriter.value(str7);
                }
                String str8 = r0Var.f21191b;
                if (str8 != null) {
                    jsonWriter.name("publisher_display_name");
                    jsonWriter.value(str8);
                }
                String str9 = r0Var.f21192c;
                if (str9 != null) {
                    jsonWriter.name("version");
                    jsonWriter.value(str9);
                }
                jsonWriter.endObject();
            }
            C3561x0 x0Var = p0Var.f21167m;
            if (x0Var != null) {
                jsonWriter.name("sdk_info");
                jsonWriter.beginObject();
                String str10 = x0Var.f21251a;
                if (str10 != null) {
                    jsonWriter.name("version");
                    jsonWriter.value(str10);
                }
                jsonWriter.endObject();
            }
            List<C3552u0> list2 = p0Var.f21168n;
            if (!list2.isEmpty()) {
                jsonWriter.name("debug_params");
                jsonWriter.beginArray();
                for (C3552u0 b : list2) {
                    b.mo14632b(jsonWriter);
                }
                jsonWriter.endArray();
            }
            jsonWriter.endObject();
            jsonWriter.close();
            outputStreamWriter.close();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                if (headerField != null) {
                    C3471a1 a = C3471a1.m24857a(new JsonReader(new StringReader(headerField)));
                    a.f21020b = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                    return a;
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                try {
                    bufferedReader.readLine();
                    jsonReader = new JsonReader(bufferedReader);
                    C3471a1 a2 = C3471a1.m24857a(jsonReader);
                    jsonReader.close();
                    bufferedReader.close();
                    return a2;
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        C3520m1.m24932b(th, th2);
                    }
                    throw th;
                }
            } else {
                String next3 = new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next();
                StringBuilder sb = new StringBuilder(String.valueOf(next3).length() + 31);
                sb.append("Http error code - ");
                sb.append(responseCode);
                sb.append(".\n");
                sb.append(next3);
                throw new IOException(sb.toString());
            }
            throw th;
            throw th;
        } catch (Throwable th3) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th4) {
                C3520m1.m24932b(th3, th4);
            }
            throw th3;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo14598b(Activity activity, C4068d dVar, C4065c.C4067b bVar, C4065c.C4066a aVar) {
        this.f21100d.execute(new C3522m2(this, activity, dVar, bVar, aVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo14599c(C4065c.C4067b bVar) {
        Handler handler = this.f21099c;
        bVar.getClass();
        handler.post(C3530o2.m24936a(bVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo14600e(Activity activity, C4068d dVar, C4065c.C4067b bVar, C4065c.C4066a aVar) {
        try {
            C4061a a = dVar.mo15571a();
            if (a == null || !a.mo15567b()) {
                String a2 = C3475b1.m24860a(this.f21097a);
                StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 95);
                sb.append("Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"");
                sb.append(a2);
                sb.append("\") to set this as a debug device.");
                Log.i("UserMessagingPlatform", sb.toString());
            }
            C3546s2 a3 = new C3473b(this.f21104h, m24909a(this.f21103g.mo14589b(activity, dVar))).mo14563a();
            this.f21101e.mo14608b(a3.f21197a);
            this.f21101e.mo14610d(a3.f21198b);
            this.f21102f.mo14559a(a3.f21199c);
            this.f21105i.mo14634a().execute(new C3517l2(this, bVar));
        } catch (C3489e2 e) {
            this.f21099c.post(new C3526n2(aVar, e));
        } catch (RuntimeException e2) {
            String valueOf = String.valueOf(Log.getStackTraceString(e2));
            this.f21099c.post(new C3538q2(aVar, new C3489e2(1, valueOf.length() != 0 ? "Caught exception when trying to request consent info update: ".concat(valueOf) : new String("Caught exception when trying to request consent info update: "))));
        }
    }
}
