package com.arena.service;

import com.arena.dto.BadgeDTO;

import java.util.List;

public interface BadgeService {

    BadgeDTO save(BadgeDTO badgeDTO);

    BadgeDTO getById(String id);

    List<BadgeDTO> getAll();

    BadgeDTO delete(String id);
}
