package com.common.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorCode implements BaseErrorCode {

	BAD_REQUEST(400, "E400", "잘못된 요청입니다."),
	UNAUTHORIZED(401, "E401", "인증 정보가 없습니다."),
	FORBIDDEN(403, "E403", "접근 권한이 없습니다."),
	NOT_FOUND(404, "E404", "대상을 찾을 수 없습니다."),
	CONFLICT(409, "E409", "이미 존재하는 데이터입니다."),
	SERVER_ERROR(500, "E500", "서버 내부 오류가 발생했습니다.");

	private final int status;
	private final String code;
	private final String message;
}
