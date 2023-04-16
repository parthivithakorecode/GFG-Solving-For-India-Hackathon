package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.C2125qw;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.zg0;
import p048g2.C2637b;

public final class AdActivity extends Activity {

    /* renamed from: f */
    private zg0 f3706f;

    /* renamed from: a */
    private final void m5676a() {
        zg0 zg0 = this.f3706f;
        if (zg0 != null) {
            try {
                zg0.mo11842x();
            } catch (RemoteException e) {
                io0.m11133i("#007 Could not call remote method.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, @RecentlyNonNull Intent intent) {
        try {
            zg0 zg0 = this.f3706f;
            if (zg0 != null) {
                zg0.mo11841u4(i, i2, intent);
            }
        } catch (Exception e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void onBackPressed() {
        try {
            zg0 zg0 = this.f3706f;
            if (zg0 != null && !zg0.mo11830L()) {
                return;
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
        super.onBackPressed();
        try {
            zg0 zg02 = this.f3706f;
            if (zg02 != null) {
                zg02.mo11832f();
            }
        } catch (RemoteException e2) {
            io0.m11133i("#007 Could not call remote method.", e2);
        }
    }

    public final void onConfigurationChanged(@RecentlyNonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zg0 zg0 = this.f3706f;
            if (zg0 != null) {
                zg0.mo11831V(C2637b.m21358Z2(configuration));
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        RemoteException e;
        super.onCreate(bundle);
        zg0 i = C2125qw.m15896a().mo9875i(this);
        this.f3706f = i;
        if (i != null) {
            try {
                i.mo11839r2(bundle);
            } catch (RemoteException e2) {
                e = e2;
            }
        } else {
            e = null;
            io0.m11133i("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        try {
            zg0 zg0 = this.f3706f;
            if (zg0 != null) {
                zg0.mo11833k();
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        try {
            zg0 zg0 = this.f3706f;
            if (zg0 != null) {
                zg0.mo11835m();
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onRestart() {
        super.onRestart();
        try {
            zg0 zg0 = this.f3706f;
            if (zg0 != null) {
                zg0.mo11836n();
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        try {
            zg0 zg0 = this.f3706f;
            if (zg0 != null) {
                zg0.mo11834l();
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(@RecentlyNonNull Bundle bundle) {
        try {
            zg0 zg0 = this.f3706f;
            if (zg0 != null) {
                zg0.mo11829K(bundle);
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        try {
            zg0 zg0 = this.f3706f;
            if (zg0 != null) {
                zg0.mo11840t();
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        try {
            zg0 zg0 = this.f3706f;
            if (zg0 != null) {
                zg0.mo11837p();
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zg0 zg0 = this.f3706f;
            if (zg0 != null) {
                zg0.mo11838q();
            }
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    public final void setContentView(int i) {
        super.setContentView(i);
        m5676a();
    }

    public final void setContentView(@RecentlyNonNull View view) {
        super.setContentView(view);
        m5676a();
    }

    public final void setContentView(@RecentlyNonNull View view, @RecentlyNonNull ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        m5676a();
    }
}
