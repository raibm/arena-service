package com.arena.core.service;

import com.arena.core.dto.BattleRuleDto;

public interface BattleRuleService {

    BattleRuleDto save(BattleRuleDto battleRuleDTO);

    BattleRuleDto getById(String id);

    BattleRuleDto getAll();

    BattleRuleDto delete(String id);
}
