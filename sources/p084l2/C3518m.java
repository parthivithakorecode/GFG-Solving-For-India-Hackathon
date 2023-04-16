package p084l2;

import android.app.Application;
import android.content.SharedPreferences;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: l2.m */
public final class C3518m {

    /* renamed from: a */
    private final Application f21132a;

    /* renamed from: b */
    private final SharedPreferences f21133b;

    /* renamed from: c */
    private final Set<String> f21134c;

    C3518m(Application application) {
        this.f21132a = application;
        SharedPreferences sharedPreferences = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.f21133b = sharedPreferences;
        this.f21134c = new HashSet(sharedPreferences.getStringSet("written_values", Collections.emptySet()));
    }

    /* renamed from: a */
    public final int mo14607a() {
        return this.f21133b.getInt("consent_status", 0);
    }

    /* renamed from: b */
    public final void mo14608b(int i) {
        this.f21133b.edit().putInt("consent_status", i).apply();
    }

    /* renamed from: c */
    public final void mo14609c(Set<String> set) {
        this.f21133b.edit().putStringSet("stored_info", set).apply();
    }

    /* renamed from: d */
    public final void mo14610d(int i) {
        this.f21133b.edit().putInt("consent_type", i).apply();
    }

    /* renamed from: e */
    public final Set<String> mo14611e() {
        return this.f21133b.getStringSet("stored_info", Collections.emptySet());
    }

    /* renamed from: f */
    public final Set<String> mo14612f() {
        return this.f21134c;
    }

    /* renamed from: g */
    public final void mo14613g() {
        this.f21133b.edit().putStringSet("written_values", this.f21134c).apply();
    }

    /* renamed from: h */
    public final void mo14614h() {
        C3492f1.m24878b(this.f21132a, this.f21134c);
        this.f21134c.clear();
        this.f21133b.edit().remove("stored_info").remove("consent_status").remove("consent_type").apply();
    }
}
