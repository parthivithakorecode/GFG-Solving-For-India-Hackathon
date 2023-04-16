package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;
import p054h1.C2694t;
import p069j1.C3202r1;

/* renamed from: com.google.android.gms.internal.ads.ar */
public final class C1527ar {

    /* renamed from: a */
    private final C1713fr f4301a;
    @GuardedBy("this")

    /* renamed from: b */
    private final C2084ps f4302b;

    /* renamed from: c */
    private final boolean f4303c;

    private C1527ar() {
        this.f4302b = C2121qs.m15843H();
        this.f4303c = false;
        this.f4301a = new C1713fr();
    }

    public C1527ar(C1713fr frVar) {
        this.f4302b = C2121qs.m15843H();
        this.f4301a = frVar;
        this.f4303c = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10631v3)).booleanValue();
    }

    /* renamed from: a */
    public static C1527ar m6231a() {
        return new C1527ar();
    }

    /* renamed from: d */
    private final synchronized String m6232d(int i) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", new Object[]{this.f4302b.mo10157B(), Long.valueOf(C2694t.m21592a().mo12463b()), Integer.valueOf(i - 1), Base64.encodeToString(((C2121qs) this.f4302b.mo11894o()).mo5901b(), 3)});
    }

    /* renamed from: e */
    private final synchronized void m6233e(int i) {
        FileOutputStream fileOutputStream;
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            try {
                fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
                try {
                    fileOutputStream.write(m6232d(i).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        C3202r1.m24015k("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    C3202r1.m24015k("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        C3202r1.m24015k("Could not close Clearcut output stream.");
                    }
                }
            } catch (FileNotFoundException unused4) {
                C3202r1.m24015k("Could not find file for Clearcut");
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused5) {
                    C3202r1.m24015k("Could not close Clearcut output stream.");
                }
                throw th;
            }
        }
    }

    /* renamed from: f */
    private final synchronized void m6234f(int i) {
        C2084ps psVar = this.f4302b;
        psVar.mo10161u();
        List<String> b = m10.m13006b();
        ArrayList arrayList = new ArrayList();
        for (String split : b) {
            for (String valueOf : split.split(",")) {
                try {
                    arrayList.add(Long.valueOf(valueOf));
                } catch (NumberFormatException unused) {
                    C3202r1.m24015k("Experiment ID is not a number");
                }
            }
        }
        psVar.mo10160t(arrayList);
        C1676er erVar = new C1676er(this.f4301a, ((C2121qs) this.f4302b.mo11894o()).mo5901b(), (C1638dr) null);
        int i2 = i - 1;
        erVar.mo7036a(i2);
        erVar.mo7037b();
        String valueOf2 = String.valueOf(Integer.toString(i2, 10));
        C3202r1.m24015k(valueOf2.length() != 0 ? "Logging Event with event code : ".concat(valueOf2) : new String("Logging Event with event code : "));
    }

    /* renamed from: b */
    public final synchronized void mo5402b(C2453zq zqVar) {
        if (this.f4303c) {
            try {
                zqVar.mo5527a(this.f4302b);
            } catch (NullPointerException e) {
                C2694t.m21607p().mo11034s(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    /* renamed from: c */
    public final synchronized void mo5403c(int i) {
        if (this.f4303c) {
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10639w3)).booleanValue()) {
                m6233e(i);
            } else {
                m6234f(i);
            }
        }
    }
}
