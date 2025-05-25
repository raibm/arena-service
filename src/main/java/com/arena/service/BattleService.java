package com.arena.service;

import com.arena.dto.BattleDTO;

public interface BattleService {

    BattleDTO save(BattleDTO battleDTO);

    BattleDTO getById(String id);

    BattleDTO getAll();

    BattleDTO delete(String id);
}
