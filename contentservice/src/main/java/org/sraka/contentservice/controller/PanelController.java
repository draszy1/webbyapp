package org.sraka.contentservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Szymon on 14.05.2016.
 */
@RestController
@RequestMapping("/content")
public class PanelController {

    @RequestMapping(value = "/panel", method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:8080")
    public ResponseEntity<String> getPanelContentData() {
       String content = "Srututu peczek drutu.";

        return ResponseEntity.ok(content);
    }
}
