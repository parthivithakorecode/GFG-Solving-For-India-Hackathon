package p039f0;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: f0.a */
public class C2592a {

    /* renamed from: e */
    private static final Map<String, Lock> f18938e = new HashMap();

    /* renamed from: a */
    private final File f18939a;

    /* renamed from: b */
    private final Lock f18940b;

    /* renamed from: c */
    private final boolean f18941c;

    /* renamed from: d */
    private FileChannel f18942d;

    public C2592a(String str, File file, boolean z) {
        File file2 = new File(file, str + ".lck");
        this.f18939a = file2;
        this.f18940b = m21271a(file2.getAbsolutePath());
        this.f18941c = z;
    }

    /* renamed from: a */
    private static Lock m21271a(String str) {
        Lock lock;
        Map<String, Lock> map = f18938e;
        synchronized (map) {
            lock = map.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                map.put(str, lock);
            }
        }
        return lock;
    }

    /* renamed from: b */
    public void mo12474b() {
        this.f18940b.lock();
        if (this.f18941c) {
            try {
                FileChannel channel = new FileOutputStream(this.f18939a).getChannel();
                this.f18942d = channel;
                channel.lock();
            } catch (IOException e) {
                throw new IllegalStateException("Unable to grab copy lock.", e);
            }
        }
    }

    /* renamed from: c */
    public void mo12475c() {
        FileChannel fileChannel = this.f18942d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f18940b.unlock();
    }
}
