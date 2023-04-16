package p050g4;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p005a4.C0144j;
import p005a4.C0145k;

/* renamed from: g4.a */
class C2643a implements C0145k.C0149c {

    /* renamed from: a */
    private final SharedPreferences f19015a;

    /* renamed from: b */
    private final ExecutorService f19016b = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Handler f19017c = new Handler(Looper.getMainLooper());

    /* renamed from: g4.a$a */
    class C2644a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ SharedPreferences.Editor f19018f;

        /* renamed from: g */
        final /* synthetic */ C0145k.C0150d f19019g;

        /* renamed from: g4.a$a$a */
        class C2645a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ boolean f19021f;

            C2645a(boolean z) {
                this.f19021f = z;
            }

            public void run() {
                C2644a.this.f19019g.mo338a(Boolean.valueOf(this.f19021f));
            }
        }

        C2644a(SharedPreferences.Editor editor, C0145k.C0150d dVar) {
            this.f19018f = editor;
            this.f19019g = dVar;
        }

        public void run() {
            C2643a.this.f19017c.post(new C2645a(this.f19018f.commit()));
        }
    }

    C2643a(Context context) {
        this.f19015a = context.getSharedPreferences("FlutterSharedPreferences", 0);
    }

    /* renamed from: b */
    private void m21365b(SharedPreferences.Editor editor, C0145k.C0150d dVar) {
        this.f19016b.execute(new C2644a(editor, dVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002b  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<java.lang.String> m21366c(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch:{ ClassNotFoundException -> 0x0022 }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ ClassNotFoundException -> 0x0022 }
            r3 = 0
            byte[] r5 = android.util.Base64.decode(r5, r3)     // Catch:{ ClassNotFoundException -> 0x0022 }
            r2.<init>(r5)     // Catch:{ ClassNotFoundException -> 0x0022 }
            r1.<init>(r2)     // Catch:{ ClassNotFoundException -> 0x0022 }
            java.lang.Object r5 = r1.readObject()     // Catch:{ ClassNotFoundException -> 0x001d, all -> 0x001a }
            java.util.List r5 = (java.util.List) r5     // Catch:{ ClassNotFoundException -> 0x001d, all -> 0x001a }
            r1.close()
            return r5
        L_0x001a:
            r5 = move-exception
            r0 = r1
            goto L_0x0029
        L_0x001d:
            r5 = move-exception
            r0 = r1
            goto L_0x0023
        L_0x0020:
            r5 = move-exception
            goto L_0x0029
        L_0x0022:
            r5 = move-exception
        L_0x0023:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0020 }
            r1.<init>(r5)     // Catch:{ all -> 0x0020 }
            throw r1     // Catch:{ all -> 0x0020 }
        L_0x0029:
            if (r0 == 0) goto L_0x002e
            r0.close()
        L_0x002e:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p050g4.C2643a.m21366c(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m21367d(java.util.List<java.lang.String> r4) {
        /*
            r3 = this;
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0021 }
            r1.<init>()     // Catch:{ all -> 0x0021 }
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0021 }
            r2.<init>(r1)     // Catch:{ all -> 0x0021 }
            r2.writeObject(r4)     // Catch:{ all -> 0x001e }
            r2.flush()     // Catch:{ all -> 0x001e }
            byte[] r4 = r1.toByteArray()     // Catch:{ all -> 0x001e }
            r0 = 0
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r0)     // Catch:{ all -> 0x001e }
            r2.close()
            return r4
        L_0x001e:
            r4 = move-exception
            r0 = r2
            goto L_0x0022
        L_0x0021:
            r4 = move-exception
        L_0x0022:
            if (r0 == 0) goto L_0x0027
            r0.close()
        L_0x0027:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p050g4.C2643a.m21367d(java.util.List):java.lang.String");
    }

    /* renamed from: e */
    private Map<String, Object> m21368e() {
        BigInteger bigInteger;
        Map<String, ?> all = this.f19015a.getAll();
        HashMap hashMap = new HashMap();
        for (String next : all.keySet()) {
            if (next.startsWith("flutter.")) {
                Object obj = all.get(next);
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                        obj = m21366c(str.substring(40));
                    } else if (str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                        bigInteger = new BigInteger(str.substring(44), 36);
                    } else if (str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                        obj = Double.valueOf(str.substring(40));
                    }
                    hashMap.put(next, obj);
                } else {
                    if (obj instanceof Set) {
                        ArrayList arrayList = new ArrayList((Set) obj);
                        SharedPreferences.Editor remove = this.f19015a.edit().remove(next);
                        bigInteger = arrayList;
                        if (!remove.putString(next, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + m21367d(arrayList)).commit()) {
                            throw new IOException("Could not migrate set to list");
                        }
                    }
                    hashMap.put(next, obj);
                }
                obj = bigInteger;
                hashMap.put(next, obj);
            }
        }
        return hashMap;
    }

    /* renamed from: f */
    public void mo12522f() {
        this.f19017c.removeCallbacksAndMessages((Object) null);
        this.f19016b.shutdown();
    }

    public void onMethodCall(C0144j jVar, C0145k.C0150d dVar) {
        SharedPreferences.Editor putBoolean;
        String str = (String) jVar.mo332a("key");
        try {
            String str2 = jVar.f269a;
            char c = 65535;
            switch (str2.hashCode()) {
                case -1354815177:
                    if (str2.equals("commit")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1249367445:
                    if (str2.equals("getAll")) {
                        c = 6;
                        break;
                    }
                    break;
                case -1096934831:
                    if (str2.equals("setStringList")) {
                        c = 4;
                        break;
                    }
                    break;
                case -934610812:
                    if (str2.equals("remove")) {
                        c = 7;
                        break;
                    }
                    break;
                case -905809875:
                    if (str2.equals("setInt")) {
                        c = 2;
                        break;
                    }
                    break;
                case 94746189:
                    if (str2.equals("clear")) {
                        c = 8;
                        break;
                    }
                    break;
                case 155439827:
                    if (str2.equals("setDouble")) {
                        c = 1;
                        break;
                    }
                    break;
                case 589412115:
                    if (str2.equals("setString")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1984457324:
                    if (str2.equals("setBool")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    putBoolean = this.f19015a.edit().putBoolean(str, ((Boolean) jVar.mo332a("value")).booleanValue());
                    break;
                case 1:
                    String d = Double.toString(((Number) jVar.mo332a("value")).doubleValue());
                    SharedPreferences.Editor edit = this.f19015a.edit();
                    putBoolean = edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d);
                    break;
                case 2:
                    Number number = (Number) jVar.mo332a("value");
                    if (!(number instanceof BigInteger)) {
                        putBoolean = this.f19015a.edit().putLong(str, number.longValue());
                        break;
                    } else {
                        SharedPreferences.Editor edit2 = this.f19015a.edit();
                        putBoolean = edit2.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy" + ((BigInteger) number).toString(36));
                        break;
                    }
                case 3:
                    String str3 = (String) jVar.mo332a("value");
                    if (!str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && !str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                        if (!str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                            putBoolean = this.f19015a.edit().putString(str, str3);
                            break;
                        }
                    }
                    dVar.mo339b("StorageError", "This string cannot be stored as it clashes with special identifier prefixes.", (Object) null);
                    return;
                case 4:
                    SharedPreferences.Editor edit3 = this.f19015a.edit();
                    putBoolean = edit3.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + m21367d((List) jVar.mo332a("value")));
                    break;
                case 5:
                    dVar.mo338a(Boolean.TRUE);
                    return;
                case 6:
                    dVar.mo338a(m21368e());
                    return;
                case 7:
                    putBoolean = this.f19015a.edit().remove(str);
                    break;
                case 8:
                    Set<String> keySet = m21368e().keySet();
                    SharedPreferences.Editor edit4 = this.f19015a.edit();
                    for (String remove : keySet) {
                        edit4.remove(remove);
                    }
                    m21365b(edit4, dVar);
                    return;
                default:
                    dVar.mo340c();
                    return;
            }
            m21365b(putBoolean, dVar);
        } catch (IOException e) {
            dVar.mo339b("IOException encountered", jVar.f269a, e);
        }
    }
}
