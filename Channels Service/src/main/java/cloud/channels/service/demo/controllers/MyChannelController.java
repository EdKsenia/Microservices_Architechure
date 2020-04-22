package cloud.channels.service.demo.controllers;

import cloud.channels.service.demo.models.Channel;
import cloud.channels.service.demo.repositories.ChannelsRepository;
import cloud.channels.service.demo.security.UserDetailsImpl;
import cloud.channels.service.demo.servise.ChannelsService;
import org.springframework.security.core.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyChannelController {

    @Autowired
    private ChannelsService channelsService;

    @Autowired
    private ChannelsRepository channelsRepository;

    @GetMapping("/myChannel")
    public String getConcreteChannelPage(Authentication authentication, Model model) {
        if (authentication != null) {
            UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
            model.addAttribute("user", userDetails.getUser());
            Channel channel = channelsRepository.findOneById(userDetails.getUser().getId());

            model.addAttribute("channel", channel);
            return "myChannel";
        }
        return "createChannel";
    }



}
