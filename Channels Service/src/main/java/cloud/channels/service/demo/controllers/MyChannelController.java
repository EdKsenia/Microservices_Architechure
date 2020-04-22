package cloud.channels.service.demo.controllers;

import cloud.channels.service.demo.dto.ChannelDto;
import cloud.channels.service.demo.models.Channel;
import cloud.channels.service.demo.repositories.ChannelsRepository;
import cloud.channels.service.demo.security.UserDetailsImpl;
import cloud.channels.service.demo.servise.ChannelsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Slf4j
@RestController
public class MyChannelController {

    @Autowired
    private ChannelsService channelsService;

    @Autowired
    private ChannelsRepository channelsRepository;

//    @GetMapping("/myChannel")
//    public String getConcreteChannelPage(Authentication authentication, Model model) {
//        if (authentication != null) {
//            UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
//            model.addAttribute("user", userDetails.getUser());
//            Channel channel = channelsRepository.findOneById(userDetails.getUser().getId());
//
//            model.addAttribute("channel", channel);
//            return "myChannel";
//        }
//        return "createChannel";
//    }

    @GetMapping("/channels")
    public List<ChannelDto> getChannels() {
        log.info("Get channels request");
//        if (channelsService.getChannels() != null) {
            return Arrays.asList(channelsService.getConcreteChannel((long) 1));

    }



}
