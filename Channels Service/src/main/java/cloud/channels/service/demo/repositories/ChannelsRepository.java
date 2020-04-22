package cloud.channels.service.demo.repositories;

import cloud.channels.service.demo.models.Channel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ChannelsRepository extends JpaRepository<Channel, Long> {
    Channel findOneByUserId(Long user);
    Channel findOneById(Long id);
}
