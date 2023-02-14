package com.arena.core.service;

import com.arena.core.dto.BattleDTO;

public interface BattleService {

    BattleDTO save(BattleDTO battleDTO);

    BattleDTO getById(String id);

    BattleDTO getAll();

    BattleDTO delete(String id);
}
