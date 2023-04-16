package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import p038f.C2582a;

/* renamed from: androidx.appcompat.app.b */
public class C0250b extends C0284h {

    /* renamed from: j */
    final AlertController f557j = new AlertController(getContext(), this, getWindow());

    /* renamed from: androidx.appcompat.app.b$a */
    public static class C0251a {

        /* renamed from: a */
        private final AlertController.C0238f f558a;

        /* renamed from: b */
        private final int f559b;

        public C0251a(Context context) {
            this(context, C0250b.m766o(context, 0));
        }

        public C0251a(Context context, int i) {
            this.f558a = new AlertController.C0238f(new ContextThemeWrapper(context, C0250b.m766o(context, i)));
            this.f559b = i;
        }

        /* renamed from: a */
        public C0250b mo620a() {
            C0250b bVar = new C0250b(this.f558a.f517a, this.f559b);
            this.f558a.mo585a(bVar.f557j);
            bVar.setCancelable(this.f558a.f534r);
            if (this.f558a.f534r) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.f558a.f535s);
            bVar.setOnDismissListener(this.f558a.f536t);
            DialogInterface.OnKeyListener onKeyListener = this.f558a.f537u;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        /* renamed from: b */
        public Context mo621b() {
            return this.f558a.f517a;
        }

        /* renamed from: c */
        public C0251a mo622c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0238f fVar = this.f558a;
            fVar.f539w = listAdapter;
            fVar.f540x = onClickListener;
            return this;
        }

        /* renamed from: d */
        public C0251a mo623d(View view) {
            this.f558a.f523g = view;
            return this;
        }

        /* renamed from: e */
        public C0251a mo624e(Drawable drawable) {
            this.f558a.f520d = drawable;
            return this;
        }

        /* renamed from: f */
        public C0251a mo625f(DialogInterface.OnKeyListener onKeyListener) {
            this.f558a.f537u = onKeyListener;
            return this;
        }

        /* renamed from: g */
        public C0251a mo626g(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0238f fVar = this.f558a;
            fVar.f539w = listAdapter;
            fVar.f540x = onClickListener;
            fVar.f509I = i;
            fVar.f508H = true;
            return this;
        }

        /* renamed from: h */
        public C0251a mo627h(CharSequence charSequence) {
            this.f558a.f522f = charSequence;
            return this;
        }
    }

    protected C0250b(Context context, int i) {
        super(context, m766o(context, i));
    }

    /* renamed from: o */
    static int m766o(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C2582a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: n */
    public ListView mo616n() {
        return this.f557j.mo565d();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f557j.mo566e();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f557j.mo567g(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f557j.mo568h(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f557j.mo574q(charSequence);
    }
}
