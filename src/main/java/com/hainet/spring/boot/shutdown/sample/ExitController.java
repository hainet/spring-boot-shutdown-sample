package com.hainet.spring.boot.shutdown.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExitController {

    private ApplicationContext ctx;

    public ExitController(final ApplicationContext ctx) {
        this.ctx = ctx;
    }

    @PostMapping("/exit")
    public void exit() {
        final int exitCode = SpringApplication.exit(ctx, () -> 0);

        System.exit(exitCode);
    }
}
