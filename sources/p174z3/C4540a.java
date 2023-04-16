package p174z3;

import java.util.HashMap;
import p005a4.C0120a;
import p005a4.C0157r;
import p066io.flutter.embedding.engine.FlutterJNI;
import p066io.flutter.view.C3102c;
import p099n3.C3768b;
import p106o3.C3832a;

/* renamed from: z3.a */
public class C4540a {

    /* renamed from: a */
    public final C0120a<Object> f23070a;

    /* renamed from: b */
    public final FlutterJNI f23071b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C4542b f23072c;

    /* renamed from: d */
    final C0120a.C0125d<Object> f23073d;

    /* renamed from: z3.a$a */
    class C4541a implements C0120a.C0125d<Object> {
        C4541a() {
        }

        /* renamed from: a */
        public void mo311a(Object obj, C0120a.C0126e<Object> eVar) {
            if (C4540a.this.f23072c == null) {
                eVar.mo309a(null);
                return;
            }
            HashMap hashMap = (HashMap) obj;
            String str = (String) hashMap.get("type");
            HashMap hashMap2 = (HashMap) hashMap.get("data");
            C3768b.m25592f("AccessibilityChannel", "Received " + str + " message.");
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1140076541:
                    if (str.equals("tooltip")) {
                        c = 0;
                        break;
                    }
                    break;
                case -649620375:
                    if (str.equals("announce")) {
                        c = 1;
                        break;
                    }
                    break;
                case 114595:
                    if (str.equals("tap")) {
                        c = 2;
                        break;
                    }
                    break;
                case 114203431:
                    if (str.equals("longPress")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    String str2 = (String) hashMap2.get("message");
                    if (str2 != null) {
                        C4540a.this.f23072c.mo13946d(str2);
                        break;
                    }
                    break;
                case 1:
                    String str3 = (String) hashMap2.get("message");
                    if (str3 != null) {
                        C4540a.this.f23072c.mo13945a(str3);
                        break;
                    }
                    break;
                case 2:
                    Integer num = (Integer) hashMap.get("nodeId");
                    if (num != null) {
                        C4540a.this.f23072c.mo13948f(num.intValue());
                        break;
                    }
                    break;
                case 3:
                    Integer num2 = (Integer) hashMap.get("nodeId");
                    if (num2 != null) {
                        C4540a.this.f23072c.mo13947e(num2.intValue());
                        break;
                    }
                    break;
            }
            eVar.mo309a(null);
        }
    }

    /* renamed from: z3.a$b */
    public interface C4542b extends FlutterJNI.C2958a {
        /* renamed from: a */
        void mo13945a(String str);

        /* renamed from: d */
        void mo13946d(String str);

        /* renamed from: e */
        void mo13947e(int i);

        /* renamed from: f */
        void mo13948f(int i);
    }

    public C4540a(C3832a aVar, FlutterJNI flutterJNI) {
        C4541a aVar2 = new C4541a();
        this.f23073d = aVar2;
        C0120a<Object> aVar3 = new C0120a<>(aVar, "flutter/accessibility", C0157r.f281a);
        this.f23070a = aVar3;
        aVar3.mo307e(aVar2);
        this.f23071b = flutterJNI;
    }

    /* renamed from: b */
    public void mo16217b(int i, C3102c.C3109g gVar) {
        this.f23071b.dispatchSemanticsAction(i, gVar);
    }

    /* renamed from: c */
    public void mo16218c(int i, C3102c.C3109g gVar, Object obj) {
        this.f23071b.dispatchSemanticsAction(i, gVar, obj);
    }

    /* renamed from: d */
    public void mo16219d() {
        this.f23071b.setSemanticsEnabled(false);
    }

    /* renamed from: e */
    public void mo16220e() {
        this.f23071b.setSemanticsEnabled(true);
    }

    /* renamed from: f */
    public void mo16221f(int i) {
        this.f23071b.setAccessibilityFeatures(i);
    }

    /* renamed from: g */
    public void mo16222g(C4542b bVar) {
        this.f23072c = bVar;
        this.f23071b.setAccessibilityDelegate(bVar);
    }
}
