package com.amud.io.aemudapi.controllers;

import com.amud.io.aemudapi.DTOs.MemberDto;
import com.amud.io.aemudapi.services.MemberService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping(path = "members")
public class MemberController {
    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping
    ResponseEntity<?> addMember(@RequestBody MemberDto memberDto) {
        return this.memberService.addMember(memberDto);
    }

    @GetMapping(path = "all")
    ResponseEntity<?> getMembers() {
        return this.memberService.getAllMembers();
    }

    @GetMapping
    ResponseEntity<?> getMember(@RequestParam("userId") Long userId) {
        return this.memberService.getMemberById(userId);
    }


    @PutMapping
    ResponseEntity<?> updateMember(@RequestBody MemberDto memberDto) {
        return this.memberService.updateMember(memberDto);
    }

    @DeleteMapping
    ResponseEntity<?> removeMember(@RequestParam Long userId) {
        return this.memberService.removeMember(userId);
    }
}

