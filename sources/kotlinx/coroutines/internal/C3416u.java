package kotlinx.coroutines.internal;

import java.util.List;
import p016b5.C1317a2;

/* renamed from: kotlinx.coroutines.internal.u */
public interface C3416u {
    C1317a2 createDispatcher(List<? extends C3416u> list);

    int getLoadPriority();

    String hintOnError();
}
