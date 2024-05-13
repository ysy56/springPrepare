package com.example.springprepare.html;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    private static long visitCount = 0;

    // 타임리프 걸린 상태에서 html 경로로 직접 접근
    // ex) http://localhost:8080/static/hello.html

    // 타임리프 걸리지 않은 상태에서 Mapping 경로로 접근
    // ex) Get http://localhost:8080/static-hello
    @GetMapping("/static-hello")
    public String hello() {
        return "hello.html";
    }

    // 타임리프 걸린 상태에서 redirect 사용 -> 다시 html 경로로 직접 접근
    // ex) Get http://localhost:8080/static-hello
    @GetMapping("/html/redirect")
    public String htmlStatic() {
        return "redirect:/hello.html";
    }

    // 정적인 html 접근 : html 이름을 찾아서 접근
    // ex) Get http://localhost:8080/html/templates
    @GetMapping("/html/templates")
    public String htmlTemplates() {
        return "hello";
    }

    // 동적인 html 접근? -> visits(방문자) 증가
    // ex) Get http://localhost:8080/html/dynamic
    @GetMapping("/html/dynamic")
    public String htmlDynamic(Model model) {
        visitCount++;
        model.addAttribute("visits", visitCount);
        return "hello-visit";
    }
}
