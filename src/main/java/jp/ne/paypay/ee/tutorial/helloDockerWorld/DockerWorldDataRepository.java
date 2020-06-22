package jp.ne.paypay.ee.tutorial.helloDockerWorld;

import org.springframework.data.repository.CrudRepository;

public interface DockerWorldDataRepository extends CrudRepository<DockerWorldData, Integer> {
}