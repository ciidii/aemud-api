package com.amud.io.aemudapi.services;

import com.amud.io.aemudapi.DTOs.MemberDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface MemberService {
    ResponseEntity<?> addMember(MemberDto memberDto);
    ResponseEntity<?> removeMember(Long id);
    ResponseEntity<?> updateMember(MemberDto memberDto);
    ResponseEntity<?> getAllMembers();
    ResponseEntity<?> getMemberById(Long id);
}