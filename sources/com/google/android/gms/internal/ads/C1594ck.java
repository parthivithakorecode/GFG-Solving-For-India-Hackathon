package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;

/* renamed from: com.google.android.gms.internal.ads.ck */
final class C1594ck {

    /* renamed from: a */
    private final C1591ch[] f5430a;

    /* renamed from: b */
    private final C1628dh f5431b;

    /* renamed from: c */
    private C1591ch f5432c;

    public C1594ck(C1591ch[] chVarArr, C1628dh dhVar) {
        this.f5430a = chVarArr;
        this.f5431b = dhVar;
    }

    /* renamed from: a */
    public final void mo6210a() {
        if (this.f5432c != null) {
            this.f5432c = null;
        }
    }

    /* renamed from: b */
    public final C1591ch mo6211b(C1554bh bhVar, Uri uri) {
        C1591ch chVar = this.f5432c;
        if (chVar != null) {
            return chVar;
        }
        C1591ch[] chVarArr = this.f5430a;
        int length = chVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            C1591ch chVar2 = chVarArr[i];
            try {
                if (chVar2.mo6197d(bhVar)) {
                    this.f5432c = chVar2;
                    bhVar.mo5858e();
                    break;
                }
                bhVar.mo5858e();
                i++;
            } catch (EOFException unused) {
            } catch (Throwable th) {
                bhVar.mo5858e();
                throw th;
            }
        }
        C1591ch chVar3 = this.f5432c;
        if (chVar3 != null) {
            chVar3.mo6199f(this.f5431b);
            return this.f5432c;
        }
        String k = C2449zm.m20732k(this.f5430a);
        StringBuilder sb = new StringBuilder(k.length() + 58);
        sb.append("None of the available extractors (");
        sb.append(k);
        sb.append(") could read the stream.");
        throw new C1558bl(sb.toString(), uri);
    }
}
