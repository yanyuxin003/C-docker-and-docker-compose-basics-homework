@RestController
public class AliceController {

    @GetMapping("/hello")
    public String sayHello() {
        String requestToBob = "http://bob:8081/hello";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(requestToBob, String.class);
    }
}