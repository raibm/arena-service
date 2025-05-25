package com.arena.service;

import com.arena.dto.PerfilDTO;

public interface PerfilService {

    PerfilDTO save(PerfilDTO perfilDTO);

    PerfilDTO getById(String id);

    PerfilDTO getAll();

    PerfilDTO delete(String id);
}
