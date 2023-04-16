package androidx.appcompat.view;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: androidx.appcompat.view.i */
public class C0312i implements Window.Callback {

    /* renamed from: f */
    final Window.Callback f818f;

    /* renamed from: androidx.appcompat.view.i$a */
    static class C0313a {
        /* renamed from: a */
        static boolean m1141a(Window.Callback callback, SearchEvent searchEvent) {
            return callback.onSearchRequested(searchEvent);
        }

        /* renamed from: b */
        static ActionMode m1142b(Window.Callback callback, ActionMode.Callback callback2, int i) {
            return callback.onWindowStartingActionMode(callback2, i);
        }
    }

    /* renamed from: androidx.appcompat.view.i$b */
    static class C0314b {
        /* renamed from: a */
        static void m1143a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i) {
            callback.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    /* renamed from: androidx.appcompat.view.i$c */
    static class C0315c {
        /* renamed from: a */
        static void m1144a(Window.Callback callback, boolean z) {
            callback.onPointerCaptureChanged(z);
        }
    }

    public C0312i(Window.Callback callback) {
        if (callback != null) {
            this.f818f = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    /* renamed from: a */
    public final Window.Callback mo883a() {
        return this.f818f;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f818f.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f818f.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f818f.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f818f.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f818f.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f818f.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f818f.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f818f.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.f818f.onAttachedToWindow();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f818f.onCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i) {
        return this.f818f.onCreatePanelView(i);
    }

    public void onDetachedFromWindow() {
        this.f818f.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f818f.onMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.f818f.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        this.f818f.onPanelClosed(i, menu);
    }

    public void onPointerCaptureChanged(boolean z) {
        C0315c.m1144a(this.f818f, z);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f818f.onPreparePanel(i, view, menu);
    }

    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        C0314b.m1143a(this.f818f, list, menu, i);
    }

    public boolean onSearchRequested() {
        return this.f818f.onSearchRequested();
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return C0313a.m1141a(this.f818f, searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f818f.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.f818f.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f818f.onWindowStartingActionMode(callback);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return C0313a.m1142b(this.f818f, callback, i);
    }
}
