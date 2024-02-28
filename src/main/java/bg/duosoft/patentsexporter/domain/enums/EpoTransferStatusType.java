package bg.duosoft.patentsexporter.domain.enums;

import java.util.Arrays;
import java.util.Objects;

public enum EpoTransferStatusType {
    SUBMITTED,
    APPROVED,
    WARNING,
    REJECTED,
    ERROR;

    public static EpoTransferStatusType selectByName(String name) {
        return Arrays.stream(EpoTransferStatusType.values())
                .filter(r -> Objects.equals(name, r.name()))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("[EpoTransferStatusType] Unknown enum value! Name: " + name));
    }
}
