package p069j1;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.util.Range;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: j1.o1 */
public final class C3193o1 {

    /* renamed from: a */
    private static final Map<String, List<Map<String, Object>>> f20517a = new HashMap();

    /* renamed from: b */
    private static List<MediaCodecInfo> f20518b;

    /* renamed from: c */
    private static final Object f20519c = new Object();

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    @android.annotation.TargetApi(16)
    /* renamed from: a */
    public static java.util.List<java.util.Map<java.lang.String, java.lang.Object>> m24003a(java.lang.String r14) {
        /*
            java.lang.Object r0 = f20519c
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.util.List<java.util.Map<java.lang.String, java.lang.Object>>> r1 = f20517a     // Catch:{ all -> 0x014e }
            boolean r2 = r1.containsKey(r14)     // Catch:{ all -> 0x014e }
            if (r2 == 0) goto L_0x0013
            java.lang.Object r14 = r1.get(r14)     // Catch:{ all -> 0x014e }
            java.util.List r14 = (java.util.List) r14     // Catch:{ all -> 0x014e }
            monitor-exit(r0)     // Catch:{ all -> 0x014e }
            return r14
        L_0x0013:
            monitor-enter(r0)     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            java.util.List<android.media.MediaCodecInfo> r1 = f20518b     // Catch:{ all -> 0x0127 }
            r2 = 21
            r3 = 0
            if (r1 == 0) goto L_0x001d
        L_0x001b:
            monitor-exit(r0)     // Catch:{ all -> 0x0127 }
            goto L_0x004b
        L_0x001d:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0127 }
            if (r1 < r2) goto L_0x0031
            android.media.MediaCodecList r1 = new android.media.MediaCodecList     // Catch:{ all -> 0x0127 }
            r1.<init>(r3)     // Catch:{ all -> 0x0127 }
            android.media.MediaCodecInfo[] r1 = r1.getCodecInfos()     // Catch:{ all -> 0x0127 }
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch:{ all -> 0x0127 }
            f20518b = r1     // Catch:{ all -> 0x0127 }
            goto L_0x001b
        L_0x0031:
            int r1 = android.media.MediaCodecList.getCodecCount()     // Catch:{ all -> 0x0127 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0127 }
            r4.<init>(r1)     // Catch:{ all -> 0x0127 }
            f20518b = r4     // Catch:{ all -> 0x0127 }
            r4 = r3
        L_0x003d:
            if (r4 >= r1) goto L_0x001b
            android.media.MediaCodecInfo r5 = android.media.MediaCodecList.getCodecInfoAt(r4)     // Catch:{ all -> 0x0127 }
            java.util.List<android.media.MediaCodecInfo> r6 = f20518b     // Catch:{ all -> 0x0127 }
            r6.add(r5)     // Catch:{ all -> 0x0127 }
            int r4 = r4 + 1
            goto L_0x003d
        L_0x004b:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            r1.<init>()     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            java.util.List<android.media.MediaCodecInfo> r4 = f20518b     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
        L_0x0056:
            boolean r5 = r4.hasNext()     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            if (r5 == 0) goto L_0x0120
            java.lang.Object r5 = r4.next()     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            android.media.MediaCodecInfo r5 = (android.media.MediaCodecInfo) r5     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            boolean r6 = r5.isEncoder()     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            if (r6 != 0) goto L_0x0056
            java.lang.String[] r6 = r5.getSupportedTypes()     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            java.util.List r6 = java.util.Arrays.asList(r6)     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            boolean r6 = r6.contains(r14)     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            if (r6 == 0) goto L_0x0056
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            r6.<init>()     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            java.lang.String r7 = "codecName"
            java.lang.String r8 = r5.getName()     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            r6.put(r7, r8)     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            android.media.MediaCodecInfo$CodecCapabilities r5 = r5.getCapabilitiesForType(r14)     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            r7.<init>()     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            android.media.MediaCodecInfo$CodecProfileLevel[] r8 = r5.profileLevels     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            int r9 = r8.length     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            r10 = r3
        L_0x0091:
            if (r10 >= r9) goto L_0x00af
            r11 = r8[r10]     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            r12 = 2
            java.lang.Integer[] r12 = new java.lang.Integer[r12]     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            int r13 = r11.profile     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            r12[r3] = r13     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            int r11 = r11.level     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            r13 = 1
            r12[r13] = r11     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            r7.add(r12)     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            int r10 = r10 + 1
            goto L_0x0091
        L_0x00af:
            java.lang.String r8 = "profileLevels"
            r6.put(r8, r7)     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            if (r7 < r2) goto L_0x010a
            android.media.MediaCodecInfo$VideoCapabilities r8 = r5.getVideoCapabilities()     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            java.lang.String r9 = "bitRatesBps"
            android.util.Range r10 = r8.getBitrateRange()     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            java.lang.Integer[] r10 = m24004b(r10)     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            r6.put(r9, r10)     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            java.lang.String r9 = "widthAlignment"
            int r10 = r8.getWidthAlignment()     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            r6.put(r9, r10)     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            java.lang.String r9 = "heightAlignment"
            int r10 = r8.getHeightAlignment()     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            r6.put(r9, r10)     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            java.lang.String r9 = "frameRates"
            android.util.Range r10 = r8.getSupportedFrameRates()     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            java.lang.Integer[] r10 = m24004b(r10)     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            r6.put(r9, r10)     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            java.lang.String r9 = "widths"
            android.util.Range r10 = r8.getSupportedWidths()     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            java.lang.Integer[] r10 = m24004b(r10)     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            r6.put(r9, r10)     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            java.lang.String r9 = "heights"
            android.util.Range r8 = r8.getSupportedHeights()     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            java.lang.Integer[] r8 = m24004b(r8)     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            r6.put(r9, r8)     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
        L_0x010a:
            r8 = 23
            if (r7 < r8) goto L_0x011b
            java.lang.String r7 = "instancesLimit"
            int r5 = r5.getMaxSupportedInstances()     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            r6.put(r7, r5)     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
        L_0x011b:
            r1.add(r6)     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            goto L_0x0056
        L_0x0120:
            java.util.Map<java.lang.String, java.util.List<java.util.Map<java.lang.String, java.lang.Object>>> r2 = f20517a     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            r2.put(r14, r1)     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
            monitor-exit(r0)     // Catch:{ all -> 0x014e }
            return r1
        L_0x0127:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0127 }
            throw r1     // Catch:{ RuntimeException -> 0x012c, LinkageError -> 0x012a }
        L_0x012a:
            r1 = move-exception
            goto L_0x012d
        L_0x012c:
            r1 = move-exception
        L_0x012d:
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x014e }
            r2.<init>()     // Catch:{ all -> 0x014e }
            java.lang.String r3 = "error"
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x014e }
            java.lang.String r1 = r1.getSimpleName()     // Catch:{ all -> 0x014e }
            r2.put(r3, r1)     // Catch:{ all -> 0x014e }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x014e }
            r1.<init>()     // Catch:{ all -> 0x014e }
            r1.add(r2)     // Catch:{ all -> 0x014e }
            java.util.Map<java.lang.String, java.util.List<java.util.Map<java.lang.String, java.lang.Object>>> r2 = f20517a     // Catch:{ all -> 0x014e }
            r2.put(r14, r1)     // Catch:{ all -> 0x014e }
            monitor-exit(r0)     // Catch:{ all -> 0x014e }
            return r1
        L_0x014e:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x014e }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p069j1.C3193o1.m24003a(java.lang.String):java.util.List");
    }

    @TargetApi(21)
    /* renamed from: b */
    private static Integer[] m24004b(Range<Integer> range) {
        return new Integer[]{range.getLower(), range.getUpper()};
    }
}
