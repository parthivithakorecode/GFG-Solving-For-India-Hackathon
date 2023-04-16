package p120q3;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import java.io.IOException;
import org.json.JSONArray;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: q3.a */
public final class C3950a {

    /* renamed from: a */
    public static final String f22097a;

    /* renamed from: b */
    public static final String f22098b;

    /* renamed from: c */
    public static final String f22099c;

    /* renamed from: d */
    public static final String f22100d;

    static {
        Class<C3953d> cls = C3953d.class;
        f22097a = cls.getName() + '.' + "aot-shared-library-name";
        f22098b = cls.getName() + '.' + "vm-snapshot-data";
        f22099c = cls.getName() + '.' + "isolate-snapshot-data";
        f22100d = cls.getName() + '.' + "flutter-assets-dir";
    }

    /* renamed from: a */
    private static ApplicationInfo m26124a(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private static boolean m26125b(Bundle bundle, String str, boolean z) {
        return bundle == null ? z : bundle.getBoolean(str, z);
    }

    /* renamed from: c */
    private static String m26126c(ApplicationInfo applicationInfo, Context context) {
        int i;
        Bundle bundle = applicationInfo.metaData;
        if (bundle == null || (i = bundle.getInt("io.flutter.network-policy", 0)) <= 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            xml.next();
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2 && xml.getName().equals("domain-config")) {
                    m26130g(xml, jSONArray, false);
                }
            }
            return jSONArray.toString();
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static String m26127d(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        return bundle.getString(str, (String) null);
    }

    /* renamed from: e */
    public static C3951b m26128e(Context context) {
        ApplicationInfo a = m26124a(context);
        return new C3951b(m26127d(a.metaData, f22097a), m26127d(a.metaData, f22098b), m26127d(a.metaData, f22099c), m26127d(a.metaData, f22100d), m26126c(a, context), a.nativeLibraryDir, m26125b(a.metaData, "io.flutter.automatically-register-plugins", true));
    }

    /* renamed from: f */
    private static void m26129f(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue((String) null, "includeSubdomains", false);
        xmlResourceParser.next();
        if (xmlResourceParser.getEventType() == 4) {
            String trim = xmlResourceParser.getText().trim();
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(trim);
            jSONArray2.put(attributeBooleanValue);
            jSONArray2.put(z);
            jSONArray.put(jSONArray2);
            xmlResourceParser.next();
            if (xmlResourceParser.getEventType() != 3) {
                throw new IllegalStateException("Expected end of domain tag");
            }
            return;
        }
        throw new IllegalStateException("Expected text");
    }

    /* renamed from: g */
    private static void m26130g(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue((String) null, "cleartextTrafficPermitted", z);
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                if (xmlResourceParser.getName().equals("domain")) {
                    m26129f(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else if (xmlResourceParser.getName().equals("domain-config")) {
                    m26130g(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else {
                    m26131h(xmlResourceParser);
                }
            } else if (next == 3) {
                return;
            }
        }
    }

    /* renamed from: h */
    private static void m26131h(XmlResourceParser xmlResourceParser) {
        String name = xmlResourceParser.getName();
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            if (eventType != 3 || xmlResourceParser.getName() != name) {
                eventType = xmlResourceParser.next();
            } else {
                return;
            }
        }
    }
}
