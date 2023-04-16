package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.util.Map;
import p040f1.C2603b;
import p054h1.C2694t;

public final class bg0 extends eg0 {

    /* renamed from: c */
    private final Map<String, String> f4931c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f4932d;

    public bg0(eu0 eu0, Map<String, String> map) {
        super(eu0, "storePicture");
        this.f4931c = map;
        this.f4932d = eu0.mo7127j();
    }

    /* renamed from: i */
    public final void mo5849i() {
        if (this.f4932d == null) {
            mo6948c("Activity context is not available");
            return;
        }
        C2694t.m21608q();
        if (!new v00(this.f4932d).mo11359c()) {
            mo6948c("Feature is not supported by the device.");
            return;
        }
        String str = this.f4931c.get("iurl");
        if (TextUtils.isEmpty(str)) {
            mo6948c("Image url cannot be empty.");
        } else if (!URLUtil.isValidUrl(str)) {
            String valueOf = String.valueOf(str);
            mo6948c(valueOf.length() != 0 ? "Invalid image url: ".concat(valueOf) : new String("Invalid image url: "));
        } else {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            C2694t.m21608q();
            if (!TextUtils.isEmpty(lastPathSegment) && lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                Resources d = C2694t.m21607p().mo11022d();
                C2694t.m21608q();
                AlertDialog.Builder builder = new AlertDialog.Builder(this.f4932d);
                builder.setTitle(d != null ? d.getString(C2603b.s1) : "Save image");
                builder.setMessage(d != null ? d.getString(C2603b.s2) : "Allow Ad to store image in Picture gallery?");
                builder.setPositiveButton(d != null ? d.getString(C2603b.s3) : "Accept", new zf0(this, str, lastPathSegment));
                builder.setNegativeButton(d != null ? d.getString(C2603b.s4) : "Decline", new ag0(this));
                builder.create().show();
                return;
            }
            String valueOf2 = String.valueOf(lastPathSegment);
            mo6948c(valueOf2.length() != 0 ? "Image type not recognized: ".concat(valueOf2) : new String("Image type not recognized: "));
        }
    }
}
