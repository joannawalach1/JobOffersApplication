package com.juniorjavaready.domain.login;

import lombok.Builder;

@Builder
public record User(int id, String login, String password) {
}
