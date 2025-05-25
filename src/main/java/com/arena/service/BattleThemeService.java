package com.arena.service;

import com.arena.dto.BattleThemeDTO;

public interface BattleThemeService {

    BattleThemeDTO save(BattleThemeDTO battleThemeDTO);

    BattleThemeDTO getById(String id);

    BattleThemeDTO getAll();

    BattleThemeDTO delete(String id);
}
