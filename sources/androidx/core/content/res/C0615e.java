package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.provider.C0701e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import p109p.C3883i;

/* renamed from: androidx.core.content.res.e */
public class C0615e {

    /* renamed from: androidx.core.content.res.e$a */
    static class C0616a {
        /* renamed from: a */
        static int m2543a(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    /* renamed from: androidx.core.content.res.e$b */
    public interface C0617b {
    }

    /* renamed from: androidx.core.content.res.e$c */
    public static final class C0618c implements C0617b {

        /* renamed from: a */
        private final C0619d[] f1907a;

        public C0618c(C0619d[] dVarArr) {
            this.f1907a = dVarArr;
        }

        /* renamed from: a */
        public C0619d[] mo2563a() {
            return this.f1907a;
        }
    }

    /* renamed from: androidx.core.content.res.e$d */
    public static final class C0619d {

        /* renamed from: a */
        private final String f1908a;

        /* renamed from: b */
        private final int f1909b;

        /* renamed from: c */
        private final boolean f1910c;

        /* renamed from: d */
        private final String f1911d;

        /* renamed from: e */
        private final int f1912e;

        /* renamed from: f */
        private final int f1913f;

        public C0619d(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f1908a = str;
            this.f1909b = i;
            this.f1910c = z;
            this.f1911d = str2;
            this.f1912e = i2;
            this.f1913f = i3;
        }

        /* renamed from: a */
        public String mo2564a() {
            return this.f1908a;
        }

        /* renamed from: b */
        public int mo2565b() {
            return this.f1913f;
        }

        /* renamed from: c */
        public int mo2566c() {
            return this.f1912e;
        }

        /* renamed from: d */
        public String mo2567d() {
            return this.f1911d;
        }

        /* renamed from: e */
        public int mo2568e() {
            return this.f1909b;
        }

        /* renamed from: f */
        public boolean mo2569f() {
            return this.f1910c;
        }
    }

    /* renamed from: androidx.core.content.res.e$e */
    public static final class C0620e implements C0617b {

        /* renamed from: a */
        private final C0701e f1914a;

        /* renamed from: b */
        private final int f1915b;

        /* renamed from: c */
        private final int f1916c;

        /* renamed from: d */
        private final String f1917d;

        public C0620e(C0701e eVar, int i, int i2, String str) {
            this.f1914a = eVar;
            this.f1916c = i;
            this.f1915b = i2;
            this.f1917d = str;
        }

        /* renamed from: a */
        public int mo2570a() {
            return this.f1916c;
        }

        /* renamed from: b */
        public C0701e mo2571b() {
            return this.f1914a;
        }

        /* renamed from: c */
        public String mo2572c() {
            return this.f1917d;
        }

        /* renamed from: d */
        public int mo2573d() {
            return this.f1915b;
        }
    }

    /* renamed from: a */
    private static int m2535a(TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C0616a.m2543a(typedArray, i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: b */
    public static androidx.core.content.res.C0615e.C0617b m2536b(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) {
        /*
        L_0x0000:
            int r0 = r3.next()
            r1 = 2
            if (r0 == r1) goto L_0x000b
            r2 = 1
            if (r0 == r2) goto L_0x000b
            goto L_0x0000
        L_0x000b:
            if (r0 != r1) goto L_0x0012
            androidx.core.content.res.e$b r3 = m2538d(r3, r4)
            return r3
        L_0x0012:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r4 = "No start tag found"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0615e.m2536b(org.xmlpull.v1.XmlPullParser, android.content.res.Resources):androidx.core.content.res.e$b");
    }

    /* renamed from: c */
    public static List<List<byte[]>> m2537c(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m2535a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m2542h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m2542h(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: d */
    private static C0617b m2538d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, (String) null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m2539e(xmlPullParser, resources);
        }
        m2541g(xmlPullParser);
        return null;
    }

    /* renamed from: e */
    private static C0617b m2539e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C3883i.f21945h);
        String string = obtainAttributes.getString(C3883i.f21946i);
        String string2 = obtainAttributes.getString(C3883i.f21950m);
        String string3 = obtainAttributes.getString(C3883i.f21951n);
        int resourceId = obtainAttributes.getResourceId(C3883i.f21947j, 0);
        int integer = obtainAttributes.getInteger(C3883i.f21948k, 1);
        int integer2 = obtainAttributes.getInteger(C3883i.f21949l, 500);
        String string4 = obtainAttributes.getString(C3883i.f21952o);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m2540f(xmlPullParser, resources));
                    } else {
                        m2541g(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C0618c((C0619d[]) arrayList.toArray(new C0619d[0]));
        }
        while (xmlPullParser.next() != 3) {
            m2541g(xmlPullParser);
        }
        return new C0620e(new C0701e(string, string2, string3, m2537c(resources, resourceId)), integer, integer2, string4);
    }

    /* renamed from: f */
    private static C0619d m2540f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C3883i.f21953p);
        int i = C3883i.f21962y;
        if (!obtainAttributes.hasValue(i)) {
            i = C3883i.f21955r;
        }
        int i2 = obtainAttributes.getInt(i, 400);
        int i3 = C3883i.f21960w;
        if (!obtainAttributes.hasValue(i3)) {
            i3 = C3883i.f21956s;
        }
        boolean z = 1 == obtainAttributes.getInt(i3, 0);
        int i4 = C3883i.f21963z;
        if (!obtainAttributes.hasValue(i4)) {
            i4 = C3883i.f21957t;
        }
        int i5 = C3883i.f21961x;
        if (!obtainAttributes.hasValue(i5)) {
            i5 = C3883i.f21958u;
        }
        String string = obtainAttributes.getString(i5);
        int i6 = obtainAttributes.getInt(i4, 0);
        int i7 = C3883i.f21959v;
        if (!obtainAttributes.hasValue(i7)) {
            i7 = C3883i.f21954q;
        }
        int resourceId = obtainAttributes.getResourceId(i7, 0);
        String string2 = obtainAttributes.getString(i7);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m2541g(xmlPullParser);
        }
        return new C0619d(string2, i2, z, string, i6, resourceId);
    }

    /* renamed from: g */
    private static void m2541g(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: h */
    private static List<byte[]> m2542h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }
}
