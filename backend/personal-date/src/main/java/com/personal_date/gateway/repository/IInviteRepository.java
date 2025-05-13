package com.team3.personal_date.gateway.repository;

import com.team3.personal_date.core.entity.Invite;
import com.team3.personal_date.gateway.repository.invite.InviteEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IInviteRepository {
    InviteEntity save(Invite invite);

    Optional<InviteEntity> findById(UUID id);

    void update(Invite invite);

    List<InviteEntity> findAllByClientId(UUID clientId);
}
