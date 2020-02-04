package com.jm.course.apis.libraryapis.publisher;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/v1/publishers")
public class PublisherController {

    private PublisherService publisherService;

    public PublisherController(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    @GetMapping(path = "/{publisherId}")
    public Publisher getPublisher(@PathVariable String publisherId) {
        return new Publisher(publisherId, "Prentice Hall Publishers", "jmalan@tekys.com", "8015551212");
    }

    @PostMapping
    public ResponseEntity<?> addPublisher(@RequestBody Publisher publisher) {
        publisher = publisherService.addPublisher(publisher);
    }
}
