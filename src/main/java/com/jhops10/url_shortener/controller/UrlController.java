package com.jhops10.url_shortener.controller;

import com.jhops10.url_shortener.controller.dto.ShortenUrlRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlController {

    @PostMapping
    public ResponseEntity<Void> shortenUrl(@RequestBody ShortenUrlRequest shortenUrlRequest) {
        return ResponseEntity.ok().build();
    }
}
