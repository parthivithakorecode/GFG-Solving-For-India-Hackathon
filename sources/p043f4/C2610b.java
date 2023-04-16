package p043f4;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.core.content.C0604b;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: f4.b */
class C2610b {

    /* renamed from: a */
    private Context f18976a;

    /* renamed from: b */
    private Activity f18977b;

    C2610b(Context context, Activity activity) {
        this.f18976a = context;
        this.f18977b = activity;
    }

    /* renamed from: a */
    private void m21305a() {
        File f = m21310f();
        if (f.exists()) {
            for (File delete : f.listFiles()) {
                delete.delete();
            }
            f.delete();
        }
    }

    /* renamed from: b */
    private static void m21306b(File file, File file2) {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            fileOutputStream = new FileOutputStream(file2);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.close();
                    fileInputStream.close();
                    return;
                }
            }
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
    }

    /* renamed from: c */
    private File m21307c(File file) {
        File f = m21310f();
        if (!f.exists()) {
            f.mkdirs();
        }
        File file2 = new File(f, file.getName());
        m21306b(file, file2);
        return file2;
    }

    /* renamed from: d */
    private boolean m21308d(File file) {
        try {
            String canonicalPath = file.getCanonicalPath();
            File externalFilesDir = this.f18976a.getExternalFilesDir((String) null);
            return externalFilesDir != null && canonicalPath.startsWith(externalFilesDir.getCanonicalPath());
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: e */
    private Context m21309e() {
        Activity activity = this.f18977b;
        if (activity != null) {
            return activity;
        }
        Context context = this.f18976a;
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Both context and activity are null");
    }

    /* renamed from: f */
    private File m21310f() {
        return new File(m21309e().getExternalCacheDir(), "share");
    }

    /* renamed from: g */
    private String m21311g(String str) {
        return (str == null || !str.contains("/")) ? "*" : str.substring(0, str.indexOf("/"));
    }

    /* renamed from: h */
    private ArrayList<Uri> m21312h(List<String> list) {
        ArrayList<Uri> arrayList = new ArrayList<>(list.size());
        for (String file : list) {
            File file2 = new File(file);
            if (!m21308d(file2)) {
                file2 = m21307c(file2);
            }
            Context e = m21309e();
            arrayList.add(C0604b.m2474f(e, m21309e().getPackageName() + ".flutter.share_provider", file2));
        }
        return arrayList;
    }

    /* renamed from: i */
    private String m21313i(List<String> list) {
        if (list.size() <= 1) {
            return list.size() == 1 ? list.get(0) : "*/*";
        }
        String str = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            String str2 = list.get(i);
            if (!str.equals(str2)) {
                if (!m21311g(str2).equals(m21311g(str))) {
                    return "*/*";
                }
                str = m21311g(str2) + "/*";
            }
        }
        return str;
    }

    /* renamed from: m */
    private void m21314m(Intent intent) {
        Activity activity = this.f18977b;
        if (activity != null) {
            activity.startActivity(intent);
        } else if (this.f18976a != null) {
            intent.addFlags(268435456);
            this.f18976a.startActivity(intent);
        } else {
            throw new IllegalStateException("Both context and activity are null");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo12500j(Activity activity) {
        this.f18977b = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo12501k(String str, String str2) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Non-empty text expected");
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.putExtra("android.intent.extra.SUBJECT", str2);
        intent.setType("text/plain");
        m21314m(Intent.createChooser(intent, (CharSequence) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo12502l(List<String> list, List<String> list2, String str, String str2) {
        String str3;
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Non-empty path expected");
        }
        m21305a();
        ArrayList<Uri> h = m21312h(list);
        Intent intent = new Intent();
        if (h.isEmpty()) {
            mo12501k(str, str2);
            return;
        }
        if (h.size() == 1) {
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.STREAM", h.get(0));
            str3 = (list2.isEmpty() || list2.get(0) == null) ? "*/*" : list2.get(0);
        } else {
            intent.setAction("android.intent.action.SEND_MULTIPLE");
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", h);
            str3 = m21313i(list2);
        }
        intent.setType(str3);
        if (str != null) {
            intent.putExtra("android.intent.extra.TEXT", str);
        }
        if (str2 != null) {
            intent.putExtra("android.intent.extra.SUBJECT", str2);
        }
        intent.addFlags(1);
        Intent createChooser = Intent.createChooser(intent, (CharSequence) null);
        for (ResolveInfo resolveInfo : m21309e().getPackageManager().queryIntentActivities(createChooser, 65536)) {
            String str4 = resolveInfo.activityInfo.packageName;
            Iterator<Uri> it = h.iterator();
            while (it.hasNext()) {
                m21309e().grantUriPermission(str4, it.next(), 3);
            }
        }
        m21314m(createChooser);
    }
}
