package com.arena.core.service;

import com.arena.core.dto.BattleRuleDTO;

public interface BattleRuleService {

    BattleRuleDTO save(BattleRuleDTO battleRuleDTO);

    BattleRuleDTO getById(String id);

    BattleRuleDTO getAll();

    BattleRuleDTO delete(String id);
}
