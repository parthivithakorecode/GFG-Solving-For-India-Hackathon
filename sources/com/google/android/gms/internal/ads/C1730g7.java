package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.g7 */
public class C1730g7 extends C1506a6<String> {

    /* renamed from: r */
    private final Object f7290r = new Object();

    /* renamed from: s */
    private final C1692f6<String> f7291s;

    public C1730g7(int i, String str, C1692f6<String> f6Var, C1654e6 e6Var) {
        super(i, str, e6Var);
        this.f7291s = f6Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo7523A(String str) {
        C1692f6<String> f6Var;
        synchronized (this.f7290r) {
            f6Var = this.f7291s;
        }
        f6Var.mo7241c(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C1729g6<String> mo5117i(C2320w5 w5Var) {
        String str;
        try {
            byte[] bArr = w5Var.f16709b;
            Map<String, String> map = w5Var.f16710c;
            String str2 = "ISO-8859-1";
            if (map != null) {
                String str3 = map.get("Content-Type");
                if (str3 != null) {
                    String[] split = str3.split(";", 0);
                    int i = 1;
                    while (true) {
                        if (i >= split.length) {
                            break;
                        }
                        String[] split2 = split[i].trim().split("=", 0);
                        if (split2.length == 2 && split2[0].equals("charset")) {
                            str2 = split2[1];
                            break;
                        }
                        i++;
                    }
                }
            }
            str = new String(bArr, str2);
        } catch (UnsupportedEncodingException unused) {
            str = new String(w5Var.f16709b);
        }
        return C1729g6.m9545b(str, C2396y6.m19879b(w5Var));
    }
}
