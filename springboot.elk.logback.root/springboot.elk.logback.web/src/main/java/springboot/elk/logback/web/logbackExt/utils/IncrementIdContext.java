package springboot.elk.logback.web.logbackExt.utils;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by zd.yao on 2017/5/24.
 */
public class IncrementIdContext {
    private static final ThreadLocal<AtomicLong> CONTEXT = new ThreadLocal<AtomicLong>();
    public static String get() {
        if(CONTEXT.get()==null) set(new AtomicLong(0));
        return String.valueOf(CONTEXT.get().incrementAndGet());
    }

    public static void set(AtomicLong id) {
        CONTEXT.set(id);
    }

    public static void remove() {
        CONTEXT.remove();
    }

}