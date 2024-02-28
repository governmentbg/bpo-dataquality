package bg.duosoft.patentsexporter.domain.mapper;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.IterableMapping;
import org.mapstruct.NullValueMappingStrategy;

import java.util.List;

public abstract class BaseObjectMapper<E, C> {
    public BaseObjectMapper() {
    }

    public abstract C toCore(E e);

    @InheritConfiguration(
            name = "toCore"
    )
    @IterableMapping(
            nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT
    )
    public abstract List<C> toCoreList(List<E> eList);

    @InheritInverseConfiguration(
            name = "toCore"
    )
    public abstract E toEntity(C c);

    @InheritInverseConfiguration(
            name = "toCoreList"
    )
    @IterableMapping(
            nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT
    )
    public abstract List<E> toEntityList(List<C> cList);
}
