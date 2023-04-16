package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.C0597a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.core.app.s */
public final class C0595s implements Iterable<Intent> {

    /* renamed from: f */
    private final ArrayList<Intent> f1878f = new ArrayList<>();

    /* renamed from: g */
    private final Context f1879g;

    /* renamed from: androidx.core.app.s$a */
    public interface C0596a {
        /* renamed from: j */
        Intent mo647j();
    }

    private C0595s(Context context) {
        this.f1879g = context;
    }

    /* renamed from: k */
    public static C0595s m2439k(Context context) {
        return new C0595s(context);
    }

    /* renamed from: h */
    public C0595s mo2530h(Intent intent) {
        this.f1878f.add(intent);
        return this;
    }

    /* renamed from: i */
    public C0595s mo2531i(Activity activity) {
        Intent j = activity instanceof C0596a ? ((C0596a) activity).mo647j() : null;
        if (j == null) {
            j = C0562i.m2222a(activity);
        }
        if (j != null) {
            ComponentName component = j.getComponent();
            if (component == null) {
                component = j.resolveActivity(this.f1879g.getPackageManager());
            }
            mo2533j(component);
            mo2530h(j);
        }
        return this;
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f1878f.iterator();
    }

    /* renamed from: j */
    public C0595s mo2533j(ComponentName componentName) {
        int size = this.f1878f.size();
        try {
            Context context = this.f1879g;
            while (true) {
                Intent b = C0562i.m2223b(context, componentName);
                if (b == null) {
                    return this;
                }
                this.f1878f.add(size, b);
                context = this.f1879g;
                componentName = b.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: l */
    public void mo2534l() {
        mo2535m((Bundle) null);
    }

    /* renamed from: m */
    public void mo2535m(Bundle bundle) {
        if (!this.f1878f.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f1878f.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C0597a.m2453h(this.f1879g, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f1879g.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
