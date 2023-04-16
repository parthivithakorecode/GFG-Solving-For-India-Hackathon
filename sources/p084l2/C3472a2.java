package p084l2;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: l2.a2 */
final /* synthetic */ class C3472a2 implements Runnable {

    /* renamed from: f */
    private final String f21025f;

    /* renamed from: g */
    private final String f21026g;

    /* renamed from: h */
    private final C3481c2[] f21027h;

    C3472a2(String str, String str2, C3481c2[] c2VarArr) {
        this.f21025f = str;
        this.f21026g = str2;
        this.f21027h = c2VarArr;
    }

    public final void run() {
        JSONObject jSONObject;
        String str;
        Throwable e;
        String sb;
        String str2 = this.f21025f;
        String str3 = this.f21026g;
        C3481c2[] c2VarArr = this.f21027h;
        if (TextUtils.isEmpty(str2)) {
            sb = "Error on action: empty action name";
        } else {
            String lowerCase = str2.toLowerCase();
            if (TextUtils.isEmpty(str3)) {
                jSONObject = new JSONObject();
            } else {
                try {
                    jSONObject = new JSONObject(str3);
                } catch (JSONException unused) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase).length() + 32 + String.valueOf(str3).length());
                    sb2.append("Action[");
                    sb2.append(lowerCase);
                    sb2.append("]: failed to parse args: ");
                    sb2.append(str3);
                    sb = sb2.toString();
                }
            }
            String valueOf = String.valueOf(jSONObject);
            StringBuilder sb3 = new StringBuilder(String.valueOf(lowerCase).length() + 10 + valueOf.length());
            sb3.append("Action[");
            sb3.append(lowerCase);
            sb3.append("]: ");
            sb3.append(valueOf);
            Log.d("UserMessagingPlatform", sb3.toString());
            int length = c2VarArr.length;
            int i = 0;
            while (i < length) {
                C3481c2 c2Var = c2VarArr[i];
                FutureTask futureTask = new FutureTask(new C3568z1(c2Var, lowerCase, jSONObject));
                c2Var.zza().execute(futureTask);
                try {
                    if (!((Boolean) futureTask.get()).booleanValue()) {
                        i++;
                    } else {
                        return;
                    }
                } catch (ExecutionException e2) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(lowerCase).length() + 24);
                    sb4.append("Failed to run Action[");
                    sb4.append(lowerCase);
                    sb4.append("]: ");
                    str = sb4.toString();
                    e = e2.getCause();
                    C3484d1.m24870a(str, e);
                    i++;
                } catch (InterruptedException e3) {
                    e = e3;
                    StringBuilder sb5 = new StringBuilder(String.valueOf(lowerCase).length() + 33);
                    sb5.append("Thread interrupted for Action[");
                    sb5.append(lowerCase);
                    sb5.append("]: ");
                    str = sb5.toString();
                    C3484d1.m24870a(str, e);
                    i++;
                }
            }
            return;
        }
        Log.d("UserMessagingPlatform", sb);
    }
}
