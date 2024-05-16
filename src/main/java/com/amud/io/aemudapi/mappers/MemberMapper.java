package com.amud.io.aemudapi.mappers;

import com.amud.io.aemudapi.DTOs.MemberDto;
import com.amud.io.aemudapi.entities.Member;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MemberMapper {
    public MemberDto toDto(Member member);
    public Member toEntity(MemberDto memberDto);
    public List<MemberDto> toDto(List<Member> members);
    public List<Member> toEntity(List<MemberDto> memberDtos);
}
