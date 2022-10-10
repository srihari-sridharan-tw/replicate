package replicator.paxoslog.messages;

import replicator.common.MonotonicId;
import replicator.common.Request;
import replicator.common.RequestId;
import replicator.wal.WALEntry;

import java.util.Optional;
public class PrepareResponse extends Request {
    public final boolean promised;
    public final Optional<WALEntry> acceptedValue;
    public final Optional<MonotonicId> acceptedGeneration;

    public PrepareResponse(boolean success, Optional<WALEntry> acceptedValue, Optional<MonotonicId> acceptedGeneration) {
        super(RequestId.Promise);
        this.promised = success;
        this.acceptedValue = acceptedValue;
        this.acceptedGeneration = acceptedGeneration;
    }
}