package androidx.window.layout;

import kotlin.jvm.internal.C3356h;
import kotlin.jvm.internal.C3357i;
import p145u4.C4150l;

/* synthetic */ class WindowMetricsCalculator$Companion$overrideDecorator$1 extends C3356h implements C4150l<WindowMetricsCalculator, WindowMetricsCalculator> {
    WindowMetricsCalculator$Companion$overrideDecorator$1(Object obj) {
        super(1, obj, WindowMetricsCalculatorDecorator.class, "decorate", "decorate(Landroidx/window/layout/WindowMetricsCalculator;)Landroidx/window/layout/WindowMetricsCalculator;", 0);
    }

    public final WindowMetricsCalculator invoke(WindowMetricsCalculator windowMetricsCalculator) {
        C3357i.m24508e(windowMetricsCalculator, "p0");
        return ((WindowMetricsCalculatorDecorator) this.receiver).decorate(windowMetricsCalculator);
    }
}
