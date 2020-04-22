package cloud.channels.service.demo.servise;

import cloud.channels.service.demo.dto.ChannelDto;
import java.util.List;

public interface ChannelsService {


    ChannelDto getConcreteChannel(Long channelId);

    List<ChannelDto> search(String name);

}
