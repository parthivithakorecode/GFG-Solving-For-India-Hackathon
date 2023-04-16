package p174z3;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005a4.C0141g;
import p005a4.C0145k;
import p066io.flutter.plugin.editing.C2985e;
import p099n3.C3768b;
import p106o3.C3832a;

/* renamed from: z3.p */
public class C4591p {

    /* renamed from: a */
    public final C0145k f23207a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4598f f23208b;

    /* renamed from: c */
    final C0145k.C0149c f23209c;

    /* renamed from: z3.p$a */
    class C4592a implements C0145k.C0149c {
        C4592a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0149, code lost:
            r2.mo338a((java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onMethodCall(p005a4.C0144j r18, p005a4.C0145k.C0150d r19) {
            /*
                r17 = this;
                r1 = r17
                r0 = r18
                r2 = r19
                java.lang.String r3 = "data"
                z3.p r4 = p174z3.C4591p.this
                z3.p$f r4 = r4.f23208b
                if (r4 != 0) goto L_0x0011
                return
            L_0x0011:
                java.lang.String r4 = r0.f269a
                java.lang.Object r0 = r0.f270b
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Received '"
                r5.append(r6)
                r5.append(r4)
                java.lang.String r6 = "' message."
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                java.lang.String r6 = "TextInputChannel"
                p099n3.C3768b.m25592f(r6, r5)
                r4.hashCode()
                r5 = -1
                int r6 = r4.hashCode()
                r7 = 1
                r8 = 0
                switch(r6) {
                    case -1779068172: goto L_0x00a8;
                    case -1015421462: goto L_0x009d;
                    case -37561188: goto L_0x0092;
                    case 270476819: goto L_0x0087;
                    case 270803918: goto L_0x007c;
                    case 649192816: goto L_0x0071;
                    case 1204752139: goto L_0x0066;
                    case 1727570905: goto L_0x005b;
                    case 1904427655: goto L_0x004d;
                    case 2113369584: goto L_0x003f;
                    default: goto L_0x003d;
                }
            L_0x003d:
                goto L_0x00b2
            L_0x003f:
                java.lang.String r6 = "TextInput.requestAutofill"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x0049
                goto L_0x00b2
            L_0x0049:
                r5 = 9
                goto L_0x00b2
            L_0x004d:
                java.lang.String r6 = "TextInput.clearClient"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x0057
                goto L_0x00b2
            L_0x0057:
                r5 = 8
                goto L_0x00b2
            L_0x005b:
                java.lang.String r6 = "TextInput.finishAutofillContext"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x0064
                goto L_0x00b2
            L_0x0064:
                r5 = 7
                goto L_0x00b2
            L_0x0066:
                java.lang.String r6 = "TextInput.setEditableSizeAndTransform"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x006f
                goto L_0x00b2
            L_0x006f:
                r5 = 6
                goto L_0x00b2
            L_0x0071:
                java.lang.String r6 = "TextInput.sendAppPrivateCommand"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x007a
                goto L_0x00b2
            L_0x007a:
                r5 = 5
                goto L_0x00b2
            L_0x007c:
                java.lang.String r6 = "TextInput.show"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x0085
                goto L_0x00b2
            L_0x0085:
                r5 = 4
                goto L_0x00b2
            L_0x0087:
                java.lang.String r6 = "TextInput.hide"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x0090
                goto L_0x00b2
            L_0x0090:
                r5 = 3
                goto L_0x00b2
            L_0x0092:
                java.lang.String r6 = "TextInput.setClient"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x009b
                goto L_0x00b2
            L_0x009b:
                r5 = 2
                goto L_0x00b2
            L_0x009d:
                java.lang.String r6 = "TextInput.setEditingState"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x00a6
                goto L_0x00b2
            L_0x00a6:
                r5 = r7
                goto L_0x00b2
            L_0x00a8:
                java.lang.String r6 = "TextInput.setPlatformViewClient"
                boolean r4 = r4.equals(r6)
                if (r4 != 0) goto L_0x00b1
                goto L_0x00b2
            L_0x00b1:
                r5 = r8
            L_0x00b2:
                java.lang.String r4 = "error"
                r6 = 0
                switch(r5) {
                    case 0: goto L_0x0190;
                    case 1: goto L_0x017d;
                    case 2: goto L_0x0157;
                    case 3: goto L_0x014d;
                    case 4: goto L_0x0140;
                    case 5: goto L_0x0114;
                    case 6: goto L_0x00e3;
                    case 7: goto L_0x00d3;
                    case 8: goto L_0x00c8;
                    case 9: goto L_0x00bd;
                    default: goto L_0x00b8;
                }
            L_0x00b8:
                r19.mo340c()
                goto L_0x01b1
            L_0x00bd:
                z3.p r0 = p174z3.C4591p.this
                z3.p$f r0 = r0.f23208b
                r0.mo13622h()
                goto L_0x0149
            L_0x00c8:
                z3.p r0 = p174z3.C4591p.this
                z3.p$f r0 = r0.f23208b
                r0.mo13616b()
                goto L_0x0149
            L_0x00d3:
                z3.p r3 = p174z3.C4591p.this
                z3.p$f r3 = r3.f23208b
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                r3.mo13623i(r0)
                goto L_0x0149
            L_0x00e3:
                org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x01ab }
                java.lang.String r3 = "width"
                double r10 = r0.getDouble(r3)     // Catch:{ JSONException -> 0x01ab }
                java.lang.String r3 = "height"
                double r12 = r0.getDouble(r3)     // Catch:{ JSONException -> 0x01ab }
                java.lang.String r3 = "transform"
                org.json.JSONArray r0 = r0.getJSONArray(r3)     // Catch:{ JSONException -> 0x01ab }
                r3 = 16
                double[] r14 = new double[r3]     // Catch:{ JSONException -> 0x01ab }
            L_0x00fb:
                if (r8 >= r3) goto L_0x0106
                double r15 = r0.getDouble(r8)     // Catch:{ JSONException -> 0x01ab }
                r14[r8] = r15     // Catch:{ JSONException -> 0x01ab }
                int r8 = r8 + 1
                goto L_0x00fb
            L_0x0106:
                z3.p r0 = p174z3.C4591p.this     // Catch:{ JSONException -> 0x01ab }
                z3.p$f r9 = r0.f23208b     // Catch:{ JSONException -> 0x01ab }
                r9.mo13621g(r10, r12, r14)     // Catch:{ JSONException -> 0x01ab }
                r2.mo338a(r6)     // Catch:{ JSONException -> 0x01ab }
                goto L_0x01b1
            L_0x0114:
                org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x01ab }
                java.lang.String r5 = "action"
                java.lang.String r5 = r0.getString(r5)     // Catch:{ JSONException -> 0x01ab }
                java.lang.String r0 = r0.getString(r3)     // Catch:{ JSONException -> 0x01ab }
                if (r0 == 0) goto L_0x0131
                boolean r7 = r0.isEmpty()     // Catch:{ JSONException -> 0x01ab }
                if (r7 != 0) goto L_0x0131
                android.os.Bundle r7 = new android.os.Bundle     // Catch:{ JSONException -> 0x01ab }
                r7.<init>()     // Catch:{ JSONException -> 0x01ab }
                r7.putString(r3, r0)     // Catch:{ JSONException -> 0x01ab }
                goto L_0x0132
            L_0x0131:
                r7 = r6
            L_0x0132:
                z3.p r0 = p174z3.C4591p.this     // Catch:{ JSONException -> 0x01ab }
                z3.p$f r0 = r0.f23208b     // Catch:{ JSONException -> 0x01ab }
                r0.mo13619e(r5, r7)     // Catch:{ JSONException -> 0x01ab }
                r2.mo338a(r6)     // Catch:{ JSONException -> 0x01ab }
                goto L_0x01b1
            L_0x0140:
                z3.p r0 = p174z3.C4591p.this
                z3.p$f r0 = r0.f23208b
                r0.mo13615a()
            L_0x0149:
                r2.mo338a(r6)
                goto L_0x01b1
            L_0x014d:
                z3.p r0 = p174z3.C4591p.this
                z3.p$f r0 = r0.f23208b
                r0.mo13624j()
                goto L_0x0149
            L_0x0157:
                org.json.JSONArray r0 = (org.json.JSONArray) r0     // Catch:{ JSONException -> 0x0174, NoSuchFieldException -> 0x0172 }
                int r3 = r0.getInt(r8)     // Catch:{ JSONException -> 0x0174, NoSuchFieldException -> 0x0172 }
                org.json.JSONObject r0 = r0.getJSONObject(r7)     // Catch:{ JSONException -> 0x0174, NoSuchFieldException -> 0x0172 }
                z3.p r5 = p174z3.C4591p.this     // Catch:{ JSONException -> 0x0174, NoSuchFieldException -> 0x0172 }
                z3.p$f r5 = r5.f23208b     // Catch:{ JSONException -> 0x0174, NoSuchFieldException -> 0x0172 }
                z3.p$b r0 = p174z3.C4591p.C4593b.m27609a(r0)     // Catch:{ JSONException -> 0x0174, NoSuchFieldException -> 0x0172 }
                r5.mo13618d(r3, r0)     // Catch:{ JSONException -> 0x0174, NoSuchFieldException -> 0x0172 }
                r2.mo338a(r6)     // Catch:{ JSONException -> 0x0174, NoSuchFieldException -> 0x0172 }
                goto L_0x01b1
            L_0x0172:
                r0 = move-exception
                goto L_0x0175
            L_0x0174:
                r0 = move-exception
            L_0x0175:
                java.lang.String r0 = r0.getMessage()
            L_0x0179:
                r2.mo339b(r4, r0, r6)
                goto L_0x01b1
            L_0x017d:
                org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x01ab }
                z3.p r3 = p174z3.C4591p.this     // Catch:{ JSONException -> 0x01ab }
                z3.p$f r3 = r3.f23208b     // Catch:{ JSONException -> 0x01ab }
                z3.p$e r0 = p174z3.C4591p.C4597e.m27615a(r0)     // Catch:{ JSONException -> 0x01ab }
                r3.mo13617c(r0)     // Catch:{ JSONException -> 0x01ab }
                r2.mo338a(r6)     // Catch:{ JSONException -> 0x01ab }
                goto L_0x01b1
            L_0x0190:
                org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x01ab }
                java.lang.String r3 = "platformViewId"
                int r3 = r0.getInt(r3)     // Catch:{ JSONException -> 0x01ab }
                java.lang.String r5 = "usesVirtualDisplay"
                boolean r0 = r0.optBoolean(r5, r8)     // Catch:{ JSONException -> 0x01ab }
                z3.p r5 = p174z3.C4591p.this     // Catch:{ JSONException -> 0x01ab }
                z3.p$f r5 = r5.f23208b     // Catch:{ JSONException -> 0x01ab }
                r5.mo13620f(r3, r0)     // Catch:{ JSONException -> 0x01ab }
                r2.mo338a(r6)     // Catch:{ JSONException -> 0x01ab }
                goto L_0x01b1
            L_0x01ab:
                r0 = move-exception
                java.lang.String r0 = r0.getMessage()
                goto L_0x0179
            L_0x01b1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p174z3.C4591p.C4592a.onMethodCall(a4.j, a4.k$d):void");
        }
    }

    /* renamed from: z3.p$b */
    public static class C4593b {

        /* renamed from: a */
        public final boolean f23211a;

        /* renamed from: b */
        public final boolean f23212b;

        /* renamed from: c */
        public final boolean f23213c;

        /* renamed from: d */
        public final boolean f23214d;

        /* renamed from: e */
        public final boolean f23215e;

        /* renamed from: f */
        public final C4596d f23216f;

        /* renamed from: g */
        public final C4595c f23217g;

        /* renamed from: h */
        public final Integer f23218h;

        /* renamed from: i */
        public final String f23219i;

        /* renamed from: j */
        public final C4594a f23220j;

        /* renamed from: k */
        public final String[] f23221k;

        /* renamed from: l */
        public final C4593b[] f23222l;

        /* renamed from: z3.p$b$a */
        public static class C4594a {

            /* renamed from: a */
            public final String f23223a;

            /* renamed from: b */
            public final String[] f23224b;

            /* renamed from: c */
            public final C4597e f23225c;

            /* renamed from: d */
            public final String f23226d;

            public C4594a(String str, String[] strArr, String str2, C4597e eVar) {
                this.f23223a = str;
                this.f23224b = strArr;
                this.f23226d = str2;
                this.f23225c = eVar;
            }

            /* renamed from: a */
            public static C4594a m27611a(JSONObject jSONObject) {
                String string = jSONObject.getString("uniqueIdentifier");
                JSONArray jSONArray = jSONObject.getJSONArray("hints");
                String string2 = jSONObject.isNull("hintText") ? null : jSONObject.getString("hintText");
                JSONObject jSONObject2 = jSONObject.getJSONObject("editingValue");
                String[] strArr = new String[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    strArr[i] = m27612b(jSONArray.getString(i));
                }
                return new C4594a(string, strArr, string2, C4597e.m27615a(jSONObject2));
            }

            /* JADX WARNING: Can't fix incorrect switch cases order */
            /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a3, code lost:
                if (r0.equals("familyName") == false) goto L_0x002d;
             */
            /* renamed from: b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private static java.lang.String m27612b(java.lang.String r16) {
                /*
                    r0 = r16
                    int r1 = android.os.Build.VERSION.SDK_INT
                    r2 = 26
                    if (r1 >= r2) goto L_0x0009
                    return r0
                L_0x0009:
                    r16.hashCode()
                    int r3 = r16.hashCode()
                    java.lang.String r4 = "postalCode"
                    java.lang.String r5 = "postalAddress"
                    java.lang.String r6 = "password"
                    java.lang.String r7 = "newUsername"
                    java.lang.String r8 = "username"
                    java.lang.String r9 = "creditCardExpirationYear"
                    java.lang.String r10 = "creditCardExpirationDate"
                    java.lang.String r11 = "creditCardNumber"
                    java.lang.String r12 = "gender"
                    java.lang.String r13 = "creditCardExpirationDay"
                    java.lang.String r14 = "creditCardSecurityCode"
                    java.lang.String r15 = "newPassword"
                    java.lang.String r1 = "creditCardExpirationMonth"
                    switch(r3) {
                        case -2058889126: goto L_0x01e3;
                        case -1917283616: goto L_0x01d7;
                        case -1844815832: goto L_0x01cd;
                        case -1825589953: goto L_0x01c1;
                        case -1821235109: goto L_0x01b7;
                        case -1757573738: goto L_0x01ad;
                        case -1682373820: goto L_0x01a3;
                        case -1658955742: goto L_0x0197;
                        case -1567118045: goto L_0x018a;
                        case -1476752575: goto L_0x017c;
                        case -1413737489: goto L_0x016e;
                        case -1377792129: goto L_0x0160;
                        case -1249512767: goto L_0x0154;
                        case -1186060294: goto L_0x0146;
                        case -1151034798: goto L_0x013a;
                        case -835992323: goto L_0x012c;
                        case -818219584: goto L_0x011e;
                        case -747304516: goto L_0x0110;
                        case -613980922: goto L_0x0104;
                        case -613352043: goto L_0x00f8;
                        case -549230602: goto L_0x00ea;
                        case -265713450: goto L_0x00de;
                        case 3373707: goto L_0x00d0;
                        case 96619420: goto L_0x00c2;
                        case 253202685: goto L_0x00b4;
                        case 588174851: goto L_0x00a6;
                        case 798554127: goto L_0x009d;
                        case 892233837: goto L_0x0090;
                        case 991032982: goto L_0x0085;
                        case 1069376125: goto L_0x0078;
                        case 1216985755: goto L_0x006d;
                        case 1469046696: goto L_0x0060;
                        case 1662667945: goto L_0x0055;
                        case 1921869058: goto L_0x0048;
                        case 2011152728: goto L_0x003d;
                        case 2011773919: goto L_0x0030;
                        default: goto L_0x002d;
                    }
                L_0x002d:
                    r2 = -1
                    goto L_0x01ee
                L_0x0030:
                    java.lang.String r2 = "birthdayDay"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0039
                    goto L_0x002d
                L_0x0039:
                    r2 = 35
                    goto L_0x01ee
                L_0x003d:
                    boolean r2 = r0.equals(r4)
                    if (r2 != 0) goto L_0x0044
                    goto L_0x002d
                L_0x0044:
                    r2 = 34
                    goto L_0x01ee
                L_0x0048:
                    java.lang.String r2 = "postalAddressExtended"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0051
                    goto L_0x002d
                L_0x0051:
                    r2 = 33
                    goto L_0x01ee
                L_0x0055:
                    boolean r2 = r0.equals(r5)
                    if (r2 != 0) goto L_0x005c
                    goto L_0x002d
                L_0x005c:
                    r2 = 32
                    goto L_0x01ee
                L_0x0060:
                    java.lang.String r2 = "givenName"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0069
                    goto L_0x002d
                L_0x0069:
                    r2 = 31
                    goto L_0x01ee
                L_0x006d:
                    boolean r2 = r0.equals(r6)
                    if (r2 != 0) goto L_0x0074
                    goto L_0x002d
                L_0x0074:
                    r2 = 30
                    goto L_0x01ee
                L_0x0078:
                    java.lang.String r2 = "birthday"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0081
                    goto L_0x002d
                L_0x0081:
                    r2 = 29
                    goto L_0x01ee
                L_0x0085:
                    boolean r2 = r0.equals(r7)
                    if (r2 != 0) goto L_0x008c
                    goto L_0x002d
                L_0x008c:
                    r2 = 28
                    goto L_0x01ee
                L_0x0090:
                    java.lang.String r2 = "telephoneNumber"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0099
                    goto L_0x002d
                L_0x0099:
                    r2 = 27
                    goto L_0x01ee
                L_0x009d:
                    java.lang.String r3 = "familyName"
                    boolean r3 = r0.equals(r3)
                    if (r3 != 0) goto L_0x01ee
                    goto L_0x002d
                L_0x00a6:
                    java.lang.String r2 = "birthdayMonth"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x00b0
                    goto L_0x002d
                L_0x00b0:
                    r2 = 25
                    goto L_0x01ee
                L_0x00b4:
                    java.lang.String r2 = "addressState"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x00be
                    goto L_0x002d
                L_0x00be:
                    r2 = 24
                    goto L_0x01ee
                L_0x00c2:
                    java.lang.String r2 = "email"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x00cc
                    goto L_0x002d
                L_0x00cc:
                    r2 = 23
                    goto L_0x01ee
                L_0x00d0:
                    java.lang.String r2 = "name"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x00da
                    goto L_0x002d
                L_0x00da:
                    r2 = 22
                    goto L_0x01ee
                L_0x00de:
                    boolean r2 = r0.equals(r8)
                    if (r2 != 0) goto L_0x00e6
                    goto L_0x002d
                L_0x00e6:
                    r2 = 21
                    goto L_0x01ee
                L_0x00ea:
                    java.lang.String r2 = "telephoneNumberCountryCode"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x00f4
                    goto L_0x002d
                L_0x00f4:
                    r2 = 20
                    goto L_0x01ee
                L_0x00f8:
                    boolean r2 = r0.equals(r9)
                    if (r2 != 0) goto L_0x0100
                    goto L_0x002d
                L_0x0100:
                    r2 = 19
                    goto L_0x01ee
                L_0x0104:
                    boolean r2 = r0.equals(r10)
                    if (r2 != 0) goto L_0x010c
                    goto L_0x002d
                L_0x010c:
                    r2 = 18
                    goto L_0x01ee
                L_0x0110:
                    java.lang.String r2 = "nameSuffix"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x011a
                    goto L_0x002d
                L_0x011a:
                    r2 = 17
                    goto L_0x01ee
                L_0x011e:
                    java.lang.String r2 = "middleName"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0128
                    goto L_0x002d
                L_0x0128:
                    r2 = 16
                    goto L_0x01ee
                L_0x012c:
                    java.lang.String r2 = "namePrefix"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0136
                    goto L_0x002d
                L_0x0136:
                    r2 = 15
                    goto L_0x01ee
                L_0x013a:
                    boolean r2 = r0.equals(r11)
                    if (r2 != 0) goto L_0x0142
                    goto L_0x002d
                L_0x0142:
                    r2 = 14
                    goto L_0x01ee
                L_0x0146:
                    java.lang.String r2 = "postalAddressExtendedPostalCode"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0150
                    goto L_0x002d
                L_0x0150:
                    r2 = 13
                    goto L_0x01ee
                L_0x0154:
                    boolean r2 = r0.equals(r12)
                    if (r2 != 0) goto L_0x015c
                    goto L_0x002d
                L_0x015c:
                    r2 = 12
                    goto L_0x01ee
                L_0x0160:
                    java.lang.String r2 = "addressCity"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x016a
                    goto L_0x002d
                L_0x016a:
                    r2 = 11
                    goto L_0x01ee
                L_0x016e:
                    java.lang.String r2 = "middleInitial"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0178
                    goto L_0x002d
                L_0x0178:
                    r2 = 10
                    goto L_0x01ee
                L_0x017c:
                    java.lang.String r2 = "countryName"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0186
                    goto L_0x002d
                L_0x0186:
                    r2 = 9
                    goto L_0x01ee
                L_0x018a:
                    java.lang.String r2 = "telephoneNumberDevice"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0194
                    goto L_0x002d
                L_0x0194:
                    r2 = 8
                    goto L_0x01ee
                L_0x0197:
                    java.lang.String r2 = "fullStreetAddress"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x01a1
                    goto L_0x002d
                L_0x01a1:
                    r2 = 7
                    goto L_0x01ee
                L_0x01a3:
                    boolean r2 = r0.equals(r13)
                    if (r2 != 0) goto L_0x01ab
                    goto L_0x002d
                L_0x01ab:
                    r2 = 6
                    goto L_0x01ee
                L_0x01ad:
                    boolean r2 = r0.equals(r14)
                    if (r2 != 0) goto L_0x01b5
                    goto L_0x002d
                L_0x01b5:
                    r2 = 5
                    goto L_0x01ee
                L_0x01b7:
                    boolean r2 = r0.equals(r15)
                    if (r2 != 0) goto L_0x01bf
                    goto L_0x002d
                L_0x01bf:
                    r2 = 4
                    goto L_0x01ee
                L_0x01c1:
                    java.lang.String r2 = "telephoneNumberNational"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x01cb
                    goto L_0x002d
                L_0x01cb:
                    r2 = 3
                    goto L_0x01ee
                L_0x01cd:
                    boolean r2 = r0.equals(r1)
                    if (r2 != 0) goto L_0x01d5
                    goto L_0x002d
                L_0x01d5:
                    r2 = 2
                    goto L_0x01ee
                L_0x01d7:
                    java.lang.String r2 = "oneTimeCode"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x01e1
                    goto L_0x002d
                L_0x01e1:
                    r2 = 1
                    goto L_0x01ee
                L_0x01e3:
                    java.lang.String r2 = "birthdayYear"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x01ed
                    goto L_0x002d
                L_0x01ed:
                    r2 = 0
                L_0x01ee:
                    switch(r2) {
                        case 0: goto L_0x0241;
                        case 1: goto L_0x023e;
                        case 2: goto L_0x023d;
                        case 3: goto L_0x023a;
                        case 4: goto L_0x0239;
                        case 5: goto L_0x0238;
                        case 6: goto L_0x0237;
                        case 7: goto L_0x0234;
                        case 8: goto L_0x0231;
                        case 9: goto L_0x022e;
                        case 10: goto L_0x022b;
                        case 11: goto L_0x0228;
                        case 12: goto L_0x0227;
                        case 13: goto L_0x0224;
                        case 14: goto L_0x0223;
                        case 15: goto L_0x0220;
                        case 16: goto L_0x021d;
                        case 17: goto L_0x021a;
                        case 18: goto L_0x0219;
                        case 19: goto L_0x0218;
                        case 20: goto L_0x0215;
                        case 21: goto L_0x0214;
                        case 22: goto L_0x0211;
                        case 23: goto L_0x020e;
                        case 24: goto L_0x020b;
                        case 25: goto L_0x0208;
                        case 26: goto L_0x0205;
                        case 27: goto L_0x0202;
                        case 28: goto L_0x0201;
                        case 29: goto L_0x01fe;
                        case 30: goto L_0x01fd;
                        case 31: goto L_0x01fa;
                        case 32: goto L_0x01f9;
                        case 33: goto L_0x01f6;
                        case 34: goto L_0x01f5;
                        case 35: goto L_0x01f2;
                        default: goto L_0x01f1;
                    }
                L_0x01f1:
                    return r0
                L_0x01f2:
                    java.lang.String r0 = "birthDateDay"
                    return r0
                L_0x01f5:
                    return r4
                L_0x01f6:
                    java.lang.String r0 = "extendedAddress"
                    return r0
                L_0x01f9:
                    return r5
                L_0x01fa:
                    java.lang.String r0 = "personGivenName"
                    return r0
                L_0x01fd:
                    return r6
                L_0x01fe:
                    java.lang.String r0 = "birthDateFull"
                    return r0
                L_0x0201:
                    return r7
                L_0x0202:
                    java.lang.String r0 = "phoneNumber"
                    return r0
                L_0x0205:
                    java.lang.String r0 = "personFamilyName"
                    return r0
                L_0x0208:
                    java.lang.String r0 = "birthDateMonth"
                    return r0
                L_0x020b:
                    java.lang.String r0 = "addressRegion"
                    return r0
                L_0x020e:
                    java.lang.String r0 = "emailAddress"
                    return r0
                L_0x0211:
                    java.lang.String r0 = "personName"
                    return r0
                L_0x0214:
                    return r8
                L_0x0215:
                    java.lang.String r0 = "phoneCountryCode"
                    return r0
                L_0x0218:
                    return r9
                L_0x0219:
                    return r10
                L_0x021a:
                    java.lang.String r0 = "personNameSuffix"
                    return r0
                L_0x021d:
                    java.lang.String r0 = "personMiddleName"
                    return r0
                L_0x0220:
                    java.lang.String r0 = "personNamePrefix"
                    return r0
                L_0x0223:
                    return r11
                L_0x0224:
                    java.lang.String r0 = "extendedPostalCode"
                    return r0
                L_0x0227:
                    return r12
                L_0x0228:
                    java.lang.String r0 = "addressLocality"
                    return r0
                L_0x022b:
                    java.lang.String r0 = "personMiddleInitial"
                    return r0
                L_0x022e:
                    java.lang.String r0 = "addressCountry"
                    return r0
                L_0x0231:
                    java.lang.String r0 = "phoneNumberDevice"
                    return r0
                L_0x0234:
                    java.lang.String r0 = "streetAddress"
                    return r0
                L_0x0237:
                    return r13
                L_0x0238:
                    return r14
                L_0x0239:
                    return r15
                L_0x023a:
                    java.lang.String r0 = "phoneNational"
                    return r0
                L_0x023d:
                    return r1
                L_0x023e:
                    java.lang.String r0 = "smsOTPCode"
                    return r0
                L_0x0241:
                    java.lang.String r0 = "birthDateYear"
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p174z3.C4591p.C4593b.C4594a.m27612b(java.lang.String):java.lang.String");
            }
        }

        public C4593b(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, C4596d dVar, C4595c cVar, Integer num, String str, C4594a aVar, String[] strArr, C4593b[] bVarArr) {
            this.f23211a = z;
            this.f23212b = z2;
            this.f23213c = z3;
            this.f23214d = z4;
            this.f23215e = z5;
            this.f23216f = dVar;
            this.f23217g = cVar;
            this.f23218h = num;
            this.f23219i = str;
            this.f23220j = aVar;
            this.f23221k = strArr;
            this.f23222l = bVarArr;
        }

        /* renamed from: a */
        public static C4593b m27609a(JSONObject jSONObject) {
            C4593b[] bVarArr;
            JSONObject jSONObject2 = jSONObject;
            String string = jSONObject2.getString("inputAction");
            if (string != null) {
                C4594a aVar = null;
                if (!jSONObject2.isNull("fields")) {
                    JSONArray jSONArray = jSONObject2.getJSONArray("fields");
                    int length = jSONArray.length();
                    C4593b[] bVarArr2 = new C4593b[length];
                    for (int i = 0; i < length; i++) {
                        bVarArr2[i] = m27609a(jSONArray.getJSONObject(i));
                    }
                    bVarArr = bVarArr2;
                } else {
                    bVarArr = null;
                }
                Integer b = m27610b(string);
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArray2 = jSONObject2.isNull("contentCommitMimeTypes") ? null : jSONObject2.getJSONArray("contentCommitMimeTypes");
                if (jSONArray2 != null) {
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        arrayList.add(jSONArray2.optString(i2));
                    }
                }
                boolean optBoolean = jSONObject2.optBoolean("obscureText");
                boolean optBoolean2 = jSONObject2.optBoolean("autocorrect", true);
                boolean optBoolean3 = jSONObject2.optBoolean("enableSuggestions");
                boolean optBoolean4 = jSONObject2.optBoolean("enableIMEPersonalizedLearning");
                boolean optBoolean5 = jSONObject2.optBoolean("enableDeltaModel");
                C4596d b2 = C4596d.m27614b(jSONObject2.getString("textCapitalization"));
                C4595c a = C4595c.m27613a(jSONObject2.getJSONObject("inputType"));
                String string2 = jSONObject2.isNull("actionLabel") ? null : jSONObject2.getString("actionLabel");
                if (!jSONObject2.isNull("autofill")) {
                    aVar = C4594a.m27611a(jSONObject2.getJSONObject("autofill"));
                }
                return new C4593b(optBoolean, optBoolean2, optBoolean3, optBoolean4, optBoolean5, b2, a, b, string2, aVar, (String[]) arrayList.toArray(new String[arrayList.size()]), bVarArr);
            }
            throw new JSONException("Configuration JSON missing 'inputAction' property.");
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
            if (r12.equals("TextInputAction.done") == false) goto L_0x001b;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.Integer m27610b(java.lang.String r12) {
            /*
                r12.hashCode()
                int r0 = r12.hashCode()
                r1 = 7
                r2 = 6
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
                r9 = 0
                java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
                r11 = -1
                switch(r0) {
                    case -810971940: goto L_0x0076;
                    case -737377923: goto L_0x006d;
                    case -737089298: goto L_0x0062;
                    case -737080013: goto L_0x0057;
                    case -736940669: goto L_0x004c;
                    case 469250275: goto L_0x0041;
                    case 1241689507: goto L_0x0036;
                    case 1539450297: goto L_0x002b;
                    case 2110497650: goto L_0x001e;
                    default: goto L_0x001b;
                }
            L_0x001b:
                r7 = r11
                goto L_0x0080
            L_0x001e:
                java.lang.String r0 = "TextInputAction.previous"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x0027
                goto L_0x001b
            L_0x0027:
                r7 = 8
                goto L_0x0080
            L_0x002b:
                java.lang.String r0 = "TextInputAction.newline"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x0034
                goto L_0x001b
            L_0x0034:
                r7 = r1
                goto L_0x0080
            L_0x0036:
                java.lang.String r0 = "TextInputAction.go"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x003f
                goto L_0x001b
            L_0x003f:
                r7 = r2
                goto L_0x0080
            L_0x0041:
                java.lang.String r0 = "TextInputAction.search"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x004a
                goto L_0x001b
            L_0x004a:
                r7 = r3
                goto L_0x0080
            L_0x004c:
                java.lang.String r0 = "TextInputAction.send"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x0055
                goto L_0x001b
            L_0x0055:
                r7 = r4
                goto L_0x0080
            L_0x0057:
                java.lang.String r0 = "TextInputAction.none"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x0060
                goto L_0x001b
            L_0x0060:
                r7 = r5
                goto L_0x0080
            L_0x0062:
                java.lang.String r0 = "TextInputAction.next"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x006b
                goto L_0x001b
            L_0x006b:
                r7 = r6
                goto L_0x0080
            L_0x006d:
                java.lang.String r0 = "TextInputAction.done"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x0080
                goto L_0x001b
            L_0x0076:
                java.lang.String r0 = "TextInputAction.unspecified"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x007f
                goto L_0x001b
            L_0x007f:
                r7 = r9
            L_0x0080:
                switch(r7) {
                    case 0: goto L_0x00a4;
                    case 1: goto L_0x009f;
                    case 2: goto L_0x009a;
                    case 3: goto L_0x0099;
                    case 4: goto L_0x0094;
                    case 5: goto L_0x008f;
                    case 6: goto L_0x008a;
                    case 7: goto L_0x0089;
                    case 8: goto L_0x0084;
                    default: goto L_0x0083;
                }
            L_0x0083:
                return r10
            L_0x0084:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
                return r12
            L_0x0089:
                return r8
            L_0x008a:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
                return r12
            L_0x008f:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
                return r12
            L_0x0094:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
                return r12
            L_0x0099:
                return r8
            L_0x009a:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
                return r12
            L_0x009f:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
                return r12
            L_0x00a4:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: p174z3.C4591p.C4593b.m27610b(java.lang.String):java.lang.Integer");
        }
    }

    /* renamed from: z3.p$c */
    public static class C4595c {

        /* renamed from: a */
        public final C4599g f23227a;

        /* renamed from: b */
        public final boolean f23228b;

        /* renamed from: c */
        public final boolean f23229c;

        public C4595c(C4599g gVar, boolean z, boolean z2) {
            this.f23227a = gVar;
            this.f23228b = z;
            this.f23229c = z2;
        }

        /* renamed from: a */
        public static C4595c m27613a(JSONObject jSONObject) {
            return new C4595c(C4599g.m27628b(jSONObject.getString("name")), jSONObject.optBoolean("signed", false), jSONObject.optBoolean("decimal", false));
        }
    }

    /* renamed from: z3.p$d */
    public enum C4596d {
        CHARACTERS("TextCapitalization.characters"),
        WORDS("TextCapitalization.words"),
        SENTENCES("TextCapitalization.sentences"),
        NONE("TextCapitalization.none");
        

        /* renamed from: f */
        private final String f23235f;

        private C4596d(String str) {
            this.f23235f = str;
        }

        /* renamed from: b */
        static C4596d m27614b(String str) {
            for (C4596d dVar : values()) {
                if (dVar.f23235f.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such TextCapitalization: " + str);
        }
    }

    /* renamed from: z3.p$e */
    public static class C4597e {

        /* renamed from: a */
        public final String f23236a;

        /* renamed from: b */
        public final int f23237b;

        /* renamed from: c */
        public final int f23238c;

        /* renamed from: d */
        public final int f23239d;

        /* renamed from: e */
        public final int f23240e;

        public C4597e(String str, int i, int i2, int i3, int i4) {
            if (!(i == -1 && i2 == -1) && (i < 0 || i2 < 0)) {
                throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i) + ", " + String.valueOf(i2) + ")");
            } else if (!(i3 == -1 && i4 == -1) && (i3 < 0 || i3 > i4)) {
                throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i3) + ", " + String.valueOf(i4) + ")");
            } else if (i4 > str.length()) {
                throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i3));
            } else if (i > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i));
            } else if (i2 <= str.length()) {
                this.f23236a = str;
                this.f23237b = i;
                this.f23238c = i2;
                this.f23239d = i3;
                this.f23240e = i4;
            } else {
                throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i2));
            }
        }

        /* renamed from: a */
        public static C4597e m27615a(JSONObject jSONObject) {
            return new C4597e(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
        }

        /* renamed from: b */
        public boolean mo16267b() {
            int i = this.f23239d;
            return i >= 0 && this.f23240e > i;
        }

        /* renamed from: c */
        public boolean mo16268c() {
            return this.f23237b >= 0;
        }
    }

    /* renamed from: z3.p$f */
    public interface C4598f {
        /* renamed from: a */
        void mo13615a();

        /* renamed from: b */
        void mo13616b();

        /* renamed from: c */
        void mo13617c(C4597e eVar);

        /* renamed from: d */
        void mo13618d(int i, C4593b bVar);

        /* renamed from: e */
        void mo13619e(String str, Bundle bundle);

        /* renamed from: f */
        void mo13620f(int i, boolean z);

        /* renamed from: g */
        void mo13621g(double d, double d2, double[] dArr);

        /* renamed from: h */
        void mo13622h();

        /* renamed from: i */
        void mo13623i(boolean z);

        /* renamed from: j */
        void mo13624j();
    }

    /* renamed from: z3.p$g */
    public enum C4599g {
        TEXT("TextInputType.text"),
        DATETIME("TextInputType.datetime"),
        NAME("TextInputType.name"),
        POSTAL_ADDRESS("TextInputType.address"),
        NUMBER("TextInputType.number"),
        PHONE("TextInputType.phone"),
        MULTILINE("TextInputType.multiline"),
        EMAIL_ADDRESS("TextInputType.emailAddress"),
        URL("TextInputType.url"),
        VISIBLE_PASSWORD("TextInputType.visiblePassword"),
        NONE("TextInputType.none");
        

        /* renamed from: f */
        private final String f23253f;

        private C4599g(String str) {
            this.f23253f = str;
        }

        /* renamed from: b */
        static C4599g m27628b(String str) {
            for (C4599g gVar : values()) {
                if (gVar.f23253f.equals(str)) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such TextInputType: " + str);
        }
    }

    public C4591p(C3832a aVar) {
        C4592a aVar2 = new C4592a();
        this.f23209c = aVar2;
        C0145k kVar = new C0145k(aVar, "flutter/textinput", C0141g.f268a);
        this.f23207a = kVar;
        kVar.mo337e(aVar2);
    }

    /* renamed from: c */
    private static HashMap<Object, Object> m27592c(ArrayList<C2985e> arrayList) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        JSONArray jSONArray = new JSONArray();
        Iterator<C2985e> it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().mo13600b());
        }
        hashMap.put("deltas", jSONArray);
        return hashMap;
    }

    /* renamed from: d */
    private static HashMap<Object, Object> m27593d(String str, int i, int i2, int i3, int i4) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(i));
        hashMap.put("selectionExtent", Integer.valueOf(i2));
        hashMap.put("composingBase", Integer.valueOf(i3));
        hashMap.put("composingExtent", Integer.valueOf(i4));
        return hashMap;
    }

    /* renamed from: b */
    public void mo16252b(int i, Map<String, Object> map) {
        C3768b.m25592f("TextInputChannel", "Sending 'commitContent' message.");
        this.f23207a.mo335c("TextInputClient.performAction", Arrays.asList(new Object[]{Integer.valueOf(i), "TextInputAction.commitContent", map}));
    }

    /* renamed from: e */
    public void mo16253e(int i) {
        C3768b.m25592f("TextInputChannel", "Sending 'done' message.");
        this.f23207a.mo335c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.done"}));
    }

    /* renamed from: f */
    public void mo16254f(int i) {
        C3768b.m25592f("TextInputChannel", "Sending 'go' message.");
        this.f23207a.mo335c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.go"}));
    }

    /* renamed from: g */
    public void mo16255g(int i) {
        C3768b.m25592f("TextInputChannel", "Sending 'newline' message.");
        this.f23207a.mo335c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.newline"}));
    }

    /* renamed from: h */
    public void mo16256h(int i) {
        C3768b.m25592f("TextInputChannel", "Sending 'next' message.");
        this.f23207a.mo335c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.next"}));
    }

    /* renamed from: i */
    public void mo16257i(int i, String str, Bundle bundle) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        if (bundle != null) {
            HashMap hashMap2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    hashMap2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    hashMap2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    hashMap2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    hashMap2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    hashMap2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    hashMap2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    hashMap2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    hashMap2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            hashMap.put("data", hashMap2);
        }
        this.f23207a.mo335c("TextInputClient.performPrivateCommand", Arrays.asList(new Serializable[]{Integer.valueOf(i), hashMap}));
    }

    /* renamed from: j */
    public void mo16258j(int i) {
        C3768b.m25592f("TextInputChannel", "Sending 'previous' message.");
        this.f23207a.mo335c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.previous"}));
    }

    /* renamed from: k */
    public void mo16259k() {
        this.f23207a.mo335c("TextInputClient.requestExistingInputState", (Object) null);
    }

    /* renamed from: l */
    public void mo16260l(int i) {
        C3768b.m25592f("TextInputChannel", "Sending 'search' message.");
        this.f23207a.mo335c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.search"}));
    }

    /* renamed from: m */
    public void mo16261m(int i) {
        C3768b.m25592f("TextInputChannel", "Sending 'send' message.");
        this.f23207a.mo335c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.send"}));
    }

    /* renamed from: n */
    public void mo16262n(C4598f fVar) {
        this.f23208b = fVar;
    }

    /* renamed from: o */
    public void mo16263o(int i) {
        C3768b.m25592f("TextInputChannel", "Sending 'unspecified' message.");
        this.f23207a.mo335c("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i), "TextInputAction.unspecified"}));
    }

    /* renamed from: p */
    public void mo16264p(int i, String str, int i2, int i3, int i4, int i5) {
        C3768b.m25592f("TextInputChannel", "Sending message to update editing state: \nText: " + str + "\nSelection start: " + i2 + "\nSelection end: " + i3 + "\nComposing start: " + i4 + "\nComposing end: " + i5);
        HashMap<Object, Object> d = m27593d(str, i2, i3, i4, i5);
        this.f23207a.mo335c("TextInputClient.updateEditingState", Arrays.asList(new Serializable[]{Integer.valueOf(i), d}));
    }

    /* renamed from: q */
    public void mo16265q(int i, ArrayList<C2985e> arrayList) {
        C3768b.m25592f("TextInputChannel", "Sending message to update editing state with deltas: \nNumber of deltas: " + arrayList.size());
        HashMap<Object, Object> c = m27592c(arrayList);
        this.f23207a.mo335c("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(new Serializable[]{Integer.valueOf(i), c}));
    }

    /* renamed from: r */
    public void mo16266r(int i, HashMap<String, C4597e> hashMap) {
        C3768b.m25592f("TextInputChannel", "Sending message to update editing state for " + String.valueOf(hashMap.size()) + " field(s).");
        HashMap hashMap2 = new HashMap();
        for (Map.Entry next : hashMap.entrySet()) {
            C4597e eVar = (C4597e) next.getValue();
            hashMap2.put((String) next.getKey(), m27593d(eVar.f23236a, eVar.f23237b, eVar.f23238c, -1, -1));
        }
        this.f23207a.mo335c("TextInputClient.updateEditingStateWithTag", Arrays.asList(new Serializable[]{Integer.valueOf(i), hashMap2}));
    }
}
