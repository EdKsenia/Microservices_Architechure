package cloud.channels.service.demo.repositories;

import cloud.channels.service.demo.models.Channel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ChannelsRepository extends JpaRepository<Channel, Long> {
    Channel findOneById(Long id);
    List<Channel> findAll();
}
