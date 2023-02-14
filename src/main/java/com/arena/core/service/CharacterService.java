package com.arena.core.service;

import com.arena.core.dto.CharacterDTO;

public interface CharacterService {

    CharacterDTO save(CharacterDTO characterDTO);

    CharacterDTO getById(String id);

    CharacterDTO getAll();

    CharacterDTO delete(String id);
}
