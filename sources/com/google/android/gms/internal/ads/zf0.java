package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import p054h1.C2694t;

final class zf0 implements DialogInterface.OnClickListener {

    /* renamed from: f */
    final /* synthetic */ String f18182f;

    /* renamed from: g */
    final /* synthetic */ String f18183g;

    /* renamed from: h */
    final /* synthetic */ bg0 f18184h;

    zf0(bg0 bg0, String str, String str2) {
        this.f18184h = bg0;
        this.f18182f = str;
        this.f18183g = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DownloadManager downloadManager = (DownloadManager) this.f18184h.f4932d.getSystemService("download");
        try {
            String str = this.f18182f;
            String str2 = this.f18183g;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            C2694t.m21608q();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.f18184h.mo6948c("Could not store picture.");
        }
    }
}
