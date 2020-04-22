package cloud.channels.service.demo.servise;

import cloud.channels.service.demo.dto.ChannelDto;
import java.util.List;

public interface ChannelsService {


    List<ChannelDto> getChannels();

    ChannelDto getConcreteChannel(Long channelId);

    List<ChannelDto> search(String name);

}
