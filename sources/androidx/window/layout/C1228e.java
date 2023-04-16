package androidx.window.layout;

import androidx.window.core.ExperimentalWindowApi;
import androidx.window.layout.WindowMetricsCalculator;

/* renamed from: androidx.window.layout.e */
public final /* synthetic */ class C1228e {
    static {
        WindowMetricsCalculator.Companion companion = WindowMetricsCalculator.Companion;
    }

    /* renamed from: a */
    public static WindowMetricsCalculator m4933a() {
        return WindowMetricsCalculator.Companion.getOrCreate();
    }

    @ExperimentalWindowApi
    /* renamed from: b */
    public static void m4934b(WindowMetricsCalculatorDecorator windowMetricsCalculatorDecorator) {
        WindowMetricsCalculator.Companion.overrideDecorator(windowMetricsCalculatorDecorator);
    }

    @ExperimentalWindowApi
    /* renamed from: c */
    public static void m4935c() {
        WindowMetricsCalculator.Companion.reset();
    }
}
