package p174z3;

import java.util.HashMap;
import java.util.Map;
import p005a4.C0120a;
import p005a4.C0140f;
import p099n3.C3768b;
import p106o3.C3832a;

/* renamed from: z3.m */
public class C4584m {

    /* renamed from: a */
    public final C0120a<Object> f23195a;

    /* renamed from: z3.m$a */
    public static class C4585a {

        /* renamed from: a */
        private final C0120a<Object> f23196a;

        /* renamed from: b */
        private Map<String, Object> f23197b = new HashMap();

        C4585a(C0120a<Object> aVar) {
            this.f23196a = aVar;
        }

        /* renamed from: a */
        public void mo16244a() {
            C3768b.m25592f("SettingsChannel", "Sending message: \ntextScaleFactor: " + this.f23197b.get("textScaleFactor") + "\nalwaysUse24HourFormat: " + this.f23197b.get("alwaysUse24HourFormat") + "\nplatformBrightness: " + this.f23197b.get("platformBrightness"));
            this.f23196a.mo305c(this.f23197b);
        }

        /* renamed from: b */
        public C4585a mo16245b(boolean z) {
            this.f23197b.put("brieflyShowPassword", Boolean.valueOf(z));
            return this;
        }

        /* renamed from: c */
        public C4585a mo16246c(boolean z) {
            this.f23197b.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z));
            return this;
        }

        /* renamed from: d */
        public C4585a mo16247d(C4586b bVar) {
            this.f23197b.put("platformBrightness", bVar.f23201f);
            return this;
        }

        /* renamed from: e */
        public C4585a mo16248e(float f) {
            this.f23197b.put("textScaleFactor", Float.valueOf(f));
            return this;
        }

        /* renamed from: f */
        public C4585a mo16249f(boolean z) {
            this.f23197b.put("alwaysUse24HourFormat", Boolean.valueOf(z));
            return this;
        }
    }

    /* renamed from: z3.m$b */
    public enum C4586b {
        light("light"),
        dark("dark");
        

        /* renamed from: f */
        public String f23201f;

        private C4586b(String str) {
            this.f23201f = str;
        }
    }

    public C4584m(C3832a aVar) {
        this.f23195a = new C0120a<>(aVar, "flutter/settings", C0140f.f267a);
    }

    /* renamed from: a */
    public C4585a mo16243a() {
        return new C4585a(this.f23195a);
    }
}
