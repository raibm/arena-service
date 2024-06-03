package com.arena.core.service;

import com.arena.core.dto.BattleThemeDto;

public interface BattleThemeService {

    BattleThemeDto save(BattleThemeDto battleThemeDTO);

    BattleThemeDto getById(String id);

    BattleThemeDto getAll();

    BattleThemeDto delete(String id);
}
