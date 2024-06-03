package com.arena.core.service;

import com.arena.core.dto.BattleDto;

public interface BattleService {

    BattleDto save(BattleDto battleDTO);

    BattleDto getById(String id);

    BattleDto getAll();

    BattleDto delete(String id);
}
