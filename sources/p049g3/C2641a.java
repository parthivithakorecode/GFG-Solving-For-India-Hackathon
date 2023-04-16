package p049g3;

import android.app.Activity;
import android.content.Intent;
import java.util.ArrayList;
import kotlin.jvm.internal.C3353e;
import kotlin.jvm.internal.C3357i;
import p005a4.C0144j;
import p005a4.C0145k;
import p005a4.C0152m;
import p132s3.C4047a;
import p138t3.C4076a;
import p138t3.C4078c;

/* renamed from: g3.a */
public final class C2641a implements C4047a, C4076a, C0145k.C0149c, C0152m {

    /* renamed from: b */
    public static final C2642a f19012b = new C2642a((C3353e) null);

    /* renamed from: c */
    private static Activity f19013c;

    /* renamed from: a */
    private C0145k.C0150d f19014a;

    /* renamed from: g3.a$a */
    public static final class C2642a {
        private C2642a() {
        }

        public /* synthetic */ C2642a(C3353e eVar) {
            this();
        }
    }

    /* renamed from: b */
    private final String[] m21361b(ArrayList<String> arrayList) {
        Object[] array = arrayList.toArray(new String[arrayList.size()]);
        C3357i.m24507d(array, "r.toArray(arrayOfNulls<String>(r.size))");
        return (String[]) array;
    }

    /* JADX WARNING: type inference failed for: r5v10, types: [android.text.Spanned] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m21362c(p005a4.C0144j r19, p005a4.C0145k.C0150d r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            android.app.Activity r3 = f19013c
            r4 = 0
            if (r3 != 0) goto L_0x0013
            java.lang.String r1 = "error"
            java.lang.String r3 = "Activity == null!"
            r2.mo339b(r1, r3, r4)
            return
        L_0x0013:
            java.lang.String r3 = "body"
            java.lang.Object r3 = r1.mo332a(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r5 = "is_html"
            java.lang.Object r5 = r1.mo332a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            if (r5 != 0) goto L_0x0027
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
        L_0x0027:
            boolean r5 = r5.booleanValue()
            java.lang.String r6 = "attachment_paths"
            java.lang.Object r6 = r1.mo332a(r6)
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            if (r6 != 0) goto L_0x003a
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x003a:
            java.lang.String r7 = "subject"
            java.lang.Object r7 = r1.mo332a(r7)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = "recipients"
            java.lang.Object r8 = r1.mo332a(r8)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.String r9 = "cc"
            java.lang.Object r9 = r1.mo332a(r9)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.lang.String r10 = "bcc"
            java.lang.Object r1 = r1.mo332a(r10)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r10 = 0
            if (r3 == 0) goto L_0x006b
            if (r5 == 0) goto L_0x0069
            android.text.Spanned r5 = androidx.core.text.C0720b.m2909a(r3, r10)
            r17 = r5
            r5 = r3
            r3 = r17
            goto L_0x006d
        L_0x0069:
            r5 = r4
            goto L_0x006d
        L_0x006b:
            r3 = r4
            r5 = r3
        L_0x006d:
            java.util.ArrayList r11 = new java.util.ArrayList
            r12 = 10
            int r13 = p086l4.C3586j.m25035h(r6, r12)
            r11.<init>(r13)
            java.util.Iterator r6 = r6.iterator()
        L_0x007c:
            boolean r13 = r6.hasNext()
            if (r13 == 0) goto L_0x00b5
            java.lang.Object r13 = r6.next()
            java.lang.String r13 = (java.lang.String) r13
            android.app.Activity r14 = f19013c
            kotlin.jvm.internal.C3357i.m24505b(r14)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            android.app.Activity r16 = f19013c
            kotlin.jvm.internal.C3357i.m24505b(r16)
            java.lang.String r4 = r16.getPackageName()
            r15.append(r4)
            java.lang.String r4 = ".file_provider"
            r15.append(r4)
            java.lang.String r4 = r15.toString()
            java.io.File r15 = new java.io.File
            r15.<init>(r13)
            android.net.Uri r4 = androidx.core.content.C0604b.m2474f(r14, r4, r15)
            r11.add(r4)
            r4 = 0
            goto L_0x007c
        L_0x00b5:
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            boolean r6 = r11.isEmpty()
            java.lang.String r13 = "mailto:"
            java.lang.String r14 = "android.intent.action.SENDTO"
            if (r6 == 0) goto L_0x00d0
            r4.setAction(r14)
            android.net.Uri r6 = android.net.Uri.parse(r13)
            r4.setData(r6)
            goto L_0x0163
        L_0x00d0:
            r6 = 1
            r4.addFlags(r6)
            int r15 = r11.size()
            java.lang.String r10 = "android.intent.extra.STREAM"
            if (r15 != r6) goto L_0x0151
            r4.setAction(r14)
            android.net.Uri r15 = android.net.Uri.parse(r13)
            r4.setData(r15)
            java.lang.Object r15 = p086l4.C3593q.m25040k(r11)
            android.os.Parcelable r15 = (android.os.Parcelable) r15
            r4.putExtra(r10, r15)
            android.content.Intent r10 = new android.content.Intent
            android.net.Uri r13 = android.net.Uri.parse(r13)
            r10.<init>(r14, r13)
            r4.setSelector(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            int r12 = p086l4.C3586j.m25035h(r11, r12)
            r10.<init>(r12)
            java.util.Iterator r11 = r11.iterator()
        L_0x0108:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x011d
            java.lang.Object r12 = r11.next()
            android.net.Uri r12 = (android.net.Uri) r12
            android.content.ClipData$Item r13 = new android.content.ClipData$Item
            r13.<init>(r12)
            r10.add(r13)
            goto L_0x0108
        L_0x011d:
            android.content.ClipDescription r11 = new android.content.ClipDescription
            java.lang.String r12 = "application/octet-stream"
            java.lang.String[] r12 = new java.lang.String[]{r12}
            java.lang.String r13 = ""
            r11.<init>(r13, r12)
            android.content.ClipData r12 = new android.content.ClipData
            java.lang.Object r13 = p086l4.C3593q.m25040k(r10)
            android.content.ClipData$Item r13 = (android.content.ClipData.Item) r13
            r12.<init>(r11, r13)
            java.util.List r6 = p086l4.C3593q.m25039j(r10, r6)
            java.util.Iterator r6 = r6.iterator()
        L_0x013d:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x014d
            java.lang.Object r10 = r6.next()
            android.content.ClipData$Item r10 = (android.content.ClipData.Item) r10
            r12.addItem(r10)
            goto L_0x013d
        L_0x014d:
            r4.setClipData(r12)
            goto L_0x0163
        L_0x0151:
            java.lang.String r6 = "android.intent.action.SEND_MULTIPLE"
            r4.setAction(r6)
            java.lang.String r6 = "text/plain"
            r4.setType(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r11)
            r4.putParcelableArrayListExtra(r10, r6)
        L_0x0163:
            if (r3 == 0) goto L_0x016a
            java.lang.String r6 = "android.intent.extra.TEXT"
            r4.putExtra(r6, r3)
        L_0x016a:
            if (r5 == 0) goto L_0x0171
            java.lang.String r3 = "android.intent.extra.HTML_TEXT"
            r4.putExtra(r3, r5)
        L_0x0171:
            if (r7 == 0) goto L_0x0178
            java.lang.String r3 = "android.intent.extra.SUBJECT"
            r4.putExtra(r3, r7)
        L_0x0178:
            if (r8 == 0) goto L_0x0183
            java.lang.String[] r3 = r0.m21361b(r8)
            java.lang.String r5 = "android.intent.extra.EMAIL"
            r4.putExtra(r5, r3)
        L_0x0183:
            if (r9 == 0) goto L_0x018e
            java.lang.String[] r3 = r0.m21361b(r9)
            java.lang.String r5 = "android.intent.extra.CC"
            r4.putExtra(r5, r3)
        L_0x018e:
            if (r1 == 0) goto L_0x0199
            java.lang.String[] r1 = r0.m21361b(r1)
            java.lang.String r3 = "android.intent.extra.BCC"
            r4.putExtra(r3, r1)
        L_0x0199:
            android.app.Activity r1 = f19013c
            if (r1 == 0) goto L_0x01a2
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            goto L_0x01a3
        L_0x01a2:
            r1 = 0
        L_0x01a3:
            if (r1 == 0) goto L_0x01ab
            r3 = 0
            android.content.pm.ResolveInfo r1 = r1.resolveActivity(r4, r3)
            goto L_0x01ac
        L_0x01ab:
            r1 = 0
        L_0x01ac:
            if (r1 == 0) goto L_0x01b8
            android.app.Activity r1 = f19013c
            if (r1 == 0) goto L_0x01c0
            r2 = 607(0x25f, float:8.5E-43)
            r1.startActivityForResult(r4, r2)
            goto L_0x01c0
        L_0x01b8:
            java.lang.String r1 = "not_available"
            java.lang.String r3 = "No email clients found!"
            r4 = 0
            r2.mo339b(r1, r3, r4)
        L_0x01c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p049g3.C2641a.m21362c(a4.j, a4.k$d):void");
    }

    /* renamed from: a */
    public boolean mo342a(int i, int i2, Intent intent) {
        if (i != 607) {
            return false;
        }
        C0145k.C0150d dVar = this.f19014a;
        if (dVar != null) {
            dVar.mo338a((Object) null);
        }
        this.f19014a = null;
        return true;
    }

    public void onAttachedToActivity(C4078c cVar) {
        C3357i.m24508e(cVar, "activityPluginBinding");
        f19013c = cVar.mo13517d();
        cVar.mo13518e(this);
    }

    public void onAttachedToEngine(C4047a.C4049b bVar) {
        C3357i.m24508e(bVar, "binding");
        new C0145k(bVar.mo15540b(), "flutter_email_sender").mo337e(this);
    }

    public void onDetachedFromActivity() {
        f19013c = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        f19013c = null;
    }

    public void onDetachedFromEngine(C4047a.C4049b bVar) {
        C3357i.m24508e(bVar, "binding");
    }

    public void onMethodCall(C0144j jVar, C0145k.C0150d dVar) {
        C3357i.m24508e(jVar, "call");
        C3357i.m24508e(dVar, "result");
        if (C3357i.m24504a(jVar.f269a, "send")) {
            this.f19014a = dVar;
            m21362c(jVar, dVar);
            return;
        }
        dVar.mo340c();
    }

    public void onReattachedToActivityForConfigChanges(C4078c cVar) {
        C3357i.m24508e(cVar, "activityPluginBinding");
        f19013c = cVar.mo13517d();
        cVar.mo13518e(this);
    }
}
