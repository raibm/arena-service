package com.arena.core.service;

import com.arena.core.dto.BadgeDto;

import java.util.List;

public interface BadgeService {

    BadgeDto save(BadgeDto badgeDTO);

    BadgeDto getById(String id);

    List<BadgeDto> getAll();

    BadgeDto delete(String id);
}
