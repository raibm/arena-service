package com.arena.service;

import com.arena.dto.BattleRuleDTO;

public interface BattleRuleService {

    BattleRuleDTO save(BattleRuleDTO battleRuleDTO);

    BattleRuleDTO getById(String id);

    BattleRuleDTO getAll();

    BattleRuleDTO delete(String id);
}
