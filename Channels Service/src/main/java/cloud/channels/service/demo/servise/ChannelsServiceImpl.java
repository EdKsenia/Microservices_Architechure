package cloud.channels.service.demo.servise;

import cloud.channels.service.demo.dto.ChannelDto;
import cloud.channels.service.demo.models.Channel;
import cloud.channels.service.demo.repositories.ChannelsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


import static cloud.channels.service.demo.dto.ChannelDto.from;

@Service
public class ChannelsServiceImpl implements ChannelsService {

    @Autowired
    private ChannelsRepository channelsRepository;

    @Override
    public List<ChannelDto> getChannels(Long id) {
        return from(channelsRepository.findAllByUserId(id));
    }

    @Override
    public ChannelDto getConcreteChannel(Long channelId) {
        Channel channel = channelsRepository.getOne(channelId);
        return from(channel);
    }

    @Override
    public List<ChannelDto> search(String name) {
        return null;
    }

//    @Override
//    public void create(ChannelDto channelDto) {
//        Channel channel = Channel.builder().
//                name(channelDto.getName())
//                .createdAt(LocalDateTime.now())
//                .about(channelDto.getAbout())
//                .user(channelDto.getUser())
//                .fileInfo(fileStorageService.saveFile(channelDto.getFile()))
//                .build();
//        channelsRepository.save(channel);
//    }
}
