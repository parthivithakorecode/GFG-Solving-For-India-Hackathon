package androidx.core.provider;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.core.content.res.C0615e;
import androidx.core.provider.C0708g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: androidx.core.provider.d */
class C0699d {

    /* renamed from: a */
    private static final Comparator<byte[]> f2036a = C0698c.f2035f;

    /* renamed from: androidx.core.provider.d$a */
    static class C0700a {
        /* renamed from: a */
        static Cursor m2853a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    /* renamed from: b */
    private static List<byte[]> m2846b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: c */
    private static boolean m2847c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static List<List<byte[]>> m2848d(C0701e eVar, Resources resources) {
        return eVar.mo2698b() != null ? eVar.mo2698b() : C0615e.m2537c(resources, eVar.mo2699c());
    }

    /* renamed from: e */
    static C0708g.C0709a m2849e(Context context, C0701e eVar, CancellationSignal cancellationSignal) {
        ProviderInfo f = m2850f(context.getPackageManager(), eVar, context.getResources());
        return f == null ? C0708g.C0709a.m2874a(1, (C0708g.C0710b[]) null) : C0708g.C0709a.m2874a(0, m2852h(context, eVar, f.authority, cancellationSignal));
    }

    /* renamed from: f */
    static ProviderInfo m2850f(PackageManager packageManager, C0701e eVar, Resources resources) {
        String e = eVar.mo2701e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(e, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + e);
        } else if (resolveContentProvider.packageName.equals(eVar.mo2702f())) {
            List<byte[]> b = m2846b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(b, f2036a);
            List<List<byte[]>> d = m2848d(eVar, resources);
            for (int i = 0; i < d.size(); i++) {
                ArrayList arrayList = new ArrayList(d.get(i));
                Collections.sort(arrayList, f2036a);
                if (m2847c(b, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + e + ", but package was not " + eVar.mo2702f());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ int m2851g(byte[] r4, byte[] r5) {
        /*
            int r0 = r4.length
            int r1 = r5.length
            if (r0 == r1) goto L_0x0008
            int r4 = r4.length
            int r5 = r5.length
        L_0x0006:
            int r4 = r4 - r5
            return r4
        L_0x0008:
            r0 = 0
            r1 = r0
        L_0x000a:
            int r2 = r4.length
            if (r1 >= r2) goto L_0x001b
            byte r2 = r4[r1]
            byte r3 = r5[r1]
            if (r2 == r3) goto L_0x0018
            byte r4 = r4[r1]
            byte r5 = r5[r1]
            goto L_0x0006
        L_0x0018:
            int r1 = r1 + 1
            goto L_0x000a
        L_0x001b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.C0699d.m2851g(byte[], byte[]):int");
    }

    /* renamed from: h */
    static C0708g.C0710b[] m2852h(Context context, C0701e eVar, String str, CancellationSignal cancellationSignal) {
        boolean z;
        int i;
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str2).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
        Cursor cursor = null;
        try {
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            ContentResolver contentResolver = context.getContentResolver();
            int i2 = 0;
            cursor = Build.VERSION.SDK_INT > 16 ? C0700a.m2853a(contentResolver, build, strArr, "query = ?", new String[]{eVar.mo2703g()}, (String) null, cancellationSignal) : contentResolver.query(build, strArr, "query = ?", new String[]{eVar.mo2703g()}, (String) null);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i3 = columnIndex != -1 ? cursor.getInt(columnIndex) : i2;
                    int i4 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : i2;
                    int i5 = i3;
                    Uri withAppendedId = columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    int i6 = columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400;
                    if (columnIndex6 == -1 || cursor.getInt(columnIndex6) != 1) {
                        i = i5;
                        z = false;
                    } else {
                        i = i5;
                        z = true;
                    }
                    arrayList2.add(C0708g.C0710b.m2877a(withAppendedId, i4, i6, z, i));
                    i2 = 0;
                }
                arrayList = arrayList2;
            }
            return (C0708g.C0710b[]) arrayList.toArray(new C0708g.C0710b[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
