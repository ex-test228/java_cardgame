package com.example.demo; // あなたのパッケージ名に合わせてください

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // このクラスがRESTful APIのコントローラーであることを示す
public class HelloController {

    @GetMapping("/hello") // HTTP GETリクエストが /hello パスに来たときにこのメソッドが呼ばれる
    public String hello() {
        return "Hello, Spring Boot Demo!"; // この文字列がブラウザに表示される
    }
}
