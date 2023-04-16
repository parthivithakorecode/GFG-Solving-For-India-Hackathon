package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.view.f */
public class C0787f {

    /* renamed from: a */
    private static boolean f2208a = false;

    /* renamed from: b */
    private static Method f2209b = null;

    /* renamed from: c */
    private static boolean f2210c = false;

    /* renamed from: d */
    private static Field f2211d;

    /* renamed from: androidx.core.view.f$a */
    public interface C0788a {
        /* renamed from: c */
        boolean mo761c(KeyEvent keyEvent);
    }

    /* renamed from: a */
    private static boolean m3126a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f2208a) {
            try {
                f2209b = actionBar.getClass().getMethod("onMenuKeyEvent", new Class[]{KeyEvent.class});
            } catch (NoSuchMethodException unused) {
            }
            f2208a = true;
        }
        Method method = f2209b;
        if (method != null) {
            try {
                Object invoke = method.invoke(actionBar, new Object[]{keyEvent});
                if (invoke == null) {
                    return false;
                }
                return ((Boolean) invoke).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m3127b(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m3126a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C0833y.m3350f(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: c */
    private static boolean m3128c(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener f = m3131f(dialog);
        if (f != null && f.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C0833y.m3350f(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    /* renamed from: d */
    public static boolean m3129d(View view, KeyEvent keyEvent) {
        return C0833y.m3351g(view, keyEvent);
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: e */
    public static boolean m3130e(C0788a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 28 ? aVar.mo761c(keyEvent) : callback instanceof Activity ? m3127b((Activity) callback, keyEvent) : callback instanceof Dialog ? m3128c((Dialog) callback, keyEvent) : (view != null && C0833y.m3350f(view, keyEvent)) || aVar.mo761c(keyEvent);
    }

    /* renamed from: f */
    private static DialogInterface.OnKeyListener m3131f(Dialog dialog) {
        if (!f2210c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f2211d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2210c = true;
        }
        Field field = f2211d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }
}
