package com.baidu.fsg.uid.worker;

import com.baidu.fsg.uid.worker.WorkerIdAssigner;

public class MockWorkerIdAssigner implements WorkerIdAssigner {
    @Override
    public long assignWorkerId() {
        return 0;
    }
}
