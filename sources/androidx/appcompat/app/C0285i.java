package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.view.C0302d;
import androidx.appcompat.widget.C0400a0;
import androidx.appcompat.widget.C0440d;
import androidx.appcompat.widget.C0441d0;
import androidx.appcompat.widget.C0453f;
import androidx.appcompat.widget.C0454f0;
import androidx.appcompat.widget.C0456g;
import androidx.appcompat.widget.C0459h;
import androidx.appcompat.widget.C0477l;
import androidx.appcompat.widget.C0497p;
import androidx.appcompat.widget.C0512r;
import androidx.appcompat.widget.C0514s;
import androidx.appcompat.widget.C0526v;
import androidx.appcompat.widget.C0528w;
import androidx.appcompat.widget.C0532x0;
import androidx.appcompat.widget.C0533y;
import androidx.core.view.C0833y;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p038f.C2591j;
import p102o.C3814g;

/* renamed from: androidx.appcompat.app.i */
public class C0285i {

    /* renamed from: b */
    private static final Class<?>[] f671b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    private static final int[] f672c = {16843375};

    /* renamed from: d */
    private static final int[] f673d = {16844160};

    /* renamed from: e */
    private static final int[] f674e = {16844156};

    /* renamed from: f */
    private static final int[] f675f = {16844148};

    /* renamed from: g */
    private static final String[] f676g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h */
    private static final C3814g<String, Constructor<? extends View>> f677h = new C3814g<>();

    /* renamed from: a */
    private final Object[] f678a = new Object[2];

    /* renamed from: androidx.appcompat.app.i$a */
    private static class C0286a implements View.OnClickListener {

        /* renamed from: f */
        private final View f679f;

        /* renamed from: g */
        private final String f680g;

        /* renamed from: h */
        private Method f681h;

        /* renamed from: i */
        private Context f682i;

        public C0286a(View view, String str) {
            this.f679f = view;
            this.f680g = str;
        }

        /* renamed from: a */
        private void m985a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f680g, new Class[]{View.class})) != null) {
                        this.f681h = method;
                        this.f682i = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f679f.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f679f.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f680g + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f679f.getClass() + str);
        }

        public void onClick(View view) {
            if (this.f681h == null) {
                m985a(this.f679f.getContext());
            }
            try {
                this.f681h.invoke(this.f682i, new Object[]{view});
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    /* renamed from: a */
    private void m963a(Context context, View view, AttributeSet attributeSet) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19 && i <= 28) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f673d);
            if (obtainStyledAttributes.hasValue(0)) {
                C0833y.m3331P(view, obtainStyledAttributes.getBoolean(0, false));
            }
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f674e);
            if (obtainStyledAttributes2.hasValue(0)) {
                C0833y.m3332Q(view, obtainStyledAttributes2.getString(0));
            }
            obtainStyledAttributes2.recycle();
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f675f);
            if (obtainStyledAttributes3.hasValue(0)) {
                C0833y.m3339X(view, obtainStyledAttributes3.getBoolean(0, false));
            }
            obtainStyledAttributes3.recycle();
        }
    }

    /* renamed from: b */
    private void m964b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 15 || C0833y.m3369y(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f672c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new C0286a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: s */
    private View m965s(Context context, String str, String str2) {
        String str3;
        C3814g<String, Constructor<? extends View>> gVar = f677h;
        Constructor<? extends U> constructor = gVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f671b);
            gVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f678a);
    }

    /* renamed from: t */
    private View m966t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue((String) null, "class");
        }
        try {
            Object[] objArr = this.f678a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                int i = 0;
                while (true) {
                    String[] strArr = f676g;
                    if (i < strArr.length) {
                        View s = m965s(context, str, strArr[i]);
                        if (s != null) {
                            return s;
                        }
                        i++;
                    } else {
                        Object[] objArr2 = this.f678a;
                        objArr2[0] = null;
                        objArr2[1] = null;
                        return null;
                    }
                }
            } else {
                View s2 = m965s(context, str, (String) null);
                Object[] objArr3 = this.f678a;
                objArr3[0] = null;
                objArr3[1] = null;
                return s2;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr4 = this.f678a;
            objArr4[0] = null;
            objArr4[1] = null;
        }
    }

    /* renamed from: u */
    private static Context m967u(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2591j.f18917v3, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(C2591j.f18922w3, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(C2591j.f18927x3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? (!(context instanceof C0302d) || ((C0302d) context).mo840c() != resourceId) ? new C0302d(context, resourceId) : context : context;
    }

    /* renamed from: v */
    private void m968v(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C0440d mo774c(Context context, AttributeSet attributeSet) {
        return new C0440d(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C0453f mo775d(Context context, AttributeSet attributeSet) {
        return new C0453f(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C0456g mo776e(Context context, AttributeSet attributeSet) {
        return new C0456g(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C0459h mo777f(Context context, AttributeSet attributeSet) {
        return new C0459h(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C0477l mo778g(Context context, AttributeSet attributeSet) {
        return new C0477l(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C0497p mo779h(Context context, AttributeSet attributeSet) {
        return new C0497p(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C0512r mo780i(Context context, AttributeSet attributeSet) {
        return new C0512r(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C0514s mo781j(Context context, AttributeSet attributeSet) {
        return new C0514s(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C0526v mo782k(Context context, AttributeSet attributeSet) {
        return new C0526v(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C0528w mo783l(Context context, AttributeSet attributeSet) {
        return new C0528w(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C0533y mo784m(Context context, AttributeSet attributeSet) {
        return new C0533y(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C0400a0 mo785n(Context context, AttributeSet attributeSet) {
        return new C0400a0(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C0441d0 mo786o(Context context, AttributeSet attributeSet) {
        return new C0441d0(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public C0454f0 mo787p(Context context, AttributeSet attributeSet) {
        return new C0454f0(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public View mo788q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final View mo789r(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View view2;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = m967u(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C0532x0.m2168b(context2);
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = 8;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 9;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = 10;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 12;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 13;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view2 = mo783l(context2, attributeSet);
                break;
            case 1:
                view2 = mo777f(context2, attributeSet);
                break;
            case 2:
                view2 = mo781j(context2, attributeSet);
                break;
            case 3:
                view2 = mo786o(context2, attributeSet);
                break;
            case 4:
                view2 = mo779h(context2, attributeSet);
                break;
            case 5:
                view2 = mo784m(context2, attributeSet);
                break;
            case 6:
                view2 = mo785n(context2, attributeSet);
                break;
            case 7:
                view2 = mo782k(context2, attributeSet);
                break;
            case 8:
                view2 = mo787p(context2, attributeSet);
                break;
            case 9:
                view2 = mo780i(context2, attributeSet);
                break;
            case 10:
                view2 = mo774c(context2, attributeSet);
                break;
            case 11:
                view2 = mo776e(context2, attributeSet);
                break;
            case 12:
                view2 = mo778g(context2, attributeSet);
                break;
            case 13:
                view2 = mo775d(context2, attributeSet);
                break;
            default:
                view2 = mo788q(context2, str, attributeSet);
                break;
        }
        m968v(view2, str);
        if (view2 == null && context != context2) {
            view2 = m966t(context2, str, attributeSet);
        }
        if (view2 != null) {
            m964b(view2, attributeSet);
            m963a(context2, view2, attributeSet);
        }
        return view2;
    }
}
