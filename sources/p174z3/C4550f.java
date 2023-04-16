package p174z3;

import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p005a4.C0141g;
import p005a4.C0144j;
import p005a4.C0145k;
import p099n3.C3768b;
import p106o3.C3832a;

/* renamed from: z3.f */
public class C4550f {

    /* renamed from: a */
    public final C0145k f23085a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4552b f23086b;

    /* renamed from: c */
    public final C0145k.C0149c f23087c;

    /* renamed from: z3.f$a */
    class C4551a implements C0145k.C0149c {
        C4551a() {
        }

        public void onMethodCall(C0144j jVar, C0145k.C0150d dVar) {
            if (C4550f.this.f23086b != null) {
                String str = jVar.f269a;
                str.hashCode();
                if (!str.equals("Localization.getStringResource")) {
                    dVar.mo340c();
                    return;
                }
                JSONObject jSONObject = (JSONObject) jVar.mo333b();
                try {
                    dVar.mo338a(C4550f.this.f23086b.mo4638a(jSONObject.getString("key"), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
                } catch (JSONException e) {
                    dVar.mo339b("error", e.getMessage(), (Object) null);
                }
            }
        }
    }

    /* renamed from: z3.f$b */
    public interface C4552b {
        /* renamed from: a */
        String mo4638a(String str, String str2);
    }

    public C4550f(C3832a aVar) {
        C4551a aVar2 = new C4551a();
        this.f23087c = aVar2;
        C0145k kVar = new C0145k(aVar, "flutter/localization", C0141g.f268a);
        this.f23085a = kVar;
        kVar.mo337e(aVar2);
    }

    /* renamed from: b */
    public void mo16229b(List<Locale> list) {
        C3768b.m25592f("LocalizationChannel", "Sending Locales to Flutter.");
        ArrayList arrayList = new ArrayList();
        for (Locale next : list) {
            C3768b.m25592f("LocalizationChannel", "Locale (Language: " + next.getLanguage() + ", Country: " + next.getCountry() + ", Variant: " + next.getVariant() + ")");
            arrayList.add(next.getLanguage());
            arrayList.add(next.getCountry());
            arrayList.add(Build.VERSION.SDK_INT >= 21 ? next.getScript() : "");
            arrayList.add(next.getVariant());
        }
        this.f23085a.mo335c("setLocale", arrayList);
    }

    /* renamed from: c */
    public void mo16230c(C4552b bVar) {
        this.f23086b = bVar;
    }
}
