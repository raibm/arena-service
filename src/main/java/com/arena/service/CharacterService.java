package com.arena.service;

import com.arena.dto.CharacterDTO;

public interface CharacterService {

    CharacterDTO save(CharacterDTO characterDTO);

    CharacterDTO getById(String id);

    CharacterDTO getAll();

    CharacterDTO delete(String id);
}
