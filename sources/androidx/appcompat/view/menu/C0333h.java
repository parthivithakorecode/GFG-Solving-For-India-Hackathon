package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.C0250b;
import androidx.appcompat.view.menu.C0346m;
import p038f.C2588g;

/* renamed from: androidx.appcompat.view.menu.h */
class C0333h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, C0346m.C0347a {

    /* renamed from: f */
    private C0330g f965f;

    /* renamed from: g */
    private C0250b f966g;

    /* renamed from: h */
    C0327e f967h;

    /* renamed from: i */
    private C0346m.C0347a f968i;

    public C0333h(C0330g gVar) {
        this.f965f = gVar;
    }

    /* renamed from: a */
    public void mo1132a() {
        C0250b bVar = this.f966g;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    /* renamed from: b */
    public void mo727b(C0330g gVar, boolean z) {
        if (z || gVar == this.f965f) {
            mo1132a();
        }
        C0346m.C0347a aVar = this.f968i;
        if (aVar != null) {
            aVar.mo727b(gVar, z);
        }
    }

    /* renamed from: c */
    public boolean mo728c(C0330g gVar) {
        C0346m.C0347a aVar = this.f968i;
        if (aVar != null) {
            return aVar.mo728c(gVar);
        }
        return false;
    }

    /* renamed from: d */
    public void mo1133d(IBinder iBinder) {
        C0330g gVar = this.f965f;
        C0250b.C0251a aVar = new C0250b.C0251a(gVar.mo1126u());
        C0327e eVar = new C0327e(aVar.mo621b(), C2588g.abc_list_menu_item_layout);
        this.f967h = eVar;
        eVar.mo1004k(this);
        this.f965f.mo1092b(this.f967h);
        aVar.mo622c(this.f967h.mo1039a(), this);
        View y = gVar.mo1130y();
        if (y != null) {
            aVar.mo623d(y);
        } else {
            aVar.mo624e(gVar.mo1128w()).mo627h(gVar.mo1129x());
        }
        aVar.mo625f(this);
        C0250b a = aVar.mo620a();
        this.f966g = a;
        a.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f966g.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f966g.show();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f965f.mo1068L((C0334i) this.f967h.mo1039a().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f967h.mo996b(this.f965f, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f966g.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f966g.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f965f.mo1100e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f965f.performShortcut(i, keyEvent, 0);
    }
}
