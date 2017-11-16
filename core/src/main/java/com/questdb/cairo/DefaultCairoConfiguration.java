package com.questdb.cairo;

import com.questdb.std.FilesFacade;
import com.questdb.std.FilesFacadeImpl;
import com.questdb.std.microtime.MicrosecondClock;
import com.questdb.std.microtime.MicrosecondClockImpl;
import com.questdb.std.str.ImmutableCharSequence;

public class DefaultCairoConfiguration implements CairoConfiguration {

    private final CharSequence root;

    public DefaultCairoConfiguration(CharSequence root) {
        this.root = ImmutableCharSequence.of(root);
    }

    @Override
    public int getFileOperationRetryCount() {
        return 30;
    }

    @Override
    public FilesFacade getFilesFacade() {
        return FilesFacadeImpl.INSTANCE;
    }

    @Override
    public long getIdleCheckInterval() {
        return 100;
    }

    @Override
    public long getInactiveReaderTTL() {
        return -10000;
    }

    @Override
    public long getInactiveWriterTTL() {
        return -10000;
    }

    @Override
    public int getMkDirMode() {
        return 509;
    }

    @Override
    public int getReaderPoolSegments() {
        return 2;
    }

    @Override
    public CharSequence getRoot() {
        return root;
    }

    @Override
    public MicrosecondClock getClock() {
        return MicrosecondClockImpl.INSTANCE;
    }
}
