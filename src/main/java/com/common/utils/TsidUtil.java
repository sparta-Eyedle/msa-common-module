package com.common.utils;

import com.github.f4b6a3.tsid.TsidFactory;

public class TsidUtil {

	private static TsidFactory factory = TsidFactory.builder().withNode(0).build();

	public static void setNodeId(int nodeId) {
		if (nodeId < 0 || nodeId > 1023) {
			throw new IllegalArgumentException("Node ID must be between 0 and 1023");
		}
		factory = TsidFactory.builder()
			.withNode(nodeId)
			.build();
	}

	public static Long nextId() {

		if (factory == null) {
			throw new IllegalStateException("TsidFactory가 초기화되지 않았습니다. Node Id를 확인해주세요.");
		}

		return factory.create().toLong();
	}
}
