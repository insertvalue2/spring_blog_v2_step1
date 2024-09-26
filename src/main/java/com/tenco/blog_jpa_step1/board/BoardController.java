package com.tenco.blog_jpa_step1.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class BoardController {


/**
     * 주소설계 - http://localhost:8080/board/save-form
     * 
     * 이 메서드는 게시글 저장 폼 페이지로 이동하는 기능을 합니다.
     * 
     * 반환되는 문자열은 뷰 리졸버(View Resolver)가 처리하여, 
     * Mustache 템플릿 엔진을 통해 뷰 파일을 렌더링합니다.
     * 
     * - Mustache 템플릿 파일 위치: src/main/resources/templates/board/save-form.mustache
     * - 확장자는 생략 가능하며, 템플릿 엔진에서 자동으로 찾습니다.
     * 
     * @return 게시글 작성 폼 뷰 페이지
     */
    @GetMapping("/board/save-form")
    public String saveForm() {

        log.info("/board/save-form 호출 됨 ");
        return "board/save-form";  // Mustache 템플릿 경로: board/save-form.mustache
    }

}
