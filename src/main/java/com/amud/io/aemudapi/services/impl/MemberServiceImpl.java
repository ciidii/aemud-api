package com.amud.io.aemudapi.services.impl;

import com.amud.io.aemudapi.DTOs.MemberDto;
import com.amud.io.aemudapi.entities.Member;
import com.amud.io.aemudapi.mappers.MemberMapper;
import com.amud.io.aemudapi.repositories.MemberRepository;
import com.amud.io.aemudapi.services.MemberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;
    private final MemberMapper memberMapper;

    public MemberServiceImpl(MemberRepository memberRepository, MemberMapper memberMapper) {
        this.memberRepository = memberRepository;
        this.memberMapper = memberMapper;
    }

    @Override
    public ResponseEntity<?> addMember(MemberDto memberDto) {
        Member member = memberMapper.toEntity(memberDto);
        memberRepository.save(member);
        return new ResponseEntity<>("Member saved", HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<?> removeMember(Long id) {
        this.memberRepository.deleteById(id);
        return new ResponseEntity<>("Member deleted", HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> updateMember(MemberDto memberDto) {
        this.memberRepository.save(memberMapper.toEntity(memberDto));
        return new ResponseEntity<>("Member updated", HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> getAllMembers() {
        List<Member> members = new ArrayList<>();
        memberRepository.findAll().forEach(members::add);
        return new ResponseEntity<>(members, HttpStatus.OK);
    }


    @Override
    public ResponseEntity<?> getMemberById(Long id) {
        Optional<Member> optionalMember = memberRepository.findById(id);
        if (optionalMember.isPresent()) {
            return ResponseEntity.ok(optionalMember.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Member not found");
        }
    }

}
