package com.cis.mapper;

import com.cis.model.Service1Request;
import com.cis.model.Service1Response;
import com.cis.model.Service2Request;
import com.cis.model.Service2Response;
import org.mapstruct.Mapper;

@Mapper
public interface IMapper {
//    SimpleDestination sourceToDestination(SimpleSource source);
//    SimpleSource destinationToSource(SimpleDestination destination);

    Service2Request sourceToDestination(Service1Request source);
    Service1Response destinationToSource(Service2Response destination);
}
