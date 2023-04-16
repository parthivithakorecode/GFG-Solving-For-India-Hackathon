package p152w;

import android.os.Build;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.core.util.C0743e;
import androidx.emoji2.text.C0911e;

/* renamed from: w.f */
public final class C4253f {

    /* renamed from: a */
    private final C4255b f22534a;

    /* renamed from: w.f$a */
    private static class C4254a extends C4255b {

        /* renamed from: a */
        private final TextView f22535a;

        /* renamed from: b */
        private final C4249d f22536b;

        /* renamed from: c */
        private boolean f22537c = true;

        C4254a(TextView textView) {
            this.f22535a = textView;
            this.f22536b = new C4249d(textView);
        }

        /* renamed from: d */
        private InputFilter[] m26776d(InputFilter[] inputFilterArr) {
            for (C4249d dVar : inputFilterArr) {
                if (dVar == this.f22536b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length + 1)];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, r0);
            inputFilterArr2[r0] = this.f22536b;
            return inputFilterArr2;
        }

        /* renamed from: e */
        private SparseArray<InputFilter> m26777e(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                if (inputFilterArr[i] instanceof C4249d) {
                    sparseArray.put(i, inputFilterArr[i]);
                }
            }
            return sparseArray;
        }

        /* renamed from: f */
        private InputFilter[] m26778f(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> e = m26777e(inputFilterArr);
            if (e.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length - e.size())];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (e.indexOfKey(i2) < 0) {
                    inputFilterArr2[i] = inputFilterArr[i2];
                    i++;
                }
            }
            return inputFilterArr2;
        }

        /* renamed from: h */
        private TransformationMethod m26779h(TransformationMethod transformationMethod) {
            return transformationMethod instanceof C4259h ? ((C4259h) transformationMethod).mo15819a() : transformationMethod;
        }

        /* renamed from: i */
        private void m26780i() {
            this.f22535a.setFilters(mo15809a(this.f22535a.getFilters()));
        }

        /* renamed from: k */
        private TransformationMethod m26781k(TransformationMethod transformationMethod) {
            return (!(transformationMethod instanceof C4259h) && !(transformationMethod instanceof PasswordTransformationMethod)) ? new C4259h(transformationMethod) : transformationMethod;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public InputFilter[] mo15809a(InputFilter[] inputFilterArr) {
            return !this.f22537c ? m26778f(inputFilterArr) : m26776d(inputFilterArr);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo15810b(boolean z) {
            if (z) {
                mo15813j();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo15811c(boolean z) {
            this.f22537c = z;
            mo15813j();
            m26780i();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo15812g(boolean z) {
            this.f22537c = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo15813j() {
            this.f22535a.setTransformationMethod(mo15814l(this.f22535a.getTransformationMethod()));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public TransformationMethod mo15814l(TransformationMethod transformationMethod) {
            return this.f22537c ? m26781k(transformationMethod) : m26779h(transformationMethod);
        }
    }

    /* renamed from: w.f$b */
    static class C4255b {
        C4255b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public InputFilter[] mo15809a(InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo15810b(boolean z) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo15811c(boolean z) {
        }
    }

    /* renamed from: w.f$c */
    private static class C4256c extends C4255b {

        /* renamed from: a */
        private final C4254a f22538a;

        C4256c(TextView textView) {
            this.f22538a = new C4254a(textView);
        }

        /* renamed from: d */
        private boolean m26791d() {
            return !C0911e.m3730h();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public InputFilter[] mo15809a(InputFilter[] inputFilterArr) {
            return m26791d() ? inputFilterArr : this.f22538a.mo15809a(inputFilterArr);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo15810b(boolean z) {
            if (!m26791d()) {
                this.f22538a.mo15810b(z);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo15811c(boolean z) {
            if (m26791d()) {
                this.f22538a.mo15812g(z);
            } else {
                this.f22538a.mo15811c(z);
            }
        }
    }

    public C4253f(TextView textView, boolean z) {
        C0743e.m2959g(textView, "textView cannot be null");
        if (Build.VERSION.SDK_INT < 19) {
            this.f22534a = new C4255b();
        } else {
            this.f22534a = !z ? new C4256c(textView) : new C4254a(textView);
        }
    }

    /* renamed from: a */
    public InputFilter[] mo15806a(InputFilter[] inputFilterArr) {
        return this.f22534a.mo15809a(inputFilterArr);
    }

    /* renamed from: b */
    public void mo15807b(boolean z) {
        this.f22534a.mo15810b(z);
    }

    /* renamed from: c */
    public void mo15808c(boolean z) {
        this.f22534a.mo15811c(z);
    }
}
