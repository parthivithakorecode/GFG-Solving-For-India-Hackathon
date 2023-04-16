package p092m3;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.security.MessageDigest;
import java.util.HashMap;
import kotlin.jvm.internal.C3353e;
import kotlin.jvm.internal.C3357i;
import p005a4.C0144j;
import p005a4.C0145k;
import p132s3.C4047a;

/* renamed from: m3.a */
public final class C3718a implements C0145k.C0149c, C4047a {

    /* renamed from: c */
    public static final C3719a f21531c = new C3719a((C3353e) null);

    /* renamed from: a */
    private Context f21532a;

    /* renamed from: b */
    private C0145k f21533b;

    /* renamed from: m3.a$a */
    public static final class C3719a {
        private C3719a() {
        }

        public /* synthetic */ C3719a(C3353e eVar) {
            this();
        }
    }

    /* renamed from: a */
    private final String m25412a(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[(bArr.length * 2)];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            cArr2[i2] = cArr[b >>> 4];
            cArr2[i2 + 1] = cArr[b & 15];
        }
        return new String(cArr2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0077, code lost:
        if ((r5.length == 0) != false) goto L_0x0079;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m25413b(android.content.pm.PackageManager r5) {
        /*
            r4 = this;
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            r2 = 28
            if (r1 < r2) goto L_0x005c
            android.content.Context r1 = r4.f21532a     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            kotlin.jvm.internal.C3357i.m24505b(r1)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            r2 = 134217728(0x8000000, float:3.85186E-34)
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r1, r2)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            android.content.pm.SigningInfo r5 = r5.signingInfo     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            if (r5 != 0) goto L_0x001b
            return r0
        L_0x001b:
            boolean r1 = r5.hasMultipleSigners()     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            if (r1 == 0) goto L_0x003e
            android.content.pm.Signature[] r5 = r5.getApkContentsSigners()     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.String r1 = "signingInfo.apkContentsSigners"
            kotlin.jvm.internal.C3357i.m24507d(r5, r1)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.Object r5 = p086l4.C3579e.m24997i(r5)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            android.content.pm.Signature r5 = (android.content.pm.Signature) r5     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            byte[] r5 = r5.toByteArray()     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.String r1 = "signingInfo.apkContentsS…ers.first().toByteArray()"
            kotlin.jvm.internal.C3357i.m24507d(r5, r1)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.String r5 = r4.m25415d(r5)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            goto L_0x005a
        L_0x003e:
            android.content.pm.Signature[] r5 = r5.getSigningCertificateHistory()     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.String r1 = "signingInfo.signingCertificateHistory"
            kotlin.jvm.internal.C3357i.m24507d(r5, r1)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.Object r5 = p086l4.C3579e.m24997i(r5)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            android.content.pm.Signature r5 = (android.content.pm.Signature) r5     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            byte[] r5 = r5.toByteArray()     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.String r1 = "signingInfo.signingCerti…ory.first().toByteArray()"
            kotlin.jvm.internal.C3357i.m24507d(r5, r1)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.String r5 = r4.m25415d(r5)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
        L_0x005a:
            r0 = r5
            goto L_0x00a1
        L_0x005c:
            android.content.Context r1 = r4.f21532a     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            kotlin.jvm.internal.C3357i.m24505b(r1)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            r2 = 64
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r1, r2)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            android.content.pm.Signature[] r5 = r5.signatures     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            r1 = 0
            r2 = 1
            if (r5 == 0) goto L_0x0079
            int r3 = r5.length     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            if (r3 != 0) goto L_0x0076
            r3 = r2
            goto L_0x0077
        L_0x0076:
            r3 = r1
        L_0x0077:
            if (r3 == 0) goto L_0x007a
        L_0x0079:
            r1 = r2
        L_0x007a:
            if (r1 != 0) goto L_0x00a1
            java.lang.String r1 = "packageInfo.signatures"
            kotlin.jvm.internal.C3357i.m24507d(r5, r1)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.Object r1 = p086l4.C3579e.m24997i(r5)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            if (r1 != 0) goto L_0x0088
            goto L_0x00a1
        L_0x0088:
            java.lang.String r1 = "signatures"
            kotlin.jvm.internal.C3357i.m24507d(r5, r1)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.Object r5 = p086l4.C3579e.m24997i(r5)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            android.content.pm.Signature r5 = (android.content.pm.Signature) r5     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            byte[] r5 = r5.toByteArray()     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.String r1 = "signatures.first().toByteArray()"
            kotlin.jvm.internal.C3357i.m24507d(r5, r1)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            java.lang.String r5 = r4.m25415d(r5)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a1 }
            goto L_0x005a
        L_0x00a1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p092m3.C3718a.m25413b(android.content.pm.PackageManager):java.lang.String");
    }

    /* renamed from: c */
    private final long m25414c(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : (long) packageInfo.versionCode;
    }

    /* renamed from: d */
    private final String m25415d(byte[] bArr) {
        MessageDigest instance = MessageDigest.getInstance("SHA1");
        instance.update(bArr);
        byte[] digest = instance.digest();
        C3357i.m24507d(digest, "hashText");
        return m25412a(digest);
    }

    public void onAttachedToEngine(C4047a.C4049b bVar) {
        C3357i.m24508e(bVar, "binding");
        this.f21532a = bVar.mo15539a();
        C0145k kVar = new C0145k(bVar.mo15540b(), "dev.fluttercommunity.plus/package_info");
        this.f21533b = kVar;
        C3357i.m24505b(kVar);
        kVar.mo337e(this);
    }

    public void onDetachedFromEngine(C4047a.C4049b bVar) {
        C3357i.m24508e(bVar, "binding");
        this.f21532a = null;
        C0145k kVar = this.f21533b;
        C3357i.m24505b(kVar);
        kVar.mo337e((C0145k.C0149c) null);
        this.f21533b = null;
    }

    public void onMethodCall(C0144j jVar, C0145k.C0150d dVar) {
        C3357i.m24508e(jVar, "call");
        C3357i.m24508e(dVar, "result");
        try {
            if (C3357i.m24504a(jVar.f269a, "getAll")) {
                Context context = this.f21532a;
                C3357i.m24505b(context);
                PackageManager packageManager = context.getPackageManager();
                Context context2 = this.f21532a;
                C3357i.m24505b(context2);
                PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
                C3357i.m24507d(packageManager, "packageManager");
                String b = m25413b(packageManager);
                HashMap hashMap = new HashMap();
                hashMap.put("appName", packageInfo.applicationInfo.loadLabel(packageManager).toString());
                Context context3 = this.f21532a;
                C3357i.m24505b(context3);
                hashMap.put("packageName", context3.getPackageName());
                hashMap.put("version", packageInfo.versionName);
                C3357i.m24507d(packageInfo, "info");
                hashMap.put("buildNumber", String.valueOf(m25414c(packageInfo)));
                if (b != null) {
                    hashMap.put("buildSignature", b);
                }
                dVar.mo338a(hashMap);
                return;
            }
            dVar.mo340c();
        } catch (PackageManager.NameNotFoundException e) {
            dVar.mo339b("Name not found", e.getMessage(), (Object) null);
        }
    }
}
