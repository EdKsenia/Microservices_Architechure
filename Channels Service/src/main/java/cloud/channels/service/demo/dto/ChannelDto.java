package cloud.channels.service.demo.dto;

import cloud.channels.service.demo.models.Channel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChannelDto {
    private Long id;
    private String name;
    private String about;
    private MultipartFile file;

    public static ChannelDto from(Channel channel){
        return ChannelDto.builder().
                id(channel.getId())
                .name(channel.getName())
                .about(channel.getAbout())
                .build();

    }
//
    public static List<ChannelDto> from(List<Channel> channels) {
        return channels.stream()
                .map(ChannelDto::from)
                .collect(Collectors.toList());
    }
}
