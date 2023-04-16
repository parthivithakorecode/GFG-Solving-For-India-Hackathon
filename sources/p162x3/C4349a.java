package p162x3;

import p066io.flutter.embedding.engine.C2961a;
import p066io.flutter.plugins.GeneratedPluginRegistrant;
import p099n3.C3768b;

/* renamed from: x3.a */
public class C4349a {
    /* renamed from: a */
    public static void m26974a(C2961a aVar) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", new Class[]{C2961a.class}).invoke((Object) null, new Object[]{aVar});
        } catch (Exception e) {
            C3768b.m25588b("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + aVar + ") but could not find or invoke the GeneratedPluginRegistrant.");
            C3768b.m25589c("GeneratedPluginsRegister", "Received exception while registering", e);
        }
    }
}
