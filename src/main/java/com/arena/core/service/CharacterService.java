package com.arena.core.service;

import com.arena.core.dto.CharacterDto;

public interface CharacterService {

    CharacterDto save(CharacterDto characterDTO);

    CharacterDto getById(String id);

    CharacterDto getAll();

    CharacterDto delete(String id);
}
