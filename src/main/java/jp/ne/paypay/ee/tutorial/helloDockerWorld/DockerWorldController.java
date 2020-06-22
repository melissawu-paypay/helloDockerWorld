package jp.ne.paypay.ee.tutorial.helloDockerWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping(path="/demo")
public class DockerWorldController {
    @Autowired
    private DockerWorldDataRepository dockerWorldDataRepository;

    @PostMapping(path = "/add")
    public @ResponseBody
    String addNewData(@RequestParam String value) {
        DockerWorldData myData = new DockerWorldData(new Date(), value);
        dockerWorldDataRepository.save(myData);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<DockerWorldData> getAllUsers() {
        return dockerWorldDataRepository.findAll();
    }

    @GetMapping(path="/test")
    public @ResponseBody String getHelloMessage() {
        return "Hello Docker World!";
    }
}