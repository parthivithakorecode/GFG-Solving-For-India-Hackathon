package p095n;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import p000a.C0002b;

/* renamed from: n.d */
public abstract class C3744d implements ServiceConnection {

    /* renamed from: n.d$a */
    class C3745a extends C3740b {
        C3745a(C0002b bVar, ComponentName componentName) {
            super(bVar, componentName);
        }
    }

    /* renamed from: a */
    public abstract void mo5541a(ComponentName componentName, C3740b bVar);

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        mo5541a(componentName, new C3745a(C0002b.C0003a.m7D(iBinder), componentName));
    }
}
