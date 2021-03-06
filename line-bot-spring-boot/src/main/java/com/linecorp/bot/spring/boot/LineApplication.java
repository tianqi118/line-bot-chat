/*
 * Copyright 2016 LINE Corporation
 *
 * LINE Corporation licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.linecorp.bot.spring.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author wangtianqi20
 */
@SpringBootApplication
public class LineApplication {
    private final Logger log = LoggerFactory.getLogger(LineApplication.class);

    public static Path downloadedContentDir;

    public static void main(String[] args) throws IOException {
        downloadedContentDir = Files.createTempDirectory("line-bot");
        SpringApplication.run(LineApplication.class, args);
    }

//    public static void main(String[] args) {
//        SpringApplication.run(LineApplication.class, args);
//    }
//
//    @EventMapping
//    public Message handleTextMessageEvent(MessageEvent<TextMessageContent> event) {
//        log.info("event: " + event);
//        final String originalMessageText = event.getMessage().getText();
//        return new TextMessage(originalMessageText);
//    }
//
//    @EventMapping
//    public void handleDefaultMessageEvent(Event event) {
//        System.out.println("event: " + event);
//    }
}
