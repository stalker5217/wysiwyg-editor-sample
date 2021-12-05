package com.example.editorsample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
public class EditorController {
    @GetMapping("/naver-smart-editor")
    public String getNaverSmartEditor() {
        return "/naverSmartEditor";
    }

    @PostMapping("/naver-smart-editor")
    public String getNaverSamrtEditorResult(@RequestParam String text) {
        log.info(text);
        return "redirect:/naver-smart-editor";
    }

    @GetMapping("/toast-ui-editor")
    public String getToastUIEditor() {
        return "/toastUIEditor";
    }

    @PostMapping("toast-ui-editor")
    public String getToastUIEditorResult(@RequestParam String text) {
        log.info(text);
        return "redirect:/toast-ui-editor";
    }

    @GetMapping("/summernote")
    public String getSummernote() {
        return "/summernote";
    }

    @PostMapping("/summernote")
    public String getSummernoteResult(@RequestParam String text) {
        log.info(text);
        return "redirect:/summernote";
    }
}
