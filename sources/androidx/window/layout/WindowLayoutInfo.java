package androidx.window.layout;

import java.util.List;
import kotlin.jvm.internal.C3357i;
import p145u4.C4150l;

public final class WindowLayoutInfo {
    private final List<DisplayFeature> displayFeatures;

    public WindowLayoutInfo(List<? extends DisplayFeature> list) {
        C3357i.m24508e(list, "displayFeatures");
        this.displayFeatures = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C3357i.m24504a(WindowLayoutInfo.class, obj.getClass())) {
            return false;
        }
        return C3357i.m24504a(this.displayFeatures, ((WindowLayoutInfo) obj).displayFeatures);
    }

    public final List<DisplayFeature> getDisplayFeatures() {
        return this.displayFeatures;
    }

    public int hashCode() {
        return this.displayFeatures.hashCode();
    }

    public String toString() {
        return C3593q.m25045p(this.displayFeatures, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, (CharSequence) null, (C4150l) null, 56, (Object) null);
    }
}
