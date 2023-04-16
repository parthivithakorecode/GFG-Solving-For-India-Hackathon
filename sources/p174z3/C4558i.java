package p174z3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p005a4.C0141g;
import p005a4.C0145k;
import p099n3.C3768b;
import p106o3.C3832a;

/* renamed from: z3.i */
public class C4558i {

    /* renamed from: a */
    public final C0145k f23096a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4566h f23097b;

    /* renamed from: c */
    final C0145k.C0149c f23098c;

    /* renamed from: z3.i$a */
    class C4559a implements C0145k.C0149c {
        C4559a() {
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(2:58|59) */
        /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f0, code lost:
            r7.mo338a((java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
            r7.mo339b("error", "No such clipboard content format: " + r6, (java.lang.Object) null);
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x00fe */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x011f A[Catch:{ JSONException -> 0x0216 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onMethodCall(p005a4.C0144j r6, p005a4.C0145k.C0150d r7) {
            /*
                r5 = this;
                java.lang.String r0 = "error"
                z3.i r1 = p174z3.C4558i.this
                z3.i$h r1 = r1.f23097b
                if (r1 != 0) goto L_0x000b
                return
            L_0x000b:
                java.lang.String r1 = r6.f269a
                java.lang.Object r6 = r6.f270b
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Received '"
                r2.append(r3)
                r2.append(r1)
                java.lang.String r3 = "' message."
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "PlatformChannel"
                p099n3.C3768b.m25592f(r3, r2)
                r2 = -1
                r3 = 0
                int r4 = r1.hashCode()     // Catch:{ JSONException -> 0x0216 }
                switch(r4) {
                    case -766342101: goto L_0x00b4;
                    case -720677196: goto L_0x00a9;
                    case -577225884: goto L_0x009f;
                    case -548468504: goto L_0x0095;
                    case -247230243: goto L_0x008b;
                    case -215273374: goto L_0x0081;
                    case 241845679: goto L_0x0077;
                    case 875995648: goto L_0x006c;
                    case 1128339786: goto L_0x0062;
                    case 1390477857: goto L_0x0057;
                    case 1514180520: goto L_0x004b;
                    case 1674312266: goto L_0x0040;
                    case 2119655719: goto L_0x0035;
                    default: goto L_0x0033;
                }     // Catch:{ JSONException -> 0x0216 }
            L_0x0033:
                goto L_0x00be
            L_0x0035:
                java.lang.String r4 = "SystemChrome.setPreferredOrientations"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 2
                goto L_0x00be
            L_0x0040:
                java.lang.String r4 = "SystemChrome.setEnabledSystemUIOverlays"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 4
                goto L_0x00be
            L_0x004b:
                java.lang.String r4 = "Clipboard.getData"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 10
                goto L_0x00be
            L_0x0057:
                java.lang.String r4 = "SystemChrome.setSystemUIOverlayStyle"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 8
                goto L_0x00be
            L_0x0062:
                java.lang.String r4 = "SystemChrome.setEnabledSystemUIMode"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 5
                goto L_0x00be
            L_0x006c:
                java.lang.String r4 = "Clipboard.hasStrings"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 12
                goto L_0x00be
            L_0x0077:
                java.lang.String r4 = "SystemChrome.restoreSystemUIOverlays"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 7
                goto L_0x00be
            L_0x0081:
                java.lang.String r4 = "SystemSound.play"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 0
                goto L_0x00be
            L_0x008b:
                java.lang.String r4 = "HapticFeedback.vibrate"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 1
                goto L_0x00be
            L_0x0095:
                java.lang.String r4 = "SystemChrome.setApplicationSwitcherDescription"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 3
                goto L_0x00be
            L_0x009f:
                java.lang.String r4 = "SystemChrome.setSystemUIChangeListener"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 6
                goto L_0x00be
            L_0x00a9:
                java.lang.String r4 = "Clipboard.setData"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 11
                goto L_0x00be
            L_0x00b4:
                java.lang.String r4 = "SystemNavigator.pop"
                boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x0216 }
                if (r1 == 0) goto L_0x00be
                r2 = 9
            L_0x00be:
                java.lang.String r1 = "text"
                switch(r2) {
                    case 0: goto L_0x01fc;
                    case 1: goto L_0x01e2;
                    case 2: goto L_0x01c4;
                    case 3: goto L_0x01a8;
                    case 4: goto L_0x018a;
                    case 5: goto L_0x016c;
                    case 6: goto L_0x0162;
                    case 7: goto L_0x0158;
                    case 8: goto L_0x0136;
                    case 9: goto L_0x012c;
                    case 10: goto L_0x00f5;
                    case 11: goto L_0x00e1;
                    case 12: goto L_0x00c8;
                    default: goto L_0x00c3;
                }
            L_0x00c3:
                r7.mo340c()     // Catch:{ JSONException -> 0x0216 }
                goto L_0x022f
            L_0x00c8:
                z3.i r6 = p174z3.C4558i.this     // Catch:{ JSONException -> 0x0216 }
                z3.i$h r6 = r6.f23097b     // Catch:{ JSONException -> 0x0216 }
                boolean r6 = r6.mo13656m()     // Catch:{ JSONException -> 0x0216 }
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0216 }
                r1.<init>()     // Catch:{ JSONException -> 0x0216 }
                java.lang.String r2 = "value"
                r1.put(r2, r6)     // Catch:{ JSONException -> 0x0216 }
                r7.mo338a(r1)     // Catch:{ JSONException -> 0x0216 }
                goto L_0x022f
            L_0x00e1:
                org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ JSONException -> 0x0216 }
                java.lang.String r6 = r6.getString(r1)     // Catch:{ JSONException -> 0x0216 }
                z3.i r1 = p174z3.C4558i.this     // Catch:{ JSONException -> 0x0216 }
                z3.i$h r1 = r1.f23097b     // Catch:{ JSONException -> 0x0216 }
                r1.mo13651h(r6)     // Catch:{ JSONException -> 0x0216 }
            L_0x00f0:
                r7.mo338a(r3)     // Catch:{ JSONException -> 0x0216 }
                goto L_0x022f
            L_0x00f5:
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ JSONException -> 0x0216 }
                if (r6 == 0) goto L_0x0112
                z3.i$e r6 = p174z3.C4558i.C4563e.m27522b(r6)     // Catch:{ NoSuchFieldException -> 0x00fe }
                goto L_0x0113
            L_0x00fe:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0216 }
                r2.<init>()     // Catch:{ JSONException -> 0x0216 }
                java.lang.String r4 = "No such clipboard content format: "
                r2.append(r4)     // Catch:{ JSONException -> 0x0216 }
                r2.append(r6)     // Catch:{ JSONException -> 0x0216 }
                java.lang.String r6 = r2.toString()     // Catch:{ JSONException -> 0x0216 }
                r7.mo339b(r0, r6, r3)     // Catch:{ JSONException -> 0x0216 }
            L_0x0112:
                r6 = r3
            L_0x0113:
                z3.i r2 = p174z3.C4558i.this     // Catch:{ JSONException -> 0x0216 }
                z3.i$h r2 = r2.f23097b     // Catch:{ JSONException -> 0x0216 }
                java.lang.CharSequence r6 = r2.mo13644a(r6)     // Catch:{ JSONException -> 0x0216 }
                if (r6 == 0) goto L_0x00f0
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0216 }
                r2.<init>()     // Catch:{ JSONException -> 0x0216 }
                r2.put(r1, r6)     // Catch:{ JSONException -> 0x0216 }
                r7.mo338a(r2)     // Catch:{ JSONException -> 0x0216 }
                goto L_0x022f
            L_0x012c:
                z3.i r6 = p174z3.C4558i.this     // Catch:{ JSONException -> 0x0216 }
                z3.i$h r6 = r6.f23097b     // Catch:{ JSONException -> 0x0216 }
                r6.mo13645b()     // Catch:{ JSONException -> 0x0216 }
                goto L_0x00f0
            L_0x0136:
                z3.i r1 = p174z3.C4558i.this     // Catch:{ JSONException -> 0x014e, NoSuchFieldException -> 0x014c }
                org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ JSONException -> 0x014e, NoSuchFieldException -> 0x014c }
                z3.i$j r6 = r1.m27516i(r6)     // Catch:{ JSONException -> 0x014e, NoSuchFieldException -> 0x014c }
                z3.i r1 = p174z3.C4558i.this     // Catch:{ JSONException -> 0x014e, NoSuchFieldException -> 0x014c }
                z3.i$h r1 = r1.f23097b     // Catch:{ JSONException -> 0x014e, NoSuchFieldException -> 0x014c }
                r1.mo13654k(r6)     // Catch:{ JSONException -> 0x014e, NoSuchFieldException -> 0x014c }
                r7.mo338a(r3)     // Catch:{ JSONException -> 0x014e, NoSuchFieldException -> 0x014c }
                goto L_0x022f
            L_0x014c:
                r6 = move-exception
                goto L_0x014f
            L_0x014e:
                r6 = move-exception
            L_0x014f:
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0216 }
            L_0x0153:
                r7.mo339b(r0, r6, r3)     // Catch:{ JSONException -> 0x0216 }
                goto L_0x022f
            L_0x0158:
                z3.i r6 = p174z3.C4558i.this     // Catch:{ JSONException -> 0x0216 }
                z3.i$h r6 = r6.f23097b     // Catch:{ JSONException -> 0x0216 }
                r6.mo13650g()     // Catch:{ JSONException -> 0x0216 }
                goto L_0x00f0
            L_0x0162:
                z3.i r6 = p174z3.C4558i.this     // Catch:{ JSONException -> 0x0216 }
                z3.i$h r6 = r6.f23097b     // Catch:{ JSONException -> 0x0216 }
                r6.mo13649f()     // Catch:{ JSONException -> 0x0216 }
                goto L_0x00f0
            L_0x016c:
                z3.i r1 = p174z3.C4558i.this     // Catch:{ JSONException -> 0x0184, NoSuchFieldException -> 0x0182 }
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ JSONException -> 0x0184, NoSuchFieldException -> 0x0182 }
                z3.i$k r6 = r1.m27517j(r6)     // Catch:{ JSONException -> 0x0184, NoSuchFieldException -> 0x0182 }
                z3.i r1 = p174z3.C4558i.this     // Catch:{ JSONException -> 0x0184, NoSuchFieldException -> 0x0182 }
                z3.i$h r1 = r1.f23097b     // Catch:{ JSONException -> 0x0184, NoSuchFieldException -> 0x0182 }
                r1.mo13647d(r6)     // Catch:{ JSONException -> 0x0184, NoSuchFieldException -> 0x0182 }
                r7.mo338a(r3)     // Catch:{ JSONException -> 0x0184, NoSuchFieldException -> 0x0182 }
                goto L_0x022f
            L_0x0182:
                r6 = move-exception
                goto L_0x0185
            L_0x0184:
                r6 = move-exception
            L_0x0185:
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0216 }
                goto L_0x0153
            L_0x018a:
                z3.i r1 = p174z3.C4558i.this     // Catch:{ JSONException -> 0x01a2, NoSuchFieldException -> 0x01a0 }
                org.json.JSONArray r6 = (org.json.JSONArray) r6     // Catch:{ JSONException -> 0x01a2, NoSuchFieldException -> 0x01a0 }
                java.util.List r6 = r1.m27518k(r6)     // Catch:{ JSONException -> 0x01a2, NoSuchFieldException -> 0x01a0 }
                z3.i r1 = p174z3.C4558i.this     // Catch:{ JSONException -> 0x01a2, NoSuchFieldException -> 0x01a0 }
                z3.i$h r1 = r1.f23097b     // Catch:{ JSONException -> 0x01a2, NoSuchFieldException -> 0x01a0 }
                r1.mo13646c(r6)     // Catch:{ JSONException -> 0x01a2, NoSuchFieldException -> 0x01a0 }
                r7.mo338a(r3)     // Catch:{ JSONException -> 0x01a2, NoSuchFieldException -> 0x01a0 }
                goto L_0x022f
            L_0x01a0:
                r6 = move-exception
                goto L_0x01a3
            L_0x01a2:
                r6 = move-exception
            L_0x01a3:
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0216 }
                goto L_0x0153
            L_0x01a8:
                z3.i r1 = p174z3.C4558i.this     // Catch:{ JSONException -> 0x01be }
                org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ JSONException -> 0x01be }
                z3.i$c r6 = r1.m27514g(r6)     // Catch:{ JSONException -> 0x01be }
                z3.i r1 = p174z3.C4558i.this     // Catch:{ JSONException -> 0x01be }
                z3.i$h r1 = r1.f23097b     // Catch:{ JSONException -> 0x01be }
                r1.mo13653j(r6)     // Catch:{ JSONException -> 0x01be }
                r7.mo338a(r3)     // Catch:{ JSONException -> 0x01be }
                goto L_0x022f
            L_0x01be:
                r6 = move-exception
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0216 }
                goto L_0x0153
            L_0x01c4:
                z3.i r1 = p174z3.C4558i.this     // Catch:{ JSONException -> 0x01db, NoSuchFieldException -> 0x01d9 }
                org.json.JSONArray r6 = (org.json.JSONArray) r6     // Catch:{ JSONException -> 0x01db, NoSuchFieldException -> 0x01d9 }
                int r6 = r1.m27515h(r6)     // Catch:{ JSONException -> 0x01db, NoSuchFieldException -> 0x01d9 }
                z3.i r1 = p174z3.C4558i.this     // Catch:{ JSONException -> 0x01db, NoSuchFieldException -> 0x01d9 }
                z3.i$h r1 = r1.f23097b     // Catch:{ JSONException -> 0x01db, NoSuchFieldException -> 0x01d9 }
                r1.mo13655l(r6)     // Catch:{ JSONException -> 0x01db, NoSuchFieldException -> 0x01d9 }
                r7.mo338a(r3)     // Catch:{ JSONException -> 0x01db, NoSuchFieldException -> 0x01d9 }
                goto L_0x022f
            L_0x01d9:
                r6 = move-exception
                goto L_0x01dc
            L_0x01db:
                r6 = move-exception
            L_0x01dc:
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0216 }
                goto L_0x0153
            L_0x01e2:
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ NoSuchFieldException -> 0x01f5 }
                z3.i$g r6 = p174z3.C4558i.C4565g.m27524b(r6)     // Catch:{ NoSuchFieldException -> 0x01f5 }
                z3.i r1 = p174z3.C4558i.this     // Catch:{ NoSuchFieldException -> 0x01f5 }
                z3.i$h r1 = r1.f23097b     // Catch:{ NoSuchFieldException -> 0x01f5 }
                r1.mo13652i(r6)     // Catch:{ NoSuchFieldException -> 0x01f5 }
                r7.mo338a(r3)     // Catch:{ NoSuchFieldException -> 0x01f5 }
                goto L_0x022f
            L_0x01f5:
                r6 = move-exception
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0216 }
                goto L_0x0153
            L_0x01fc:
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ NoSuchFieldException -> 0x020f }
                z3.i$i r6 = p174z3.C4558i.C4567i.m27538b(r6)     // Catch:{ NoSuchFieldException -> 0x020f }
                z3.i r1 = p174z3.C4558i.this     // Catch:{ NoSuchFieldException -> 0x020f }
                z3.i$h r1 = r1.f23097b     // Catch:{ NoSuchFieldException -> 0x020f }
                r1.mo13648e(r6)     // Catch:{ NoSuchFieldException -> 0x020f }
                r7.mo338a(r3)     // Catch:{ NoSuchFieldException -> 0x020f }
                goto L_0x022f
            L_0x020f:
                r6 = move-exception
                java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x0216 }
                goto L_0x0153
            L_0x0216:
                r6 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "JSON error: "
                r1.append(r2)
                java.lang.String r6 = r6.getMessage()
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                r7.mo339b(r0, r6, r3)
            L_0x022f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p174z3.C4558i.C4559a.onMethodCall(a4.j, a4.k$d):void");
        }
    }

    /* renamed from: z3.i$b */
    static /* synthetic */ class C4560b {

        /* renamed from: a */
        static final /* synthetic */ int[] f23100a;

        /* renamed from: b */
        static final /* synthetic */ int[] f23101b;

        /* renamed from: c */
        static final /* synthetic */ int[] f23102c;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0069 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0073 */
        static {
            /*
                z3.i$k[] r0 = p174z3.C4558i.C4569k.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23102c = r0
                r1 = 1
                z3.i$k r2 = p174z3.C4558i.C4569k.LEAN_BACK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f23102c     // Catch:{ NoSuchFieldError -> 0x001d }
                z3.i$k r3 = p174z3.C4558i.C4569k.IMMERSIVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f23102c     // Catch:{ NoSuchFieldError -> 0x0028 }
                z3.i$k r4 = p174z3.C4558i.C4569k.IMMERSIVE_STICKY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f23102c     // Catch:{ NoSuchFieldError -> 0x0033 }
                z3.i$k r5 = p174z3.C4558i.C4569k.EDGE_TO_EDGE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                z3.i$l[] r4 = p174z3.C4558i.C4570l.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f23101b = r4
                z3.i$l r5 = p174z3.C4558i.C4570l.TOP_OVERLAYS     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r4 = f23101b     // Catch:{ NoSuchFieldError -> 0x004e }
                z3.i$l r5 = p174z3.C4558i.C4570l.BOTTOM_OVERLAYS     // Catch:{ NoSuchFieldError -> 0x004e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                z3.i$f[] r4 = p174z3.C4558i.C4564f.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f23100a = r4
                z3.i$f r5 = p174z3.C4558i.C4564f.PORTRAIT_UP     // Catch:{ NoSuchFieldError -> 0x005f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x005f }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x005f }
            L_0x005f:
                int[] r1 = f23100a     // Catch:{ NoSuchFieldError -> 0x0069 }
                z3.i$f r4 = p174z3.C4558i.C4564f.PORTRAIT_DOWN     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                int[] r0 = f23100a     // Catch:{ NoSuchFieldError -> 0x0073 }
                z3.i$f r1 = p174z3.C4558i.C4564f.LANDSCAPE_LEFT     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                int[] r0 = f23100a     // Catch:{ NoSuchFieldError -> 0x007d }
                z3.i$f r1 = p174z3.C4558i.C4564f.LANDSCAPE_RIGHT     // Catch:{ NoSuchFieldError -> 0x007d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p174z3.C4558i.C4560b.<clinit>():void");
        }
    }

    /* renamed from: z3.i$c */
    public static class C4561c {

        /* renamed from: a */
        public final int f23103a;

        /* renamed from: b */
        public final String f23104b;

        public C4561c(int i, String str) {
            this.f23103a = i;
            this.f23104b = str;
        }
    }

    /* renamed from: z3.i$d */
    public enum C4562d {
        LIGHT("Brightness.light"),
        DARK("Brightness.dark");
        

        /* renamed from: f */
        private String f23108f;

        private C4562d(String str) {
            this.f23108f = str;
        }

        /* renamed from: b */
        static C4562d m27521b(String str) {
            for (C4562d dVar : values()) {
                if (dVar.f23108f.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such Brightness: " + str);
        }
    }

    /* renamed from: z3.i$e */
    public enum C4563e {
        PLAIN_TEXT("text/plain");
        

        /* renamed from: f */
        private String f23111f;

        private C4563e(String str) {
            this.f23111f = str;
        }

        /* renamed from: b */
        static C4563e m27522b(String str) {
            for (C4563e eVar : values()) {
                if (eVar.f23111f.equals(str)) {
                    return eVar;
                }
            }
            throw new NoSuchFieldException("No such ClipboardContentFormat: " + str);
        }
    }

    /* renamed from: z3.i$f */
    public enum C4564f {
        PORTRAIT_UP("DeviceOrientation.portraitUp"),
        PORTRAIT_DOWN("DeviceOrientation.portraitDown"),
        LANDSCAPE_LEFT("DeviceOrientation.landscapeLeft"),
        LANDSCAPE_RIGHT("DeviceOrientation.landscapeRight");
        

        /* renamed from: f */
        private String f23117f;

        private C4564f(String str) {
            this.f23117f = str;
        }

        /* renamed from: b */
        static C4564f m27523b(String str) {
            for (C4564f fVar : values()) {
                if (fVar.f23117f.equals(str)) {
                    return fVar;
                }
            }
            throw new NoSuchFieldException("No such DeviceOrientation: " + str);
        }
    }

    /* renamed from: z3.i$g */
    public enum C4565g {
        STANDARD((String) null),
        LIGHT_IMPACT("HapticFeedbackType.lightImpact"),
        MEDIUM_IMPACT("HapticFeedbackType.mediumImpact"),
        HEAVY_IMPACT("HapticFeedbackType.heavyImpact"),
        SELECTION_CLICK("HapticFeedbackType.selectionClick");
        

        /* renamed from: f */
        private final String f23124f;

        private C4565g(String str) {
            this.f23124f = str;
        }

        /* renamed from: b */
        static C4565g m27524b(String str) {
            for (C4565g gVar : values()) {
                String str2 = gVar.f23124f;
                if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such HapticFeedbackType: " + str);
        }
    }

    /* renamed from: z3.i$h */
    public interface C4566h {
        /* renamed from: a */
        CharSequence mo13644a(C4563e eVar);

        /* renamed from: b */
        void mo13645b();

        /* renamed from: c */
        void mo13646c(List<C4570l> list);

        /* renamed from: d */
        void mo13647d(C4569k kVar);

        /* renamed from: e */
        void mo13648e(C4567i iVar);

        /* renamed from: f */
        void mo13649f();

        /* renamed from: g */
        void mo13650g();

        /* renamed from: h */
        void mo13651h(String str);

        /* renamed from: i */
        void mo13652i(C4565g gVar);

        /* renamed from: j */
        void mo13653j(C4561c cVar);

        /* renamed from: k */
        void mo13654k(C4568j jVar);

        /* renamed from: l */
        void mo13655l(int i);

        /* renamed from: m */
        boolean mo13656m();
    }

    /* renamed from: z3.i$i */
    public enum C4567i {
        CLICK("SystemSoundType.click"),
        ALERT("SystemSoundType.alert");
        

        /* renamed from: f */
        private final String f23128f;

        private C4567i(String str) {
            this.f23128f = str;
        }

        /* renamed from: b */
        static C4567i m27538b(String str) {
            for (C4567i iVar : values()) {
                if (iVar.f23128f.equals(str)) {
                    return iVar;
                }
            }
            throw new NoSuchFieldException("No such SoundType: " + str);
        }
    }

    /* renamed from: z3.i$j */
    public static class C4568j {

        /* renamed from: a */
        public final Integer f23129a;

        /* renamed from: b */
        public final C4562d f23130b;

        /* renamed from: c */
        public final Boolean f23131c;

        /* renamed from: d */
        public final Integer f23132d;

        /* renamed from: e */
        public final C4562d f23133e;

        /* renamed from: f */
        public final Integer f23134f;

        /* renamed from: g */
        public final Boolean f23135g;

        public C4568j(Integer num, C4562d dVar, Boolean bool, Integer num2, C4562d dVar2, Integer num3, Boolean bool2) {
            this.f23129a = num;
            this.f23130b = dVar;
            this.f23131c = bool;
            this.f23132d = num2;
            this.f23133e = dVar2;
            this.f23134f = num3;
            this.f23135g = bool2;
        }
    }

    /* renamed from: z3.i$k */
    public enum C4569k {
        LEAN_BACK("SystemUiMode.leanBack"),
        IMMERSIVE("SystemUiMode.immersive"),
        IMMERSIVE_STICKY("SystemUiMode.immersiveSticky"),
        EDGE_TO_EDGE("SystemUiMode.edgeToEdge");
        

        /* renamed from: f */
        private String f23141f;

        private C4569k(String str) {
            this.f23141f = str;
        }

        /* renamed from: b */
        static C4569k m27539b(String str) {
            for (C4569k kVar : values()) {
                if (kVar.f23141f.equals(str)) {
                    return kVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiMode: " + str);
        }
    }

    /* renamed from: z3.i$l */
    public enum C4570l {
        TOP_OVERLAYS("SystemUiOverlay.top"),
        BOTTOM_OVERLAYS("SystemUiOverlay.bottom");
        

        /* renamed from: f */
        private String f23145f;

        private C4570l(String str) {
            this.f23145f = str;
        }

        /* renamed from: b */
        static C4570l m27540b(String str) {
            for (C4570l lVar : values()) {
                if (lVar.f23145f.equals(str)) {
                    return lVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiOverlay: " + str);
        }
    }

    public C4558i(C3832a aVar) {
        C4559a aVar2 = new C4559a();
        this.f23098c = aVar2;
        C0145k kVar = new C0145k(aVar, "flutter/platform", C0141g.f268a);
        this.f23096a = kVar;
        kVar.mo337e(aVar2);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public C4561c m27514g(JSONObject jSONObject) {
        int i = jSONObject.getInt("primaryColor");
        if (i != 0) {
            i |= -16777216;
        }
        return new C4561c(i, jSONObject.getString("label"));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0056, code lost:
        return 0;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int m27515h(org.json.JSONArray r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = r0
            r2 = r1
            r3 = r2
        L_0x0004:
            int r4 = r10.length()
            r5 = 4
            r6 = 2
            r7 = 1
            if (r1 >= r4) goto L_0x0038
            java.lang.String r4 = r10.getString(r1)
            z3.i$f r4 = p174z3.C4558i.C4564f.m27523b(r4)
            int[] r8 = p174z3.C4558i.C4560b.f23100a
            int r4 = r4.ordinal()
            r4 = r8[r4]
            if (r4 == r7) goto L_0x0030
            if (r4 == r6) goto L_0x002d
            r6 = 3
            if (r4 == r6) goto L_0x002a
            if (r4 == r5) goto L_0x0027
            goto L_0x0032
        L_0x0027:
            r2 = r2 | 8
            goto L_0x0032
        L_0x002a:
            r2 = r2 | 2
            goto L_0x0032
        L_0x002d:
            r2 = r2 | 4
            goto L_0x0032
        L_0x0030:
            r2 = r2 | 1
        L_0x0032:
            if (r3 != 0) goto L_0x0035
            r3 = r2
        L_0x0035:
            int r1 = r1 + 1
            goto L_0x0004
        L_0x0038:
            if (r2 == 0) goto L_0x0057
            r10 = 9
            r1 = 8
            switch(r2) {
                case 2: goto L_0x0056;
                case 3: goto L_0x004d;
                case 4: goto L_0x004c;
                case 5: goto L_0x004a;
                case 6: goto L_0x004d;
                case 7: goto L_0x004d;
                case 8: goto L_0x0049;
                case 9: goto L_0x004d;
                case 10: goto L_0x0046;
                case 11: goto L_0x0045;
                case 12: goto L_0x004d;
                case 13: goto L_0x004d;
                case 14: goto L_0x004d;
                case 15: goto L_0x0042;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x0053
        L_0x0042:
            r10 = 13
            return r10
        L_0x0045:
            return r6
        L_0x0046:
            r10 = 11
            return r10
        L_0x0049:
            return r1
        L_0x004a:
            r10 = 12
        L_0x004c:
            return r10
        L_0x004d:
            if (r3 == r6) goto L_0x0056
            if (r3 == r5) goto L_0x0055
            if (r3 == r1) goto L_0x0054
        L_0x0053:
            return r7
        L_0x0054:
            return r1
        L_0x0055:
            return r10
        L_0x0056:
            return r0
        L_0x0057:
            r10 = -1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p174z3.C4558i.m27515h(org.json.JSONArray):int");
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public C4568j m27516i(JSONObject jSONObject) {
        Boolean bool = null;
        Integer valueOf = !jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null;
        C4562d b = !jSONObject.isNull("statusBarIconBrightness") ? C4562d.m27521b(jSONObject.getString("statusBarIconBrightness")) : null;
        Boolean valueOf2 = !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null;
        Integer valueOf3 = !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null;
        C4562d b2 = !jSONObject.isNull("systemNavigationBarIconBrightness") ? C4562d.m27521b(jSONObject.getString("systemNavigationBarIconBrightness")) : null;
        Integer valueOf4 = !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null;
        if (!jSONObject.isNull("systemNavigationBarContrastEnforced")) {
            bool = Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced"));
        }
        return new C4568j(valueOf, b, valueOf2, valueOf3, b2, valueOf4, bool);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public C4569k m27517j(String str) {
        int i = C4560b.f23102c[C4569k.m27539b(str).ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? C4569k.EDGE_TO_EDGE : C4569k.EDGE_TO_EDGE : C4569k.IMMERSIVE_STICKY : C4569k.IMMERSIVE : C4569k.LEAN_BACK;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public List<C4570l> m27518k(JSONArray jSONArray) {
        C4570l lVar;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            int i2 = C4560b.f23101b[C4570l.m27540b(jSONArray.getString(i)).ordinal()];
            if (i2 == 1) {
                lVar = C4570l.TOP_OVERLAYS;
            } else if (i2 != 2) {
            } else {
                lVar = C4570l.BOTTOM_OVERLAYS;
            }
            arrayList.add(lVar);
        }
        return arrayList;
    }

    /* renamed from: l */
    public void mo16235l(C4566h hVar) {
        this.f23097b = hVar;
    }

    /* renamed from: m */
    public void mo16236m(boolean z) {
        C3768b.m25592f("PlatformChannel", "Sending 'systemUIChange' message.");
        this.f23096a.mo335c("SystemChrome.systemUIChange", Arrays.asList(new Boolean[]{Boolean.valueOf(z)}));
    }
}
