package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import p034e2.C2553j;

public final class l23 {
    /* renamed from: a */
    public static File m12513a(File file, boolean z) {
        if (z && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: b */
    public static File m12514b(String str, String str2, File file) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(m12515c(str, file), str2);
    }

    /* renamed from: c */
    public static File m12515c(String str, File file) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        m12513a(file2, false);
        return file2;
    }

    /* renamed from: d */
    public static boolean m12516d(File file) {
        boolean z;
        if (!file.exists()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            z = true;
            for (int i = 0; i < length; i++) {
                File file2 = listFiles[i];
                z = file2 != null && m12516d(file2) && z;
            }
        } else {
            z = true;
        }
        return file.delete() && z;
    }

    /* renamed from: e */
    public static boolean m12517e(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                C2553j.m21202a(fileOutputStream2);
                return true;
            } catch (IOException unused) {
                fileOutputStream = fileOutputStream2;
                C2553j.m21202a(fileOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                C2553j.m21202a(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
            C2553j.m21202a(fileOutputStream);
            return false;
        } catch (Throwable th2) {
            th = th2;
            C2553j.m21202a(fileOutputStream);
            throw th;
        }
    }
}
