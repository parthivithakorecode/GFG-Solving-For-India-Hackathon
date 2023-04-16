package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import java.util.Map;
import p040f1.C2603b;
import p054h1.C2694t;

public final class wf0 extends eg0 {

    /* renamed from: c */
    private final Map<String, String> f16799c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f16800d;

    /* renamed from: e */
    private final String f16801e = m18975l("description");

    /* renamed from: f */
    private final long f16802f = m18974k("start_ticks");

    /* renamed from: g */
    private final long f16803g = m18974k("end_ticks");

    /* renamed from: h */
    private final String f16804h = m18975l("summary");

    /* renamed from: i */
    private final String f16805i = m18975l("location");

    public wf0(eu0 eu0, Map<String, String> map) {
        super(eu0, "createCalendarEvent");
        this.f16799c = map;
        this.f16800d = eu0.mo7127j();
    }

    /* renamed from: k */
    private final long m18974k(String str) {
        String str2 = this.f16799c.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: l */
    private final String m18975l(String str) {
        return TextUtils.isEmpty(this.f16799c.get(str)) ? "" : this.f16799c.get(str);
    }

    /* access modifiers changed from: package-private */
    @TargetApi(14)
    /* renamed from: i */
    public final Intent mo11646i() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.f16801e);
        data.putExtra("eventLocation", this.f16805i);
        data.putExtra("description", this.f16804h);
        long j = this.f16802f;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = this.f16803g;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(268435456);
        return data;
    }

    /* renamed from: j */
    public final void mo11647j() {
        if (this.f16800d == null) {
            mo6948c("Activity context is not available.");
            return;
        }
        C2694t.m21608q();
        if (!new v00(this.f16800d).mo11358b()) {
            mo6948c("This feature is not available on the device.");
            return;
        }
        C2694t.m21608q();
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f16800d);
        Resources d = C2694t.m21607p().mo11022d();
        builder.setTitle(d != null ? d.getString(C2603b.s5) : "Create calendar event");
        builder.setMessage(d != null ? d.getString(C2603b.s6) : "Allow Ad to create a calendar event?");
        builder.setPositiveButton(d != null ? d.getString(C2603b.s3) : "Accept", new uf0(this));
        builder.setNegativeButton(d != null ? d.getString(C2603b.s4) : "Decline", new vf0(this));
        builder.create().show();
    }
}
