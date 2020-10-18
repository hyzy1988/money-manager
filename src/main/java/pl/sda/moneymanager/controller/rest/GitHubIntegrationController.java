package pl.sda.moneymanager.controller.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/github-int")
public class GitHubIntegrationController {
    private final RestTemplate restTemplate;
    private static final String myReposUrl = "https://api.github.com/users/hyzy1988/repos";

    public GitHubIntegrationController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/my-repos")
    public String myRepos () {

        return restTemplate.getForObject(myReposUrl, String.class);
    }


}
