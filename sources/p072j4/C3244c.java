package p072j4;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import kotlin.jvm.internal.C3357i;
import p005a4.C0144j;
import p005a4.C0145k;

/* renamed from: j4.c */
public final class C3244c implements C0145k.C0149c {

    /* renamed from: a */
    private Context f20623a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Toast f20624b;

    /* renamed from: j4.c$a */
    public static final class C3245a extends Toast.Callback {

        /* renamed from: a */
        final /* synthetic */ C3244c f20625a;

        C3245a(C3244c cVar) {
            this.f20625a = cVar;
        }

        public void onToastHidden() {
            C3244c.super.onToastHidden();
            this.f20625a.f20624b = null;
        }
    }

    public C3244c(Context context) {
        C3357i.m24508e(context, "context");
        this.f20623a = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m24177c(C3244c cVar) {
        C3357i.m24508e(cVar, "this$0");
        Toast toast = cVar.f20624b;
        if (toast != null) {
            toast.show();
        }
    }

    public void onMethodCall(C0144j jVar, C0145k.C0150d dVar) {
        Toast toast;
        int i;
        String str;
        Drawable drawable;
        C3357i.m24508e(jVar, "call");
        C3357i.m24508e(dVar, "result");
        String str2 = jVar.f269a;
        View view = null;
        if (C3357i.m24504a(str2, "showToast")) {
            String valueOf = String.valueOf(jVar.mo332a("msg"));
            String valueOf2 = String.valueOf(jVar.mo332a("length"));
            String valueOf3 = String.valueOf(jVar.mo332a("gravity"));
            Number number = (Number) jVar.mo332a("bgcolor");
            Number number2 = (Number) jVar.mo332a("textcolor");
            Number number3 = (Number) jVar.mo332a("fontSize");
            int i2 = C3357i.m24504a(valueOf3, "top") ? 48 : C3357i.m24504a(valueOf3, "center") ? 17 : 80;
            boolean a = C3357i.m24504a(valueOf2, "long");
            if (number == null || (i = Build.VERSION.SDK_INT) > 31) {
                Toast makeText = Toast.makeText(this.f20623a, valueOf, a ? 1 : 0);
                this.f20624b = makeText;
                if (Build.VERSION.SDK_INT <= 31) {
                    if (makeText != null) {
                        try {
                            view = makeText.getView();
                        } catch (Exception unused) {
                        }
                    }
                    C3357i.m24505b(view);
                    View findViewById = view.findViewById(16908299);
                    C3357i.m24507d(findViewById, "mToast?.view!!.findViewById(android.R.id.message)");
                    TextView textView = (TextView) findViewById;
                    if (number3 != null) {
                        textView.setTextSize(number3.floatValue());
                    }
                    if (number2 != null) {
                        textView.setTextColor(number2.intValue());
                    }
                }
            } else {
                Object systemService = this.f20623a.getSystemService("layout_inflater");
                C3357i.m24506c(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                View inflate = ((LayoutInflater) systemService).inflate(C3248f.toast_custom, (ViewGroup) null);
                TextView textView2 = (TextView) inflate.findViewById(C3247e.f20626a);
                textView2.setText(valueOf);
                if (i >= 21) {
                    drawable = this.f20623a.getDrawable(C3246d.corner);
                    C3357i.m24505b(drawable);
                    str = "{\n                      …)!!\n                    }";
                } else {
                    drawable = this.f20623a.getResources().getDrawable(C3246d.corner);
                    str = "{\n                      …er)\n                    }";
                }
                C3357i.m24507d(drawable, str);
                drawable.setColorFilter(number.intValue(), PorterDuff.Mode.SRC_IN);
                textView2.setBackground(drawable);
                if (number3 != null) {
                    textView2.setTextSize(number3.floatValue());
                }
                if (number2 != null) {
                    textView2.setTextColor(number2.intValue());
                }
                Toast toast2 = new Toast(this.f20623a);
                this.f20624b = toast2;
                toast2.setDuration(a);
                Toast toast3 = this.f20624b;
                if (toast3 != null) {
                    toast3.setView(inflate);
                }
            }
            int i3 = Build.VERSION.SDK_INT;
            if (i3 <= 31) {
                if (i2 != 17) {
                    Toast toast4 = this.f20624b;
                    if (i2 == 48 ? toast4 != null : toast4 != null) {
                        toast4.setGravity(i2, 0, 100);
                    }
                } else {
                    Toast toast5 = this.f20624b;
                    if (toast5 != null) {
                        toast5.setGravity(i2, 0, 0);
                    }
                }
            }
            Context context = this.f20623a;
            if (context instanceof Activity) {
                C3357i.m24506c(context, "null cannot be cast to non-null type android.app.Activity");
                ((Activity) context).runOnUiThread(new C3243b(this));
            } else {
                Toast toast6 = this.f20624b;
                if (toast6 != null) {
                    toast6.show();
                }
            }
            if (i3 >= 30 && (toast = this.f20624b) != null) {
                toast.addCallback(new C3245a(this));
            }
        } else if (C3357i.m24504a(str2, "cancel")) {
            Toast toast7 = this.f20624b;
            if (toast7 != null) {
                if (toast7 != null) {
                    toast7.cancel();
                }
                this.f20624b = null;
            }
        } else {
            dVar.mo340c();
            return;
        }
        dVar.mo338a(Boolean.TRUE);
    }
}
