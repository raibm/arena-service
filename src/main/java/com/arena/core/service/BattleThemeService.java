package com.arena.core.service;

import com.arena.core.dto.BattleThemeDTO;

public interface BattleThemeService {

    BattleThemeDTO save(BattleThemeDTO battleThemeDTO);

    BattleThemeDTO getById(String id);

    BattleThemeDTO getAll();

    BattleThemeDTO delete(String id);
}
