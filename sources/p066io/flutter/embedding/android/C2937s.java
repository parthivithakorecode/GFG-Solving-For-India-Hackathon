package p066io.flutter.embedding.android;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import java.util.HashSet;
import p005a4.C0128c;
import p066io.flutter.plugin.editing.C2979b;
import p099n3.C3768b;
import p174z3.C4546d;

/* renamed from: io.flutter.embedding.android.s */
public class C2937s implements C2979b.C2980a {

    /* renamed from: a */
    protected final C2942d[] f19779a;

    /* renamed from: b */
    private final HashSet<KeyEvent> f19780b = new HashSet<>();

    /* renamed from: c */
    private final C2944e f19781c;

    /* renamed from: io.flutter.embedding.android.s$b */
    public static class C2939b {

        /* renamed from: a */
        private int f19782a = 0;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Character mo13397a(int i) {
            char c = (char) i;
            if ((Integer.MIN_VALUE & i) != 0) {
                int i2 = i & Integer.MAX_VALUE;
                int i3 = this.f19782a;
                if (i3 != 0) {
                    i2 = KeyCharacterMap.getDeadChar(i3, i2);
                }
                this.f19782a = i2;
            } else {
                int i4 = this.f19782a;
                if (i4 != 0) {
                    int deadChar = KeyCharacterMap.getDeadChar(i4, i);
                    if (deadChar > 0) {
                        c = (char) deadChar;
                    }
                    this.f19782a = 0;
                }
            }
            return Character.valueOf(c);
        }
    }

    /* renamed from: io.flutter.embedding.android.s$c */
    private class C2940c {

        /* renamed from: a */
        final KeyEvent f19783a;

        /* renamed from: b */
        int f19784b;

        /* renamed from: c */
        boolean f19785c = false;

        /* renamed from: io.flutter.embedding.android.s$c$a */
        private class C2941a implements C2942d.C2943a {

            /* renamed from: a */
            boolean f19787a;

            private C2941a() {
                this.f19787a = false;
            }

            /* renamed from: a */
            public void mo13399a(boolean z) {
                if (!this.f19787a) {
                    this.f19787a = true;
                    C2940c cVar = C2940c.this;
                    int i = cVar.f19784b - 1;
                    cVar.f19784b = i;
                    boolean z2 = z | cVar.f19785c;
                    cVar.f19785c = z2;
                    if (i == 0 && !z2) {
                        C2937s.this.m22999d(cVar.f19783a);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
            }
        }

        C2940c(KeyEvent keyEvent) {
            this.f19784b = C2937s.this.f19779a.length;
            this.f19783a = keyEvent;
        }

        /* renamed from: a */
        public C2942d.C2943a mo13398a() {
            return new C2941a();
        }
    }

    /* renamed from: io.flutter.embedding.android.s$d */
    public interface C2942d {

        /* renamed from: io.flutter.embedding.android.s$d$a */
        public interface C2943a {
            /* renamed from: a */
            void mo13399a(boolean z);
        }

        /* renamed from: a */
        void mo13387a(KeyEvent keyEvent, C2943a aVar);
    }

    /* renamed from: io.flutter.embedding.android.s$e */
    public interface C2944e {
        /* renamed from: a */
        void mo13347a(KeyEvent keyEvent);

        /* renamed from: c */
        boolean mo13349c(KeyEvent keyEvent);

        C0128c getBinaryMessenger();
    }

    public C2937s(C2944e eVar) {
        this.f19781c = eVar;
        this.f19779a = new C2942d[]{new C2935r(eVar.getBinaryMessenger()), new C2929m(new C4546d(eVar.getBinaryMessenger()))};
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m22999d(KeyEvent keyEvent) {
        C2944e eVar = this.f19781c;
        if (eVar != null && !eVar.mo13349c(keyEvent)) {
            this.f19780b.add(keyEvent);
            this.f19781c.mo13347a(keyEvent);
            if (this.f19780b.remove(keyEvent)) {
                C3768b.m25593g("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
            }
        }
    }

    /* renamed from: a */
    public boolean mo13395a(KeyEvent keyEvent) {
        if (this.f19780b.remove(keyEvent)) {
            return false;
        }
        if (this.f19779a.length > 0) {
            C2940c cVar = new C2940c(keyEvent);
            for (C2942d a : this.f19779a) {
                a.mo13387a(keyEvent, cVar.mo13398a());
            }
            return true;
        }
        m22999d(keyEvent);
        return true;
    }

    /* renamed from: c */
    public void mo13396c() {
        int size = this.f19780b.size();
        if (size > 0) {
            C3768b.m25593g("KeyboardManager", "A KeyboardManager was destroyed with " + String.valueOf(size) + " unhandled redispatch event(s).");
        }
    }
}
