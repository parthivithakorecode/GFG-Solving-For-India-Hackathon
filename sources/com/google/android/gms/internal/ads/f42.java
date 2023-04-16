package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import java.util.ArrayList;
import p054h1.C2694t;
import p069j1.C3208t1;

public final class f42 {

    /* renamed from: a */
    private final C1527ar f6704a;

    /* renamed from: b */
    private final Context f6705b;

    /* renamed from: c */
    private final n32 f6706c;

    /* renamed from: d */
    private final po0 f6707d;

    /* renamed from: e */
    private final String f6708e;

    /* renamed from: f */
    private final xw2 f6709f;

    /* renamed from: g */
    private final C3208t1 f6710g = C2694t.m21607p().mo11025h();

    public f42(Context context, po0 po0, C1527ar arVar, n32 n32, String str, xw2 xw2) {
        this.f6705b = context;
        this.f6707d = po0;
        this.f6704a = arVar;
        this.f6706c = n32;
        this.f6708e = str;
        this.f6709f = xw2;
    }

    /* renamed from: c */
    private static final void m8968c(SQLiteDatabase sQLiteDatabase, ArrayList<C1900kt> arrayList) {
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C1900kt ktVar = arrayList.get(i);
            if (ktVar.mo8795b0() == 2 && ktVar.mo8788K() > j) {
                j = ktVar.mo8788K();
            }
        }
        if (j != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(j));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", (String[]) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Void mo7229a(boolean z, SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        if (z) {
            this.f6705b.deleteDatabase("OfflineUpload.db");
            return null;
        }
        int i = 2;
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10592q6)).booleanValue()) {
            ww2 b = ww2.m19233b("oa_upload");
            b.mo11742a("oa_failed_reqs", String.valueOf(a42.m5819a(sQLiteDatabase2, 0)));
            b.mo11742a("oa_total_reqs", String.valueOf(a42.m5819a(sQLiteDatabase2, 1)));
            b.mo11742a("oa_upload_time", String.valueOf(C2694t.m21592a().mo12462a()));
            b.mo11742a("oa_last_successful_time", String.valueOf(a42.m5820b(sQLiteDatabase2, 2)));
            b.mo11742a("oa_session_id", this.f6710g.mo14078J() ? "" : this.f6708e);
            this.f6709f.mo5981a(b);
            ArrayList<C1900kt> c = a42.m5821c(sQLiteDatabase);
            m8968c(sQLiteDatabase2, c);
            int size = c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1900kt ktVar = c.get(i2);
                ww2 b2 = ww2.m19233b("oa_signals");
                b2.mo11742a("oa_session_id", this.f6710g.mo14078J() ? "" : this.f6708e);
                C1715ft L = ktVar.mo8789L();
                String valueOf = L.mo7385J() ? String.valueOf(L.mo7387L() - 1) : "-1";
                String obj = x73.m19392b(ktVar.mo8791Q(), e42.f6090a).toString();
                b2.mo11742a("oa_sig_ts", String.valueOf(ktVar.mo8788K()));
                b2.mo11742a("oa_sig_status", String.valueOf(ktVar.mo8795b0() - 1));
                b2.mo11742a("oa_sig_resp_lat", String.valueOf(ktVar.mo8787J()));
                b2.mo11742a("oa_sig_render_lat", String.valueOf(ktVar.mo8786I()));
                b2.mo11742a("oa_sig_formats", obj);
                b2.mo11742a("oa_sig_nw_type", valueOf);
                b2.mo11742a("oa_sig_wifi", String.valueOf(ktVar.mo8796c0() - 1));
                b2.mo11742a("oa_sig_airplane", String.valueOf(ktVar.mo8792Y() - 1));
                b2.mo11742a("oa_sig_data", String.valueOf(ktVar.mo8793Z() - 1));
                b2.mo11742a("oa_sig_nw_resp", String.valueOf(ktVar.mo8785H()));
                b2.mo11742a("oa_sig_offline", String.valueOf(ktVar.mo8794a0() - 1));
                b2.mo11742a("oa_sig_nw_state", String.valueOf(ktVar.mo8790P().zza()));
                if (L.mo7384I() && L.mo7385J() && L.mo7387L() == 2) {
                    b2.mo11742a("oa_sig_cell_type", String.valueOf(L.mo7386K() - 1));
                }
                this.f6709f.mo5981a(b2);
            }
        } else {
            ArrayList<C1900kt> c2 = a42.m5821c(sQLiteDatabase);
            C1937lt F = C2085pt.m15249F();
            F.mo9026s(this.f6705b.getPackageName());
            F.mo9027t(Build.MODEL);
            F.mo9028u(a42.m5819a(sQLiteDatabase2, 0));
            F.mo9025r(c2);
            F.mo9030w(a42.m5819a(sQLiteDatabase2, 1));
            F.mo9031x(C2694t.m21592a().mo12462a());
            F.mo9029v(a42.m5820b(sQLiteDatabase2, 2));
            m8968c(sQLiteDatabase2, c2);
            this.f6704a.mo5402b(new b42((C2085pt) F.mo11894o()));
            C1530au F2 = C1567bu.m7053F();
            F2.mo5523r(this.f6707d.f12730g);
            F2.mo5525t(this.f6707d.f12731h);
            if (true == this.f6707d.f12732i) {
                i = 0;
            }
            F2.mo5524s(i);
            this.f6704a.mo5402b(new c42((C1567bu) F2.mo11894o()));
            this.f6704a.mo5403c(10004);
        }
        sQLiteDatabase2.delete("offline_signal_contents", (String) null, (String[]) null);
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", 0);
        sQLiteDatabase2.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{"failed_requests"});
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("value", 0);
        sQLiteDatabase2.update("offline_signal_statistics", contentValues2, "statistic_name = ?", new String[]{"total_requests"});
        return null;
    }

    /* renamed from: b */
    public final void mo7230b(boolean z) {
        try {
            this.f6706c.mo9411a(new d42(this, z));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            io0.m11128d(valueOf.length() != 0 ? "Error in offline signals database startup: ".concat(valueOf) : new String("Error in offline signals database startup: "));
        }
    }
}
