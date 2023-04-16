package p054h1;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.C1734gb;
import com.google.android.gms.internal.ads.io0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: h1.q */
final class C2691q extends AsyncTask<Void, Void, String> {

    /* renamed from: a */
    final /* synthetic */ C2693s f19147a;

    /* synthetic */ C2691q(C2693s sVar, C2690p pVar) {
        this.f19147a = sVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String doInBackground(Void... voidArr) {
        try {
            C2693s sVar = this.f19147a;
            sVar.f19161m = (C1734gb) sVar.f19156h.get(1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            io0.m11132h("", e);
        }
        return this.f19147a.mo12694l();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        if (this.f19147a.f19159k != null && str != null) {
            this.f19147a.f19159k.loadUrl(str);
        }
    }
}
