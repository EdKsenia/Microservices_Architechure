package cloud.channels.service.demo.controllers;

import cloud.channels.service.demo.dto.ChannelDto;

import cloud.channels.service.demo.models.Channel;
import cloud.channels.service.demo.repositories.ChannelsRepository;

import cloud.channels.service.demo.servise.ChannelsService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
@Slf4j
public class ChannelsController {

    @Autowired
    private ChannelsService channelsService;

    @Autowired
    private ChannelsRepository channelsRepository;

    @GetMapping("/channels")
    public List<ChannelDto> getChannels() {
        log.info("Get request");
        return Arrays.asList(channelsService.getConcreteChannel((long) 3));

    }



}
