package com.arena.core.service;

import com.arena.core.dto.PerfilDTO;

public interface PerfilService {

    PerfilDTO save(PerfilDTO perfilDTO);

    PerfilDTO getById(String id);

    PerfilDTO getAll();

    PerfilDTO delete(String id);
}
