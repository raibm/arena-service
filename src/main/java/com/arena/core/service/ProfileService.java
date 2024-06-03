package com.arena.core.service;

import com.arena.core.dto.ProfileDto;

public interface ProfileService {

    ProfileDto save(ProfileDto profileDto);

    ProfileDto getById(String id);

    ProfileDto getAll();

    ProfileDto delete(String id);
}
