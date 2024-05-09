package edu.iastate.cssm.springtokenviewer.controller;

import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/token")
    String showToken(@RegisteredOAuth2AuthorizedClient("okta") OAuth2AuthorizedClient client) {
        return "export TOKEN='" + client.getAccessToken().getTokenValue() + "'";
    }
}
