package com.arena.core.service;

import com.arena.core.dto.BadgeDTO;

import java.util.List;

public interface BadgeService {

    BadgeDTO save(BadgeDTO badgeDTO);

    BadgeDTO getById(String id);

    List<BadgeDTO> getAll();

    BadgeDTO delete(String id);
}
